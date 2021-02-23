package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

public final class Eja {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f6735a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f6736b;

    /* renamed from: c  reason: collision with root package name */
    private int f6737c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f6738d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f6739e;

    /* renamed from: f  reason: collision with root package name */
    private int f6740f;

    /* renamed from: g  reason: collision with root package name */
    private int f6741g;

    /* renamed from: h  reason: collision with root package name */
    private int f6742h;
    private final MediaCodec.CryptoInfo i;
    private final Gja j;

    public Eja() {
        this.i = Tma.f8821a >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.j = Tma.f8821a >= 24 ? new Gja(this.i) : null;
    }

    @TargetApi(16)
    public final MediaCodec.CryptoInfo a() {
        return this.i;
    }

    public final void a(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3) {
        this.f6740f = i2;
        this.f6738d = iArr;
        this.f6739e = iArr2;
        this.f6736b = bArr;
        this.f6735a = bArr2;
        this.f6737c = i3;
        this.f6741g = 0;
        this.f6742h = 0;
        int i4 = Tma.f8821a;
        if (i4 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.i;
            cryptoInfo.numSubSamples = this.f6740f;
            cryptoInfo.numBytesOfClearData = this.f6738d;
            cryptoInfo.numBytesOfEncryptedData = this.f6739e;
            cryptoInfo.key = this.f6736b;
            cryptoInfo.iv = this.f6735a;
            cryptoInfo.mode = this.f6737c;
            if (i4 >= 24) {
                this.j.a(0, 0);
            }
        }
    }
}
