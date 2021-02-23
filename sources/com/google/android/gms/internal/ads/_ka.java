package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

final class _ka implements C1318ala {
    private _ka() {
    }

    public final MediaCodecInfo a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    public final boolean a() {
        return false;
    }

    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }

    public final int b() {
        return MediaCodecList.getCodecCount();
    }
}
