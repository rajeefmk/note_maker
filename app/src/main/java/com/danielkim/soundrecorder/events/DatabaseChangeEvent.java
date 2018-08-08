package com.danielkim.soundrecorder.events;

/**
 * Created by Rajeef on 8/8/18
 */
public class DatabaseChangeEvent {

    public static final int NEW_DB_ENTRY = 1;
    public static final int DB_ENTRY_RENAMED = 2;

    private int code;
    public DatabaseChangeEvent(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
