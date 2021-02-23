package c.a.a.c.d.a;

import android.graphics.Bitmap;
import c.a.a.c.b.a.e;
import java.security.MessageDigest;

public class h extends e {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f3374a = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(c.a.a.c.h.f3494a);

    /* access modifiers changed from: protected */
    public Bitmap a(e eVar, Bitmap bitmap, int i, int i2) {
        return w.b(eVar, bitmap, i, i2);
    }

    public void a(MessageDigest messageDigest) {
        messageDigest.update(f3374a);
    }

    public boolean equals(Object obj) {
        return obj instanceof h;
    }

    public int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.CenterInside".hashCode();
    }
}
