package c.a.a.c.d.a;

import c.a.a.c.j;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

class y implements j.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f3427a = ByteBuffer.allocate(8);

    y() {
    }

    public void a(byte[] bArr, Long l, MessageDigest messageDigest) {
        messageDigest.update(bArr);
        synchronized (this.f3427a) {
            this.f3427a.position(0);
            messageDigest.update(this.f3427a.putLong(l.longValue()).array());
        }
    }
}
