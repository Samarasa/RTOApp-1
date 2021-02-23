package com.google.android.gms.internal.ads;

import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.xia  reason: case insensitive filesystem */
public final class C2942xia {

    /* renamed from: a  reason: collision with root package name */
    public static final int f12811a = (Tma.f8821a < 23 ? 1020 : 6396);

    /* renamed from: b  reason: collision with root package name */
    public static final UUID f12812b = new UUID(0, 0);

    /* renamed from: c  reason: collision with root package name */
    private static final UUID f12813c = new UUID(1186680826959645954L, -5988876978535335093L);

    /* renamed from: d  reason: collision with root package name */
    private static final UUID f12814d = new UUID(-1301668207276963122L, -6645017420763422227L);

    /* renamed from: e  reason: collision with root package name */
    private static final UUID f12815e = new UUID(-7348484286925749626L, -6083546864340672619L);

    public static long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j / 1000;
    }

    public static long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j * 1000;
    }
}
