package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

class I extends Transition.EpicenterCallback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Rect f1069a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ M f1070b;

    I(M m, Rect rect) {
        this.f1070b = m;
        this.f1069a = rect;
    }

    public Rect onGetEpicenter(Transition transition) {
        return this.f1069a;
    }
}
