package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.internal.ads.C0835Kj;
import com.google.android.gms.internal.ads.C1382bi;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5435a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f5436b;

    /* renamed from: c  reason: collision with root package name */
    private C0835Kj f5437c;

    /* renamed from: d  reason: collision with root package name */
    private C1382bi f5438d = null;

    public a(Context context, C0835Kj kj, C1382bi biVar) {
        this.f5435a = context;
        this.f5437c = kj;
        if (this.f5438d == null) {
            this.f5438d = new C1382bi();
        }
    }

    private final boolean c() {
        C0835Kj kj = this.f5437c;
        return (kj != null && kj.d().f7463f) || this.f5438d.f9947a;
    }

    public final void a() {
        this.f5436b = true;
    }

    public final void a(String str) {
        List<String> list;
        if (c()) {
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            C0835Kj kj = this.f5437c;
            if (kj != null) {
                kj.a(str, (Map<String, String>) null, 3);
                return;
            }
            C1382bi biVar = this.f5438d;
            if (biVar.f9947a && (list = biVar.f9948b) != null) {
                for (String next : list) {
                    if (!TextUtils.isEmpty(next)) {
                        String replace = next.replace("{NAVIGATION_URL}", Uri.encode(str));
                        p.c();
                        oa.a(this.f5435a, BuildConfig.FLAVOR, replace);
                    }
                }
            }
        }
    }

    public final boolean b() {
        return !c() || this.f5436b;
    }
}
