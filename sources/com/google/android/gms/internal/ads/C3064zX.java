package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zX  reason: case insensitive filesystem */
final class C3064zX extends C2709uX<E> {

    /* renamed from: c  reason: collision with root package name */
    private final transient int f13061c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f13062d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C2709uX f13063e;

    C3064zX(C2709uX uXVar, int i, int i2) {
        this.f13063e = uXVar;
        this.f13061c = i;
        this.f13062d = i2;
    }

    /* renamed from: a */
    public final C2709uX<E> subList(int i, int i2) {
        C1434cX.a(i, i2, this.f13062d);
        C2709uX uXVar = this.f13063e;
        int i3 = this.f13061c;
        return (C2709uX) uXVar.subList(i + i3, i2 + i3);
    }

    /* access modifiers changed from: package-private */
    public final Object[] d() {
        return this.f13063e.d();
    }

    /* access modifiers changed from: package-private */
    public final int e() {
        return this.f13063e.e() + this.f13061c;
    }

    /* access modifiers changed from: package-private */
    public final int f() {
        return this.f13063e.e() + this.f13061c + this.f13062d;
    }

    public final E get(int i) {
        C1434cX.a(i, this.f13062d);
        return this.f13063e.get(i + this.f13061c);
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        return true;
    }

    public final int size() {
        return this.f13062d;
    }
}
