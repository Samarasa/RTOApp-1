package c.a.a.c.d.a;

import android.graphics.Bitmap;
import c.a.a.c.b.a.e;
import c.a.a.c.h;
import java.security.MessageDigest;

public class q extends e {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f3402a = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(h.f3494a);

    /* access modifiers changed from: protected */
    public Bitmap a(e eVar, Bitmap bitmap, int i, int i2) {
        return w.c(eVar, bitmap, i, i2);
    }

    public void a(MessageDigest messageDigest) {
        messageDigest.update(f3402a);
    }

    public boolean equals(Object obj) {
        return obj instanceof q;
    }

    public int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.FitCenter".hashCode();
    }
}