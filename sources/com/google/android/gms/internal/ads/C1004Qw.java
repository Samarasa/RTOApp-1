package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.q;
import com.google.android.gms.common.util.e;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Qw  reason: case insensitive filesystem */
public class C1004Qw {

    /* renamed from: a  reason: collision with root package name */
    private final Set<C3108zx<C1540dqa>> f8417a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<C3108zx<C2608su>> f8418b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<C3108zx<C0872Lu>> f8419c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<C3108zx<C2255nv>> f8420d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<C3108zx<C1900iv>> f8421e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<C3108zx<C2963xu>> f8422f;

    /* renamed from: g  reason: collision with root package name */
    private final Set<C3108zx<C0768Hu>> f8423g;

    /* renamed from: h  reason: collision with root package name */
    private final Set<C3108zx<com.google.android.gms.ads.h.a>> f8424h;
    private final Set<C3108zx<com.google.android.gms.ads.b.a>> i;
    private final Set<C3108zx<C0613Bv>> j;
    private final Set<C3108zx<q>> k;
    private final C2065lR l;
    private C2821vu m;
    private C1703gJ n;

    /* renamed from: com.google.android.gms.internal.ads.Qw$a */
    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public Set<C3108zx<C1540dqa>> f8425a = new HashSet();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public Set<C3108zx<C2608su>> f8426b = new HashSet();
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public Set<C3108zx<C0872Lu>> f8427c = new HashSet();
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public Set<C3108zx<C2255nv>> f8428d = new HashSet();
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public Set<C3108zx<C1900iv>> f8429e = new HashSet();
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public Set<C3108zx<C2963xu>> f8430f = new HashSet();
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public Set<C3108zx<com.google.android.gms.ads.h.a>> f8431g = new HashSet();
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public Set<C3108zx<com.google.android.gms.ads.b.a>> f8432h = new HashSet();
        /* access modifiers changed from: private */
        public Set<C3108zx<C0768Hu>> i = new HashSet();
        /* access modifiers changed from: private */
        public Set<C3108zx<C0613Bv>> j = new HashSet();
        /* access modifiers changed from: private */
        public Set<C3108zx<q>> k = new HashSet();
        /* access modifiers changed from: private */
        public C2065lR l;

        public final a a(com.google.android.gms.ads.b.a aVar, Executor executor) {
            this.f8432h.add(new C3108zx(aVar, executor));
            return this;
        }

        public final a a(com.google.android.gms.ads.h.a aVar, Executor executor) {
            this.f8431g.add(new C3108zx(aVar, executor));
            return this;
        }

        public final a a(q qVar, Executor executor) {
            this.k.add(new C3108zx(qVar, executor));
            return this;
        }

        public final a a(C0613Bv bv, Executor executor) {
            this.j.add(new C3108zx(bv, executor));
            return this;
        }

        public final a a(C0768Hu hu, Executor executor) {
            this.i.add(new C3108zx(hu, executor));
            return this;
        }

        public final a a(C0872Lu lu, Executor executor) {
            this.f8427c.add(new C3108zx(lu, executor));
            return this;
        }

        public final a a(C1540dqa dqa, Executor executor) {
            this.f8425a.add(new C3108zx(dqa, executor));
            return this;
        }

        public final a a(C1900iv ivVar, Executor executor) {
            this.f8429e.add(new C3108zx(ivVar, executor));
            return this;
        }

        public final a a(C2065lR lRVar) {
            this.l = lRVar;
            return this;
        }

        public final a a(C2255nv nvVar, Executor executor) {
            this.f8428d.add(new C3108zx(nvVar, executor));
            return this;
        }

        public final a a(C2322ora ora, Executor executor) {
            if (this.f8432h != null) {
                MK mk = new MK();
                mk.a(ora);
                this.f8432h.add(new C3108zx(mk, executor));
            }
            return this;
        }

        public final a a(C2608su suVar, Executor executor) {
            this.f8426b.add(new C3108zx(suVar, executor));
            return this;
        }

        public final a a(C2963xu xuVar, Executor executor) {
            this.f8430f.add(new C3108zx(xuVar, executor));
            return this;
        }

        public final C1004Qw a() {
            return new C1004Qw(this);
        }
    }

    private C1004Qw(a aVar) {
        this.f8417a = aVar.f8425a;
        this.f8419c = aVar.f8427c;
        this.f8420d = aVar.f8428d;
        this.f8418b = aVar.f8426b;
        this.f8421e = aVar.f8429e;
        this.f8422f = aVar.f8430f;
        this.f8423g = aVar.i;
        this.f8424h = aVar.f8431g;
        this.i = aVar.f8432h;
        this.j = aVar.j;
        this.l = aVar.l;
        this.k = aVar.k;
    }

    public final C1703gJ a(e eVar, C1845iJ iJVar, C3048zH zHVar) {
        if (this.n == null) {
            this.n = new C1703gJ(eVar, iJVar, zHVar);
        }
        return this.n;
    }

    public final C2821vu a(Set<C3108zx<C2963xu>> set) {
        if (this.m == null) {
            this.m = new C2821vu(set);
        }
        return this.m;
    }

    public final Set<C3108zx<C2608su>> a() {
        return this.f8418b;
    }

    public final Set<C3108zx<C1900iv>> b() {
        return this.f8421e;
    }

    public final Set<C3108zx<C2963xu>> c() {
        return this.f8422f;
    }

    public final Set<C3108zx<C0768Hu>> d() {
        return this.f8423g;
    }

    public final Set<C3108zx<com.google.android.gms.ads.h.a>> e() {
        return this.f8424h;
    }

    public final Set<C3108zx<com.google.android.gms.ads.b.a>> f() {
        return this.i;
    }

    public final Set<C3108zx<C1540dqa>> g() {
        return this.f8417a;
    }

    public final Set<C3108zx<C0872Lu>> h() {
        return this.f8419c;
    }

    public final Set<C3108zx<C2255nv>> i() {
        return this.f8420d;
    }

    public final Set<C3108zx<C0613Bv>> j() {
        return this.j;
    }

    public final Set<C3108zx<q>> k() {
        return this.k;
    }

    public final C2065lR l() {
        return this.l;
    }
}
