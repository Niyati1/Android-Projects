package edu.csulb.android.photonotes;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       FloatingActionButton add;
        add = (FloatingActionButton) findViewById(R.id.button1);
        loadvalues();
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),AddPhoto.class);
                startActivity(intent1);
                loadvalues();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_red:
                Uri packageURI = Uri.parse("package:edu.csulb.android.photonotes");
                Intent i = new Intent(Intent.ACTION_DELETE,packageURI);
                startActivity(i);
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void loadvalues() {
        ListView list1;
        list1 = (ListView)findViewById(R.id.labellist);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView clicked = (TextView) view;
                String s = clicked.getText().toString();
                Intent i = new Intent(getApplicationContext(),Display.class);
                i.putExtra("label",s);
                startActivity(i);
            }
        });
        DatabaseHandler db= new DatabaseHandler(getApplicationContext());
        List<String> labels = db.getAllLabels();
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,labels);
        list1.setAdapter(dataAdapter);    }
}
