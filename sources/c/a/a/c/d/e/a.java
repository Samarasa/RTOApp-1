package c.a.a.c.d.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import c.a.a.b.a;
import c.a.a.b.c;
import c.a.a.b.d;
import c.a.a.b.e;
import c.a.a.c.f;
import c.a.a.c.g;
import c.a.a.c.l;
import c.a.a.i.k;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

public class a implements l<ByteBuffer, c> {

    /* renamed from: a  reason: collision with root package name */
    private static final C0053a f3435a = new C0053a();

    /* renamed from: b  reason: collision with root package name */
    private static final b f3436b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final Context f3437c;

    /* renamed from: d  reason: collision with root package name */
    private final List<f> f3438d;

    /* renamed from: e  reason: collision with root package name */
    private final b f3439e;

    /* renamed from: f  reason: collision with root package name */
    private final C0053a f3440f;

    /* renamed from: g  reason: collision with root package name */
    private final b f3441g;

    /* renamed from: c.a.a.c.d.e.a$a  reason: collision with other inner class name */
    static class C0053a {
        C0053a() {
        }

        /* access modifiers changed from: package-private */
        public c.a.a.b.a a(a.C0045a aVar, c cVar, ByteBuffer byteBuffer, int i) {
            return new e(aVar, cVar, byteBuffer, i);
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Queue<d> f3442a = k.a(0);

        b() {
        }

        /* access modifiers changed from: package-private */
        public synchronized d a(ByteBuffer byteBuffer) {
            d poll;
            poll = this.f3442a.poll();
            if (poll == null) {
                poll = new d();
            }
            poll.a(byteBuffer);
            return poll;
        }

        /* access modifiers changed from: package-private */
        public synchronized void a(d dVar) {
            dVar.a();
            this.f3442a.offer(dVar);
        }
    }

    public a(Context context, List<f> list, c.a.a.c.b.a.e eVar, c.a.a.c.b.a.b bVar) {
        this(context, list, eVar, bVar, f3436b, f3435a);
    }

    a(Context context, List<f> list, c.a.a.c.b.a.e eVar, c.a.a.c.b.a.b bVar, b bVar2, C0053a aVar) {
        this.f3437c = context.getApplicationContext();
        this.f3438d = list;
        this.f3440f = aVar;
        this.f3441g = new b(eVar, bVar);
        this.f3439e = bVar2;
    }

    private static int a(c cVar, int i, int i2) {
        int min = Math.min(cVar.a() / i2, cVar.d() / i);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + cVar.d() + "x" + cVar.a() + "]");
        }
        return max;
    }

    private e a(ByteBuffer byteBuffer, int i, int i2, d dVar, c.a.a.c.k kVar) {
        long a2 = c.a.a.i.e.a();
        try {
            c b2 = dVar.b();
            if (b2.b() > 0) {
                if (b2.c() == 0) {
                    Bitmap.Config config = kVar.a(i.f3469a) == c.a.a.c.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                    c.a.a.b.a a3 = this.f3440f.a(this.f3441g, b2, byteBuffer, a(b2, i, i2));
                    a3.a(config);
                    a3.advance();
                    Bitmap a4 = a3.a();
                    if (a4 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + c.a.a.i.e.a(a2));
                        }
                        return null;
                    }
                    e eVar = new e(new c(this.f3437c, a3, c.a.a.c.d.b.a(), i, i2, a4));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + c.a.a.i.e.a(a2));
                    }
                    return eVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + c.a.a.i.e.a(a2));
            }
        }
    }

    public e a(ByteBuffer byteBuffer, int i, int i2, c.a.a.c.k kVar) {
        d a2 = this.f3439e.a(byteBuffer);
        try {
            return a(byteBuffer, i, i2, a2, kVar);
        } finally {
            this.f3439e.a(a2);
        }
    }

    public boolean a(ByteBuffer byteBuffer, c.a.a.c.k kVar) {
        return !((Boolean) kVar.a(i.f3470b)).booleanValue() && g.a(this.f3438d, byteBuffer) == f.a.GIF;
    }
}
