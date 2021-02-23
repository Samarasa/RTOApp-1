package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.C1143Wf;
import com.google.android.gms.internal.ads.C1218Zc;

final class A implements C1218Zc {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f5542a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ G f5543b;

    A(C0518y yVar, String str, G g2) {
        this.f5542a = str;
        this.f5543b = g2;
    }

    public final void a(C1143Wf wf) {
        String str = this.f5542a;
        String exc = wf.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(exc).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(exc);
        C1018Rk.d(sb.toString());
        this.f5543b.b(null);
    }
}
