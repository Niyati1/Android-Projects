package nostallin.com.nostallinbeta.ui.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import nostallin.com.nostallinbeta.R;

public class SplashActivity extends Activity {

    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
