package c.a.a.c.d.e;

import android.util.Log;
import c.a.a.c.b.F;
import c.a.a.c.b.a.b;
import c.a.a.c.f;
import c.a.a.c.g;
import c.a.a.c.k;
import c.a.a.c.l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public class j implements l<InputStream, c> {

    /* renamed from: a  reason: collision with root package name */
    private final List<f> f3471a;

    /* renamed from: b  reason: collision with root package name */
    private final l<ByteBuffer, c> f3472b;

    /* renamed from: c  reason: collision with root package name */
    private final b f3473c;

    public j(List<f> list, l<ByteBuffer, c> lVar, b bVar) {
        this.f3471a = list;
        this.f3472b = lVar;
        this.f3473c = bVar;
    }

    private static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e2) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e2);
            return null;
        }
    }

    public F<c> a(InputStream inputStream, int i, int i2, k kVar) {
        byte[] a2 = a(inputStream);
        if (a2 == null) {
            return null;
        }
        return this.f3472b.a(ByteBuffer.wrap(a2), i, i2, kVar);
    }

    public boolean a(InputStream inputStream, k kVar) {
        return !((Boolean) kVar.a(i.f3470b)).booleanValue() && g.b(this.f3471a, inputStream, this.f3473c) == f.a.GIF;
    }
}
