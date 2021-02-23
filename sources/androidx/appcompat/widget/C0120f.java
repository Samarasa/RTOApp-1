package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.f  reason: case insensitive filesystem */
class C0120f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ActionBarOverlayLayout f627a;

    C0120f(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f627a = actionBarOverlayLayout;
    }

    public void run() {
        this.f627a.h();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f627a;
        actionBarOverlayLayout.x = actionBarOverlayLayout.f405e.animate().translationY((float) (-this.f627a.f405e.getHeight())).setListener(this.f627a.y);
    }
}
