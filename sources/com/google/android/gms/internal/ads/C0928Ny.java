package com.google.android.gms.internal.ads;

import android.content.Context;
import b.e.b;
import c.b.b.b.c.a;
import com.google.android.gms.ads.internal.overlay.m;
import com.google.android.gms.ads.internal.overlay.q;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.internal.ads.C1538dpa;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ny  reason: case insensitive filesystem */
public final class C0928Ny implements q, C1900iv {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8041a;

    /* renamed from: b  reason: collision with root package name */
    private final C2313on f8042b;

    /* renamed from: c  reason: collision with root package name */
    private final C2988yS f8043c;

    /* renamed from: d  reason: collision with root package name */
    private final C1200Yk f8044d;

    /* renamed from: e  reason: collision with root package name */
    private final C1538dpa.a f8045e;

    /* renamed from: f  reason: collision with root package name */
    private a f8046f;

    public C0928Ny(Context context, C2313on onVar, C2988yS ySVar, C1200Yk yk, C1538dpa.a aVar) {
        this.f8041a = context;
        this.f8042b = onVar;
        this.f8043c = ySVar;
        this.f8044d = yk;
        this.f8045e = aVar;
    }

    public final void H() {
        a aVar;
        C2513rh rhVar;
        C2655th thVar;
        C1538dpa.a aVar2 = this.f8045e;
        if ((aVar2 == C1538dpa.a.REWARD_BASED_VIDEO_AD || aVar2 == C1538dpa.a.INTERSTITIAL || aVar2 == C1538dpa.a.APP_OPEN) && this.f8043c.N && this.f8042b != null && p.r().b(this.f8041a)) {
            C1200Yk yk = this.f8044d;
            int i = yk.f9457b;
            int i2 = yk.f9458c;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            String sb2 = sb.toString();
            String b2 = this.f8043c.P.b();
            if (((Boolean) Qqa.e().a(F.rd)).booleanValue()) {
                if (this.f8043c.P.a() == com.google.android.gms.ads.f.a.a.a.VIDEO) {
                    rhVar = C2513rh.VIDEO;
                    thVar = C2655th.DEFINED_BY_JAVASCRIPT;
                } else {
                    thVar = this.f8043c.S == 2 ? C2655th.UNSPECIFIED : C2655th.BEGIN_TO_RENDER;
                    rhVar = C2513rh.HTML_DISPLAY;
                }
                aVar = p.r().a(sb2, this.f8042b.getWebView(), BuildConfig.FLAVOR, "javascript", b2, thVar, rhVar, this.f8043c.ga);
            } else {
                aVar = p.r().a(sb2, this.f8042b.getWebView(), BuildConfig.FLAVOR, "javascript", b2);
            }
            this.f8046f = aVar;
            if (this.f8046f != null && this.f8042b.getView() != null) {
                p.r().a(this.f8046f, this.f8042b.getView());
                this.f8042b.a(this.f8046f);
                p.r().a(this.f8046f);
                if (((Boolean) Qqa.e().a(F.ud)).booleanValue()) {
                    this.f8042b.a("onSdkLoaded", (Map<String, ?>) new b());
                }
            }
        }
    }

    public final void J() {
    }

    public final void Tb() {
        C2313on onVar;
        if (this.f8046f != null && (onVar = this.f8042b) != null) {
            onVar.a("onSdkImpression", (Map<String, ?>) new b());
        }
    }

    public final void a(m mVar) {
        this.f8046f = null;
    }

    public final void onPause() {
    }

    public final void onResume() {
    }
}
