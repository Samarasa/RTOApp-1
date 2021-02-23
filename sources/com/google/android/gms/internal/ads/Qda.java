package com.google.android.gms.internal.ads;

abstract class Qda implements Vda {
    Qda() {
    }

    public /* synthetic */ Object next() {
        return Byte.valueOf(nextByte());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
