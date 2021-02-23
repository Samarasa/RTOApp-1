package com.google.android.gms.internal.ads;

final /* synthetic */ class ME implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final FE f7805a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f7806b;

    /* renamed from: c  reason: collision with root package name */
    private final C1742gl f7807c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7808d;

    /* renamed from: e  reason: collision with root package name */
    private final long f7809e;

    ME(FE fe, Object obj, C1742gl glVar, String str, long j) {
        this.f7805a = fe;
        this.f7806b = obj;
        this.f7807c = glVar;
        this.f7808d = str;
        this.f7809e = j;
    }

    public final void run() {
        this.f7805a.a(this.f7806b, this.f7807c, this.f7808d, this.f7809e);
    }
}
