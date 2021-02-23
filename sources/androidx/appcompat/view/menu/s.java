package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.t;
import b.h.j.C0197c;
import b.h.j.y;

public class s implements m {

    /* renamed from: a  reason: collision with root package name */
    private final Context f371a;

    /* renamed from: b  reason: collision with root package name */
    private final k f372b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f373c;

    /* renamed from: d  reason: collision with root package name */
    private final int f374d;

    /* renamed from: e  reason: collision with root package name */
    private final int f375e;

    /* renamed from: f  reason: collision with root package name */
    private View f376f;

    /* renamed from: g  reason: collision with root package name */
    private int f377g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f378h;
    private t.a i;
    private q j;
    private PopupWindow.OnDismissListener k;
    private final PopupWindow.OnDismissListener l;

    public s(Context context, k kVar, View view, boolean z, int i2) {
        this(context, kVar, view, z, i2, 0);
    }

    public s(Context context, k kVar, View view, boolean z, int i2, int i3) {
        this.f377g = 8388611;
        this.l = new r(this);
        this.f371a = context;
        this.f372b = kVar;
        this.f376f = view;
        this.f373c = z;
        this.f374d = i2;
        this.f375e = i3;
    }

    private void a(int i2, int i3, boolean z, boolean z2) {
        q b2 = b();
        b2.c(z2);
        if (z) {
            if ((C0197c.a(this.f377g, y.m(this.f376f)) & 7) == 5) {
                i2 -= this.f376f.getWidth();
            }
            b2.b(i2);
            b2.c(i3);
            int i4 = (int) ((this.f371a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b2.a(new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4));
        }
        b2.u();
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.q, androidx.appcompat.view.menu.t] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.z] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.q g() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f371a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f371a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = b.a.d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            androidx.appcompat.view.menu.h r0 = new androidx.appcompat.view.menu.h
            android.content.Context r2 = r14.f371a
            android.view.View r3 = r14.f376f
            int r4 = r14.f374d
            int r5 = r14.f375e
            boolean r6 = r14.f373c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            androidx.appcompat.view.menu.z r0 = new androidx.appcompat.view.menu.z
            android.content.Context r8 = r14.f371a
            androidx.appcompat.view.menu.k r9 = r14.f372b
            android.view.View r10 = r14.f376f
            int r11 = r14.f374d
            int r12 = r14.f375e
            boolean r13 = r14.f373c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            androidx.appcompat.view.menu.k r1 = r14.f372b
            r0.a((androidx.appcompat.view.menu.k) r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.l
            r0.a((android.widget.PopupWindow.OnDismissListener) r1)
            android.view.View r1 = r14.f376f
            r0.a((android.view.View) r1)
            androidx.appcompat.view.menu.t$a r1 = r14.i
            r0.a((androidx.appcompat.view.menu.t.a) r1)
            boolean r1 = r14.f378h
            r0.b((boolean) r1)
            int r1 = r14.f377g
            r0.a((int) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.s.g():androidx.appcompat.view.menu.q");
    }

    public void a() {
        if (c()) {
            this.j.dismiss();
        }
    }

    public void a(int i2) {
        this.f377g = i2;
    }

    public void a(View view) {
        this.f376f = view;
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void a(t.a aVar) {
        this.i = aVar;
        q qVar = this.j;
        if (qVar != null) {
            qVar.a(aVar);
        }
    }

    public void a(boolean z) {
        this.f378h = z;
        q qVar = this.j;
        if (qVar != null) {
            qVar.b(z);
        }
    }

    public boolean a(int i2, int i3) {
        if (c()) {
            return true;
        }
        if (this.f376f == null) {
            return false;
        }
        a(i2, i3, true, true);
        return true;
    }

    public q b() {
        if (this.j == null) {
            this.j = g();
        }
        return this.j;
    }

    public boolean c() {
        q qVar = this.j;
        return qVar != null && qVar.v();
    }

    /* access modifiers changed from: protected */
    public void d() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void e() {
        if (!f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean f() {
        if (c()) {
            return true;
        }
        if (this.f376f == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }
}
