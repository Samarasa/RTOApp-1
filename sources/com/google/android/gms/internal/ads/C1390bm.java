package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@TargetApi(14)
/* renamed from: com.google.android.gms.internal.ads.bm  reason: case insensitive filesystem */
public final class C1390bm implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final AudioManager f9957a;

    /* renamed from: b  reason: collision with root package name */
    private final C1319am f9958b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9959c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9960d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9961e;

    /* renamed from: f  reason: collision with root package name */
    private float f9962f = 1.0f;

    public C1390bm(Context context, C1319am amVar) {
        this.f9957a = (AudioManager) context.getSystemService("audio");
        this.f9958b = amVar;
    }

    private final void d() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        boolean z4 = this.f9960d && !this.f9961e && this.f9962f > 0.0f;
        if (z4 && !(z2 = this.f9959c)) {
            AudioManager audioManager = this.f9957a;
            if (audioManager != null && !z2) {
                if (audioManager.requestAudioFocus(this, 3, 2) == 1) {
                    z3 = true;
                }
                this.f9959c = z3;
            }
            this.f9958b.a();
        } else if (!z4 && (z = this.f9959c)) {
            AudioManager audioManager2 = this.f9957a;
            if (audioManager2 != null && z) {
                if (audioManager2.abandonAudioFocus(this) == 0) {
                    z3 = true;
                }
                this.f9959c = z3;
            }
            this.f9958b.a();
        }
    }

    public final float a() {
        float f2 = this.f9961e ? 0.0f : this.f9962f;
        if (this.f9959c) {
            return f2;
        }
        return 0.0f;
    }

    public final void a(float f2) {
        this.f9962f = f2;
        d();
    }

    public final void a(boolean z) {
        this.f9961e = z;
        d();
    }

    public final void b() {
        this.f9960d = true;
        d();
    }

    public final void c() {
        this.f9960d = false;
        d();
    }

    public final void onAudioFocusChange(int i) {
        this.f9959c = i > 0;
        this.f9958b.a();
    }
}
