package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ch  reason: case insensitive filesystem */
public final class C1451ch {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f10066a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f10067b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10068c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f10069d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f10070e;

    private C1451ch(C1592eh ehVar) {
        this.f10066a = ehVar.f10289a;
        this.f10067b = ehVar.f10290b;
        this.f10068c = ehVar.f10291c;
        this.f10069d = ehVar.f10292d;
        this.f10070e = ehVar.f10293e;
    }

    public final JSONObject a() {
        try {
            return new JSONObject().put("sms", this.f10066a).put("tel", this.f10067b).put("calendar", this.f10068c).put("storePicture", this.f10069d).put("inlineVideo", this.f10070e);
        } catch (JSONException e2) {
            C1018Rk.b("Error occured while obtaining the MRAID capabilities.", e2);
            return null;
        }
    }
}
