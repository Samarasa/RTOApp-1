package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.k;

class Fragment$1 implements f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0158h f1051a;

    Fragment$1(C0158h hVar) {
        this.f1051a = hVar;
    }

    public void a(k kVar, g.a aVar) {
        View view;
        if (aVar == g.a.ON_STOP && (view = this.f1051a.G) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
