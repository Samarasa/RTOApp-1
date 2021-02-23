package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.kA  reason: case insensitive filesystem */
public final class C1977kA implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final VB f11025a;

    /* renamed from: b  reason: collision with root package name */
    private final e f11026b;

    /* renamed from: c  reason: collision with root package name */
    private C1724gc f11027c;

    /* renamed from: d  reason: collision with root package name */
    private C1088Uc<Object> f11028d;

    /* renamed from: e  reason: collision with root package name */
    String f11029e;

    /* renamed from: f  reason: collision with root package name */
    Long f11030f;

    /* renamed from: g  reason: collision with root package name */
    WeakReference<View> f11031g;

    public C1977kA(VB vb, e eVar) {
        this.f11025a = vb;
        this.f11026b = eVar;
    }

    private final void l() {
        View view;
        this.f11029e = null;
        this.f11030f = null;
        WeakReference<View> weakReference = this.f11031g;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener((View.OnClickListener) null);
            this.f11031g = null;
        }
    }

    public final void a() {
        if (this.f11027c != null && this.f11030f != null) {
            l();
            try {
                this.f11027c.Sb();
            } catch (RemoteException e2) {
                C1018Rk.d("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void a(C1724gc gcVar) {
        this.f11027c = gcVar;
        C1088Uc<Object> uc = this.f11028d;
        if (uc != null) {
            this.f11025a.b("/unconfirmedClick", uc);
        }
        this.f11028d = new C2190nA(this, gcVar);
        this.f11025a.a("/unconfirmedClick", this.f11028d);
    }

    public final C1724gc b() {
        return this.f11027c;
    }

    public final void onClick(View view) {
        WeakReference<View> weakReference = this.f11031g;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.f11029e == null || this.f11030f == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("id", this.f11029e);
                hashMap.put("time_interval", String.valueOf(this.f11026b.a() - this.f11030f.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.f11025a.a("sendMessageToNativeJs", (Map<String, ?>) hashMap);
            }
            l();
        }
    }
}
