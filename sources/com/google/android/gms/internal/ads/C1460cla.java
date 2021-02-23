package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

@TargetApi(21)
/* renamed from: com.google.android.gms.internal.ads.cla  reason: case insensitive filesystem */
final class C1460cla implements C1318ala {

    /* renamed from: a  reason: collision with root package name */
    private final int f10075a;

    /* renamed from: b  reason: collision with root package name */
    private MediaCodecInfo[] f10076b;

    public C1460cla(boolean z) {
        this.f10075a = z ? 1 : 0;
    }

    private final void c() {
        if (this.f10076b == null) {
            this.f10076b = new MediaCodecList(this.f10075a).getCodecInfos();
        }
    }

    public final MediaCodecInfo a(int i) {
        c();
        return this.f10076b[i];
    }

    public final boolean a() {
        return true;
    }

    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public final int b() {
        c();
        return this.f10076b.length;
    }
}
