package com.google.android.gms.internal.ads;

final class Tda extends Wda {

    /* renamed from: f  reason: collision with root package name */
    private final int f8803f;

    /* renamed from: g  reason: collision with root package name */
    private final int f8804g;

    Tda(byte[] bArr, int i, int i2) {
        super(bArr);
        Lda.c(i, i + i2, bArr.length);
        this.f8803f = i;
        this.f8804g = i2;
    }

    /* access modifiers changed from: protected */
    public final void b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f9150e, l() + i, bArr, i2, i3);
    }

    public final byte j(int i) {
        Lda.b(i, size());
        return this.f9150e[this.f8803f + i];
    }

    /* access modifiers changed from: package-private */
    public final byte k(int i) {
        return this.f9150e[this.f8803f + i];
    }

    /* access modifiers changed from: protected */
    public final int l() {
        return this.f8803f;
    }

    public final int size() {
        return this.f8804g;
    }
}
