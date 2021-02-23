package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.t;
import androidx.appcompat.view.menu.u;
import b.a.g;
import java.util.ArrayList;

public class i implements t, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    Context f321a;

    /* renamed from: b  reason: collision with root package name */
    LayoutInflater f322b;

    /* renamed from: c  reason: collision with root package name */
    k f323c;

    /* renamed from: d  reason: collision with root package name */
    ExpandedMenuView f324d;

    /* renamed from: e  reason: collision with root package name */
    int f325e;

    /* renamed from: f  reason: collision with root package name */
    int f326f;

    /* renamed from: g  reason: collision with root package name */
    int f327g;

    /* renamed from: h  reason: collision with root package name */
    private t.a f328h;
    a i;
    private int j;

    private class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        private int f329a = -1;

        public a() {
            a();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            o f2 = i.this.f323c.f();
            if (f2 != null) {
                ArrayList<o> j = i.this.f323c.j();
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    if (j.get(i) == f2) {
                        this.f329a = i;
                        return;
                    }
                }
            }
            this.f329a = -1;
        }

        public int getCount() {
            int size = i.this.f323c.j().size() - i.this.f325e;
            return this.f329a < 0 ? size : size - 1;
        }

        public o getItem(int i) {
            ArrayList<o> j = i.this.f323c.j();
            int i2 = i + i.this.f325e;
            int i3 = this.f329a;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return j.get(i2);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                i iVar = i.this;
                view = iVar.f322b.inflate(iVar.f327g, viewGroup, false);
            }
            ((u.a) view).a(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public i(int i2, int i3) {
        this.f327g = i2;
        this.f326f = i3;
    }

    public i(Context context, int i2) {
        this(i2, 0);
        this.f321a = context;
        this.f322b = LayoutInflater.from(this.f321a);
    }

    public u a(ViewGroup viewGroup) {
        if (this.f324d == null) {
            this.f324d = (ExpandedMenuView) this.f322b.inflate(g.abc_expanded_menu_layout, viewGroup, false);
            if (this.i == null) {
                this.i = new a();
            }
            this.f324d.setAdapter(this.i);
            this.f324d.setOnItemClickListener(this);
        }
        return this.f324d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r2.f322b == null) goto L_0x000b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r3, androidx.appcompat.view.menu.k r4) {
        /*
            r2 = this;
            int r0 = r2.f326f
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r3, r0)
            r2.f321a = r1
        L_0x000b:
            android.content.Context r3 = r2.f321a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r2.f322b = r3
            goto L_0x001f
        L_0x0014:
            android.content.Context r0 = r2.f321a
            if (r0 == 0) goto L_0x001f
            r2.f321a = r3
            android.view.LayoutInflater r3 = r2.f322b
            if (r3 != 0) goto L_0x001f
            goto L_0x000b
        L_0x001f:
            r2.f323c = r4
            androidx.appcompat.view.menu.i$a r3 = r2.i
            if (r3 == 0) goto L_0x0028
            r3.notifyDataSetChanged()
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.i.a(android.content.Context, androidx.appcompat.view.menu.k):void");
    }

    public void a(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f324d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void a(Parcelable parcelable) {
        a((Bundle) parcelable);
    }

    public void a(k kVar, boolean z) {
        t.a aVar = this.f328h;
        if (aVar != null) {
            aVar.a(kVar, z);
        }
    }

    public void a(t.a aVar) {
        this.f328h = aVar;
    }

    public void a(boolean z) {
        a aVar = this.i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public boolean a() {
        return false;
    }

    public boolean a(A a2) {
        if (!a2.hasVisibleItems()) {
            return false;
        }
        new l(a2).a((IBinder) null);
        t.a aVar = this.f328h;
        if (aVar == null) {
            return true;
        }
        aVar.a(a2);
        return true;
    }

    public boolean a(k kVar, o oVar) {
        return false;
    }

    public Parcelable b() {
        if (this.f324d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        b(bundle);
        return bundle;
    }

    public void b(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f324d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    public boolean b(k kVar, o oVar) {
        return false;
    }

    public ListAdapter c() {
        if (this.i == null) {
            this.i = new a();
        }
        return this.i;
    }

    public int getId() {
        return this.j;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f323c.a((MenuItem) this.i.getItem(i2), (t) this, 0);
    }
}
