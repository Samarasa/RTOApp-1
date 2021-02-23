package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oS  reason: case insensitive filesystem */
final class C2279oS implements C1917jL<C2405qC> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2137mS f11589a;

    C2279oS(C2137mS mSVar) {
        this.f11589a = mSVar;
    }

    public final void a() {
        synchronized (this.f11589a) {
            C2405qC unused = this.f11589a.f11309f = null;
        }
    }

    public final /* synthetic */ void a(Object obj) {
        C2405qC qCVar = (C2405qC) obj;
        synchronized (this.f11589a) {
            C2405qC unused = this.f11589a.f11309f = qCVar;
            this.f11589a.f11309f.b();
        }
    }
}
