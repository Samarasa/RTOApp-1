package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.util.oa;
import java.util.concurrent.TimeUnit;

@TargetApi(14)
/* renamed from: com.google.android.gms.internal.ads.Rl  reason: case insensitive filesystem */
public final class C1019Rl {

    /* renamed from: a  reason: collision with root package name */
    private final long f8528a = TimeUnit.MILLISECONDS.toNanos(((Long) Qqa.e().a(F.x)).longValue());

    /* renamed from: b  reason: collision with root package name */
    private long f8529b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8530c = true;

    C1019Rl() {
    }

    public final void a() {
        this.f8530c = true;
    }

    public final void a(SurfaceTexture surfaceTexture, C0681El el) {
        if (el != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.f8530c || Math.abs(timestamp - this.f8529b) >= this.f8528a) {
                this.f8530c = false;
                this.f8529b = timestamp;
                oa.f5628a.post(new C0993Ql(this, el));
            }
        }
    }
}
