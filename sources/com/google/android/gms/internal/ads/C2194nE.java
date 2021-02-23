package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.util.fa;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.nE  reason: case insensitive filesystem */
public abstract class C2194nE {

    /* renamed from: a  reason: collision with root package name */
    private final String f11426a = C2854wa.f12635b.a();

    /* renamed from: b  reason: collision with root package name */
    protected final Map<String, String> f11427b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f11428c;

    /* renamed from: d  reason: collision with root package name */
    protected final C1122Vk f11429d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f11430e;

    protected C2194nE(Executor executor, C1122Vk vk) {
        this.f11428c = executor;
        this.f11429d = vk;
        this.f11430e = ((Boolean) Qqa.e().a(F.vb)).booleanValue() ? ((Boolean) Qqa.e().a(F.wb)).booleanValue() : ((double) Qqa.h().nextFloat()) <= C2854wa.f12634a.a().doubleValue();
    }

    public final void a(Map<String, String> map) {
        String b2 = b(map);
        if (this.f11430e) {
            this.f11428c.execute(new C2123mE(this, b2));
        }
        fa.f(b2);
    }

    /* access modifiers changed from: protected */
    public final String b(Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(this.f11426a).buildUpon();
        for (Map.Entry next : map.entrySet()) {
            buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
        }
        return buildUpon.build().toString();
    }
}
