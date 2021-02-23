package c.a.a.c.d.a;

import android.media.ExifInterface;
import c.a.a.c.b.a.b;
import c.a.a.c.f;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class p implements f {
    public int a(InputStream inputStream, b bVar) {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }

    public f.a a(InputStream inputStream) {
        return f.a.UNKNOWN;
    }

    public f.a a(ByteBuffer byteBuffer) {
        return f.a.UNKNOWN;
    }
}
