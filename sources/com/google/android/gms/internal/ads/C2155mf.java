package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.mf  reason: case insensitive filesystem */
final class C2155mf implements C1726gd {

    /* renamed from: a  reason: collision with root package name */
    private final C0804Je f11338a;

    /* renamed from: b  reason: collision with root package name */
    private final C1742gl<O> f11339b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C1801hf f11340c;

    public C2155mf(C1801hf hfVar, C0804Je je, C1742gl<O> glVar) {
        this.f11340c = hfVar;
        this.f11338a = je;
        this.f11339b = glVar;
    }

    public final void a(JSONObject jSONObject) {
        try {
            this.f11339b.a(this.f11340c.f10694a.a(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e2) {
            this.f11339b.a((Throwable) e2);
        } catch (Throwable th) {
            this.f11338a.c();
            throw th;
        }
        this.f11338a.c();
    }

    public final void b(String str) {
        if (str == null) {
            try {
                this.f11339b.a((Throwable) new C1142We());
            } catch (IllegalStateException unused) {
            } catch (Throwable th) {
                this.f11338a.c();
                throw th;
            }
        } else {
            this.f11339b.a((Throwable) new C1142We(str));
        }
        this.f11338a.c();
    }
}
