package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.nio.ByteBuffer;

public interface Iga extends Closeable {
    ByteBuffer a(long j, long j2);

    void close();

    void e(long j);

    long position();

    int read(ByteBuffer byteBuffer);

    long size();
}
