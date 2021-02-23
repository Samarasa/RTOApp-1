package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.C0515v;
import com.google.android.gms.ads.internal.util.fa;
import com.google.android.gms.common.internal.C0563t;

/* renamed from: com.google.android.gms.internal.ads.Ne  reason: case insensitive filesystem */
public final class C0908Ne extends C2238nl<C1870ie> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f7986c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public C0515v<C1870ie> f7987d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7988e;

    /* renamed from: f  reason: collision with root package name */
    private int f7989f;

    public C0908Ne(C0515v<C1870ie> vVar) {
        this.f7987d = vVar;
        this.f7988e = false;
        this.f7989f = 0;
    }

    private final void f() {
        synchronized (this.f7986c) {
            C0563t.b(this.f7989f >= 0);
            if (!this.f7988e || this.f7989f != 0) {
                fa.f("There are still references to the engine. Not destroying.");
            } else {
                fa.f("No reference is left (including root). Cleaning up engine.");
                a(new C1038Se(this), new C2096ll());
            }
        }
    }

    public final C0804Je c() {
        C0804Je je = new C0804Je(this);
        synchronized (this.f7986c) {
            a(new C0986Qe(this, je), new C0960Pe(this, je));
            C0563t.b(this.f7989f >= 0);
            this.f7989f++;
        }
        return je;
    }

    /* access modifiers changed from: protected */
    public final void d() {
        synchronized (this.f7986c) {
            C0563t.b(this.f7989f > 0);
            fa.f("Releasing 1 reference for JS Engine");
            this.f7989f--;
            f();
        }
    }

    public final void e() {
        synchronized (this.f7986c) {
            C0563t.b(this.f7989f >= 0);
            fa.f("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f7988e = true;
            f();
        }
    }
}
