package b.f.a.a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public List<h> f2303a;

    /* renamed from: b  reason: collision with root package name */
    int f2304b = -1;

    /* renamed from: c  reason: collision with root package name */
    int f2305c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2306d = false;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f2307e = {this.f2304b, this.f2305c};

    /* renamed from: f  reason: collision with root package name */
    List<h> f2308f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    List<h> f2309g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    HashSet<h> f2310h = new HashSet<>();
    HashSet<h> i = new HashSet<>();
    List<h> j = new ArrayList();
    List<h> k = new ArrayList();

    j(List<h> list) {
        this.f2303a = list;
    }

    j(List<h> list, boolean z) {
        this.f2303a = list;
        this.f2306d = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(b.f.a.a.h r7) {
        /*
            r6 = this;
            boolean r0 = r7.ja
            if (r0 == 0) goto L_0x00d9
            boolean r0 = r7.y()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            b.f.a.a.f r0 = r7.x
            b.f.a.a.f r0 = r0.f2268d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x001b
            b.f.a.a.f r3 = r7.x
            goto L_0x001d
        L_0x001b:
            b.f.a.a.f r3 = r7.v
        L_0x001d:
            b.f.a.a.f r3 = r3.f2268d
            if (r3 == 0) goto L_0x0043
            b.f.a.a.h r4 = r3.f2266b
            boolean r5 = r4.ka
            if (r5 != 0) goto L_0x002a
            r6.a((b.f.a.a.h) r4)
        L_0x002a:
            b.f.a.a.f$c r4 = r3.f2267c
            b.f.a.a.f$c r5 = b.f.a.a.f.c.RIGHT
            if (r4 != r5) goto L_0x003a
            b.f.a.a.h r3 = r3.f2266b
            int r4 = r3.L
            int r3 = r3.s()
            int r3 = r3 + r4
            goto L_0x0044
        L_0x003a:
            b.f.a.a.f$c r5 = b.f.a.a.f.c.LEFT
            if (r4 != r5) goto L_0x0043
            b.f.a.a.h r3 = r3.f2266b
            int r3 = r3.L
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            if (r0 == 0) goto L_0x004e
            b.f.a.a.f r0 = r7.x
            int r0 = r0.b()
            int r3 = r3 - r0
            goto L_0x005a
        L_0x004e:
            b.f.a.a.f r0 = r7.v
            int r0 = r0.b()
            int r4 = r7.s()
            int r0 = r0 + r4
            int r3 = r3 + r0
        L_0x005a:
            int r0 = r7.s()
            int r0 = r3 - r0
            r7.a(r0, r3)
            b.f.a.a.f r0 = r7.z
            b.f.a.a.f r0 = r0.f2268d
            if (r0 == 0) goto L_0x0085
            b.f.a.a.h r1 = r0.f2266b
            boolean r3 = r1.ka
            if (r3 != 0) goto L_0x0072
            r6.a((b.f.a.a.h) r1)
        L_0x0072:
            b.f.a.a.h r0 = r0.f2266b
            int r1 = r0.M
            int r0 = r0.V
            int r1 = r1 + r0
            int r0 = r7.V
            int r1 = r1 - r0
            int r0 = r7.I
            int r0 = r0 + r1
            r7.e(r1, r0)
            r7.ka = r2
            return
        L_0x0085:
            b.f.a.a.f r0 = r7.y
            b.f.a.a.f r0 = r0.f2268d
            if (r0 == 0) goto L_0x008c
            r1 = 1
        L_0x008c:
            if (r1 == 0) goto L_0x0091
            b.f.a.a.f r0 = r7.y
            goto L_0x0093
        L_0x0091:
            b.f.a.a.f r0 = r7.w
        L_0x0093:
            b.f.a.a.f r0 = r0.f2268d
            if (r0 == 0) goto L_0x00b8
            b.f.a.a.h r4 = r0.f2266b
            boolean r5 = r4.ka
            if (r5 != 0) goto L_0x00a0
            r6.a((b.f.a.a.h) r4)
        L_0x00a0:
            b.f.a.a.f$c r4 = r0.f2267c
            b.f.a.a.f$c r5 = b.f.a.a.f.c.BOTTOM
            if (r4 != r5) goto L_0x00b0
            b.f.a.a.h r0 = r0.f2266b
            int r3 = r0.M
            int r0 = r0.i()
            int r3 = r3 + r0
            goto L_0x00b8
        L_0x00b0:
            b.f.a.a.f$c r5 = b.f.a.a.f.c.TOP
            if (r4 != r5) goto L_0x00b8
            b.f.a.a.h r0 = r0.f2266b
            int r3 = r0.M
        L_0x00b8:
            if (r1 == 0) goto L_0x00c2
            b.f.a.a.f r0 = r7.y
            int r0 = r0.b()
            int r3 = r3 - r0
            goto L_0x00ce
        L_0x00c2:
            b.f.a.a.f r0 = r7.w
            int r0 = r0.b()
            int r1 = r7.i()
            int r0 = r0 + r1
            int r3 = r3 + r0
        L_0x00ce:
            int r0 = r7.i()
            int r0 = r3 - r0
            r7.e(r0, r3)
            r7.ka = r2
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.a.j.a(b.f.a.a.h):void");
    }

    private void a(ArrayList<h> arrayList, h hVar) {
        if (!hVar.la) {
            arrayList.add(hVar);
            hVar.la = true;
            if (!hVar.y()) {
                if (hVar instanceof m) {
                    m mVar = (m) hVar;
                    int i2 = mVar.wa;
                    for (int i3 = 0; i3 < i2; i3++) {
                        a(arrayList, mVar.va[i3]);
                    }
                }
                for (f fVar : hVar.D) {
                    f fVar2 = fVar.f2268d;
                    if (fVar2 != null) {
                        h hVar2 = fVar2.f2266b;
                        if (!(fVar2 == null || hVar2 == hVar.k())) {
                            a(arrayList, hVar2);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public List<h> a() {
        if (!this.j.isEmpty()) {
            return this.j;
        }
        int size = this.f2303a.size();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = this.f2303a.get(i2);
            if (!hVar.ja) {
                a((ArrayList<h>) (ArrayList) this.j, hVar);
            }
        }
        this.k.clear();
        this.k.addAll(this.f2303a);
        this.k.removeAll(this.j);
        return this.j;
    }

    public List<h> a(int i2) {
        if (i2 == 0) {
            return this.f2308f;
        }
        if (i2 == 1) {
            return this.f2309g;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(h hVar, int i2) {
        HashSet<h> hashSet;
        if (i2 == 0) {
            hashSet = this.f2310h;
        } else if (i2 == 1) {
            hashSet = this.i;
        } else {
            return;
        }
        hashSet.add(hVar);
    }

    /* access modifiers changed from: package-private */
    public Set<h> b(int i2) {
        if (i2 == 0) {
            return this.f2310h;
        }
        if (i2 == 1) {
            return this.i;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int size = this.k.size();
        for (int i2 = 0; i2 < size; i2++) {
            a(this.k.get(i2));
        }
    }
}
