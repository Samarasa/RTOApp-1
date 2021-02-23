package c.b.b.b.d.f;

import c.b.b.b.d.f.Lb;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.b.b.b.d.f.yb  reason: case insensitive filesystem */
public class C0458yb {

    /* renamed from: a  reason: collision with root package name */
    private static volatile C0458yb f4636a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile C0458yb f4637b;

    /* renamed from: c  reason: collision with root package name */
    private static final C0458yb f4638c = new C0458yb(true);

    /* renamed from: d  reason: collision with root package name */
    private final Map<a, Lb.f<?, ?>> f4639d;

    /* renamed from: c.b.b.b.d.f.yb$a */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f4640a;

        /* renamed from: b  reason: collision with root package name */
        private final int f4641b;

        a(Object obj, int i) {
            this.f4640a = obj;
            this.f4641b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4640a == aVar.f4640a && this.f4641b == aVar.f4641b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f4640a) * 65535) + this.f4641b;
        }
    }

    C0458yb() {
        this.f4639d = new HashMap();
    }

    private C0458yb(boolean z) {
        this.f4639d = Collections.emptyMap();
    }

    public static C0458yb a() {
        C0458yb ybVar = f4636a;
        if (ybVar == null) {
            synchronized (C0458yb.class) {
                ybVar = f4636a;
                if (ybVar == null) {
                    ybVar = f4638c;
                    f4636a = ybVar;
                }
            }
        }
        return ybVar;
    }

    public static C0458yb b() {
        C0458yb ybVar = f4637b;
        if (ybVar != null) {
            return ybVar;
        }
        synchronized (C0458yb.class) {
            C0458yb ybVar2 = f4637b;
            if (ybVar2 != null) {
                return ybVar2;
            }
            C0458yb a2 = Jb.a(C0458yb.class);
            f4637b = a2;
            return a2;
        }
    }

    public final <ContainingType extends C0445wc> Lb.f<ContainingType, ?> a(ContainingType containingtype, int i) {
        return this.f4639d.get(new a(containingtype, i));
    }
}
