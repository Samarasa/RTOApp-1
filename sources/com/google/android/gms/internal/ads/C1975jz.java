package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.jz  reason: case insensitive filesystem */
final class C1975jz implements C1088Uc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<C1834hz> f11023a;

    private C1975jz(C1834hz hzVar) {
        this.f11023a = new WeakReference<>(hzVar);
    }

    public final void a(Object obj, Map<String, String> map) {
        C1834hz hzVar = (C1834hz) this.f11023a.get();
        if (hzVar != null && "_ac".equals(map.get("eventName"))) {
            hzVar.f10765h.onAdClicked();
        }
    }
}
