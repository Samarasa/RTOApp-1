package c.a.a.c.d.a;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import c.a.a.c.b.F;
import c.a.a.c.b.a.e;
import c.a.a.c.j;
import c.a.a.c.k;
import c.a.a.c.l;
import java.io.IOException;

public class A<T> implements l<T, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public static final j<Long> f3357a = j.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new y());

    /* renamed from: b  reason: collision with root package name */
    public static final j<Integer> f3358b = j.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new z());

    /* renamed from: c  reason: collision with root package name */
    private static final b f3359c = new b();

    /* renamed from: d  reason: collision with root package name */
    private final c<T> f3360d;

    /* renamed from: e  reason: collision with root package name */
    private final e f3361e;

    /* renamed from: f  reason: collision with root package name */
    private final b f3362f;

    private static final class a implements c<AssetFileDescriptor> {
        private a() {
        }

        /* synthetic */ a(y yVar) {
            this();
        }

        public void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    static class b {
        b() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    interface c<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    static final class d implements c<ParcelFileDescriptor> {
        d() {
        }

        public void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    A(e eVar, c<T> cVar) {
        this(eVar, cVar, f3359c);
    }

    A(e eVar, c<T> cVar, b bVar) {
        this.f3361e = eVar;
        this.f3360d = cVar;
        this.f3362f = bVar;
    }

    private static Bitmap a(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    private static Bitmap a(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, j jVar) {
        Bitmap b2 = (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || jVar == j.f3385f) ? null : b(mediaMetadataRetriever, j, i, i2, i3, jVar);
        return b2 == null ? a(mediaMetadataRetriever, j, i) : b2;
    }

    public static l<AssetFileDescriptor, Bitmap> a(e eVar) {
        return new A(eVar, new a((y) null));
    }

    @TargetApi(27)
    private static Bitmap b(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, j jVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i4 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i4;
            }
            float b2 = jVar.b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * b2), Math.round(b2 * ((float) parseInt2)));
        } catch (Throwable th) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", th);
            return null;
        }
    }

    public static l<ParcelFileDescriptor, Bitmap> b(e eVar) {
        return new A(eVar, new d());
    }

    public F<Bitmap> a(T t, int i, int i2, k kVar) {
        long longValue = ((Long) kVar.a(f3357a)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) kVar.a(f3358b);
            if (num == null) {
                num = 2;
            }
            j jVar = (j) kVar.a(j.f3387h);
            if (jVar == null) {
                jVar = j.f3386g;
            }
            j jVar2 = jVar;
            MediaMetadataRetriever a2 = this.f3362f.a();
            try {
                this.f3360d.a(a2, t);
                Bitmap a3 = a(a2, longValue, num.intValue(), i, i2, jVar2);
                a2.release();
                return d.a(a3, this.f3361e);
            } catch (RuntimeException e2) {
                throw new IOException(e2);
            } catch (Throwable th) {
                a2.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }

    public boolean a(T t, k kVar) {
        return true;
    }
}
