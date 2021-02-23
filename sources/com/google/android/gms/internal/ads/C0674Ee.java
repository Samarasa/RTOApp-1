package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.U;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ee  reason: case insensitive filesystem */
final class C0674Ee implements C1088Uc<C1090Ue> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Qba f6719a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1870ie f6720b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ U f6721c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C2862we f6722d;

    C0674Ee(C2862we weVar, Qba qba, C1870ie ieVar, U u) {
        this.f6722d = weVar;
        this.f6719a = qba;
        this.f6720b = ieVar;
        this.f6721c = u;
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        C1090Ue ue = (C1090Ue) obj;
        synchronized (this.f6722d.f12639a) {
            C1018Rk.c("JS Engine is requesting an update");
            if (this.f6722d.f12646h == 0) {
                C1018Rk.c("Starting reload.");
                int unused = this.f6722d.f12646h = 2;
                this.f6722d.a(this.f6719a);
            }
            this.f6720b.a("/requestReload", (C1088Uc) this.f6721c.a());
        }
    }
}
