package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.t;
import androidx.appcompat.widget.C0113ba;
import androidx.appcompat.widget.C0115ca;
import b.a.d;
import b.a.g;
import b.h.j.C0197c;
import b.h.j.y;
import java.util.ArrayList;
import java.util.List;

final class h extends q implements t, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b  reason: collision with root package name */
    private static final int f311b = g.abc_cascading_menu_item_layout;
    private PopupWindow.OnDismissListener A;
    boolean B;

    /* renamed from: c  reason: collision with root package name */
    private final Context f312c;

    /* renamed from: d  reason: collision with root package name */
    private final int f313d;

    /* renamed from: e  reason: collision with root package name */
    private final int f314e;

    /* renamed from: f  reason: collision with root package name */
    private final int f315f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f316g;

    /* renamed from: h  reason: collision with root package name */
    final Handler f317h;
    private final List<k> i = new ArrayList();
    final List<a> j = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener k = new d(this);
    private final View.OnAttachStateChangeListener l = new e(this);
    private final C0113ba m = new g(this);
    private int n = 0;
    private int o = 0;
    private View p;
    View q;
    private int r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private t.a y;
    ViewTreeObserver z;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        public final C0115ca f318a;

        /* renamed from: b  reason: collision with root package name */
        public final k f319b;

        /* renamed from: c  reason: collision with root package name */
        public final int f320c;

        public a(C0115ca caVar, k kVar, int i) {
            this.f318a = caVar;
            this.f319b = kVar;
            this.f320c = i;
        }

        public ListView a() {
            return this.f318a.w();
        }
    }

    public h(Context context, View view, int i2, int i3, boolean z2) {
        this.f312c = context;
        this.p = view;
        this.f314e = i2;
        this.f315f = i3;
        this.f316g = z2;
        this.w = false;
        this.r = f();
        Resources resources = context.getResources();
        this.f313d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.abc_config_prefDialogWidth));
        this.f317h = new Handler();
    }

    private MenuItem a(k kVar, k kVar2) {
        int size = kVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = kVar.getItem(i2);
            if (item.hasSubMenu() && kVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View a(a aVar, k kVar) {
        int i2;
        j jVar;
        int firstVisiblePosition;
        MenuItem a2 = a(aVar.f319b, kVar);
        if (a2 == null) {
            return null;
        }
        ListView a3 = aVar.a();
        ListAdapter adapter = a3.getAdapter();
        int i3 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i2 = headerViewListAdapter.getHeadersCount();
            jVar = (j) headerViewListAdapter.getWrappedAdapter();
        } else {
            jVar = (j) adapter;
            i2 = 0;
        }
        int count = jVar.getCount();
        while (true) {
            if (i3 >= count) {
                i3 = -1;
                break;
            } else if (a2 == jVar.getItem(i3)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 != -1 && (firstVisiblePosition = (i3 + i2) - a3.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a3.getChildCount()) {
            return a3.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int c(k kVar) {
        int size = this.j.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (kVar == this.j.get(i2).f319b) {
                return i2;
            }
        }
        return -1;
    }

    private int d(int i2) {
        List<a> list = this.j;
        ListView a2 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.q.getWindowVisibleDisplayFrame(rect);
        return this.r == 1 ? (iArr[0] + a2.getWidth()) + i2 > rect.right ? 0 : 1 : iArr[0] - i2 < 0 ? 1 : 0;
    }

    private void d(k kVar) {
        View view;
        a aVar;
        int i2;
        int i3;
        int i4;
        LayoutInflater from = LayoutInflater.from(this.f312c);
        j jVar = new j(kVar, from, this.f316g, f311b);
        if (!v() && this.w) {
            jVar.a(true);
        } else if (v()) {
            jVar.a(q.b(kVar));
        }
        int a2 = q.a(jVar, (ViewGroup) null, this.f312c, this.f313d);
        C0115ca e2 = e();
        e2.a((ListAdapter) jVar);
        e2.d(a2);
        e2.e(this.o);
        if (this.j.size() > 0) {
            List<a> list = this.j;
            aVar = list.get(list.size() - 1);
            view = a(aVar, kVar);
        } else {
            aVar = null;
            view = null;
        }
        if (view != null) {
            e2.c(false);
            e2.a((Object) null);
            int d2 = d(a2);
            boolean z2 = d2 == 1;
            this.r = d2;
            if (Build.VERSION.SDK_INT >= 26) {
                e2.a(view);
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr = new int[2];
                this.p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.o & 7) == 5) {
                    iArr[0] = iArr[0] + this.p.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i2 = iArr2[0] - iArr[0];
                i3 = iArr2[1] - iArr[1];
            }
            if ((this.o & 5) != 5) {
                if (z2) {
                    a2 = view.getWidth();
                }
                i4 = i2 - a2;
                e2.a(i4);
                e2.b(true);
                e2.b(i3);
            } else if (!z2) {
                a2 = view.getWidth();
                i4 = i2 - a2;
                e2.a(i4);
                e2.b(true);
                e2.b(i3);
            }
            i4 = i2 + a2;
            e2.a(i4);
            e2.b(true);
            e2.b(i3);
        } else {
            if (this.s) {
                e2.a(this.u);
            }
            if (this.t) {
                e2.b(this.v);
            }
            e2.a(d());
        }
        this.j.add(new a(e2, kVar, this.r));
        e2.u();
        ListView w2 = e2.w();
        w2.setOnKeyListener(this);
        if (aVar == null && this.x && kVar.h() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(g.abc_popup_menu_header_item_layout, w2, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(kVar.h());
            w2.addHeaderView(frameLayout, (Object) null, false);
            e2.u();
        }
    }

    private C0115ca e() {
        C0115ca caVar = new C0115ca(this.f312c, (AttributeSet) null, this.f314e, this.f315f);
        caVar.a(this.m);
        caVar.a((AdapterView.OnItemClickListener) this);
        caVar.a((PopupWindow.OnDismissListener) this);
        caVar.a(this.p);
        caVar.e(this.o);
        caVar.a(true);
        caVar.f(2);
        return caVar;
    }

    private int f() {
        return y.m(this.p) == 1 ? 0 : 1;
    }

    public void a(int i2) {
        if (this.n != i2) {
            this.n = i2;
            this.o = C0197c.a(i2, y.m(this.p));
        }
    }

    public void a(Parcelable parcelable) {
    }

    public void a(View view) {
        if (this.p != view) {
            this.p = view;
            this.o = C0197c.a(this.n, y.m(this.p));
        }
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    public void a(k kVar) {
        kVar.a((t) this, this.f312c);
        if (v()) {
            d(kVar);
        } else {
            this.i.add(kVar);
        }
    }

    public void a(k kVar, boolean z2) {
        int c2 = c(kVar);
        if (c2 >= 0) {
            int i2 = c2 + 1;
            if (i2 < this.j.size()) {
                this.j.get(i2).f319b.a(false);
            }
            a remove = this.j.remove(c2);
            remove.f319b.b((t) this);
            if (this.B) {
                remove.f318a.b((Object) null);
                remove.f318a.c(0);
            }
            remove.f318a.dismiss();
            int size = this.j.size();
            this.r = size > 0 ? this.j.get(size - 1).f320c : f();
            if (size == 0) {
                dismiss();
                t.a aVar = this.y;
                if (aVar != null) {
                    aVar.a(kVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.z;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.z.removeGlobalOnLayoutListener(this.k);
                    }
                    this.z = null;
                }
                this.q.removeOnAttachStateChangeListener(this.l);
                this.A.onDismiss();
            } else if (z2) {
                this.j.get(0).f319b.a(false);
            }
        }
    }

    public void a(t.a aVar) {
        this.y = aVar;
    }

    public void a(boolean z2) {
        for (a a2 : this.j) {
            q.a(a2.a().getAdapter()).notifyDataSetChanged();
        }
    }

    public boolean a() {
        return false;
    }

    public boolean a(A a2) {
        for (a next : this.j) {
            if (a2 == next.f319b) {
                next.a().requestFocus();
                return true;
            }
        }
        if (!a2.hasVisibleItems()) {
            return false;
        }
        a((k) a2);
        t.a aVar = this.y;
        if (aVar != null) {
            aVar.a(a2);
        }
        return true;
    }

    public Parcelable b() {
        return null;
    }

    public void b(int i2) {
        this.s = true;
        this.u = i2;
    }

    public void b(boolean z2) {
        this.w = z2;
    }

    public void c(int i2) {
        this.t = true;
        this.v = i2;
    }

    public void c(boolean z2) {
        this.x = z2;
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        return false;
    }

    public void dismiss() {
        int size = this.j.size();
        if (size > 0) {
            a[] aVarArr = (a[]) this.j.toArray(new a[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                a aVar = aVarArr[i2];
                if (aVar.f318a.v()) {
                    aVar.f318a.dismiss();
                }
            }
        }
    }

    public void onDismiss() {
        a aVar;
        int size = this.j.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                aVar = null;
                break;
            }
            aVar = this.j.get(i2);
            if (!aVar.f318a.v()) {
                break;
            }
            i2++;
        }
        if (aVar != null) {
            aVar.f319b.a(false);
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
        if (!v()) {
            for (k d2 : this.i) {
                d(d2);
            }
            this.i.clear();
            this.q = this.p;
            if (this.q != null) {
                boolean z2 = this.z == null;
                this.z = this.q.getViewTreeObserver();
                if (z2) {
                    this.z.addOnGlobalLayoutListener(this.k);
                }
                this.q.addOnAttachStateChangeListener(this.l);
            }
        }
    }

    public boolean v() {
        return this.j.size() > 0 && this.j.get(0).f318a.v();
    }

    public ListView w() {
        if (this.j.isEmpty()) {
            return null;
        }
        List<a> list = this.j;
        return list.get(list.size() - 1).a();
    }
}
