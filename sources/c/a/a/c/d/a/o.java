package c.a.a.c.d.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c.a.a.c;
import c.a.a.c.b.F;
import c.a.a.c.b.a.e;
import c.a.a.c.n;
import java.security.MessageDigest;

public class o implements n<Drawable> {

    /* renamed from: a  reason: collision with root package name */
    private final n<Bitmap> f3400a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3401b;

    public o(n<Bitmap> nVar, boolean z) {
        this.f3400a = nVar;
        this.f3401b = z;
    }

    private F<Drawable> a(Context context, F<Bitmap> f2) {
        return s.a(context.getResources(), f2);
    }

    public F<Drawable> a(Context context, F<Drawable> f2, int i, int i2) {
        e c2 = c.a(context).c();
        Drawable drawable = f2.get();
        F<Bitmap> a2 = n.a(c2, drawable, i, i2);
        if (a2 != null) {
            F<Bitmap> a3 = this.f3400a.a(context, a2, i, i2);
            if (!a3.equals(a2)) {
                return a(context, a3);
            }
            a3.a();
            return f2;
        } else if (!this.f3401b) {
            return f2;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    public n<BitmapDrawable> a() {
        return this;
    }

    public void a(MessageDigest messageDigest) {
        this.f3400a.a(messageDigest);
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f3400a.equals(((o) obj).f3400a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3400a.hashCode();
    }
}
