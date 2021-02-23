package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* renamed from: com.google.android.gms.internal.ads.wl  reason: case insensitive filesystem */
final class C2876wl implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ MediaPlayer f12677a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2734ul f12678b;

    C2876wl(C2734ul ulVar, MediaPlayer mediaPlayer) {
        this.f12678b = ulVar;
        this.f12677a = mediaPlayer;
    }

    public final void run() {
        this.f12678b.a(this.f12677a);
        if (this.f12678b.s != null) {
            this.f12678b.s.a();
        }
    }
}
