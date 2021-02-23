package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.t;
import androidx.appcompat.view.menu.u;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b  reason: case insensitive filesystem */
public abstract class C0109b implements t {

    /* renamed from: a  reason: collision with root package name */
    protected Context f293a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f294b;

    /* renamed from: c  reason: collision with root package name */
    protected k f295c;

    /* renamed from: d  reason: collision with root package name */
    protected LayoutInflater f296d;

    /* renamed from: e  reason: collision with root package name */
    protected LayoutInflater f297e;

    /* renamed from: f  reason: collision with root package name */
    private t.a f298f;

    /* renamed from: g  reason: collision with root package name */
    private int f299g;

    /* renamed from: h  reason: collision with root package name */
    private int f300h;
    protected u i;
    private int j;

    public C0109b(Context context, int i2, int i3) {
        this.f293a = context;
        this.f296d = LayoutInflater.from(context);
        this.f299g = i2;
        this.f300h = i3;
    }

    public View a(o oVar, View view, ViewGroup viewGroup) {
        u.a a2 = view instanceof u.a ? (u.a) view : a(viewGroup);
        a(oVar, a2);
        return (View) a2;
    }

    public u.a a(ViewGroup viewGroup) {
        return (u.a) this.f296d.inflate(this.f300h, viewGroup, false);
    }

    public void a(int i2) {
        this.j = i2;
    }

    public void a(Context context, k kVar) {
        this.f294b = context;
        this.f297e = LayoutInflater.from(this.f294b);
        this.f295c = kVar;
    }

    /* access modifiers changed from: protected */
    public void a(View view, int i2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.i).addView(view, i2);
    }

    public void a(k kVar, boolean z) {
        t.a aVar = this.f298f;
        if (aVar != null) {
            aVar.a(kVar, z);
        }
    }

    public abstract void a(o oVar, u.a aVar);

    public void a(t.a aVar) {
        this.f298f = aVar;
    }

    public void a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup != null) {
            k kVar = this.f295c;
            int i2 = 0;
            if (kVar != null) {
                kVar.b();
                ArrayList<o> n = this.f295c.n();
                int size = n.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    o oVar = n.get(i4);
                    if (a(i3, oVar)) {
                        View childAt = viewGroup.getChildAt(i3);
                        o itemData = childAt instanceof u.a ? ((u.a) childAt).getItemData() : null;
                        View a2 = a(oVar, childAt, viewGroup);
                        if (oVar != itemData) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            a(a2, i3);
                        }
                        i3++;
                    }
                }
                i2 = i3;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (!a(viewGroup, i2)) {
                    i2++;
                }
            }
        }
    }

    public abstract boolean a(int i2, o oVar);

    /* access modifiers changed from: protected */
    public boolean a(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    public boolean a(A a2) {
        t.a aVar = this.f298f;
        if (aVar != null) {
            return aVar.a(a2);
        }
        return false;
    }

    public boolean a(k kVar, o oVar) {
        return false;
    }

    public u b(ViewGroup viewGroup) {
        if (this.i == null) {
            this.i = (u) this.f296d.inflate(this.f299g, viewGroup, false);
            this.i.a(this.f295c);
            a(true);
        }
        return this.i;
    }

    public boolean b(k kVar, o oVar) {
        return false;
    }

    public t.a c() {
        return this.f298f;
    }

    public int getId() {
        return this.j;
    }
}
