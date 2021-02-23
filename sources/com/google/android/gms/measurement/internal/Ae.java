package com.google.android.gms.measurement.internal;

import b.e.b;
import c.b.b.b.d.f.C0291aa;
import c.b.b.b.d.f.C0407qf;
import c.b.b.b.d.f.Q;
import c.b.b.b.d.f.S;
import c.b.b.b.d.f.Z;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class Ae {

    /* renamed from: a  reason: collision with root package name */
    private String f13171a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f13172b;

    /* renamed from: c  reason: collision with root package name */
    private Z f13173c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public BitSet f13174d;

    /* renamed from: e  reason: collision with root package name */
    private BitSet f13175e;

    /* renamed from: f  reason: collision with root package name */
    private Map<Integer, Long> f13176f;

    /* renamed from: g  reason: collision with root package name */
    private Map<Integer, List<Long>> f13177g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ ye f13178h;

    private Ae(ye yeVar, String str) {
        this.f13178h = yeVar;
        this.f13171a = str;
        this.f13172b = true;
        this.f13174d = new BitSet();
        this.f13175e = new BitSet();
        this.f13176f = new b();
        this.f13177g = new b();
    }

    private Ae(ye yeVar, String str, Z z, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.f13178h = yeVar;
        this.f13171a = str;
        this.f13174d = bitSet;
        this.f13175e = bitSet2;
        this.f13176f = map;
        this.f13177g = new b();
        if (map2 != null) {
            for (Integer next : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(next));
                this.f13177g.put(next, arrayList);
            }
        }
        this.f13172b = false;
        this.f13173c = z;
    }

    /* synthetic */ Ae(ye yeVar, String str, Z z, BitSet bitSet, BitSet bitSet2, Map map, Map map2, Be be) {
        this(yeVar, str, z, bitSet, bitSet2, map, map2);
    }

    /* synthetic */ Ae(ye yeVar, String str, Be be) {
        this(yeVar, str);
    }

    /* access modifiers changed from: package-private */
    public final Q a(int i, List<Integer> list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List<Integer> list2 = list;
        Q.a v = Q.v();
        v.a(i);
        v.a(this.f13172b);
        Z z = this.f13173c;
        if (z != null) {
            v.a(z);
        }
        Z.a w = Z.w();
        w.b((Iterable<? extends Long>) oe.a(this.f13174d));
        w.a((Iterable<? extends Long>) oe.a(this.f13175e));
        Map<Integer, Long> map = this.f13176f;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(map.size());
            for (Integer intValue : this.f13176f.keySet()) {
                int intValue2 = intValue.intValue();
                S.a s = S.s();
                s.a(intValue2);
                s.a(this.f13176f.get(Integer.valueOf(intValue2)).longValue());
                arrayList.add((S) s.j());
            }
        }
        w.c(arrayList);
        Map<Integer, List<Long>> map2 = this.f13177g;
        if (map2 == null) {
            arrayList2 = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer next : this.f13177g.keySet()) {
                C0291aa.a s2 = C0291aa.s();
                s2.a(next.intValue());
                List list3 = this.f13177g.get(next);
                if (list3 != null) {
                    Collections.sort(list3);
                    s2.a((Iterable<? extends Long>) list3);
                }
                arrayList3.add((C0291aa) s2.j());
            }
            arrayList2 = arrayList3;
        }
        if ((!C0407qf.b() || !this.f13178h.m().d(this.f13171a, C3202q.ua)) && v.k()) {
            List<C0291aa> u = v.l().u();
            if (!u.isEmpty()) {
                ArrayList arrayList4 = new ArrayList(arrayList2);
                b bVar = new b();
                for (C0291aa next2 : u) {
                    if (next2.o() && next2.r() > 0) {
                        bVar.put(Integer.valueOf(next2.p()), Long.valueOf(next2.b(next2.r() - 1)));
                    }
                }
                for (int i2 = 0; i2 < arrayList4.size(); i2++) {
                    C0291aa aaVar = (C0291aa) arrayList4.get(i2);
                    Long l = (Long) bVar.remove(aaVar.o() ? Integer.valueOf(aaVar.p()) : null);
                    if (l != null && (list2 == null || !list2.contains(Integer.valueOf(aaVar.p())))) {
                        ArrayList arrayList5 = new ArrayList();
                        if (l.longValue() < aaVar.b(0)) {
                            arrayList5.add(l);
                        }
                        arrayList5.addAll(aaVar.q());
                        C0291aa.a aVar = (C0291aa.a) aaVar.k();
                        aVar.k();
                        aVar.a((Iterable<? extends Long>) arrayList5);
                        arrayList4.set(i2, (C0291aa) aVar.j());
                    }
                }
                for (Integer num : bVar.keySet()) {
                    C0291aa.a s3 = C0291aa.s();
                    s3.a(num.intValue());
                    s3.a(((Long) bVar.get(num)).longValue());
                    arrayList4.add((C0291aa) s3.j());
                }
                arrayList2 = arrayList4;
            }
        }
        w.d(arrayList2);
        v.a(w);
        return (Q) v.j();
    }

    /* access modifiers changed from: package-private */
    public final void a(Fe fe) {
        int a2 = fe.a();
        Boolean bool = fe.f13255c;
        if (bool != null) {
            this.f13175e.set(a2, bool.booleanValue());
        }
        Boolean bool2 = fe.f13256d;
        if (bool2 != null) {
            this.f13174d.set(a2, bool2.booleanValue());
        }
        if (fe.f13257e != null) {
            Long l = this.f13176f.get(Integer.valueOf(a2));
            long longValue = fe.f13257e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f13176f.put(Integer.valueOf(a2), Long.valueOf(longValue));
            }
        }
        if (fe.f13258f != null) {
            List list = this.f13177g.get(Integer.valueOf(a2));
            if (list == null) {
                list = new ArrayList();
                this.f13177g.put(Integer.valueOf(a2), list);
            }
            if (C0407qf.b() && this.f13178h.m().d(this.f13171a, C3202q.ua) && fe.b()) {
                list.clear();
            }
            list.add(Long.valueOf(fe.f13258f.longValue() / 1000));
        }
    }
}
