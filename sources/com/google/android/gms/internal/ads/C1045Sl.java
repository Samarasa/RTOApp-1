package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Sl  reason: case insensitive filesystem */
public final class C1045Sl {

    /* renamed from: a  reason: collision with root package name */
    private final int f8668a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Zoa> f8669b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8670c;

    /* renamed from: d  reason: collision with root package name */
    private final InputStream f8671d;

    public C1045Sl(int i, List<Zoa> list) {
        this(i, list, -1, (InputStream) null);
    }

    public C1045Sl(int i, List<Zoa> list, int i2, InputStream inputStream) {
        this.f8668a = i;
        this.f8669b = list;
        this.f8670c = i2;
        this.f8671d = inputStream;
    }

    public final InputStream a() {
        return this.f8671d;
    }

    public final int b() {
        return this.f8670c;
    }

    public final int c() {
        return this.f8668a;
    }

    public final List<Zoa> d() {
        return Collections.unmodifiableList(this.f8669b);
    }
}
