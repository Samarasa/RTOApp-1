package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.p;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class FF {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6814a;

    /* renamed from: b  reason: collision with root package name */
    private final C1200Yk f6815b;

    /* renamed from: c  reason: collision with root package name */
    private final SS f6816c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f6817d;

    public FF(Context context, C1200Yk yk, SS ss, Executor executor) {
        this.f6814a = context;
        this.f6815b = yk;
        this.f6816c = ss;
        this.f6817d = executor;
    }

    public final LY<OS> a() {
        C1730gf b2 = p.p().b(this.f6814a, this.f6815b);
        C1447cf<JSONObject> cfVar = C1376bf.f9933b;
        C1220Ze<I, O> a2 = b2.a("google.afma.response.normalize", cfVar, cfVar);
        return DY.a(DY.a(DY.a(DY.a(BuildConfig.FLAVOR), new EF(this, this.f6816c.f8618d.s), this.f6817d), new HF(a2), this.f6817d), new GF(this), this.f6817d);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(JSONObject jSONObject) {
        return DY.a(new OS(new JS(this.f6816c), MS.a(new StringReader(jSONObject.toString()))));
    }
}
