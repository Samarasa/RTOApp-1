package com.google.android.datatransport.runtime.scheduling.jobscheduling;

final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final r f5335a;

    private p(r rVar) {
        this.f5335a = rVar;
    }

    public static Runnable a(r rVar) {
        return new p(rVar);
    }

    public void run() {
        this.f5335a.f5340d.a(q.a(this.f5335a));
    }
}
