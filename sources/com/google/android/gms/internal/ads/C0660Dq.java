package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.m;
import com.google.android.gms.ads.internal.overlay.q;
import com.google.android.gms.ads.internal.util.fa;
import com.google.android.gms.common.util.e;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Dq  reason: case insensitive filesystem */
public final class C0660Dq implements q, C0872Lu, C0950Ou, C2739una {

    /* renamed from: a  reason: collision with root package name */
    private final C2673tq f6636a;

    /* renamed from: b  reason: collision with root package name */
    private final C0608Bq f6637b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<C2313on> f6638c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private final C2580sf<JSONObject, JSONObject> f6639d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f6640e;

    /* renamed from: f  reason: collision with root package name */
    private final e f6641f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f6642g = new AtomicBoolean(false);

    /* renamed from: h  reason: collision with root package name */
    private final C0712Fq f6643h = new C0712Fq();
    private boolean i = false;
    private WeakReference<?> j = new WeakReference<>(this);

    public C0660Dq(C2084lf lfVar, C0608Bq bq, Executor executor, C2673tq tqVar, e eVar) {
        this.f6636a = tqVar;
        C1447cf<JSONObject> cfVar = C1376bf.f9933b;
        this.f6639d = lfVar.a("google.afma.activeView.handleUpdate", cfVar, cfVar);
        this.f6637b = bq;
        this.f6640e = executor;
        this.f6641f = eVar;
    }

    private final void L() {
        for (C2313on b2 : this.f6638c) {
            this.f6636a.b(b2);
        }
        this.f6636a.a();
    }

    public final synchronized void H() {
        if (!(this.j.get() != null)) {
            K();
        } else if (!this.i && this.f6642g.get()) {
            try {
                this.f6643h.f6957d = this.f6641f.b();
                JSONObject a2 = this.f6637b.a(this.f6643h);
                for (C2313on cq : this.f6638c) {
                    this.f6640e.execute(new C0634Cq(cq, a2));
                }
                C1459cl.b(this.f6639d.a(a2), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e2) {
                fa.e("Failed to call ActiveViewJS", e2);
            }
        }
    }

    public final synchronized void I() {
        if (this.f6642g.compareAndSet(false, true)) {
            this.f6636a.a(this);
            H();
        }
    }

    public final void J() {
    }

    public final synchronized void K() {
        L();
        this.i = true;
    }

    public final void Tb() {
    }

    public final void a(m mVar) {
    }

    public final synchronized void a(C2313on onVar) {
        this.f6638c.add(onVar);
        this.f6636a.a(onVar);
    }

    public final synchronized void a(C2810vna vna) {
        this.f6643h.f6954a = vna.m;
        this.f6643h.f6959f = vna;
        H();
    }

    public final void a(Object obj) {
        this.j = new WeakReference<>(obj);
    }

    public final synchronized void b(Context context) {
        this.f6643h.f6955b = false;
        H();
    }

    public final synchronized void c(Context context) {
        this.f6643h.f6958e = "u";
        H();
        L();
        this.i = true;
    }

    public final synchronized void d(Context context) {
        this.f6643h.f6955b = true;
        H();
    }

    public final synchronized void onPause() {
        this.f6643h.f6955b = true;
        H();
    }

    public final synchronized void onResume() {
        this.f6643h.f6955b = false;
        H();
    }
}
