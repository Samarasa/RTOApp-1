package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.gC  reason: case insensitive filesystem */
final class C1696gC<T> implements C1088Uc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<T> f10498a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10499b;

    /* renamed from: c  reason: collision with root package name */
    private final C1088Uc<T> f10500c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ VB f10501d;

    private C1696gC(VB vb, WeakReference<T> weakReference, String str, C1088Uc<T> uc) {
        this.f10501d = vb;
        this.f10498a = weakReference;
        this.f10499b = str;
        this.f10500c = uc;
    }

    /* synthetic */ C1696gC(VB vb, WeakReference weakReference, String str, C1088Uc uc, _B _b) {
        this(vb, weakReference, str, uc);
    }

    public final void a(Object obj, Map<String, String> map) {
        Object obj2 = this.f10498a.get();
        if (obj2 == null) {
            this.f10501d.b(this.f10499b, this);
        } else {
            this.f10500c.a(obj2, map);
        }
    }
}
