package com.google.firebase.auth.a.a;

import c.b.b.b.d.d.C0273ia;
import c.b.b.b.d.d.la;
import c.b.b.b.d.d.na;
import c.b.b.b.d.d.ra;
import c.b.b.b.d.d.ya;
import c.b.d.e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0563t;
import com.google.firebase.auth.C3277b;
import com.google.firebase.auth.C3306p;
import com.google.firebase.auth.C3313x;
import com.google.firebase.auth.internal.C3291g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

abstract class ba<ResultT, CallbackT> implements C3256e<N, ResultT> {

    /* renamed from: a  reason: collision with root package name */
    protected final int f14302a;

    /* renamed from: b  reason: collision with root package name */
    final da f14303b = new da(this);

    /* renamed from: c  reason: collision with root package name */
    protected e f14304c;

    /* renamed from: d  reason: collision with root package name */
    protected C3306p f14305d;

    /* renamed from: e  reason: collision with root package name */
    protected CallbackT f14306e;

    /* renamed from: f  reason: collision with root package name */
    protected C3291g f14307f;

    /* renamed from: g  reason: collision with root package name */
    protected ca<ResultT> f14308g;

    /* renamed from: h  reason: collision with root package name */
    protected final List<C3313x> f14309h = new ArrayList();
    protected Executor i;
    protected ra j;
    protected na k;
    protected la l;
    protected ya m;
    protected String n;
    protected String o;
    protected C3277b p;
    protected String q;
    protected String r;
    protected C0273ia s;
    protected boolean t;
    protected boolean u;
    /* access modifiers changed from: private */
    public boolean v;
    boolean w;
    private ResultT x;
    private Status y;

    public ba(int i2) {
        this.f14302a = i2;
    }

    /* access modifiers changed from: private */
    public final void b(Status status) {
        C3291g gVar = this.f14307f;
        if (gVar != null) {
            gVar.a(status);
        }
    }

    /* access modifiers changed from: private */
    public final void d() {
        c();
        C0563t.b(this.v, "no success or failure set on method implementation");
    }

    public final ba<ResultT, CallbackT> a(e eVar) {
        C0563t.a(eVar, (Object) "firebaseApp cannot be null");
        this.f14304c = eVar;
        return this;
    }

    public final ba<ResultT, CallbackT> a(C3291g gVar) {
        C0563t.a(gVar, (Object) "external failure callback cannot be null");
        this.f14307f = gVar;
        return this;
    }

    public final ba<ResultT, CallbackT> a(C3306p pVar) {
        C0563t.a(pVar, (Object) "firebaseUser cannot be null");
        this.f14305d = pVar;
        return this;
    }

    public final ba<ResultT, CallbackT> a(CallbackT callbackt) {
        C0563t.a(callbackt, (Object) "external callback cannot be null");
        this.f14306e = callbackt;
        return this;
    }

    public final void a(Status status) {
        this.v = true;
        this.w = false;
        this.y = status;
        this.f14308g.a(null, status);
    }

    public final void b(ResultT resultt) {
        this.v = true;
        this.w = true;
        this.x = resultt;
        this.f14308g.a(resultt, (Status) null);
    }

    public abstract void c();

    public final C3256e<N, ResultT> e() {
        this.u = true;
        return this;
    }

    public final C3256e<N, ResultT> l() {
        this.t = true;
        return this;
    }
}
