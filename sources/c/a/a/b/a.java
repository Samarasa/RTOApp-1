package c.a.a.b;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

public interface a {

    /* renamed from: c.a.a.b.a$a  reason: collision with other inner class name */
    public interface C0045a {
        Bitmap a(int i, int i2, Bitmap.Config config);

        void a(Bitmap bitmap);

        void a(byte[] bArr);

        void a(int[] iArr);

        int[] a(int i);

        byte[] b(int i);
    }

    Bitmap a();

    void a(Bitmap.Config config);

    void advance();

    int b();

    int c();

    void clear();

    void d();

    int e();

    int f();

    ByteBuffer getData();
}
