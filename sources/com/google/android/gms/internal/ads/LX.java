package com.google.android.gms.internal.ads;

final class LX<E> extends BX<E> {

    /* renamed from: c  reason: collision with root package name */
    static final LX<Object> f7679c = new LX(new Object[0], 0, (Object[]) null, 0, 0);

    /* renamed from: d  reason: collision with root package name */
    private final transient Object[] f7680d;

    /* renamed from: e  reason: collision with root package name */
    private final transient Object[] f7681e;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f7682f;

    /* renamed from: g  reason: collision with root package name */
    private final transient int f7683g;

    /* renamed from: h  reason: collision with root package name */
    private final transient int f7684h;

    LX(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f7680d = objArr;
        this.f7681e = objArr2;
        this.f7682f = i2;
        this.f7683g = i;
        this.f7684h = i3;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.f7680d, 0, objArr, i, this.f7684h);
        return i + this.f7684h;
    }

    /* renamed from: c */
    public final QX<E> iterator() {
        return (QX) g().iterator();
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.f7681e;
        if (obj == null || objArr == null) {
            return false;
        }
        int a2 = C2426qX.a(obj == null ? 0 : obj.hashCode());
        while (true) {
            int i = a2 & this.f7682f;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a2 = i + 1;
        }
    }

    /* access modifiers changed from: package-private */
    public final Object[] d() {
        return this.f7680d;
    }

    /* access modifiers changed from: package-private */
    public final int e() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int f() {
        return this.f7684h;
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return this.f7683g;
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final C2709uX<E> j() {
        return C2709uX.b(this.f7680d, this.f7684h);
    }

    public final int size() {
        return this.f7684h;
    }
}
