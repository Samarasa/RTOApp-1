package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.fa;
import com.google.android.gms.ads.internal.util.oa;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@TargetApi(14)
/* renamed from: com.google.android.gms.internal.ads.ul  reason: case insensitive filesystem */
public final class C2734ul extends C0759Hl implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Integer, String> f12389c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final C1175Xl f12390d;

    /* renamed from: e  reason: collision with root package name */
    private final C1253_l f12391e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f12392f;

    /* renamed from: g  reason: collision with root package name */
    private int f12393g = 0;

    /* renamed from: h  reason: collision with root package name */
    private int f12394h = 0;
    private MediaPlayer i;
    private Uri j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private C1123Vl p;
    private boolean q;
    private int r;
    /* access modifiers changed from: private */
    public C0681El s;
    private Integer t = null;

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            f12389c.put(-1004, "MEDIA_ERROR_IO");
            f12389c.put(-1007, "MEDIA_ERROR_MALFORMED");
            f12389c.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            f12389c.put(-110, "MEDIA_ERROR_TIMED_OUT");
            f12389c.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        f12389c.put(100, "MEDIA_ERROR_SERVER_DIED");
        f12389c.put(1, "MEDIA_ERROR_UNKNOWN");
        f12389c.put(1, "MEDIA_INFO_UNKNOWN");
        f12389c.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        f12389c.put(701, "MEDIA_INFO_BUFFERING_START");
        f12389c.put(702, "MEDIA_INFO_BUFFERING_END");
        f12389c.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        f12389c.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        f12389c.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (Build.VERSION.SDK_INT >= 19) {
            f12389c.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            f12389c.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public C2734ul(Context context, C1175Xl xl, boolean z, boolean z2, C1201Yl yl, C1253_l _lVar) {
        super(context);
        setSurfaceTextureListener(this);
        this.f12390d = xl;
        this.f12391e = _lVar;
        this.q = z;
        this.f12392f = z2;
        this.f12391e.a(this);
    }

    private final void a(float f2) {
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f2, f2);
            } catch (IllegalStateException unused) {
            }
        } else {
            C1018Rk.d("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    /* access modifiers changed from: private */
    public final void a(MediaPlayer mediaPlayer) {
        MediaPlayer.TrackInfo[] trackInfo;
        String string;
        String str;
        MediaFormat format;
        if (((Boolean) Qqa.e().a(F.vb)).booleanValue() && this.f12390d != null && mediaPlayer != null && Build.VERSION.SDK_INT >= 19 && (trackInfo = mediaPlayer.getTrackInfo()) != null) {
            HashMap hashMap = new HashMap();
            for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                if (trackInfo2 != null) {
                    int trackType = trackInfo2.getTrackType();
                    if (trackType == 1) {
                        MediaFormat format2 = trackInfo2.getFormat();
                        if (format2 != null) {
                            if (format2.containsKey("frame-rate")) {
                                try {
                                    hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                } catch (ClassCastException unused) {
                                    hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                }
                            }
                            if (format2.containsKey("bitrate")) {
                                this.t = Integer.valueOf(format2.getInteger("bitrate"));
                                hashMap.put("bitRate", String.valueOf(this.t));
                            }
                            if (format2.containsKey("width") && format2.containsKey("height")) {
                                int integer = format2.getInteger("width");
                                int integer2 = format2.getInteger("height");
                                StringBuilder sb = new StringBuilder(23);
                                sb.append(integer);
                                sb.append("x");
                                sb.append(integer2);
                                hashMap.put("resolution", sb.toString());
                            }
                            if (format2.containsKey("mime")) {
                                hashMap.put("videoMime", format2.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                string = format2.getString("codecs-string");
                                str = "videoCodec";
                            }
                        }
                    } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                        if (format.containsKey("mime")) {
                            hashMap.put("audioMime", format.getString("mime"));
                        }
                        if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                            string = format.getString("codecs-string");
                            str = "audioCodec";
                        }
                    }
                    hashMap.put(str, string);
                }
            }
            if (!hashMap.isEmpty()) {
                this.f12390d.a("onMetadataEvent", (Map<String, ?>) hashMap);
            }
        }
    }

    private final void a(boolean z) {
        fa.f("AdMediaPlayerView release");
        C1123Vl vl = this.p;
        if (vl != null) {
            vl.b();
            this.p = null;
        }
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.i.release();
            this.i = null;
            i(0);
            if (z) {
                this.f12394h = 0;
                this.f12394h = 0;
            }
        }
    }

    private final void i() {
        fa.f("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.j != null && surfaceTexture != null) {
            a(false);
            try {
                p.s();
                this.i = new MediaPlayer();
                this.i.setOnBufferingUpdateListener(this);
                this.i.setOnCompletionListener(this);
                this.i.setOnErrorListener(this);
                this.i.setOnInfoListener(this);
                this.i.setOnPreparedListener(this);
                this.i.setOnVideoSizeChangedListener(this);
                this.m = 0;
                if (this.q) {
                    this.p = new C1123Vl(getContext());
                    this.p.a(surfaceTexture, getWidth(), getHeight());
                    this.p.start();
                    SurfaceTexture c2 = this.p.c();
                    if (c2 != null) {
                        surfaceTexture = c2;
                    } else {
                        this.p.b();
                        this.p = null;
                    }
                }
                this.i.setDataSource(getContext(), this.j);
                p.t();
                this.i.setSurface(new Surface(surfaceTexture));
                this.i.setAudioStreamType(3);
                this.i.setScreenOnWhilePlaying(true);
                this.i.prepareAsync();
                i(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e2) {
                String valueOf = String.valueOf(this.j);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Failed to initialize MediaPlayer at ");
                sb.append(valueOf);
                C1018Rk.c(sb.toString(), e2);
                onError(this.i, 1, 0);
            }
        }
    }

    private final void i(int i2) {
        if (i2 == 3) {
            this.f12391e.b();
            this.f7197b.b();
        } else if (this.f12393g == 3) {
            this.f12391e.c();
            this.f7197b.c();
        }
        this.f12393g = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034 A[LOOP:0: B:10:0x0034->B:15:0x004f, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void j() {
        /*
            r8 = this;
            boolean r0 = r8.f12392f
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r8.k()
            if (r0 == 0) goto L_0x0059
            android.media.MediaPlayer r0 = r8.i
            int r0 = r0.getCurrentPosition()
            if (r0 <= 0) goto L_0x0059
            int r0 = r8.f12394h
            r1 = 3
            if (r0 == r1) goto L_0x0059
            java.lang.String r0 = "AdMediaPlayerView nudging MediaPlayer"
            com.google.android.gms.ads.internal.util.fa.f(r0)
            r0 = 0
            r8.a((float) r0)
            android.media.MediaPlayer r0 = r8.i
            r0.start()
            android.media.MediaPlayer r0 = r8.i
            int r0 = r0.getCurrentPosition()
            com.google.android.gms.common.util.e r1 = com.google.android.gms.ads.internal.p.j()
            long r1 = r1.a()
        L_0x0034:
            boolean r3 = r8.k()
            if (r3 == 0) goto L_0x0051
            android.media.MediaPlayer r3 = r8.i
            int r3 = r3.getCurrentPosition()
            if (r3 != r0) goto L_0x0051
            com.google.android.gms.common.util.e r3 = com.google.android.gms.ads.internal.p.j()
            long r3 = r3.a()
            long r3 = r3 - r1
            r5 = 250(0xfa, double:1.235E-321)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0034
        L_0x0051:
            android.media.MediaPlayer r0 = r8.i
            r0.pause()
            r8.a()
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2734ul.j():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f12393g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean k() {
        /*
            r2 = this;
            android.media.MediaPlayer r0 = r2.i
            if (r0 == 0) goto L_0x000f
            int r0 = r2.f12393g
            r1 = -1
            if (r0 == r1) goto L_0x000f
            if (r0 == 0) goto L_0x000f
            r1 = 1
            if (r0 == r1) goto L_0x000f
            return r1
        L_0x000f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2734ul.k():boolean");
    }

    public final void a() {
        a(this.f7197b.a());
    }

    public final void a(float f2, float f3) {
        C1123Vl vl = this.p;
        if (vl != null) {
            vl.a(f2, f3);
        }
    }

    public final void a(C0681El el) {
        this.s = el;
    }

    public final void b() {
        fa.f("AdMediaPlayerView pause");
        if (k() && this.i.isPlaying()) {
            this.i.pause();
            i(4);
            oa.f5628a.post(new C0707Fl(this));
        }
        this.f12394h = 4;
    }

    public final void b(int i2) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i2);
        fa.f(sb.toString());
        if (k()) {
            this.i.seekTo(i2);
            this.r = 0;
            return;
        }
        this.r = i2;
    }

    public final void c() {
        fa.f("AdMediaPlayerView play");
        if (k()) {
            this.i.start();
            i(3);
            this.f7196a.a();
            oa.f5628a.post(new C0629Cl(this));
        }
        this.f12394h = 3;
    }

    public final void d() {
        fa.f("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.i.release();
            this.i = null;
            i(0);
            this.f12394h = 0;
        }
        this.f12391e.a();
    }

    public final long e() {
        return 0;
    }

    public final String f() {
        String str = this.q ? " spherical" : BuildConfig.FLAVOR;
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    public final long g() {
        if (this.t != null) {
            return (getTotalBytes() * ((long) this.m)) / 100;
        }
        return -1;
    }

    public final int getCurrentPosition() {
        if (k()) {
            return this.i.getCurrentPosition();
        }
        return 0;
    }

    public final int getDuration() {
        if (k()) {
            return this.i.getDuration();
        }
        return -1;
    }

    public final long getTotalBytes() {
        if (this.t != null) {
            return ((long) getDuration()) * ((long) this.t.intValue());
        }
        return -1;
    }

    public final int getVideoHeight() {
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    public final int getVideoWidth() {
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    public final int h() {
        if (Build.VERSION.SDK_INT < 26 || !k()) {
            return -1;
        }
        return this.i.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(int i2) {
        C0681El el = this.s;
        if (el != null) {
            el.onWindowVisibilityChanged(i2);
        }
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
        this.m = i2;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        fa.f("AdMediaPlayerView completion");
        i(5);
        this.f12394h = 5;
        oa.f5628a.post(new C3089zl(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        String str = f12389c.get(Integer.valueOf(i2));
        String str2 = f12389c.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        C1018Rk.d(sb.toString());
        i(-1);
        this.f12394h = -1;
        oa.f5628a.post(new C3018yl(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        String str = f12389c.get(Integer.valueOf(i2));
        String str2 = f12389c.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        fa.f(sb.toString());
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.k
            int r0 = android.view.TextureView.getDefaultSize(r0, r6)
            int r1 = r5.l
            int r1 = android.view.TextureView.getDefaultSize(r1, r7)
            int r2 = r5.k
            if (r2 <= 0) goto L_0x0088
            int r2 = r5.l
            if (r2 <= 0) goto L_0x0088
            com.google.android.gms.internal.ads.Vl r2 = r5.p
            if (r2 != 0) goto L_0x0088
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x0048
            if (r1 != r2) goto L_0x0048
            int r0 = r5.k
            int r1 = r0 * r7
            int r2 = r5.l
            int r3 = r6 * r2
            if (r1 >= r3) goto L_0x003d
            int r0 = r0 * r7
            int r0 = r0 / r2
            r1 = r7
            goto L_0x0088
        L_0x003d:
            int r1 = r0 * r7
            int r3 = r6 * r2
            if (r1 <= r3) goto L_0x0069
            int r2 = r2 * r6
            int r1 = r2 / r0
            goto L_0x0089
        L_0x0048:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x005a
            int r0 = r5.l
            int r0 = r0 * r6
            int r2 = r5.k
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x0058
            if (r0 <= r7) goto L_0x0058
            goto L_0x0067
        L_0x0058:
            r1 = r0
            goto L_0x0089
        L_0x005a:
            if (r1 != r2) goto L_0x006b
            int r1 = r5.k
            int r1 = r1 * r7
            int r2 = r5.l
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x0068
            if (r1 <= r6) goto L_0x0068
        L_0x0067:
            goto L_0x0069
        L_0x0068:
            r6 = r1
        L_0x0069:
            r1 = r7
            goto L_0x0089
        L_0x006b:
            int r2 = r5.k
            int r4 = r5.l
            if (r1 != r3) goto L_0x0078
            if (r4 <= r7) goto L_0x0078
            int r2 = r2 * r7
            int r2 = r2 / r4
            r1 = r7
            goto L_0x0079
        L_0x0078:
            r1 = r4
        L_0x0079:
            if (r0 != r3) goto L_0x0086
            if (r2 <= r6) goto L_0x0086
            int r7 = r5.l
            int r7 = r7 * r6
            int r0 = r5.k
            int r1 = r7 / r0
            goto L_0x0089
        L_0x0086:
            r6 = r2
            goto L_0x0089
        L_0x0088:
            r6 = r0
        L_0x0089:
            r5.setMeasuredDimension(r6, r1)
            com.google.android.gms.internal.ads.Vl r7 = r5.p
            if (r7 == 0) goto L_0x0093
            r7.a((int) r6, (int) r1)
        L_0x0093:
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 16
            if (r7 != r0) goto L_0x00ac
            int r7 = r5.n
            if (r7 <= 0) goto L_0x009f
            if (r7 != r6) goto L_0x00a5
        L_0x009f:
            int r7 = r5.o
            if (r7 <= 0) goto L_0x00a8
            if (r7 == r1) goto L_0x00a8
        L_0x00a5:
            r5.j()
        L_0x00a8:
            r5.n = r6
            r5.o = r1
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2734ul.onMeasure(int, int):void");
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        fa.f("AdMediaPlayerView prepared");
        i(2);
        this.f12391e.d();
        oa.f5628a.post(new C2876wl(this, mediaPlayer));
        this.k = mediaPlayer.getVideoWidth();
        this.l = mediaPlayer.getVideoHeight();
        int i2 = this.r;
        if (i2 != 0) {
            b(i2);
        }
        j();
        int i3 = this.k;
        int i4 = this.l;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i3);
        sb.append(" x ");
        sb.append(i4);
        C1018Rk.c(sb.toString());
        if (this.f12394h == 3) {
            c();
        }
        a();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        fa.f("AdMediaPlayerView surface created");
        i();
        oa.f5628a.post(new C0603Bl(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        fa.f("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null && this.r == 0) {
            this.r = mediaPlayer.getCurrentPosition();
        }
        C1123Vl vl = this.p;
        if (vl != null) {
            vl.b();
        }
        oa.f5628a.post(new C0655Dl(this));
        a(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        fa.f("AdMediaPlayerView surface changed");
        boolean z = true;
        boolean z2 = this.f12394h == 3;
        if (!(this.k == i2 && this.l == i3)) {
            z = false;
        }
        if (this.i != null && z2 && z) {
            int i4 = this.r;
            if (i4 != 0) {
                b(i4);
            }
            c();
        }
        C1123Vl vl = this.p;
        if (vl != null) {
            vl.a(i2, i3);
        }
        oa.f5628a.post(new C0577Al(this, i2, i3));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f12391e.b(this);
        this.f7196a.a(surfaceTexture, this.s);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        fa.f(sb.toString());
        this.k = mediaPlayer.getVideoWidth();
        this.l = mediaPlayer.getVideoHeight();
        if (this.k != 0 && this.l != 0) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i2) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i2);
        fa.f(sb.toString());
        oa.f5628a.post(new C2947xl(this, i2));
        super.onWindowVisibilityChanged(i2);
    }

    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        Foa a2 = Foa.a(parse);
        if (a2 == null || a2.f6931a != null) {
            if (a2 != null) {
                parse = Uri.parse(a2.f6931a);
            }
            this.j = parse;
            this.r = 0;
            i();
            requestLayout();
            invalidate();
        }
    }

    public final String toString() {
        String name = C2734ul.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }
}
