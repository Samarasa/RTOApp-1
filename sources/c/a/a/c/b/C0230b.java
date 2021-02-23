package c.a.a.c.b;

import android.os.Process;

/* renamed from: c.a.a.c.b.b  reason: case insensitive filesystem */
class C0230b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0231c f3073a;

    C0230b(C0231c cVar) {
        this.f3073a = cVar;
    }

    public void run() {
        Process.setThreadPriority(10);
        this.f3073a.a();
    }
}
