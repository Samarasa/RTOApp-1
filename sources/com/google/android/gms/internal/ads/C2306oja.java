package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* renamed from: com.google.android.gms.internal.ads.oja  reason: case insensitive filesystem */
final class C2306oja extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AudioTrack f11617a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2093lja f11618b;

    C2306oja(C2093lja lja, AudioTrack audioTrack) {
        this.f11618b = lja;
        this.f11617a = audioTrack;
    }

    public final void run() {
        try {
            this.f11617a.flush();
            this.f11617a.release();
        } finally {
            this.f11618b.f11229f.open();
        }
    }
}
