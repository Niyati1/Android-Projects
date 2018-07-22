package edu.csulb.android.arttherapy;

import android.app.IntentService;
import android.content.Intent;
import android.media.MediaPlayer;

public class Eraser extends IntentService {
    private boolean flag = false;
    public Eraser() {
        super("Hello");
    }

    protected void onHandleIntent(Intent intent) {

        MediaPlayer mp = MediaPlayer.create(Eraser.this, R.raw.eraser);
        mp.start();
        while(mp.isPlaying())
        {
            System.out.println();
        }
        mp.reset();
        mp.release();

    }

}


