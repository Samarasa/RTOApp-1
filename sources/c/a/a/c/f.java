package c.a.a.c;

import c.a.a.c.b.a.b;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface f {

    public enum a {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        
        private final boolean j;

        private a(boolean z) {
            this.j = z;
        }

        public boolean a() {
            return this.j;
        }
    }

    int a(InputStream inputStream, b bVar);

    a a(InputStream inputStream);

    a a(ByteBuffer byteBuffer);
}
