package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: androidx.fragment.app.n  reason: case insensitive filesystem */
public abstract class C0164n {

    /* renamed from: a  reason: collision with root package name */
    static final C0162l f1131a = new C0162l();

    /* renamed from: b  reason: collision with root package name */
    private C0162l f1132b = null;

    /* renamed from: androidx.fragment.app.n$a */
    public interface a {
    }

    /* renamed from: androidx.fragment.app.n$b */
    public static abstract class b {
        public abstract void a(C0164n nVar, C0158h hVar);

        public abstract void a(C0164n nVar, C0158h hVar, Context context);

        public abstract void a(C0164n nVar, C0158h hVar, Bundle bundle);

        public abstract void a(C0164n nVar, C0158h hVar, View view, Bundle bundle);

        public abstract void b(C0164n nVar, C0158h hVar);

        public abstract void b(C0164n nVar, C0158h hVar, Context context);

        public abstract void b(C0164n nVar, C0158h hVar, Bundle bundle);

        public abstract void c(C0164n nVar, C0158h hVar);

        public abstract void c(C0164n nVar, C0158h hVar, Bundle bundle);

        public abstract void d(C0164n nVar, C0158h hVar);

        public abstract void d(C0164n nVar, C0158h hVar, Bundle bundle);

        public abstract void e(C0164n nVar, C0158h hVar);

        public abstract void f(C0164n nVar, C0158h hVar);

        public abstract void g(C0164n nVar, C0158h hVar);
    }

    /* renamed from: androidx.fragment.app.n$c */
    public interface c {
        void onBackStackChanged();
    }

    public abstract C a();

    public abstract C0158h a(String str);

    public abstract void a(int i, int i2);

    public void a(C0162l lVar) {
        this.f1132b = lVar;
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public C0162l b() {
        if (this.f1132b == null) {
            this.f1132b = f1131a;
        }
        return this.f1132b;
    }

    public abstract List<C0158h> c();

    public abstract boolean d();
}
