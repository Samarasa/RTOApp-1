package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.C0158h;
import androidx.fragment.app.C0164n;
import androidx.lifecycle.D;
import androidx.lifecycle.g;
import b.h.j.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class v extends C0164n implements LayoutInflater.Factory2 {

    /* renamed from: c  reason: collision with root package name */
    static boolean f1148c = false;

    /* renamed from: d  reason: collision with root package name */
    static final Interpolator f1149d = new DecelerateInterpolator(2.5f);

    /* renamed from: e  reason: collision with root package name */
    static final Interpolator f1150e = new DecelerateInterpolator(1.5f);
    boolean A;
    boolean B;
    ArrayList<C0151a> C;
    ArrayList<Boolean> D;
    ArrayList<C0158h> E;
    Bundle F = null;
    SparseArray<Parcelable> G = null;
    ArrayList<g> H;
    private z I;
    Runnable J = new C0166p(this);

    /* renamed from: f  reason: collision with root package name */
    ArrayList<e> f1151f;

    /* renamed from: g  reason: collision with root package name */
    boolean f1152g;

    /* renamed from: h  reason: collision with root package name */
    int f1153h = 0;
    final ArrayList<C0158h> i = new ArrayList<>();
    final HashMap<String, C0158h> j = new HashMap<>();
    ArrayList<C0151a> k;
    ArrayList<C0158h> l;
    private OnBackPressedDispatcher m;
    private final androidx.activity.d n = new C0165o(this, false);
    ArrayList<C0151a> o;
    ArrayList<Integer> p;
    ArrayList<C0164n.c> q;
    private final CopyOnWriteArrayList<c> r = new CopyOnWriteArrayList<>();
    int s = 0;
    C0163m t;
    C0160j u;
    C0158h v;
    C0158h w;
    boolean x;
    boolean y;
    boolean z;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f1154a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f1155b;

        a(Animator animator) {
            this.f1154a = null;
            this.f1155b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        a(Animation animation) {
            this.f1154a = animation;
            this.f1155b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    private static class b extends AnimationSet implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final ViewGroup f1156a;

        /* renamed from: b  reason: collision with root package name */
        private final View f1157b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f1158c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f1159d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f1160e = true;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1156a = viewGroup;
            this.f1157b = view;
            addAnimation(animation);
            this.f1156a.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f1160e = true;
            if (this.f1158c) {
                return !this.f1159d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f1158c = true;
                r.a(this.f1156a, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f2) {
            this.f1160e = true;
            if (this.f1158c) {
                return !this.f1159d;
            }
            if (!super.getTransformation(j, transformation, f2)) {
                this.f1158c = true;
                r.a(this.f1156a, this);
            }
            return true;
        }

        public void run() {
            if (this.f1158c || !this.f1160e) {
                this.f1156a.endViewTransition(this.f1157b);
                this.f1159d = true;
                return;
            }
            this.f1160e = false;
            this.f1156a.post(this);
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        final C0164n.b f1161a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f1162b;
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        public static final int[] f1163a = {16842755, 16842960, 16842961};
    }

    interface e {
        boolean a(ArrayList<C0151a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class f implements e {

        /* renamed from: a  reason: collision with root package name */
        final String f1164a;

        /* renamed from: b  reason: collision with root package name */
        final int f1165b;

        /* renamed from: c  reason: collision with root package name */
        final int f1166c;

        f(String str, int i, int i2) {
            this.f1164a = str;
            this.f1165b = i;
            this.f1166c = i2;
        }

        public boolean a(ArrayList<C0151a> arrayList, ArrayList<Boolean> arrayList2) {
            C0164n Q;
            C0158h hVar = v.this.w;
            if (hVar != null && this.f1165b < 0 && this.f1164a == null && (Q = hVar.Q()) != null && Q.d()) {
                return false;
            }
            return v.this.a(arrayList, arrayList2, this.f1164a, this.f1165b, this.f1166c);
        }
    }

    static class g implements C0158h.c {

        /* renamed from: a  reason: collision with root package name */
        final boolean f1168a;

        /* renamed from: b  reason: collision with root package name */
        final C0151a f1169b;

        /* renamed from: c  reason: collision with root package name */
        private int f1170c;

        g(C0151a aVar, boolean z) {
            this.f1168a = z;
            this.f1169b = aVar;
        }

        public void a() {
            this.f1170c++;
        }

        public void b() {
            this.f1170c--;
            if (this.f1170c == 0) {
                this.f1169b.s.x();
            }
        }

        public void c() {
            C0151a aVar = this.f1169b;
            aVar.s.a(aVar, this.f1168a, false, false);
        }

        public void d() {
            boolean z = this.f1170c > 0;
            v vVar = this.f1169b.s;
            int size = vVar.i.size();
            for (int i = 0; i < size; i++) {
                C0158h hVar = vVar.i.get(i);
                hVar.a((C0158h.c) null);
                if (z && hVar.E()) {
                    hVar.ea();
                }
            }
            C0151a aVar = this.f1169b;
            aVar.s.a(aVar, this.f1168a, !z, true);
        }

        public boolean e() {
            return this.f1170c == 0;
        }
    }

    v() {
    }

    private void A() {
        if (t()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void B() {
        this.f1152g = false;
        this.D.clear();
        this.C.clear();
    }

    private void C() {
        for (C0158h next : this.j.values()) {
            if (next != null) {
                if (next.e() != null) {
                    int x2 = next.x();
                    View e2 = next.e();
                    Animation animation = e2.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        e2.clearAnimation();
                    }
                    next.a((View) null);
                    a(next, x2, 0, 0, false);
                } else if (next.f() != null) {
                    next.f().end();
                }
            }
        }
    }

    private void D() {
        if (this.H != null) {
            while (!this.H.isEmpty()) {
                this.H.remove(0).d();
            }
        }
    }

    private void E() {
        F();
        for (C0158h t2 : this.j.values()) {
            t(t2);
        }
    }

    private void F() {
        ArrayList<e> arrayList = this.f1151f;
        boolean z2 = true;
        if (arrayList == null || arrayList.isEmpty()) {
            androidx.activity.d dVar = this.n;
            if (p() <= 0 || !v(this.v)) {
                z2 = false;
            }
            dVar.a(z2);
            return;
        }
        this.n.a(true);
    }

    private int a(ArrayList<C0151a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, b.e.d<C0158h> dVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            C0151a aVar = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.e() && !aVar.a(arrayList, i5 + 1, i3)) {
                if (this.H == null) {
                    this.H = new ArrayList<>();
                }
                g gVar = new g(aVar, booleanValue);
                this.H.add(gVar);
                aVar.a((C0158h.c) gVar);
                if (booleanValue) {
                    aVar.c();
                } else {
                    aVar.b(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                a(dVar);
            }
        }
        return i4;
    }

    static a a(float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(f1150e);
        alphaAnimation.setDuration(220);
        return new a((Animation) alphaAnimation);
    }

    static a a(float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f1149d);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(f1150e);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new a((Animation) animationSet);
    }

    private void a(C0158h hVar, a aVar, int i2) {
        View view = hVar.G;
        ViewGroup viewGroup = hVar.F;
        viewGroup.startViewTransition(view);
        hVar.b(i2);
        Animation animation = aVar.f1154a;
        if (animation != null) {
            b bVar = new b(animation, viewGroup, view);
            hVar.a(hVar.G);
            bVar.setAnimationListener(new r(this, viewGroup, hVar));
            hVar.G.startAnimation(bVar);
            return;
        }
        Animator animator = aVar.f1155b;
        hVar.a(animator);
        animator.addListener(new C0168s(this, viewGroup, view, hVar));
        animator.setTarget(hVar.G);
        animator.start();
    }

    private void a(b.e.d<C0158h> dVar) {
        int i2 = this.s;
        if (i2 >= 1) {
            int min = Math.min(i2, 3);
            int size = this.i.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0158h hVar = this.i.get(i3);
                if (hVar.f1108b < min) {
                    a(hVar, min, hVar.n(), hVar.o(), false);
                    if (hVar.G != null && !hVar.y && hVar.L) {
                        dVar.add(hVar);
                    }
                }
            }
        }
    }

    private void a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new b.h.i.b("FragmentManager"));
        C0163m mVar = this.t;
        if (mVar != null) {
            try {
                mVar.a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            a("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    private void a(ArrayList<C0151a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<g> arrayList3 = this.H;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            g gVar = this.H.get(i2);
            if (arrayList == null || gVar.f1168a || (indexOf2 = arrayList.indexOf(gVar.f1169b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if (gVar.e() || (arrayList != null && gVar.f1169b.a(arrayList, 0, arrayList.size()))) {
                    this.H.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || gVar.f1168a || (indexOf = arrayList.indexOf(gVar.f1169b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        gVar.d();
                    }
                }
                i2++;
            }
            gVar.c();
            i2++;
        }
    }

    private static void a(ArrayList<C0151a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            C0151a aVar = arrayList.get(i2);
            boolean z2 = true;
            if (arrayList2.get(i2).booleanValue()) {
                aVar.a(-1);
                if (i2 != i3 - 1) {
                    z2 = false;
                }
                aVar.b(z2);
            } else {
                aVar.a(1);
                aVar.c();
            }
            i2++;
        }
    }

    private boolean a(String str, int i2, int i3) {
        C0164n Q;
        o();
        c(true);
        C0158h hVar = this.w;
        if (hVar != null && i2 < 0 && str == null && (Q = hVar.Q()) != null && Q.d()) {
            return true;
        }
        boolean a2 = a(this.C, this.D, str, i2, i3);
        if (a2) {
            this.f1152g = true;
            try {
                c(this.C, this.D);
            } finally {
                B();
            }
        }
        F();
        n();
        z();
        return a2;
    }

    public static int b(int i2, boolean z2) {
        if (i2 == 4097) {
            return z2 ? 1 : 2;
        }
        if (i2 == 4099) {
            return z2 ? 5 : 6;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z2 ? 3 : 4;
    }

    private void b(b.e.d<C0158h> dVar) {
        int size = dVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0158h l2 = dVar.l(i2);
            if (!l2.k) {
                View da = l2.da();
                l2.N = da.getAlpha();
                da.setAlpha(0.0f);
            }
        }
    }

    private void b(ArrayList<C0151a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5;
        ArrayList<C0151a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i6 = i2;
        int i7 = i3;
        boolean z2 = arrayList3.get(i6).q;
        ArrayList<C0158h> arrayList5 = this.E;
        if (arrayList5 == null) {
            this.E = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.E.addAll(this.i);
        C0158h r2 = r();
        boolean z3 = false;
        for (int i8 = i6; i8 < i7; i8++) {
            C0151a aVar = arrayList3.get(i8);
            r2 = !arrayList4.get(i8).booleanValue() ? aVar.a(this.E, r2) : aVar.b(this.E, r2);
            z3 = z3 || aVar.f1026h;
        }
        this.E.clear();
        if (!z2) {
            H.a(this, arrayList, arrayList2, i2, i3, false);
        }
        a(arrayList, arrayList2, i2, i3);
        if (z2) {
            b.e.d dVar = new b.e.d();
            a((b.e.d<C0158h>) dVar);
            int a2 = a(arrayList, arrayList2, i2, i3, (b.e.d<C0158h>) dVar);
            b((b.e.d<C0158h>) dVar);
            i4 = a2;
        } else {
            i4 = i7;
        }
        if (i4 != i6 && z2) {
            H.a(this, arrayList, arrayList2, i2, i4, true);
            a(this.s, true);
        }
        while (i6 < i7) {
            C0151a aVar2 = arrayList3.get(i6);
            if (arrayList4.get(i6).booleanValue() && (i5 = aVar2.u) >= 0) {
                b(i5);
                aVar2.u = -1;
            }
            aVar2.f();
            i6++;
        }
        if (z3) {
            v();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(java.util.ArrayList<androidx.fragment.app.C0151a> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<androidx.fragment.app.v$e> r0 = r4.f1151f     // Catch:{ all -> 0x003c }
            r1 = 0
            if (r0 == 0) goto L_0x003a
            java.util.ArrayList<androidx.fragment.app.v$e> r0 = r4.f1151f     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x000f
            goto L_0x003a
        L_0x000f:
            java.util.ArrayList<androidx.fragment.app.v$e> r0 = r4.f1151f     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            r2 = 0
        L_0x0016:
            if (r1 >= r0) goto L_0x0028
            java.util.ArrayList<androidx.fragment.app.v$e> r3 = r4.f1151f     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            androidx.fragment.app.v$e r3 = (androidx.fragment.app.v.e) r3     // Catch:{ all -> 0x003c }
            boolean r3 = r3.a(r5, r6)     // Catch:{ all -> 0x003c }
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0028:
            java.util.ArrayList<androidx.fragment.app.v$e> r5 = r4.f1151f     // Catch:{ all -> 0x003c }
            r5.clear()     // Catch:{ all -> 0x003c }
            androidx.fragment.app.m r5 = r4.t     // Catch:{ all -> 0x003c }
            android.os.Handler r5 = r5.d()     // Catch:{ all -> 0x003c }
            java.lang.Runnable r6 = r4.J     // Catch:{ all -> 0x003c }
            r5.removeCallbacks(r6)     // Catch:{ all -> 0x003c }
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r2
        L_0x003a:
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r1
        L_0x003c:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            goto L_0x0040
        L_0x003f:
            throw r5
        L_0x0040:
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.v.b(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    private void c(ArrayList<C0151a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            a(arrayList, arrayList2);
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                if (!arrayList.get(i2).q) {
                    if (i3 != i2) {
                        b(arrayList, arrayList2, i3, i2);
                    }
                    i3 = i2 + 1;
                    if (arrayList2.get(i2).booleanValue()) {
                        while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).q) {
                            i3++;
                        }
                    }
                    b(arrayList, arrayList2, i2, i3);
                    i2 = i3 - 1;
                }
                i2++;
            }
            if (i3 != size) {
                b(arrayList, arrayList2, i3, size);
            }
        }
    }

    private void c(boolean z2) {
        if (this.f1152g) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.t == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.t.d().getLooper()) {
            if (!z2) {
                A();
            }
            if (this.C == null) {
                this.C = new ArrayList<>();
                this.D = new ArrayList<>();
            }
            this.f1152g = true;
            try {
                a((ArrayList<C0151a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f1152g = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    public static int d(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* JADX INFO: finally extract failed */
    private void e(int i2) {
        try {
            this.f1152g = true;
            a(i2, false);
            this.f1152g = false;
            o();
        } catch (Throwable th) {
            this.f1152g = false;
            throw th;
        }
    }

    private void t(C0158h hVar) {
        v vVar;
        if (hVar != null && (vVar = hVar.t) != null) {
            vVar.E();
        }
    }

    private C0158h u(C0158h hVar) {
        ViewGroup viewGroup = hVar.F;
        View view = hVar.G;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.i.indexOf(hVar) - 1; indexOf >= 0; indexOf--) {
                C0158h hVar2 = this.i.get(indexOf);
                if (hVar2.F == viewGroup && hVar2.G != null) {
                    return hVar2;
                }
            }
        }
        return null;
    }

    private boolean v(C0158h hVar) {
        if (hVar == null) {
            return true;
        }
        v vVar = hVar.r;
        return hVar == vVar.r() && v(vVar.v);
    }

    private void z() {
        this.j.values().removeAll(Collections.singleton((Object) null));
    }

    public C a() {
        return new C0151a(this);
    }

    public C0158h a(int i2) {
        for (int size = this.i.size() - 1; size >= 0; size--) {
            C0158h hVar = this.i.get(size);
            if (hVar != null && hVar.v == i2) {
                return hVar;
            }
        }
        for (C0158h next : this.j.values()) {
            if (next != null && next.v == i2) {
                return next;
            }
        }
        return null;
    }

    public C0158h a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        C0158h hVar = this.j.get(string);
        if (hVar != null) {
            return hVar;
        }
        a((RuntimeException) new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        throw null;
    }

    public C0158h a(String str) {
        if (str != null) {
            for (int size = this.i.size() - 1; size >= 0; size--) {
                C0158h hVar = this.i.get(size);
                if (hVar != null && str.equals(hVar.x)) {
                    return hVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C0158h next : this.j.values()) {
            if (next != null && str.equals(next.x)) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public a a(C0158h hVar, int i2, boolean z2, int i3) {
        int b2;
        int n2 = hVar.n();
        Animation a2 = hVar.a(i2, z2, n2);
        if (a2 != null) {
            return new a(a2);
        }
        Animator b3 = hVar.b(i2, z2, n2);
        if (b3 != null) {
            return new a(b3);
        }
        if (n2 != 0) {
            boolean equals = "anim".equals(this.t.c().getResources().getResourceTypeName(n2));
            boolean z3 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.t.c(), n2);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.t.c(), n2);
                    if (loadAnimator != null) {
                        return new a(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.t.c(), n2);
                        if (loadAnimation2 != null) {
                            return new a(loadAnimation2);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        if (i2 == 0 || (b2 = b(i2, z2)) < 0) {
            return null;
        }
        switch (b2) {
            case 1:
                return a(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return a(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return a(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return a(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return a(0.0f, 1.0f);
            case 6:
                return a(1.0f, 0.0f);
            default:
                if (i3 == 0 && this.t.g()) {
                    i3 = this.t.f();
                }
                if (i3 == 0) {
                }
                return null;
        }
    }

    public void a(int i2, int i3) {
        if (i2 >= 0) {
            a((e) new f((String) null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public void a(int i2, C0151a aVar) {
        synchronized (this) {
            if (this.o == null) {
                this.o = new ArrayList<>();
            }
            int size = this.o.size();
            if (i2 < size) {
                if (f1148c) {
                    Log.v("FragmentManager", "Setting back stack index " + i2 + " to " + aVar);
                }
                this.o.set(i2, aVar);
            } else {
                while (size < i2) {
                    this.o.add((Object) null);
                    if (this.p == null) {
                        this.p = new ArrayList<>();
                    }
                    if (f1148c) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.p.add(Integer.valueOf(size));
                    size++;
                }
                if (f1148c) {
                    Log.v("FragmentManager", "Adding back stack index " + i2 + " with " + aVar);
                }
                this.o.add(aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, boolean z2) {
        C0163m mVar;
        if (this.t == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.s) {
            this.s = i2;
            int size = this.i.size();
            for (int i3 = 0; i3 < size; i3++) {
                k(this.i.get(i3));
            }
            for (C0158h next : this.j.values()) {
                if (next != null && ((next.l || next.z) && !next.L)) {
                    k(next);
                }
            }
            y();
            if (this.x && (mVar = this.t) != null && this.s == 4) {
                mVar.h();
                this.x = false;
            }
        }
    }

    public void a(Configuration configuration) {
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            C0158h hVar = this.i.get(i2);
            if (hVar != null) {
                hVar.a(configuration);
            }
        }
    }

    public void a(Bundle bundle, String str, C0158h hVar) {
        if (hVar.r == this) {
            bundle.putString(str, hVar.f1112f);
            return;
        }
        a((RuntimeException) new IllegalStateException("Fragment " + hVar + " is not currently in the FragmentManager"));
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void a(Parcelable parcelable) {
        B b2;
        if (parcelable != null) {
            x xVar = (x) parcelable;
            if (xVar.f1171a != null) {
                for (C0158h next : this.I.c()) {
                    if (f1148c) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + next);
                    }
                    Iterator<B> it = xVar.f1171a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            b2 = null;
                            break;
                        }
                        b2 = it.next();
                        if (b2.f1012b.equals(next.f1112f)) {
                            break;
                        }
                    }
                    if (b2 == null) {
                        if (f1148c) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + next + " that was not found in the set of active Fragments " + xVar.f1171a);
                        }
                        C0158h hVar = next;
                        a(hVar, 1, 0, 0, false);
                        next.l = true;
                        a(hVar, 0, 0, 0, false);
                    } else {
                        b2.n = next;
                        next.f1110d = null;
                        next.q = 0;
                        next.n = false;
                        next.k = false;
                        C0158h hVar2 = next.f1114h;
                        next.i = hVar2 != null ? hVar2.f1112f : null;
                        next.f1114h = null;
                        Bundle bundle = b2.m;
                        if (bundle != null) {
                            bundle.setClassLoader(this.t.c().getClassLoader());
                            next.f1110d = b2.m.getSparseParcelableArray("android:view_state");
                            next.f1109c = b2.m;
                        }
                    }
                }
                this.j.clear();
                Iterator<B> it2 = xVar.f1171a.iterator();
                while (it2.hasNext()) {
                    B next2 = it2.next();
                    if (next2 != null) {
                        C0158h a2 = next2.a(this.t.c().getClassLoader(), b());
                        a2.r = this;
                        if (f1148c) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + a2.f1112f + "): " + a2);
                        }
                        this.j.put(a2.f1112f, a2);
                        next2.n = null;
                    }
                }
                this.i.clear();
                ArrayList<String> arrayList = xVar.f1172b;
                if (arrayList != null) {
                    Iterator<String> it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        String next3 = it3.next();
                        C0158h hVar3 = this.j.get(next3);
                        if (hVar3 != null) {
                            hVar3.k = true;
                            if (f1148c) {
                                Log.v("FragmentManager", "restoreSaveState: added (" + next3 + "): " + hVar3);
                            }
                            if (!this.i.contains(hVar3)) {
                                synchronized (this.i) {
                                    this.i.add(hVar3);
                                }
                            } else {
                                throw new IllegalStateException("Already added " + hVar3);
                            }
                        } else {
                            a((RuntimeException) new IllegalStateException("No instantiated fragment for (" + next3 + ")"));
                            throw null;
                        }
                    }
                }
                C0153c[] cVarArr = xVar.f1173c;
                if (cVarArr != null) {
                    this.k = new ArrayList<>(cVarArr.length);
                    int i2 = 0;
                    while (true) {
                        C0153c[] cVarArr2 = xVar.f1173c;
                        if (i2 >= cVarArr2.length) {
                            break;
                        }
                        C0151a a3 = cVarArr2[i2].a(this);
                        if (f1148c) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + a3.u + "): " + a3);
                            PrintWriter printWriter = new PrintWriter(new b.h.i.b("FragmentManager"));
                            a3.a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.k.add(a3);
                        int i3 = a3.u;
                        if (i3 >= 0) {
                            a(i3, a3);
                        }
                        i2++;
                    }
                } else {
                    this.k = null;
                }
                String str = xVar.f1174d;
                if (str != null) {
                    this.w = this.j.get(str);
                    t(this.w);
                }
                this.f1153h = xVar.f1175e;
            }
        }
    }

    public void a(Menu menu) {
        if (this.s >= 1) {
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                C0158h hVar = this.i.get(i2);
                if (hVar != null) {
                    hVar.c(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(C0151a aVar) {
        if (this.k == null) {
            this.k = new ArrayList<>();
        }
        this.k.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public void a(C0151a aVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            aVar.b(z4);
        } else {
            aVar.c();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3) {
            H.a(this, (ArrayList<C0151a>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z4) {
            a(this.s, true);
        }
        for (C0158h next : this.j.values()) {
            if (next != null && next.G != null && next.L && aVar.b(next.w)) {
                float f2 = next.N;
                if (f2 > 0.0f) {
                    next.G.setAlpha(f2);
                }
                if (z4) {
                    next.N = 0.0f;
                } else {
                    next.N = -1.0f;
                    next.L = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(C0158h hVar) {
        if (t()) {
            if (f1148c) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.I.a(hVar) && f1148c) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + hVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: int} */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0084, code lost:
        if (r0 != 3) goto L_0x04c8;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:260:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.fragment.app.C0158h r19, int r20, int r21, int r22, boolean r23) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            boolean r0 = r7.k
            r8 = 1
            if (r0 == 0) goto L_0x0011
            boolean r0 = r7.z
            if (r0 == 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            r0 = r20
            goto L_0x0016
        L_0x0011:
            r0 = r20
            if (r0 <= r8) goto L_0x0016
            r0 = 1
        L_0x0016:
            boolean r1 = r7.l
            if (r1 == 0) goto L_0x002a
            int r1 = r7.f1108b
            if (r0 <= r1) goto L_0x002a
            if (r1 != 0) goto L_0x0028
            boolean r0 = r19.D()
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x002a
        L_0x0028:
            int r0 = r7.f1108b
        L_0x002a:
            boolean r1 = r7.I
            r9 = 3
            r10 = 2
            if (r1 == 0) goto L_0x0037
            int r1 = r7.f1108b
            if (r1 >= r9) goto L_0x0037
            if (r0 <= r10) goto L_0x0037
            r0 = 2
        L_0x0037:
            androidx.lifecycle.g$b r1 = r7.Q
            androidx.lifecycle.g$b r2 = androidx.lifecycle.g.b.CREATED
            if (r1 != r2) goto L_0x0042
            int r0 = java.lang.Math.min(r0, r8)
            goto L_0x004a
        L_0x0042:
            int r1 = r1.ordinal()
            int r0 = java.lang.Math.min(r0, r1)
        L_0x004a:
            r11 = r0
            int r0 = r7.f1108b
            java.lang.String r12 = "FragmentManager"
            r13 = 0
            r14 = 0
            if (r0 > r11) goto L_0x0325
            boolean r0 = r7.m
            if (r0 == 0) goto L_0x005c
            boolean r0 = r7.n
            if (r0 != 0) goto L_0x005c
            return
        L_0x005c:
            android.view.View r0 = r19.e()
            if (r0 != 0) goto L_0x0068
            android.animation.Animator r0 = r19.f()
            if (r0 == 0) goto L_0x007c
        L_0x0068:
            r7.a((android.view.View) r14)
            r7.a((android.animation.Animator) r14)
            int r2 = r19.x()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r18
            r1 = r19
            r0.a((androidx.fragment.app.C0158h) r1, (int) r2, (int) r3, (int) r4, (boolean) r5)
        L_0x007c:
            int r0 = r7.f1108b
            if (r0 == 0) goto L_0x008e
            if (r0 == r8) goto L_0x01e7
            if (r0 == r10) goto L_0x008b
            if (r0 == r9) goto L_0x0088
            goto L_0x04c8
        L_0x0088:
            r0 = 3
            goto L_0x02ff
        L_0x008b:
            r0 = 2
            goto L_0x02dd
        L_0x008e:
            if (r11 <= 0) goto L_0x01e7
            boolean r0 = f1148c
            if (r0 == 0) goto L_0x00a8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x00a8:
            android.os.Bundle r0 = r7.f1109c
            if (r0 == 0) goto L_0x0101
            androidx.fragment.app.m r1 = r6.t
            android.content.Context r1 = r1.c()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.f1109c
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.f1110d = r0
            android.os.Bundle r0 = r7.f1109c
            java.lang.String r1 = "android:target_state"
            androidx.fragment.app.h r0 = r6.a((android.os.Bundle) r0, (java.lang.String) r1)
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = r0.f1112f
            goto L_0x00d1
        L_0x00d0:
            r0 = r14
        L_0x00d1:
            r7.i = r0
            java.lang.String r0 = r7.i
            if (r0 == 0) goto L_0x00e1
            android.os.Bundle r0 = r7.f1109c
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r13)
            r7.j = r0
        L_0x00e1:
            java.lang.Boolean r0 = r7.f1111e
            if (r0 == 0) goto L_0x00ee
            boolean r0 = r0.booleanValue()
            r7.J = r0
            r7.f1111e = r14
            goto L_0x00f8
        L_0x00ee:
            android.os.Bundle r0 = r7.f1109c
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.J = r0
        L_0x00f8:
            boolean r0 = r7.J
            if (r0 != 0) goto L_0x0101
            r7.I = r8
            if (r11 <= r10) goto L_0x0101
            r11 = 2
        L_0x0101:
            androidx.fragment.app.m r0 = r6.t
            r7.s = r0
            androidx.fragment.app.h r1 = r6.v
            r7.u = r1
            if (r1 == 0) goto L_0x010e
            androidx.fragment.app.v r0 = r1.t
            goto L_0x0110
        L_0x010e:
            androidx.fragment.app.v r0 = r0.f1130e
        L_0x0110:
            r7.r = r0
            androidx.fragment.app.h r0 = r7.f1114h
            java.lang.String r15 = " that does not belong to this FragmentManager!"
            java.lang.String r5 = " declared target fragment "
            java.lang.String r4 = "Fragment "
            if (r0 == 0) goto L_0x016b
            java.util.HashMap<java.lang.String, androidx.fragment.app.h> r1 = r6.j
            java.lang.String r0 = r0.f1112f
            java.lang.Object r0 = r1.get(r0)
            androidx.fragment.app.h r1 = r7.f1114h
            if (r0 != r1) goto L_0x0149
            int r0 = r1.f1108b
            if (r0 >= r8) goto L_0x013e
            r2 = 1
            r3 = 0
            r16 = 0
            r17 = 1
            r0 = r18
            r9 = r4
            r4 = r16
            r10 = r5
            r5 = r17
            r0.a((androidx.fragment.app.C0158h) r1, (int) r2, (int) r3, (int) r4, (boolean) r5)
            goto L_0x0140
        L_0x013e:
            r9 = r4
            r10 = r5
        L_0x0140:
            androidx.fragment.app.h r0 = r7.f1114h
            java.lang.String r0 = r0.f1112f
            r7.i = r0
            r7.f1114h = r14
            goto L_0x016d
        L_0x0149:
            r9 = r4
            r10 = r5
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r7)
            r1.append(r10)
            androidx.fragment.app.h r2 = r7.f1114h
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x016b:
            r9 = r4
            r10 = r5
        L_0x016d:
            java.lang.String r0 = r7.i
            if (r0 == 0) goto L_0x01aa
            java.util.HashMap<java.lang.String, androidx.fragment.app.h> r1 = r6.j
            java.lang.Object r0 = r1.get(r0)
            r1 = r0
            androidx.fragment.app.h r1 = (androidx.fragment.app.C0158h) r1
            if (r1 == 0) goto L_0x018a
            int r0 = r1.f1108b
            if (r0 >= r8) goto L_0x01aa
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r18
            r0.a((androidx.fragment.app.C0158h) r1, (int) r2, (int) r3, (int) r4, (boolean) r5)
            goto L_0x01aa
        L_0x018a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r7)
            r1.append(r10)
            java.lang.String r2 = r7.i
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01aa:
            androidx.fragment.app.m r0 = r6.t
            android.content.Context r0 = r0.c()
            r6.b((androidx.fragment.app.C0158h) r7, (android.content.Context) r0, (boolean) r13)
            r19.R()
            androidx.fragment.app.h r0 = r7.u
            if (r0 != 0) goto L_0x01c0
            androidx.fragment.app.m r0 = r6.t
            r0.a((androidx.fragment.app.C0158h) r7)
            goto L_0x01c3
        L_0x01c0:
            r0.a((androidx.fragment.app.C0158h) r7)
        L_0x01c3:
            androidx.fragment.app.m r0 = r6.t
            android.content.Context r0 = r0.c()
            r6.a((androidx.fragment.app.C0158h) r7, (android.content.Context) r0, (boolean) r13)
            boolean r0 = r7.P
            if (r0 != 0) goto L_0x01e0
            android.os.Bundle r0 = r7.f1109c
            r6.c(r7, r0, r13)
            android.os.Bundle r0 = r7.f1109c
            r7.h(r0)
            android.os.Bundle r0 = r7.f1109c
            r6.b((androidx.fragment.app.C0158h) r7, (android.os.Bundle) r0, (boolean) r13)
            goto L_0x01e7
        L_0x01e0:
            android.os.Bundle r0 = r7.f1109c
            r7.k(r0)
            r7.f1108b = r8
        L_0x01e7:
            if (r11 <= 0) goto L_0x01ec
            r18.e((androidx.fragment.app.C0158h) r19)
        L_0x01ec:
            if (r11 <= r8) goto L_0x008b
            boolean r0 = f1148c
            if (r0 == 0) goto L_0x0206
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto ACTIVITY_CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x0206:
            boolean r0 = r7.m
            if (r0 != 0) goto L_0x02c6
            int r0 = r7.w
            if (r0 == 0) goto L_0x027c
            r1 = -1
            if (r0 == r1) goto L_0x025d
            androidx.fragment.app.j r1 = r6.u
            android.view.View r0 = r1.a(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x027d
            boolean r1 = r7.o
            if (r1 == 0) goto L_0x0220
            goto L_0x027d
        L_0x0220:
            android.content.res.Resources r0 = r19.s()     // Catch:{ NotFoundException -> 0x022b }
            int r1 = r7.w     // Catch:{ NotFoundException -> 0x022b }
            java.lang.String r0 = r0.getResourceName(r1)     // Catch:{ NotFoundException -> 0x022b }
            goto L_0x022d
        L_0x022b:
            java.lang.String r0 = "unknown"
        L_0x022d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No view found for id 0x"
            r2.append(r3)
            int r3 = r7.w
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            r6.a((java.lang.RuntimeException) r1)
            throw r14
        L_0x025d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r6.a((java.lang.RuntimeException) r0)
            throw r14
        L_0x027c:
            r0 = r14
        L_0x027d:
            r7.F = r0
            android.os.Bundle r1 = r7.f1109c
            android.view.LayoutInflater r1 = r7.i(r1)
            android.os.Bundle r2 = r7.f1109c
            r7.b((android.view.LayoutInflater) r1, (android.view.ViewGroup) r0, (android.os.Bundle) r2)
            android.view.View r1 = r7.G
            if (r1 == 0) goto L_0x02c4
            r7.H = r1
            r1.setSaveFromParentEnabled(r13)
            if (r0 == 0) goto L_0x029a
            android.view.View r1 = r7.G
            r0.addView(r1)
        L_0x029a:
            boolean r0 = r7.y
            if (r0 == 0) goto L_0x02a5
            android.view.View r0 = r7.G
            r1 = 8
            r0.setVisibility(r1)
        L_0x02a5:
            android.view.View r0 = r7.G
            android.os.Bundle r1 = r7.f1109c
            r7.a((android.view.View) r0, (android.os.Bundle) r1)
            android.view.View r0 = r7.G
            android.os.Bundle r1 = r7.f1109c
            r6.a((androidx.fragment.app.C0158h) r7, (android.view.View) r0, (android.os.Bundle) r1, (boolean) r13)
            android.view.View r0 = r7.G
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x02c0
            android.view.ViewGroup r0 = r7.F
            if (r0 == 0) goto L_0x02c0
            goto L_0x02c1
        L_0x02c0:
            r8 = 0
        L_0x02c1:
            r7.L = r8
            goto L_0x02c6
        L_0x02c4:
            r7.H = r14
        L_0x02c6:
            android.os.Bundle r0 = r7.f1109c
            r7.g(r0)
            android.os.Bundle r0 = r7.f1109c
            r6.a((androidx.fragment.app.C0158h) r7, (android.os.Bundle) r0, (boolean) r13)
            android.view.View r0 = r7.G
            if (r0 == 0) goto L_0x02d9
            android.os.Bundle r0 = r7.f1109c
            r7.l(r0)
        L_0x02d9:
            r7.f1109c = r14
            goto L_0x008b
        L_0x02dd:
            if (r11 <= r0) goto L_0x0088
            boolean r0 = f1148c
            if (r0 == 0) goto L_0x02f7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto STARTED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x02f7:
            r19.Y()
            r6.f(r7, r13)
            goto L_0x0088
        L_0x02ff:
            if (r11 <= r0) goto L_0x04c8
            boolean r0 = f1148c
            if (r0 == 0) goto L_0x0319
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto RESUMED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x0319:
            r19.X()
            r6.e(r7, r13)
            r7.f1109c = r14
            r7.f1110d = r14
            goto L_0x04c8
        L_0x0325:
            if (r0 <= r11) goto L_0x04c8
            if (r0 == r8) goto L_0x03f7
            r1 = 2
            if (r0 == r1) goto L_0x0375
            r1 = 3
            if (r0 == r1) goto L_0x0354
            r1 = 4
            if (r0 == r1) goto L_0x0334
            goto L_0x04c8
        L_0x0334:
            if (r11 >= r1) goto L_0x0354
            boolean r0 = f1148c
            if (r0 == 0) goto L_0x034e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom RESUMED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x034e:
            r19.W()
            r6.d(r7, r13)
        L_0x0354:
            r0 = 3
            if (r11 >= r0) goto L_0x0375
            boolean r0 = f1148c
            if (r0 == 0) goto L_0x036f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom STARTED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x036f:
            r19.Z()
            r6.g(r7, r13)
        L_0x0375:
            r0 = 2
            if (r11 >= r0) goto L_0x03f7
            boolean r0 = f1148c
            if (r0 == 0) goto L_0x0390
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom ACTIVITY_CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x0390:
            android.view.View r0 = r7.G
            if (r0 == 0) goto L_0x03a3
            androidx.fragment.app.m r0 = r6.t
            boolean r0 = r0.b(r7)
            if (r0 == 0) goto L_0x03a3
            android.util.SparseArray<android.os.Parcelable> r0 = r7.f1110d
            if (r0 != 0) goto L_0x03a3
            r18.q(r19)
        L_0x03a3:
            r19.T()
            r6.h(r7, r13)
            android.view.View r0 = r7.G
            if (r0 == 0) goto L_0x03e8
            android.view.ViewGroup r1 = r7.F
            if (r1 == 0) goto L_0x03e8
            r1.endViewTransition(r0)
            android.view.View r0 = r7.G
            r0.clearAnimation()
            int r0 = r6.s
            r1 = 0
            if (r0 <= 0) goto L_0x03d9
            boolean r0 = r6.A
            if (r0 != 0) goto L_0x03d9
            android.view.View r0 = r7.G
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x03d9
            float r0 = r7.N
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x03d9
            r0 = r21
            r2 = r22
            androidx.fragment.app.v$a r0 = r6.a((androidx.fragment.app.C0158h) r7, (int) r0, (boolean) r13, (int) r2)
            goto L_0x03da
        L_0x03d9:
            r0 = r14
        L_0x03da:
            r7.N = r1
            if (r0 == 0) goto L_0x03e1
            r6.a((androidx.fragment.app.C0158h) r7, (androidx.fragment.app.v.a) r0, (int) r11)
        L_0x03e1:
            android.view.ViewGroup r0 = r7.F
            android.view.View r1 = r7.G
            r0.removeView(r1)
        L_0x03e8:
            r7.F = r14
            r7.G = r14
            r7.S = r14
            androidx.lifecycle.s<androidx.lifecycle.k> r0 = r7.T
            r0.b(r14)
            r7.H = r14
            r7.n = r13
        L_0x03f7:
            if (r11 >= r8) goto L_0x04c8
            boolean r0 = r6.A
            if (r0 == 0) goto L_0x041e
            android.view.View r0 = r19.e()
            if (r0 == 0) goto L_0x040e
            android.view.View r0 = r19.e()
            r7.a((android.view.View) r14)
            r0.clearAnimation()
            goto L_0x041e
        L_0x040e:
            android.animation.Animator r0 = r19.f()
            if (r0 == 0) goto L_0x041e
            android.animation.Animator r0 = r19.f()
            r7.a((android.animation.Animator) r14)
            r0.cancel()
        L_0x041e:
            android.view.View r0 = r19.e()
            if (r0 != 0) goto L_0x04c4
            android.animation.Animator r0 = r19.f()
            if (r0 == 0) goto L_0x042c
            goto L_0x04c4
        L_0x042c:
            boolean r0 = f1148c
            if (r0 == 0) goto L_0x0444
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
        L_0x0444:
            boolean r0 = r7.l
            if (r0 == 0) goto L_0x0450
            boolean r0 = r19.D()
            if (r0 != 0) goto L_0x0450
            r0 = 1
            goto L_0x0451
        L_0x0450:
            r0 = 0
        L_0x0451:
            if (r0 != 0) goto L_0x045f
            androidx.fragment.app.z r1 = r6.I
            boolean r1 = r1.f(r7)
            if (r1 == 0) goto L_0x045c
            goto L_0x045f
        L_0x045c:
            r7.f1108b = r13
            goto L_0x0490
        L_0x045f:
            androidx.fragment.app.m r1 = r6.t
            boolean r2 = r1 instanceof androidx.lifecycle.E
            if (r2 == 0) goto L_0x046c
            androidx.fragment.app.z r1 = r6.I
            boolean r8 = r1.d()
            goto L_0x0481
        L_0x046c:
            android.content.Context r1 = r1.c()
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0481
            androidx.fragment.app.m r1 = r6.t
            android.content.Context r1 = r1.c()
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            r8 = r8 ^ r1
        L_0x0481:
            if (r0 != 0) goto L_0x0485
            if (r8 == 0) goto L_0x048a
        L_0x0485:
            androidx.fragment.app.z r1 = r6.I
            r1.b(r7)
        L_0x048a:
            r19.S()
            r6.b((androidx.fragment.app.C0158h) r7, (boolean) r13)
        L_0x0490:
            r19.U()
            r6.c((androidx.fragment.app.C0158h) r7, (boolean) r13)
            if (r23 != 0) goto L_0x04c8
            if (r0 != 0) goto L_0x04c0
            androidx.fragment.app.z r0 = r6.I
            boolean r0 = r0.f(r7)
            if (r0 == 0) goto L_0x04a3
            goto L_0x04c0
        L_0x04a3:
            r7.s = r14
            r7.u = r14
            r7.r = r14
            java.lang.String r0 = r7.i
            if (r0 == 0) goto L_0x04c8
            java.util.HashMap<java.lang.String, androidx.fragment.app.h> r1 = r6.j
            java.lang.Object r0 = r1.get(r0)
            androidx.fragment.app.h r0 = (androidx.fragment.app.C0158h) r0
            if (r0 == 0) goto L_0x04c8
            boolean r1 = r0.t()
            if (r1 == 0) goto L_0x04c8
            r7.f1114h = r0
            goto L_0x04c8
        L_0x04c0:
            r18.j(r19)
            goto L_0x04c8
        L_0x04c4:
            r7.b((int) r11)
            goto L_0x04c9
        L_0x04c8:
            r8 = r11
        L_0x04c9:
            int r0 = r7.f1108b
            if (r0 == r8) goto L_0x04f5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r7.f1108b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r12, r0)
            r7.f1108b = r8
        L_0x04f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.v.a(androidx.fragment.app.h, int, int, int, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public void a(C0158h hVar, Context context, boolean z2) {
        C0158h hVar2 = this.v;
        if (hVar2 != null) {
            C0164n m2 = hVar2.m();
            if (m2 instanceof v) {
                ((v) m2).a(hVar, context, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z2 || next.f1162b) {
                next.f1161a.a((C0164n) this, hVar, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(C0158h hVar, Bundle bundle, boolean z2) {
        C0158h hVar2 = this.v;
        if (hVar2 != null) {
            C0164n m2 = hVar2.m();
            if (m2 instanceof v) {
                ((v) m2).a(hVar, bundle, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z2 || next.f1162b) {
                next.f1161a.a((C0164n) this, hVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(C0158h hVar, View view, Bundle bundle, boolean z2) {
        C0158h hVar2 = this.v;
        if (hVar2 != null) {
            C0164n m2 = hVar2.m();
            if (m2 instanceof v) {
                ((v) m2).a(hVar, view, bundle, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z2 || next.f1162b) {
                next.f1161a.a(this, hVar, view, bundle);
            }
        }
    }

    public void a(C0158h hVar, g.b bVar) {
        if (this.j.get(hVar.f1112f) == hVar && (hVar.s == null || hVar.m() == this)) {
            hVar.Q = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + hVar + " is not an active fragment of FragmentManager " + this);
    }

    public void a(C0158h hVar, boolean z2) {
        if (f1148c) {
            Log.v("FragmentManager", "add: " + hVar);
        }
        i(hVar);
        if (hVar.z) {
            return;
        }
        if (!this.i.contains(hVar)) {
            synchronized (this.i) {
                this.i.add(hVar);
            }
            hVar.k = true;
            hVar.l = false;
            if (hVar.G == null) {
                hVar.M = false;
            }
            if (hVar.C && hVar.D) {
                this.x = true;
            }
            if (z2) {
                l(hVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + hVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: androidx.activity.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: androidx.fragment.app.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: androidx.fragment.app.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: androidx.fragment.app.h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.fragment.app.C0163m r3, androidx.fragment.app.C0160j r4, androidx.fragment.app.C0158h r5) {
        /*
            r2 = this;
            androidx.fragment.app.m r0 = r2.t
            if (r0 != 0) goto L_0x004a
            r2.t = r3
            r2.u = r4
            r2.v = r5
            androidx.fragment.app.h r4 = r2.v
            if (r4 == 0) goto L_0x0011
            r2.F()
        L_0x0011:
            boolean r4 = r3 instanceof androidx.activity.e
            if (r4 == 0) goto L_0x0028
            r4 = r3
            androidx.activity.e r4 = (androidx.activity.e) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.getOnBackPressedDispatcher()
            r2.m = r0
            if (r5 == 0) goto L_0x0021
            r4 = r5
        L_0x0021:
            androidx.activity.OnBackPressedDispatcher r0 = r2.m
            androidx.activity.d r1 = r2.n
            r0.a(r4, r1)
        L_0x0028:
            if (r5 == 0) goto L_0x0033
            androidx.fragment.app.v r3 = r5.r
            androidx.fragment.app.z r3 = r3.f(r5)
        L_0x0030:
            r2.I = r3
            goto L_0x0049
        L_0x0033:
            boolean r4 = r3 instanceof androidx.lifecycle.E
            if (r4 == 0) goto L_0x0042
            androidx.lifecycle.E r3 = (androidx.lifecycle.E) r3
            androidx.lifecycle.D r3 = r3.getViewModelStore()
            androidx.fragment.app.z r3 = androidx.fragment.app.z.a((androidx.lifecycle.D) r3)
            goto L_0x0030
        L_0x0042:
            androidx.fragment.app.z r3 = new androidx.fragment.app.z
            r4 = 0
            r3.<init>(r4)
            goto L_0x0030
        L_0x0049:
            return
        L_0x004a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            goto L_0x0053
        L_0x0052:
            throw r3
        L_0x0053:
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.v.a(androidx.fragment.app.m, androidx.fragment.app.j, androidx.fragment.app.h):void");
    }

    public void a(e eVar, boolean z2) {
        if (!z2) {
            A();
        }
        synchronized (this) {
            if (!this.A) {
                if (this.t != null) {
                    if (this.f1151f == null) {
                        this.f1151f = new ArrayList<>();
                    }
                    this.f1151f.add(eVar);
                    x();
                    return;
                }
            }
            if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        String str2 = str + "    ";
        if (!this.j.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (C0158h next : this.j.values()) {
                printWriter.print(str);
                printWriter.println(next);
                if (next != null) {
                    next.a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.i.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size5; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.i.get(i2).toString());
            }
        }
        ArrayList<C0158h> arrayList = this.l;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.l.get(i3).toString());
            }
        }
        ArrayList<C0151a> arrayList2 = this.k;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                C0151a aVar = this.k.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.a(str2, printWriter);
            }
        }
        synchronized (this) {
            if (this.o != null && (size2 = this.o.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(this.o.get(i5));
                }
            }
            if (this.p != null && this.p.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.p.toArray()));
            }
        }
        ArrayList<e> arrayList3 = this.f1151f;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(this.f1151f.get(i6));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.u);
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.y);
        printWriter.print(" mStopped=");
        printWriter.print(this.z);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.A);
        if (this.x) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.x);
        }
    }

    public void a(boolean z2) {
        for (int size = this.i.size() - 1; size >= 0; size--) {
            C0158h hVar = this.i.get(size);
            if (hVar != null) {
                hVar.d(z2);
            }
        }
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        if (this.s < 1) {
            return false;
        }
        ArrayList<C0158h> arrayList = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            C0158h hVar = this.i.get(i2);
            if (hVar != null && hVar.b(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(hVar);
                z2 = true;
            }
        }
        if (this.l != null) {
            for (int i3 = 0; i3 < this.l.size(); i3++) {
                C0158h hVar2 = this.l.get(i3);
                if (arrayList == null || !arrayList.contains(hVar2)) {
                    hVar2.J();
                }
            }
        }
        this.l = arrayList;
        return z2;
    }

    public boolean a(MenuItem menuItem) {
        if (this.s < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            C0158h hVar = this.i.get(i2);
            if (hVar != null && hVar.c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean a(ArrayList<C0151a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<C0151a> arrayList3 = this.k;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.k.remove(size));
            arrayList2.add(true);
        } else {
            if (str != null || i2 >= 0) {
                i4 = this.k.size() - 1;
                while (i4 >= 0) {
                    C0151a aVar = this.k.get(i4);
                    if ((str != null && str.equals(aVar.d())) || (i2 >= 0 && i2 == aVar.u)) {
                        break;
                    }
                    i4--;
                }
                if (i4 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        i4--;
                        if (i4 < 0) {
                            break;
                        }
                        C0151a aVar2 = this.k.get(i4);
                        if ((str == null || !str.equals(aVar2.d())) && (i2 < 0 || i2 != aVar2.u)) {
                            break;
                        }
                    }
                }
            } else {
                i4 = -1;
            }
            if (i4 == this.k.size() - 1) {
                return false;
            }
            for (int size2 = this.k.size() - 1; size2 > i4; size2--) {
                arrayList.add(this.k.remove(size2));
                arrayList2.add(true);
            }
        }
        return true;
    }

    public int b(C0151a aVar) {
        synchronized (this) {
            if (this.p != null) {
                if (this.p.size() > 0) {
                    int intValue = this.p.remove(this.p.size() - 1).intValue();
                    if (f1148c) {
                        Log.v("FragmentManager", "Adding back stack index " + intValue + " with " + aVar);
                    }
                    this.o.set(intValue, aVar);
                    return intValue;
                }
            }
            if (this.o == null) {
                this.o = new ArrayList<>();
            }
            int size = this.o.size();
            if (f1148c) {
                Log.v("FragmentManager", "Setting back stack index " + size + " to " + aVar);
            }
            this.o.add(aVar);
            return size;
        }
    }

    public C0158h b(String str) {
        C0158h a2;
        for (C0158h next : this.j.values()) {
            if (next != null && (a2 = next.a(str)) != null) {
                return a2;
            }
        }
        return null;
    }

    public C0162l b() {
        if (super.b() == C0164n.f1131a) {
            C0158h hVar = this.v;
            if (hVar != null) {
                return hVar.r.b();
            }
            a((C0162l) new u(this));
        }
        return super.b();
    }

    public void b(int i2) {
        synchronized (this) {
            this.o.set(i2, (Object) null);
            if (this.p == null) {
                this.p = new ArrayList<>();
            }
            if (f1148c) {
                Log.v("FragmentManager", "Freeing back stack index " + i2);
            }
            this.p.add(Integer.valueOf(i2));
        }
    }

    public void b(C0158h hVar) {
        if (f1148c) {
            Log.v("FragmentManager", "attach: " + hVar);
        }
        if (hVar.z) {
            hVar.z = false;
            if (hVar.k) {
                return;
            }
            if (!this.i.contains(hVar)) {
                if (f1148c) {
                    Log.v("FragmentManager", "add from attach: " + hVar);
                }
                synchronized (this.i) {
                    this.i.add(hVar);
                }
                hVar.k = true;
                if (hVar.C && hVar.D) {
                    this.x = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + hVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(C0158h hVar, Context context, boolean z2) {
        C0158h hVar2 = this.v;
        if (hVar2 != null) {
            C0164n m2 = hVar2.m();
            if (m2 instanceof v) {
                ((v) m2).b(hVar, context, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z2 || next.f1162b) {
                next.f1161a.b((C0164n) this, hVar, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(C0158h hVar, Bundle bundle, boolean z2) {
        C0158h hVar2 = this.v;
        if (hVar2 != null) {
            C0164n m2 = hVar2.m();
            if (m2 instanceof v) {
                ((v) m2).b(hVar, bundle, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z2 || next.f1162b) {
                next.f1161a.b((C0164n) this, hVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(C0158h hVar, boolean z2) {
        C0158h hVar2 = this.v;
        if (hVar2 != null) {
            C0164n m2 = hVar2.m();
            if (m2 instanceof v) {
                ((v) m2).b(hVar, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z2 || next.f1162b) {
                next.f1161a.a(this, hVar);
            }
        }
    }

    public void b(boolean z2) {
        for (int size = this.i.size() - 1; size >= 0; size--) {
            C0158h hVar = this.i.get(size);
            if (hVar != null) {
                hVar.e(z2);
            }
        }
    }

    public boolean b(Menu menu) {
        if (this.s < 1) {
            return false;
        }
        boolean z2 = false;
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            C0158h hVar = this.i.get(i2);
            if (hVar != null && hVar.d(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    public boolean b(MenuItem menuItem) {
        if (this.s < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            C0158h hVar = this.i.get(i2);
            if (hVar != null && hVar.d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public List<C0158h> c() {
        List<C0158h> list;
        if (this.i.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.i) {
            list = (List) this.i.clone();
        }
        return list;
    }

    /* access modifiers changed from: package-private */
    public void c(C0158h hVar) {
        Animator animator;
        if (hVar.G != null) {
            a a2 = a(hVar, hVar.o(), !hVar.y, hVar.p());
            if (a2 == null || (animator = a2.f1155b) == null) {
                if (a2 != null) {
                    hVar.G.startAnimation(a2.f1154a);
                    a2.f1154a.start();
                }
                hVar.G.setVisibility((!hVar.y || hVar.C()) ? 0 : 8);
                if (hVar.C()) {
                    hVar.f(false);
                }
            } else {
                animator.setTarget(hVar.G);
                if (!hVar.y) {
                    hVar.G.setVisibility(0);
                } else if (hVar.C()) {
                    hVar.f(false);
                } else {
                    ViewGroup viewGroup = hVar.F;
                    View view = hVar.G;
                    viewGroup.startViewTransition(view);
                    a2.f1155b.addListener(new C0169t(this, viewGroup, view, hVar));
                }
                a2.f1155b.start();
            }
        }
        if (hVar.k && hVar.C && hVar.D) {
            this.x = true;
        }
        hVar.M = false;
        hVar.a(hVar.y);
    }

    /* access modifiers changed from: package-private */
    public void c(C0158h hVar, Bundle bundle, boolean z2) {
        C0158h hVar2 = this.v;
        if (hVar2 != null) {
            C0164n m2 = hVar2.m();
            if (m2 instanceof v) {
                ((v) m2).c(hVar, bundle, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z2 || next.f1162b) {
                next.f1161a.c(this, hVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(C0158h hVar, boolean z2) {
        C0158h hVar2 = this.v;
        if (hVar2 != null) {
            C0164n m2 = hVar2.m();
            if (m2 instanceof v) {
                ((v) m2).c(hVar, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z2 || next.f1162b) {
                next.f1161a.b(this, hVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c(int i2) {
        return this.s >= i2;
    }

    public void d(C0158h hVar) {
        if (f1148c) {
            Log.v("FragmentManager", "detach: " + hVar);
        }
        if (!hVar.z) {
            hVar.z = true;
            if (hVar.k) {
                if (f1148c) {
                    Log.v("FragmentManager", "remove from detach: " + hVar);
                }
                synchronized (this.i) {
                    this.i.remove(hVar);
                }
                if (hVar.C && hVar.D) {
                    this.x = true;
                }
                hVar.k = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(C0158h hVar, Bundle bundle, boolean z2) {
        C0158h hVar2 = this.v;
        if (hVar2 != null) {
            C0164n m2 = hVar2.m();
            if (m2 instanceof v) {
                ((v) m2).d(hVar, bundle, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z2 || next.f1162b) {
                next.f1161a.d(this, hVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(C0158h hVar, boolean z2) {
        C0158h hVar2 = this.v;
        if (hVar2 != null) {
            C0164n m2 = hVar2.m();
            if (m2 instanceof v) {
                ((v) m2).d(hVar, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z2 || next.f1162b) {
                next.f1161a.c(this, hVar);
            }
        }
    }

    public boolean d() {
        A();
        return a((String) null, -1, 0);
    }

    public void e() {
        this.y = false;
        this.z = false;
        e(2);
    }

    /* access modifiers changed from: package-private */
    public void e(C0158h hVar) {
        if (hVar.m && !hVar.p) {
            hVar.b(hVar.i(hVar.f1109c), (ViewGroup) null, hVar.f1109c);
            View view = hVar.G;
            if (view != null) {
                hVar.H = view;
                view.setSaveFromParentEnabled(false);
                if (hVar.y) {
                    hVar.G.setVisibility(8);
                }
                hVar.a(hVar.G, hVar.f1109c);
                a(hVar, hVar.G, hVar.f1109c, false);
                return;
            }
            hVar.H = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void e(C0158h hVar, boolean z2) {
        C0158h hVar2 = this.v;
        if (hVar2 != null) {
            C0164n m2 = hVar2.m();
            if (m2 instanceof v) {
                ((v) m2).e(hVar, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z2 || next.f1162b) {
                next.f1161a.d(this, hVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public z f(C0158h hVar) {
        return this.I.c(hVar);
    }

    public void f() {
        this.y = false;
        this.z = false;
        e(1);
    }

    /* access modifiers changed from: package-private */
    public void f(C0158h hVar, boolean z2) {
        C0158h hVar2 = this.v;
        if (hVar2 != null) {
            C0164n m2 = hVar2.m();
            if (m2 instanceof v) {
                ((v) m2).f(hVar, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z2 || next.f1162b) {
                next.f1161a.e(this, hVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public D g(C0158h hVar) {
        return this.I.d(hVar);
    }

    public void g() {
        this.A = true;
        o();
        e(0);
        this.t = null;
        this.u = null;
        this.v = null;
        if (this.m != null) {
            this.n.c();
            this.m = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void g(C0158h hVar, boolean z2) {
        C0158h hVar2 = this.v;
        if (hVar2 != null) {
            C0164n m2 = hVar2.m();
            if (m2 instanceof v) {
                ((v) m2).g(hVar, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z2 || next.f1162b) {
                next.f1161a.f(this, hVar);
            }
        }
    }

    public void h() {
        e(1);
    }

    public void h(C0158h hVar) {
        if (f1148c) {
            Log.v("FragmentManager", "hide: " + hVar);
        }
        if (!hVar.y) {
            hVar.y = true;
            hVar.M = true ^ hVar.M;
        }
    }

    /* access modifiers changed from: package-private */
    public void h(C0158h hVar, boolean z2) {
        C0158h hVar2 = this.v;
        if (hVar2 != null) {
            C0164n m2 = hVar2.m();
            if (m2 instanceof v) {
                ((v) m2).h(hVar, true);
            }
        }
        Iterator<c> it = this.r.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (!z2 || next.f1162b) {
                next.f1161a.g(this, hVar);
            }
        }
    }

    public void i() {
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            C0158h hVar = this.i.get(i2);
            if (hVar != null) {
                hVar.V();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i(C0158h hVar) {
        if (this.j.get(hVar.f1112f) == null) {
            this.j.put(hVar.f1112f, hVar);
            if (hVar.B) {
                if (hVar.A) {
                    a(hVar);
                } else {
                    o(hVar);
                }
                hVar.B = false;
            }
            if (f1148c) {
                Log.v("FragmentManager", "Added fragment to active set " + hVar);
            }
        }
    }

    public void j() {
        e(3);
    }

    /* access modifiers changed from: package-private */
    public void j(C0158h hVar) {
        if (this.j.get(hVar.f1112f) != null) {
            if (f1148c) {
                Log.v("FragmentManager", "Removed fragment from active set " + hVar);
            }
            for (C0158h next : this.j.values()) {
                if (next != null && hVar.f1112f.equals(next.i)) {
                    next.f1114h = hVar;
                    next.i = null;
                }
            }
            this.j.put(hVar.f1112f, (Object) null);
            o(hVar);
            String str = hVar.i;
            if (str != null) {
                hVar.f1114h = this.j.get(str);
            }
            hVar.A();
        }
    }

    public void k() {
        this.y = false;
        this.z = false;
        e(4);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        r0 = r0.G;
        r1 = r11.F;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(androidx.fragment.app.C0158h r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.HashMap<java.lang.String, androidx.fragment.app.h> r0 = r10.j
            java.lang.String r1 = r11.f1112f
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x003a
            boolean r0 = f1148c
            if (r0 == 0) goto L_0x0039
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring moving "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = " to state "
            r0.append(r11)
            int r11 = r10.s
            r0.append(r11)
            java.lang.String r11 = "since it is not added to "
            r0.append(r11)
            r0.append(r10)
            java.lang.String r11 = r0.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r11)
        L_0x0039:
            return
        L_0x003a:
            int r0 = r10.s
            boolean r1 = r11.l
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0051
            boolean r1 = r11.D()
            if (r1 == 0) goto L_0x004d
            int r0 = java.lang.Math.min(r0, r2)
            goto L_0x0051
        L_0x004d:
            int r0 = java.lang.Math.min(r0, r3)
        L_0x0051:
            r6 = r0
            int r7 = r11.o()
            int r8 = r11.p()
            r9 = 0
            r4 = r10
            r5 = r11
            r4.a((androidx.fragment.app.C0158h) r5, (int) r6, (int) r7, (int) r8, (boolean) r9)
            android.view.View r0 = r11.G
            if (r0 == 0) goto L_0x00be
            androidx.fragment.app.h r0 = r10.u(r11)
            if (r0 == 0) goto L_0x0082
            android.view.View r0 = r0.G
            android.view.ViewGroup r1 = r11.F
            int r0 = r1.indexOfChild(r0)
            android.view.View r4 = r11.G
            int r4 = r1.indexOfChild(r4)
            if (r4 >= r0) goto L_0x0082
            r1.removeViewAt(r4)
            android.view.View r4 = r11.G
            r1.addView(r4, r0)
        L_0x0082:
            boolean r0 = r11.L
            if (r0 == 0) goto L_0x00be
            android.view.ViewGroup r0 = r11.F
            if (r0 == 0) goto L_0x00be
            float r0 = r11.N
            r1 = 0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0096
            android.view.View r4 = r11.G
            r4.setAlpha(r0)
        L_0x0096:
            r11.N = r1
            r11.L = r3
            int r0 = r11.o()
            int r1 = r11.p()
            androidx.fragment.app.v$a r0 = r10.a((androidx.fragment.app.C0158h) r11, (int) r0, (boolean) r2, (int) r1)
            if (r0 == 0) goto L_0x00be
            android.view.animation.Animation r1 = r0.f1154a
            if (r1 == 0) goto L_0x00b2
            android.view.View r0 = r11.G
            r0.startAnimation(r1)
            goto L_0x00be
        L_0x00b2:
            android.animation.Animator r1 = r0.f1155b
            android.view.View r2 = r11.G
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.f1155b
            r0.start()
        L_0x00be:
            boolean r0 = r11.M
            if (r0 == 0) goto L_0x00c5
            r10.c((androidx.fragment.app.C0158h) r11)
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.v.k(androidx.fragment.app.h):void");
    }

    public void l() {
        this.y = false;
        this.z = false;
        e(3);
    }

    /* access modifiers changed from: package-private */
    public void l(C0158h hVar) {
        a(hVar, this.s, 0, 0, false);
    }

    public void m() {
        this.z = true;
        e(2);
    }

    public void m(C0158h hVar) {
        if (!hVar.I) {
            return;
        }
        if (this.f1152g) {
            this.B = true;
            return;
        }
        hVar.I = false;
        a(hVar, this.s, 0, 0, false);
    }

    /* access modifiers changed from: package-private */
    public void n() {
        if (this.B) {
            this.B = false;
            y();
        }
    }

    public void n(C0158h hVar) {
        if (f1148c) {
            Log.v("FragmentManager", "remove: " + hVar + " nesting=" + hVar.q);
        }
        boolean z2 = !hVar.D();
        if (!hVar.z || z2) {
            synchronized (this.i) {
                this.i.remove(hVar);
            }
            if (hVar.C && hVar.D) {
                this.x = true;
            }
            hVar.k = false;
            hVar.l = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void o(C0158h hVar) {
        if (t()) {
            if (f1148c) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.I.e(hVar) && f1148c) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + hVar);
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean o() {
        c(true);
        boolean z2 = false;
        while (b(this.C, this.D)) {
            this.f1152g = true;
            try {
                c(this.C, this.D);
                B();
                z2 = true;
            } catch (Throwable th) {
                B();
                throw th;
            }
        }
        F();
        n();
        z();
        return z2;
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C0158h hVar;
        AttributeSet attributeSet2 = attributeSet;
        String str2 = str;
        C0158h hVar2 = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet2.getAttributeValue((String) null, "class");
        Context context2 = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, d.f1163a);
        int i2 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str3 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (str3 == null || !C0162l.b(context.getClassLoader(), str3)) {
            return null;
        }
        if (view != null) {
            i2 = view.getId();
        }
        if (i2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str3);
        }
        if (resourceId != -1) {
            hVar2 = a(resourceId);
        }
        if (hVar2 == null && string != null) {
            hVar2 = a(string);
        }
        if (hVar2 == null && i2 != -1) {
            hVar2 = a(i2);
        }
        if (f1148c) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str3 + " existing=" + hVar2);
        }
        if (hVar2 == null) {
            C0158h a2 = b().a(context.getClassLoader(), str3);
            a2.m = true;
            a2.v = resourceId != 0 ? resourceId : i2;
            a2.w = i2;
            a2.x = string;
            a2.n = true;
            a2.r = this;
            C0163m mVar = this.t;
            a2.s = mVar;
            a2.a(mVar.c(), attributeSet2, a2.f1109c);
            a(a2, true);
            hVar = a2;
        } else if (!hVar2.n) {
            hVar2.n = true;
            C0163m mVar2 = this.t;
            hVar2.s = mVar2;
            hVar2.a(mVar2.c(), attributeSet2, hVar2.f1109c);
            hVar = hVar2;
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + str3);
        }
        if (this.s >= 1 || !hVar.m) {
            l(hVar);
        } else {
            a(hVar, 1, 0, 0, false);
        }
        View view2 = hVar.G;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (hVar.G.getTag() == null) {
                hVar.G.setTag(string);
            }
            return hVar.G;
        }
        throw new IllegalStateException("Fragment " + str3 + " did not create a view.");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public int p() {
        ArrayList<C0151a> arrayList = this.k;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public Bundle p(C0158h hVar) {
        Bundle bundle;
        if (this.F == null) {
            this.F = new Bundle();
        }
        hVar.j(this.F);
        d(hVar, this.F, false);
        if (!this.F.isEmpty()) {
            bundle = this.F;
            this.F = null;
        } else {
            bundle = null;
        }
        if (hVar.G != null) {
            q(hVar);
        }
        if (hVar.f1110d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", hVar.f1110d);
        }
        if (!hVar.J) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", hVar.J);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater.Factory2 q() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public void q(C0158h hVar) {
        if (hVar.H != null) {
            SparseArray<Parcelable> sparseArray = this.G;
            if (sparseArray == null) {
                this.G = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            hVar.H.saveHierarchyState(this.G);
            if (this.G.size() > 0) {
                hVar.f1110d = this.G;
                this.G = null;
            }
        }
    }

    public C0158h r() {
        return this.w;
    }

    public void r(C0158h hVar) {
        if (hVar == null || (this.j.get(hVar.f1112f) == hVar && (hVar.s == null || hVar.m() == this))) {
            C0158h hVar2 = this.w;
            this.w = hVar;
            t(hVar2);
            t(this.w);
            return;
        }
        throw new IllegalArgumentException("Fragment " + hVar + " is not an active fragment of FragmentManager " + this);
    }

    /* access modifiers changed from: package-private */
    public void s() {
        o();
        if (this.n.b()) {
            d();
        } else {
            this.m.a();
        }
    }

    public void s(C0158h hVar) {
        if (f1148c) {
            Log.v("FragmentManager", "show: " + hVar);
        }
        if (hVar.y) {
            hVar.y = false;
            hVar.M = !hVar.M;
        }
    }

    public boolean t() {
        return this.y || this.z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.v;
        if (obj == null) {
            obj = this.t;
        }
        b.h.i.a.a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    public void u() {
        this.y = false;
        this.z = false;
        int size = this.i.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0158h hVar = this.i.get(i2);
            if (hVar != null) {
                hVar.H();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void v() {
        if (this.q != null) {
            for (int i2 = 0; i2 < this.q.size(); i2++) {
                this.q.get(i2).onBackStackChanged();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Parcelable w() {
        ArrayList<String> arrayList;
        int size;
        D();
        C();
        o();
        this.y = true;
        C0153c[] cVarArr = null;
        if (this.j.isEmpty()) {
            return null;
        }
        ArrayList<B> arrayList2 = new ArrayList<>(this.j.size());
        boolean z2 = false;
        for (C0158h next : this.j.values()) {
            if (next != null) {
                if (next.r == this) {
                    B b2 = new B(next);
                    arrayList2.add(b2);
                    if (next.f1108b <= 0 || b2.m != null) {
                        b2.m = next.f1109c;
                    } else {
                        b2.m = p(next);
                        String str = next.i;
                        if (str != null) {
                            C0158h hVar = this.j.get(str);
                            if (hVar != null) {
                                if (b2.m == null) {
                                    b2.m = new Bundle();
                                }
                                a(b2.m, "android:target_state", hVar);
                                int i2 = next.j;
                                if (i2 != 0) {
                                    b2.m.putInt("android:target_req_state", i2);
                                }
                            } else {
                                a((RuntimeException) new IllegalStateException("Failure saving state: " + next + " has target not in fragment manager: " + next.i));
                                throw null;
                            }
                        }
                    }
                    if (f1148c) {
                        Log.v("FragmentManager", "Saved state of " + next + ": " + b2.m);
                    }
                    z2 = true;
                } else {
                    a((RuntimeException) new IllegalStateException("Failure saving state: active " + next + " was removed from the FragmentManager"));
                    throw null;
                }
            }
        }
        if (!z2) {
            if (f1148c) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size2 = this.i.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<C0158h> it = this.i.iterator();
            while (it.hasNext()) {
                C0158h next2 = it.next();
                arrayList.add(next2.f1112f);
                if (next2.r != this) {
                    a((RuntimeException) new IllegalStateException("Failure saving state: active " + next2 + " was removed from the FragmentManager"));
                    throw null;
                } else if (f1148c) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next2.f1112f + "): " + next2);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<C0151a> arrayList3 = this.k;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            cVarArr = new C0153c[size];
            for (int i3 = 0; i3 < size; i3++) {
                cVarArr[i3] = new C0153c(this.k.get(i3));
                if (f1148c) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i3 + ": " + this.k.get(i3));
                }
            }
        }
        x xVar = new x();
        xVar.f1171a = arrayList2;
        xVar.f1172b = arrayList;
        xVar.f1173c = cVarArr;
        C0158h hVar2 = this.w;
        if (hVar2 != null) {
            xVar.f1174d = hVar2.f1112f;
        }
        xVar.f1175e = this.f1153h;
        return xVar;
    }

    /* access modifiers changed from: package-private */
    public void x() {
        synchronized (this) {
            boolean z2 = false;
            boolean z3 = this.H != null && !this.H.isEmpty();
            if (this.f1151f != null && this.f1151f.size() == 1) {
                z2 = true;
            }
            if (z3 || z2) {
                this.t.d().removeCallbacks(this.J);
                this.t.d().post(this.J);
                F();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void y() {
        for (C0158h next : this.j.values()) {
            if (next != null) {
                m(next);
            }
        }
    }
}
