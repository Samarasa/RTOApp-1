package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.C0563t;

/* renamed from: com.google.android.gms.internal.ads.Pl  reason: case insensitive filesystem */
public final class C0967Pl {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8247a;

    /* renamed from: b  reason: collision with root package name */
    private final C1175Xl f8248b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewGroup f8249c;

    /* renamed from: d  reason: collision with root package name */
    private C0811Jl f8250d;

    private C0967Pl(Context context, ViewGroup viewGroup, C1175Xl xl, C0811Jl jl) {
        this.f8247a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f8249c = viewGroup;
        this.f8248b = xl;
        this.f8250d = null;
    }

    public C0967Pl(Context context, ViewGroup viewGroup, C2313on onVar) {
        this(context, viewGroup, onVar, (C0811Jl) null);
    }

    public final void a() {
        C0563t.a("onDestroy must be called from the UI thread.");
        C0811Jl jl = this.f8250d;
        if (jl != null) {
            jl.h();
            this.f8249c.removeView(this.f8250d);
            this.f8250d = null;
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        C0563t.a("The underlay may only be modified from the UI thread.");
        C0811Jl jl = this.f8250d;
        if (jl != null) {
            jl.a(i, i2, i3, i4);
        }
    }

    public final void a(int i, int i2, int i3, int i4, int i5, boolean z, C1201Yl yl) {
        if (this.f8250d == null) {
            N.a(this.f8248b.x().a(), this.f8248b.H(), "vpr2");
            Context context = this.f8247a;
            C1175Xl xl = this.f8248b;
            this.f8250d = new C0811Jl(context, xl, i5, z, xl.x().a(), yl);
            this.f8249c.addView(this.f8250d, 0, new ViewGroup.LayoutParams(-1, -1));
            int i6 = i;
            int i7 = i2;
            int i8 = i3;
            int i9 = i4;
            this.f8250d.a(i, i2, i3, i4);
            this.f8248b.f(false);
        }
    }

    public final void b() {
        C0563t.a("onPause must be called from the UI thread.");
        C0811Jl jl = this.f8250d;
        if (jl != null) {
            jl.i();
        }
    }

    public final C0811Jl c() {
        C0563t.a("getAdVideoUnderlay must be called from the UI thread.");
        return this.f8250d;
    }
}
