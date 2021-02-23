package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import c.b.b.b.b.C0254b;
import c.b.b.b.e.a.e;
import c.b.b.b.e.a.l;
import c.b.b.b.e.c;
import c.b.b.b.e.d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C0548d;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.C0565v;
import java.util.Set;

public final class F extends e implements f.a, f.b {

    /* renamed from: a  reason: collision with root package name */
    private static a.C0073a<? extends d, c.b.b.b.e.a> f5802a = c.f4680c;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5803b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f5804c;

    /* renamed from: d  reason: collision with root package name */
    private final a.C0073a<? extends d, c.b.b.b.e.a> f5805d;

    /* renamed from: e  reason: collision with root package name */
    private Set<Scope> f5806e;

    /* renamed from: f  reason: collision with root package name */
    private C0548d f5807f;

    /* renamed from: g  reason: collision with root package name */
    private d f5808g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public G f5809h;

    public F(Context context, Handler handler, C0548d dVar) {
        this(context, handler, dVar, f5802a);
    }

    public F(Context context, Handler handler, C0548d dVar, a.C0073a<? extends d, c.b.b.b.e.a> aVar) {
        this.f5803b = context;
        this.f5804c = handler;
        C0563t.a(dVar, (Object) "ClientSettings must not be null");
        this.f5807f = dVar;
        this.f5806e = dVar.g();
        this.f5805d = aVar;
    }

    /* access modifiers changed from: private */
    public final void b(l lVar) {
        C0254b g2 = lVar.g();
        if (g2.k()) {
            C0565v h2 = lVar.h();
            g2 = h2.h();
            if (!g2.k()) {
                String valueOf = String.valueOf(g2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
            } else {
                this.f5809h.a(h2.g(), this.f5806e);
                this.f5808g.e();
            }
        }
        this.f5809h.b(g2);
        this.f5808g.e();
    }

    public final void a(C0254b bVar) {
        this.f5809h.b(bVar);
    }

    public final void a(l lVar) {
        this.f5804c.post(new H(this, lVar));
    }

    public final void a(G g2) {
        d dVar = this.f5808g;
        if (dVar != null) {
            dVar.e();
        }
        this.f5807f.a(Integer.valueOf(System.identityHashCode(this)));
        a.C0073a<? extends d, c.b.b.b.e.a> aVar = this.f5805d;
        Context context = this.f5803b;
        Looper looper = this.f5804c.getLooper();
        C0548d dVar2 = this.f5807f;
        this.f5808g = (d) aVar.a(context, looper, dVar2, dVar2.h(), (f.a) this, (f.b) this);
        this.f5809h = g2;
        Set<Scope> set = this.f5806e;
        if (set == null || set.isEmpty()) {
            this.f5804c.post(new E(this));
        } else {
            this.f5808g.connect();
        }
    }

    public final void c() {
        d dVar = this.f5808g;
        if (dVar != null) {
            dVar.e();
        }
    }

    public final void d(int i) {
        this.f5808g.e();
    }

    public final void h(Bundle bundle) {
        this.f5808g.a(this);
    }
}
