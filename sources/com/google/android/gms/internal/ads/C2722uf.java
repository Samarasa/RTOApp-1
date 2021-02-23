package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.uf  reason: case insensitive filesystem */
final class C2722uf implements C1726gd {

    /* renamed from: a  reason: collision with root package name */
    private final C1742gl<O> f12360a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2580sf f12361b;

    public C2722uf(C2580sf sfVar, C1742gl<O> glVar) {
        this.f12361b = sfVar;
        this.f12360a = glVar;
    }

    public final void a(JSONObject jSONObject) {
        try {
            this.f12360a.a(this.f12361b.f12114a.a(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e2) {
            this.f12360a.a((Throwable) e2);
        }
    }

    public final void b(String str) {
        if (str == null) {
            try {
                this.f12360a.a((Throwable) new C1142We());
            } catch (IllegalStateException unused) {
            }
        } else {
            this.f12360a.a((Throwable) new C1142We(str));
        }
    }
}
