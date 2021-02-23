package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

public class Aqa {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C2107lqa f6203a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C1894iqa f6204b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final nsa f6205c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C2291oc f6206d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C1250_i f6207e;

    /* renamed from: f  reason: collision with root package name */
    private final C2801vj f6208f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C2726uh f6209g;

    /* renamed from: h  reason: collision with root package name */
    private final C2220nc f6210h;

    public Aqa(C2107lqa lqa, C1894iqa iqa, nsa nsa, C2291oc ocVar, C1250_i _iVar, C2801vj vjVar, C2726uh uhVar, C2220nc ncVar) {
        this.f6203a = lqa;
        this.f6204b = iqa;
        this.f6205c = nsa;
        this.f6206d = ocVar;
        this.f6207e = _iVar;
        this.f6208f = vjVar;
        this.f6209g = uhVar;
        this.f6210h = ncVar;
    }

    /* access modifiers changed from: private */
    public static void b(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        Qqa.a().a(context, Qqa.g().f9456a, "gmob-apps", bundle, true);
    }

    public final Zqa a(Context context, String str, C0675Ef ef) {
        return (Zqa) new Lqa(this, context, str, ef).a(context, false);
    }

    public final C1755gra a(Context context, C2462qqa qqa, String str, C0675Ef ef) {
        return (C1755gra) new Gqa(this, context, qqa, str, ef).a(context, false);
    }

    public final C1875ih a(Context context, C0675Ef ef) {
        return (C1875ih) new Fqa(this, context, ef).a(context, false);
    }

    public final C2360pb a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (C2360pb) new Mqa(this, frameLayout, frameLayout2, context).a(context, false);
    }

    public final C2868wh a(Activity activity) {
        Eqa eqa = new Eqa(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            C1018Rk.b("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (C2868wh) eqa.a(activity, z);
    }
}
