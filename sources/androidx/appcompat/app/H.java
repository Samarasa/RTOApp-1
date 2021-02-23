package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.t;
import androidx.appcompat.widget.Ha;
import androidx.appcompat.widget.S;
import androidx.appcompat.widget.Toolbar;
import b.a.d.j;
import b.h.j.y;
import java.util.ArrayList;

class H extends C0094a {

    /* renamed from: a  reason: collision with root package name */
    S f144a;

    /* renamed from: b  reason: collision with root package name */
    boolean f145b;

    /* renamed from: c  reason: collision with root package name */
    Window.Callback f146c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f147d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f148e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<C0094a.b> f149f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f150g = new F(this);

    /* renamed from: h  reason: collision with root package name */
    private final Toolbar.c f151h = new G(this);

    private final class a implements t.a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f152a;

        a() {
        }

        public void a(k kVar, boolean z) {
            if (!this.f152a) {
                this.f152a = true;
                H.this.f144a.g();
                Window.Callback callback = H.this.f146c;
                if (callback != null) {
                    callback.onPanelClosed(108, kVar);
                }
                this.f152a = false;
            }
        }

        public boolean a(k kVar) {
            Window.Callback callback = H.this.f146c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, kVar);
            return true;
        }
    }

    private final class b implements k.a {
        b() {
        }

        public void a(k kVar) {
            H h2 = H.this;
            if (h2.f146c == null) {
                return;
            }
            if (h2.f144a.a()) {
                H.this.f146c.onPanelClosed(108, kVar);
            } else if (H.this.f146c.onPreparePanel(0, (View) null, kVar)) {
                H.this.f146c.onMenuOpened(108, kVar);
            }
        }

        public boolean a(k kVar, MenuItem menuItem) {
            return false;
        }
    }

    private class c extends j {
        public c(Window.Callback callback) {
            super(callback);
        }

        public View onCreatePanelView(int i) {
            return i == 0 ? new View(H.this.f144a.getContext()) : super.onCreatePanelView(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                H h2 = H.this;
                if (!h2.f145b) {
                    h2.f144a.b();
                    H.this.f145b = true;
                }
            }
            return onPreparePanel;
        }
    }

    H(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.f144a = new Ha(toolbar, false);
        this.f146c = new c(callback);
        this.f144a.setWindowCallback(this.f146c);
        toolbar.setOnMenuItemClickListener(this.f151h);
        this.f144a.setWindowTitle(charSequence);
    }

    private Menu n() {
        if (!this.f147d) {
            this.f144a.a((t.a) new a(), (k.a) new b());
            this.f147d = true;
        }
        return this.f144a.i();
    }

    public void a(int i) {
        this.f144a.d(i);
    }

    public void a(int i, int i2) {
        this.f144a.a((i & i2) | ((i2 ^ -1) & this.f144a.l()));
    }

    public void a(Configuration configuration) {
        super.a(configuration);
    }

    public void a(Drawable drawable) {
        this.f144a.a(drawable);
    }

    public void a(CharSequence charSequence) {
        this.f144a.setWindowTitle(charSequence);
    }

    public boolean a(int i, KeyEvent keyEvent) {
        Menu n = n();
        if (n == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        n.setQwertyMode(z);
        return n.performShortcut(i, keyEvent, 0);
    }

    public boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    public void b(boolean z) {
        if (z != this.f148e) {
            this.f148e = z;
            int size = this.f149f.size();
            for (int i = 0; i < size; i++) {
                this.f149f.get(i).onMenuVisibilityChanged(z);
            }
        }
    }

    public void c(boolean z) {
    }

    public void d(boolean z) {
        a(z ? 4 : 0, 4);
    }

    public void e(boolean z) {
    }

    public boolean e() {
        return this.f144a.e();
    }

    public boolean f() {
        if (!this.f144a.h()) {
            return false;
        }
        this.f144a.collapseActionView();
        return true;
    }

    public int g() {
        return this.f144a.l();
    }

    public Context h() {
        return this.f144a.getContext();
    }

    public boolean i() {
        this.f144a.k().removeCallbacks(this.f150g);
        y.a((View) this.f144a.k(), this.f150g);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        this.f144a.k().removeCallbacks(this.f150g);
    }

    public boolean k() {
        return this.f144a.f();
    }

    public Window.Callback l() {
        return this.f146c;
    }

    /* access modifiers changed from: package-private */
    public void m() {
        Menu n = n();
        k kVar = n instanceof k ? (k) n : null;
        if (kVar != null) {
            kVar.s();
        }
        try {
            n.clear();
            if (!this.f146c.onCreatePanelMenu(0, n) || !this.f146c.onPreparePanel(0, (View) null, n)) {
                n.clear();
            }
        } finally {
            if (kVar != null) {
                kVar.r();
            }
        }
    }
}
