package androidx.viewpager.widget;

class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ViewPager f1666a;

    d(ViewPager viewPager) {
        this.f1666a = viewPager;
    }

    public void run() {
        this.f1666a.setScrollState(0);
        this.f1666a.h();
    }
}
