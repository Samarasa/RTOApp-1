package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sU  reason: case insensitive filesystem */
public final class C2564sU implements Xga<PY> {
    public static C2564sU a() {
        return C2493rU.f11975a;
    }

    public final /* synthetic */ Object get() {
        PY py;
        if (((Boolean) Qqa.e().a(F.Vd)).booleanValue()) {
            py = C1252_k.f9701c;
        } else {
            py = ((Boolean) Qqa.e().a(F.Ud)).booleanValue() ? C1252_k.f9699a : C1252_k.f9703e;
        }
        C1452cha.a(py, "Cannot return null from a non-@Nullable @Provides method");
        return py;
    }
}
