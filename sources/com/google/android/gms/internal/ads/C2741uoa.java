package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.a.a;

/* renamed from: com.google.android.gms.internal.ads.uoa  reason: case insensitive filesystem */
public final class C2741uoa {

    /* renamed from: a  reason: collision with root package name */
    private C1755gra f12415a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f12416b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12417c;

    /* renamed from: d  reason: collision with root package name */
    private final asa f12418d;

    /* renamed from: e  reason: collision with root package name */
    private final int f12419e;

    /* renamed from: f  reason: collision with root package name */
    private final a.C0069a f12420f;

    /* renamed from: g  reason: collision with root package name */
    private final C0701Ff f12421g = new C0701Ff();

    /* renamed from: h  reason: collision with root package name */
    private final C2320oqa f12422h;

    public C2741uoa(Context context, String str, asa asa, int i, a.C0069a aVar) {
        this.f12416b = context;
        this.f12417c = str;
        this.f12418d = asa;
        this.f12419e = i;
        this.f12420f = aVar;
        this.f12422h = C2320oqa.f11645a;
    }

    public final void a() {
        try {
            this.f12415a = Qqa.b().a(this.f12416b, C2462qqa.i(), this.f12417c, this.f12421g);
            this.f12415a.a(new C3100zqa(this.f12419e));
            this.f12415a.a((C2103loa) new C1678foa(this.f12420f));
            this.f12415a.a(C2320oqa.a(this.f12416b, this.f12418d));
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }
}
