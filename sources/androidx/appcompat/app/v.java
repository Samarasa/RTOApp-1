package androidx.appcompat.app;

import androidx.appcompat.widget.ContentFrameLayout;

class v implements ContentFrameLayout.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z f240a;

    v(z zVar) {
        this.f240a = zVar;
    }

    public void a() {
    }

    public void onDetachedFromWindow() {
        this.f240a.m();
    }
}
