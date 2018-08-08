package com.danielkim.soundrecorder;

import org.greenrobot.eventbus.EventBus;

public class BusProvider {
    private static final EventBus BUS = EventBus.getDefault();

    private BusProvider() {
    }

    public static EventBus getInstance() {
        return BUS;
    }
}
