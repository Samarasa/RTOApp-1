package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import c.b.b.b.c.b;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.h;
import com.google.android.gms.ads.v;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.Ib  reason: case insensitive filesystem */
public final class C0775Ib implements h {

    /* renamed from: a  reason: collision with root package name */
    private final C0749Hb f7302a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaView f7303b;

    /* renamed from: c  reason: collision with root package name */
    private final v f7304c = new v();

    public C0775Ib(C0749Hb hb) {
        Context context;
        this.f7302a = hb;
        MediaView mediaView = null;
        try {
            context = (Context) b.Q(hb.Mb());
        } catch (RemoteException | NullPointerException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (this.f7302a.w(b.a(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e3) {
                C1018Rk.b(BuildConfig.FLAVOR, e3);
            }
        }
        this.f7303b = mediaView;
    }

    public final String W() {
        try {
            return this.f7302a.W();
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    public final C0749Hb a() {
        return this.f7302a;
    }
}
