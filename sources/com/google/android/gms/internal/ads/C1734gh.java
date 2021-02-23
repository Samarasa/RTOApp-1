package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.gh  reason: case insensitive filesystem */
public class C1734gh {

    /* renamed from: a  reason: collision with root package name */
    private final C2313on f10561a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10562b;

    public C1734gh(C2313on onVar) {
        this(onVar, BuildConfig.FLAVOR);
    }

    public C1734gh(C2313on onVar, String str) {
        this.f10561a = onVar;
        this.f10562b = str;
    }

    public final void a(int i, int i2, int i3, int i4) {
        try {
            this.f10561a.a("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e2) {
            C1018Rk.b("Error occurred while dispatching size change.", e2);
        }
    }

    public final void a(int i, int i2, int i3, int i4, float f2, int i5) {
        try {
            this.f10561a.a("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f2).put("rotation", i5));
        } catch (JSONException e2) {
            C1018Rk.b("Error occurred while obtaining screen information.", e2);
        }
    }

    public final void a(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.f10562b);
            if (this.f10561a != null) {
                this.f10561a.a("onError", put);
            }
        } catch (JSONException e2) {
            C1018Rk.b("Error occurred while dispatching error event.", e2);
        }
    }

    public final void b(int i, int i2, int i3, int i4) {
        try {
            this.f10561a.a("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e2) {
            C1018Rk.b("Error occurred while dispatching default position.", e2);
        }
    }

    public final void b(String str) {
        try {
            this.f10561a.a("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e2) {
            C1018Rk.b("Error occurred while dispatching ready Event.", e2);
        }
    }

    public final void c(String str) {
        try {
            this.f10561a.a("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e2) {
            C1018Rk.b("Error occurred while dispatching state change.", e2);
        }
    }
}
