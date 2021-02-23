package androidx.savedstate;

import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.k;

class SavedStateRegistry$1 implements f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f1626a;

    SavedStateRegistry$1(a aVar) {
        this.f1626a = aVar;
    }

    public void a(k kVar, g.a aVar) {
        a aVar2;
        boolean z;
        if (aVar == g.a.ON_START) {
            aVar2 = this.f1626a;
            z = true;
        } else if (aVar == g.a.ON_STOP) {
            aVar2 = this.f1626a;
            z = false;
        } else {
            return;
        }
        aVar2.f1630d = z;
    }
}
