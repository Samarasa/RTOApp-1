package c.a.a.c.d.e;

import android.content.Context;
import android.graphics.Bitmap;
import c.a.a.c;
import c.a.a.c.b.F;
import c.a.a.c.d.a.d;
import c.a.a.c.n;
import c.a.a.i.i;
import java.security.MessageDigest;

public class f implements n<c> {

    /* renamed from: a  reason: collision with root package name */
    private final n<Bitmap> f3454a;

    public f(n<Bitmap> nVar) {
        i.a(nVar);
        this.f3454a = nVar;
    }

    public F<c> a(Context context, F<c> f2, int i, int i2) {
        c cVar = f2.get();
        d dVar = new d(cVar.c(), c.a(context).c());
        F<Bitmap> a2 = this.f3454a.a(context, dVar, i, i2);
        if (!dVar.equals(a2)) {
            dVar.a();
        }
        cVar.a(this.f3454a, a2.get());
        return f2;
    }

    public void a(MessageDigest messageDigest) {
        this.f3454a.a(messageDigest);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f3454a.equals(((f) obj).f3454a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3454a.hashCode();
    }
}
