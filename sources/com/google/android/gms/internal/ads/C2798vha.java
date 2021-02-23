package com.google.android.gms.internal.ads;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.vha  reason: case insensitive filesystem */
final class C2798vha implements C0694Ey {

    /* renamed from: a  reason: collision with root package name */
    private final FileChannel f12541a;

    /* renamed from: b  reason: collision with root package name */
    private final long f12542b;

    /* renamed from: c  reason: collision with root package name */
    private final long f12543c;

    public C2798vha(FileChannel fileChannel, long j, long j2) {
        this.f12541a = fileChannel;
        this.f12542b = j;
        this.f12543c = j2;
    }

    public final void a(MessageDigest[] messageDigestArr, long j, int i) {
        MappedByteBuffer map = this.f12541a.map(FileChannel.MapMode.READ_ONLY, this.f12542b + j, (long) i);
        map.load();
        for (MessageDigest update : messageDigestArr) {
            map.position(0);
            update.update(map);
        }
    }

    public final long size() {
        return this.f12543c;
    }
}
