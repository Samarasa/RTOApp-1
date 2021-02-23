package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.nja  reason: case insensitive filesystem */
class C2235nja {

    /* renamed from: a  reason: collision with root package name */
    protected AudioTrack f11491a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f11492b;

    /* renamed from: c  reason: collision with root package name */
    private int f11493c;

    /* renamed from: d  reason: collision with root package name */
    private long f11494d;

    /* renamed from: e  reason: collision with root package name */
    private long f11495e;

    /* renamed from: f  reason: collision with root package name */
    private long f11496f;

    /* renamed from: g  reason: collision with root package name */
    private long f11497g;

    /* renamed from: h  reason: collision with root package name */
    private long f11498h;
    private long i;

    private C2235nja() {
    }

    /* synthetic */ C2235nja(C2306oja oja) {
        this();
    }

    public final void a() {
        if (this.f11497g == -9223372036854775807L) {
            this.f11491a.pause();
        }
    }

    public final void a(long j) {
        this.f11498h = b();
        this.f11497g = SystemClock.elapsedRealtime() * 1000;
        this.i = j;
        this.f11491a.stop();
    }

    public void a(AudioTrack audioTrack, boolean z) {
        this.f11491a = audioTrack;
        this.f11492b = z;
        this.f11497g = -9223372036854775807L;
        this.f11494d = 0;
        this.f11495e = 0;
        this.f11496f = 0;
        if (audioTrack != null) {
            this.f11493c = audioTrack.getSampleRate();
        }
    }

    public final long b() {
        if (this.f11497g != -9223372036854775807L) {
            return Math.min(this.i, this.f11498h + ((((SystemClock.elapsedRealtime() * 1000) - this.f11497g) * ((long) this.f11493c)) / 1000000));
        }
        int playState = this.f11491a.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) this.f11491a.getPlaybackHeadPosition());
        if (this.f11492b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f11496f = this.f11494d;
            }
            playbackHeadPosition += this.f11496f;
        }
        if (this.f11494d > playbackHeadPosition) {
            this.f11495e++;
        }
        this.f11494d = playbackHeadPosition;
        return playbackHeadPosition + (this.f11495e << 32);
    }

    public final long c() {
        return (b() * 1000000) / ((long) this.f11493c);
    }

    public boolean d() {
        return false;
    }

    public long e() {
        throw new UnsupportedOperationException();
    }

    public long f() {
        throw new UnsupportedOperationException();
    }
}
