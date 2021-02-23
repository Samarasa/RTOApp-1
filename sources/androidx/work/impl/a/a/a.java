package androidx.work.impl.a.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.h;
import androidx.work.impl.b.c;
import androidx.work.impl.c.o;
import androidx.work.impl.d;
import androidx.work.impl.m;
import java.util.ArrayList;
import java.util.List;

public class a implements d, c, androidx.work.impl.a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1745a = h.a("GreedyScheduler");

    /* renamed from: b  reason: collision with root package name */
    private m f1746b;

    /* renamed from: c  reason: collision with root package name */
    private androidx.work.impl.b.d f1747c;

    /* renamed from: d  reason: collision with root package name */
    private List<o> f1748d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private boolean f1749e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f1750f;

    public a(Context context, androidx.work.impl.utils.b.a aVar, m mVar) {
        this.f1746b = mVar;
        this.f1747c = new androidx.work.impl.b.d(context, aVar, this);
        this.f1750f = new Object();
    }

    private void a() {
        if (!this.f1749e) {
            this.f1746b.e().a((androidx.work.impl.a) this);
            this.f1749e = true;
        }
    }

    private void b(String str) {
        synchronized (this.f1750f) {
            int size = this.f1748d.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.f1748d.get(i).f1890c.equals(str)) {
                    h.a().a(f1745a, String.format("Stopping tracking for %s", new Object[]{str}), new Throwable[0]);
                    this.f1748d.remove(i);
                    this.f1747c.c(this.f1748d);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    public void a(String str) {
        a();
        h.a().a(f1745a, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        this.f1746b.c(str);
    }

    public void a(String str, boolean z) {
        b(str);
    }

    public void a(List<String> list) {
        for (String next : list) {
            h.a().a(f1745a, String.format("Constraints not met: Cancelling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f1746b.c(next);
        }
    }

    public void a(o... oVarArr) {
        a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (o oVar : oVarArr) {
            if (oVar.f1891d == androidx.work.o.ENQUEUED && !oVar.d() && oVar.i == 0 && !oVar.c()) {
                if (!oVar.b()) {
                    h.a().a(f1745a, String.format("Starting work for %s", new Object[]{oVar.f1890c}), new Throwable[0]);
                    this.f1746b.b(oVar.f1890c);
                } else if (Build.VERSION.SDK_INT < 24 || !oVar.l.e()) {
                    arrayList.add(oVar);
                    arrayList2.add(oVar.f1890c);
                }
            }
        }
        synchronized (this.f1750f) {
            if (!arrayList.isEmpty()) {
                h.a().a(f1745a, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(",", arrayList2)}), new Throwable[0]);
                this.f1748d.addAll(arrayList);
                this.f1747c.c(this.f1748d);
            }
        }
    }

    public void b(List<String> list) {
        for (String next : list) {
            h.a().a(f1745a, String.format("Constraints met: Scheduling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f1746b.b(next);
        }
    }
}
