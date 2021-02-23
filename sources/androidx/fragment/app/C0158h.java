package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.D;
import androidx.lifecycle.E;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import b.h.j.C0199e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/* renamed from: androidx.fragment.app.h  reason: case insensitive filesystem */
public class C0158h implements ComponentCallbacks, View.OnCreateContextMenuListener, k, E, androidx.savedstate.c {

    /* renamed from: a  reason: collision with root package name */
    static final Object f1107a = new Object();
    boolean A;
    boolean B;
    boolean C;
    boolean D = true;
    private boolean E;
    ViewGroup F;
    View G;
    View H;
    boolean I;
    boolean J = true;
    a K;
    boolean L;
    boolean M;
    float N;
    LayoutInflater O;
    boolean P;
    g.b Q = g.b.RESUMED;
    m R;
    S S;
    s<k> T = new s<>();
    androidx.savedstate.b U;
    private int V;

    /* renamed from: b  reason: collision with root package name */
    int f1108b = 0;

    /* renamed from: c  reason: collision with root package name */
    Bundle f1109c;

    /* renamed from: d  reason: collision with root package name */
    SparseArray<Parcelable> f1110d;

    /* renamed from: e  reason: collision with root package name */
    Boolean f1111e;

    /* renamed from: f  reason: collision with root package name */
    String f1112f = UUID.randomUUID().toString();

    /* renamed from: g  reason: collision with root package name */
    Bundle f1113g;

    /* renamed from: h  reason: collision with root package name */
    C0158h f1114h;
    String i = null;
    int j;
    boolean k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    int q;
    v r;
    C0163m s;
    v t;
    C0158h u;
    int v;
    int w;
    String x;
    boolean y;
    boolean z;

    /* renamed from: androidx.fragment.app.h$a */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        View f1115a;

        /* renamed from: b  reason: collision with root package name */
        Animator f1116b;

        /* renamed from: c  reason: collision with root package name */
        int f1117c;

        /* renamed from: d  reason: collision with root package name */
        int f1118d;

        /* renamed from: e  reason: collision with root package name */
        int f1119e;

        /* renamed from: f  reason: collision with root package name */
        int f1120f;

        /* renamed from: g  reason: collision with root package name */
        Object f1121g = null;

        /* renamed from: h  reason: collision with root package name */
        Object f1122h;
        Object i;
        Object j;
        Object k;
        Object l;
        Boolean m;
        Boolean n;
        androidx.core.app.s o;
        androidx.core.app.s p;
        boolean q;
        c r;
        boolean s;

        a() {
            Object obj = C0158h.f1107a;
            this.f1122h = obj;
            this.i = null;
            this.j = obj;
            this.k = null;
            this.l = obj;
            this.o = null;
            this.p = null;
        }
    }

    /* renamed from: androidx.fragment.app.h$b */
    public static class b extends RuntimeException {
        public b(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.h$c */
    interface c {
        void a();

        void b();
    }

    public C0158h() {
        ga();
    }

    @Deprecated
    public static C0158h a(Context context, String str, Bundle bundle) {
        try {
            C0158h hVar = (C0158h) C0162l.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(hVar.getClass().getClassLoader());
                hVar.m(bundle);
            }
            return hVar;
        } catch (InstantiationException e2) {
            throw new b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new b("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new b("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    private a fa() {
        if (this.K == null) {
            this.K = new a();
        }
        return this.K;
    }

    private void ga() {
        this.R = new m(this);
        this.U = androidx.savedstate.b.a((androidx.savedstate.c) this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.R.a((j) new Fragment$1(this));
        }
    }

    /* access modifiers changed from: package-private */
    public void A() {
        ga();
        this.f1112f = UUID.randomUUID().toString();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.q = 0;
        this.r = null;
        this.t = null;
        this.s = null;
        this.v = 0;
        this.w = 0;
        this.x = null;
        this.y = false;
        this.z = false;
    }

    /* access modifiers changed from: package-private */
    public void B() {
        if (this.s != null) {
            this.t = new v();
            this.t.a(this.s, (C0160j) new C0157g(this), this);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* access modifiers changed from: package-private */
    public boolean C() {
        a aVar = this.K;
        if (aVar == null) {
            return false;
        }
        return aVar.s;
    }

    /* access modifiers changed from: package-private */
    public final boolean D() {
        return this.q > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        a aVar = this.K;
        if (aVar == null) {
            return false;
        }
        return aVar.q;
    }

    public final boolean F() {
        return this.l;
    }

    public final boolean G() {
        v vVar = this.r;
        if (vVar == null) {
            return false;
        }
        return vVar.t();
    }

    /* access modifiers changed from: package-private */
    public void H() {
        v vVar = this.t;
        if (vVar != null) {
            vVar.u();
        }
    }

    public void I() {
        this.E = true;
    }

    public void J() {
    }

    public void K() {
        this.E = true;
    }

    public void L() {
        this.E = true;
    }

    public void M() {
        this.E = true;
    }

    public void N() {
        this.E = true;
    }

    public void O() {
        this.E = true;
    }

    public void P() {
        this.E = true;
    }

    /* access modifiers changed from: package-private */
    public C0164n Q() {
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public void R() {
        this.E = false;
        a(this.s.c());
        if (!this.E) {
            throw new T("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    /* access modifiers changed from: package-private */
    public void S() {
        this.R.b(g.a.ON_DESTROY);
        v vVar = this.t;
        if (vVar != null) {
            vVar.g();
        }
        this.f1108b = 0;
        this.E = false;
        this.P = false;
        I();
        if (this.E) {
            this.t = null;
            return;
        }
        throw new T("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* access modifiers changed from: package-private */
    public void T() {
        if (this.G != null) {
            this.S.a(g.a.ON_DESTROY);
        }
        v vVar = this.t;
        if (vVar != null) {
            vVar.h();
        }
        this.f1108b = 1;
        this.E = false;
        K();
        if (this.E) {
            b.m.a.a.a(this).a();
            this.p = false;
            return;
        }
        throw new T("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    public void U() {
        this.E = false;
        L();
        this.O = null;
        if (this.E) {
            v vVar = this.t;
            if (vVar != null) {
                vVar.g();
                this.t = null;
                return;
            }
            return;
        }
        throw new T("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* access modifiers changed from: package-private */
    public void V() {
        onLowMemory();
        v vVar = this.t;
        if (vVar != null) {
            vVar.i();
        }
    }

    /* access modifiers changed from: package-private */
    public void W() {
        if (this.G != null) {
            this.S.a(g.a.ON_PAUSE);
        }
        this.R.b(g.a.ON_PAUSE);
        v vVar = this.t;
        if (vVar != null) {
            vVar.j();
        }
        this.f1108b = 3;
        this.E = false;
        M();
        if (!this.E) {
            throw new T("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    public void X() {
        v vVar = this.t;
        if (vVar != null) {
            vVar.u();
            this.t.o();
        }
        this.f1108b = 4;
        this.E = false;
        N();
        if (this.E) {
            v vVar2 = this.t;
            if (vVar2 != null) {
                vVar2.k();
                this.t.o();
            }
            this.R.b(g.a.ON_RESUME);
            if (this.G != null) {
                this.S.a(g.a.ON_RESUME);
                return;
            }
            return;
        }
        throw new T("Fragment " + this + " did not call through to super.onResume()");
    }

    /* access modifiers changed from: package-private */
    public void Y() {
        v vVar = this.t;
        if (vVar != null) {
            vVar.u();
            this.t.o();
        }
        this.f1108b = 3;
        this.E = false;
        O();
        if (this.E) {
            v vVar2 = this.t;
            if (vVar2 != null) {
                vVar2.l();
            }
            this.R.b(g.a.ON_START);
            if (this.G != null) {
                this.S.a(g.a.ON_START);
                return;
            }
            return;
        }
        throw new T("Fragment " + this + " did not call through to super.onStart()");
    }

    /* access modifiers changed from: package-private */
    public void Z() {
        if (this.G != null) {
            this.S.a(g.a.ON_STOP);
        }
        this.R.b(g.a.ON_STOP);
        v vVar = this.t;
        if (vVar != null) {
            vVar.m();
        }
        this.f1108b = 2;
        this.E = false;
        P();
        if (!this.E) {
            throw new T("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    @Deprecated
    public LayoutInflater a(Bundle bundle) {
        C0163m mVar = this.s;
        if (mVar != null) {
            LayoutInflater e2 = mVar.e();
            g();
            v vVar = this.t;
            vVar.q();
            C0199e.a(e2, vVar);
            return e2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.V;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    public Animation a(int i2, boolean z2, int i3) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public C0158h a(String str) {
        if (str.equals(this.f1112f)) {
            return this;
        }
        v vVar = this.t;
        if (vVar != null) {
            return vVar.b(str);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        a aVar = this.K;
        c cVar = null;
        if (aVar != null) {
            aVar.q = false;
            c cVar2 = aVar.r;
            aVar.r = null;
            cVar = cVar2;
        }
        if (cVar != null) {
            cVar.b();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        if (this.K != null || i2 != 0) {
            fa().f1118d = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3) {
        if (this.K != null || i2 != 0 || i3 != 0) {
            fa();
            a aVar = this.K;
            aVar.f1119e = i2;
            aVar.f1120f = i3;
        }
    }

    public void a(int i2, int i3, Intent intent) {
    }

    public void a(int i2, String[] strArr, int[] iArr) {
    }

    /* access modifiers changed from: package-private */
    public void a(Animator animator) {
        fa().f1116b = animator;
    }

    @Deprecated
    public void a(Activity activity) {
        this.E = true;
    }

    @Deprecated
    public void a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.E = true;
    }

    public void a(Context context) {
        this.E = true;
        C0163m mVar = this.s;
        Activity b2 = mVar == null ? null : mVar.b();
        if (b2 != null) {
            this.E = false;
            a(b2);
        }
    }

    public void a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.E = true;
        C0163m mVar = this.s;
        Activity b2 = mVar == null ? null : mVar.b();
        if (b2 != null) {
            this.E = false;
            a(b2, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Configuration configuration) {
        onConfigurationChanged(configuration);
        v vVar = this.t;
        if (vVar != null) {
            vVar.a(configuration);
        }
    }

    public void a(Menu menu) {
    }

    public void a(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: package-private */
    public void a(View view) {
        fa().f1115a = view;
    }

    public void a(View view, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public void a(c cVar) {
        fa();
        c cVar2 = this.K.r;
        if (cVar != cVar2) {
            if (cVar == null || cVar2 == null) {
                a aVar = this.K;
                if (aVar.q) {
                    aVar.r = cVar;
                }
                if (cVar != null) {
                    cVar.a();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    public void a(C0158h hVar) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.v));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.w));
        printWriter.print(" mTag=");
        printWriter.println(this.x);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1108b);
        printWriter.print(" mWho=");
        printWriter.print(this.f1112f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.q);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.k);
        printWriter.print(" mRemoving=");
        printWriter.print(this.l);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.m);
        printWriter.print(" mInLayout=");
        printWriter.println(this.n);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.y);
        printWriter.print(" mDetached=");
        printWriter.print(this.z);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.D);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.C);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.A);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.J);
        if (this.r != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.r);
        }
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.s);
        }
        if (this.u != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.u);
        }
        if (this.f1113g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f1113g);
        }
        if (this.f1109c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1109c);
        }
        if (this.f1110d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1110d);
        }
        C0158h y2 = y();
        if (y2 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(y2);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.j);
        }
        if (n() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(n());
        }
        if (this.F != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.F);
        }
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.G);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.G);
        }
        if (e() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(e());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(x());
        }
        if (h() != null) {
            b.m.a.a.a(this).a(str, fileDescriptor, printWriter, strArr);
        }
        if (this.t != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.t + ":");
            v vVar = this.t;
            vVar.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    public void a(boolean z2) {
    }

    public boolean a(MenuItem menuItem) {
        return false;
    }

    public final C0159i aa() {
        C0159i b2 = b();
        if (b2 != null) {
            return b2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public Animator b(int i2, boolean z2, int i3) {
        return null;
    }

    public final C0159i b() {
        C0163m mVar = this.s;
        if (mVar == null) {
            return null;
        }
        return (C0159i) mVar.b();
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        fa().f1117c = i2;
    }

    public void b(Bundle bundle) {
        this.E = true;
    }

    /* access modifiers changed from: package-private */
    public void b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        v vVar = this.t;
        if (vVar != null) {
            vVar.u();
        }
        this.p = true;
        this.S = new S();
        this.G = a(layoutInflater, viewGroup, bundle);
        if (this.G != null) {
            this.S.a();
            this.T.b(this.S);
        } else if (!this.S.b()) {
            this.S = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void b(Menu menu) {
    }

    public void b(boolean z2) {
    }

    /* access modifiers changed from: package-private */
    public boolean b(Menu menu, MenuInflater menuInflater) {
        boolean z2 = false;
        if (this.y) {
            return false;
        }
        if (this.C && this.D) {
            a(menu, menuInflater);
            z2 = true;
        }
        v vVar = this.t;
        return vVar != null ? z2 | vVar.a(menu, menuInflater) : z2;
    }

    public boolean b(MenuItem menuItem) {
        return false;
    }

    public final Context ba() {
        Context h2 = h();
        if (h2 != null) {
            return h2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void c(Bundle bundle) {
        this.E = true;
        k(bundle);
        v vVar = this.t;
        if (vVar != null && !vVar.c(1)) {
            this.t.f();
        }
    }

    /* access modifiers changed from: package-private */
    public void c(Menu menu) {
        if (!this.y) {
            if (this.C && this.D) {
                a(menu);
            }
            v vVar = this.t;
            if (vVar != null) {
                vVar.a(menu);
            }
        }
    }

    public void c(boolean z2) {
    }

    public boolean c() {
        Boolean bool;
        a aVar = this.K;
        if (aVar == null || (bool = aVar.n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public boolean c(MenuItem menuItem) {
        if (this.y) {
            return false;
        }
        if (a(menuItem)) {
            return true;
        }
        v vVar = this.t;
        return vVar != null && vVar.a(menuItem);
    }

    public final C0164n ca() {
        C0164n m2 = m();
        if (m2 != null) {
            return m2;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public LayoutInflater d(Bundle bundle) {
        return a(bundle);
    }

    /* access modifiers changed from: package-private */
    public void d(boolean z2) {
        b(z2);
        v vVar = this.t;
        if (vVar != null) {
            vVar.a(z2);
        }
    }

    public boolean d() {
        Boolean bool;
        a aVar = this.K;
        if (aVar == null || (bool = aVar.m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public boolean d(Menu menu) {
        boolean z2 = false;
        if (this.y) {
            return false;
        }
        if (this.C && this.D) {
            b(menu);
            z2 = true;
        }
        v vVar = this.t;
        return vVar != null ? z2 | vVar.b(menu) : z2;
    }

    /* access modifiers changed from: package-private */
    public boolean d(MenuItem menuItem) {
        if (this.y) {
            return false;
        }
        if (this.C && this.D && b(menuItem)) {
            return true;
        }
        v vVar = this.t;
        return vVar != null && vVar.b(menuItem);
    }

    public final View da() {
        View z2 = z();
        if (z2 != null) {
            return z2;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* access modifiers changed from: package-private */
    public View e() {
        a aVar = this.K;
        if (aVar == null) {
            return null;
        }
        return aVar.f1115a;
    }

    public void e(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public void e(boolean z2) {
        c(z2);
        v vVar = this.t;
        if (vVar != null) {
            vVar.b(z2);
        }
    }

    public void ea() {
        v vVar = this.r;
        if (vVar == null || vVar.t == null) {
            fa().q = false;
        } else if (Looper.myLooper() != this.r.t.d().getLooper()) {
            this.r.t.d().postAtFrontOfQueue(new C0156f(this));
        } else {
            a();
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    public Animator f() {
        a aVar = this.K;
        if (aVar == null) {
            return null;
        }
        return aVar.f1116b;
    }

    public void f(Bundle bundle) {
        this.E = true;
    }

    /* access modifiers changed from: package-private */
    public void f(boolean z2) {
        fa().s = z2;
    }

    public final C0164n g() {
        if (this.t == null) {
            B();
            int i2 = this.f1108b;
            if (i2 >= 4) {
                this.t.k();
            } else if (i2 >= 3) {
                this.t.l();
            } else if (i2 >= 2) {
                this.t.e();
            } else if (i2 >= 1) {
                this.t.f();
            }
        }
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public void g(Bundle bundle) {
        v vVar = this.t;
        if (vVar != null) {
            vVar.u();
        }
        this.f1108b = 2;
        this.E = false;
        b(bundle);
        if (this.E) {
            v vVar2 = this.t;
            if (vVar2 != null) {
                vVar2.e();
                return;
            }
            return;
        }
        throw new T("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public g getLifecycle() {
        return this.R;
    }

    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.U.a();
    }

    public D getViewModelStore() {
        v vVar = this.r;
        if (vVar != null) {
            return vVar.g(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public Context h() {
        C0163m mVar = this.s;
        if (mVar == null) {
            return null;
        }
        return mVar.c();
    }

    /* access modifiers changed from: package-private */
    public void h(Bundle bundle) {
        v vVar = this.t;
        if (vVar != null) {
            vVar.u();
        }
        this.f1108b = 1;
        this.E = false;
        this.U.a(bundle);
        c(bundle);
        this.P = true;
        if (this.E) {
            this.R.b(g.a.ON_CREATE);
            return;
        }
        throw new T("Fragment " + this + " did not call through to super.onCreate()");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater i(Bundle bundle) {
        this.O = d(bundle);
        return this.O;
    }

    public Object i() {
        a aVar = this.K;
        if (aVar == null) {
            return null;
        }
        return aVar.f1121g;
    }

    /* access modifiers changed from: package-private */
    public androidx.core.app.s j() {
        a aVar = this.K;
        if (aVar == null) {
            return null;
        }
        return aVar.o;
    }

    /* access modifiers changed from: package-private */
    public void j(Bundle bundle) {
        Parcelable w2;
        e(bundle);
        this.U.b(bundle);
        v vVar = this.t;
        if (vVar != null && (w2 = vVar.w()) != null) {
            bundle.putParcelable("android:support:fragments", w2);
        }
    }

    public Object k() {
        a aVar = this.K;
        if (aVar == null) {
            return null;
        }
        return aVar.i;
    }

    /* access modifiers changed from: package-private */
    public void k(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            if (this.t == null) {
                B();
            }
            this.t.a(parcelable);
            this.t.f();
        }
    }

    /* access modifiers changed from: package-private */
    public androidx.core.app.s l() {
        a aVar = this.K;
        if (aVar == null) {
            return null;
        }
        return aVar.p;
    }

    /* access modifiers changed from: package-private */
    public final void l(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f1110d;
        if (sparseArray != null) {
            this.H.restoreHierarchyState(sparseArray);
            this.f1110d = null;
        }
        this.E = false;
        f(bundle);
        if (!this.E) {
            throw new T("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.G != null) {
            this.S.a(g.a.ON_CREATE);
        }
    }

    public final C0164n m() {
        return this.r;
    }

    public void m(Bundle bundle) {
        if (this.r == null || !G()) {
            this.f1113g = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    /* access modifiers changed from: package-private */
    public int n() {
        a aVar = this.K;
        if (aVar == null) {
            return 0;
        }
        return aVar.f1118d;
    }

    /* access modifiers changed from: package-private */
    public int o() {
        a aVar = this.K;
        if (aVar == null) {
            return 0;
        }
        return aVar.f1119e;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.E = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        aa().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.E = true;
    }

    /* access modifiers changed from: package-private */
    public int p() {
        a aVar = this.K;
        if (aVar == null) {
            return 0;
        }
        return aVar.f1120f;
    }

    public final C0158h q() {
        return this.u;
    }

    public Object r() {
        a aVar = this.K;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.j;
        return obj == f1107a ? k() : obj;
    }

    public final Resources s() {
        return ba().getResources();
    }

    public final boolean t() {
        return this.A;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        b.h.i.a.a(this, sb);
        sb.append(" (");
        sb.append(this.f1112f);
        sb.append(")");
        if (this.v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.v));
        }
        if (this.x != null) {
            sb.append(" ");
            sb.append(this.x);
        }
        sb.append('}');
        return sb.toString();
    }

    public Object u() {
        a aVar = this.K;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.f1122h;
        return obj == f1107a ? i() : obj;
    }

    public Object v() {
        a aVar = this.K;
        if (aVar == null) {
            return null;
        }
        return aVar.k;
    }

    public Object w() {
        a aVar = this.K;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.l;
        return obj == f1107a ? v() : obj;
    }

    /* access modifiers changed from: package-private */
    public int x() {
        a aVar = this.K;
        if (aVar == null) {
            return 0;
        }
        return aVar.f1117c;
    }

    public final C0158h y() {
        String str;
        C0158h hVar = this.f1114h;
        if (hVar != null) {
            return hVar;
        }
        v vVar = this.r;
        if (vVar == null || (str = this.i) == null) {
            return null;
        }
        return vVar.j.get(str);
    }

    public View z() {
        return this.G;
    }
}
