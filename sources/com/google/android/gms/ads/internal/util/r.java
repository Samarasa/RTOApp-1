package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.Ara;
import com.google.android.gms.internal.ads.C0730Gi;
import com.google.android.gms.internal.ads.C0758Hk;
import com.google.android.gms.internal.ads.C1072Tm;
import com.google.android.gms.internal.ads.C1339b;
import com.google.android.gms.internal.ads.C1439cb;
import com.google.android.gms.internal.ads.C1738gj;
import com.google.android.gms.internal.ads.C2159mh;
import com.google.android.gms.internal.ads.C2576sd;
import com.google.android.gms.internal.ads.F;
import com.google.android.gms.internal.ads.Qqa;
import java.io.File;
import java.util.regex.Pattern;

public final class r extends C0730Gi {

    /* renamed from: e  reason: collision with root package name */
    private final Context f5645e;

    private r(Context context, C2159mh mhVar) {
        super(mhVar);
        this.f5645e = context;
    }

    public static C1439cb a(Context context) {
        C1439cb cbVar = new C1439cb(new C1738gj(new File(context.getCacheDir(), "admob_volley"), 20971520), new r(context, new C1072Tm()));
        cbVar.a();
        return cbVar;
    }

    public final Ara a(C1339b<?> bVar) {
        if (bVar.q() && bVar.c() == 0) {
            if (Pattern.matches((String) Qqa.e().a(F.Sc), bVar.d())) {
                Qqa.a();
                if (C0758Hk.c(this.f5645e, 13400000)) {
                    Ara a2 = new C2576sd(this.f5645e).a(bVar);
                    if (a2 != null) {
                        String valueOf = String.valueOf(bVar.d());
                        fa.f(valueOf.length() != 0 ? "Got gmscore asset response: ".concat(valueOf) : new String("Got gmscore asset response: "));
                        return a2;
                    }
                    String valueOf2 = String.valueOf(bVar.d());
                    fa.f(valueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(valueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.a(bVar);
    }
}
