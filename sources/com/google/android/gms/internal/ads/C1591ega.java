package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ega  reason: case insensitive filesystem */
abstract class C1591ega {
    C1591ega() {
    }

    /* access modifiers changed from: package-private */
    public abstract int a(int i, byte[] bArr, int i2, int i3);

    /* access modifiers changed from: package-private */
    public abstract int a(CharSequence charSequence, byte[] bArr, int i, int i2);

    /* access modifiers changed from: package-private */
    public final boolean a(byte[] bArr, int i, int i2) {
        return a(0, bArr, i, i2) == 0;
    }

    /* access modifiers changed from: package-private */
    public abstract String b(byte[] bArr, int i, int i2);
}
