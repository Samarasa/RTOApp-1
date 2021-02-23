package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.b;
import androidx.work.impl.c.C0190b;
import androidx.work.impl.c.p;
import androidx.work.impl.d;
import androidx.work.impl.e;
import androidx.work.impl.m;
import androidx.work.l;
import androidx.work.o;
import java.util.LinkedList;

public abstract class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f2001a = new b();

    public static c a(String str, m mVar) {
        return new a(mVar, str);
    }

    public static c a(String str, m mVar, boolean z) {
        return new b(mVar, str, z);
    }

    private void a(WorkDatabase workDatabase, String str) {
        p r = workDatabase.r();
        C0190b l = workDatabase.l();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            o c2 = r.c(str2);
            if (!(c2 == o.SUCCEEDED || c2 == o.FAILED)) {
                r.a(o.CANCELLED, str2);
            }
            linkedList.addAll(l.a(str2));
        }
    }

    public l a() {
        return this.f2001a;
    }

    /* access modifiers changed from: package-private */
    public void a(m mVar) {
        e.a(mVar.b(), mVar.g(), mVar.f());
    }

    /* access modifiers changed from: package-private */
    public void a(m mVar, String str) {
        a(mVar.g(), str);
        mVar.e().d(str);
        for (d a2 : mVar.f()) {
            a2.a(str);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void b();

    public void run() {
        try {
            b();
            this.f2001a.a(l.f2032a);
        } catch (Throwable th) {
            this.f2001a.a(new l.a.C0025a(th));
        }
    }
}
