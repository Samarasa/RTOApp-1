package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class Ija extends Fja {

    /* renamed from: b  reason: collision with root package name */
    public final Eja f7321b = new Eja();

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer f7322c;

    /* renamed from: d  reason: collision with root package name */
    public long f7323d;

    /* renamed from: e  reason: collision with root package name */
    private final int f7324e = 0;

    public Ija(int i) {
    }

    private final ByteBuffer e(int i) {
        ByteBuffer byteBuffer = this.f7322c;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    public final void a() {
        super.a();
        ByteBuffer byteBuffer = this.f7322c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void d(int i) {
        ByteBuffer byteBuffer = this.f7322c;
        if (byteBuffer != null) {
            int capacity = byteBuffer.capacity();
            int position = this.f7322c.position() + i;
            if (capacity < position) {
                e(position);
                throw null;
            }
            return;
        }
        e(i);
        throw null;
    }

    public final boolean e() {
        return c(1073741824);
    }
}
