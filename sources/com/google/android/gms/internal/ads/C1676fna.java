package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.os.Handler;

@TargetApi(23)
/* renamed from: com.google.android.gms.internal.ads.fna  reason: case insensitive filesystem */
final class C1676fna implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1322ana f10456a;

    private C1676fna(C1322ana ana, MediaCodec mediaCodec) {
        this.f10456a = ana;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        C1322ana ana = this.f10456a;
        if (this == ana.za) {
            ana.p();
        }
    }
}
