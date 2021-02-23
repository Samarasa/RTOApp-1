package c.b.b.c.o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import c.b.b.c.k;
import java.util.LinkedHashSet;
import java.util.Set;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private a f4848a;

    /* renamed from: b  reason: collision with root package name */
    private a f4849b;

    /* renamed from: c  reason: collision with root package name */
    private a f4850c;

    /* renamed from: d  reason: collision with root package name */
    private a f4851d;

    /* renamed from: e  reason: collision with root package name */
    private c f4852e;

    /* renamed from: f  reason: collision with root package name */
    private c f4853f;

    /* renamed from: g  reason: collision with root package name */
    private c f4854g;

    /* renamed from: h  reason: collision with root package name */
    private c f4855h;
    private final Set<a> i;

    public interface a {
        void b();
    }

    public h() {
        this.i = new LinkedHashSet();
        c(f.a());
        d(f.a());
        b(f.a());
        a(f.a());
        b(f.b());
        d(f.b());
        c(f.b());
        a(f.b());
        k();
    }

    public h(Context context, int i2, int i3) {
        this.i = new LinkedHashSet();
        a(context, i2, i3, 0);
    }

    public h(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, 0);
    }

    public h(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        this.i = new LinkedHashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.MaterialShape, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(k.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(k.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        a(context, resourceId, resourceId2, i4);
    }

    public h(h hVar) {
        this.i = new LinkedHashSet();
        c(hVar.g().clone());
        d(hVar.h().clone());
        b(hVar.c().clone());
        a(hVar.b().clone());
        b(hVar.d().clone());
        d(hVar.f().clone());
        c(hVar.e().clone());
        a(hVar.a().clone());
    }

    private final void a(Context context, int i2, int i3, int i4) {
        if (i3 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
            i2 = i3;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, k.ShapeAppearance);
        int i5 = obtainStyledAttributes.getInt(k.ShapeAppearance_cornerFamily, 0);
        int i6 = obtainStyledAttributes.getInt(k.ShapeAppearance_cornerFamilyTopLeft, i5);
        int i7 = obtainStyledAttributes.getInt(k.ShapeAppearance_cornerFamilyTopRight, i5);
        int i8 = obtainStyledAttributes.getInt(k.ShapeAppearance_cornerFamilyBottomRight, i5);
        int i9 = obtainStyledAttributes.getInt(k.ShapeAppearance_cornerFamilyBottomLeft, i5);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(k.ShapeAppearance_cornerSize, i4);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(k.ShapeAppearance_cornerSizeTopLeft, dimensionPixelSize);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(k.ShapeAppearance_cornerSizeTopRight, dimensionPixelSize);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(k.ShapeAppearance_cornerSizeBottomRight, dimensionPixelSize);
        int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(k.ShapeAppearance_cornerSizeBottomLeft, dimensionPixelSize);
        c(f.a(i6, dimensionPixelSize2));
        d(f.a(i7, dimensionPixelSize3));
        b(f.a(i8, dimensionPixelSize4));
        a(f.a(i9, dimensionPixelSize5));
        d(f.b());
        c(f.b());
        a(f.b());
        b(f.b());
        obtainStyledAttributes.recycle();
    }

    private boolean a(a aVar) {
        if (this.f4851d == aVar) {
            return false;
        }
        this.f4851d = aVar;
        return true;
    }

    private boolean a(c cVar) {
        if (this.f4854g == cVar) {
            return false;
        }
        this.f4854g = cVar;
        return true;
    }

    private boolean b(float f2) {
        a aVar = this.f4851d;
        if (aVar.f4830a == f2) {
            return false;
        }
        aVar.f4830a = f2;
        return true;
    }

    private boolean b(a aVar) {
        if (this.f4850c == aVar) {
            return false;
        }
        this.f4850c = aVar;
        return true;
    }

    private boolean b(c cVar) {
        if (this.f4855h == cVar) {
            return false;
        }
        this.f4855h = cVar;
        return true;
    }

    private boolean c(float f2) {
        a aVar = this.f4850c;
        if (aVar.f4830a == f2) {
            return false;
        }
        aVar.f4830a = f2;
        return true;
    }

    private boolean c(a aVar) {
        if (this.f4848a == aVar) {
            return false;
        }
        this.f4848a = aVar;
        return true;
    }

    private boolean c(c cVar) {
        if (this.f4853f == cVar) {
            return false;
        }
        this.f4853f = cVar;
        return true;
    }

    private boolean d(float f2) {
        a aVar = this.f4848a;
        if (aVar.f4830a == f2) {
            return false;
        }
        aVar.f4830a = f2;
        return true;
    }

    private boolean d(a aVar) {
        if (this.f4849b == aVar) {
            return false;
        }
        this.f4849b = aVar;
        return true;
    }

    private boolean d(c cVar) {
        if (this.f4852e == cVar) {
            return false;
        }
        this.f4852e = cVar;
        return true;
    }

    private boolean e(float f2) {
        a aVar = this.f4849b;
        if (aVar.f4830a == f2) {
            return false;
        }
        aVar.f4830a = f2;
        return true;
    }

    private void k() {
        for (a next : this.i) {
            if (next != null) {
                next.b();
            }
        }
    }

    public c a() {
        return this.f4854g;
    }

    public void a(float f2) {
        a(f2, f2, f2, f2);
    }

    public void a(float f2, float f3, float f4, float f5) {
        if ((d(f2) | e(f3) | c(f4)) || b(f5)) {
            k();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        this.i.add(aVar);
    }

    public a b() {
        return this.f4851d;
    }

    /* access modifiers changed from: package-private */
    public void b(a aVar) {
        this.i.remove(aVar);
    }

    public a c() {
        return this.f4850c;
    }

    public c d() {
        return this.f4855h;
    }

    public c e() {
        return this.f4853f;
    }

    public c f() {
        return this.f4852e;
    }

    public a g() {
        return this.f4848a;
    }

    public a h() {
        return this.f4849b;
    }

    public boolean i() {
        boolean z = this.f4855h.getClass().equals(c.class) && this.f4853f.getClass().equals(c.class) && this.f4852e.getClass().equals(c.class) && this.f4854g.getClass().equals(c.class);
        float a2 = this.f4848a.a();
        return z && ((this.f4849b.a() > a2 ? 1 : (this.f4849b.a() == a2 ? 0 : -1)) == 0 && (this.f4851d.a() > a2 ? 1 : (this.f4851d.a() == a2 ? 0 : -1)) == 0 && (this.f4850c.a() > a2 ? 1 : (this.f4850c.a() == a2 ? 0 : -1)) == 0) && ((this.f4849b instanceof g) && (this.f4848a instanceof g) && (this.f4850c instanceof g) && (this.f4851d instanceof g));
    }

    public boolean j() {
        return h().a() == -1.0f && g().a() == -1.0f && b().a() == -1.0f && c().a() == -1.0f;
    }
}
