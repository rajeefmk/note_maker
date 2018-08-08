package com.danielkim.soundrecorder;

import android.app.Application;

/**
 * Created by Rajeef on 8/8/18
 */
public class SoundRecorderApp extends Application {

    private static SoundRecorderApp sSoundRecorderApp;
    private DBHelper dbHelper;

    public static SoundRecorderApp get() {
        if(sSoundRecorderApp == null) {
            System.exit(0);
        }
     return sSoundRecorderApp;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sSoundRecorderApp = this;
        setupLocalDb();
    }

    private void setupLocalDb() {
        dbHelper = new DBHelper(this);
    }

    public DBHelper getDbHelper() {
        return dbHelper;
    }

}
