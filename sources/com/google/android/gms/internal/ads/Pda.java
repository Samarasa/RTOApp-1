package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class Pda implements Sda {
    private Pda() {
    }

    /* synthetic */ Pda(Oda oda) {
        this();
    }

    public final byte[] a(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }
}
