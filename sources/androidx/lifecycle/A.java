package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.g;

public class A {

    /* renamed from: a  reason: collision with root package name */
    private final m f1182a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f1183b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    private a f1184c;

    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final m f1185a;

        /* renamed from: b  reason: collision with root package name */
        final g.a f1186b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f1187c = false;

        a(m mVar, g.a aVar) {
            this.f1185a = mVar;
            this.f1186b = aVar;
        }

        public void run() {
            if (!this.f1187c) {
                this.f1185a.b(this.f1186b);
                this.f1187c = true;
            }
        }
    }

    public A(k kVar) {
        this.f1182a = new m(kVar);
    }

    private void a(g.a aVar) {
        a aVar2 = this.f1184c;
        if (aVar2 != null) {
            aVar2.run();
        }
        this.f1184c = new a(this.f1182a, aVar);
        this.f1183b.postAtFrontOfQueue(this.f1184c);
    }

    public g a() {
        return this.f1182a;
    }

    public void b() {
        a(g.a.ON_START);
    }

    public void c() {
        a(g.a.ON_CREATE);
    }

    public void d() {
        a(g.a.ON_STOP);
        a(g.a.ON_DESTROY);
    }

    public void e() {
        a(g.a.ON_START);
    }
}
