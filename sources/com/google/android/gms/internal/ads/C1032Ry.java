package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.C1538dpa;

/* renamed from: com.google.android.gms.internal.ads.Ry  reason: case insensitive filesystem */
public final class C1032Ry implements C2608su, C2328ox {

    /* renamed from: a  reason: collision with root package name */
    private final C0939Oj f8561a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f8562b;

    /* renamed from: c  reason: collision with root package name */
    private final C1017Rj f8563c;

    /* renamed from: d  reason: collision with root package name */
    private final View f8564d;

    /* renamed from: e  reason: collision with root package name */
    private String f8565e;

    /* renamed from: f  reason: collision with root package name */
    private final C1538dpa.a f8566f;

    public C1032Ry(C0939Oj oj, Context context, C1017Rj rj, View view, C1538dpa.a aVar) {
        this.f8561a = oj;
        this.f8562b = context;
        this.f8563c = rj;
        this.f8564d = view;
        this.f8566f = aVar;
    }

    public final void K() {
    }

    public final void L() {
    }

    public final void M() {
        View view = this.f8564d;
        if (!(view == null || this.f8565e == null)) {
            this.f8563c.c(view.getContext(), this.f8565e);
        }
        this.f8561a.f(true);
    }

    public final void N() {
    }

    public final void O() {
        this.f8561a.f(false);
    }

    public final void a() {
        this.f8565e = this.f8563c.a(this.f8562b);
        String valueOf = String.valueOf(this.f8565e);
        String str = this.f8566f == C1538dpa.a.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial";
        this.f8565e = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    public final void a(C0886Mi mi, String str, String str2) {
        if (this.f8563c.g(this.f8562b)) {
            try {
                this.f8563c.a(this.f8562b, this.f8563c.d(this.f8562b), this.f8561a.H(), mi.getType(), mi.F());
            } catch (RemoteException e2) {
                C1018Rk.c("Remote Exception to get reward item.", e2);
            }
        }
    }

    public final void b() {
    }
}
