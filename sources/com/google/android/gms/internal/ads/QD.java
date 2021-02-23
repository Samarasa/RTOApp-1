package com.google.android.gms.internal.ads;

import java.util.Map;

public final class QD implements C1290aV {

    /* renamed from: a  reason: collision with root package name */
    private Map<SU, SD> f8300a;

    /* renamed from: b  reason: collision with root package name */
    private Soa f8301b;

    QD(Soa soa, Map<SU, SD> map) {
        this.f8300a = map;
        this.f8301b = soa;
    }

    public final void a(SU su, String str) {
    }

    public final void a(SU su, String str, Throwable th) {
        if (this.f8300a.containsKey(su)) {
            this.f8301b.a(this.f8300a.get(su).f8582c);
        }
    }

    public final void b(SU su, String str) {
        if (this.f8300a.containsKey(su)) {
            this.f8301b.a(this.f8300a.get(su).f8580a);
        }
    }

    public final void c(SU su, String str) {
        if (this.f8300a.containsKey(su)) {
            this.f8301b.a(this.f8300a.get(su).f8581b);
        }
    }
}
