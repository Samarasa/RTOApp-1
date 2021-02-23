package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.lz  reason: case insensitive filesystem */
final class C2117lz implements C1088Uc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<C1834hz> f11269a;

    private C2117lz(C1834hz hzVar) {
        this.f11269a = new WeakReference<>(hzVar);
    }

    public final void a(Object obj, Map<String, String> map) {
        C1834hz hzVar = (C1834hz) this.f11269a.get();
        if (hzVar != null) {
            hzVar.f10764g.I();
        }
    }
}
