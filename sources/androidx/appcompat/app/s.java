package androidx.appcompat.app;

class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z f237a;

    s(z zVar) {
        this.f237a = zVar;
    }

    public void run() {
        z zVar = this.f237a;
        if ((zVar.X & 1) != 0) {
            zVar.f(0);
        }
        z zVar2 = this.f237a;
        if ((zVar2.X & 4096) != 0) {
            zVar2.f(108);
        }
        z zVar3 = this.f237a;
        zVar3.W = false;
        zVar3.X = 0;
    }
}
