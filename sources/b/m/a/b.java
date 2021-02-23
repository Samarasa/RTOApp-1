package b.m.a;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.B;
import androidx.lifecycle.C;
import androidx.lifecycle.D;
import androidx.lifecycle.k;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import b.e.j;
import b.m.b.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class b extends a {

    /* renamed from: a  reason: collision with root package name */
    static boolean f2631a = false;

    /* renamed from: b  reason: collision with root package name */
    private final k f2632b;

    /* renamed from: c  reason: collision with root package name */
    private final c f2633c;

    public static class a<D> extends s<D> implements a.C0040a<D> {
        private final int k;
        private final Bundle l;
        private final b.m.b.a<D> m;
        private k n;
        private C0039b<D> o;
        private b.m.b.a<D> p;

        /* access modifiers changed from: package-private */
        public b.m.b.a<D> a(boolean z) {
            if (b.f2631a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.m.a();
            throw null;
        }

        /* access modifiers changed from: protected */
        public void a() {
            if (b.f2631a) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.m.c();
            throw null;
        }

        public void a(t<? super D> tVar) {
            super.a(tVar);
            this.n = null;
            this.o = null;
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.k);
            printWriter.print(" mArgs=");
            printWriter.println(this.l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.m);
            b.m.b.a<D> aVar = this.m;
            aVar.a(str + "  ", fileDescriptor, printWriter, strArr);
            throw null;
        }

        /* access modifiers changed from: protected */
        public void b() {
            if (b.f2631a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.m.d();
            throw null;
        }

        public void b(D d2) {
            super.b(d2);
            b.m.b.a<D> aVar = this.p;
            if (aVar != null) {
                aVar.b();
                throw null;
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            k kVar = this.n;
            C0039b<D> bVar = this.o;
            if (kVar != null && bVar != null) {
                super.a(bVar);
                a(kVar, bVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.k);
            sb.append(" : ");
            b.h.i.a.a(this.m, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: b.m.a.b$b  reason: collision with other inner class name */
    static class C0039b<D> implements t<D> {
    }

    static class c extends B {

        /* renamed from: c  reason: collision with root package name */
        private static final C.a f2634c = new c();

        /* renamed from: d  reason: collision with root package name */
        private j<a> f2635d = new j<>();

        /* renamed from: e  reason: collision with root package name */
        private boolean f2636e = false;

        c() {
        }

        static c a(D d2) {
            return (c) new C(d2, f2634c).a(c.class);
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f2635d.b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                if (this.f2635d.b() > 0) {
                    a e2 = this.f2635d.e(0);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f2635d.c(0));
                    printWriter.print(": ");
                    printWriter.println(e2.toString());
                    e2.a(str2, fileDescriptor, printWriter, strArr);
                    throw null;
                }
            }
        }

        /* access modifiers changed from: protected */
        public void b() {
            super.b();
            if (this.f2635d.b() <= 0) {
                this.f2635d.a();
            } else {
                this.f2635d.e(0).a(true);
                throw null;
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            int b2 = this.f2635d.b();
            for (int i = 0; i < b2; i++) {
                this.f2635d.e(i).c();
            }
        }
    }

    b(k kVar, D d2) {
        this.f2632b = kVar;
        this.f2633c = c.a(d2);
    }

    public void a() {
        this.f2633c.c();
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f2633c.a(str, fileDescriptor, printWriter, strArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        b.h.i.a.a(this.f2632b, sb);
        sb.append("}}");
        return sb.toString();
    }
}
