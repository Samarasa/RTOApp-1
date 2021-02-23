package b.q;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import b.e.b;
import b.h.j.y;
import b.q.E;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class H {

    /* renamed from: a  reason: collision with root package name */
    private static E f2693a = new C0205b();

    /* renamed from: b  reason: collision with root package name */
    private static ThreadLocal<WeakReference<b<ViewGroup, ArrayList<E>>>> f2694b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    static ArrayList<ViewGroup> f2695c = new ArrayList<>();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        E f2696a;

        /* renamed from: b  reason: collision with root package name */
        ViewGroup f2697b;

        a(E e2, ViewGroup viewGroup) {
            this.f2696a = e2;
            this.f2697b = viewGroup;
        }

        private void a() {
            this.f2697b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f2697b.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            a();
            if (!H.f2695c.remove(this.f2697b)) {
                return true;
            }
            b<ViewGroup, ArrayList<E>> a2 = H.a();
            ArrayList arrayList = a2.get(this.f2697b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                a2.put(this.f2697b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f2696a);
            this.f2696a.a((E.c) new G(this, a2));
            this.f2696a.a(this.f2697b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((E) it.next()).e(this.f2697b);
                }
            }
            this.f2696a.a(this.f2697b);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            a();
            H.f2695c.remove(this.f2697b);
            ArrayList arrayList = H.a().get(this.f2697b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((E) it.next()).e(this.f2697b);
                }
            }
            this.f2696a.a(true);
        }
    }

    static b<ViewGroup, ArrayList<E>> a() {
        b<ViewGroup, ArrayList<E>> bVar;
        WeakReference weakReference = f2694b.get();
        if (weakReference != null && (bVar = (b) weakReference.get()) != null) {
            return bVar;
        }
        b<ViewGroup, ArrayList<E>> bVar2 = new b<>();
        f2694b.set(new WeakReference(bVar2));
        return bVar2;
    }

    public static void a(ViewGroup viewGroup, E e2) {
        if (!f2695c.contains(viewGroup) && y.A(viewGroup)) {
            f2695c.add(viewGroup);
            if (e2 == null) {
                e2 = f2693a;
            }
            E clone = e2.clone();
            c(viewGroup, clone);
            A.a(viewGroup, (A) null);
            b(viewGroup, clone);
        }
    }

    private static void b(ViewGroup viewGroup, E e2) {
        if (e2 != null && viewGroup != null) {
            a aVar = new a(e2, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    private static void c(ViewGroup viewGroup, E e2) {
        ArrayList arrayList = a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((E) it.next()).c((View) viewGroup);
            }
        }
        if (e2 != null) {
            e2.a(viewGroup, true);
        }
        A a2 = A.a(viewGroup);
        if (a2 != null) {
            a2.a();
        }
    }
}
