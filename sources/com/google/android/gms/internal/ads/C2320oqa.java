package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.i.a;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.ads.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.oqa  reason: case insensitive filesystem */
public final class C2320oqa {

    /* renamed from: a  reason: collision with root package name */
    public static final C2320oqa f11645a = new C2320oqa();

    protected C2320oqa() {
    }

    static final /* synthetic */ int a(String str, String str2) {
        return t.f5718a.indexOf(str) - t.f5718a.indexOf(str2);
    }

    public static C2249nqa a(Context context, asa asa) {
        List list;
        Context context2;
        String str;
        asa asa2 = asa;
        Date a2 = asa.a();
        long time = a2 != null ? a2.getTime() : -1;
        String b2 = asa.b();
        int d2 = asa.d();
        Set<String> e2 = asa.e();
        if (!e2.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(e2));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean a3 = asa2.a(context2);
        Location f2 = asa.f();
        Bundle a4 = asa2.a((Class<? extends j>) AdMobAdapter.class);
        if (asa.r() == null) {
            boolean g2 = asa.g();
            String i = asa.i();
            a m = asa.m();
            if (m == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    String packageName = applicationContext.getPackageName();
                    Qqa.a();
                    str = C0758Hk.a(Thread.currentThread().getStackTrace(), packageName);
                } else {
                    str = null;
                }
                boolean j = asa.j();
                t b3 = dsa.d().b();
                return new C2249nqa(8, time, a4, d2, list, a3, Math.max(asa.p(), b3.b()), g2, i, (C1693g) null, f2, b2, asa.o(), asa.c(), Collections.unmodifiableList(new ArrayList(asa.q())), asa.l(), str, j, (C1682fqa) null, Math.max(asa.s(), b3.c()), (String) Collections.max(Arrays.asList(new String[]{asa.h(), b3.a()}), C2532rqa.f12048a), asa.k(), asa.t());
            }
            new C1693g(m);
            throw null;
        }
        Qqa.i();
        asa.r().a();
        throw null;
    }
}
