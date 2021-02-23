package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.A;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.t;
import androidx.appcompat.view.menu.u;
import androidx.recyclerview.widget.G;
import androidx.recyclerview.widget.RecyclerView;
import b.h.j.I;
import b.h.j.a.c;
import b.h.j.y;
import java.util.ArrayList;

public class l implements t {

    /* renamed from: a  reason: collision with root package name */
    private NavigationMenuView f14080a;

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f14081b;

    /* renamed from: c  reason: collision with root package name */
    private t.a f14082c;

    /* renamed from: d  reason: collision with root package name */
    androidx.appcompat.view.menu.k f14083d;

    /* renamed from: e  reason: collision with root package name */
    private int f14084e;

    /* renamed from: f  reason: collision with root package name */
    b f14085f;

    /* renamed from: g  reason: collision with root package name */
    LayoutInflater f14086g;

    /* renamed from: h  reason: collision with root package name */
    int f14087h;
    boolean i;
    ColorStateList j;
    ColorStateList k;
    Drawable l;
    int m;
    int n;
    int o;
    boolean p;
    /* access modifiers changed from: private */
    public int q;
    private int r;
    int s;
    final View.OnClickListener t = new k(this);

    private static class a extends k {
        public a(View view) {
            super(view);
        }
    }

    private class b extends RecyclerView.a<k> {

        /* renamed from: a  reason: collision with root package name */
        private final ArrayList<d> f14088a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        private o f14089b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f14090c;

        b() {
            e();
        }

        private void a(int i, int i2) {
            while (i < i2) {
                ((f) this.f14088a.get(i)).f14095b = true;
                i++;
            }
        }

        private void e() {
            if (!this.f14090c) {
                this.f14090c = true;
                this.f14088a.clear();
                this.f14088a.add(new c());
                int size = l.this.f14083d.n().size();
                int i = -1;
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    o oVar = l.this.f14083d.n().get(i3);
                    if (oVar.isChecked()) {
                        a(oVar);
                    }
                    if (oVar.isCheckable()) {
                        oVar.c(false);
                    }
                    if (oVar.hasSubMenu()) {
                        SubMenu subMenu = oVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.f14088a.add(new e(l.this.s, 0));
                            }
                            this.f14088a.add(new f(oVar));
                            int size2 = this.f14088a.size();
                            int size3 = subMenu.size();
                            boolean z2 = false;
                            for (int i4 = 0; i4 < size3; i4++) {
                                o oVar2 = (o) subMenu.getItem(i4);
                                if (oVar2.isVisible()) {
                                    if (!z2 && oVar2.getIcon() != null) {
                                        z2 = true;
                                    }
                                    if (oVar2.isCheckable()) {
                                        oVar2.c(false);
                                    }
                                    if (oVar.isChecked()) {
                                        a(oVar);
                                    }
                                    this.f14088a.add(new f(oVar2));
                                }
                            }
                            if (z2) {
                                a(size2, this.f14088a.size());
                            }
                        }
                    } else {
                        int groupId = oVar.getGroupId();
                        if (groupId != i) {
                            i2 = this.f14088a.size();
                            boolean z3 = oVar.getIcon() != null;
                            if (i3 != 0) {
                                i2++;
                                ArrayList<d> arrayList = this.f14088a;
                                int i5 = l.this.s;
                                arrayList.add(new e(i5, i5));
                            }
                            z = z3;
                        } else if (!z && oVar.getIcon() != null) {
                            a(i2, this.f14088a.size());
                            z = true;
                        }
                        f fVar = new f(oVar);
                        fVar.f14095b = z;
                        this.f14088a.add(fVar);
                        i = groupId;
                    }
                }
                this.f14090c = false;
            }
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            o oVar = this.f14089b;
            if (oVar != null) {
                bundle.putInt("android:menu:checked", oVar.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f14088a.size();
            for (int i = 0; i < size; i++) {
                d dVar = this.f14088a.get(i);
                if (dVar instanceof f) {
                    o a2 = ((f) dVar).a();
                    View actionView = a2 != null ? a2.getActionView() : null;
                    if (actionView != null) {
                        o oVar2 = new o();
                        actionView.saveHierarchyState(oVar2);
                        sparseArray.put(a2.getItemId(), oVar2);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public void a(Bundle bundle) {
            o a2;
            View actionView;
            o oVar;
            o a3;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f14090c = true;
                int size = this.f14088a.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    d dVar = this.f14088a.get(i2);
                    if ((dVar instanceof f) && (a3 = ((f) dVar).a()) != null && a3.getItemId() == i) {
                        a(a3);
                        break;
                    }
                    i2++;
                }
                this.f14090c = false;
                e();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f14088a.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    d dVar2 = this.f14088a.get(i3);
                    if (!(!(dVar2 instanceof f) || (a2 = ((f) dVar2).a()) == null || (actionView = a2.getActionView()) == null || (oVar = (o) sparseParcelableArray.get(a2.getItemId())) == null)) {
                        actionView.restoreHierarchyState(oVar);
                    }
                }
            }
        }

        public void a(o oVar) {
            if (this.f14089b != oVar && oVar.isCheckable()) {
                o oVar2 = this.f14089b;
                if (oVar2 != null) {
                    oVar2.setChecked(false);
                }
                this.f14089b = oVar;
                oVar.setChecked(true);
            }
        }

        /* renamed from: a */
        public void onViewRecycled(k kVar) {
            if (kVar instanceof h) {
                ((NavigationMenuItemView) kVar.itemView).b();
            }
        }

        /* renamed from: a */
        public void onBindViewHolder(k kVar, int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) kVar.itemView;
                navigationMenuItemView.setIconTintList(l.this.k);
                l lVar = l.this;
                if (lVar.i) {
                    navigationMenuItemView.setTextAppearance(lVar.f14087h);
                }
                ColorStateList colorStateList = l.this.j;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable = l.this.l;
                y.a((View) navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
                f fVar = (f) this.f14088a.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(fVar.f14095b);
                navigationMenuItemView.setHorizontalPadding(l.this.m);
                navigationMenuItemView.setIconPadding(l.this.n);
                l lVar2 = l.this;
                if (lVar2.p) {
                    navigationMenuItemView.setIconSize(lVar2.o);
                }
                navigationMenuItemView.setMaxLines(l.this.q);
                navigationMenuItemView.a(fVar.a(), 0);
            } else if (itemViewType == 1) {
                ((TextView) kVar.itemView).setText(((f) this.f14088a.get(i)).a().getTitle());
            } else if (itemViewType == 2) {
                e eVar = (e) this.f14088a.get(i);
                kVar.itemView.setPadding(0, eVar.b(), 0, eVar.a());
            }
        }

        public void a(boolean z) {
            this.f14090c = z;
        }

        public o b() {
            return this.f14089b;
        }

        /* access modifiers changed from: package-private */
        public int c() {
            int i = l.this.f14081b.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < l.this.f14085f.getItemCount(); i2++) {
                if (l.this.f14085f.getItemViewType(i2) == 0) {
                    i++;
                }
            }
            return i;
        }

        public void d() {
            e();
            notifyDataSetChanged();
        }

        public int getItemCount() {
            return this.f14088a.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            d dVar = this.f14088a.get(i);
            if (dVar instanceof e) {
                return 2;
            }
            if (dVar instanceof c) {
                return 3;
            }
            if (dVar instanceof f) {
                return ((f) dVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public k onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                l lVar = l.this;
                return new h(lVar.f14086g, viewGroup, lVar.t);
            } else if (i == 1) {
                return new j(l.this.f14086g, viewGroup);
            } else {
                if (i == 2) {
                    return new i(l.this.f14086g, viewGroup);
                }
                if (i != 3) {
                    return null;
                }
                return new a(l.this.f14081b);
            }
        }
    }

    private static class c implements d {
        c() {
        }
    }

    private interface d {
    }

    private static class e implements d {

        /* renamed from: a  reason: collision with root package name */
        private final int f14092a;

        /* renamed from: b  reason: collision with root package name */
        private final int f14093b;

        public e(int i, int i2) {
            this.f14092a = i;
            this.f14093b = i2;
        }

        public int a() {
            return this.f14093b;
        }

        public int b() {
            return this.f14092a;
        }
    }

    private static class f implements d {

        /* renamed from: a  reason: collision with root package name */
        private final o f14094a;

        /* renamed from: b  reason: collision with root package name */
        boolean f14095b;

        f(o oVar) {
            this.f14094a = oVar;
        }

        public o a() {
            return this.f14094a;
        }
    }

    private class g extends G {
        g(RecyclerView recyclerView) {
            super(recyclerView);
        }

        public void a(View view, b.h.j.a.c cVar) {
            super.a(view, cVar);
            cVar.a((Object) c.b.a(l.this.f14085f.c(), 0, false));
        }
    }

    private static class h extends k {
        public h(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(c.b.b.c.h.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    private static class i extends k {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(c.b.b.c.h.design_navigation_item_separator, viewGroup, false));
        }
    }

    private static class j extends k {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(c.b.b.c.h.design_navigation_item_subheader, viewGroup, false));
        }
    }

    private static abstract class k extends RecyclerView.x {
        public k(View view) {
            super(view);
        }
    }

    public View a(int i2) {
        View inflate = this.f14086g.inflate(i2, this.f14081b, false);
        a(inflate);
        return inflate;
    }

    public u a(ViewGroup viewGroup) {
        if (this.f14080a == null) {
            this.f14080a = (NavigationMenuView) this.f14086g.inflate(c.b.b.c.h.design_navigation_menu, viewGroup, false);
            NavigationMenuView navigationMenuView = this.f14080a;
            navigationMenuView.setAccessibilityDelegateCompat(new g(navigationMenuView));
            if (this.f14085f == null) {
                this.f14085f = new b();
            }
            this.f14081b = (LinearLayout) this.f14086g.inflate(c.b.b.c.h.design_navigation_item_header, this.f14080a, false);
            this.f14080a.setAdapter(this.f14085f);
        }
        return this.f14080a;
    }

    public void a(Context context, androidx.appcompat.view.menu.k kVar) {
        this.f14086g = LayoutInflater.from(context);
        this.f14083d = kVar;
        this.s = context.getResources().getDimensionPixelOffset(c.b.b.c.d.design_navigation_separator_vertical_padding);
    }

    public void a(ColorStateList colorStateList) {
        this.k = colorStateList;
        a(false);
    }

    public void a(Drawable drawable) {
        this.l = drawable;
        a(false);
    }

    public void a(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f14080a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f14085f.a(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f14081b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    public void a(View view) {
        this.f14081b.addView(view);
        NavigationMenuView navigationMenuView = this.f14080a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    public void a(androidx.appcompat.view.menu.k kVar, boolean z) {
        t.a aVar = this.f14082c;
        if (aVar != null) {
            aVar.a(kVar, z);
        }
    }

    public void a(o oVar) {
        this.f14085f.a(oVar);
    }

    public void a(I i2) {
        int e2 = i2.e();
        if (this.r != e2) {
            this.r = e2;
            if (this.f14081b.getChildCount() == 0) {
                NavigationMenuView navigationMenuView = this.f14080a;
                navigationMenuView.setPadding(0, this.r, 0, navigationMenuView.getPaddingBottom());
            }
        }
        y.a((View) this.f14081b, i2);
    }

    public void a(boolean z) {
        b bVar = this.f14085f;
        if (bVar != null) {
            bVar.d();
        }
    }

    public boolean a() {
        return false;
    }

    public boolean a(A a2) {
        return false;
    }

    public boolean a(androidx.appcompat.view.menu.k kVar, o oVar) {
        return false;
    }

    public Parcelable b() {
        Bundle bundle = new Bundle();
        if (this.f14080a != null) {
            SparseArray sparseArray = new SparseArray();
            this.f14080a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        b bVar = this.f14085f;
        if (bVar != null) {
            bundle.putBundle("android:menu:adapter", bVar.a());
        }
        if (this.f14081b != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.f14081b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    public void b(int i2) {
        this.f14084e = i2;
    }

    public void b(ColorStateList colorStateList) {
        this.j = colorStateList;
        a(false);
    }

    public void b(boolean z) {
        b bVar = this.f14085f;
        if (bVar != null) {
            bVar.a(z);
        }
    }

    public boolean b(androidx.appcompat.view.menu.k kVar, o oVar) {
        return false;
    }

    public o c() {
        return this.f14085f.b();
    }

    public void c(int i2) {
        this.m = i2;
        a(false);
    }

    public int d() {
        return this.f14081b.getChildCount();
    }

    public void d(int i2) {
        this.n = i2;
        a(false);
    }

    public Drawable e() {
        return this.l;
    }

    public void e(int i2) {
        if (this.o != i2) {
            this.o = i2;
            this.p = true;
            a(false);
        }
    }

    public int f() {
        return this.m;
    }

    public void f(int i2) {
        this.q = i2;
        a(false);
    }

    public int g() {
        return this.n;
    }

    public void g(int i2) {
        this.f14087h = i2;
        this.i = true;
        a(false);
    }

    public int getId() {
        return this.f14084e;
    }

    public int h() {
        return this.q;
    }

    public ColorStateList i() {
        return this.j;
    }

    public ColorStateList j() {
        return this.k;
    }
}
