package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class BM implements JO<Object> {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f6269a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final String f6270b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6271c;

    /* renamed from: d  reason: collision with root package name */
    private final C2111lt f6272d;

    /* renamed from: e  reason: collision with root package name */
    private final C2563sT f6273e;

    /* renamed from: f  reason: collision with root package name */
    private final SS f6274f;

    public BM(String str, String str2, C2111lt ltVar, C2563sT sTVar, SS ss) {
        this.f6270b = str;
        this.f6271c = str2;
        this.f6272d = ltVar;
        this.f6273e = sTVar;
        this.f6274f = ss;
    }

    public final LY<Object> a() {
        Bundle bundle = new Bundle();
        if (((Boolean) Qqa.e().a(F.Sd)).booleanValue()) {
            this.f6272d.a(this.f6274f.f8618d);
            bundle.putAll(this.f6273e.a());
        }
        return DY.a(new EM(this, bundle));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bundle bundle, Bundle bundle2) {
        if (!((Boolean) Qqa.e().a(F.Sd)).booleanValue()) {
            if (((Boolean) Qqa.e().a(F.Rd)).booleanValue()) {
                synchronized (f6269a) {
                    this.f6272d.a(this.f6274f.f8618d);
                    bundle2.putBundle("quality_signals", this.f6273e.a());
                }
                bundle2.putString("seq_num", this.f6270b);
                bundle2.putString("session_id", this.f6271c);
            }
            this.f6272d.a(this.f6274f.f8618d);
            bundle = this.f6273e.a();
        }
        bundle2.putBundle("quality_signals", bundle);
        bundle2.putString("seq_num", this.f6270b);
        bundle2.putString("session_id", this.f6271c);
    }
}
