package androidx.work.impl.workers;

import c.b.c.a.a.a;

class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f2030a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ConstraintTrackingWorker f2031b;

    b(ConstraintTrackingWorker constraintTrackingWorker, a aVar) {
        this.f2031b = constraintTrackingWorker;
        this.f2030a = aVar;
    }

    public void run() {
        synchronized (this.f2031b.f2027g) {
            if (this.f2031b.f2028h) {
                this.f2031b.c();
            } else {
                this.f2031b.i.b(this.f2030a);
            }
        }
    }
}
