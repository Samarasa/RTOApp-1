package androidx.work.impl;

import android.text.TextUtils;
import androidx.work.h;
import androidx.work.impl.utils.d;
import androidx.work.l;
import androidx.work.n;
import androidx.work.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class f extends n {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1916a = h.a("WorkContinuationImpl");

    /* renamed from: b  reason: collision with root package name */
    private final m f1917b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1918c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.work.f f1919d;

    /* renamed from: e  reason: collision with root package name */
    private final List<? extends q> f1920e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f1921f;

    /* renamed from: g  reason: collision with root package name */
    private final List<String> f1922g;

    /* renamed from: h  reason: collision with root package name */
    private final List<f> f1923h;
    private boolean i;
    private l j;

    f(m mVar, String str, androidx.work.f fVar, List<? extends q> list, List<f> list2) {
        this.f1917b = mVar;
        this.f1918c = str;
        this.f1919d = fVar;
        this.f1920e = list;
        this.f1923h = list2;
        this.f1921f = new ArrayList(this.f1920e.size());
        this.f1922g = new ArrayList();
        if (list2 != null) {
            for (f fVar2 : list2) {
                this.f1922g.addAll(fVar2.f1922g);
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            String a2 = ((q) list.get(i2)).a();
            this.f1921f.add(a2);
            this.f1922g.add(a2);
        }
    }

    f(m mVar, List<? extends q> list) {
        this(mVar, (String) null, androidx.work.f.KEEP, list, (List<f>) null);
    }

    public static Set<String> a(f fVar) {
        HashSet hashSet = new HashSet();
        List<f> e2 = fVar.e();
        if (e2 != null && !e2.isEmpty()) {
            for (f c2 : e2) {
                hashSet.addAll(c2.c());
            }
        }
        return hashSet;
    }

    private static boolean a(f fVar, Set<String> set) {
        set.addAll(fVar.c());
        Set<String> a2 = a(fVar);
        for (String contains : set) {
            if (a2.contains(contains)) {
                return true;
            }
        }
        List<f> e2 = fVar.e();
        if (e2 != null && !e2.isEmpty()) {
            for (f a3 : e2) {
                if (a(a3, set)) {
                    return true;
                }
            }
        }
        set.removeAll(fVar.c());
        return false;
    }

    public l a() {
        if (!this.i) {
            d dVar = new d(this);
            this.f1917b.h().a(dVar);
            this.j = dVar.b();
        } else {
            h.a().e(f1916a, String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.f1921f)}), new Throwable[0]);
        }
        return this.j;
    }

    public androidx.work.f b() {
        return this.f1919d;
    }

    public List<String> c() {
        return this.f1921f;
    }

    public String d() {
        return this.f1918c;
    }

    public List<f> e() {
        return this.f1923h;
    }

    public List<? extends q> f() {
        return this.f1920e;
    }

    public m g() {
        return this.f1917b;
    }

    public boolean h() {
        return a(this, new HashSet());
    }

    public boolean i() {
        return this.i;
    }

    public void j() {
        this.i = true;
    }
}
