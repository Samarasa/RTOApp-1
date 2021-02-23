package com.google.android.datatransport.runtime.scheduling.jobscheduling;

final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static final b f5286a = new b();

    private b() {
    }

    public static Runnable a() {
        return f5286a;
    }

    public void run() {
        AlarmManagerSchedulerBroadcastReceiver.a();
    }
}
