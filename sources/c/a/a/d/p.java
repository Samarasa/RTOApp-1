package c.a.a.d;

import android.util.Log;
import c.a.a.g.b;
import c.a.a.i.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public class p {

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f3533a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    private final List<b> f3534b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f3535c;

    private boolean a(b bVar, boolean z) {
        boolean z2 = true;
        if (bVar == null) {
            return true;
        }
        boolean remove = this.f3533a.remove(bVar);
        if (!this.f3534b.remove(bVar) && !remove) {
            z2 = false;
        }
        if (z2) {
            bVar.clear();
            if (z) {
                bVar.a();
            }
        }
        return z2;
    }

    public void a() {
        for (T a2 : k.a(this.f3533a)) {
            a(a2, false);
        }
        this.f3534b.clear();
    }

    public boolean a(b bVar) {
        return a(bVar, true);
    }

    public void b() {
        this.f3535c = true;
        for (T t : k.a(this.f3533a)) {
            if (t.isRunning()) {
                t.clear();
                this.f3534b.add(t);
            }
        }
    }

    public void b(b bVar) {
        this.f3533a.add(bVar);
        if (!this.f3535c) {
            bVar.f();
            return;
        }
        bVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f3534b.add(bVar);
    }

    public void c() {
        for (T t : k.a(this.f3533a)) {
            if (!t.isComplete() && !t.e()) {
                t.clear();
                if (!this.f3535c) {
                    t.f();
                } else {
                    this.f3534b.add(t);
                }
            }
        }
    }

    public void d() {
        this.f3535c = false;
        for (T t : k.a(this.f3533a)) {
            if (!t.isComplete() && !t.isRunning()) {
                t.f();
            }
        }
        this.f3534b.clear();
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f3533a.size() + ", isPaused=" + this.f3535c + "}";
    }
}
