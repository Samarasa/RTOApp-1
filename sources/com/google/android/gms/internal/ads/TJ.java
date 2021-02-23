package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.C1405bv;
import java.util.Iterator;

public final class TJ<AdT, AdapterT, ListenerT extends C1405bv> implements C2480rH<AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final C2906xH<AdapterT, ListenerT> f8763a;

    /* renamed from: b  reason: collision with root package name */
    private final AH<AdT, AdapterT, ListenerT> f8764b;

    /* renamed from: c  reason: collision with root package name */
    private final VU f8765c;

    /* renamed from: d  reason: collision with root package name */
    private final PY f8766d;

    public TJ(VU vu, PY py, C2906xH<AdapterT, ListenerT> xHVar, AH<AdT, AdapterT, ListenerT> ah) {
        this.f8765c = vu;
        this.f8766d = py;
        this.f8764b = ah;
        this.f8763a = xHVar;
    }

    static String a(String str, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(OS os, C2988yS ySVar, C2693uH uHVar, Void voidR) {
        return this.f8764b.b(os, ySVar, uHVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(OS os, C2988yS ySVar, C2693uH uHVar) {
        this.f8764b.a(os, ySVar, uHVar);
    }

    public final boolean a(OS os, C2988yS ySVar) {
        return !ySVar.s.isEmpty();
    }

    public final LY<AdT> b(OS os, C2988yS ySVar) {
        C2693uH<AdapterT, ListenerT> uHVar;
        Iterator<String> it = ySVar.s.iterator();
        while (true) {
            if (!it.hasNext()) {
                uHVar = null;
                break;
            }
            try {
                uHVar = this.f8763a.a(it.next(), ySVar.u);
                break;
            } catch (WS unused) {
            }
        }
        if (uHVar == null) {
            return DY.a((Throwable) new XI("unable to instantiate mediation adapter class"));
        }
        C1742gl glVar = new C1742gl();
        uHVar.f12307c.a(new UJ(this, uHVar, glVar));
        if (ySVar.H) {
            Bundle bundle = os.f8087a.f7415a.f8618d.m;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        return this.f8765c.a(SU.ADAPTER_LOAD_AD_SYN).a((EU) new SJ(this, os, ySVar, uHVar), this.f8766d).a(SU.ADAPTER_LOAD_AD_ACK).a(glVar).a(SU.ADAPTER_WRAP_ADAPTER).a(new WJ(this, os, ySVar, uHVar)).a();
    }
}
