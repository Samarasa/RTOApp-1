package b.q;

import android.view.View;
import android.view.ViewGroup;

public class A {

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f2673a;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f2674b;

    static A a(View view) {
        return (A) view.getTag(C0227y.transition_current_scene);
    }

    static void a(View view, A a2) {
        view.setTag(C0227y.transition_current_scene, a2);
    }

    public void a() {
        Runnable runnable;
        if (a(this.f2673a) == this && (runnable = this.f2674b) != null) {
            runnable.run();
        }
    }
}
