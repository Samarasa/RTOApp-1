package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.iW  reason: case insensitive filesystem */
public final class C1858iW {

    /* renamed from: a  reason: collision with root package name */
    private final C2375pia f10816a;

    /* renamed from: b  reason: collision with root package name */
    private final File f10817b;

    /* renamed from: c  reason: collision with root package name */
    private final File f10818c;

    /* renamed from: d  reason: collision with root package name */
    private final File f10819d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f10820e;

    public C1858iW(C2375pia pia, File file, File file2, File file3) {
        this.f10816a = pia;
        this.f10817b = file;
        this.f10818c = file3;
        this.f10819d = file2;
    }

    public final boolean a() {
        return System.currentTimeMillis() / 1000 > this.f10816a.q();
    }

    public final boolean a(long j) {
        return this.f10816a.q() - (System.currentTimeMillis() / 1000) < 3600;
    }

    public final C2375pia b() {
        return this.f10816a;
    }

    public final File c() {
        return this.f10817b;
    }

    public final File d() {
        return this.f10818c;
    }

    public final byte[] e() {
        if (this.f10820e == null) {
            this.f10820e = C1999kW.b(this.f10819d);
        }
        byte[] bArr = this.f10820e;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
