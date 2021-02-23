package com.google.android.gms.internal.ads;

public final class Tca {

    /* renamed from: a  reason: collision with root package name */
    private final C1939jda f8801a;

    /* renamed from: b  reason: collision with root package name */
    private final C1939jda f8802b;

    public Tca(byte[] bArr, byte[] bArr2) {
        this.f8801a = C1939jda.a(bArr);
        this.f8802b = C1939jda.a(bArr2);
    }

    public final byte[] a() {
        C1939jda jda = this.f8801a;
        if (jda == null) {
            return null;
        }
        return jda.a();
    }

    public final byte[] b() {
        C1939jda jda = this.f8802b;
        if (jda == null) {
            return null;
        }
        return jda.a();
    }
}
