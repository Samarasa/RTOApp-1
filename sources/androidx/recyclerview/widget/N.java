package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import b.e.f;
import b.h.i.d;
import b.h.i.e;

class N {

    /* renamed from: a  reason: collision with root package name */
    final b.e.b<RecyclerView.x, a> f1306a = new b.e.b<>();

    /* renamed from: b  reason: collision with root package name */
    final f<RecyclerView.x> f1307b = new f<>();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        static d<a> f1308a = new e(20);

        /* renamed from: b  reason: collision with root package name */
        int f1309b;

        /* renamed from: c  reason: collision with root package name */
        RecyclerView.f.c f1310c;

        /* renamed from: d  reason: collision with root package name */
        RecyclerView.f.c f1311d;

        private a() {
        }

        static void a() {
            do {
            } while (f1308a.a() != null);
        }

        static void a(a aVar) {
            aVar.f1309b = 0;
            aVar.f1310c = null;
            aVar.f1311d = null;
            f1308a.a(aVar);
        }

        static a b() {
            a a2 = f1308a.a();
            return a2 == null ? new a() : a2;
        }
    }

    interface b {
        void a(RecyclerView.x xVar);

        void a(RecyclerView.x xVar, RecyclerView.f.c cVar, RecyclerView.f.c cVar2);

        void b(RecyclerView.x xVar, RecyclerView.f.c cVar, RecyclerView.f.c cVar2);

        void c(RecyclerView.x xVar, RecyclerView.f.c cVar, RecyclerView.f.c cVar2);
    }

    N() {
    }

    private RecyclerView.f.c a(RecyclerView.x xVar, int i) {
        a d2;
        RecyclerView.f.c cVar;
        int a2 = this.f1306a.a((Object) xVar);
        if (a2 >= 0 && (d2 = this.f1306a.d(a2)) != null) {
            int i2 = d2.f1309b;
            if ((i2 & i) != 0) {
                d2.f1309b = (i ^ -1) & i2;
                if (i == 4) {
                    cVar = d2.f1310c;
                } else if (i == 8) {
                    cVar = d2.f1311d;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((d2.f1309b & 12) == 0) {
                    this.f1306a.c(a2);
                    a.a(d2);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.x a(long j) {
        return this.f1307b.b(j);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f1306a.clear();
        this.f1307b.a();
    }

    /* access modifiers changed from: package-private */
    public void a(long j, RecyclerView.x xVar) {
        this.f1307b.c(j, xVar);
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar) {
        RecyclerView.f.c cVar;
        RecyclerView.f.c cVar2;
        for (int size = this.f1306a.size() - 1; size >= 0; size--) {
            RecyclerView.x b2 = this.f1306a.b(size);
            a c2 = this.f1306a.c(size);
            int i = c2.f1309b;
            if ((i & 3) != 3) {
                if ((i & 1) != 0) {
                    cVar = c2.f1310c;
                    if (cVar != null) {
                        cVar2 = c2.f1311d;
                    }
                } else {
                    if ((i & 14) != 14) {
                        if ((i & 12) == 12) {
                            bVar.c(b2, c2.f1310c, c2.f1311d);
                        } else if ((i & 4) != 0) {
                            cVar = c2.f1310c;
                            cVar2 = null;
                        } else if ((i & 8) == 0) {
                        }
                        a.a(c2);
                    }
                    bVar.a(b2, c2.f1310c, c2.f1311d);
                    a.a(c2);
                }
                bVar.b(b2, cVar, cVar2);
                a.a(c2);
            }
            bVar.a(b2);
            a.a(c2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.x xVar) {
        a aVar = this.f1306a.get(xVar);
        if (aVar == null) {
            aVar = a.b();
            this.f1306a.put(xVar, aVar);
        }
        aVar.f1309b |= 1;
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.x xVar, RecyclerView.f.c cVar) {
        a aVar = this.f1306a.get(xVar);
        if (aVar == null) {
            aVar = a.b();
            this.f1306a.put(xVar, aVar);
        }
        aVar.f1309b |= 2;
        aVar.f1310c = cVar;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        a.a();
    }

    /* access modifiers changed from: package-private */
    public void b(RecyclerView.x xVar, RecyclerView.f.c cVar) {
        a aVar = this.f1306a.get(xVar);
        if (aVar == null) {
            aVar = a.b();
            this.f1306a.put(xVar, aVar);
        }
        aVar.f1311d = cVar;
        aVar.f1309b |= 8;
    }

    /* access modifiers changed from: package-private */
    public boolean b(RecyclerView.x xVar) {
        a aVar = this.f1306a.get(xVar);
        return (aVar == null || (aVar.f1309b & 1) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void c(RecyclerView.x xVar, RecyclerView.f.c cVar) {
        a aVar = this.f1306a.get(xVar);
        if (aVar == null) {
            aVar = a.b();
            this.f1306a.put(xVar, aVar);
        }
        aVar.f1310c = cVar;
        aVar.f1309b |= 4;
    }

    /* access modifiers changed from: package-private */
    public boolean c(RecyclerView.x xVar) {
        a aVar = this.f1306a.get(xVar);
        return (aVar == null || (aVar.f1309b & 4) == 0) ? false : true;
    }

    public void d(RecyclerView.x xVar) {
        g(xVar);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.f.c e(RecyclerView.x xVar) {
        return a(xVar, 8);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.f.c f(RecyclerView.x xVar) {
        return a(xVar, 4);
    }

    /* access modifiers changed from: package-private */
    public void g(RecyclerView.x xVar) {
        a aVar = this.f1306a.get(xVar);
        if (aVar != null) {
            aVar.f1309b &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    public void h(RecyclerView.x xVar) {
        int b2 = this.f1307b.b() - 1;
        while (true) {
            if (b2 < 0) {
                break;
            } else if (xVar == this.f1307b.c(b2)) {
                this.f1307b.b(b2);
                break;
            } else {
                b2--;
            }
        }
        a remove = this.f1306a.remove(xVar);
        if (remove != null) {
            a.a(remove);
        }
    }
}
