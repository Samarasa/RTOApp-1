package c.a.a.c.d.b;

import c.a.a.c.a.e;
import java.nio.ByteBuffer;

public class a implements e<ByteBuffer> {

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f3430a;

    /* renamed from: c.a.a.c.d.b.a$a  reason: collision with other inner class name */
    public static class C0052a implements e.a<ByteBuffer> {
        public e<ByteBuffer> a(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f3430a = byteBuffer;
    }

    public ByteBuffer a() {
        this.f3430a.position(0);
        return this.f3430a;
    }

    public void b() {
    }
}
