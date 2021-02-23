package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.A;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0109b;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.s;
import androidx.appcompat.view.menu.t;
import androidx.appcompat.view.menu.u;
import androidx.appcompat.view.menu.w;
import androidx.appcompat.widget.ActionMenuView;
import b.a.g;
import b.h.j.C0196b;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.g  reason: case insensitive filesystem */
class C0122g extends C0109b implements C0196b.a {
    c A;
    private b B;
    final f C = new f();
    int D;
    d k;
    private Drawable l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private final SparseBooleanArray x = new SparseBooleanArray();
    e y;
    a z;

    /* renamed from: androidx.appcompat.widget.g$a */
    private class a extends s {
        public a(Context context, A a2, View view) {
            super(context, a2, view, false, b.a.a.actionOverflowMenuStyle);
            if (!((o) a2.getItem()).h()) {
                View view2 = C0122g.this.k;
                a(view2 == null ? (View) C0122g.this.i : view2);
            }
            a((t.a) C0122g.this.C);
        }

        /* access modifiers changed from: protected */
        public void d() {
            C0122g gVar = C0122g.this;
            gVar.z = null;
            gVar.D = 0;
            super.d();
        }
    }

    /* renamed from: androidx.appcompat.widget.g$b */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        public w a() {
            a aVar = C0122g.this.z;
            if (aVar != null) {
                return aVar.b();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.g$c */
    private class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private e f637a;

        public c(e eVar) {
            this.f637a = eVar;
        }

        public void run() {
            if (C0122g.this.f295c != null) {
                C0122g.this.f295c.a();
            }
            View view = (View) C0122g.this.i;
            if (!(view == null || view.getWindowToken() == null || !this.f637a.f())) {
                C0122g.this.y = this.f637a;
            }
            C0122g.this.A = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.g$d */
    private class d extends C0146v implements ActionMenuView.a {

        /* renamed from: c  reason: collision with root package name */
        private final float[] f639c = new float[2];

        public d(Context context) {
            super(context, (AttributeSet) null, b.a.a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            Ia.a(this, getContentDescription());
            setOnTouchListener(new C0124h(this, this, C0122g.this));
        }

        public boolean b() {
            return false;
        }

        public boolean l() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0122g.this.j();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.g$e */
    private class e extends s {
        public e(Context context, k kVar, View view, boolean z) {
            super(context, kVar, view, z, b.a.a.actionOverflowMenuStyle);
            a(8388613);
            a((t.a) C0122g.this.C);
        }

        /* access modifiers changed from: protected */
        public void d() {
            if (C0122g.this.f295c != null) {
                C0122g.this.f295c.close();
            }
            C0122g.this.y = null;
            super.d();
        }
    }

    /* renamed from: androidx.appcompat.widget.g$f */
    private class f implements t.a {
        f() {
        }

        public void a(k kVar, boolean z) {
            if (kVar instanceof A) {
                kVar.m().a(false);
            }
            t.a c2 = C0122g.this.c();
            if (c2 != null) {
                c2.a(kVar, z);
            }
        }

        public boolean a(k kVar) {
            if (kVar == null) {
                return false;
            }
            C0122g.this.D = ((A) kVar).getItem().getItemId();
            t.a c2 = C0122g.this.c();
            if (c2 != null) {
                return c2.a(kVar);
            }
            return false;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.appcompat.widget.g$g  reason: collision with other inner class name */
    private static class C0011g implements Parcelable {
        public static final Parcelable.Creator<C0011g> CREATOR = new C0126i();

        /* renamed from: a  reason: collision with root package name */
        public int f642a;

        C0011g() {
        }

        C0011g(Parcel parcel) {
            this.f642a = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f642a);
        }
    }

    public C0122g(Context context) {
        super(context, g.abc_action_menu_layout, g.abc_action_menu_item_layout);
    }

    private View a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof u.a) && ((u.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public View a(o oVar, View view, ViewGroup viewGroup) {
        View actionView = oVar.getActionView();
        if (actionView == null || oVar.f()) {
            actionView = super.a(oVar, view, viewGroup);
        }
        actionView.setVisibility(oVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public void a(Context context, k kVar) {
        super.a(context, kVar);
        Resources resources = context.getResources();
        b.a.d.a a2 = b.a.d.a.a(context);
        if (!this.o) {
            this.n = a2.g();
        }
        if (!this.u) {
            this.p = a2.b();
        }
        if (!this.s) {
            this.r = a2.c();
        }
        int i = this.p;
        if (this.n) {
            if (this.k == null) {
                this.k = new d(this.f293a);
                if (this.m) {
                    this.k.setImageDrawable(this.l);
                    this.l = null;
                    this.m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.k.getMeasuredWidth();
        } else {
            this.k = null;
        }
        this.q = i;
        this.w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public void a(Configuration configuration) {
        if (!this.s) {
            this.r = b.a.d.a.a(this.f294b).c();
        }
        k kVar = this.f295c;
        if (kVar != null) {
            kVar.b(true);
        }
    }

    public void a(Drawable drawable) {
        d dVar = this.k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.m = true;
        this.l = drawable;
    }

    public void a(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof C0011g) && (i = ((C0011g) parcelable).f642a) > 0 && (findItem = this.f295c.findItem(i)) != null) {
            a((A) findItem.getSubMenu());
        }
    }

    public void a(k kVar, boolean z2) {
        d();
        super.a(kVar, z2);
    }

    public void a(o oVar, u.a aVar) {
        aVar.a(oVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.i);
        if (this.B == null) {
            this.B = new b();
        }
        actionMenuItemView.setPopupCallback(this.B);
    }

    public void a(ActionMenuView actionMenuView) {
        this.i = actionMenuView;
        actionMenuView.a(this.f295c);
    }

    public void a(boolean z2) {
        u uVar;
        super.a(z2);
        ((View) this.i).requestLayout();
        k kVar = this.f295c;
        boolean z3 = false;
        if (kVar != null) {
            ArrayList<o> c2 = kVar.c();
            int size = c2.size();
            for (int i = 0; i < size; i++) {
                C0196b a2 = c2.get(i).a();
                if (a2 != null) {
                    a2.a((C0196b.a) this);
                }
            }
        }
        k kVar2 = this.f295c;
        ArrayList<o> j = kVar2 != null ? kVar2.j() : null;
        if (this.n && j != null) {
            int size2 = j.size();
            if (size2 == 1) {
                z3 = !j.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.k == null) {
                this.k = new d(this.f293a);
            }
            ViewGroup viewGroup = (ViewGroup) this.k.getParent();
            if (viewGroup != this.i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.i;
                actionMenuView.addView(this.k, actionMenuView.c());
            }
        } else {
            d dVar = this.k;
            if (dVar != null && dVar.getParent() == (uVar = this.i)) {
                ((ViewGroup) uVar).removeView(this.k);
            }
        }
        ((ActionMenuView) this.i).setOverflowReserved(this.n);
    }

    public boolean a() {
        int i;
        ArrayList<o> arrayList;
        int i2;
        int i3;
        int i4;
        boolean z2;
        C0122g gVar = this;
        k kVar = gVar.f295c;
        View view = null;
        int i5 = 0;
        if (kVar != null) {
            arrayList = kVar.n();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = gVar.r;
        int i7 = gVar.q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) gVar.i;
        int i8 = i6;
        boolean z3 = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            o oVar = arrayList.get(i11);
            if (oVar.k()) {
                i9++;
            } else if (oVar.j()) {
                i10++;
            } else {
                z3 = true;
            }
            if (gVar.v && oVar.isActionViewExpanded()) {
                i8 = 0;
            }
        }
        if (gVar.n && (z3 || i10 + i9 > i8)) {
            i8--;
        }
        int i12 = i8 - i9;
        SparseBooleanArray sparseBooleanArray = gVar.x;
        sparseBooleanArray.clear();
        if (gVar.t) {
            int i13 = gVar.w;
            i2 = i7 / i13;
            i3 = i13 + ((i7 % i13) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i14 = i7;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i) {
            o oVar2 = arrayList.get(i15);
            if (oVar2.k()) {
                View a2 = gVar.a(oVar2, view, viewGroup);
                if (gVar.t) {
                    i2 -= ActionMenuView.a(a2, i3, i2, makeMeasureSpec, i5);
                } else {
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a2.getMeasuredWidth();
                i14 -= measuredWidth;
                if (i16 != 0) {
                    measuredWidth = i16;
                }
                int groupId = oVar2.getGroupId();
                if (groupId != 0) {
                    z2 = true;
                    sparseBooleanArray.put(groupId, true);
                } else {
                    z2 = true;
                }
                oVar2.d(z2);
                i16 = measuredWidth;
                i4 = i;
            } else if (oVar2.j()) {
                int groupId2 = oVar2.getGroupId();
                boolean z4 = sparseBooleanArray.get(groupId2);
                boolean z5 = (i12 > 0 || z4) && i14 > 0 && (!gVar.t || i2 > 0);
                if (z5) {
                    boolean z6 = z5;
                    i4 = i;
                    View a3 = gVar.a(oVar2, (View) null, viewGroup);
                    if (gVar.t) {
                        int a4 = ActionMenuView.a(a3, i3, i2, makeMeasureSpec, 0);
                        i2 -= a4;
                        z6 = a4 == 0 ? false : z6;
                    } else {
                        a3.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = a3.getMeasuredWidth();
                    i14 -= measuredWidth2;
                    if (i16 == 0) {
                        i16 = measuredWidth2;
                    }
                    z5 = z6 & (!gVar.t ? i14 + i16 > 0 : i14 >= 0);
                } else {
                    boolean z7 = z5;
                    i4 = i;
                }
                if (z5 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z4) {
                    sparseBooleanArray.put(groupId2, false);
                    int i17 = 0;
                    while (i17 < i15) {
                        o oVar3 = arrayList.get(i17);
                        if (oVar3.getGroupId() == groupId2) {
                            if (oVar3.h()) {
                                i12++;
                            }
                            oVar3.d(false);
                        }
                        i17++;
                    }
                }
                if (z5) {
                    i12--;
                }
                oVar2.d(z5);
            } else {
                i4 = i;
                oVar2.d(false);
                i15++;
                i = i4;
                view = null;
                i5 = 0;
                gVar = this;
            }
            i15++;
            i = i4;
            view = null;
            i5 = 0;
            gVar = this;
        }
        return true;
    }

    public boolean a(int i, o oVar) {
        return oVar.h();
    }

    public boolean a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.k) {
            return false;
        }
        return super.a(viewGroup, i);
    }

    public boolean a(A a2) {
        boolean z2 = false;
        if (!a2.hasVisibleItems()) {
            return false;
        }
        A a3 = a2;
        while (a3.t() != this.f295c) {
            a3 = (A) a3.t();
        }
        View a4 = a(a3.getItem());
        if (a4 == null) {
            return false;
        }
        this.D = a2.getItem().getItemId();
        int size = a2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = a2.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i++;
        }
        this.z = new a(this.f294b, a2, a4);
        this.z.a(z2);
        this.z.e();
        super.a(a2);
        return true;
    }

    public Parcelable b() {
        C0011g gVar = new C0011g();
        gVar.f642a = this.D;
        return gVar;
    }

    public u b(ViewGroup viewGroup) {
        u uVar = this.i;
        u b2 = super.b(viewGroup);
        if (uVar != b2) {
            ((ActionMenuView) b2).setPresenter(this);
        }
        return b2;
    }

    public void b(boolean z2) {
        this.v = z2;
    }

    public void c(boolean z2) {
        this.n = z2;
        this.o = true;
    }

    public boolean d() {
        return f() | g();
    }

    public Drawable e() {
        d dVar = this.k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.m) {
            return this.l;
        }
        return null;
    }

    public boolean f() {
        u uVar;
        c cVar = this.A;
        if (cVar == null || (uVar = this.i) == null) {
            e eVar = this.y;
            if (eVar == null) {
                return false;
            }
            eVar.a();
            return true;
        }
        ((View) uVar).removeCallbacks(cVar);
        this.A = null;
        return true;
    }

    public boolean g() {
        a aVar = this.z;
        if (aVar == null) {
            return false;
        }
        aVar.a();
        return true;
    }

    public boolean h() {
        return this.A != null || i();
    }

    public boolean i() {
        e eVar = this.y;
        return eVar != null && eVar.c();
    }

    public boolean j() {
        k kVar;
        if (!this.n || i() || (kVar = this.f295c) == null || this.i == null || this.A != null || kVar.j().isEmpty()) {
            return false;
        }
        this.A = new c(new e(this.f294b, this.f295c, this.k, true));
        ((View) this.i).post(this.A);
        super.a((A) null);
        return true;
    }
}
