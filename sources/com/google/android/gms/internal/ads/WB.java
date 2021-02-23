package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

public final class WB implements C1088Uc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final C1009Rb f9108a;

    /* renamed from: b  reason: collision with root package name */
    private final VB f9109b;

    /* renamed from: c  reason: collision with root package name */
    private final Qga<PB> f9110c;

    public WB(C1059Sz sz, C0877Lz lz, VB vb, Qga<PB> qga) {
        this.f9108a = sz.b(lz.e());
        this.f9109b = vb;
        this.f9110c = qga;
    }

    public final void a() {
        if (this.f9108a != null) {
            this.f9109b.a("/nativeAdCustomClick", (C1088Uc<Object>) this);
        }
    }

    public final void a(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.f9108a.a(this.f9110c.get(), str);
        } catch (RemoteException e2) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            C1018Rk.c(sb.toString(), e2);
        }
    }
}
