package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
/* renamed from: com.google.android.gms.internal.ads.qja  reason: case insensitive filesystem */
final class C2448qja extends C2235nja {
    private final AudioTimestamp j = new AudioTimestamp();
    private long k;
    private long l;
    private long m;

    public C2448qja() {
        super((C2306oja) null);
    }

    public final void a(AudioTrack audioTrack, boolean z) {
        super.a(audioTrack, z);
        this.k = 0;
        this.l = 0;
        this.m = 0;
    }

    public final boolean d() {
        boolean timestamp = this.f11491a.getTimestamp(this.j);
        if (timestamp) {
            long j2 = this.j.framePosition;
            if (this.l > j2) {
                this.k++;
            }
            this.l = j2;
            this.m = j2 + (this.k << 32);
        }
        return timestamp;
    }

    public final long e() {
        return this.j.nanoTime;
    }

    public final long f() {
        return this.m;
    }
}
