package b.h.j;

import android.view.View;
import android.view.ViewTreeObserver;

public final class r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f2571a;

    /* renamed from: b  reason: collision with root package name */
    private ViewTreeObserver f2572b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f2573c;

    private r(View view, Runnable runnable) {
        this.f2571a = view;
        this.f2572b = view.getViewTreeObserver();
        this.f2573c = runnable;
    }

    public static r a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            r rVar = new r(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(rVar);
            view.addOnAttachStateChangeListener(rVar);
            return rVar;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public void a() {
        (this.f2572b.isAlive() ? this.f2572b : this.f2571a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f2571a.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        a();
        this.f2573c.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f2572b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        a();
    }
}
