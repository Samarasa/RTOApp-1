package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.tF  reason: case insensitive filesystem */
public abstract class C2620tF implements C2214nY<C2515ri, OS> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0769Hv f12167a;

    public C2620tF(C0769Hv hv) {
        this.f12167a = hv;
    }

    /* access modifiers changed from: protected */
    public abstract LY<OS> a(C2515ri riVar);

    public final /* synthetic */ LY a(Object obj) {
        C2515ri riVar = (C2515ri) obj;
        this.f12167a.a(riVar);
        LY<OS> a2 = a(riVar);
        DY.a(a2, new C2549sF(this), (Executor) C1252_k.f9704f);
        return a2;
    }
}
