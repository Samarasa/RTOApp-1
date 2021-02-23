package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

public final class QO implements KO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f8326a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f8327b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8328c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8329d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f8330e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f8331f;

    /* renamed from: g  reason: collision with root package name */
    private final String f8332g;

    /* renamed from: h  reason: collision with root package name */
    private final ArrayList<String> f8333h;
    private final String i;
    private final String j;
    private final String k;
    private final boolean l;
    private final String m;
    private final long n;

    public QO(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList<String> arrayList, String str3, String str4, String str5, boolean z6, String str6, long j2) {
        this.f8326a = z;
        this.f8327b = z2;
        this.f8328c = str;
        this.f8329d = z3;
        this.f8330e = z4;
        this.f8331f = z5;
        this.f8332g = str2;
        this.f8333h = arrayList;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = z6;
        this.m = str6;
        this.n = j2;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.f8326a);
        bundle.putBoolean("coh", this.f8327b);
        bundle.putString("gl", this.f8328c);
        bundle.putBoolean("simulator", this.f8329d);
        bundle.putBoolean("is_latchsky", this.f8330e);
        bundle.putBoolean("is_sidewinder", this.f8331f);
        bundle.putString("hl", this.f8332g);
        if (!this.f8333h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.f8333h);
        }
        bundle.putString("mv", this.i);
        bundle.putString("submodel", this.m);
        Bundle a2 = C1359bT.a(bundle, "device");
        bundle.putBundle("device", a2);
        a2.putString("build", this.k);
        if (((Boolean) Qqa.e().a(F.Zb)).booleanValue()) {
            a2.putLong("remaining_data_partition_space", this.n);
        }
        Bundle a3 = C1359bT.a(a2, "browser");
        a2.putBundle("browser", a3);
        a3.putBoolean("is_browser_custom_tabs_capable", this.l);
        if (!TextUtils.isEmpty(this.j)) {
            Bundle a4 = C1359bT.a(a2, "play_store");
            a2.putBundle("play_store", a4);
            a4.putString("package_version", this.j);
        }
    }
}
