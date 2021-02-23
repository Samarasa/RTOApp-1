package c.a.a.c.d.a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import c.a.a.c.b.F;
import c.a.a.c.k;
import c.a.a.c.l;
import c.a.a.i.i;

/* renamed from: c.a.a.c.d.a.a  reason: case insensitive filesystem */
public class C0244a<DataType> implements l<DataType, BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    private final l<DataType, Bitmap> f3363a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f3364b;

    public C0244a(Resources resources, l<DataType, Bitmap> lVar) {
        i.a(resources);
        this.f3364b = resources;
        i.a(lVar);
        this.f3363a = lVar;
    }

    public F<BitmapDrawable> a(DataType datatype, int i, int i2, k kVar) {
        return s.a(this.f3364b, this.f3363a.a(datatype, i, i2, kVar));
    }

    public boolean a(DataType datatype, k kVar) {
        return this.f3363a.a(datatype, kVar);
    }
}
