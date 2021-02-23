package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.uO  reason: case insensitive filesystem */
public final class C2700uO implements KO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f12316a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12317b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12318c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f12319d;

    /* renamed from: e  reason: collision with root package name */
    private final int f12320e;

    /* renamed from: f  reason: collision with root package name */
    private final int f12321f;

    /* renamed from: g  reason: collision with root package name */
    private final int f12322g;

    public C2700uO(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3) {
        this.f12316a = z;
        this.f12317b = z2;
        this.f12318c = str;
        this.f12319d = z3;
        this.f12320e = i;
        this.f12321f = i2;
        this.f12322g = i3;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.f12318c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) Qqa.e().a(F.ac));
        bundle.putInt("target_api", this.f12320e);
        bundle.putInt("dv", this.f12321f);
        bundle.putInt("lv", this.f12322g);
        Bundle a2 = C1359bT.a(bundle, "sdk_env");
        a2.putBoolean("mf", C0670Ea.f6710a.a().booleanValue());
        a2.putBoolean("instant_app", this.f12316a);
        a2.putBoolean("lite", this.f12317b);
        a2.putBoolean("is_privileged_process", this.f12319d);
        bundle.putBundle("sdk_env", a2);
        Bundle a3 = C1359bT.a(a2, "build_meta");
        a3.putString("cl", "334274230");
        a3.putString("rapid_rc", "dev");
        a3.putString("rapid_rollup", "HEAD");
        a2.putBundle("build_meta", a3);
    }
}
