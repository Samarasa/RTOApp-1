package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.k;

class FragmentStateAdapter$5 implements f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Handler f1671a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Runnable f1672b;

    public void a(k kVar, g.a aVar) {
        if (aVar == g.a.ON_DESTROY) {
            this.f1671a.removeCallbacks(this.f1672b);
            kVar.getLifecycle().b(this);
        }
    }
}
