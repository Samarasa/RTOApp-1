package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.t;
import androidx.appcompat.widget.Toolbar;
import b.a.a;
import b.a.e;
import b.a.f;
import b.a.h;
import b.a.j;
import b.h.j.E;
import b.h.j.F;
import b.h.j.y;

public class Ha implements S {

    /* renamed from: a  reason: collision with root package name */
    Toolbar f463a;

    /* renamed from: b  reason: collision with root package name */
    private int f464b;

    /* renamed from: c  reason: collision with root package name */
    private View f465c;

    /* renamed from: d  reason: collision with root package name */
    private View f466d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f467e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f468f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f469g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f470h;
    CharSequence i;
    private CharSequence j;
    private CharSequence k;
    Window.Callback l;
    boolean m;
    private C0122g n;
    private int o;
    private int p;
    private Drawable q;

    public Ha(Toolbar toolbar, boolean z) {
        this(toolbar, z, h.abc_action_bar_up_description, e.abc_ic_ab_back_material);
    }

    public Ha(Toolbar toolbar, boolean z, int i2, int i3) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.f463a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.f470h = this.i != null;
        this.f469g = toolbar.getNavigationIcon();
        Aa a2 = Aa.a(toolbar.getContext(), (AttributeSet) null, j.ActionBar, a.actionBarStyle, 0);
        this.q = a2.b(j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence e2 = a2.e(j.ActionBar_title);
            if (!TextUtils.isEmpty(e2)) {
                c(e2);
            }
            CharSequence e3 = a2.e(j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(e3)) {
                b(e3);
            }
            Drawable b2 = a2.b(j.ActionBar_logo);
            if (b2 != null) {
                b(b2);
            }
            Drawable b3 = a2.b(j.ActionBar_icon);
            if (b3 != null) {
                setIcon(b3);
            }
            if (this.f469g == null && (drawable = this.q) != null) {
                a(drawable);
            }
            a(a2.d(j.ActionBar_displayOptions, 0));
            int g2 = a2.g(j.ActionBar_customNavigationLayout, 0);
            if (g2 != 0) {
                a(LayoutInflater.from(this.f463a.getContext()).inflate(g2, this.f463a, false));
                a(this.f464b | 16);
            }
            int f2 = a2.f(j.ActionBar_height, 0);
            if (f2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f463a.getLayoutParams();
                layoutParams.height = f2;
                this.f463a.setLayoutParams(layoutParams);
            }
            int b4 = a2.b(j.ActionBar_contentInsetStart, -1);
            int b5 = a2.b(j.ActionBar_contentInsetEnd, -1);
            if (b4 >= 0 || b5 >= 0) {
                this.f463a.a(Math.max(b4, 0), Math.max(b5, 0));
            }
            int g3 = a2.g(j.ActionBar_titleTextStyle, 0);
            if (g3 != 0) {
                Toolbar toolbar2 = this.f463a;
                toolbar2.b(toolbar2.getContext(), g3);
            }
            int g4 = a2.g(j.ActionBar_subtitleTextStyle, 0);
            if (g4 != 0) {
                Toolbar toolbar3 = this.f463a;
                toolbar3.a(toolbar3.getContext(), g4);
            }
            int g5 = a2.g(j.ActionBar_popupTheme, 0);
            if (g5 != 0) {
                this.f463a.setPopupTheme(g5);
            }
        } else {
            this.f464b = o();
        }
        a2.a();
        e(i2);
        this.k = this.f463a.getNavigationContentDescription();
        this.f463a.setNavigationOnClickListener(new Fa(this));
    }

    private void d(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.f464b & 8) != 0) {
            this.f463a.setTitle(charSequence);
        }
    }

    private int o() {
        if (this.f463a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.f463a.getNavigationIcon();
        return 15;
    }

    private void p() {
        if ((this.f464b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.k)) {
            this.f463a.setNavigationContentDescription(this.p);
        } else {
            this.f463a.setNavigationContentDescription(this.k);
        }
    }

    private void q() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f464b & 4) != 0) {
            toolbar = this.f463a;
            drawable = this.f469g;
            if (drawable == null) {
                drawable = this.q;
            }
        } else {
            toolbar = this.f463a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void r() {
        Drawable drawable;
        int i2 = this.f464b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f468f) == null) {
            drawable = this.f467e;
        }
        this.f463a.setLogo(drawable);
    }

    public E a(int i2, long j2) {
        E a2 = y.a(this.f463a);
        a2.a(i2 == 0 ? 1.0f : 0.0f);
        a2.a(j2);
        a2.a((F) new Ga(this, i2));
        return a2;
    }

    public void a(int i2) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i3 = this.f464b ^ i2;
        this.f464b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    p();
                }
                q();
            }
            if ((i3 & 3) != 0) {
                r();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.f463a.setTitle(this.i);
                    toolbar = this.f463a;
                    charSequence = this.j;
                } else {
                    charSequence = null;
                    this.f463a.setTitle((CharSequence) null);
                    toolbar = this.f463a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i3 & 16) != 0 && (view = this.f466d) != null) {
                if ((i2 & 16) != 0) {
                    this.f463a.addView(view);
                } else {
                    this.f463a.removeView(view);
                }
            }
        }
    }

    public void a(Drawable drawable) {
        this.f469g = drawable;
        q();
    }

    public void a(Menu menu, t.a aVar) {
        if (this.n == null) {
            this.n = new C0122g(this.f463a.getContext());
            this.n.a(f.action_menu_presenter);
        }
        this.n.a(aVar);
        this.f463a.a((k) menu, this.n);
    }

    public void a(View view) {
        View view2 = this.f466d;
        if (!(view2 == null || (this.f464b & 16) == 0)) {
            this.f463a.removeView(view2);
        }
        this.f466d = view;
        if (view != null && (this.f464b & 16) != 0) {
            this.f463a.addView(this.f466d);
        }
    }

    public void a(t.a aVar, k.a aVar2) {
        this.f463a.a(aVar, aVar2);
    }

    public void a(C0125ha haVar) {
        Toolbar toolbar;
        View view = this.f465c;
        if (view != null && view.getParent() == (toolbar = this.f463a)) {
            toolbar.removeView(this.f465c);
        }
        this.f465c = haVar;
        if (haVar != null && this.o == 2) {
            this.f463a.addView(this.f465c, 0);
            Toolbar.b bVar = (Toolbar.b) this.f465c.getLayoutParams();
            bVar.width = -2;
            bVar.height = -2;
            bVar.f186a = 8388691;
            haVar.setAllowCollapse(true);
        }
    }

    public void a(CharSequence charSequence) {
        this.k = charSequence;
        p();
    }

    public void a(boolean z) {
    }

    public boolean a() {
        return this.f463a.i();
    }

    public void b() {
        this.m = true;
    }

    public void b(int i2) {
        b(i2 != 0 ? b.a.a.a.a.b(getContext(), i2) : null);
    }

    public void b(Drawable drawable) {
        this.f468f = drawable;
        r();
    }

    public void b(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.f464b & 8) != 0) {
            this.f463a.setSubtitle(charSequence);
        }
    }

    public void b(boolean z) {
        this.f463a.setCollapsible(z);
    }

    public void c(int i2) {
        this.f463a.setVisibility(i2);
    }

    public void c(CharSequence charSequence) {
        this.f470h = true;
        d(charSequence);
    }

    public boolean c() {
        return this.f463a.b();
    }

    public void collapseActionView() {
        this.f463a.c();
    }

    public void d(int i2) {
        a((CharSequence) i2 == 0 ? null : getContext().getString(i2));
    }

    public boolean d() {
        return this.f463a.h();
    }

    public void e(int i2) {
        if (i2 != this.p) {
            this.p = i2;
            if (TextUtils.isEmpty(this.f463a.getNavigationContentDescription())) {
                d(this.p);
            }
        }
    }

    public boolean e() {
        return this.f463a.g();
    }

    public boolean f() {
        return this.f463a.k();
    }

    public void g() {
        this.f463a.d();
    }

    public Context getContext() {
        return this.f463a.getContext();
    }

    public CharSequence getTitle() {
        return this.f463a.getTitle();
    }

    public boolean h() {
        return this.f463a.f();
    }

    public Menu i() {
        return this.f463a.getMenu();
    }

    public int j() {
        return this.o;
    }

    public ViewGroup k() {
        return this.f463a;
    }

    public int l() {
        return this.f464b;
    }

    public void m() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void n() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void setIcon(int i2) {
        setIcon(i2 != 0 ? b.a.a.a.a.b(getContext(), i2) : null);
    }

    public void setIcon(Drawable drawable) {
        this.f467e = drawable;
        r();
    }

    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f470h) {
            d(charSequence);
        }
    }
}
