package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import b.e.i;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Lz  reason: case insensitive filesystem */
public final class C0877Lz {

    /* renamed from: a  reason: collision with root package name */
    private int f7784a;

    /* renamed from: b  reason: collision with root package name */
    private Sra f7785b;

    /* renamed from: c  reason: collision with root package name */
    private C1580eb f7786c;

    /* renamed from: d  reason: collision with root package name */
    private View f7787d;

    /* renamed from: e  reason: collision with root package name */
    private List<?> f7788e;

    /* renamed from: f  reason: collision with root package name */
    private List<ksa> f7789f = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    private ksa f7790g;

    /* renamed from: h  reason: collision with root package name */
    private Bundle f7791h;
    private C2313on i;
    private C2313on j;
    private a k;
    private View l;
    private a m;
    private double n;
    private C2076lb o;
    private C2076lb p;
    private String q;
    private i<String, C1190Ya> r = new i<>();
    private i<String, String> s = new i<>();
    private float t;
    private String u;

    private static C0799Iz a(Sra sra, C1195Yf yf) {
        if (sra == null) {
            return null;
        }
        return new C0799Iz(sra, yf);
    }

    public static C0877Lz a(C1013Rf rf) {
        try {
            C0799Iz a2 = a(rf.getVideoController(), (C1195Yf) null);
            C1580eb x = rf.x();
            String r2 = rf.r();
            List<?> y = rf.y();
            String v = rf.v();
            Bundle extras = rf.getExtras();
            String s2 = rf.s();
            a w = rf.w();
            String S = rf.S();
            String E = rf.E();
            double G = rf.G();
            C2076lb U = rf.U();
            C0877Lz lz = new C0877Lz();
            lz.f7784a = 2;
            lz.f7785b = a2;
            lz.f7786c = x;
            lz.f7787d = (View) b(rf.ba());
            lz.a("headline", r2);
            lz.f7788e = y;
            lz.a("body", v);
            lz.f7791h = extras;
            lz.a("call_to_action", s2);
            lz.l = (View) b(rf.Z());
            lz.m = w;
            lz.a("store", S);
            lz.a("price", E);
            lz.n = G;
            lz.o = U;
            return lz;
        } catch (RemoteException e2) {
            C1018Rk.c("Failed to get native ad from app install ad mapper", e2);
            return null;
        }
    }

    public static C0877Lz a(C1039Sf sf) {
        try {
            C0799Iz a2 = a(sf.getVideoController(), (C1195Yf) null);
            C1580eb x = sf.x();
            String r2 = sf.r();
            List<?> y = sf.y();
            String v = sf.v();
            Bundle extras = sf.getExtras();
            String s2 = sf.s();
            a w = sf.w();
            String R = sf.R();
            C2076lb ra = sf.ra();
            C0877Lz lz = new C0877Lz();
            lz.f7784a = 1;
            lz.f7785b = a2;
            lz.f7786c = x;
            lz.f7787d = (View) b(sf.ba());
            lz.a("headline", r2);
            lz.f7788e = y;
            lz.a("body", v);
            lz.f7791h = extras;
            lz.a("call_to_action", s2);
            lz.l = (View) b(sf.Z());
            lz.m = w;
            lz.a("advertiser", R);
            lz.p = ra;
            return lz;
        } catch (RemoteException e2) {
            C1018Rk.c("Failed to get native ad from content ad mapper", e2);
            return null;
        }
    }

    private static C0877Lz a(Sra sra, C1580eb ebVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, a aVar, String str4, String str5, double d2, C2076lb lbVar, String str6, float f2) {
        C0877Lz lz = new C0877Lz();
        lz.f7784a = 6;
        lz.f7785b = sra;
        lz.f7786c = ebVar;
        lz.f7787d = view;
        String str7 = str;
        lz.a("headline", str);
        lz.f7788e = list;
        String str8 = str2;
        lz.a("body", str2);
        lz.f7791h = bundle;
        String str9 = str3;
        lz.a("call_to_action", str3);
        lz.l = view2;
        lz.m = aVar;
        String str10 = str4;
        lz.a("store", str4);
        String str11 = str5;
        lz.a("price", str5);
        lz.n = d2;
        lz.o = lbVar;
        lz.a("advertiser", str6);
        lz.a(f2);
        return lz;
    }

    public static C0877Lz a(C1195Yf yf) {
        try {
            return a(a(yf.getVideoController(), yf), yf.x(), (View) b(yf.ba()), yf.r(), yf.y(), yf.v(), yf.getExtras(), yf.s(), (View) b(yf.Z()), yf.w(), yf.S(), yf.E(), yf.G(), yf.U(), yf.R(), yf.Ea());
        } catch (RemoteException e2) {
            C1018Rk.c("Failed to get native ad assets from unified ad mapper", e2);
            return null;
        }
    }

    private final synchronized void a(float f2) {
        this.t = f2;
    }

    public static C0877Lz b(C1013Rf rf) {
        try {
            return a(a(rf.getVideoController(), (C1195Yf) null), rf.x(), (View) b(rf.ba()), rf.r(), rf.y(), rf.v(), rf.getExtras(), rf.s(), (View) b(rf.Z()), rf.w(), rf.S(), rf.E(), rf.G(), rf.U(), (String) null, 0.0f);
        } catch (RemoteException e2) {
            C1018Rk.c("Failed to get native ad assets from app install ad mapper", e2);
            return null;
        }
    }

    public static C0877Lz b(C1039Sf sf) {
        try {
            return a(a(sf.getVideoController(), (C1195Yf) null), sf.x(), (View) b(sf.ba()), sf.r(), sf.y(), sf.v(), sf.getExtras(), sf.s(), (View) b(sf.Z()), sf.w(), (String) null, (String) null, -1.0d, sf.ra(), sf.R(), 0.0f);
        } catch (RemoteException e2) {
            C1018Rk.c("Failed to get native ad assets from content ad mapper", e2);
            return null;
        }
    }

    private static <T> T b(a aVar) {
        if (aVar == null) {
            return null;
        }
        return b.Q(aVar);
    }

    private final synchronized String c(String str) {
        return this.s.get(str);
    }

    public final synchronized C1580eb A() {
        return this.f7786c;
    }

    public final synchronized a B() {
        return this.m;
    }

    public final synchronized C2076lb C() {
        return this.p;
    }

    public final synchronized void a() {
        if (this.i != null) {
            this.i.destroy();
            this.i = null;
        }
        if (this.j != null) {
            this.j.destroy();
            this.j = null;
        }
        this.k = null;
        this.r.clear();
        this.s.clear();
        this.f7785b = null;
        this.f7786c = null;
        this.f7787d = null;
        this.f7788e = null;
        this.f7791h = null;
        this.l = null;
        this.m = null;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public final synchronized void a(double d2) {
        this.n = d2;
    }

    public final synchronized void a(int i2) {
        this.f7784a = i2;
    }

    public final synchronized void a(View view) {
        this.l = view;
    }

    public final synchronized void a(a aVar) {
        this.k = aVar;
    }

    public final synchronized void a(Sra sra) {
        this.f7785b = sra;
    }

    public final synchronized void a(C1580eb ebVar) {
        this.f7786c = ebVar;
    }

    public final synchronized void a(ksa ksa) {
        this.f7790g = ksa;
    }

    public final synchronized void a(C2076lb lbVar) {
        this.o = lbVar;
    }

    public final synchronized void a(C2313on onVar) {
        this.i = onVar;
    }

    public final synchronized void a(String str) {
        this.q = str;
    }

    public final synchronized void a(String str, C1190Ya ya) {
        if (ya == null) {
            this.r.remove(str);
        } else {
            this.r.put(str, ya);
        }
    }

    public final synchronized void a(String str, String str2) {
        if (str2 == null) {
            this.s.remove(str);
        } else {
            this.s.put(str, str2);
        }
    }

    public final synchronized void a(List<C1190Ya> list) {
        this.f7788e = list;
    }

    public final synchronized String b() {
        return c("advertiser");
    }

    public final synchronized void b(C2076lb lbVar) {
        this.p = lbVar;
    }

    public final synchronized void b(C2313on onVar) {
        this.j = onVar;
    }

    public final synchronized void b(String str) {
        this.u = str;
    }

    public final synchronized void b(List<ksa> list) {
        this.f7789f = list;
    }

    public final synchronized String c() {
        return c("body");
    }

    public final synchronized String d() {
        return c("call_to_action");
    }

    public final synchronized String e() {
        return this.q;
    }

    public final synchronized Bundle f() {
        if (this.f7791h == null) {
            this.f7791h = new Bundle();
        }
        return this.f7791h;
    }

    public final synchronized String g() {
        return c("headline");
    }

    public final synchronized List<?> h() {
        return this.f7788e;
    }

    public final synchronized float i() {
        return this.t;
    }

    public final synchronized List<ksa> j() {
        return this.f7789f;
    }

    public final synchronized String k() {
        return c("price");
    }

    public final synchronized double l() {
        return this.n;
    }

    public final synchronized String m() {
        return c("store");
    }

    public final synchronized Sra n() {
        return this.f7785b;
    }

    public final synchronized int o() {
        return this.f7784a;
    }

    public final synchronized View p() {
        return this.f7787d;
    }

    public final C2076lb q() {
        List<?> list = this.f7788e;
        if (!(list == null || list.size() == 0)) {
            Object obj = this.f7788e.get(0);
            if (obj instanceof IBinder) {
                return C2005kb.a((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized ksa r() {
        return this.f7790g;
    }

    public final synchronized View s() {
        return this.l;
    }

    public final synchronized C2313on t() {
        return this.i;
    }

    public final synchronized C2313on u() {
        return this.j;
    }

    public final synchronized a v() {
        return this.k;
    }

    public final synchronized i<String, C1190Ya> w() {
        return this.r;
    }

    public final synchronized String x() {
        return this.u;
    }

    public final synchronized i<String, String> y() {
        return this.s;
    }

    public final synchronized C2076lb z() {
        return this.o;
    }
}
