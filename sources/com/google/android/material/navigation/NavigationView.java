package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.t;
import androidx.appcompat.widget.Aa;
import b.a.d.g;
import b.h.j.I;
import b.h.j.y;
import b.j.a.c;
import c.b.b.c.j;
import c.b.b.c.k;
import c.b.b.c.o.e;
import c.b.b.c.o.h;
import com.google.android.material.internal.i;
import com.google.android.material.internal.l;
import com.google.android.material.internal.q;
import com.google.android.material.internal.v;

public class NavigationView extends q {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f14120d = {16842912};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f14121e = {-16842910};

    /* renamed from: f  reason: collision with root package name */
    private final i f14122f;

    /* renamed from: g  reason: collision with root package name */
    private final l f14123g;

    /* renamed from: h  reason: collision with root package name */
    a f14124h;
    private final int i;
    private MenuInflater j;

    public interface a {
        boolean onNavigationItemSelected(MenuItem menuItem);
    }

    public static class b extends c {
        public static final Parcelable.Creator<b> CREATOR = new b();

        /* renamed from: c  reason: collision with root package name */
        public Bundle f14125c;

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f14125c = parcel.readBundle(classLoader);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f14125c);
        }
    }

    public NavigationView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.b.b.c.b.navigationViewStyle);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int i3;
        boolean z;
        this.f14123g = new l();
        this.f14122f = new i(context);
        Aa b2 = v.b(context, attributeSet, k.NavigationView, i2, j.Widget_Design_NavigationView, new int[0]);
        if (b2.g(k.NavigationView_android_background)) {
            y.a((View) this, b2.b(k.NavigationView_android_background));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            Drawable background = getBackground();
            e eVar = new e();
            if (background instanceof ColorDrawable) {
                eVar.a(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            eVar.a(context);
            y.a((View) this, (Drawable) eVar);
        }
        if (b2.g(k.NavigationView_elevation)) {
            setElevation((float) b2.c(k.NavigationView_elevation, 0));
        }
        setFitsSystemWindows(b2.a(k.NavigationView_android_fitsSystemWindows, false));
        this.i = b2.c(k.NavigationView_android_maxWidth, 0);
        ColorStateList a2 = b2.g(k.NavigationView_itemIconTint) ? b2.a(k.NavigationView_itemIconTint) : c(16842808);
        if (b2.g(k.NavigationView_itemTextAppearance)) {
            i3 = b2.g(k.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            z = false;
            i3 = 0;
        }
        if (b2.g(k.NavigationView_itemIconSize)) {
            setItemIconSize(b2.c(k.NavigationView_itemIconSize, 0));
        }
        ColorStateList a3 = b2.g(k.NavigationView_itemTextColor) ? b2.a(k.NavigationView_itemTextColor) : null;
        if (!z && a3 == null) {
            a3 = c(16842806);
        }
        Drawable b3 = b2.b(k.NavigationView_itemBackground);
        if (b3 == null && b(b2)) {
            b3 = a(b2);
        }
        if (b2.g(k.NavigationView_itemHorizontalPadding)) {
            this.f14123g.c(b2.c(k.NavigationView_itemHorizontalPadding, 0));
        }
        int c2 = b2.c(k.NavigationView_itemIconPadding, 0);
        setItemMaxLines(b2.d(k.NavigationView_itemMaxLines, 1));
        this.f14122f.a((k.a) new a(this));
        this.f14123g.b(1);
        this.f14123g.a(context, (androidx.appcompat.view.menu.k) this.f14122f);
        this.f14123g.a(a2);
        if (z) {
            this.f14123g.g(i3);
        }
        this.f14123g.b(a3);
        this.f14123g.a(b3);
        this.f14123g.d(c2);
        this.f14122f.a((t) this.f14123g);
        addView((View) this.f14123g.a((ViewGroup) this));
        if (b2.g(c.b.b.c.k.NavigationView_menu)) {
            b(b2.g(c.b.b.c.k.NavigationView_menu, 0));
        }
        if (b2.g(c.b.b.c.k.NavigationView_headerLayout)) {
            a(b2.g(c.b.b.c.k.NavigationView_headerLayout, 0));
        }
        b2.a();
    }

    private final Drawable a(Aa aa) {
        e eVar = new e(new h(getContext(), aa.g(c.b.b.c.k.NavigationView_itemShapeAppearance, 0), aa.g(c.b.b.c.k.NavigationView_itemShapeAppearanceOverlay, 0)));
        eVar.a(c.b.b.c.l.c.a(getContext(), aa, c.b.b.c.k.NavigationView_itemShapeFillColor));
        return new InsetDrawable(eVar, aa.c(c.b.b.c.k.NavigationView_itemShapeInsetStart, 0), aa.c(c.b.b.c.k.NavigationView_itemShapeInsetTop, 0), aa.c(c.b.b.c.k.NavigationView_itemShapeInsetEnd, 0), aa.c(c.b.b.c.k.NavigationView_itemShapeInsetBottom, 0));
    }

    private boolean b(Aa aa) {
        return aa.g(c.b.b.c.k.NavigationView_itemShapeAppearance) || aa.g(c.b.b.c.k.NavigationView_itemShapeAppearanceOverlay);
    }

    private ColorStateList c(int i2) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i2, typedValue, true)) {
            return null;
        }
        ColorStateList a2 = b.a.a.a.a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(b.a.a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i3 = typedValue.data;
        int defaultColor = a2.getDefaultColor();
        return new ColorStateList(new int[][]{f14121e, f14120d, FrameLayout.EMPTY_STATE_SET}, new int[]{a2.getColorForState(f14121e, defaultColor), i3, defaultColor});
    }

    private MenuInflater getMenuInflater() {
        if (this.j == null) {
            this.j = new g(getContext());
        }
        return this.j;
    }

    public View a(int i2) {
        return this.f14123g.a(i2);
    }

    /* access modifiers changed from: protected */
    public void a(I i2) {
        this.f14123g.a(i2);
    }

    public void b(int i2) {
        this.f14123g.b(true);
        getMenuInflater().inflate(i2, this.f14122f);
        this.f14123g.b(false);
        this.f14123g.a(false);
    }

    public MenuItem getCheckedItem() {
        return this.f14123g.c();
    }

    public int getHeaderCount() {
        return this.f14123g.d();
    }

    public Drawable getItemBackground() {
        return this.f14123g.e();
    }

    public int getItemHorizontalPadding() {
        return this.f14123g.f();
    }

    public int getItemIconPadding() {
        return this.f14123g.g();
    }

    public ColorStateList getItemIconTintList() {
        return this.f14123g.j();
    }

    public int getItemMaxLines() {
        return this.f14123g.h();
    }

    public ColorStateList getItemTextColor() {
        return this.f14123g.i();
    }

    public Menu getMenu() {
        return this.f14122f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i4 = this.i;
            }
            super.onMeasure(i2, i3);
        }
        i4 = Math.min(View.MeasureSpec.getSize(i2), this.i);
        i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        super.onMeasure(i2, i3);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        this.f14122f.b(bVar.f14125c);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f14125c = new Bundle();
        this.f14122f.d(bVar.f14125c);
        return bVar;
    }

    public void setCheckedItem(int i2) {
        MenuItem findItem = this.f14122f.findItem(i2);
        if (findItem != null) {
            this.f14123g.a((o) findItem);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f14122f.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f14123g.a((o) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public void setElevation(float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f2);
        }
        Drawable background = getBackground();
        if (background instanceof e) {
            ((e) background).a(f2);
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f14123g.a(drawable);
    }

    public void setItemBackgroundResource(int i2) {
        setItemBackground(b.h.a.a.c(getContext(), i2));
    }

    public void setItemHorizontalPadding(int i2) {
        this.f14123g.c(i2);
    }

    public void setItemHorizontalPaddingResource(int i2) {
        this.f14123g.c(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconPadding(int i2) {
        this.f14123g.d(i2);
    }

    public void setItemIconPaddingResource(int i2) {
        this.f14123g.d(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconSize(int i2) {
        this.f14123g.e(i2);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f14123g.a(colorStateList);
    }

    public void setItemMaxLines(int i2) {
        this.f14123g.f(i2);
    }

    public void setItemTextAppearance(int i2) {
        this.f14123g.g(i2);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f14123g.b(colorStateList);
    }

    public void setNavigationItemSelectedListener(a aVar) {
        this.f14124h = aVar;
    }
}
