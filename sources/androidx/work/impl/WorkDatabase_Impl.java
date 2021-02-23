package androidx.work.impl;

import androidx.room.a;
import androidx.room.g;
import androidx.room.u;
import androidx.work.impl.c.B;
import androidx.work.impl.c.C0190b;
import androidx.work.impl.c.C0192d;
import androidx.work.impl.c.C0194f;
import androidx.work.impl.c.D;
import androidx.work.impl.c.i;
import androidx.work.impl.c.k;
import androidx.work.impl.c.m;
import androidx.work.impl.c.p;
import androidx.work.impl.c.z;
import b.p.a.c;
import java.util.HashMap;

public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile p m;
    private volatile C0190b n;
    private volatile B o;
    private volatile C0194f p;
    private volatile k q;

    /* access modifiers changed from: protected */
    public c a(a aVar) {
        u uVar = new u(aVar, new l(this, 6), "c84d23ade98552f1cec71088c1f0794c", "1db8206f0da6aa81bbdd2d99a82d9e14");
        c.b.a a2 = c.b.a(aVar.f1511b);
        a2.a(aVar.f1512c);
        a2.a((c.a) uVar);
        return aVar.f1510a.a(a2.a());
    }

    /* access modifiers changed from: protected */
    public g d() {
        return new g(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName");
    }

    public C0190b l() {
        C0190b bVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new C0192d(this);
            }
            bVar = this.n;
        }
        return bVar;
    }

    public C0194f p() {
        C0194f fVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new i(this);
            }
            fVar = this.p;
        }
        return fVar;
    }

    public k q() {
        k kVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new m(this);
            }
            kVar = this.q;
        }
        return kVar;
    }

    public p r() {
        p pVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new z(this);
            }
            pVar = this.m;
        }
        return pVar;
    }

    public B s() {
        B b2;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new D(this);
            }
            b2 = this.o;
        }
        return b2;
    }
}
