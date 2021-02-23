package b.f.a.a;

import b.f.a.a.f;
import java.util.ArrayList;

public class s {

    /* renamed from: a  reason: collision with root package name */
    private int f2322a;

    /* renamed from: b  reason: collision with root package name */
    private int f2323b;

    /* renamed from: c  reason: collision with root package name */
    private int f2324c;

    /* renamed from: d  reason: collision with root package name */
    private int f2325d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<a> f2326e = new ArrayList<>();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private f f2327a;

        /* renamed from: b  reason: collision with root package name */
        private f f2328b;

        /* renamed from: c  reason: collision with root package name */
        private int f2329c;

        /* renamed from: d  reason: collision with root package name */
        private f.b f2330d;

        /* renamed from: e  reason: collision with root package name */
        private int f2331e;

        public a(f fVar) {
            this.f2327a = fVar;
            this.f2328b = fVar.g();
            this.f2329c = fVar.b();
            this.f2330d = fVar.f();
            this.f2331e = fVar.a();
        }

        public void a(h hVar) {
            hVar.a(this.f2327a.h()).a(this.f2328b, this.f2329c, this.f2330d, this.f2331e);
        }

        public void b(h hVar) {
            int i;
            this.f2327a = hVar.a(this.f2327a.h());
            f fVar = this.f2327a;
            if (fVar != null) {
                this.f2328b = fVar.g();
                this.f2329c = this.f2327a.b();
                this.f2330d = this.f2327a.f();
                i = this.f2327a.a();
            } else {
                this.f2328b = null;
                i = 0;
                this.f2329c = 0;
                this.f2330d = f.b.STRONG;
            }
            this.f2331e = i;
        }
    }

    public s(h hVar) {
        this.f2322a = hVar.v();
        this.f2323b = hVar.w();
        this.f2324c = hVar.s();
        this.f2325d = hVar.i();
        ArrayList<f> b2 = hVar.b();
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            this.f2326e.add(new a(b2.get(i)));
        }
    }

    public void a(h hVar) {
        hVar.r(this.f2322a);
        hVar.s(this.f2323b);
        hVar.o(this.f2324c);
        hVar.g(this.f2325d);
        int size = this.f2326e.size();
        for (int i = 0; i < size; i++) {
            this.f2326e.get(i).a(hVar);
        }
    }

    public void b(h hVar) {
        this.f2322a = hVar.v();
        this.f2323b = hVar.w();
        this.f2324c = hVar.s();
        this.f2325d = hVar.i();
        int size = this.f2326e.size();
        for (int i = 0; i < size; i++) {
            this.f2326e.get(i).b(hVar);
        }
    }
}
