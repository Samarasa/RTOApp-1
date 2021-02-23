package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.h;
import androidx.work.impl.b.c;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.c.o;
import java.util.ArrayList;
import java.util.List;

class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1802a = h.a("ConstraintsCmdHandler");

    /* renamed from: b  reason: collision with root package name */
    private final Context f1803b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1804c;

    /* renamed from: d  reason: collision with root package name */
    private final g f1805d;

    /* renamed from: e  reason: collision with root package name */
    private final androidx.work.impl.b.d f1806e = new androidx.work.impl.b.d(this.f1803b, this.f1805d.c(), (c) null);

    d(Context context, int i, g gVar) {
        this.f1803b = context;
        this.f1804c = i;
        this.f1805d = gVar;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        List<o> a2 = this.f1805d.d().g().r().a();
        ConstraintProxy.a(this.f1803b, a2);
        this.f1806e.c(a2);
        ArrayList<o> arrayList = new ArrayList<>(a2.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (o next : a2) {
            String str = next.f1890c;
            if (currentTimeMillis >= next.a() && (!next.b() || this.f1806e.a(str))) {
                arrayList.add(next);
            }
        }
        for (o oVar : arrayList) {
            String str2 = oVar.f1890c;
            Intent a3 = b.a(this.f1803b, str2);
            h.a().a(f1802a, String.format("Creating a delay_met command for workSpec with id (%s)", new Object[]{str2}), new Throwable[0]);
            g gVar = this.f1805d;
            gVar.a((Runnable) new g.a(gVar, a3, this.f1804c));
        }
        this.f1806e.a();
    }
}
