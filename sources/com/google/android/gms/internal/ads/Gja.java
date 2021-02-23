package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

@TargetApi(24)
final class Gja {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec.CryptoInfo f7068a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaCodec.CryptoInfo.Pattern f7069b;

    private Gja(MediaCodec.CryptoInfo cryptoInfo) {
        this.f7068a = cryptoInfo;
        this.f7069b = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    /* access modifiers changed from: private */
    public final void a(int i, int i2) {
        this.f7069b.set(0, 0);
        this.f7068a.setPattern(this.f7069b);
    }
}
