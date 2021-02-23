package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.yfa  reason: case insensitive filesystem */
final class C3007yfa extends Qda {

    /* renamed from: a  reason: collision with root package name */
    private final Afa f12947a = new Afa(this.f12949c, (C3007yfa) null);

    /* renamed from: b  reason: collision with root package name */
    private Vda f12948b = a();

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C3078zfa f12949c;

    C3007yfa(C3078zfa zfa) {
        this.f12949c = zfa;
    }

    private final Vda a() {
        if (this.f12947a.hasNext()) {
            return (Vda) ((Xda) this.f12947a.next()).iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.f12948b != null;
    }

    public final byte nextByte() {
        Vda vda = this.f12948b;
        if (vda != null) {
            byte nextByte = vda.nextByte();
            if (!this.f12948b.hasNext()) {
                this.f12948b = a();
            }
            return nextByte;
        }
        throw new NoSuchElementException();
    }
}
