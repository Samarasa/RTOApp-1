package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0125ha;
import androidx.appcompat.widget.S;
import androidx.appcompat.widget.Toolbar;
import b.a.d.b;
import b.a.d.g;
import b.a.d.i;
import b.a.f;
import b.a.j;
import b.h.j.E;
import b.h.j.F;
import b.h.j.H;
import b.h.j.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class N extends C0094a implements ActionBarOverlayLayout.a {

    /* renamed from: a  reason: collision with root package name */
    private static final Interpolator f173a = new AccelerateInterpolator();

    /* renamed from: b  reason: collision with root package name */
    private static final Interpolator f174b = new DecelerateInterpolator();
    private boolean A = true;
    i B;
    private boolean C;
    boolean D;
    final F E = new K(this);
    final F F = new L(this);
    final H G = new M(this);

    /* renamed from: c  reason: collision with root package name */
    Context f175c;

    /* renamed from: d  reason: collision with root package name */
    private Context f176d;

    /* renamed from: e  reason: collision with root package name */
    private Activity f177e;

    /* renamed from: f  reason: collision with root package name */
    private Dialog f178f;

    /* renamed from: g  reason: collision with root package name */
    ActionBarOverlayLayout f179g;

    /* renamed from: h  reason: collision with root package name */
    ActionBarContainer f180h;
    S i;
    ActionBarContextView j;
    View k;
    C0125ha l;
    private ArrayList<Object> m = new ArrayList<>();
    private int n = -1;
    private boolean o;
    a p;
    b q;
    b.a r;
    private boolean s;
    private ArrayList<C0094a.b> t = new ArrayList<>();
    private boolean u;
    private int v = 0;
    boolean w = true;
    boolean x;
    boolean y;
    private boolean z;

    public class a extends b implements k.a {

        /* renamed from: c  reason: collision with root package name */
        private final Context f181c;

        /* renamed from: d  reason: collision with root package name */
        private final k f182d;

        /* renamed from: e  reason: collision with root package name */
        private b.a f183e;

        /* renamed from: f  reason: collision with root package name */
        private WeakReference<View> f184f;

        public a(Context context, b.a aVar) {
            this.f181c = context;
            this.f183e = aVar;
            k kVar = new k(context);
            kVar.c(1);
            this.f182d = kVar;
            this.f182d.a((k.a) this);
        }

        public void a() {
            N n = N.this;
            if (n.p == this) {
                if (!N.a(n.x, n.y, false)) {
                    N n2 = N.this;
                    n2.q = this;
                    n2.r = this.f183e;
                } else {
                    this.f183e.a(this);
                }
                this.f183e = null;
                N.this.f(false);
                N.this.j.a();
                N.this.i.k().sendAccessibilityEvent(32);
                N n3 = N.this;
                n3.f179g.setHideOnContentScrollEnabled(n3.D);
                N.this.p = null;
            }
        }

        public void a(int i) {
            a((CharSequence) N.this.f175c.getResources().getString(i));
        }

        public void a(View view) {
            N.this.j.setCustomView(view);
            this.f184f = new WeakReference<>(view);
        }

        public void a(k kVar) {
            if (this.f183e != null) {
                i();
                N.this.j.d();
            }
        }

        public void a(CharSequence charSequence) {
            N.this.j.setSubtitle(charSequence);
        }

        public void a(boolean z) {
            super.a(z);
            N.this.j.setTitleOptional(z);
        }

        public boolean a(k kVar, MenuItem menuItem) {
            b.a aVar = this.f183e;
            if (aVar != null) {
                return aVar.a((b) this, menuItem);
            }
            return false;
        }

        public View b() {
            WeakReference<View> weakReference = this.f184f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public void b(int i) {
            b((CharSequence) N.this.f175c.getResources().getString(i));
        }

        public void b(CharSequence charSequence) {
            N.this.j.setTitle(charSequence);
        }

        public Menu c() {
            return this.f182d;
        }

        public MenuInflater d() {
            return new g(this.f181c);
        }

        public CharSequence e() {
            return N.this.j.getSubtitle();
        }

        public CharSequence g() {
            return N.this.j.getTitle();
        }

        public void i() {
            if (N.this.p == this) {
                this.f182d.s();
                try {
                    this.f183e.b(this, this.f182d);
                } finally {
                    this.f182d.r();
                }
            }
        }

        public boolean j() {
            return N.this.j.b();
        }

        public boolean k() {
            this.f182d.s();
            try {
                return this.f183e.a((b) this, (Menu) this.f182d);
            } finally {
                this.f182d.r();
            }
        }
    }

    public N(Activity activity, boolean z2) {
        this.f177e = activity;
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (!z2) {
            this.k = decorView.findViewById(16908290);
        }
    }

    public N(Dialog dialog) {
        this.f178f = dialog;
        b(dialog.getWindow().getDecorView());
    }

    private S a(View view) {
        if (view instanceof S) {
            return (S) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    static boolean a(boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return true;
        }
        return !z2 && !z3;
    }

    private void b(View view) {
        this.f179g = (ActionBarOverlayLayout) view.findViewById(f.decor_content_parent);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f179g;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.i = a(view.findViewById(f.action_bar));
        this.j = (ActionBarContextView) view.findViewById(f.action_context_bar);
        this.f180h = (ActionBarContainer) view.findViewById(f.action_bar_container);
        S s2 = this.i;
        if (s2 == null || this.j == null || this.f180h == null) {
            throw new IllegalStateException(N.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f175c = s2.getContext();
        boolean z2 = (this.i.l() & 4) != 0;
        if (z2) {
            this.o = true;
        }
        b.a.d.a a2 = b.a.d.a.a(this.f175c);
        j(a2.a() || z2);
        k(a2.f());
        TypedArray obtainStyledAttributes = this.f175c.obtainStyledAttributes((AttributeSet) null, j.ActionBar, b.a.a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(j.ActionBar_hideOnContentScroll, false)) {
            i(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void k(boolean z2) {
        this.u = z2;
        if (!this.u) {
            this.i.a((C0125ha) null);
            this.f180h.setTabContainer(this.l);
        } else {
            this.f180h.setTabContainer((C0125ha) null);
            this.i.a(this.l);
        }
        boolean z3 = true;
        boolean z4 = m() == 2;
        C0125ha haVar = this.l;
        if (haVar != null) {
            if (z4) {
                haVar.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f179g;
                if (actionBarOverlayLayout != null) {
                    y.F(actionBarOverlayLayout);
                }
            } else {
                haVar.setVisibility(8);
            }
        }
        this.i.b(!this.u && z4);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f179g;
        if (this.u || !z4) {
            z3 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z3);
    }

    private void l(boolean z2) {
        if (a(this.x, this.y, this.z)) {
            if (!this.A) {
                this.A = true;
                h(z2);
            }
        } else if (this.A) {
            this.A = false;
            g(z2);
        }
    }

    private void n() {
        if (this.z) {
            this.z = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f179g;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            l(false);
        }
    }

    private boolean o() {
        return y.A(this.f180h);
    }

    private void p() {
        if (!this.z) {
            this.z = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f179g;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            l(false);
        }
    }

    public b a(b.a aVar) {
        a aVar2 = this.p;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.f179g.setHideOnContentScrollEnabled(false);
        this.j.c();
        a aVar3 = new a(this.j.getContext(), aVar);
        if (!aVar3.k()) {
            return null;
        }
        this.p = aVar3;
        aVar3.i();
        this.j.a(aVar3);
        f(true);
        this.j.sendAccessibilityEvent(32);
        return aVar3;
    }

    public void a() {
        if (this.y) {
            this.y = false;
            l(true);
        }
    }

    public void a(float f2) {
        y.a((View) this.f180h, f2);
    }

    public void a(int i2) {
        this.i.d(i2);
    }

    public void a(int i2, int i3) {
        int l2 = this.i.l();
        if ((i3 & 4) != 0) {
            this.o = true;
        }
        this.i.a((i2 & i3) | ((i3 ^ -1) & l2));
    }

    public void a(Configuration configuration) {
        k(b.a.d.a.a(this.f175c).f());
    }

    public void a(Drawable drawable) {
        this.i.a(drawable);
    }

    public void a(CharSequence charSequence) {
        this.i.setWindowTitle(charSequence);
    }

    public void a(boolean z2) {
        this.w = z2;
    }

    public boolean a(int i2, KeyEvent keyEvent) {
        Menu c2;
        a aVar = this.p;
        if (aVar == null || (c2 = aVar.c()) == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        c2.setQwertyMode(z2);
        return c2.performShortcut(i2, keyEvent, 0);
    }

    public void b() {
    }

    public void b(boolean z2) {
        if (z2 != this.s) {
            this.s = z2;
            int size = this.t.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.t.get(i2).onMenuVisibilityChanged(z2);
            }
        }
    }

    public void c() {
        if (!this.y) {
            this.y = true;
            l(true);
        }
    }

    public void c(boolean z2) {
        if (!this.o) {
            d(z2);
        }
    }

    public void d() {
        i iVar = this.B;
        if (iVar != null) {
            iVar.a();
            this.B = null;
        }
    }

    public void d(boolean z2) {
        a(z2 ? 4 : 0, 4);
    }

    public void e(boolean z2) {
        i iVar;
        this.C = z2;
        if (!z2 && (iVar = this.B) != null) {
            iVar.a();
        }
    }

    public void f(boolean z2) {
        E e2;
        E e3;
        if (z2) {
            p();
        } else {
            n();
        }
        if (o()) {
            if (z2) {
                e2 = this.i.a(4, 100);
                e3 = this.j.a(0, 200);
            } else {
                e3 = this.i.a(0, 200);
                e2 = this.j.a(8, 100);
            }
            i iVar = new i();
            iVar.a(e2, e3);
            iVar.c();
        } else if (z2) {
            this.i.c(4);
            this.j.setVisibility(0);
        } else {
            this.i.c(0);
            this.j.setVisibility(8);
        }
    }

    public boolean f() {
        S s2 = this.i;
        if (s2 == null || !s2.h()) {
            return false;
        }
        this.i.collapseActionView();
        return true;
    }

    public int g() {
        return this.i.l();
    }

    public void g(boolean z2) {
        View view;
        i iVar = this.B;
        if (iVar != null) {
            iVar.a();
        }
        if (this.v != 0 || (!this.C && !z2)) {
            this.E.b((View) null);
            return;
        }
        this.f180h.setAlpha(1.0f);
        this.f180h.setTransitioning(true);
        i iVar2 = new i();
        float f2 = (float) (-this.f180h.getHeight());
        if (z2) {
            int[] iArr = {0, 0};
            this.f180h.getLocationInWindow(iArr);
            f2 -= (float) iArr[1];
        }
        E a2 = y.a(this.f180h);
        a2.b(f2);
        a2.a(this.G);
        iVar2.a(a2);
        if (this.w && (view = this.k) != null) {
            E a3 = y.a(view);
            a3.b(f2);
            iVar2.a(a3);
        }
        iVar2.a(f173a);
        iVar2.a(250);
        iVar2.a(this.E);
        this.B = iVar2;
        iVar2.c();
    }

    public Context h() {
        if (this.f176d == null) {
            TypedValue typedValue = new TypedValue();
            this.f175c.getTheme().resolveAttribute(b.a.a.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f176d = new ContextThemeWrapper(this.f175c, i2);
            } else {
                this.f176d = this.f175c;
            }
        }
        return this.f176d;
    }

    public void h(boolean z2) {
        View view;
        View view2;
        i iVar = this.B;
        if (iVar != null) {
            iVar.a();
        }
        this.f180h.setVisibility(0);
        if (this.v != 0 || (!this.C && !z2)) {
            this.f180h.setAlpha(1.0f);
            this.f180h.setTranslationY(0.0f);
            if (this.w && (view = this.k) != null) {
                view.setTranslationY(0.0f);
            }
            this.F.b((View) null);
        } else {
            this.f180h.setTranslationY(0.0f);
            float f2 = (float) (-this.f180h.getHeight());
            if (z2) {
                int[] iArr = {0, 0};
                this.f180h.getLocationInWindow(iArr);
                f2 -= (float) iArr[1];
            }
            this.f180h.setTranslationY(f2);
            i iVar2 = new i();
            E a2 = y.a(this.f180h);
            a2.b(0.0f);
            a2.a(this.G);
            iVar2.a(a2);
            if (this.w && (view2 = this.k) != null) {
                view2.setTranslationY(f2);
                E a3 = y.a(this.k);
                a3.b(0.0f);
                iVar2.a(a3);
            }
            iVar2.a(f174b);
            iVar2.a(250);
            iVar2.a(this.F);
            this.B = iVar2;
            iVar2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f179g;
        if (actionBarOverlayLayout != null) {
            y.F(actionBarOverlayLayout);
        }
    }

    public void i(boolean z2) {
        if (!z2 || this.f179g.i()) {
            this.D = z2;
            this.f179g.setHideOnContentScrollEnabled(z2);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void j(boolean z2) {
        this.i.a(z2);
    }

    /* access modifiers changed from: package-private */
    public void l() {
        b.a aVar = this.r;
        if (aVar != null) {
            aVar.a(this.q);
            this.q = null;
            this.r = null;
        }
    }

    public int m() {
        return this.i.j();
    }

    public void onWindowVisibilityChanged(int i2) {
        this.v = i2;
    }
}
