package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Wf  reason: case insensitive filesystem */
public class C1143Wf extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final Ara f9153a;

    /* renamed from: b  reason: collision with root package name */
    private long f9154b;

    public C1143Wf() {
        this.f9153a = null;
    }

    public C1143Wf(Ara ara) {
        this.f9153a = ara;
    }

    public C1143Wf(String str) {
        super(str);
        this.f9153a = null;
    }

    public C1143Wf(Throwable th) {
        super(th);
        this.f9153a = null;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j) {
        this.f9154b = j;
    }
}
