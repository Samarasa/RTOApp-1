package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.bja  reason: case insensitive filesystem */
public interface C1385bja {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f9951a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    void a();

    void a(ByteBuffer byteBuffer);

    boolean a(int i, int i2, int i3);

    ByteBuffer b();

    int c();

    boolean d();

    int e();

    void flush();

    void reset();

    boolean u();
}
