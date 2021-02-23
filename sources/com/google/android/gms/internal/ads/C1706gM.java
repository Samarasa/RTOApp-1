package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0563t;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.gM  reason: case insensitive filesystem */
public final class C1706gM implements KO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final C2462qqa f10528a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10529b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10530c;

    /* renamed from: d  reason: collision with root package name */
    private final String f10531d;

    /* renamed from: e  reason: collision with root package name */
    private final float f10532e;

    /* renamed from: f  reason: collision with root package name */
    private final int f10533f;

    /* renamed from: g  reason: collision with root package name */
    private final int f10534g;

    /* renamed from: h  reason: collision with root package name */
    private final String f10535h;
    private final boolean i;

    public C1706gM(C2462qqa qqa, String str, boolean z, String str2, float f2, int i2, int i3, String str3, boolean z2) {
        C0563t.a(qqa, (Object) "the adSize must not be null");
        this.f10528a = qqa;
        this.f10529b = str;
        this.f10530c = z;
        this.f10531d = str2;
        this.f10532e = f2;
        this.f10533f = i2;
        this.f10534g = i3;
        this.f10535h = str3;
        this.i = z2;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        C1359bT.a(bundle, "smart_w", "full", this.f10528a.f11918e == -1);
        C1359bT.a(bundle, "smart_h", "auto", this.f10528a.f11915b == -2);
        C1359bT.a(bundle, "ene", (Boolean) true, this.f10528a.j);
        C1359bT.a(bundle, "rafmt", "102", this.f10528a.m);
        C1359bT.a(bundle, "rafmt", "103", this.f10528a.n);
        C1359bT.a(bundle, "inline_adaptive_slot", (Boolean) true, this.i);
        C1359bT.a(bundle, "format", this.f10529b);
        C1359bT.a(bundle, "fluid", "height", this.f10530c);
        String str = this.f10531d;
        C1359bT.a(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.f10532e);
        bundle.putInt("sw", this.f10533f);
        bundle.putInt("sh", this.f10534g);
        String str2 = this.f10535h;
        C1359bT.a(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList arrayList = new ArrayList();
        C2462qqa[] qqaArr = this.f10528a.f11920g;
        if (qqaArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.f10528a.f11915b);
            bundle2.putInt("width", this.f10528a.f11918e);
            bundle2.putBoolean("is_fluid_height", this.f10528a.i);
            arrayList.add(bundle2);
        } else {
            for (C2462qqa qqa : qqaArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", qqa.i);
                bundle3.putInt("height", qqa.f11915b);
                bundle3.putInt("width", qqa.f11918e);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
