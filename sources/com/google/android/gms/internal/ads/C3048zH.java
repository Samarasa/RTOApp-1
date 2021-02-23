package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.zH  reason: case insensitive filesystem */
public final class C3048zH {

    /* renamed from: a  reason: collision with root package name */
    private final List<C2745uqa> f13024a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, C2745uqa> f13025b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c  reason: collision with root package name */
    private C2988yS f13026c = null;

    public final List<C2745uqa> a() {
        return this.f13024a;
    }

    public final void a(C2988yS ySVar) {
        String str = ySVar.v;
        if (!this.f13025b.containsKey(str)) {
            Bundle bundle = new Bundle();
            Iterator<String> keys = ySVar.u.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    bundle.putString(next, ySVar.u.getString(next));
                } catch (JSONException unused) {
                }
            }
            C2745uqa uqa = new C2745uqa(ySVar.D, 0, (C1824hqa) null, bundle);
            this.f13024a.add(uqa);
            this.f13025b.put(str, uqa);
        }
    }

    public final void a(C2988yS ySVar, long j, C1824hqa hqa) {
        String str = ySVar.v;
        if (this.f13025b.containsKey(str)) {
            if (this.f13026c == null) {
                this.f13026c = ySVar;
            }
            C2745uqa uqa = this.f13025b.get(str);
            uqa.f12444b = j;
            uqa.f12445c = hqa;
        }
    }

    public final C2254nu b() {
        return new C2254nu(this.f13026c, BuildConfig.FLAVOR, this);
    }
}
