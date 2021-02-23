package util;

import androidx.lifecycle.C0174e;
import androidx.lifecycle.g;
import androidx.lifecycle.k;
import androidx.lifecycle.r;

public class AppOpenManager_LifecycleAdapter implements C0174e {

    /* renamed from: a  reason: collision with root package name */
    final AppOpenManager f15645a;

    AppOpenManager_LifecycleAdapter(AppOpenManager appOpenManager) {
        this.f15645a = appOpenManager;
    }

    public void a(k kVar, g.a aVar, boolean z, r rVar) {
        boolean z2 = rVar != null;
        if (z || aVar != g.a.ON_START) {
            return;
        }
        if (!z2 || rVar.a("onStart", 1)) {
            this.f15645a.onStart();
        }
    }
}
