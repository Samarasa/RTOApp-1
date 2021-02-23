package g;

import g.a.e;
import h.f;
import java.util.ArrayList;
import java.util.List;

public final class x extends J {

    /* renamed from: a  reason: collision with root package name */
    private static final C f15305a = C.a("application/x-www-form-urlencoded");

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f15306b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f15307c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f15308a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List<String> f15309b = new ArrayList();

        public a a(String str, String str2) {
            this.f15308a.add(A.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
            this.f15309b.add(A.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
            return this;
        }

        public x a() {
            return new x(this.f15308a, this.f15309b);
        }
    }

    x(List<String> list, List<String> list2) {
        this.f15306b = e.a(list);
        this.f15307c = e.a(list2);
    }

    private long a(f fVar, boolean z) {
        h.e eVar = z ? new h.e() : fVar.b();
        int size = this.f15306b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                eVar.writeByte(38);
            }
            eVar.a(this.f15306b.get(i));
            eVar.writeByte(61);
            eVar.a(this.f15307c.get(i));
        }
        if (!z) {
            return 0;
        }
        long o = eVar.o();
        eVar.a();
        return o;
    }

    public long a() {
        return a((f) null, true);
    }

    public void a(f fVar) {
        a(fVar, false);
    }

    public C b() {
        return f15305a;
    }
}
