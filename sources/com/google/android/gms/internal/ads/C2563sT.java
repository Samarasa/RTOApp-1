package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.sT  reason: case insensitive filesystem */
public final class C2563sT implements C0628Ck, C2963xu {

    /* renamed from: a  reason: collision with root package name */
    private final HashSet<C2803vk> f12088a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private final Context f12089b;

    /* renamed from: c  reason: collision with root package name */
    private final C0732Gk f12090c;

    public C2563sT(Context context, C0732Gk gk) {
        this.f12089b = context;
        this.f12090c = gk;
    }

    public final Bundle a() {
        return this.f12090c.a(this.f12089b, (C0628Ck) this);
    }

    public final synchronized void a(C1824hqa hqa) {
        if (hqa.f10744a != 3) {
            this.f12090c.a(this.f12088a);
        }
    }

    public final synchronized void a(HashSet<C2803vk> hashSet) {
        this.f12088a.clear();
        this.f12088a.addAll(hashSet);
    }
}
