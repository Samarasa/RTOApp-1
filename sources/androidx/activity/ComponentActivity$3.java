package androidx.activity;

import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.k;

class ComponentActivity$3 implements f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f87a;

    ComponentActivity$3(c cVar) {
        this.f87a = cVar;
    }

    public void a(k kVar, g.a aVar) {
        if (aVar == g.a.ON_DESTROY && !this.f87a.isChangingConfigurations()) {
            this.f87a.getViewModelStore().a();
        }
    }
}
