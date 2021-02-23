package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.Zu  reason: case insensitive filesystem */
public final class C1236Zu extends Fga {
    private ByteBuffer l;

    public C1236Zu(String str) {
        super(str);
    }

    public final void a(ByteBuffer byteBuffer) {
        this.l = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
