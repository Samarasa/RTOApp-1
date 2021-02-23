package androidx.work.impl.b;

import android.content.Context;
import androidx.work.h;
import androidx.work.impl.b.a.b;
import androidx.work.impl.b.a.c;
import androidx.work.impl.b.a.e;
import androidx.work.impl.b.a.f;
import androidx.work.impl.b.a.g;
import androidx.work.impl.c.o;
import androidx.work.impl.utils.b.a;
import java.util.ArrayList;
import java.util.List;

public class d implements c.a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1783a = h.a("WorkConstraintsTracker");

    /* renamed from: b  reason: collision with root package name */
    private final c f1784b;

    /* renamed from: c  reason: collision with root package name */
    private final c<?>[] f1785c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f1786d = new Object();

    public d(Context context, a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f1784b = cVar;
        this.f1785c = new c[]{new androidx.work.impl.b.a.a(applicationContext, aVar), new b(applicationContext, aVar), new androidx.work.impl.b.a.h(applicationContext, aVar), new androidx.work.impl.b.a.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
    }

    public void a() {
        synchronized (this.f1786d) {
            for (c<?> a2 : this.f1785c) {
                a2.a();
            }
        }
    }

    public void a(List<String> list) {
        synchronized (this.f1786d) {
            ArrayList arrayList = new ArrayList();
            for (String next : list) {
                if (a(next)) {
                    h.a().a(f1783a, String.format("Constraints met for %s", new Object[]{next}), new Throwable[0]);
                    arrayList.add(next);
                }
            }
            if (this.f1784b != null) {
                this.f1784b.b(arrayList);
            }
        }
    }

    public boolean a(String str) {
        synchronized (this.f1786d) {
            for (c<?> cVar : this.f1785c) {
                if (cVar.a(str)) {
                    h.a().a(f1783a, String.format("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()}), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void b(List<String> list) {
        synchronized (this.f1786d) {
            if (this.f1784b != null) {
                this.f1784b.a(list);
            }
        }
    }

    public void c(List<o> list) {
        synchronized (this.f1786d) {
            for (c<?> a2 : this.f1785c) {
                a2.a((c.a) null);
            }
            for (c<?> a3 : this.f1785c) {
                a3.a(list);
            }
            for (c<?> a4 : this.f1785c) {
                a4.a((c.a) this);
            }
        }
    }
}
