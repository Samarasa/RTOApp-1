package com.google.android.gms.internal.ads;

final class JX<K> extends BX<K> {

    /* renamed from: c  reason: collision with root package name */
    private final transient C2993yX<K, ?> f7424c;

    /* renamed from: d  reason: collision with root package name */
    private final transient C2709uX<K> f7425d;

    JX(C2993yX<K, ?> yXVar, C2709uX<K> uXVar) {
        this.f7424c = yXVar;
        this.f7425d = uXVar;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object[] objArr, int i) {
        return g().a(objArr, i);
    }

    /* renamed from: c */
    public final QX<K> iterator() {
        return (QX) g().iterator();
    }

    public final boolean contains(Object obj) {
        return this.f7424c.get(obj) != null;
    }

    public final C2709uX<K> g() {
        return this.f7425d;
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        return true;
    }

    public final int size() {
        return this.f7424c.size();
    }
}
