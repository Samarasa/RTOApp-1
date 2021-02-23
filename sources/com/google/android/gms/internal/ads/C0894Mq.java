package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.fa;
import com.google.android.gms.common.util.e;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Mq  reason: case insensitive filesystem */
public final class C0894Mq implements C2739una {

    /* renamed from: a  reason: collision with root package name */
    private C2313on f7908a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f7909b;

    /* renamed from: c  reason: collision with root package name */
    private final C0608Bq f7910c;

    /* renamed from: d  reason: collision with root package name */
    private final e f7911d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7912e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7913f = false;

    /* renamed from: g  reason: collision with root package name */
    private C0712Fq f7914g = new C0712Fq();

    public C0894Mq(Executor executor, C0608Bq bq, e eVar) {
        this.f7909b = executor;
        this.f7910c = bq;
        this.f7911d = eVar;
    }

    private final void J() {
        try {
            JSONObject a2 = this.f7910c.a(this.f7914g);
            if (this.f7908a != null) {
                this.f7909b.execute(new C0972Pq(this, a2));
            }
        } catch (JSONException e2) {
            fa.e("Failed to call video active view js", e2);
        }
    }

    public final void H() {
        this.f7912e = false;
    }

    public final void I() {
        this.f7912e = true;
        J();
    }

    public final void a(C2313on onVar) {
        this.f7908a = onVar;
    }

    public final void a(C2810vna vna) {
        this.f7914g.f6954a = this.f7913f ? false : vna.m;
        this.f7914g.f6957d = this.f7911d.b();
        this.f7914g.f6959f = vna;
        if (this.f7912e) {
            J();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(JSONObject jSONObject) {
        this.f7908a.b("AFMA_updateActiveView", jSONObject);
    }

    public final void f(boolean z) {
        this.f7913f = z;
    }
}
