package androidx.fragment.app;

import android.view.View;

/* renamed from: androidx.fragment.app.g  reason: case insensitive filesystem */
class C0157g extends C0160j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0158h f1106a;

    C0157g(C0158h hVar) {
        this.f1106a = hVar;
    }

    public View a(int i) {
        View view = this.f1106a.G;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + this + " does not have a view");
    }

    public boolean a() {
        return this.f1106a.G != null;
    }
}
