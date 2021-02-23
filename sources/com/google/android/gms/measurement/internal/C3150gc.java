package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.text.TextUtils;
import c.b.b.b.b.j;
import c.b.b.b.b.k;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.measurement.internal.gc  reason: case insensitive filesystem */
public final class C3150gc extends C3213sb {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C3176ke f13582a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f13583b;

    /* renamed from: c  reason: collision with root package name */
    private String f13584c;

    public C3150gc(C3176ke keVar) {
        this(keVar, (String) null);
    }

    private C3150gc(C3176ke keVar, String str) {
        C0563t.a(keVar);
        this.f13582a = keVar;
        this.f13584c = null;
    }

    private final void a(Runnable runnable) {
        C0563t.a(runnable);
        if (this.f13582a.g().t()) {
            runnable.run();
        } else {
            this.f13582a.g().a(runnable);
        }
    }

    private final void a(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f13583b == null) {
                        if (!"com.google.android.gms".equals(this.f13584c) && !r.a(this.f13582a.f(), Binder.getCallingUid())) {
                            if (!k.a(this.f13582a.f()).a(Binder.getCallingUid())) {
                                z2 = false;
                                this.f13583b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f13583b = Boolean.valueOf(z2);
                    }
                    if (this.f13583b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e2) {
                    this.f13582a.h().t().a("Measurement Service called with invalid calling package. appId", Bb.a(str));
                    throw e2;
                }
            }
            if (this.f13584c == null && j.a(this.f13582a.f(), Binder.getCallingUid(), str)) {
                this.f13584c = str;
            }
            if (!str.equals(this.f13584c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f13582a.h().t().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    private final void b(xe xeVar, boolean z) {
        C0563t.a(xeVar);
        a(xeVar.f13822a, false);
        this.f13582a.o().a(xeVar.f13823b, xeVar.r, xeVar.v);
    }

    public final List<re> a(xe xeVar, boolean z) {
        b(xeVar, false);
        try {
            List<te> list = (List) this.f13582a.g().a(new C3214sc(this, xeVar)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (te teVar : list) {
                if (z || !se.e(teVar.f13776c)) {
                    arrayList.add(new re(teVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f13582a.h().t().a("Failed to get user attributes. appId", Bb.a(xeVar.f13822a), e2);
            return null;
        }
    }

    public final List<Ge> a(String str, String str2, xe xeVar) {
        b(xeVar, false);
        try {
            return (List) this.f13582a.g().a(new C3190nc(this, xeVar, str, str2)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.f13582a.h().t().a("Failed to get conditional user properties", e2);
            return Collections.emptyList();
        }
    }

    public final List<Ge> a(String str, String str2, String str3) {
        a(str, true);
        try {
            return (List) this.f13582a.g().a(new C3185mc(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.f13582a.h().t().a("Failed to get conditional user properties", e2);
            return Collections.emptyList();
        }
    }

    public final List<re> a(String str, String str2, String str3, boolean z) {
        a(str, true);
        try {
            List<te> list = (List) this.f13582a.g().a(new C3174kc(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (te teVar : list) {
                if (z || !se.e(teVar.f13776c)) {
                    arrayList.add(new re(teVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f13582a.h().t().a("Failed to get user attributes. appId", Bb.a(str), e2);
            return Collections.emptyList();
        }
    }

    public final List<re> a(String str, String str2, boolean z, xe xeVar) {
        b(xeVar, false);
        try {
            List<te> list = (List) this.f13582a.g().a(new C3180lc(this, xeVar, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (te teVar : list) {
                if (z || !se.e(teVar.f13776c)) {
                    arrayList.add(new re(teVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f13582a.h().t().a("Failed to get user attributes. appId", Bb.a(xeVar.f13822a), e2);
            return Collections.emptyList();
        }
    }

    public final void a(long j, String str, String str2, String str3) {
        a((Runnable) new C3224uc(this, str2, str3, str, j));
    }

    public final void a(Ge ge) {
        C0563t.a(ge);
        C0563t.a(ge.f13269c);
        a(ge.f13267a, true);
        a((Runnable) new C3162ic(this, new Ge(ge)));
    }

    public final void a(Ge ge, xe xeVar) {
        C0563t.a(ge);
        C0563t.a(ge.f13269c);
        b(xeVar, false);
        Ge ge2 = new Ge(ge);
        ge2.f13267a = xeVar.f13822a;
        a((Runnable) new C3239xc(this, ge2, xeVar));
    }

    public final void a(C3192o oVar, xe xeVar) {
        C0563t.a(oVar);
        b(xeVar, false);
        a((Runnable) new C3195oc(this, oVar, xeVar));
    }

    public final void a(C3192o oVar, String str, String str2) {
        C0563t.a(oVar);
        C0563t.b(str);
        a(str, true);
        a((Runnable) new C3209rc(this, oVar, str));
    }

    public final void a(re reVar, xe xeVar) {
        C0563t.a(reVar);
        b(xeVar, false);
        a((Runnable) new C3219tc(this, reVar, xeVar));
    }

    public final void a(xe xeVar) {
        a(xeVar.f13822a, false);
        a((Runnable) new C3200pc(this, xeVar));
    }

    public final byte[] a(C3192o oVar, String str) {
        C0563t.b(str);
        C0563t.a(oVar);
        a(str, true);
        this.f13582a.h().A().a("Log and bundle. event", this.f13582a.n().a(oVar.f13696a));
        long c2 = this.f13582a.j().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f13582a.g().b(new C3205qc(this, oVar, str)).get();
            if (bArr == null) {
                this.f13582a.h().t().a("Log and bundle returned null. appId", Bb.a(str));
                bArr = new byte[0];
            }
            this.f13582a.h().A().a("Log and bundle processed. event, size, time_ms", this.f13582a.n().a(oVar.f13696a), Integer.valueOf(bArr.length), Long.valueOf((this.f13582a.j().c() / 1000000) - c2));
            return bArr;
        } catch (InterruptedException | ExecutionException e2) {
            this.f13582a.h().t().a("Failed to log and bundle. appId, event, error", Bb.a(str), this.f13582a.n().a(oVar.f13696a), e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final C3192o b(C3192o oVar, xe xeVar) {
        C3187n nVar;
        boolean z = false;
        if (!(!"_cmp".equals(oVar.f13696a) || (nVar = oVar.f13697b) == null || nVar.a() == 0)) {
            String d2 = oVar.f13697b.d("_cis");
            if (!TextUtils.isEmpty(d2) && (("referrer broadcast".equals(d2) || "referrer API".equals(d2)) && this.f13582a.b().e(xeVar.f13822a, C3202q.Q))) {
                z = true;
            }
        }
        if (!z) {
            return oVar;
        }
        this.f13582a.h().z().a("Event has been filtered ", oVar.toString());
        return new C3192o("_cmpx", oVar.f13697b, oVar.f13698c, oVar.f13699d);
    }

    public final void b(xe xeVar) {
        b(xeVar, false);
        a((Runnable) new C3168jc(this, xeVar));
    }

    public final String c(xe xeVar) {
        b(xeVar, false);
        return this.f13582a.d(xeVar);
    }

    public final void d(xe xeVar) {
        b(xeVar, false);
        a((Runnable) new C3229vc(this, xeVar));
    }
}
