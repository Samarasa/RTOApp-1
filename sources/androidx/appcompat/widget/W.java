package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.w;

public abstract class W implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final float f567a;

    /* renamed from: b  reason: collision with root package name */
    private final int f568b;

    /* renamed from: c  reason: collision with root package name */
    private final int f569c;

    /* renamed from: d  reason: collision with root package name */
    final View f570d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f571e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f572f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f573g;

    /* renamed from: h  reason: collision with root package name */
    private int f574h;
    private final int[] i = new int[2];

    private class a implements Runnable {
        a() {
        }

        public void run() {
            ViewParent parent = W.this.f570d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void run() {
            W.this.m();
        }
    }

    public W(View view) {
        this.f570d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f567a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f568b = ViewConfiguration.getTapTimeout();
        this.f569c = (this.f568b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private boolean a(MotionEvent motionEvent) {
        U u;
        View view = this.f570d;
        w a2 = a();
        if (a2 == null || !a2.v() || (u = (U) a2.w()) == null || !u.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        a(view, obtainNoHistory);
        b(u, obtainNoHistory);
        boolean a3 = u.a(obtainNoHistory, this.f574h);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return a3 && (actionMasked != 1 && actionMasked != 3);
    }

    private static boolean a(View view, float f2, float f3, float f4) {
        float f5 = -f4;
        return f2 >= f5 && f3 >= f5 && f2 < ((float) (view.getRight() - view.getLeft())) + f4 && f3 < ((float) (view.getBottom() - view.getTop())) + f4;
    }

    private boolean a(View view, MotionEvent motionEvent) {
        int[] iArr = this.i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f570d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f574h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f567a
            boolean r6 = a(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.n()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.n()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f574h = r6
            java.lang.Runnable r6 = r5.f571e
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.W$a r6 = new androidx.appcompat.widget.W$a
            r6.<init>()
            r5.f571e = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f571e
            int r1 = r5.f568b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f572f
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.W$b r6 = new androidx.appcompat.widget.W$b
            r6.<init>()
            r5.f572f = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f572f
            int r1 = r5.f569c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.W.b(android.view.MotionEvent):boolean");
    }

    private boolean b(View view, MotionEvent motionEvent) {
        int[] iArr = this.i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    private void n() {
        Runnable runnable = this.f572f;
        if (runnable != null) {
            this.f570d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f571e;
        if (runnable2 != null) {
            this.f570d.removeCallbacks(runnable2);
        }
    }

    public abstract w a();

    /* access modifiers changed from: protected */
    public abstract boolean b();

    /* access modifiers changed from: protected */
    public boolean l() {
        w a2 = a();
        if (a2 == null || !a2.v()) {
            return true;
        }
        a2.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void m() {
        n();
        View view = this.f570d;
        if (view.isEnabled() && !view.isLongClickable() && b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f573g = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f573g;
        if (z2) {
            z = a(motionEvent) || !l();
        } else {
            z = b(motionEvent) && b();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f570d.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f573g = z;
        return z || z2;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f573g = false;
        this.f574h = -1;
        Runnable runnable = this.f571e;
        if (runnable != null) {
            this.f570d.removeCallbacks(runnable);
        }
    }
}
