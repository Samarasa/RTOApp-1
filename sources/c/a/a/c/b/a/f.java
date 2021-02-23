package c.a.a.c.b.a;

import android.graphics.Bitmap;

public class f implements e {
    public Bitmap a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    public void a() {
    }

    public void a(int i) {
    }

    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }

    public Bitmap b(int i, int i2, Bitmap.Config config) {
        return a(i, i2, config);
    }
}
