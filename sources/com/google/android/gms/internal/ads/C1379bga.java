package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.bga  reason: case insensitive filesystem */
final class C1379bga implements Iterator<String> {

    /* renamed from: a  reason: collision with root package name */
    private Iterator<String> f9943a = this.f9944b.f9678a.iterator();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ _fa f9944b;

    C1379bga(_fa _fa) {
        this.f9944b = _fa;
    }

    public final boolean hasNext() {
        return this.f9943a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f9943a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
