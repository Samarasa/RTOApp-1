package c.b.b.b.d.f;

import c.b.b.b.d.f.Fb;
import java.util.Iterator;
import java.util.Map;

final class Db<T extends Fb<T>> {

    /* renamed from: a  reason: collision with root package name */
    private static final Db f4119a = new Db(true);

    /* renamed from: b  reason: collision with root package name */
    final Oc<T, Object> f4120b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4121c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4122d;

    private Db() {
        this.f4120b = Oc.a(16);
    }

    private Db(Oc<T, Object> oc) {
        this.f4120b = oc;
        b();
    }

    private Db(boolean z) {
        this(Oc.a(0));
        b();
    }

    public static int a(Fb<?> fb, Object obj) {
        fb.b();
        throw null;
    }

    public static <T extends Fb<T>> Db<T> a() {
        return f4119a;
    }

    private static <T extends Fb<T>> boolean a(Map.Entry<T, Object> entry) {
        ((Fb) entry.getKey()).l();
        throw null;
    }

    private final void b(T t, Object obj) {
        t.e();
        throw null;
    }

    private final void b(Map.Entry<T, Object> entry) {
        Fb fb = (Fb) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof Xb) {
            Xb xb = (Xb) value;
            Xb.c();
            throw null;
        }
        fb.e();
        throw null;
    }

    private static int c(Map.Entry<T, Object> entry) {
        entry.getValue();
        ((Fb) entry.getKey()).l();
        throw null;
    }

    public final void a(Db<T> db) {
        if (db.f4120b.c() <= 0) {
            Iterator<Map.Entry<T, Object>> it = db.f4120b.d().iterator();
            if (it.hasNext()) {
                b(it.next());
                throw null;
            }
            return;
        }
        b(db.f4120b.b(0));
        throw null;
    }

    public final void b() {
        if (!this.f4121c) {
            this.f4120b.a();
            this.f4121c = true;
        }
    }

    public final boolean c() {
        return this.f4121c;
    }

    public final /* synthetic */ Object clone() {
        Db db = new Db();
        if (this.f4120b.c() <= 0) {
            Iterator<Map.Entry<T, Object>> it = this.f4120b.d().iterator();
            if (!it.hasNext()) {
                db.f4122d = this.f4122d;
                return db;
            }
            Map.Entry next = it.next();
            db.b((Fb) next.getKey(), next.getValue());
            throw null;
        }
        Map.Entry<T, Object> b2 = this.f4120b.b(0);
        db.b((Fb) b2.getKey(), b2.getValue());
        throw null;
    }

    public final Iterator<Map.Entry<T, Object>> d() {
        return this.f4122d ? new C0300bc(this.f4120b.entrySet().iterator()) : this.f4120b.entrySet().iterator();
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> e() {
        return this.f4122d ? new C0300bc(this.f4120b.e().iterator()) : this.f4120b.e().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Db)) {
            return false;
        }
        return this.f4120b.equals(((Db) obj).f4120b);
    }

    public final boolean f() {
        if (this.f4120b.c() <= 0) {
            Iterator<Map.Entry<T, Object>> it = this.f4120b.d().iterator();
            if (!it.hasNext()) {
                return true;
            }
            a(it.next());
            throw null;
        }
        a(this.f4120b.b(0));
        throw null;
    }

    public final int g() {
        if (this.f4120b.c() <= 0) {
            Iterator<Map.Entry<T, Object>> it = this.f4120b.d().iterator();
            if (!it.hasNext()) {
                return 0;
            }
            c(it.next());
            throw null;
        }
        c(this.f4120b.b(0));
        throw null;
    }

    public final int hashCode() {
        return this.f4120b.hashCode();
    }
}
