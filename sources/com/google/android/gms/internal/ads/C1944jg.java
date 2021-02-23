package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.formats.c;
import com.google.android.gms.ads.mediation.u;
import com.google.android.gms.ads.w;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.jg  reason: case insensitive filesystem */
public final class C1944jg implements u {

    /* renamed from: a  reason: collision with root package name */
    private final Date f10967a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10968b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f10969c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f10970d;

    /* renamed from: e  reason: collision with root package name */
    private final Location f10971e;

    /* renamed from: f  reason: collision with root package name */
    private final int f10972f;

    /* renamed from: g  reason: collision with root package name */
    private final C1368bb f10973g;

    /* renamed from: h  reason: collision with root package name */
    private final List<String> f10974h = new ArrayList();
    private final boolean i;
    private final Map<String, Boolean> j = new HashMap();
    private final int k;
    private final String l;

    public C1944jg(Date date, int i2, Set<String> set, Location location, boolean z, int i3, C1368bb bbVar, List<String> list, boolean z2, int i4, String str) {
        Map<String, Boolean> map;
        String str2;
        boolean z3;
        this.f10967a = date;
        this.f10968b = i2;
        this.f10969c = set;
        this.f10971e = location;
        this.f10970d = z;
        this.f10972f = i3;
        this.f10973g = bbVar;
        this.i = z2;
        this.k = i4;
        this.l = str;
        if (list != null) {
            for (String next : list) {
                if (next.startsWith("custom:")) {
                    String[] split = next.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            map = this.j;
                            str2 = split[1];
                            z3 = true;
                        } else if ("false".equals(split[2])) {
                            map = this.j;
                            str2 = split[1];
                            z3 = false;
                        }
                        map.put(str2, z3);
                    }
                } else {
                    this.f10974h.add(next);
                }
            }
        }
    }

    public final int a() {
        return this.f10972f;
    }

    public final boolean b() {
        List<String> list = this.f10974h;
        return list != null && list.contains("6");
    }

    @Deprecated
    public final boolean c() {
        return this.i;
    }

    public final boolean d() {
        List<String> list = this.f10974h;
        if (list != null) {
            return list.contains("2") || this.f10974h.contains("6");
        }
        return false;
    }

    @Deprecated
    public final Date e() {
        return this.f10967a;
    }

    public final Map<String, Boolean> f() {
        return this.j;
    }

    public final boolean g() {
        return this.f10970d;
    }

    public final Location getLocation() {
        return this.f10971e;
    }

    public final Set<String> h() {
        return this.f10969c;
    }

    public final c i() {
        C1905j jVar;
        if (this.f10973g == null) {
            return null;
        }
        c.a aVar = new c.a();
        aVar.b(this.f10973g.f9910b);
        aVar.b(this.f10973g.f9911c);
        aVar.a(this.f10973g.f9912d);
        C1368bb bbVar = this.f10973g;
        if (bbVar.f9909a >= 2) {
            aVar.a(bbVar.f9913e);
        }
        C1368bb bbVar2 = this.f10973g;
        if (bbVar2.f9909a >= 3 && (jVar = bbVar2.f9914f) != null) {
            aVar.a(new w(jVar));
        }
        return aVar.a();
    }

    public final boolean j() {
        List<String> list = this.f10974h;
        return list != null && list.contains("3");
    }

    public final boolean k() {
        List<String> list = this.f10974h;
        if (list != null) {
            return list.contains("1") || this.f10974h.contains("6");
        }
        return false;
    }

    @Deprecated
    public final int l() {
        return this.f10968b;
    }
}
