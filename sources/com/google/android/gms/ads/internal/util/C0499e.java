package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: com.google.android.gms.ads.internal.util.e  reason: case insensitive filesystem */
public final class C0499e {

    /* renamed from: a  reason: collision with root package name */
    private boolean f5580a = false;

    /* renamed from: b  reason: collision with root package name */
    private float f5581b = 1.0f;

    public static float a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return ((float) streamVolume) / ((float) streamMaxVolume);
    }

    private final synchronized boolean c() {
        return this.f5581b >= 0.0f;
    }

    public final synchronized float a() {
        if (!c()) {
            return 1.0f;
        }
        return this.f5581b;
    }

    public final synchronized void a(float f2) {
        this.f5581b = f2;
    }

    public final synchronized void a(boolean z) {
        this.f5580a = z;
    }

    public final synchronized boolean b() {
        return this.f5580a;
    }
}
