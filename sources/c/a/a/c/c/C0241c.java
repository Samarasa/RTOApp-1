package c.a.a.c.c;

import c.a.a.c.a.d;
import c.a.a.c.c.u;
import c.a.a.c.k;
import c.a.a.h;
import c.a.a.h.c;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: c.a.a.c.c.c  reason: case insensitive filesystem */
public class C0241c<Data> implements u<byte[], Data> {

    /* renamed from: a  reason: collision with root package name */
    private final b<Data> f3282a;

    /* renamed from: c.a.a.c.c.c$a */
    public static class a implements v<byte[], ByteBuffer> {
        public u<byte[], ByteBuffer> a(y yVar) {
            return new C0241c(new C0240b(this));
        }
    }

    /* renamed from: c.a.a.c.c.c$b */
    public interface b<Data> {
        Class<Data> a();

        Data a(byte[] bArr);
    }

    /* renamed from: c.a.a.c.c.c$c  reason: collision with other inner class name */
    private static class C0050c<Data> implements c.a.a.c.a.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f3283a;

        /* renamed from: b  reason: collision with root package name */
        private final b<Data> f3284b;

        C0050c(byte[] bArr, b<Data> bVar) {
            this.f3283a = bArr;
            this.f3284b = bVar;
        }

        public Class<Data> a() {
            return this.f3284b.a();
        }

        public void a(h hVar, d.a<? super Data> aVar) {
            aVar.a(this.f3284b.a(this.f3283a));
        }

        public void b() {
        }

        public c.a.a.c.a c() {
            return c.a.a.c.a.LOCAL;
        }

        public void cancel() {
        }
    }

    /* renamed from: c.a.a.c.c.c$d */
    public static class d implements v<byte[], InputStream> {
        public u<byte[], InputStream> a(y yVar) {
            return new C0241c(new C0242d(this));
        }
    }

    public C0241c(b<Data> bVar) {
        this.f3282a = bVar;
    }

    public u.a<Data> a(byte[] bArr, int i, int i2, k kVar) {
        return new u.a<>(new c(bArr), new C0050c(bArr, this.f3282a));
    }

    public boolean a(byte[] bArr) {
        return true;
    }
}
