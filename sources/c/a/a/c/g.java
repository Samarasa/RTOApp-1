package c.a.a.c;

import c.a.a.c.b.a.b;
import c.a.a.c.d.a.t;
import c.a.a.c.f;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class g {
    /* JADX INFO: finally extract failed */
    public static int a(List<f> list, InputStream inputStream, b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new t(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int i = 0;
        int size = list.size();
        while (i < size) {
            try {
                int a2 = list.get(i).a(inputStream, bVar);
                if (a2 != -1) {
                    inputStream.reset();
                    return a2;
                }
                inputStream.reset();
                i++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }

    public static f.a a(List<f> list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return f.a.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            f.a a2 = list.get(i).a(byteBuffer);
            if (a2 != f.a.UNKNOWN) {
                return a2;
            }
        }
        return f.a.UNKNOWN;
    }

    /* JADX INFO: finally extract failed */
    public static f.a b(List<f> list, InputStream inputStream, b bVar) {
        if (inputStream == null) {
            return f.a.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new t(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int i = 0;
        int size = list.size();
        while (i < size) {
            try {
                f.a a2 = list.get(i).a(inputStream);
                if (a2 != f.a.UNKNOWN) {
                    inputStream.reset();
                    return a2;
                }
                inputStream.reset();
                i++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return f.a.UNKNOWN;
    }
}
