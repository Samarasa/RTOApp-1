package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import b.h.j.y;
import b.h.j.z;

class La implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private static La f481a;

    /* renamed from: b  reason: collision with root package name */
    private static La f482b;

    /* renamed from: c  reason: collision with root package name */
    private final View f483c;

    /* renamed from: d  reason: collision with root package name */
    private final CharSequence f484d;

    /* renamed from: e  reason: collision with root package name */
    private final int f485e;

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f486f = new Ja(this);

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f487g = new Ka(this);

    /* renamed from: h  reason: collision with root package name */
    private int f488h;
    private int i;
    private Ma j;
    private boolean k;

    private La(View view, CharSequence charSequence) {
        this.f483c = view;
        this.f484d = charSequence;
        this.f485e = z.a(ViewConfiguration.get(this.f483c.getContext()));
        c();
        this.f483c.setOnLongClickListener(this);
        this.f483c.setOnHoverListener(this);
    }

    public static void a(View view, CharSequence charSequence) {
        La la = f481a;
        if (la != null && la.f483c == view) {
            a((La) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            La la2 = f482b;
            if (la2 != null && la2.f483c == view) {
                la2.a();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new La(view, charSequence);
    }

    private static void a(La la) {
        La la2 = f481a;
        if (la2 != null) {
            la2.b();
        }
        f481a = la;
        La la3 = f481a;
        if (la3 != null) {
            la3.d();
        }
    }

    private boolean a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f488h) <= this.f485e && Math.abs(y - this.i) <= this.f485e) {
            return false;
        }
        this.f488h = x;
        this.i = y;
        return true;
    }

    private void b() {
        this.f483c.removeCallbacks(this.f486f);
    }

    private void c() {
        this.f488h = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
    }

    private void d() {
        this.f483c.postDelayed(this.f486f, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (f482b == this) {
            f482b = null;
            Ma ma = this.j;
            if (ma != null) {
                ma.a();
                this.j = null;
                c();
                this.f483c.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f481a == this) {
            a((La) null);
        }
        this.f483c.removeCallbacks(this.f487g);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        long j2;
        if (y.z(this.f483c)) {
            a((La) null);
            La la = f482b;
            if (la != null) {
                la.a();
            }
            f482b = this;
            this.k = z;
            this.j = new Ma(this.f483c.getContext());
            this.j.a(this.f483c, this.f488h, this.i, this.k, this.f484d);
            this.f483c.addOnAttachStateChangeListener(this);
            if (this.k) {
                j2 = 2500;
            } else {
                j2 = ((y.t(this.f483c) & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f483c.removeCallbacks(this.f487g);
            this.f483c.postDelayed(this.f487g, j2);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.j != null && this.k) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f483c.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                a();
            }
        } else if (this.f483c.isEnabled() && this.j == null && a(motionEvent)) {
            a(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f488h = view.getWidth() / 2;
        this.i = view.getHeight() / 2;
        a(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        a();
    }
}
