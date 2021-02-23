package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.i  reason: case insensitive filesystem */
public final class C0529i<L> {

    /* renamed from: a  reason: collision with root package name */
    private final L f5878a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5879b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0529i)) {
            return false;
        }
        C0529i iVar = (C0529i) obj;
        return this.f5878a == iVar.f5878a && this.f5879b.equals(iVar.f5879b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f5878a) * 31) + this.f5879b.hashCode();
    }
}
