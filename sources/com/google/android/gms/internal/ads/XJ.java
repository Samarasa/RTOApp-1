package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.ads.internal.overlay.m;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

public class XJ extends C0909Nf {

    /* renamed from: a  reason: collision with root package name */
    private final C2537ru f9217a;

    /* renamed from: b  reason: collision with root package name */
    private final C0846Ku f9218b;

    /* renamed from: c  reason: collision with root package name */
    private final C1080Tu f9219c;

    /* renamed from: d  reason: collision with root package name */
    private final C1546dv f9220d;

    /* renamed from: e  reason: collision with root package name */
    private final C3036yw f9221e;

    /* renamed from: f  reason: collision with root package name */
    private final C2468qv f9222f;

    /* renamed from: g  reason: collision with root package name */
    private final C1031Rx f9223g;

    /* renamed from: h  reason: collision with root package name */
    private final C2823vw f9224h;
    private final C0586Au i;

    public XJ(C2537ru ruVar, C0846Ku ku, C1080Tu tu, C1546dv dvVar, C3036yw ywVar, C2468qv qvVar, C1031Rx rx, C2823vw vwVar, C0586Au au) {
        this.f9217a = ruVar;
        this.f9218b = ku;
        this.f9219c = tu;
        this.f9220d = dvVar;
        this.f9221e = ywVar;
        this.f9222f = qvVar;
        this.f9223g = rx;
        this.f9224h = vwVar;
        this.i = au;
    }

    public void Eb() {
        this.f9223g.aa();
    }

    public final void H() {
        this.f9220d.H();
    }

    public void I() {
        this.f9218b.I();
        this.f9224h.X();
    }

    public final void M() {
        this.f9222f.Tb();
        this.f9224h.Y();
    }

    public final void N() {
        this.f9219c.Y();
    }

    public final void O() {
        this.f9222f.a(m.OTHER);
    }

    public final void a(int i2) {
    }

    public final void a(int i2, String str) {
    }

    public final void a(C0749Hb hb, String str) {
    }

    public final void a(C0961Pf pf) {
    }

    public void a(C1809hj hjVar) {
    }

    public void a(C1950jj jjVar) {
    }

    public final void a(String str, String str2) {
        this.f9221e.a(str, str2);
    }

    public final void b(Bundle bundle) {
    }

    public final void b(C1824hqa hqa) {
    }

    public final void c(C1824hqa hqa) {
        this.i.b(C2209nT.a(C2351pT.MEDIATION_SHOW_ERROR, hqa));
    }

    @Deprecated
    public final void f(int i2) {
        c(new C1824hqa(i2, BuildConfig.FLAVOR, "undefined", (C1824hqa) null, (IBinder) null));
    }

    public final void ka() {
        this.f9223g.Y();
    }

    public void ma() {
        this.f9223g.X();
    }

    public final void o(String str) {
        c(new C1824hqa(0, str, "undefined", (C1824hqa) null, (IBinder) null));
    }

    public final void onAdClicked() {
        this.f9217a.onAdClicked();
    }

    public void qb() {
    }

    public final void sa() {
        this.f9223g.Z();
    }

    public final void u(String str) {
    }
}
