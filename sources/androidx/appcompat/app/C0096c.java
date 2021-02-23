package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.C0097d;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import b.a.b.a.f;

/* renamed from: androidx.appcompat.app.c  reason: case insensitive filesystem */
public class C0096c implements DrawerLayout.c {

    /* renamed from: a  reason: collision with root package name */
    private final a f188a;

    /* renamed from: b  reason: collision with root package name */
    private final DrawerLayout f189b;

    /* renamed from: c  reason: collision with root package name */
    private f f190c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f191d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f192e;

    /* renamed from: f  reason: collision with root package name */
    boolean f193f;

    /* renamed from: g  reason: collision with root package name */
    private final int f194g;

    /* renamed from: h  reason: collision with root package name */
    private final int f195h;
    View.OnClickListener i;
    private boolean j;

    /* renamed from: androidx.appcompat.app.c$a */
    public interface a {
        void a(int i);

        void a(Drawable drawable, int i);

        boolean a();

        Context b();

        Drawable c();
    }

    /* renamed from: androidx.appcompat.app.c$b */
    public interface b {
        a getDrawerToggleDelegate();
    }

    /* renamed from: androidx.appcompat.app.c$c  reason: collision with other inner class name */
    private static class C0009c implements a {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f196a;

        /* renamed from: b  reason: collision with root package name */
        private C0097d.a f197b;

        C0009c(Activity activity) {
            this.f196a = activity;
        }

        public void a(int i) {
            if (Build.VERSION.SDK_INT >= 18) {
                ActionBar actionBar = this.f196a.getActionBar();
                if (actionBar != null) {
                    actionBar.setHomeActionContentDescription(i);
                    return;
                }
                return;
            }
            this.f197b = C0097d.a(this.f197b, this.f196a, i);
        }

        public void a(Drawable drawable, int i) {
            ActionBar actionBar = this.f196a.getActionBar();
            if (actionBar == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 18) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i);
                return;
            }
            actionBar.setDisplayShowHomeEnabled(true);
            this.f197b = C0097d.a(this.f196a, drawable, i);
            actionBar.setDisplayShowHomeEnabled(false);
        }

        public boolean a() {
            ActionBar actionBar = this.f196a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        public Context b() {
            ActionBar actionBar = this.f196a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f196a;
        }

        public Drawable c() {
            if (Build.VERSION.SDK_INT < 18) {
                return C0097d.a(this.f196a);
            }
            TypedArray obtainStyledAttributes = b().obtainStyledAttributes((AttributeSet) null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }
    }

    /* renamed from: androidx.appcompat.app.c$d */
    static class d implements a {

        /* renamed from: a  reason: collision with root package name */
        final Toolbar f198a;

        /* renamed from: b  reason: collision with root package name */
        final Drawable f199b;

        /* renamed from: c  reason: collision with root package name */
        final CharSequence f200c;

        d(Toolbar toolbar) {
            this.f198a = toolbar;
            this.f199b = toolbar.getNavigationIcon();
            this.f200c = toolbar.getNavigationContentDescription();
        }

        public void a(int i) {
            if (i == 0) {
                this.f198a.setNavigationContentDescription(this.f200c);
            } else {
                this.f198a.setNavigationContentDescription(i);
            }
        }

        public void a(Drawable drawable, int i) {
            this.f198a.setNavigationIcon(drawable);
            a(i);
        }

        public boolean a() {
            return true;
        }

        public Context b() {
            return this.f198a.getContext();
        }

        public Drawable c() {
            return this.f199b;
        }
    }

    C0096c(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, f fVar, int i2, int i3) {
        this.f191d = true;
        this.f193f = true;
        this.j = false;
        if (toolbar != null) {
            this.f188a = new d(toolbar);
            toolbar.setNavigationOnClickListener(new C0095b(this));
        } else if (activity instanceof b) {
            this.f188a = ((b) activity).getDrawerToggleDelegate();
        } else {
            this.f188a = new C0009c(activity);
        }
        this.f189b = drawerLayout;
        this.f194g = i2;
        this.f195h = i3;
        if (fVar == null) {
            this.f190c = new f(this.f188a.b());
        } else {
            this.f190c = fVar;
        }
        this.f192e = a();
    }

    public C0096c(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i2, int i3) {
        this(activity, toolbar, drawerLayout, (f) null, i2, i3);
    }

    private void a(float f2) {
        f fVar;
        boolean z;
        if (f2 == 1.0f) {
            fVar = this.f190c;
            z = true;
        } else {
            if (f2 == 0.0f) {
                fVar = this.f190c;
                z = false;
            }
            this.f190c.c(f2);
        }
        fVar.b(z);
        this.f190c.c(f2);
    }

    /* access modifiers changed from: package-private */
    public Drawable a() {
        return this.f188a.c();
    }

    public void a(int i2) {
    }

    /* access modifiers changed from: package-private */
    public void a(Drawable drawable, int i2) {
        if (!this.j && !this.f188a.a()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.j = true;
        }
        this.f188a.a(drawable, i2);
    }

    public void a(View view) {
        a(1.0f);
        if (this.f193f) {
            b(this.f195h);
        }
    }

    public void a(View view, float f2) {
        if (this.f191d) {
            a(Math.min(1.0f, Math.max(0.0f, f2)));
        } else {
            a(0.0f);
        }
    }

    public void b() {
        a(this.f189b.f(8388611) ? 1.0f : 0.0f);
        if (this.f193f) {
            a((Drawable) this.f190c, this.f189b.f(8388611) ? this.f195h : this.f194g);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        this.f188a.a(i2);
    }

    public void b(View view) {
        a(0.0f);
        if (this.f193f) {
            b(this.f194g);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        int c2 = this.f189b.c(8388611);
        if (this.f189b.g(8388611) && c2 != 2) {
            this.f189b.a(8388611);
        } else if (c2 != 1) {
            this.f189b.h(8388611);
        }
    }
}
