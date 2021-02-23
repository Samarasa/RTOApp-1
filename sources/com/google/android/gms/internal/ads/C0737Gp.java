package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.b;

/* renamed from: com.google.android.gms.internal.ads.Gp  reason: case insensitive filesystem */
public class C0737Gp {

    /* renamed from: a  reason: collision with root package name */
    private a f7092a;

    /* renamed from: com.google.android.gms.internal.ads.Gp$a */
    public static abstract class a {
        public abstract C1228Zm a();

        public abstract C0733Gl b();

        public abstract Woa c();

        public abstract C0887Mj d();

        public abstract C0651Dh e();

        public abstract C2651tf f();

        public abstract C2216na g();
    }

    public C0737Gp(a aVar) {
        this.f7092a = aVar;
    }

    public final C0887Mj a() {
        return this.f7092a.d();
    }

    public final C0651Dh b() {
        return this.f7092a.e();
    }

    public final C2651tf c() {
        return this.f7092a.f();
    }

    public final C2216na d() {
        return this.f7092a.g();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.Hj, com.google.android.gms.internal.ads.Nj] */
    public final b e() {
        a aVar = this.f7092a;
        return new b(aVar.a(), aVar.b(), new C0757Hj(aVar.d()), aVar.c(), aVar.e(), aVar.g());
    }
}
