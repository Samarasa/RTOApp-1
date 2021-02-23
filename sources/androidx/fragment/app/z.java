package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.B;
import androidx.lifecycle.C;
import androidx.lifecycle.D;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

class z extends B {

    /* renamed from: c  reason: collision with root package name */
    private static final C.a f1176c = new y();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<C0158h> f1177d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<String, z> f1178e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<String, D> f1179f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private final boolean f1180g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1181h = false;
    private boolean i = false;

    z(boolean z) {
        this.f1180g = z;
    }

    static z a(D d2) {
        return (z) new C(d2, f1176c).a(z.class);
    }

    /* access modifiers changed from: package-private */
    public boolean a(C0158h hVar) {
        return this.f1177d.add(hVar);
    }

    /* access modifiers changed from: protected */
    public void b() {
        if (v.f1148c) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1181h = true;
    }

    /* access modifiers changed from: package-private */
    public void b(C0158h hVar) {
        if (v.f1148c) {
            Log.d("FragmentManager", "Clearing non-config state for " + hVar);
        }
        z zVar = this.f1178e.get(hVar.f1112f);
        if (zVar != null) {
            zVar.b();
            this.f1178e.remove(hVar.f1112f);
        }
        D d2 = this.f1179f.get(hVar.f1112f);
        if (d2 != null) {
            d2.a();
            this.f1179f.remove(hVar.f1112f);
        }
    }

    /* access modifiers changed from: package-private */
    public z c(C0158h hVar) {
        z zVar = this.f1178e.get(hVar.f1112f);
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(this.f1180g);
        this.f1178e.put(hVar.f1112f, zVar2);
        return zVar2;
    }

    /* access modifiers changed from: package-private */
    public Collection<C0158h> c() {
        return this.f1177d;
    }

    /* access modifiers changed from: package-private */
    public D d(C0158h hVar) {
        D d2 = this.f1179f.get(hVar.f1112f);
        if (d2 != null) {
            return d2;
        }
        D d3 = new D();
        this.f1179f.put(hVar.f1112f, d3);
        return d3;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f1181h;
    }

    /* access modifiers changed from: package-private */
    public boolean e(C0158h hVar) {
        return this.f1177d.remove(hVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        return this.f1177d.equals(zVar.f1177d) && this.f1178e.equals(zVar.f1178e) && this.f1179f.equals(zVar.f1179f);
    }

    /* access modifiers changed from: package-private */
    public boolean f(C0158h hVar) {
        if (!this.f1177d.contains(hVar)) {
            return true;
        }
        return this.f1180g ? this.f1181h : !this.i;
    }

    public int hashCode() {
        return (((this.f1177d.hashCode() * 31) + this.f1178e.hashCode()) * 31) + this.f1179f.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<C0158h> it = this.f1177d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f1178e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1179f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
