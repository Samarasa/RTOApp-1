package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ty  reason: case insensitive filesystem */
final class C1084Ty implements C0584As<C0714Fs> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, C2480rH<C0714Fs>> f8845a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, C2480rH<C3110zz>> f8846b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, II<C3110zz>> f8847c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C0584As<C0583Ar>> f8848d;

    /* renamed from: e  reason: collision with root package name */
    private final C1059Sz f8849e;

    C1084Ty(Map<String, C2480rH<C0714Fs>> map, Map<String, C2480rH<C3110zz>> map2, Map<String, II<C3110zz>> map3, C1876iha<C0584As<C0583Ar>> iha, C1059Sz sz) {
        this.f8845a = map;
        this.f8846b = map2;
        this.f8847c = map3;
        this.f8848d = iha;
        this.f8849e = sz;
    }

    public final C2480rH<C0714Fs> a(int i, String str) {
        C2480rH a2;
        C2480rH<C0714Fs> rHVar = this.f8845a.get(str);
        if (rHVar != null) {
            return rHVar;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            II ii = this.f8847c.get(str);
            if (ii != null) {
                return C0714Fs.a((II<? extends C3103zs>) ii);
            }
            C2480rH rHVar2 = this.f8846b.get(str);
            if (rHVar2 != null) {
                return C0714Fs.a((C2480rH<? extends C3103zs>) rHVar2);
            }
            return null;
        } else if (this.f8849e.d() == null || (a2 = this.f8848d.get().a(i, str)) == null) {
            return null;
        } else {
            return C0714Fs.a((C2480rH<? extends C3103zs>) a2);
        }
    }
}
