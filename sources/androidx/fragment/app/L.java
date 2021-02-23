package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

class L extends Transition.EpicenterCallback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Rect f1081a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ M f1082b;

    L(M m, Rect rect) {
        this.f1082b = m;
        this.f1081a = rect;
    }

    public Rect onGetEpicenter(Transition transition) {
        Rect rect = this.f1081a;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return this.f1081a;
    }
}
