package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import c.b.b.b.g.i;
import c.b.b.b.g.j;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.C0521a;
import com.google.android.gms.common.api.internal.C0522b;
import com.google.android.gms.common.api.internal.C0525e;
import com.google.android.gms.common.api.internal.C0533m;
import com.google.android.gms.common.api.internal.C0534n;
import com.google.android.gms.common.api.internal.F;
import com.google.android.gms.common.api.internal.z;
import com.google.android.gms.common.internal.C0548d;
import com.google.android.gms.common.internal.C0563t;
import java.util.Collection;
import java.util.Collections;

public class e<O extends a.d> implements g<O> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5770a;

    /* renamed from: b  reason: collision with root package name */
    private final a<O> f5771b;

    /* renamed from: c  reason: collision with root package name */
    private final O f5772c;

    /* renamed from: d  reason: collision with root package name */
    private final C0522b<O> f5773d;

    /* renamed from: e  reason: collision with root package name */
    private final Looper f5774e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5775f;

    /* renamed from: g  reason: collision with root package name */
    private final f f5776g;

    /* renamed from: h  reason: collision with root package name */
    private final C0533m f5777h;
    protected final C0525e i;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f5778a = new C0076a().a();

        /* renamed from: b  reason: collision with root package name */
        public final C0533m f5779b;

        /* renamed from: c  reason: collision with root package name */
        public final Looper f5780c;

        /* renamed from: com.google.android.gms.common.api.e$a$a  reason: collision with other inner class name */
        public static class C0076a {

            /* renamed from: a  reason: collision with root package name */
            private C0533m f5781a;

            /* renamed from: b  reason: collision with root package name */
            private Looper f5782b;

            public C0076a a(C0533m mVar) {
                C0563t.a(mVar, (Object) "StatusExceptionMapper must not be null.");
                this.f5781a = mVar;
                return this;
            }

            public a a() {
                if (this.f5781a == null) {
                    this.f5781a = new C0521a();
                }
                if (this.f5782b == null) {
                    this.f5782b = Looper.getMainLooper();
                }
                return new a(this.f5781a, this.f5782b);
            }
        }

        private a(C0533m mVar, Account account, Looper looper) {
            this.f5779b = mVar;
            this.f5780c = looper;
        }
    }

    public e(Context context, a<O> aVar, O o, a aVar2) {
        C0563t.a(context, (Object) "Null context is not permitted.");
        C0563t.a(aVar, (Object) "Api must not be null.");
        C0563t.a(aVar2, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f5770a = context.getApplicationContext();
        this.f5771b = aVar;
        this.f5772c = o;
        this.f5774e = aVar2.f5780c;
        this.f5773d = C0522b.a(this.f5771b, this.f5772c);
        this.f5776g = new z(this);
        this.i = C0525e.a(this.f5770a);
        this.f5775f = this.i.a();
        this.f5777h = aVar2.f5779b;
        this.i.a((e<?>) this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(android.content.Context r2, com.google.android.gms.common.api.a<O> r3, O r4, com.google.android.gms.common.api.internal.C0533m r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.a(r5)
            com.google.android.gms.common.api.e$a r5 = r0.a()
            r1.<init>((android.content.Context) r2, r3, r4, (com.google.android.gms.common.api.e.a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.e.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.m):void");
    }

    private final <TResult, A extends a.b> i<TResult> a(int i2, C0534n<A, TResult> nVar) {
        j jVar = new j();
        this.i.a(this, i2, nVar, jVar, this.f5777h);
        return jVar.a();
    }

    public <TResult, A extends a.b> i<TResult> a(C0534n<A, TResult> nVar) {
        return a(0, nVar);
    }

    public a.f a(Looper looper, C0525e.a<O> aVar) {
        return this.f5771b.b().a(this.f5770a, looper, a().a(), this.f5772c, (f.a) aVar, (f.b) aVar);
    }

    public F a(Context context, Handler handler) {
        return new F(context, handler, a().a());
    }

    /* access modifiers changed from: protected */
    public C0548d.a a() {
        Account account;
        GoogleSignInAccount b2;
        GoogleSignInAccount b3;
        C0548d.a aVar = new C0548d.a();
        O o = this.f5772c;
        if (!(o instanceof a.d.b) || (b3 = ((a.d.b) o).b()) == null) {
            O o2 = this.f5772c;
            account = o2 instanceof a.d.C0074a ? ((a.d.C0074a) o2).a() : null;
        } else {
            account = b3.g();
        }
        aVar.a(account);
        O o3 = this.f5772c;
        aVar.a((Collection<Scope>) (!(o3 instanceof a.d.b) || (b2 = ((a.d.b) o3).b()) == null) ? Collections.emptySet() : b2.w());
        aVar.a(this.f5770a.getClass().getName());
        aVar.b(this.f5770a.getPackageName());
        return aVar;
    }

    public <TResult, A extends a.b> i<TResult> b(C0534n<A, TResult> nVar) {
        return a(1, nVar);
    }

    public C0522b<O> b() {
        return this.f5773d;
    }

    public O c() {
        return this.f5772c;
    }

    public final int d() {
        return this.f5775f;
    }
}
