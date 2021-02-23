package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.Vq  reason: case insensitive filesystem */
final class C1128Vq extends ThreadLocal<ByteBuffer> {
    C1128Vq(C2817vr vrVar) {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
