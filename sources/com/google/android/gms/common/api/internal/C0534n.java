package com.google.android.gms.common.api.internal;

import c.b.b.b.b.d;
import c.b.b.b.g.j;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.internal.C0563t;

/* renamed from: com.google.android.gms.common.api.internal.n  reason: case insensitive filesystem */
public abstract class C0534n<A extends a.b, ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final d[] f5880a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5881b;

    /* renamed from: com.google.android.gms.common.api.internal.n$a */
    public static class a<A extends a.b, ResultT> {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public C0532l<A, j<ResultT>> f5882a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f5883b;

        /* renamed from: c  reason: collision with root package name */
        private d[] f5884c;

        private a() {
            this.f5883b = true;
        }

        public a<A, ResultT> a(C0532l<A, j<ResultT>> lVar) {
            this.f5882a = lVar;
            return this;
        }

        public a<A, ResultT> a(boolean z) {
            this.f5883b = z;
            return this;
        }

        public a<A, ResultT> a(d... dVarArr) {
            this.f5884c = dVarArr;
            return this;
        }

        public C0534n<A, ResultT> a() {
            C0563t.a(this.f5882a != null, (Object) "execute parameter required");
            return new J(this, this.f5884c, this.f5883b);
        }
    }

    private C0534n(d[] dVarArr, boolean z) {
        this.f5880a = dVarArr;
        this.f5881b = z;
    }

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>();
    }

    /* access modifiers changed from: protected */
    public abstract void a(A a2, j<ResultT> jVar);

    public boolean b() {
        return this.f5881b;
    }

    public final d[] c() {
        return this.f5880a;
    }
}
