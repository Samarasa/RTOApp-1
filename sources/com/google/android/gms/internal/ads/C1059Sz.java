package com.google.android.gms.internal.ads;

import b.e.i;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Sz  reason: case insensitive filesystem */
public final class C1059Sz {

    /* renamed from: a  reason: collision with root package name */
    public static final C1059Sz f8714a = new C1111Uz().a();

    /* renamed from: b  reason: collision with root package name */
    private final C0879Mb f8715b;

    /* renamed from: c  reason: collision with root package name */
    private final C0853Lb f8716c;

    /* renamed from: d  reason: collision with root package name */
    private final C1243_b f8717d;

    /* renamed from: e  reason: collision with root package name */
    private final C1217Zb f8718e;

    /* renamed from: f  reason: collision with root package name */
    private final C1037Sd f8719f;

    /* renamed from: g  reason: collision with root package name */
    private final i<String, C1035Sb> f8720g;

    /* renamed from: h  reason: collision with root package name */
    private final i<String, C1009Rb> f8721h;

    private C1059Sz(C1111Uz uz) {
        this.f8715b = uz.f8987a;
        this.f8716c = uz.f8988b;
        this.f8717d = uz.f8989c;
        this.f8720g = new i<>(uz.f8992f);
        this.f8721h = new i<>(uz.f8993g);
        this.f8718e = uz.f8990d;
        this.f8719f = uz.f8991e;
    }

    public final C0879Mb a() {
        return this.f8715b;
    }

    public final C1035Sb a(String str) {
        return this.f8720g.get(str);
    }

    public final C0853Lb b() {
        return this.f8716c;
    }

    public final C1009Rb b(String str) {
        return this.f8721h.get(str);
    }

    public final C1243_b c() {
        return this.f8717d;
    }

    public final C1217Zb d() {
        return this.f8718e;
    }

    public final C1037Sd e() {
        return this.f8719f;
    }

    public final ArrayList<String> f() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f8717d != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f8715b != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f8716c != null) {
            arrayList.add(Integer.toString(2));
        }
        if (this.f8720g.size() > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f8719f != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList<String> g() {
        ArrayList<String> arrayList = new ArrayList<>(this.f8720g.size());
        for (int i = 0; i < this.f8720g.size(); i++) {
            arrayList.add(this.f8720g.b(i));
        }
        return arrayList;
    }
}
