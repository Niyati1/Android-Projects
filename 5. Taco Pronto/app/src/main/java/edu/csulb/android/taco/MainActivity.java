package edu.csulb.android.taco;

import android.app.Activity;
import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends Activity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    HashMap<String, String> ItemList = new HashMap<String,String>();
    HashMap<String, Double> price = new HashMap<String,Double>();
    Double totalprice=0.0;
    RadioButton size1,size2,tortilla1,tortilla2;
    CheckBox fill1,fill2,fill3,fill4,fill5,fill6,fill7,fill8,fill9,fill10,fill11,fill12,bev1,bev2,bev3,bev4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        size1 = (RadioButton) findViewById(R.id.radio1);
        size2 = (RadioButton) findViewById(R.id.radio2);
        tortilla1 = (RadioButton) findViewById(R.id.radio3);
        tortilla2 = (RadioButton) findViewById(R.id.radio4);
        fill1 = (CheckBox) findViewById(R.id.checkBox1);
        fill2 = (CheckBox) findViewById(R.id.checkBox2);
        fill3 = (CheckBox) findViewById(R.id.checkBox3);
        fill4 = (CheckBox) findViewById(R.id.checkBox4);
        fill5 = (CheckBox) findViewById(R.id.checkBox5);
        fill6 = (CheckBox) findViewById(R.id.checkBox6);
        fill7 = (CheckBox) findViewById(R.id.checkBox7);
        fill8 = (CheckBox) findViewById(R.id.checkBox8);
        fill9 = (CheckBox) findViewById(R.id.checkBox9);
        fill10 = (CheckBox) findViewById(R.id.checkBox10);
        fill11 = (CheckBox) findViewById(R.id.checkBox11);
        fill12 = (CheckBox) findViewById(R.id.checkBox12);
        bev1 = (CheckBox) findViewById(R.id.bev1);
        bev2 = (CheckBox) findViewById(R.id.bev2);
        bev3 = (CheckBox) findViewById(R.id.bev3);
        bev4 = (CheckBox) findViewById(R.id.bev4);
        price.put((String) fill1.getText(),0.6);price.put((String) fill2.getText(),1.30);price.put((String) fill3.getText(),1.50);price.put((String) fill4.getText(),0.45);
        price.put((String) fill5.getText(),1.30);price.put((String) fill6.getText(),1.00);price.put((String) fill7.getText(),0.30);price.put((String) fill8.getText(),0.50);
        price.put((String) fill9.getText(),0.30);price.put((String) fill10.getText(),0.30);price.put((String) fill11.getText(),0.30);price.put((String) fill4.getText(),0.25);
        price.put((String) bev1.getText(),1.5);price.put((String) bev2.getText(),8.5);price.put((String) bev3.getText(),4.1);price.put((String) bev4.getText(),15.0);
        price.put((String) size1.getText(),3.99);price.put((String) size2.getText(),2.5);price.put((String) tortilla1.getText(),1.5);price.put((String) tortilla2.getText(),1.8);
        fill1.setOnCheckedChangeListener(this);
        fill2.setOnCheckedChangeListener(this);
        fill3.setOnCheckedChangeListener(this);
        fill4.setOnCheckedChangeListener(this);
        fill5.setOnCheckedChangeListener(this);
        fill6.setOnCheckedChangeListener(this);
        fill7.setOnCheckedChangeListener(this);
        fill8.setOnCheckedChangeListener(this);
        fill9.setOnCheckedChangeListener(this);
        fill10.setOnCheckedChangeListener(this);
        fill11.setOnCheckedChangeListener(this);
        fill12.setOnCheckedChangeListener(this);
        bev1.setOnCheckedChangeListener(this);
        bev2.setOnCheckedChangeListener(this);
        bev3.setOnCheckedChangeListener(this);
        bev4.setOnCheckedChangeListener(this);
        size1.setOnCheckedChangeListener(this);
        size2.setOnCheckedChangeListener(this);
        tortilla1.setOnCheckedChangeListener(this);
        tortilla2.setOnCheckedChangeListener(this);
    }
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
    {
        if(buttonView.isChecked()) {
            if (!ItemList.containsKey(buttonView.getText())) {
                ItemList.put((String) buttonView.getText(), "$"+price.get(buttonView.getText()));
                totalprice=totalprice+price.get(buttonView.getText());
                Toast.makeText(getApplicationContext(), buttonView.getText()+" added to order. Total price is $"+totalprice,
                        Toast.LENGTH_LONG).show();

            }
        }
        else
        {
            if (ItemList.containsKey(buttonView.getText())) {

                ItemList.remove(buttonView.getText());
                totalprice=totalprice-price.get(buttonView.getText());
                Toast.makeText(getApplicationContext(), buttonView.getText()+" removed from order. Total price is $"+totalprice,
                        Toast.LENGTH_LONG).show();

            }
        }}
public void onClick(View view) {
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage("3613893664",null,"Hello, "+"\n We have recived your taco order. Please find the below details of the order" + " \n"+  ItemList + " \n Total Price is : $" + totalprice,null,null);
        Toast.makeText(getApplicationContext(), "Order placed successfully!!",
                Toast.LENGTH_LONG).show();
    }

}
