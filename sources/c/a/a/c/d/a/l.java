package c.a.a.c.d.a;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import c.a.a.c.b;
import c.a.a.c.b.F;
import c.a.a.c.b.a.e;
import c.a.a.c.d.a.j;
import c.a.a.c.f;
import c.a.a.c.g;
import c.a.a.c.j;
import c.a.a.i.i;
import c.a.a.i.k;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final j<b> f3391a = j.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", b.f2992c);
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final j<j> f3392b = j.f3387h;

    /* renamed from: c  reason: collision with root package name */
    public static final j<Boolean> f3393c = j.a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false);

    /* renamed from: d  reason: collision with root package name */
    public static final j<Boolean> f3394d = j.a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false);

    /* renamed from: e  reason: collision with root package name */
    private static final Set<String> f3395e = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: f  reason: collision with root package name */
    private static final a f3396f = new k();

    /* renamed from: g  reason: collision with root package name */
    private static final Set<f.a> f3397g = Collections.unmodifiableSet(EnumSet.of(f.a.JPEG, f.a.PNG_A, f.a.PNG));

    /* renamed from: h  reason: collision with root package name */
    private static final Queue<BitmapFactory.Options> f3398h = k.a(0);
    private final e i;
    private final DisplayMetrics j;
    private final c.a.a.c.b.a.b k;
    private final List<f> l;
    private final r m = r.a();

    public interface a {
        void a();

        void a(e eVar, Bitmap bitmap);
    }

    public l(List<f> list, DisplayMetrics displayMetrics, e eVar, c.a.a.c.b.a.b bVar) {
        this.l = list;
        i.a(displayMetrics);
        this.j = displayMetrics;
        i.a(eVar);
        this.i = eVar;
        i.a(bVar);
        this.k = bVar;
    }

    private static int a(double d2) {
        int b2 = b(d2);
        double d3 = (double) b2;
        Double.isNaN(d3);
        int c2 = c(d3 * d2);
        double d4 = (double) (((float) c2) / ((float) b2));
        Double.isNaN(d4);
        double d5 = (double) c2;
        Double.isNaN(d5);
        return c((d2 / d4) * d5);
    }

    private Bitmap a(InputStream inputStream, BitmapFactory.Options options, j jVar, b bVar, boolean z, int i2, int i3, boolean z2, a aVar) {
        int i4;
        int i5;
        l lVar;
        int i6;
        int i7;
        int i8;
        InputStream inputStream2 = inputStream;
        BitmapFactory.Options options2 = options;
        a aVar2 = aVar;
        long a2 = c.a.a.i.e.a();
        int[] b2 = b(inputStream2, options2, aVar2, this.i);
        boolean z3 = false;
        int i9 = b2[0];
        int i10 = b2[1];
        String str = options2.outMimeType;
        boolean z4 = (i9 == -1 || i10 == -1) ? false : z;
        int a3 = g.a(this.l, inputStream2, this.k);
        int a4 = w.a(a3);
        boolean b3 = w.b(a3);
        int i11 = i2;
        if (i11 == Integer.MIN_VALUE) {
            i5 = i3;
            i4 = i9;
        } else {
            i5 = i3;
            i4 = i11;
        }
        int i12 = i5 == Integer.MIN_VALUE ? i10 : i5;
        f.a b4 = g.b(this.l, inputStream2, this.k);
        e eVar = this.i;
        f.a aVar3 = b4;
        a(b4, inputStream, aVar, eVar, jVar, a4, i9, i10, i4, i12, options);
        int i13 = a3;
        String str2 = str;
        int i14 = i10;
        int i15 = i9;
        a aVar4 = aVar2;
        BitmapFactory.Options options3 = options2;
        a(inputStream, bVar, z4, b3, options, i4, i12);
        if (Build.VERSION.SDK_INT >= 19) {
            z3 = true;
        }
        if (options3.inSampleSize == 1 || z3) {
            lVar = this;
            if (lVar.a(aVar3)) {
                if (i15 < 0 || i14 < 0 || !z2 || !z3) {
                    float f2 = b(options) ? ((float) options3.inTargetDensity) / ((float) options3.inDensity) : 1.0f;
                    int i16 = options3.inSampleSize;
                    float f3 = (float) i16;
                    i8 = Math.round(((float) ((int) Math.ceil((double) (((float) i15) / f3)))) * f2);
                    i7 = Math.round(((float) ((int) Math.ceil((double) (((float) i14) / f3)))) * f2);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + i8 + "x" + i7 + "] for source [" + i15 + "x" + i14 + "], sampleSize: " + i16 + ", targetDensity: " + options3.inTargetDensity + ", density: " + options3.inDensity + ", density multiplier: " + f2);
                    }
                } else {
                    i8 = i4;
                    i7 = i12;
                }
                if (i8 > 0 && i7 > 0) {
                    a(options3, lVar.i, i8, i7);
                }
            }
        } else {
            lVar = this;
        }
        Bitmap a5 = a(inputStream, options3, aVar4, lVar.i);
        aVar4.a(lVar.i, a5);
        if (Log.isLoggable("Downsampler", 2)) {
            i6 = i13;
            a(i15, i14, str2, options, a5, i2, i3, a2);
        } else {
            i6 = i13;
        }
        Bitmap bitmap = null;
        if (a5 != null) {
            a5.setDensity(lVar.j.densityDpi);
            bitmap = w.a(lVar.i, a5, i6);
            if (!a5.equals(bitmap)) {
                lVar.i.a(a5);
            }
        }
        return bitmap;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap a(java.io.InputStream r6, android.graphics.BitmapFactory.Options r7, c.a.a.c.d.a.l.a r8, c.a.a.c.b.a.e r9) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r7.inJustDecodeBounds
            if (r1 == 0) goto L_0x000c
            r1 = 10485760(0xa00000, float:1.469368E-38)
            r6.mark(r1)
            goto L_0x000f
        L_0x000c:
            r8.a()
        L_0x000f:
            int r1 = r7.outWidth
            int r2 = r7.outHeight
            java.lang.String r3 = r7.outMimeType
            java.util.concurrent.locks.Lock r4 = c.a.a.c.d.a.w.a()
            r4.lock()
            r4 = 0
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r6, r4, r7)     // Catch:{ IllegalArgumentException -> 0x0032 }
            java.util.concurrent.locks.Lock r9 = c.a.a.c.d.a.w.a()
            r9.unlock()
            boolean r7 = r7.inJustDecodeBounds
            if (r7 == 0) goto L_0x002f
            r6.reset()
        L_0x002f:
            return r8
        L_0x0030:
            r6 = move-exception
            goto L_0x005f
        L_0x0032:
            r5 = move-exception
            java.io.IOException r1 = a((java.lang.IllegalArgumentException) r5, (int) r1, (int) r2, (java.lang.String) r3, (android.graphics.BitmapFactory.Options) r7)     // Catch:{ all -> 0x0030 }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x0030 }
        L_0x0043:
            android.graphics.Bitmap r0 = r7.inBitmap     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x005e
            r6.reset()     // Catch:{ IOException -> 0x005d }
            android.graphics.Bitmap r0 = r7.inBitmap     // Catch:{ IOException -> 0x005d }
            r9.a((android.graphics.Bitmap) r0)     // Catch:{ IOException -> 0x005d }
            r7.inBitmap = r4     // Catch:{ IOException -> 0x005d }
            android.graphics.Bitmap r6 = a((java.io.InputStream) r6, (android.graphics.BitmapFactory.Options) r7, (c.a.a.c.d.a.l.a) r8, (c.a.a.c.b.a.e) r9)     // Catch:{ IOException -> 0x005d }
            java.util.concurrent.locks.Lock r7 = c.a.a.c.d.a.w.a()
            r7.unlock()
            return r6
        L_0x005d:
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x005e:
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x005f:
            java.util.concurrent.locks.Lock r7 = c.a.a.c.d.a.w.a()
            r7.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.c.d.a.l.a(java.io.InputStream, android.graphics.BitmapFactory$Options, c.a.a.c.d.a.l$a, c.a.a.c.b.a.e):android.graphics.Bitmap");
    }

    private static synchronized BitmapFactory.Options a() {
        BitmapFactory.Options poll;
        synchronized (l.class) {
            synchronized (f3398h) {
                poll = f3398h.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                d(poll);
            }
        }
        return poll;
    }

    private static IOException a(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str + ", inBitmap: " + a(options), illegalArgumentException);
    }

    @TargetApi(19)
    private static String a(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            str = " (" + bitmap.getAllocationByteCount() + ")";
        } else {
            str = BuildConfig.FLAVOR;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + str;
    }

    private static String a(BitmapFactory.Options options) {
        return a(options.inBitmap);
    }

    private static void a(int i2, int i3, String str, BitmapFactory.Options options, Bitmap bitmap, int i4, int i5, long j2) {
        Log.v("Downsampler", "Decoded " + a(bitmap) + " from [" + i2 + "x" + i3 + "] " + str + " with inBitmap " + a(options) + " for [" + i4 + "x" + i5 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + c.a.a.i.e.a(j2));
    }

    @TargetApi(26)
    private static void a(BitmapFactory.Options options, e eVar, int i2, int i3) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.b(i2, i3, config);
    }

    private static void a(f.a aVar, InputStream inputStream, a aVar2, e eVar, j jVar, int i2, int i3, int i4, int i5, int i6, BitmapFactory.Options options) {
        int i7;
        int i8;
        int i9;
        f.a aVar3 = aVar;
        j jVar2 = jVar;
        int i10 = i2;
        int i11 = i3;
        int i12 = i4;
        int i13 = i5;
        int i14 = i6;
        BitmapFactory.Options options2 = options;
        if (i11 <= 0 || i12 <= 0) {
            String str = "Downsampler";
            String str2 = "x";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to determine dimensions for: " + aVar3 + " with target [" + i13 + str2 + i14 + "]");
                return;
            }
            return;
        }
        float b2 = (i10 == 90 || i10 == 270) ? jVar2.b(i12, i11, i13, i14) : jVar2.b(i11, i12, i13, i14);
        if (b2 > 0.0f) {
            j.g a2 = jVar2.a(i11, i12, i13, i14);
            if (a2 != null) {
                float f2 = (float) i11;
                float f3 = (float) i12;
                String str3 = "Downsampler";
                String str4 = "x";
                int c2 = i11 / c((double) (b2 * f2));
                int c3 = i12 / c((double) (b2 * f3));
                int max = a2 == j.g.MEMORY ? Math.max(c2, c3) : Math.min(c2, c3);
                if (Build.VERSION.SDK_INT > 23 || !f3395e.contains(options2.outMimeType)) {
                    int max2 = Math.max(1, Integer.highestOneBit(max));
                    i7 = (a2 != j.g.MEMORY || ((float) max2) >= 1.0f / b2) ? max2 : max2 << 1;
                } else {
                    i7 = 1;
                }
                options2.inSampleSize = i7;
                if (aVar3 == f.a.JPEG) {
                    float min = (float) Math.min(i7, 8);
                    i8 = (int) Math.ceil((double) (f2 / min));
                    i9 = (int) Math.ceil((double) (f3 / min));
                    int i15 = i7 / 8;
                    if (i15 > 0) {
                        i8 /= i15;
                        i9 /= i15;
                    }
                } else {
                    if (!(aVar3 == f.a.PNG || aVar3 == f.a.PNG_A)) {
                        if (aVar3 == f.a.WEBP || aVar3 == f.a.WEBP_A) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                float f4 = (float) i7;
                                i8 = Math.round(f2 / f4);
                                i9 = Math.round(f3 / f4);
                            }
                        } else if (i11 % i7 == 0 && i12 % i7 == 0) {
                            i8 = i11 / i7;
                            i9 = i12 / i7;
                        } else {
                            int[] b3 = b(inputStream, options2, aVar2, eVar);
                            int i16 = b3[0];
                            i9 = b3[1];
                            i8 = i16;
                        }
                    }
                    float f5 = (float) i7;
                    i8 = (int) Math.floor((double) (f2 / f5));
                    i9 = (int) Math.floor((double) (f3 / f5));
                }
                double b4 = (double) jVar2.b(i8, i9, i13, i14);
                if (Build.VERSION.SDK_INT >= 19) {
                    options2.inTargetDensity = a(b4);
                    options2.inDensity = b(b4);
                }
                if (b(options)) {
                    options2.inScaled = true;
                } else {
                    options2.inTargetDensity = 0;
                    options2.inDensity = 0;
                }
                String str5 = str3;
                if (Log.isLoggable(str5, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calculate scaling, source: [");
                    sb.append(i11);
                    String str6 = str4;
                    sb.append(str6);
                    sb.append(i12);
                    sb.append("], target: [");
                    sb.append(i13);
                    sb.append(str6);
                    sb.append(i14);
                    sb.append("], power of two scaled: [");
                    sb.append(i8);
                    sb.append(str6);
                    sb.append(i9);
                    sb.append("], exact scale factor: ");
                    sb.append(b2);
                    sb.append(", power of 2 sample size: ");
                    sb.append(i7);
                    sb.append(", adjusted scale factor: ");
                    sb.append(b4);
                    sb.append(", target density: ");
                    sb.append(options2.inTargetDensity);
                    sb.append(", density: ");
                    sb.append(options2.inDensity);
                    Log.v(str5, sb.toString());
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        String str7 = "x";
        throw new IllegalArgumentException("Cannot scale with factor: " + b2 + " from: " + jVar2 + ", source: [" + i11 + str7 + i12 + "], target: [" + i13 + str7 + i14 + "]");
    }

    private void a(InputStream inputStream, b bVar, boolean z, boolean z2, BitmapFactory.Options options, int i2, int i3) {
        if (!this.m.a(i2, i3, options, bVar, z, z2)) {
            if (bVar == b.PREFER_ARGB_8888 || Build.VERSION.SDK_INT == 16) {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                return;
            }
            boolean z3 = false;
            try {
                z3 = g.b(this.l, inputStream, this.k).a();
            } catch (IOException e2) {
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e2);
                }
            }
            options.inPreferredConfig = z3 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            if (options.inPreferredConfig == Bitmap.Config.RGB_565) {
                options.inDither = true;
            }
        }
    }

    private boolean a(f.a aVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return f3397g.contains(aVar);
    }

    private static int b(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.inDensity;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean b(android.graphics.BitmapFactory.Options r1) {
        /*
            int r0 = r1.inTargetDensity
            if (r0 <= 0) goto L_0x000c
            int r1 = r1.inDensity
            if (r1 <= 0) goto L_0x000c
            if (r0 == r1) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.c.d.a.l.b(android.graphics.BitmapFactory$Options):boolean");
    }

    private static int[] b(InputStream inputStream, BitmapFactory.Options options, a aVar, e eVar) {
        options.inJustDecodeBounds = true;
        a(inputStream, options, aVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static int c(double d2) {
        return (int) (d2 + 0.5d);
    }

    private static void c(BitmapFactory.Options options) {
        d(options);
        synchronized (f3398h) {
            f3398h.offer(options);
        }
    }

    private static void d(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public F<Bitmap> a(InputStream inputStream, int i2, int i3, c.a.a.c.k kVar) {
        return a(inputStream, i2, i3, kVar, f3396f);
    }

    public F<Bitmap> a(InputStream inputStream, int i2, int i3, c.a.a.c.k kVar, a aVar) {
        c.a.a.c.k kVar2 = kVar;
        i.a(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        byte[] bArr = (byte[]) this.k.b(65536, byte[].class);
        BitmapFactory.Options a2 = a();
        a2.inTempStorage = bArr;
        b bVar = (b) kVar2.a(f3391a);
        try {
            return d.a(a(inputStream, a2, (j) kVar2.a(j.f3387h), bVar, kVar2.a(f3394d) != null && ((Boolean) kVar2.a(f3394d)).booleanValue(), i2, i3, ((Boolean) kVar2.a(f3393c)).booleanValue(), aVar), this.i);
        } finally {
            c(a2);
            this.k.put(bArr);
        }
    }

    public boolean a(InputStream inputStream) {
        return true;
    }

    public boolean a(ByteBuffer byteBuffer) {
        return true;
    }
}
