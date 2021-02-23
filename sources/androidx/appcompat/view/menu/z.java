package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.t;
import androidx.appcompat.widget.C0115ca;
import b.a.d;
import b.a.g;
import b.h.j.y;

final class z extends q implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, t, View.OnKeyListener {

    /* renamed from: b  reason: collision with root package name */
    private static final int f382b = g.abc_popup_menu_item_layout;

    /* renamed from: c  reason: collision with root package name */
    private final Context f383c;

    /* renamed from: d  reason: collision with root package name */
    private final k f384d;

    /* renamed from: e  reason: collision with root package name */
    private final j f385e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f386f;

    /* renamed from: g  reason: collision with root package name */
    private final int f387g;

    /* renamed from: h  reason: collision with root package name */
    private final int f388h;
    private final int i;
    final C0115ca j;
    final ViewTreeObserver.OnGlobalLayoutListener k = new x(this);
    private final View.OnAttachStateChangeListener l = new y(this);
    private PopupWindow.OnDismissListener m;
    private View n;
    View o;
    private t.a p;
    ViewTreeObserver q;
    private boolean r;
    private boolean s;
    private int t;
    private int u = 0;
    private boolean v;

    public z(Context context, k kVar, View view, int i2, int i3, boolean z) {
        this.f383c = context;
        this.f384d = kVar;
        this.f386f = z;
        this.f385e = new j(kVar, LayoutInflater.from(context), this.f386f, f382b);
        this.f388h = i2;
        this.i = i3;
        Resources resources = context.getResources();
        this.f387g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.abc_config_prefDialogWidth));
        this.n = view;
        this.j = new C0115ca(this.f383c, (AttributeSet) null, this.f388h, this.i);
        kVar.a((t) this, context);
    }

    private boolean e() {
        View view;
        if (v()) {
            return true;
        }
        if (this.r || (view = this.n) == null) {
            return false;
        }
        this.o = view;
        this.j.a((PopupWindow.OnDismissListener) this);
        this.j.a((AdapterView.OnItemClickListener) this);
        this.j.a(true);
        View view2 = this.o;
        boolean z = this.q == null;
        this.q = view2.getViewTreeObserver();
        if (z) {
            this.q.addOnGlobalLayoutListener(this.k);
        }
        view2.addOnAttachStateChangeListener(this.l);
        this.j.a(view2);
        this.j.e(this.u);
        if (!this.s) {
            this.t = q.a(this.f385e, (ViewGroup) null, this.f383c, this.f387g);
            this.s = true;
        }
        this.j.d(this.t);
        this.j.f(2);
        this.j.a(d());
        this.j.u();
        ListView w = this.j.w();
        w.setOnKeyListener(this);
        if (this.v && this.f384d.h() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f383c).inflate(g.abc_popup_menu_header_item_layout, w, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f384d.h());
            }
            frameLayout.setEnabled(false);
            w.addHeaderView(frameLayout, (Object) null, false);
        }
        this.j.a((ListAdapter) this.f385e);
        this.j.u();
        return true;
    }

    public void a(int i2) {
        this.u = i2;
    }

    public void a(Parcelable parcelable) {
    }

    public void a(View view) {
        this.n = view;
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    public void a(k kVar) {
    }

    public void a(k kVar, boolean z) {
        if (kVar == this.f384d) {
            dismiss();
            t.a aVar = this.p;
            if (aVar != null) {
                aVar.a(kVar, z);
            }
        }
    }

    public void a(t.a aVar) {
        this.p = aVar;
    }

    public void a(boolean z) {
        this.s = false;
        j jVar = this.f385e;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    public boolean a() {
        return false;
    }

    public boolean a(A a2) {
        if (a2.hasVisibleItems()) {
            s sVar = new s(this.f383c, a2, this.o, this.f386f, this.f388h, this.i);
            sVar.a(this.p);
            sVar.a(q.b((k) a2));
            sVar.a(this.m);
            this.m = null;
            this.f384d.a(false);
            int a3 = this.j.a();
            int d2 = this.j.d();
            if ((Gravity.getAbsoluteGravity(this.u, y.m(this.n)) & 7) == 5) {
                a3 += this.n.getWidth();
            }
            if (sVar.a(a3, d2)) {
                t.a aVar = this.p;
                if (aVar == null) {
                    return true;
                }
                aVar.a(a2);
                return true;
            }
        }
        return false;
    }

    public Parcelable b() {
        return null;
    }

    public void b(int i2) {
        this.j.a(i2);
    }

    public void b(boolean z) {
        this.f385e.a(z);
    }

    public void c(int i2) {
        this.j.b(i2);
    }

    public void c(boolean z) {
        this.v = z;
    }

    public void dismiss() {
        if (v()) {
            this.j.dismiss();
        }
    }

    public void onDismiss() {
        this.r = true;
        this.f384d.close();
        ViewTreeObserver viewTreeObserver = this.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.q = this.o.getViewTreeObserver();
            }
            this.q.removeGlobalOnLayoutListener(this.k);
            this.q = null;
        }
        this.o.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void u() {
        if (!e()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public boolean v() {
        return !this.r && this.j.v();
    }

    public ListView w() {
        return this.j.w();
    }
}
