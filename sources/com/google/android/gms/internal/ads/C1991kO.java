package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import c.b.b.b.c.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.kO  reason: case insensitive filesystem */
public final class C1991kO implements JO<C2062lO> {

    /* renamed from: a  reason: collision with root package name */
    private final PY f11048a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f11049b;

    /* renamed from: c  reason: collision with root package name */
    private final C2696uK f11050c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f11051d;

    /* renamed from: e  reason: collision with root package name */
    private final SS f11052e;

    /* renamed from: f  reason: collision with root package name */
    private final C2554sK f11053f;

    /* renamed from: g  reason: collision with root package name */
    private String f11054g;

    public C1991kO(PY py, ScheduledExecutorService scheduledExecutorService, String str, C2696uK uKVar, Context context, SS ss, C2554sK sKVar) {
        this.f11048a = py;
        this.f11049b = scheduledExecutorService;
        this.f11054g = str;
        this.f11050c = uKVar;
        this.f11051d = context;
        this.f11052e = ss;
        this.f11053f = sKVar;
    }

    public final LY<C2062lO> a() {
        return ((Boolean) Qqa.e().a(F.kb)).booleanValue() ? DY.a(new C2204nO(this), this.f11048a) : DY.a(null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(String str, List list, Bundle bundle) {
        C1742gl glVar = new C1742gl();
        this.f11053f.a(str);
        C0624Cg b2 = this.f11053f.b(str);
        if (b2 != null) {
            Bundle bundle2 = bundle;
            b2.a(b.a(this.f11051d), this.f11054g, bundle2, (Bundle) list.get(0), this.f11052e.f8619e, (C0754Hg) new BK(str, b2, glVar));
            return glVar;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY b() {
        Map<String, List<Bundle>> a2 = this.f11050c.a(this.f11054g, this.f11052e.f8620f);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : a2.entrySet()) {
            String str = (String) next.getKey();
            List list = (List) next.getValue();
            Bundle bundle = this.f11052e.f8618d.m;
            arrayList.add(C2710uY.c(DY.a(new C2133mO(this, str, list, bundle != null ? bundle.getBundle(str) : null), this.f11048a)).a(((Long) Qqa.e().a(F.jb)).longValue(), TimeUnit.MILLISECONDS, this.f11049b).a(Throwable.class, new C2346pO(str), (Executor) this.f11048a));
        }
        return DY.c(arrayList).a(new C2275oO(arrayList), this.f11048a);
    }
}
