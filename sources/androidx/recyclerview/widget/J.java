package androidx.recyclerview.widget;

class J implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ StaggeredGridLayoutManager f1278a;

    J(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f1278a = staggeredGridLayoutManager;
    }

    public void run() {
        this.f1278a.F();
    }
}
