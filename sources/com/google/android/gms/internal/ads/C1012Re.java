package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Re  reason: case insensitive filesystem */
final /* synthetic */ class C1012Re implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1038Se f8493a;

    /* renamed from: b  reason: collision with root package name */
    private final C1870ie f8494b;

    C1012Re(C1038Se se2, C1870ie ieVar) {
        this.f8493a = se2;
        this.f8494b = ieVar;
    }

    public final void run() {
        C1038Se se2 = this.f8493a;
        C1870ie ieVar = this.f8494b;
        se2.f8651a.f7987d.a(ieVar);
        ieVar.destroy();
    }
}
