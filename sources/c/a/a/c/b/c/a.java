package c.a.a.c.b.c;

import android.os.Process;
import android.os.StrictMode;
import c.a.a.c.b.c.b;

class a extends Thread {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b.a f3115a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    a(b.a aVar, Runnable runnable, String str) {
        super(runnable, str);
        this.f3115a = aVar;
    }

    public void run() {
        Process.setThreadPriority(9);
        if (this.f3115a.f3124c) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            super.run();
        } catch (Throwable th) {
            this.f3115a.f3123b.a(th);
        }
    }
}
