package util;

import com.google.android.gms.ads.a.a;
import com.google.android.gms.ads.n;
import java.util.Date;

class a extends a.C0069a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AppOpenManager f15647a;

    a(AppOpenManager appOpenManager) {
        this.f15647a = appOpenManager;
    }

    public void a(com.google.android.gms.ads.a.a aVar) {
        AppOpenManager appOpenManager = this.f15647a;
        appOpenManager.f15639b = aVar;
        appOpenManager.f15642e = new Date().getTime();
    }

    public void a(n nVar) {
        System.out.println(nVar.a());
    }
}
