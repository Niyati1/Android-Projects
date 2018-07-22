package edu.csulb.android.photonotes;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Bundle bundle = getIntent().getExtras();
        String label=bundle.getString("label");
        TextView t = (TextView)findViewById(R.id.textView);
        t.setText(label);
        DatabaseHandler db= new DatabaseHandler(getApplicationContext());
        String m = db.getPath(label);
        ImageView i;
        i = (ImageView)findViewById(R.id.imageView3);
        Bitmap b = BitmapFactory.decodeFile(m);
        i.setImageBitmap(b);
    }
}
