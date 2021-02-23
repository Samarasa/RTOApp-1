package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.C0096c;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.t;
import androidx.appcompat.view.menu.u;
import androidx.appcompat.widget.Aa;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0142q;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Na;
import androidx.appcompat.widget.Oa;
import androidx.appcompat.widget.Q;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.V;
import androidx.core.app.l;
import b.a.d.b;
import b.a.d.f;
import b.h.j.C0198d;
import b.h.j.C0199e;
import b.h.j.E;
import b.h.j.F;
import b.h.j.q;
import b.h.j.y;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

class z extends q implements k.a, LayoutInflater.Factory2 {

    /* renamed from: d  reason: collision with root package name */
    private static final Map<Class<?>, Integer> f244d = new b.e.b();

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f245e = (Build.VERSION.SDK_INT < 21);

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f246f = {16842836};

    /* renamed from: g  reason: collision with root package name */
    private static boolean f247g = true;
    private TextView A;
    private View B;
    private boolean C;
    private boolean D;
    boolean E;
    boolean F;
    boolean G;
    boolean H;
    boolean I;
    private boolean J;
    private i[] K;
    private i L;
    private boolean M;
    private boolean N;
    private boolean O;
    boolean P;
    private int Q;
    private int R;
    private boolean S;
    private boolean T;
    private f U;
    private f V;
    boolean W;
    int X;
    private final Runnable Y;
    private boolean Z;
    private Rect aa;
    private Rect ba;
    private AppCompatViewInflater ca;

    /* renamed from: h  reason: collision with root package name */
    final Object f248h;
    final Context i;
    Window j;
    private d k;
    final p l;
    C0094a m;
    MenuInflater n;
    private CharSequence o;
    private Q p;
    private b q;
    private j r;
    b.a.d.b s;
    ActionBarContextView t;
    PopupWindow u;
    Runnable v;
    E w;
    private boolean x;
    private boolean y;
    private ViewGroup z;

    private class a implements C0096c.a {
        a() {
        }

        public void a(int i) {
            C0094a e2 = z.this.e();
            if (e2 != null) {
                e2.a(i);
            }
        }

        public void a(Drawable drawable, int i) {
            C0094a e2 = z.this.e();
            if (e2 != null) {
                e2.a(drawable);
                e2.a(i);
            }
        }

        public boolean a() {
            C0094a e2 = z.this.e();
            return (e2 == null || (e2.g() & 4) == 0) ? false : true;
        }

        public Context b() {
            return z.this.o();
        }

        public Drawable c() {
            Aa a2 = Aa.a(b(), (AttributeSet) null, new int[]{b.a.a.homeAsUpIndicator});
            Drawable b2 = a2.b(0);
            a2.a();
            return b2;
        }
    }

    private final class b implements t.a {
        b() {
        }

        public void a(k kVar, boolean z) {
            z.this.b(kVar);
        }

        public boolean a(k kVar) {
            Window.Callback r = z.this.r();
            if (r == null) {
                return true;
            }
            r.onMenuOpened(108, kVar);
            return true;
        }
    }

    class c implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private b.a f251a;

        public c(b.a aVar) {
            this.f251a = aVar;
        }

        public void a(b.a.d.b bVar) {
            this.f251a.a(bVar);
            z zVar = z.this;
            if (zVar.u != null) {
                zVar.j.getDecorView().removeCallbacks(z.this.v);
            }
            z zVar2 = z.this;
            if (zVar2.t != null) {
                zVar2.n();
                z zVar3 = z.this;
                E a2 = y.a(zVar3.t);
                a2.a(0.0f);
                zVar3.w = a2;
                z.this.w.a((F) new A(this));
            }
            z zVar4 = z.this;
            p pVar = zVar4.l;
            if (pVar != null) {
                pVar.onSupportActionModeFinished(zVar4.s);
            }
            z.this.s = null;
        }

        public boolean a(b.a.d.b bVar, Menu menu) {
            return this.f251a.a(bVar, menu);
        }

        public boolean a(b.a.d.b bVar, MenuItem menuItem) {
            return this.f251a.a(bVar, menuItem);
        }

        public boolean b(b.a.d.b bVar, Menu menu) {
            return this.f251a.b(bVar, menu);
        }
    }

    class d extends b.a.d.j {
        d(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        public final ActionMode a(ActionMode.Callback callback) {
            f.a aVar = new f.a(z.this.i, callback);
            b.a.d.b a2 = z.this.a((b.a) aVar);
            if (a2 != null) {
                return aVar.b(a2);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return z.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || z.this.b(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof k)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            z.this.h(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            z.this.i(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            k kVar = menu instanceof k ? (k) menu : null;
            if (i == 0 && kVar == null) {
                return false;
            }
            if (kVar != null) {
                kVar.c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (kVar != null) {
                kVar.c(false);
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            k kVar;
            i a2 = z.this.a(0, true);
            if (a2 == null || (kVar = a2.j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, kVar, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return z.this.s() ? a(callback) : super.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!z.this.s() || i != 0) ? super.onWindowStartingActionMode(callback, i) : a(callback);
        }
    }

    private class e extends f {

        /* renamed from: c  reason: collision with root package name */
        private final PowerManager f254c;

        e(Context context) {
            super();
            this.f254c = (PowerManager) context.getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !this.f254c.isPowerSaveMode()) ? 1 : 2;
        }

        public void d() {
            z.this.l();
        }
    }

    abstract class f {

        /* renamed from: a  reason: collision with root package name */
        private BroadcastReceiver f256a;

        f() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            BroadcastReceiver broadcastReceiver = this.f256a;
            if (broadcastReceiver != null) {
                try {
                    z.this.i.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f256a = null;
            }
        }

        /* access modifiers changed from: package-private */
        public abstract IntentFilter b();

        /* access modifiers changed from: package-private */
        public abstract int c();

        /* access modifiers changed from: package-private */
        public abstract void d();

        /* access modifiers changed from: package-private */
        public void e() {
            a();
            IntentFilter b2 = b();
            if (b2 != null && b2.countActions() != 0) {
                if (this.f256a == null) {
                    this.f256a = new B(this);
                }
                z.this.i.registerReceiver(this.f256a, b2);
            }
        }
    }

    private class g extends f {

        /* renamed from: c  reason: collision with root package name */
        private final J f258c;

        g(J j) {
            super();
            this.f258c = j;
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        public int c() {
            return this.f258c.a() ? 2 : 1;
        }

        public void d() {
            z.this.l();
        }
    }

    private class h extends ContentFrameLayout {
        public h(Context context) {
            super(context);
        }

        private boolean a(int i2, int i3) {
            return i2 < -5 || i3 < -5 || i2 > getWidth() + 5 || i3 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return z.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            z.this.e(0);
            return true;
        }

        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(b.a.a.a.a.b(getContext(), i2));
        }
    }

    protected static final class i {

        /* renamed from: a  reason: collision with root package name */
        int f260a;

        /* renamed from: b  reason: collision with root package name */
        int f261b;

        /* renamed from: c  reason: collision with root package name */
        int f262c;

        /* renamed from: d  reason: collision with root package name */
        int f263d;

        /* renamed from: e  reason: collision with root package name */
        int f264e;

        /* renamed from: f  reason: collision with root package name */
        int f265f;

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f266g;

        /* renamed from: h  reason: collision with root package name */
        View f267h;
        View i;
        k j;
        androidx.appcompat.view.menu.i k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        i(int i2) {
            this.f260a = i2;
        }

        /* access modifiers changed from: package-private */
        public u a(t.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                this.k = new androidx.appcompat.view.menu.i(this.l, b.a.g.abc_list_menu_item_layout);
                this.k.a(aVar);
                this.j.a((t) this.k);
            }
            return this.k.a(this.f266g);
        }

        /* access modifiers changed from: package-private */
        public void a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(b.a.a.actionBarPopupTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            }
            newTheme.resolveAttribute(b.a.a.panelMenuListTheme, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 == 0) {
                i3 = b.a.i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i3, true);
            b.a.d.d dVar = new b.a.d.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(b.a.j.AppCompatTheme);
            this.f261b = obtainStyledAttributes.getResourceId(b.a.j.AppCompatTheme_panelBackground, 0);
            this.f265f = obtainStyledAttributes.getResourceId(b.a.j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public void a(k kVar) {
            androidx.appcompat.view.menu.i iVar;
            k kVar2 = this.j;
            if (kVar != kVar2) {
                if (kVar2 != null) {
                    kVar2.b((t) this.k);
                }
                this.j = kVar;
                if (kVar != null && (iVar = this.k) != null) {
                    kVar.a((t) iVar);
                }
            }
        }

        public boolean a() {
            if (this.f267h == null) {
                return false;
            }
            return this.i != null || this.k.c().getCount() > 0;
        }
    }

    private final class j implements t.a {
        j() {
        }

        public void a(k kVar, boolean z) {
            k m = kVar.m();
            boolean z2 = m != kVar;
            z zVar = z.this;
            if (z2) {
                kVar = m;
            }
            i a2 = zVar.a((Menu) kVar);
            if (a2 == null) {
                return;
            }
            if (z2) {
                z.this.a(a2.f260a, a2, m);
                z.this.a(a2, true);
                return;
            }
            z.this.a(a2, z);
        }

        public boolean a(k kVar) {
            Window.Callback r;
            if (kVar != null) {
                return true;
            }
            z zVar = z.this;
            if (!zVar.E || (r = zVar.r()) == null || z.this.P) {
                return true;
            }
            r.onMenuOpened(108, kVar);
            return true;
        }
    }

    static {
        if (f245e && !f247g) {
            Thread.setDefaultUncaughtExceptionHandler(new r(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    z(Activity activity, p pVar) {
        this(activity, (Window) null, pVar, activity);
    }

    z(Dialog dialog, p pVar) {
        this(dialog.getContext(), dialog.getWindow(), pVar, dialog);
    }

    private z(Context context, Window window, p pVar, Object obj) {
        Integer num;
        o F2;
        this.w = null;
        this.x = true;
        this.Q = -100;
        this.Y = new s(this);
        this.i = context;
        this.l = pVar;
        this.f248h = obj;
        if (this.Q == -100 && (this.f248h instanceof Dialog) && (F2 = F()) != null) {
            this.Q = F2.getDelegate().c();
        }
        if (this.Q == -100 && (num = f244d.get(this.f248h.getClass())) != null) {
            this.Q = num.intValue();
            f244d.remove(this.f248h.getClass());
        }
        if (window != null) {
            a(window);
        }
        C0142q.c();
    }

    private void A() {
        if (this.j == null) {
            Object obj = this.f248h;
            if (obj instanceof Activity) {
                a(((Activity) obj).getWindow());
            }
        }
        if (this.j == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private f B() {
        if (this.V == null) {
            this.V = new e(this.i);
        }
        return this.V;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void C() {
        /*
            r3 = this;
            r3.z()
            boolean r0 = r3.E
            if (r0 == 0) goto L_0x0033
            androidx.appcompat.app.a r0 = r3.m
            if (r0 == 0) goto L_0x000c
            goto L_0x0033
        L_0x000c:
            java.lang.Object r0 = r3.f248h
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x001e
            androidx.appcompat.app.N r1 = new androidx.appcompat.app.N
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.F
            r1.<init>(r0, r2)
        L_0x001b:
            r3.m = r1
            goto L_0x002a
        L_0x001e:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L_0x002a
            androidx.appcompat.app.N r1 = new androidx.appcompat.app.N
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
            goto L_0x001b
        L_0x002a:
            androidx.appcompat.app.a r0 = r3.m
            if (r0 == 0) goto L_0x0033
            boolean r1 = r3.Z
            r0.c(r1)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.z.C():void");
    }

    private boolean D() {
        if (!this.T && (this.f248h instanceof Activity)) {
            PackageManager packageManager = this.i.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.i, this.f248h.getClass()), 0);
                this.S = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.S = false;
            }
        }
        this.T = true;
        return this.S;
    }

    private void E() {
        if (this.y) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private o F() {
        Context context = this.i;
        while (context != null) {
            if (!(context instanceof o)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (o) context;
            }
        }
        return null;
    }

    private void a(Window window) {
        if (this.j == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof d)) {
                this.k = new d(callback);
                window.setCallback(this.k);
                Aa a2 = Aa.a(this.i, (AttributeSet) null, f246f);
                Drawable c2 = a2.c(0);
                if (c2 != null) {
                    window.setBackgroundDrawable(c2);
                }
                a2.a();
                this.j = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private void a(i iVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (!iVar.o && !this.P) {
            if (iVar.f260a == 0) {
                if ((this.i.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback r2 = r();
            if (r2 == null || r2.onMenuOpened(iVar.f260a, iVar.j)) {
                WindowManager windowManager = (WindowManager) this.i.getSystemService("window");
                if (windowManager != null && b(iVar, keyEvent)) {
                    if (iVar.f266g == null || iVar.q) {
                        ViewGroup viewGroup = iVar.f266g;
                        if (viewGroup == null) {
                            if (!b(iVar) || iVar.f266g == null) {
                                return;
                            }
                        } else if (iVar.q && viewGroup.getChildCount() > 0) {
                            iVar.f266g.removeAllViews();
                        }
                        if (a(iVar) && iVar.a()) {
                            ViewGroup.LayoutParams layoutParams2 = iVar.f267h.getLayoutParams();
                            if (layoutParams2 == null) {
                                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            iVar.f266g.setBackgroundResource(iVar.f261b);
                            ViewParent parent = iVar.f267h.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(iVar.f267h);
                            }
                            iVar.f266g.addView(iVar.f267h, layoutParams2);
                            if (!iVar.f267h.hasFocus()) {
                                iVar.f267h.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else {
                        View view = iVar.i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i2 = -1;
                            iVar.n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, iVar.f263d, iVar.f264e, 1002, 8519680, -3);
                            layoutParams3.gravity = iVar.f262c;
                            layoutParams3.windowAnimations = iVar.f265f;
                            windowManager.addView(iVar.f266g, layoutParams3);
                            iVar.o = true;
                            return;
                        }
                    }
                    i2 = -2;
                    iVar.n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i2, -2, iVar.f263d, iVar.f264e, 1002, 8519680, -3);
                    layoutParams32.gravity = iVar.f262c;
                    layoutParams32.windowAnimations = iVar.f265f;
                    windowManager.addView(iVar.f266g, layoutParams32);
                    iVar.o = true;
                    return;
                }
                return;
            }
            a(iVar, true);
        }
    }

    private void a(k kVar, boolean z2) {
        Q q2 = this.p;
        if (q2 == null || !q2.c() || (ViewConfiguration.get(this.i).hasPermanentMenuKey() && !this.p.d())) {
            i a2 = a(0, true);
            a2.q = true;
            a(a2, false);
            a(a2, (KeyEvent) null);
            return;
        }
        Window.Callback r2 = r();
        if (this.p.a() && z2) {
            this.p.e();
            if (!this.P) {
                r2.onPanelClosed(108, a(0, true).j);
            }
        } else if (r2 != null && !this.P) {
            if (this.W && (this.X & 1) != 0) {
                this.j.getDecorView().removeCallbacks(this.Y);
                this.Y.run();
            }
            i a3 = a(0, true);
            k kVar2 = a3.j;
            if (kVar2 != null && !a3.r && r2.onPreparePanel(0, a3.i, kVar2)) {
                r2.onMenuOpened(108, a3.j);
                this.p.f();
            }
        }
    }

    private boolean a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.j.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || y.z((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean a(i iVar) {
        View view = iVar.i;
        if (view != null) {
            iVar.f267h = view;
            return true;
        } else if (iVar.j == null) {
            return false;
        } else {
            if (this.r == null) {
                this.r = new j();
            }
            iVar.f267h = (View) iVar.a((t.a) this.r);
            return iVar.f267h != null;
        }
    }

    private boolean a(i iVar, int i2, KeyEvent keyEvent, int i3) {
        k kVar;
        boolean z2 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((iVar.m || b(iVar, keyEvent)) && (kVar = iVar.j) != null) {
            z2 = kVar.performShortcut(i2, keyEvent, i3);
        }
        if (z2 && (i3 & 1) == 0 && this.p == null) {
            a(iVar, true);
        }
        return z2;
    }

    private boolean a(boolean z2) {
        if (this.P) {
            return false;
        }
        int x2 = x();
        boolean b2 = b(g(x2), z2);
        if (x2 == 0) {
            p().e();
        } else {
            f fVar = this.U;
            if (fVar != null) {
                fVar.a();
            }
        }
        if (x2 == 3) {
            B().e();
        } else {
            f fVar2 = this.V;
            if (fVar2 != null) {
                fVar2.a();
            }
        }
        return b2;
    }

    private boolean b(int i2, boolean z2) {
        int i3 = this.i.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        int i4 = i2 != 1 ? i2 != 2 ? i3 : 32 : 16;
        boolean D2 = D();
        boolean z3 = false;
        if (i4 != i3 && !D2 && Build.VERSION.SDK_INT >= 17 && !this.N && (this.f248h instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & -49) | i4;
            try {
                ((ContextThemeWrapper) this.f248h).applyOverrideConfiguration(configuration);
                z3 = true;
            } catch (IllegalStateException e2) {
                Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", e2);
            }
        }
        if (!z3 && !D2 && (this.i.getResources().getConfiguration().uiMode & 48) != i4) {
            if (z2 && this.N && (Build.VERSION.SDK_INT >= 17 || this.O)) {
                Object obj = this.f248h;
                if (obj instanceof Activity) {
                    androidx.core.app.b.d((Activity) obj);
                    z3 = true;
                }
            }
            if (!z3) {
                m(i4);
                z3 = true;
            }
        }
        if (z3 || D2) {
            Object obj2 = this.f248h;
            if (obj2 instanceof o) {
                ((o) obj2).onNightModeChanged(i2);
            }
        }
        return z3;
    }

    private boolean b(i iVar) {
        iVar.a(o());
        iVar.f266g = new h(iVar.l);
        iVar.f262c = 81;
        return true;
    }

    private boolean b(i iVar, KeyEvent keyEvent) {
        Q q2;
        Q q3;
        Q q4;
        if (this.P) {
            return false;
        }
        if (iVar.m) {
            return true;
        }
        i iVar2 = this.L;
        if (!(iVar2 == null || iVar2 == iVar)) {
            a(iVar2, false);
        }
        Window.Callback r2 = r();
        if (r2 != null) {
            iVar.i = r2.onCreatePanelView(iVar.f260a);
        }
        int i2 = iVar.f260a;
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (q4 = this.p) != null) {
            q4.b();
        }
        if (iVar.i == null && (!z2 || !(u() instanceof H))) {
            if (iVar.j == null || iVar.r) {
                if (iVar.j == null && (!c(iVar) || iVar.j == null)) {
                    return false;
                }
                if (z2 && this.p != null) {
                    if (this.q == null) {
                        this.q = new b();
                    }
                    this.p.a(iVar.j, this.q);
                }
                iVar.j.s();
                if (!r2.onCreatePanelMenu(iVar.f260a, iVar.j)) {
                    iVar.a((k) null);
                    if (z2 && (q3 = this.p) != null) {
                        q3.a((Menu) null, this.q);
                    }
                    return false;
                }
                iVar.r = false;
            }
            iVar.j.s();
            Bundle bundle = iVar.s;
            if (bundle != null) {
                iVar.j.a(bundle);
                iVar.s = null;
            }
            if (!r2.onPreparePanel(0, iVar.i, iVar.j)) {
                if (z2 && (q2 = this.p) != null) {
                    q2.a((Menu) null, this.q);
                }
                iVar.j.r();
                return false;
            }
            iVar.p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            iVar.j.setQwertyMode(iVar.p);
            iVar.j.r();
        }
        iVar.m = true;
        iVar.n = false;
        this.L = iVar;
        return true;
    }

    private boolean c(i iVar) {
        Context context = this.i;
        int i2 = iVar.f260a;
        if ((i2 == 0 || i2 == 108) && this.p != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(b.a.a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(b.a.a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(b.a.a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                b.a.d.d dVar = new b.a.d.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        k kVar = new k(context);
        kVar.a((k.a) this);
        iVar.a(kVar);
        return true;
    }

    private boolean d(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        i a2 = a(i2, true);
        if (!a2.o) {
            return b(a2, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean e(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            b.a.d.b r0 = r3.s
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.z$i r2 = r3.a((int) r4, (boolean) r0)
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.Q r4 = r3.p
            if (r4 == 0) goto L_0x0043
            boolean r4 = r4.c()
            if (r4 == 0) goto L_0x0043
            android.content.Context r4 = r3.i
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.Q r4 = r3.p
            boolean r4 = r4.a()
            if (r4 != 0) goto L_0x003c
            boolean r4 = r3.P
            if (r4 != 0) goto L_0x0063
            boolean r4 = r3.b((androidx.appcompat.app.z.i) r2, (android.view.KeyEvent) r5)
            if (r4 == 0) goto L_0x0063
            androidx.appcompat.widget.Q r4 = r3.p
            boolean r4 = r4.f()
            goto L_0x006a
        L_0x003c:
            androidx.appcompat.widget.Q r4 = r3.p
            boolean r4 = r4.e()
            goto L_0x006a
        L_0x0043:
            boolean r4 = r2.o
            if (r4 != 0) goto L_0x0065
            boolean r4 = r2.n
            if (r4 == 0) goto L_0x004c
            goto L_0x0065
        L_0x004c:
            boolean r4 = r2.m
            if (r4 == 0) goto L_0x0063
            boolean r4 = r2.r
            if (r4 == 0) goto L_0x005b
            r2.m = r1
            boolean r4 = r3.b((androidx.appcompat.app.z.i) r2, (android.view.KeyEvent) r5)
            goto L_0x005c
        L_0x005b:
            r4 = 1
        L_0x005c:
            if (r4 == 0) goto L_0x0063
            r3.a((androidx.appcompat.app.z.i) r2, (android.view.KeyEvent) r5)
            r4 = 1
            goto L_0x006a
        L_0x0063:
            r4 = 0
            goto L_0x006a
        L_0x0065:
            boolean r4 = r2.o
            r3.a((androidx.appcompat.app.z.i) r2, (boolean) r0)
        L_0x006a:
            if (r4 == 0) goto L_0x0083
            android.content.Context r5 = r3.i
            java.lang.String r0 = "audio"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007c
            r5.playSoundEffect(r1)
            goto L_0x0083
        L_0x007c:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r5, r0)
        L_0x0083:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.z.e(int, android.view.KeyEvent):boolean");
    }

    private void k(int i2) {
        this.X = (1 << i2) | this.X;
        if (!this.W) {
            y.a(this.j.getDecorView(), this.Y);
            this.W = true;
        }
    }

    private int l(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i2 != 9) {
            return i2;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    private void m(int i2) {
        Resources resources = this.i.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i2 | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration, (DisplayMetrics) null);
        if (Build.VERSION.SDK_INT < 26) {
            E.a(resources);
        }
        int i3 = this.R;
        if (i3 != 0) {
            this.i.setTheme(i3);
            if (Build.VERSION.SDK_INT >= 23) {
                this.i.getTheme().applyStyle(this.R, true);
            }
        }
    }

    private void w() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.z.findViewById(16908290);
        View decorView = this.j.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.i.obtainStyledAttributes(b.a.j.AppCompatTheme);
        obtainStyledAttributes.getValue(b.a.j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(b.a.j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(b.a.j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(b.a.j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(b.a.j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(b.a.j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(b.a.j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(b.a.j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(b.a.j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(b.a.j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private int x() {
        int i2 = this.Q;
        return i2 != -100 ? i2 : q.a();
    }

    private ViewGroup y() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.i.obtainStyledAttributes(b.a.j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(b.a.j.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(b.a.j.AppCompatTheme_windowNoTitle, false)) {
                b(1);
            } else if (obtainStyledAttributes.getBoolean(b.a.j.AppCompatTheme_windowActionBar, false)) {
                b(108);
            }
            if (obtainStyledAttributes.getBoolean(b.a.j.AppCompatTheme_windowActionBarOverlay, false)) {
                b(109);
            }
            if (obtainStyledAttributes.getBoolean(b.a.j.AppCompatTheme_windowActionModeOverlay, false)) {
                b(10);
            }
            this.H = obtainStyledAttributes.getBoolean(b.a.j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            A();
            this.j.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.i);
            if (this.I) {
                viewGroup = (ViewGroup) from.inflate(this.G ? b.a.g.abc_screen_simple_overlay_action_mode : b.a.g.abc_screen_simple, (ViewGroup) null);
                if (Build.VERSION.SDK_INT >= 21) {
                    y.a((View) viewGroup, (q) new t(this));
                } else {
                    ((V) viewGroup).setOnFitSystemWindowsListener(new u(this));
                }
            } else if (this.H) {
                viewGroup = (ViewGroup) from.inflate(b.a.g.abc_dialog_title_material, (ViewGroup) null);
                this.F = false;
                this.E = false;
            } else if (this.E) {
                TypedValue typedValue = new TypedValue();
                this.i.getTheme().resolveAttribute(b.a.a.actionBarTheme, typedValue, true);
                int i2 = typedValue.resourceId;
                viewGroup = (ViewGroup) LayoutInflater.from(i2 != 0 ? new b.a.d.d(this.i, i2) : this.i).inflate(b.a.g.abc_screen_toolbar, (ViewGroup) null);
                this.p = (Q) viewGroup.findViewById(b.a.f.decor_content_parent);
                this.p.setWindowCallback(r());
                if (this.F) {
                    this.p.a(109);
                }
                if (this.C) {
                    this.p.a(2);
                }
                if (this.D) {
                    this.p.a(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.p == null) {
                    this.A = (TextView) viewGroup.findViewById(b.a.f.title);
                }
                Oa.b(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(b.a.f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.j.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.j.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new v(this));
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.E + ", windowActionBarOverlay: " + this.F + ", android:windowIsFloating: " + this.H + ", windowActionModeOverlay: " + this.G + ", windowNoTitle: " + this.I + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void z() {
        if (!this.y) {
            this.z = y();
            CharSequence q2 = q();
            if (!TextUtils.isEmpty(q2)) {
                Q q3 = this.p;
                if (q3 != null) {
                    q3.setWindowTitle(q2);
                } else if (u() != null) {
                    u().a(q2);
                } else {
                    TextView textView = this.A;
                    if (textView != null) {
                        textView.setText(q2);
                    }
                }
            }
            w();
            a(this.z);
            this.y = true;
            i a2 = a(0, false);
            if (this.P) {
                return;
            }
            if (a2 == null || a2.j == null) {
                k(108);
            }
        }
    }

    public <T extends View> T a(int i2) {
        z();
        return this.j.findViewById(i2);
    }

    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        AppCompatViewInflater appCompatViewInflater;
        boolean z3 = false;
        if (this.ca == null) {
            String string = this.i.obtainStyledAttributes(b.a.j.AppCompatTheme).getString(b.a.j.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                appCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.ca = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    appCompatViewInflater = new AppCompatViewInflater();
                }
            }
            this.ca = appCompatViewInflater;
        }
        if (f245e) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z3 = a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z3 = true;
            }
            z2 = z3;
        } else {
            z2 = false;
        }
        return this.ca.createView(view, str, context, attributeSet, z2, f245e, true, Na.b());
    }

    /* access modifiers changed from: protected */
    public i a(int i2, boolean z2) {
        i[] iVarArr = this.K;
        if (iVarArr == null || iVarArr.length <= i2) {
            i[] iVarArr2 = new i[(i2 + 1)];
            if (iVarArr != null) {
                System.arraycopy(iVarArr, 0, iVarArr2, 0, iVarArr.length);
            }
            this.K = iVarArr2;
            iVarArr = iVarArr2;
        }
        i iVar = iVarArr[i2];
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(i2);
        iVarArr[i2] = iVar2;
        return iVar2;
    }

    /* access modifiers changed from: package-private */
    public i a(Menu menu) {
        i[] iVarArr = this.K;
        int length = iVarArr != null ? iVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            i iVar = iVarArr[i2];
            if (iVar != null && iVar.j == menu) {
                return iVar;
            }
        }
        return null;
    }

    public b.a.d.b a(b.a aVar) {
        p pVar;
        if (aVar != null) {
            b.a.d.b bVar = this.s;
            if (bVar != null) {
                bVar.a();
            }
            c cVar = new c(aVar);
            C0094a e2 = e();
            if (e2 != null) {
                this.s = e2.a((b.a) cVar);
                b.a.d.b bVar2 = this.s;
                if (!(bVar2 == null || (pVar = this.l) == null)) {
                    pVar.onSupportActionModeStarted(bVar2);
                }
            }
            if (this.s == null) {
                this.s = b((b.a) cVar);
            }
            return this.s;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, i iVar, Menu menu) {
        if (menu == null) {
            if (iVar == null && i2 >= 0) {
                i[] iVarArr = this.K;
                if (i2 < iVarArr.length) {
                    iVar = iVarArr[i2];
                }
            }
            if (iVar != null) {
                menu = iVar.j;
            }
        }
        if ((iVar == null || iVar.o) && !this.P) {
            this.k.a().onPanelClosed(i2, menu);
        }
    }

    public void a(Context context) {
        a(false);
        this.N = true;
    }

    public void a(Configuration configuration) {
        C0094a e2;
        if (this.E && this.y && (e2 = e()) != null) {
            e2.a(configuration);
        }
        C0142q.b().a(this.i);
        a(false);
    }

    public void a(Bundle bundle) {
        this.N = true;
        a(false);
        A();
        Object obj = this.f248h;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = l.b((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                C0094a u2 = u();
                if (u2 == null) {
                    this.Z = true;
                } else {
                    u2.c(true);
                }
            }
        }
        this.O = true;
    }

    public void a(View view) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.k.a().onContentChanged();
    }

    public void a(View view, ViewGroup.LayoutParams layoutParams) {
        z();
        ((ViewGroup) this.z.findViewById(16908290)).addView(view, layoutParams);
        this.k.a().onContentChanged();
    }

    /* access modifiers changed from: package-private */
    public void a(ViewGroup viewGroup) {
    }

    /* access modifiers changed from: package-private */
    public void a(i iVar, boolean z2) {
        ViewGroup viewGroup;
        Q q2;
        if (!z2 || iVar.f260a != 0 || (q2 = this.p) == null || !q2.a()) {
            WindowManager windowManager = (WindowManager) this.i.getSystemService("window");
            if (!(windowManager == null || !iVar.o || (viewGroup = iVar.f266g) == null)) {
                windowManager.removeView(viewGroup);
                if (z2) {
                    a(iVar.f260a, iVar, (Menu) null);
                }
            }
            iVar.m = false;
            iVar.n = false;
            iVar.o = false;
            iVar.f267h = null;
            iVar.q = true;
            if (this.L == iVar) {
                this.L = null;
                return;
            }
            return;
        }
        b(iVar.j);
    }

    public void a(k kVar) {
        a(kVar, true);
    }

    public void a(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        if (this.f248h instanceof Activity) {
            C0094a e2 = e();
            if (!(e2 instanceof N)) {
                this.n = null;
                if (e2 != null) {
                    e2.j();
                }
                if (toolbar != null) {
                    H h2 = new H(toolbar, q(), this.k);
                    this.m = h2;
                    window = this.j;
                    callback = h2.l();
                } else {
                    this.m = null;
                    window = this.j;
                    callback = this.k;
                }
                window.setCallback(callback);
                g();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public final void a(CharSequence charSequence) {
        this.o = charSequence;
        Q q2 = this.p;
        if (q2 != null) {
            q2.setWindowTitle(charSequence);
        } else if (u() != null) {
            u().a(charSequence);
        } else {
            TextView textView = this.A;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(int i2, KeyEvent keyEvent) {
        boolean z2 = true;
        if (i2 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z2 = false;
            }
            this.M = z2;
        } else if (i2 == 82) {
            d(0, keyEvent);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean a(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f248h;
        boolean z2 = true;
        if (((obj instanceof C0198d.a) || (obj instanceof D)) && (decorView = this.j.getDecorView()) != null && C0198d.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.k.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z2 = false;
        }
        return z2 ? a(keyCode, keyEvent) : c(keyCode, keyEvent);
    }

    public boolean a(k kVar, MenuItem menuItem) {
        i a2;
        Window.Callback r2 = r();
        if (r2 == null || this.P || (a2 = a((Menu) kVar.m())) == null) {
            return false;
        }
        return r2.onMenuItemSelected(a2.f260a, menuItem);
    }

    public final C0096c.a b() {
        return new a();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.a.d.b b(b.a.d.b.a r8) {
        /*
            r7 = this;
            r7.n()
            b.a.d.b r0 = r7.s
            if (r0 == 0) goto L_0x000a
            r0.a()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.z.c
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.z$c r0 = new androidx.appcompat.app.z$c
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.p r0 = r7.l
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.P
            if (r2 != 0) goto L_0x0022
            b.a.d.b r0 = r0.onWindowStartingSupportActionMode(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.s = r0
            goto L_0x0165
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.t
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d6
            boolean r0 = r7.H
            if (r0 == 0) goto L_0x00b7
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.i
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = b.a.a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.i
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            b.a.d.d r4 = new b.a.d.d
            android.content.Context r6 = r7.i
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.i
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.t = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = b.a.a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.u = r5
            android.widget.PopupWindow r5 = r7.u
            r6 = 2
            androidx.core.widget.i.a((android.widget.PopupWindow) r5, (int) r6)
            android.widget.PopupWindow r5 = r7.u
            androidx.appcompat.widget.ActionBarContextView r6 = r7.t
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.u
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = b.a.a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.t
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.u
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.x r0 = new androidx.appcompat.app.x
            r0.<init>(r7)
            r7.v = r0
            goto L_0x00d6
        L_0x00b7:
            android.view.ViewGroup r0 = r7.z
            int r4 = b.a.f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d6
            android.content.Context r4 = r7.o()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.t = r0
        L_0x00d6:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.t
            if (r0 == 0) goto L_0x0165
            r7.n()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.t
            r0.c()
            b.a.d.e r0 = new b.a.d.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.t
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.t
            android.widget.PopupWindow r6 = r7.u
            if (r6 != 0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r3 = 0
        L_0x00f2:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.c()
            boolean r8 = r8.a((b.a.d.b) r0, (android.view.Menu) r3)
            if (r8 == 0) goto L_0x0163
            r0.i()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            r8.a(r0)
            r7.s = r0
            boolean r8 = r7.v()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012d
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            b.h.j.E r8 = b.h.j.y.a(r8)
            r8.a((float) r0)
            r7.w = r8
            b.h.j.E r8 = r7.w
            androidx.appcompat.app.y r0 = new androidx.appcompat.app.y
            r0.<init>(r7)
            r8.a((b.h.j.F) r0)
            goto L_0x0153
        L_0x012d:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0153
            androidx.appcompat.widget.ActionBarContextView r8 = r7.t
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            b.h.j.y.F(r8)
        L_0x0153:
            android.widget.PopupWindow r8 = r7.u
            if (r8 == 0) goto L_0x0165
            android.view.Window r8 = r7.j
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.v
            r8.post(r0)
            goto L_0x0165
        L_0x0163:
            r7.s = r1
        L_0x0165:
            b.a.d.b r8 = r7.s
            if (r8 == 0) goto L_0x0170
            androidx.appcompat.app.p r0 = r7.l
            if (r0 == 0) goto L_0x0170
            r0.onSupportActionModeStarted(r8)
        L_0x0170:
            b.a.d.b r8 = r7.s
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.z.b(b.a.d.b$a):b.a.d.b");
    }

    public void b(Bundle bundle) {
        z();
    }

    public void b(View view, ViewGroup.LayoutParams layoutParams) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.k.a().onContentChanged();
    }

    /* access modifiers changed from: package-private */
    public void b(k kVar) {
        if (!this.J) {
            this.J = true;
            this.p.g();
            Window.Callback r2 = r();
            if (r2 != null && !this.P) {
                r2.onPanelClosed(108, kVar);
            }
            this.J = false;
        }
    }

    public boolean b(int i2) {
        int l2 = l(i2);
        if (this.I && l2 == 108) {
            return false;
        }
        if (this.E && l2 == 1) {
            this.E = false;
        }
        if (l2 == 1) {
            E();
            this.I = true;
            return true;
        } else if (l2 == 2) {
            E();
            this.C = true;
            return true;
        } else if (l2 == 5) {
            E();
            this.D = true;
            return true;
        } else if (l2 == 10) {
            E();
            this.G = true;
            return true;
        } else if (l2 == 108) {
            E();
            this.E = true;
            return true;
        } else if (l2 != 109) {
            return this.j.requestFeature(l2);
        } else {
            E();
            this.F = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(int i2, KeyEvent keyEvent) {
        C0094a e2 = e();
        if (e2 != null && e2.a(i2, keyEvent)) {
            return true;
        }
        i iVar = this.L;
        if (iVar == null || !a(iVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.L == null) {
                i a2 = a(0, true);
                b(a2, keyEvent);
                boolean a3 = a(a2, keyEvent.getKeyCode(), keyEvent, 1);
                a2.m = false;
                if (a3) {
                    return true;
                }
            }
            return false;
        }
        i iVar2 = this.L;
        if (iVar2 != null) {
            iVar2.n = true;
        }
        return true;
    }

    public int c() {
        return this.Q;
    }

    public void c(int i2) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.i).inflate(i2, viewGroup);
        this.k.a().onContentChanged();
    }

    public void c(Bundle bundle) {
        if (this.Q != -100) {
            f244d.put(this.f248h.getClass(), Integer.valueOf(this.Q));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z2 = this.M;
            this.M = false;
            i a2 = a(0, false);
            if (a2 != null && a2.o) {
                if (!z2) {
                    a(a2, true);
                }
                return true;
            } else if (t()) {
                return true;
            }
        } else if (i2 == 82) {
            e(0, keyEvent);
            return true;
        }
        return false;
    }

    public MenuInflater d() {
        if (this.n == null) {
            C();
            C0094a aVar = this.m;
            this.n = new b.a.d.g(aVar != null ? aVar.h() : this.i);
        }
        return this.n;
    }

    public void d(int i2) {
        this.R = i2;
    }

    public C0094a e() {
        C();
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public void e(int i2) {
        a(a(i2, true), true);
    }

    public void f() {
        LayoutInflater from = LayoutInflater.from(this.i);
        if (from.getFactory() == null) {
            C0199e.a(from, this);
        } else if (!(from.getFactory2() instanceof z)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* access modifiers changed from: package-private */
    public void f(int i2) {
        i a2;
        i a3 = a(i2, true);
        if (a3.j != null) {
            Bundle bundle = new Bundle();
            a3.j.c(bundle);
            if (bundle.size() > 0) {
                a3.s = bundle;
            }
            a3.j.s();
            a3.j.clear();
        }
        a3.r = true;
        a3.q = true;
        if ((i2 == 108 || i2 == 0) && this.p != null && (a2 = a(0, false)) != null) {
            a2.m = false;
            b(a2, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    public int g(int i2) {
        f p2;
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (!(i2 == 1 || i2 == 2)) {
                    if (i2 == 3) {
                        p2 = B();
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.i.getSystemService(UiModeManager.class)).getNightMode() == 0) {
                return -1;
            } else {
                p2 = p();
            }
            return p2.c();
        }
        return i2;
    }

    public void g() {
        C0094a e2 = e();
        if (e2 == null || !e2.i()) {
            k(0);
        }
    }

    public void h() {
        q.b((q) this);
        if (this.W) {
            this.j.getDecorView().removeCallbacks(this.Y);
        }
        this.P = true;
        C0094a aVar = this.m;
        if (aVar != null) {
            aVar.j();
        }
        f fVar = this.U;
        if (fVar != null) {
            fVar.a();
        }
        f fVar2 = this.V;
        if (fVar2 != null) {
            fVar2.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void h(int i2) {
        C0094a e2;
        if (i2 == 108 && (e2 = e()) != null) {
            e2.b(true);
        }
    }

    public void i() {
        C0094a e2 = e();
        if (e2 != null) {
            e2.e(true);
        }
    }

    /* access modifiers changed from: package-private */
    public void i(int i2) {
        if (i2 == 108) {
            C0094a e2 = e();
            if (e2 != null) {
                e2.b(false);
            }
        } else if (i2 == 0) {
            i a2 = a(i2, true);
            if (a2.o) {
                a(a2, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int j(int i2) {
        boolean z2;
        boolean z3;
        boolean z4;
        ActionBarContextView actionBarContextView = this.t;
        int i3 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.t.getLayoutParams();
            z2 = true;
            if (this.t.isShown()) {
                if (this.aa == null) {
                    this.aa = new Rect();
                    this.ba = new Rect();
                }
                Rect rect = this.aa;
                Rect rect2 = this.ba;
                rect.set(0, i2, 0, 0);
                Oa.a(this.z, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i2 : 0)) {
                    marginLayoutParams.topMargin = i2;
                    View view = this.B;
                    if (view == null) {
                        this.B = new View(this.i);
                        this.B.setBackgroundColor(this.i.getResources().getColor(b.a.c.abc_input_method_navigation_guard));
                        this.z.addView(this.B, -1, new ViewGroup.LayoutParams(-1, i2));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i2) {
                            layoutParams.height = i2;
                            this.B.setLayoutParams(layoutParams);
                        }
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.B == null) {
                    z2 = false;
                }
                if (!this.G && z2) {
                    i2 = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z4 = true;
                } else {
                    z4 = false;
                }
                z2 = false;
            }
            if (z3) {
                this.t.setLayoutParams(marginLayoutParams);
            }
        }
        View view2 = this.B;
        if (view2 != null) {
            if (!z2) {
                i3 = 8;
            }
            view2.setVisibility(i3);
        }
        return i2;
    }

    public void j() {
        l();
        q.a((q) this);
    }

    public void k() {
        q.b((q) this);
        C0094a e2 = e();
        if (e2 != null) {
            e2.e(false);
        }
    }

    public boolean l() {
        return a(true);
    }

    /* access modifiers changed from: package-private */
    public void m() {
        k kVar;
        Q q2 = this.p;
        if (q2 != null) {
            q2.g();
        }
        if (this.u != null) {
            this.j.getDecorView().removeCallbacks(this.v);
            if (this.u.isShowing()) {
                try {
                    this.u.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.u = null;
        }
        n();
        i a2 = a(0, false);
        if (a2 != null && (kVar = a2.j) != null) {
            kVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
        E e2 = this.w;
        if (e2 != null) {
            e2.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final Context o() {
        C0094a e2 = e();
        Context h2 = e2 != null ? e2.h() : null;
        return h2 == null ? this.i : h2;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return a(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    public final f p() {
        if (this.U == null) {
            this.U = new g(J.a(this.i));
        }
        return this.U;
    }

    /* access modifiers changed from: package-private */
    public final CharSequence q() {
        Object obj = this.f248h;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.o;
    }

    /* access modifiers changed from: package-private */
    public final Window.Callback r() {
        return this.j.getCallback();
    }

    public boolean s() {
        return this.x;
    }

    /* access modifiers changed from: package-private */
    public boolean t() {
        b.a.d.b bVar = this.s;
        if (bVar != null) {
            bVar.a();
            return true;
        }
        C0094a e2 = e();
        return e2 != null && e2.f();
    }

    /* access modifiers changed from: package-private */
    public final C0094a u() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.z;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v() {
        /*
            r1 = this;
            boolean r0 = r1.y
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.z
            if (r0 == 0) goto L_0x0010
            boolean r0 = b.h.j.y.A(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.z.v():boolean");
    }
}
