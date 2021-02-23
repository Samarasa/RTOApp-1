package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import b.e.b;
import c.b.b.b.d.f.B;
import c.b.b.b.d.f.L;
import c.b.b.b.d.f.Lb;
import c.b.b.b.d.f.M;
import c.b.b.b.d.f.N;
import c.b.b.b.d.f.Wb;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class _b extends C3158he implements Ke {

    /* renamed from: d  reason: collision with root package name */
    private static int f13486d = 65535;

    /* renamed from: e  reason: collision with root package name */
    private static int f13487e = 2;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Map<String, String>> f13488f = new b();

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f13489g = new b();

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f13490h = new b();
    private final Map<String, M> i = new b();
    private final Map<String, Map<String, Integer>> j = new b();
    private final Map<String, String> k = new b();

    _b(C3176ke keVar) {
        super(keVar);
    }

    private final M a(String str, byte[] bArr) {
        if (bArr == null) {
            return M.x();
        }
        try {
            M.a w = M.w();
            oe.a(w, bArr);
            M m = (M) ((Lb) w.j());
            Db B = h().B();
            String str2 = null;
            Long valueOf = m.o() ? Long.valueOf(m.p()) : null;
            if (m.q()) {
                str2 = m.r();
            }
            B.a("Parsed config. version, gmp_app_id", valueOf, str2);
            return m;
        } catch (Wb | RuntimeException e2) {
            h().w().a("Unable to merge remote config. appId", Bb.a(str), e2);
            return M.x();
        }
    }

    private static Map<String, String> a(M m) {
        b bVar = new b();
        if (m != null) {
            for (N next : m.s()) {
                bVar.put(next.o(), next.p());
            }
        }
        return bVar;
    }

    private final void a(String str, M.a aVar) {
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        if (aVar != null) {
            for (int i2 = 0; i2 < aVar.k(); i2++) {
                L.a aVar2 = (L.a) aVar.a(i2).k();
                if (TextUtils.isEmpty(aVar2.k())) {
                    h().w().a("EventConfig contained null event name");
                } else {
                    String a2 = Ac.a(aVar2.k());
                    if (!TextUtils.isEmpty(a2)) {
                        aVar2.a(a2);
                        aVar.a(i2, aVar2);
                    }
                    bVar.put(aVar2.k(), Boolean.valueOf(aVar2.l()));
                    bVar2.put(aVar2.k(), Boolean.valueOf(aVar2.m()));
                    if (aVar2.n()) {
                        if (aVar2.o() < f13487e || aVar2.o() > f13486d) {
                            h().w().a("Invalid sampling rate. Event name, sample rate", aVar2.k(), Integer.valueOf(aVar2.o()));
                        } else {
                            bVar3.put(aVar2.k(), Integer.valueOf(aVar2.o()));
                        }
                    }
                }
            }
        }
        this.f13489g.put(str, bVar);
        this.f13490h.put(str, bVar2);
        this.j.put(str, bVar3);
    }

    private final void i(String str) {
        r();
        c();
        C0563t.b(str);
        if (this.i.get(str) == null) {
            byte[] d2 = o().d(str);
            if (d2 == null) {
                this.f13488f.put(str, (Object) null);
                this.f13489g.put(str, (Object) null);
                this.f13490h.put(str, (Object) null);
                this.i.put(str, (Object) null);
                this.k.put(str, (Object) null);
                this.j.put(str, (Object) null);
                return;
            }
            M.a aVar = (M.a) a(str, d2).k();
            a(str, aVar);
            this.f13488f.put(str, a((M) aVar.j()));
            this.i.put(str, (M) aVar.j());
            this.k.put(str, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    public final M a(String str) {
        r();
        c();
        C0563t.b(str);
        i(str);
        return this.i.get(str);
    }

    public final String a(String str, String str2) {
        c();
        i(str);
        Map map = this.f13488f.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str, byte[] bArr, String str2) {
        r();
        c();
        C0563t.b(str);
        M.a aVar = (M.a) a(str, bArr).k();
        if (aVar == null) {
            return false;
        }
        a(str, aVar);
        this.i.put(str, (M) aVar.j());
        this.k.put(str, str2);
        this.f13488f.put(str, a((M) aVar.j()));
        o().b(str, (List<B>) new ArrayList(aVar.l()));
        try {
            aVar.m();
            bArr = ((M) ((Lb) aVar.j())).g();
        } catch (RuntimeException e2) {
            h().w().a("Unable to serialize reduced-size config. Storing full config instead. appId", Bb.a(str), e2);
        }
        C3129d o = o();
        C0563t.b(str);
        o.c();
        o.r();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        try {
            if (((long) o.v().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                o.h().t().a("Failed to update remote config (got 0). appId", Bb.a(str));
            }
        } catch (SQLiteException e3) {
            o.h().t().a("Error storing remote config. appId", Bb.a(str), e3);
        }
        this.i.put(str, (M) aVar.j());
        return true;
    }

    /* access modifiers changed from: protected */
    public final String b(String str) {
        c();
        return this.k.get(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean b(String str, String str2) {
        Boolean bool;
        c();
        i(str);
        if (g(str) && se.e(str2)) {
            return true;
        }
        if (h(str) && se.a(str2)) {
            return true;
        }
        Map map = this.f13489g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    /* access modifiers changed from: protected */
    public final void c(String str) {
        c();
        this.k.put(str, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final boolean c(String str, String str2) {
        Boolean bool;
        c();
        i(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        Map map = this.f13490h.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final int d(String str, String str2) {
        Integer num;
        c();
        i(str);
        Map map = this.j.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final /* bridge */ /* synthetic */ C3159i d() {
        return super.d();
    }

    /* access modifiers changed from: package-private */
    public final void d(String str) {
        c();
        this.i.remove(str);
    }

    public final /* bridge */ /* synthetic */ C3248zb e() {
        return super.e();
    }

    /* access modifiers changed from: package-private */
    public final boolean e(String str) {
        c();
        M a2 = a(str);
        if (a2 == null) {
            return false;
        }
        return a2.v();
    }

    /* access modifiers changed from: package-private */
    public final long f(String str) {
        String a2 = a(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(a2)) {
            return 0;
        }
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException e2) {
            h().w().a("Unable to parse timezone offset. appId", Bb.a(str), e2);
            return 0;
        }
    }

    public final /* bridge */ /* synthetic */ Context f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ Zb g() {
        return super.g();
    }

    /* access modifiers changed from: package-private */
    public final boolean g(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_internal"));
    }

    public final /* bridge */ /* synthetic */ Bb h() {
        return super.h();
    }

    /* access modifiers changed from: package-private */
    public final boolean h(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_public"));
    }

    public final /* bridge */ /* synthetic */ He i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ e j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ se k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Lb l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Ie m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ oe n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ C3129d o() {
        return super.o();
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }
}
