package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

public final class Yna extends Rna {

    /* renamed from: c  reason: collision with root package name */
    private MessageDigest f9496c;

    public final byte[] a(String str) {
        byte[] bArr;
        String[] split = str.split(" ");
        int i = 4;
        if (split.length == 1) {
            int a2 = Vna.a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(a2);
            bArr = allocate.array();
        } else if (split.length < 5) {
            bArr = new byte[(split.length << 1)];
            for (int i2 = 0; i2 < split.length; i2++) {
                int a3 = Vna.a(split[i2]);
                int i3 = (a3 >> 16) ^ (65535 & a3);
                byte[] bArr2 = {(byte) i3, (byte) (i3 >> 8)};
                int i4 = i2 << 1;
                bArr[i4] = bArr2[0];
                bArr[i4 + 1] = bArr2[1];
            }
        } else {
            bArr = new byte[split.length];
            for (int i5 = 0; i5 < split.length; i5++) {
                int a4 = Vna.a(split[i5]);
                bArr[i5] = (byte) ((a4 >> 24) ^ (((a4 & 255) ^ ((a4 >> 8) & 255)) ^ ((a4 >> 16) & 255)));
            }
        }
        this.f9496c = a();
        synchronized (this.f8540b) {
            if (this.f9496c == null) {
                byte[] bArr3 = new byte[0];
                return bArr3;
            }
            this.f9496c.reset();
            this.f9496c.update(bArr);
            byte[] digest = this.f9496c.digest();
            if (digest.length <= 4) {
                i = digest.length;
            }
            byte[] bArr4 = new byte[i];
            System.arraycopy(digest, 0, bArr4, 0, bArr4.length);
            return bArr4;
        }
    }
}
