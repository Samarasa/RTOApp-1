package c.a.a.c.d.a;

import c.a.a.c.j;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

class z implements j.a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f3428a = ByteBuffer.allocate(4);

    z() {
    }

    public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
        if (num != null) {
            messageDigest.update(bArr);
            synchronized (this.f3428a) {
                this.f3428a.position(0);
                messageDigest.update(this.f3428a.putInt(num.intValue()).array());
            }
        }
    }
}
