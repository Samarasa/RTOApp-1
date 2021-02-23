package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.k;

class ComponentActivity$2 implements f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f86a;

    ComponentActivity$2(c cVar) {
        this.f86a = cVar;
    }

    public void a(k kVar, g.a aVar) {
        if (aVar == g.a.ON_STOP) {
            Window window = this.f86a.getWindow();
            View peekDecorView = window != null ? window.peekDecorView() : null;
            if (peekDecorView != null) {
                peekDecorView.cancelPendingInputEvents();
            }
        }
    }
}
