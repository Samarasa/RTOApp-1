package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.uk  reason: case insensitive filesystem */
final class C2732uk {

    /* renamed from: a  reason: collision with root package name */
    private long f12378a = -1;

    /* renamed from: b  reason: collision with root package name */
    private long f12379b = -1;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C2803vk f12380c;

    public C2732uk(C2803vk vkVar) {
        this.f12380c = vkVar;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f12378a);
        bundle.putLong("tclose", this.f12379b);
        return bundle;
    }

    public final long b() {
        return this.f12379b;
    }

    public final void c() {
        this.f12379b = this.f12380c.f12547a.b();
    }

    public final void d() {
        this.f12378a = this.f12380c.f12547a.b();
    }
}
