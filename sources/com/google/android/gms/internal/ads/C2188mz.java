package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.mz  reason: case insensitive filesystem */
final class C2188mz implements C1088Uc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<C1834hz> f11419a;

    private C2188mz(C1834hz hzVar) {
        this.f11419a = new WeakReference<>(hzVar);
    }

    public final void a(Object obj, Map<String, String> map) {
        C1834hz hzVar = (C1834hz) this.f11419a.get();
        if (hzVar != null) {
            hzVar.f10765h.onAdClicked();
        }
    }
}
