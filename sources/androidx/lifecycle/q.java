package androidx.lifecycle;

class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveData f1244a;

    q(LiveData liveData) {
        this.f1244a = liveData;
    }

    public void run() {
        Object obj;
        synchronized (this.f1244a.f1198b) {
            obj = this.f1244a.f1202f;
            this.f1244a.f1202f = LiveData.f1197a;
        }
        this.f1244a.b(obj);
    }
}
