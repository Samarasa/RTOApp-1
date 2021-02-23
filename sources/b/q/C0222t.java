package b.q;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Q;
import b.q.E;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b.q.t  reason: case insensitive filesystem */
public class C0222t extends Q {
    private static boolean a(E e2) {
        return !Q.a((List) e2.k()) || !Q.a((List) e2.l()) || !Q.a((List) e2.m());
    }

    public Object a(Object obj, Object obj2, Object obj3) {
        E e2 = (E) obj;
        E e3 = (E) obj2;
        E e4 = (E) obj3;
        if (e2 != null && e3 != null) {
            K k = new K();
            k.a(e2);
            k.a(e3);
            k.b(1);
            e2 = k;
        } else if (e2 == null) {
            e2 = e3 != null ? e3 : null;
        }
        if (e4 == null) {
            return e2;
        }
        K k2 = new K();
        if (e2 != null) {
            k2.a(e2);
        }
        k2.a(e4);
        return k2;
    }

    public void a(ViewGroup viewGroup, Object obj) {
        H.a(viewGroup, (E) obj);
    }

    public void a(Object obj, Rect rect) {
        if (obj != null) {
            ((E) obj).a((E.b) new C0221s(this, rect));
        }
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((E) obj).a(view);
        }
    }

    public void a(Object obj, View view, ArrayList<View> arrayList) {
        ((E) obj).a((E.c) new C0220q(this, view, arrayList));
    }

    public void a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((E) obj).a((E.c) new r(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void a(Object obj, ArrayList<View> arrayList) {
        E e2 = (E) obj;
        if (e2 != null) {
            int i = 0;
            if (e2 instanceof K) {
                K k = (K) e2;
                int r = k.r();
                while (i < r) {
                    a((Object) k.a(i), arrayList);
                    i++;
                }
            } else if (!a(e2) && Q.a((List) e2.n())) {
                int size = arrayList.size();
                while (i < size) {
                    e2.a(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    public void a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        E e2 = (E) obj;
        int i = 0;
        if (e2 instanceof K) {
            K k = (K) e2;
            int r = k.r();
            while (i < r) {
                a((Object) k.a(i), arrayList, arrayList2);
                i++;
            }
        } else if (!a(e2)) {
            List<View> n = e2.n();
            if (n.size() == arrayList.size() && n.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    e2.a(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    e2.d(arrayList.get(size2));
                }
            }
        }
    }

    public boolean a(Object obj) {
        return obj instanceof E;
    }

    public Object b(Object obj) {
        if (obj != null) {
            return ((E) obj).clone();
        }
        return null;
    }

    public Object b(Object obj, Object obj2, Object obj3) {
        K k = new K();
        if (obj != null) {
            k.a((E) obj);
        }
        if (obj2 != null) {
            k.a((E) obj2);
        }
        if (obj3 != null) {
            k.a((E) obj3);
        }
        return k;
    }

    public void b(Object obj, View view) {
        if (obj != null) {
            ((E) obj).d(view);
        }
    }

    public void b(Object obj, View view, ArrayList<View> arrayList) {
        K k = (K) obj;
        List<View> n = k.n();
        n.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Q.a(n, arrayList.get(i));
        }
        n.add(view);
        arrayList.add(view);
        a((Object) k, arrayList);
    }

    public void b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        K k = (K) obj;
        if (k != null) {
            k.n().clear();
            k.n().addAll(arrayList2);
            a((Object) k, arrayList, arrayList2);
        }
    }

    public Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        K k = new K();
        k.a((E) obj);
        return k;
    }

    public void c(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            a(view, rect);
            ((E) obj).a((E.b) new C0219p(this, rect));
        }
    }
}
