package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import c.b.b.b.c.a;
import com.google.android.gms.ads.formats.b;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.mb  reason: case insensitive filesystem */
public final class C2147mb extends b.C0072b {

    /* renamed from: a  reason: collision with root package name */
    private final C2076lb f11321a;

    /* renamed from: b  reason: collision with root package name */
    private final Drawable f11322b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f11323c;

    /* renamed from: d  reason: collision with root package name */
    private final double f11324d;

    /* renamed from: e  reason: collision with root package name */
    private final int f11325e;

    /* renamed from: f  reason: collision with root package name */
    private final int f11326f;

    public C2147mb(C2076lb lbVar) {
        Drawable drawable;
        int i;
        this.f11321a = lbVar;
        Uri uri = null;
        try {
            a cb = this.f11321a.cb();
            if (cb != null) {
                drawable = (Drawable) c.b.b.b.c.b.Q(cb);
                this.f11322b = drawable;
                uri = this.f11321a.getUri();
                this.f11323c = uri;
                double d2 = 1.0d;
                d2 = this.f11321a.mb();
                this.f11324d = d2;
                int i2 = -1;
                i = this.f11321a.getWidth();
                this.f11325e = i;
                i2 = this.f11321a.getHeight();
                this.f11326f = i2;
            }
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
        }
        drawable = null;
        this.f11322b = drawable;
        try {
            uri = this.f11321a.getUri();
        } catch (RemoteException e3) {
            C1018Rk.b(BuildConfig.FLAVOR, e3);
        }
        this.f11323c = uri;
        double d22 = 1.0d;
        try {
            d22 = this.f11321a.mb();
        } catch (RemoteException e4) {
            C1018Rk.b(BuildConfig.FLAVOR, e4);
        }
        this.f11324d = d22;
        int i22 = -1;
        try {
            i = this.f11321a.getWidth();
        } catch (RemoteException e5) {
            C1018Rk.b(BuildConfig.FLAVOR, e5);
            i = -1;
        }
        this.f11325e = i;
        try {
            i22 = this.f11321a.getHeight();
        } catch (RemoteException e6) {
            C1018Rk.b(BuildConfig.FLAVOR, e6);
        }
        this.f11326f = i22;
    }

    public final Drawable a() {
        return this.f11322b;
    }

    public final int b() {
        return this.f11326f;
    }

    public final double c() {
        return this.f11324d;
    }

    public final Uri d() {
        return this.f11323c;
    }

    public final int e() {
        return this.f11325e;
    }
}
