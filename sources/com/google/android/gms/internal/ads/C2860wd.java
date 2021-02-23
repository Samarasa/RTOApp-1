package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.C0547c;

/* renamed from: com.google.android.gms.internal.ads.wd  reason: case insensitive filesystem */
final class C2860wd implements C0547c.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1742gl f12637a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2576sd f12638b;

    C2860wd(C2576sd sdVar, C1742gl glVar) {
        this.f12638b = sdVar;
        this.f12637a = glVar;
    }

    public final void d(int i) {
        C1742gl glVar = this.f12637a;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        glVar.a((Throwable) new RuntimeException(sb.toString()));
    }

    public final void h(Bundle bundle) {
        try {
            this.f12637a.a(this.f12638b.f12104a.z());
        } catch (DeadObjectException e2) {
            this.f12637a.a((Throwable) e2);
        }
    }
}
