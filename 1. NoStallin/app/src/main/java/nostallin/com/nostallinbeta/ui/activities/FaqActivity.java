package nostallin.com.nostallinbeta.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import nostallin.com.nostallinbeta.R;

public class FaqActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqactivity);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
