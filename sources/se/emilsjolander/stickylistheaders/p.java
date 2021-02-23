package se.emilsjolander.stickylistheaders;

import android.view.MotionEvent;
import android.view.View;

class p implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View.OnTouchListener f15610a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ q f15611b;

    p(q qVar, View.OnTouchListener onTouchListener) {
        this.f15611b = qVar;
        this.f15610a = onTouchListener;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f15610a.onTouch(this.f15611b, motionEvent);
    }
}
