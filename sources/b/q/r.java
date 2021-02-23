package b.q;

import android.view.View;
import b.q.E;
import java.util.ArrayList;

class r implements E.c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Object f2791a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ArrayList f2792b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Object f2793c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ArrayList f2794d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Object f2795e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ArrayList f2796f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ C0222t f2797g;

    r(C0222t tVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f2797g = tVar;
        this.f2791a = obj;
        this.f2792b = arrayList;
        this.f2793c = obj2;
        this.f2794d = arrayList2;
        this.f2795e = obj3;
        this.f2796f = arrayList3;
    }

    public void a(E e2) {
        Object obj = this.f2791a;
        if (obj != null) {
            this.f2797g.a(obj, (ArrayList<View>) this.f2792b, (ArrayList<View>) null);
        }
        Object obj2 = this.f2793c;
        if (obj2 != null) {
            this.f2797g.a(obj2, (ArrayList<View>) this.f2794d, (ArrayList<View>) null);
        }
        Object obj3 = this.f2795e;
        if (obj3 != null) {
            this.f2797g.a(obj3, (ArrayList<View>) this.f2796f, (ArrayList<View>) null);
        }
    }

    public void b(E e2) {
    }

    public void c(E e2) {
    }

    public void d(E e2) {
    }
}
