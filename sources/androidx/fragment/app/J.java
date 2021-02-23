package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

class J implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View f1071a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ArrayList f1072b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ M f1073c;

    J(M m, View view, ArrayList arrayList) {
        this.f1073c = m;
        this.f1071a = view;
        this.f1072b = arrayList;
    }

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f1071a.setVisibility(8);
        int size = this.f1072b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f1072b.get(i)).setVisibility(0);
        }
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public void onTransitionStart(Transition transition) {
    }
}
