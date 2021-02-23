package androidx.room;

class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Runnable f1620a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ y f1621b;

    x(y yVar, Runnable runnable) {
        this.f1621b = yVar;
        this.f1620a = runnable;
    }

    public void run() {
        try {
            this.f1620a.run();
        } finally {
            this.f1621b.a();
        }
    }
}
