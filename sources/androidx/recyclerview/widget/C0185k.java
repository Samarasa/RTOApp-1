package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import b.h.j.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.k  reason: case insensitive filesystem */
public class C0185k extends I {

    /* renamed from: h  reason: collision with root package name */
    private static TimeInterpolator f1452h;
    private ArrayList<RecyclerView.x> i = new ArrayList<>();
    private ArrayList<RecyclerView.x> j = new ArrayList<>();
    private ArrayList<b> k = new ArrayList<>();
    private ArrayList<a> l = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.x>> m = new ArrayList<>();
    ArrayList<ArrayList<b>> n = new ArrayList<>();
    ArrayList<ArrayList<a>> o = new ArrayList<>();
    ArrayList<RecyclerView.x> p = new ArrayList<>();
    ArrayList<RecyclerView.x> q = new ArrayList<>();
    ArrayList<RecyclerView.x> r = new ArrayList<>();
    ArrayList<RecyclerView.x> s = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.k$a */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.x f1453a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.x f1454b;

        /* renamed from: c  reason: collision with root package name */
        public int f1455c;

        /* renamed from: d  reason: collision with root package name */
        public int f1456d;

        /* renamed from: e  reason: collision with root package name */
        public int f1457e;

        /* renamed from: f  reason: collision with root package name */
        public int f1458f;

        private a(RecyclerView.x xVar, RecyclerView.x xVar2) {
            this.f1453a = xVar;
            this.f1454b = xVar2;
        }

        a(RecyclerView.x xVar, RecyclerView.x xVar2, int i, int i2, int i3, int i4) {
            this(xVar, xVar2);
            this.f1455c = i;
            this.f1456d = i2;
            this.f1457e = i3;
            this.f1458f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f1453a + ", newHolder=" + this.f1454b + ", fromX=" + this.f1455c + ", fromY=" + this.f1456d + ", toX=" + this.f1457e + ", toY=" + this.f1458f + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$b */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.x f1459a;

        /* renamed from: b  reason: collision with root package name */
        public int f1460b;

        /* renamed from: c  reason: collision with root package name */
        public int f1461c;

        /* renamed from: d  reason: collision with root package name */
        public int f1462d;

        /* renamed from: e  reason: collision with root package name */
        public int f1463e;

        b(RecyclerView.x xVar, int i, int i2, int i3, int i4) {
            this.f1459a = xVar;
            this.f1460b = i;
            this.f1461c = i2;
            this.f1462d = i3;
            this.f1463e = i4;
        }
    }

    private void a(List<a> list, RecyclerView.x xVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            a aVar = list.get(size);
            if (a(aVar, xVar) && aVar.f1453a == null && aVar.f1454b == null) {
                list.remove(aVar);
            }
        }
    }

    private boolean a(a aVar, RecyclerView.x xVar) {
        boolean z = false;
        if (aVar.f1454b == xVar) {
            aVar.f1454b = null;
        } else if (aVar.f1453a != xVar) {
            return false;
        } else {
            aVar.f1453a = null;
            z = true;
        }
        xVar.itemView.setAlpha(1.0f);
        xVar.itemView.setTranslationX(0.0f);
        xVar.itemView.setTranslationY(0.0f);
        a(xVar, z);
        return true;
    }

    private void b(a aVar) {
        RecyclerView.x xVar = aVar.f1453a;
        if (xVar != null) {
            a(aVar, xVar);
        }
        RecyclerView.x xVar2 = aVar.f1454b;
        if (xVar2 != null) {
            a(aVar, xVar2);
        }
    }

    private void u(RecyclerView.x xVar) {
        View view = xVar.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.r.add(xVar);
        animate.setDuration(f()).alpha(0.0f).setListener(new C0180f(this, xVar, animate, view)).start();
    }

    private void v(RecyclerView.x xVar) {
        if (f1452h == null) {
            f1452h = new ValueAnimator().getInterpolator();
        }
        xVar.itemView.animate().setInterpolator(f1452h);
        d(xVar);
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        RecyclerView.x xVar = aVar.f1453a;
        View view = null;
        View view2 = xVar == null ? null : xVar.itemView;
        RecyclerView.x xVar2 = aVar.f1454b;
        if (xVar2 != null) {
            view = xVar2.itemView;
        }
        if (view2 != null) {
            ViewPropertyAnimator duration = view2.animate().setDuration(d());
            this.s.add(aVar.f1453a);
            duration.translationX((float) (aVar.f1457e - aVar.f1455c));
            duration.translationY((float) (aVar.f1458f - aVar.f1456d));
            duration.alpha(0.0f).setListener(new C0183i(this, aVar, duration, view2)).start();
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            this.s.add(aVar.f1454b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(d()).alpha(1.0f).setListener(new C0184j(this, aVar, animate, view)).start();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(List<RecyclerView.x> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    public boolean a(RecyclerView.x xVar, int i2, int i3, int i4, int i5) {
        View view = xVar.itemView;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) xVar.itemView.getTranslationY());
        v(xVar);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            j(xVar);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i7 != 0) {
            view.setTranslationY((float) (-i7));
        }
        this.k.add(new b(xVar, translationX, translationY, i4, i5));
        return true;
    }

    public boolean a(RecyclerView.x xVar, RecyclerView.x xVar2, int i2, int i3, int i4, int i5) {
        if (xVar == xVar2) {
            return a(xVar, i2, i3, i4, i5);
        }
        float translationX = xVar.itemView.getTranslationX();
        float translationY = xVar.itemView.getTranslationY();
        float alpha = xVar.itemView.getAlpha();
        v(xVar);
        int i6 = (int) (((float) (i4 - i2)) - translationX);
        int i7 = (int) (((float) (i5 - i3)) - translationY);
        xVar.itemView.setTranslationX(translationX);
        xVar.itemView.setTranslationY(translationY);
        xVar.itemView.setAlpha(alpha);
        if (xVar2 != null) {
            v(xVar2);
            xVar2.itemView.setTranslationX((float) (-i6));
            xVar2.itemView.setTranslationY((float) (-i7));
            xVar2.itemView.setAlpha(0.0f);
        }
        this.l.add(new a(xVar, xVar2, i2, i3, i4, i5));
        return true;
    }

    public boolean a(RecyclerView.x xVar, List<Object> list) {
        return !list.isEmpty() || super.a(xVar, list);
    }

    public void b() {
        int size = this.k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = this.k.get(size);
            View view = bVar.f1459a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            j(bVar.f1459a);
            this.k.remove(size);
        }
        for (int size2 = this.i.size() - 1; size2 >= 0; size2--) {
            l(this.i.get(size2));
            this.i.remove(size2);
        }
        int size3 = this.j.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.x xVar = this.j.get(size3);
            xVar.itemView.setAlpha(1.0f);
            h(xVar);
            this.j.remove(size3);
        }
        for (int size4 = this.l.size() - 1; size4 >= 0; size4--) {
            b(this.l.get(size4));
        }
        this.l.clear();
        if (g()) {
            for (int size5 = this.n.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.n.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    b bVar2 = (b) arrayList.get(size6);
                    View view2 = bVar2.f1459a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    j(bVar2.f1459a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.n.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.m.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.m.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.x xVar2 = (RecyclerView.x) arrayList2.get(size8);
                    xVar2.itemView.setAlpha(1.0f);
                    h(xVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.m.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.o.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.o.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    b((a) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.o.remove(arrayList3);
                    }
                }
            }
            a((List<RecyclerView.x>) this.r);
            a((List<RecyclerView.x>) this.q);
            a((List<RecyclerView.x>) this.p);
            a((List<RecyclerView.x>) this.s);
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(RecyclerView.x xVar, int i2, int i3, int i4, int i5) {
        View view = xVar.itemView;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.q.add(xVar);
        animate.setDuration(e()).setListener(new C0182h(this, xVar, i6, view, i7, animate)).start();
    }

    public void d(RecyclerView.x xVar) {
        View view = xVar.itemView;
        view.animate().cancel();
        int size = this.k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.k.get(size).f1459a == xVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                j(xVar);
                this.k.remove(size);
            }
        }
        a((List<a>) this.l, xVar);
        if (this.i.remove(xVar)) {
            view.setAlpha(1.0f);
            l(xVar);
        }
        if (this.j.remove(xVar)) {
            view.setAlpha(1.0f);
            h(xVar);
        }
        for (int size2 = this.o.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.o.get(size2);
            a((List<a>) arrayList, xVar);
            if (arrayList.isEmpty()) {
                this.o.remove(size2);
            }
        }
        for (int size3 = this.n.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.n.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((b) arrayList2.get(size4)).f1459a == xVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    j(xVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.n.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.m.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.m.get(size5);
            if (arrayList3.remove(xVar)) {
                view.setAlpha(1.0f);
                h(xVar);
                if (arrayList3.isEmpty()) {
                    this.m.remove(size5);
                }
            }
        }
        this.r.remove(xVar);
        this.p.remove(xVar);
        this.s.remove(xVar);
        this.q.remove(xVar);
        j();
    }

    public boolean f(RecyclerView.x xVar) {
        v(xVar);
        xVar.itemView.setAlpha(0.0f);
        this.j.add(xVar);
        return true;
    }

    public boolean g() {
        return !this.j.isEmpty() || !this.l.isEmpty() || !this.k.isEmpty() || !this.i.isEmpty() || !this.q.isEmpty() || !this.r.isEmpty() || !this.p.isEmpty() || !this.s.isEmpty() || !this.n.isEmpty() || !this.m.isEmpty() || !this.o.isEmpty();
    }

    public boolean g(RecyclerView.x xVar) {
        v(xVar);
        this.i.add(xVar);
        return true;
    }

    public void i() {
        boolean z = !this.i.isEmpty();
        boolean z2 = !this.k.isEmpty();
        boolean z3 = !this.l.isEmpty();
        boolean z4 = !this.j.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.x> it = this.i.iterator();
            while (it.hasNext()) {
                u(it.next());
            }
            this.i.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.k);
                this.n.add(arrayList);
                this.k.clear();
                C0177c cVar = new C0177c(this, arrayList);
                if (z) {
                    y.a(((b) arrayList.get(0)).f1459a.itemView, (Runnable) cVar, f());
                } else {
                    cVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.l);
                this.o.add(arrayList2);
                this.l.clear();
                C0178d dVar = new C0178d(this, arrayList2);
                if (z) {
                    y.a(((a) arrayList2.get(0)).f1453a.itemView, (Runnable) dVar, f());
                } else {
                    dVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.j);
                this.m.add(arrayList3);
                this.j.clear();
                C0179e eVar = new C0179e(this, arrayList3);
                if (z || z2 || z3) {
                    long j2 = 0;
                    long f2 = z ? f() : 0;
                    long e2 = z2 ? e() : 0;
                    if (z3) {
                        j2 = d();
                    }
                    y.a(((RecyclerView.x) arrayList3.get(0)).itemView, (Runnable) eVar, f2 + Math.max(e2, j2));
                    return;
                }
                eVar.run();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        if (!g()) {
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public void t(RecyclerView.x xVar) {
        View view = xVar.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.p.add(xVar);
        animate.alpha(1.0f).setDuration(c()).setListener(new C0181g(this, xVar, view, animate)).start();
    }
}
