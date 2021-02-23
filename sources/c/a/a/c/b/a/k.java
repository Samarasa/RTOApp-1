package c.a.a.c.b.a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class k implements e {

    /* renamed from: a  reason: collision with root package name */
    private static final Bitmap.Config f3053a = Bitmap.Config.ARGB_8888;

    /* renamed from: b  reason: collision with root package name */
    private final l f3054b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Bitmap.Config> f3055c;

    /* renamed from: d  reason: collision with root package name */
    private final long f3056d;

    /* renamed from: e  reason: collision with root package name */
    private final a f3057e;

    /* renamed from: f  reason: collision with root package name */
    private long f3058f;

    /* renamed from: g  reason: collision with root package name */
    private long f3059g;

    /* renamed from: h  reason: collision with root package name */
    private int f3060h;
    private int i;
    private int j;
    private int k;

    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    private static final class b implements a {
        b() {
        }

        public void a(Bitmap bitmap) {
        }

        public void b(Bitmap bitmap) {
        }
    }

    public k(long j2) {
        this(j2, g(), f());
    }

    k(long j2, l lVar, Set<Bitmap.Config> set) {
        this.f3056d = j2;
        this.f3058f = j2;
        this.f3054b = lVar;
        this.f3055c = set;
        this.f3057e = new b();
    }

    private synchronized void a(long j2) {
        while (this.f3059g > j2) {
            Bitmap removeLast = this.f3054b.removeLast();
            if (removeLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    d();
                }
                this.f3059g = 0;
                return;
            }
            this.f3057e.a(removeLast);
            this.f3059g -= (long) this.f3054b.b(removeLast);
            this.k++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f3054b.c(removeLast));
            }
            c();
            removeLast.recycle();
        }
    }

    @TargetApi(26)
    private static void a(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    @TargetApi(19)
    private static void b(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    private static Bitmap c(int i2, int i3, Bitmap.Config config) {
        if (config == null) {
            config = f3053a;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    private void c() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            d();
        }
    }

    private static void c(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        b(bitmap);
    }

    private synchronized Bitmap d(int i2, int i3, Bitmap.Config config) {
        Bitmap a2;
        a(config);
        a2 = this.f3054b.a(i2, i3, config != null ? config : f3053a);
        if (a2 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f3054b.b(i2, i3, config));
            }
            this.i++;
        } else {
            this.f3060h++;
            this.f3059g -= (long) this.f3054b.b(a2);
            this.f3057e.a(a2);
            c(a2);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f3054b.b(i2, i3, config));
        }
        c();
        return a2;
    }

    private void d() {
        Log.v("LruBitmapPool", "Hits=" + this.f3060h + ", misses=" + this.i + ", puts=" + this.j + ", evictions=" + this.k + ", currentSize=" + this.f3059g + ", maxSize=" + this.f3058f + "\nStrategy=" + this.f3054b);
    }

    private void e() {
        a(this.f3058f);
    }

    @TargetApi(26)
    private static Set<Bitmap.Config> f() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        if (Build.VERSION.SDK_INT >= 19) {
            hashSet.add((Object) null);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static l g() {
        return Build.VERSION.SDK_INT >= 19 ? new o() : new c();
    }

    public Bitmap a(int i2, int i3, Bitmap.Config config) {
        Bitmap d2 = d(i2, i3, config);
        if (d2 == null) {
            return c(i2, i3, config);
        }
        d2.eraseColor(0);
        return d2;
    }

    public void a() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        a(0);
    }

    @SuppressLint({"InlinedApi"})
    public void a(int i2) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i2);
        }
        if (i2 >= 40) {
            a();
        } else if (i2 >= 20 || i2 == 15) {
            a(b() / 2);
        }
    }

    public synchronized void a(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.f3054b.b(bitmap)) <= this.f3058f) {
                        if (this.f3055c.contains(bitmap.getConfig())) {
                            int b2 = this.f3054b.b(bitmap);
                            this.f3054b.a(bitmap);
                            this.f3057e.b(bitmap);
                            this.j++;
                            this.f3059g += (long) b2;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f3054b.c(bitmap));
                            }
                            c();
                            e();
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f3054b.c(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f3055c.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    public long b() {
        return this.f3058f;
    }

    public Bitmap b(int i2, int i3, Bitmap.Config config) {
        Bitmap d2 = d(i2, i3, config);
        return d2 == null ? c(i2, i3, config) : d2;
    }
}
