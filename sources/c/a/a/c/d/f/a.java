package c.a.a.c.d.f;

import android.graphics.Bitmap;
import c.a.a.c.b.F;
import c.a.a.c.d.b.b;
import c.a.a.c.k;
import java.io.ByteArrayOutputStream;

public class a implements e<Bitmap, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap.CompressFormat f3474a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3475b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public a(Bitmap.CompressFormat compressFormat, int i) {
        this.f3474a = compressFormat;
        this.f3475b = i;
    }

    public F<byte[]> a(F<Bitmap> f2, k kVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        f2.get().compress(this.f3474a, this.f3475b, byteArrayOutputStream);
        f2.a();
        return new b(byteArrayOutputStream.toByteArray());
    }
}
