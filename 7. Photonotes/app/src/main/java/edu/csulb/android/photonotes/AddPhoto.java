package edu.csulb.android.photonotes;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddPhoto extends AppCompatActivity {
    private static final int RESULT_CODE = 0;
    String mCurrentPhotoPath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_photo);
        FloatingActionButton camera;
        final EditText text;
        Button save;
        save= (Button)findViewById(R.id.button3);
        text = (EditText)findViewById(R.id.editText);
        camera = (FloatingActionButton)findViewById(R.id.floatingActionButton);
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                File photo=null;
                try {
                    photo = createImageFile();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                if (photo != null) {
                    intent.putExtra(MediaStore.EXTRA_OUTPUT,Uri.fromFile(photo));
                    startActivityForResult(intent, RESULT_CODE);
                }
            }
        });
        text.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                    text.setHint("Enter Caption");
                else
                    text.setHint("");

            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String label= text.getText().toString();
                if(label.trim().length()>0){
                DatabaseHandler db = new DatabaseHandler(getApplicationContext());
                Intent i =new Intent();
                String s="Path";
                db.insertLabel(label,mCurrentPhotoPath);
                text.setText("");
                Intent in = new Intent(getApplicationContext(),MainActivity.class );
                startActivity(in);
                finish();
            }
            else {
                    if(label.trim().length()==0)
                    Toast.makeText(getApplicationContext(), "Caption cannot be blank..!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private File createImageFile() throws IOException {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String imageFileName = "JPEG_" + timeStamp + "_";
        File storageDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        File image = File.createTempFile(
                imageFileName, /* prefix */
                ".jpg", /* suffix */
                storageDir /* directory */
                );
        mCurrentPhotoPath = image.getPath();
        return image;

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String path = mCurrentPhotoPath;
        ImageView i = (ImageView) findViewById(R.id.imageView2);
        Bitmap b = BitmapFactory.decodeFile(path);
        i.setImageBitmap(b);
    }
}
