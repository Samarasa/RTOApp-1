package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.fX  reason: case insensitive filesystem */
final class C1646fX implements Iterable<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ CharSequence f10409a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1575eX f10410b;

    C1646fX(C1575eX eXVar, CharSequence charSequence) {
        this.f10410b = eXVar;
        this.f10409a = charSequence;
    }

    public final Iterator<String> iterator() {
        return this.f10410b.b(this.f10409a);
    }

    public final String toString() {
        TW a2 = TW.a(", ");
        StringBuilder sb = new StringBuilder("[");
        a2.a(sb, iterator());
        sb.append(']');
        return sb.toString();
    }
}
