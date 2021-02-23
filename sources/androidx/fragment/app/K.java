package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

class K implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Object f1074a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ArrayList f1075b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Object f1076c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ArrayList f1077d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Object f1078e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ArrayList f1079f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ M f1080g;

    K(M m, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f1080g = m;
        this.f1074a = obj;
        this.f1075b = arrayList;
        this.f1076c = obj2;
        this.f1077d = arrayList2;
        this.f1078e = obj3;
        this.f1079f = arrayList3;
    }

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public void onTransitionStart(Transition transition) {
        Object obj = this.f1074a;
        if (obj != null) {
            this.f1080g.a(obj, (ArrayList<View>) this.f1075b, (ArrayList<View>) null);
        }
        Object obj2 = this.f1076c;
        if (obj2 != null) {
            this.f1080g.a(obj2, (ArrayList<View>) this.f1077d, (ArrayList<View>) null);
        }
        Object obj3 = this.f1078e;
        if (obj3 != null) {
            this.f1080g.a(obj3, (ArrayList<View>) this.f1079f, (ArrayList<View>) null);
        }
    }
}
