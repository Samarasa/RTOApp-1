package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.gJ  reason: case insensitive filesystem */
public final class C1703gJ {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final e f10517a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C1845iJ f10518b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f10519c = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final boolean f10520d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C3048zH f10521e;

    public C1703gJ(e eVar, C1845iJ iJVar, C3048zH zHVar) {
        this.f10517a = eVar;
        this.f10518b = iJVar;
        this.f10520d = ((Boolean) Qqa.e().a(F.bf)).booleanValue();
        this.f10521e = zHVar;
    }

    /* access modifiers changed from: private */
    public final void a(String str, int i, long j, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
        sb.append(str);
        sb.append(".");
        sb.append(i);
        sb.append(".");
        sb.append(j);
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 1 + String.valueOf(str2).length());
            sb3.append(sb2);
            sb3.append(".");
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        this.f10519c.add(sb2);
    }

    /* access modifiers changed from: package-private */
    public final <T> LY<T> a(DS ds, C2988yS ySVar, LY<T> ly) {
        long b2 = this.f10517a.b();
        String str = ySVar.v;
        if (str != null) {
            DY.a(ly, new C1632fJ(this, b2, str, ySVar, ds), (Executor) C1252_k.f9704f);
        }
        return ly;
    }

    public final String a() {
        return TextUtils.join("_", this.f10519c);
    }
}
