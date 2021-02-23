package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public abstract class Hga extends Fga implements C1182Xs {
    private int l;
    private int m;

    protected Hga(String str) {
        super(str);
    }

    public final int b() {
        if (!this.f6882d) {
            a();
        }
        return this.l;
    }

    /* access modifiers changed from: protected */
    public final long b(ByteBuffer byteBuffer) {
        this.l = C2962xt.a(byteBuffer.get());
        this.m = (C2962xt.b(byteBuffer) << 8) + 0 + C2962xt.a(byteBuffer.get());
        return 4;
    }
}
