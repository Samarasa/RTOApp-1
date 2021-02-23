package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.g.b;
import java.util.Random;
import java.util.WeakHashMap;

public final class Qqa {

    /* renamed from: a  reason: collision with root package name */
    private static Qqa f8400a = new Qqa();

    /* renamed from: b  reason: collision with root package name */
    private final C0758Hk f8401b;

    /* renamed from: c  reason: collision with root package name */
    private final Aqa f8402c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8403d;

    /* renamed from: e  reason: collision with root package name */
    private final C2756v f8404e;

    /* renamed from: f  reason: collision with root package name */
    private final C2898x f8405f;

    /* renamed from: g  reason: collision with root package name */
    private final B f8406g;

    /* renamed from: h  reason: collision with root package name */
    private final C1200Yk f8407h;
    private final Random i;
    private final WeakHashMap<b, String> j;

    protected Qqa() {
        this(new C0758Hk(), new Aqa(new C2107lqa(), new C1894iqa(), new nsa(), new C2291oc(), new C1250_i(), new C2801vj(), new C2726uh(), new C2220nc()), new C2756v(), new C2898x(), new B(), C0758Hk.c(), new C1200Yk(0, 203404000, true), new Random(), new WeakHashMap());
    }

    private Qqa(C0758Hk hk, Aqa aqa, C2756v vVar, C2898x xVar, B b2, String str, C1200Yk yk, Random random, WeakHashMap<b, String> weakHashMap) {
        this.f8401b = hk;
        this.f8402c = aqa;
        this.f8404e = vVar;
        this.f8405f = xVar;
        this.f8406g = b2;
        this.f8403d = str;
        this.f8407h = yk;
        this.i = random;
        this.j = weakHashMap;
    }

    public static C0758Hk a() {
        return f8400a.f8401b;
    }

    public static Aqa b() {
        return f8400a.f8402c;
    }

    public static C2898x c() {
        return f8400a.f8405f;
    }

    public static C2756v d() {
        return f8400a.f8404e;
    }

    public static B e() {
        return f8400a.f8406g;
    }

    public static String f() {
        return f8400a.f8403d;
    }

    public static C1200Yk g() {
        return f8400a.f8407h;
    }

    public static Random h() {
        return f8400a.i;
    }

    public static WeakHashMap<b, String> i() {
        return f8400a.j;
    }
}
