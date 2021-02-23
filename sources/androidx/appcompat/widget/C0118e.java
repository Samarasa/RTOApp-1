package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.e  reason: case insensitive filesystem */
class C0118e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ActionBarOverlayLayout f625a;

    C0118e(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f625a = actionBarOverlayLayout;
    }

    public void run() {
        this.f625a.h();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f625a;
        actionBarOverlayLayout.x = actionBarOverlayLayout.f405e.animate().translationY(0.0f).setListener(this.f625a.y);
    }
}
