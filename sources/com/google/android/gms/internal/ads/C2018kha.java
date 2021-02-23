package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import b.c.a.h;
import b.c.a.k;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.kha  reason: case insensitive filesystem */
public final class C2018kha extends k {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<C1947jha> f11087a;

    public C2018kha(C1947jha jha) {
        this.f11087a = new WeakReference<>(jha);
    }

    public final void a(ComponentName componentName, h hVar) {
        C1947jha jha = (C1947jha) this.f11087a.get();
        if (jha != null) {
            jha.a(hVar);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C1947jha jha = (C1947jha) this.f11087a.get();
        if (jha != null) {
            jha.a();
        }
    }
}
