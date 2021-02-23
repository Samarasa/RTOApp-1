package androidx.lifecycle;

import androidx.lifecycle.g;
import b.b.a.b.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class m extends g {

    /* renamed from: b  reason: collision with root package name */
    private b.b.a.b.a<j, a> f1232b = new b.b.a.b.a<>();

    /* renamed from: c  reason: collision with root package name */
    private g.b f1233c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakReference<k> f1234d;

    /* renamed from: e  reason: collision with root package name */
    private int f1235e = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1236f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1237g = false;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<g.b> f1238h = new ArrayList<>();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        g.b f1239a;

        /* renamed from: b  reason: collision with root package name */
        i f1240b;

        a(j jVar, g.b bVar) {
            this.f1240b = p.a((Object) jVar);
            this.f1239a = bVar;
        }

        /* access modifiers changed from: package-private */
        public void a(k kVar, g.a aVar) {
            g.b a2 = m.a(aVar);
            this.f1239a = m.a(this.f1239a, a2);
            this.f1240b.a(kVar, aVar);
            this.f1239a = a2;
        }
    }

    public m(k kVar) {
        this.f1234d = new WeakReference<>(kVar);
        this.f1233c = g.b.INITIALIZED;
    }

    static g.b a(g.a aVar) {
        switch (l.f1230a[aVar.ordinal()]) {
            case 1:
            case 2:
                return g.b.CREATED;
            case 3:
            case 4:
                return g.b.STARTED;
            case 5:
                return g.b.RESUMED;
            case 6:
                return g.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    static g.b a(g.b bVar, g.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void a(k kVar) {
        Iterator<Map.Entry<j, a>> descendingIterator = this.f1232b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f1237g) {
            Map.Entry next = descendingIterator.next();
            a aVar = (a) next.getValue();
            while (aVar.f1239a.compareTo(this.f1233c) > 0 && !this.f1237g && this.f1232b.contains(next.getKey())) {
                g.a c2 = c(aVar.f1239a);
                e(a(c2));
                aVar.a(kVar, c2);
                c();
            }
        }
    }

    private void b(k kVar) {
        b<K, V>.d d2 = this.f1232b.d();
        while (d2.hasNext() && !this.f1237g) {
            Map.Entry entry = (Map.Entry) d2.next();
            a aVar = (a) entry.getValue();
            while (aVar.f1239a.compareTo(this.f1233c) < 0 && !this.f1237g && this.f1232b.contains(entry.getKey())) {
                e(aVar.f1239a);
                aVar.a(kVar, f(aVar.f1239a));
                c();
            }
        }
    }

    private boolean b() {
        if (this.f1232b.size() == 0) {
            return true;
        }
        g.b bVar = this.f1232b.c().getValue().f1239a;
        g.b bVar2 = this.f1232b.e().getValue().f1239a;
        return bVar == bVar2 && this.f1233c == bVar2;
    }

    private static g.a c(g.b bVar) {
        int i = l.f1231b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return g.a.ON_DESTROY;
        } else {
            if (i == 3) {
                return g.a.ON_STOP;
            }
            if (i == 4) {
                return g.a.ON_PAUSE;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
            throw new IllegalArgumentException();
        }
    }

    private g.b c(j jVar) {
        Map.Entry<j, a> b2 = this.f1232b.b(jVar);
        g.b bVar = null;
        g.b bVar2 = b2 != null ? b2.getValue().f1239a : null;
        if (!this.f1238h.isEmpty()) {
            ArrayList<g.b> arrayList = this.f1238h;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return a(a(this.f1233c, bVar2), bVar);
    }

    private void c() {
        ArrayList<g.b> arrayList = this.f1238h;
        arrayList.remove(arrayList.size() - 1);
    }

    private void d() {
        k kVar = (k) this.f1234d.get();
        if (kVar != null) {
            while (!b()) {
                this.f1237g = false;
                if (this.f1233c.compareTo(this.f1232b.c().getValue().f1239a) < 0) {
                    a(kVar);
                }
                Map.Entry<j, a> e2 = this.f1232b.e();
                if (!this.f1237g && e2 != null && this.f1233c.compareTo(e2.getValue().f1239a) > 0) {
                    b(kVar);
                }
            }
            this.f1237g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    private void d(g.b bVar) {
        if (this.f1233c != bVar) {
            this.f1233c = bVar;
            if (this.f1236f || this.f1235e != 0) {
                this.f1237g = true;
                return;
            }
            this.f1236f = true;
            d();
            this.f1236f = false;
        }
    }

    private void e(g.b bVar) {
        this.f1238h.add(bVar);
    }

    private static g.a f(g.b bVar) {
        int i = l.f1231b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return g.a.ON_START;
            }
            if (i == 3) {
                return g.a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return g.a.ON_CREATE;
    }

    public g.b a() {
        return this.f1233c;
    }

    @Deprecated
    public void a(g.b bVar) {
        b(bVar);
    }

    public void a(j jVar) {
        k kVar;
        g.b bVar = this.f1233c;
        g.b bVar2 = g.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = g.b.INITIALIZED;
        }
        a aVar = new a(jVar, bVar2);
        if (this.f1232b.b(jVar, aVar) == null && (kVar = (k) this.f1234d.get()) != null) {
            boolean z = this.f1235e != 0 || this.f1236f;
            g.b c2 = c(jVar);
            this.f1235e++;
            while (aVar.f1239a.compareTo(c2) < 0 && this.f1232b.contains(jVar)) {
                e(aVar.f1239a);
                aVar.a(kVar, f(aVar.f1239a));
                c();
                c2 = c(jVar);
            }
            if (!z) {
                d();
            }
            this.f1235e--;
        }
    }

    public void b(g.a aVar) {
        d(a(aVar));
    }

    public void b(g.b bVar) {
        d(bVar);
    }

    public void b(j jVar) {
        this.f1232b.remove(jVar);
    }
}
