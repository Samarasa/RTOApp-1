package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.C2745uqa;
import com.google.android.gms.internal.ads.F;
import com.google.android.gms.internal.ads.Nra;
import com.google.android.gms.internal.ads.Qqa;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final Nra f5727a;

    /* renamed from: b  reason: collision with root package name */
    private final List<i> f5728b = new ArrayList();

    private u(Nra nra) {
        this.f5727a = nra;
        if (((Boolean) Qqa.e().a(F.Ff)).booleanValue()) {
            try {
                List<C2745uqa> ob = this.f5727a.ob();
                if (ob != null) {
                    for (C2745uqa a2 : ob) {
                        this.f5728b.add(i.a(a2));
                    }
                }
            } catch (RemoteException e2) {
                C1018Rk.b("Could not forward getAdapterResponseInfo to ResponseInfo.", e2);
            }
        }
    }

    public static u a(Nra nra) {
        if (nra != null) {
            return new u(nra);
        }
        return null;
    }

    public final String a() {
        try {
            return this.f5727a.o();
        } catch (RemoteException e2) {
            C1018Rk.b("Could not forward getMediationAdapterClassName to ResponseInfo.", e2);
            return null;
        }
    }

    public final String b() {
        try {
            return this.f5727a.Cb();
        } catch (RemoteException e2) {
            C1018Rk.b("Could not forward getResponseId to ResponseInfo.", e2);
            return null;
        }
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        String b2 = b();
        if (b2 == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", b2);
        }
        String a2 = a();
        if (a2 == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", a2);
        }
        JSONArray jSONArray = new JSONArray();
        for (i a3 : this.f5728b) {
            jSONArray.put(a3.a());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        return jSONObject;
    }

    public final String toString() {
        try {
            return c().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
