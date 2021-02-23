package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.m  reason: case insensitive filesystem */
final class C3182m implements Iterator<String> {

    /* renamed from: a  reason: collision with root package name */
    private Iterator<String> f13667a = this.f13668b.f13681a.keySet().iterator();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C3187n f13668b;

    C3182m(C3187n nVar) {
        this.f13668b = nVar;
    }

    public final boolean hasNext() {
        return this.f13667a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f13667a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
