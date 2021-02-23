package c.a.a.c.c;

import android.util.Log;
import c.a.a.c.a.d;
import c.a.a.c.c.u;
import c.a.a.c.k;
import c.a.a.h;
import c.a.a.h.c;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class f implements u<File, ByteBuffer> {

    private static final class a implements d<ByteBuffer> {

        /* renamed from: a  reason: collision with root package name */
        private final File f3286a;

        a(File file) {
            this.f3286a = file;
        }

        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        public void a(h hVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.a(c.a.a.i.a.a(this.f3286a));
            } catch (IOException e2) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e2);
                }
                aVar.a((Exception) e2);
            }
        }

        public void b() {
        }

        public c.a.a.c.a c() {
            return c.a.a.c.a.LOCAL;
        }

        public void cancel() {
        }
    }

    public static class b implements v<File, ByteBuffer> {
        public u<File, ByteBuffer> a(y yVar) {
            return new f();
        }
    }

    public u.a<ByteBuffer> a(File file, int i, int i2, k kVar) {
        return new u.a<>(new c(file), new a(file));
    }

    public boolean a(File file) {
        return true;
    }
}
