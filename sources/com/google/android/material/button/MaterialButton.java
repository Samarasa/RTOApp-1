package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0132l;
import b.h.j.y;
import c.b.b.c.j;
import c.b.b.c.k;
import c.b.b.c.l.c;
import c.b.b.c.o.h;
import c.b.b.c.o.l;
import com.google.android.material.internal.v;
import com.google.android.material.internal.w;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialButton extends C0132l implements Checkable, l {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f13965c = {16842911};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f13966d = {16842912};

    /* renamed from: e  reason: collision with root package name */
    private static final int f13967e = j.Widget_MaterialComponents_Button;

    /* renamed from: f  reason: collision with root package name */
    private final a f13968f;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f13969g;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f13970h;
    private Drawable i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private final LinkedHashSet<a> o;
    private b p;
    private int q;

    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    interface b {
        void a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.b.b.c.b.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i2) {
        super(v.a(context, attributeSet, i2, f13967e), attributeSet, i2);
        this.m = false;
        this.n = false;
        this.o = new LinkedHashSet<>();
        Context context2 = getContext();
        TypedArray a2 = v.a(context2, attributeSet, k.MaterialButton, i2, f13967e, new int[0]);
        this.l = a2.getDimensionPixelSize(k.MaterialButton_iconPadding, 0);
        this.f13969g = w.a(a2.getInt(k.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f13970h = c.a(getContext(), a2, k.MaterialButton_iconTint);
        this.i = c.b(getContext(), a2, k.MaterialButton_icon);
        this.q = a2.getInteger(k.MaterialButton_iconGravity, 1);
        this.j = a2.getDimensionPixelSize(k.MaterialButton_iconSize, 0);
        this.f13968f = new a(this, new h(context2, attributeSet, i2, f13967e));
        this.f13968f.a(a2);
        a2.recycle();
        setCompoundDrawablePadding(this.l);
        d();
    }

    private boolean b() {
        return y.m(this) == 1;
    }

    private boolean c() {
        a aVar = this.f13968f;
        return aVar != null && !aVar.j();
    }

    private void d() {
        Drawable drawable = this.i;
        if (drawable != null) {
            this.i = androidx.core.graphics.drawable.a.i(drawable).mutate();
            androidx.core.graphics.drawable.a.a(this.i, this.f13970h);
            PorterDuff.Mode mode = this.f13969g;
            if (mode != null) {
                androidx.core.graphics.drawable.a.a(this.i, mode);
            }
            int i2 = this.j;
            if (i2 == 0) {
                i2 = this.i.getIntrinsicWidth();
            }
            int i3 = this.j;
            if (i3 == 0) {
                i3 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i4 = this.k;
            drawable2.setBounds(i4, 0, i2 + i4, i3);
        }
        int i5 = this.q;
        if (i5 == 1 || i5 == 2) {
            androidx.core.widget.j.a(this, this.i, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            androidx.core.widget.j.a(this, (Drawable) null, (Drawable) null, this.i, (Drawable) null);
        }
    }

    private void e() {
        if (this.i != null && getLayout() != null) {
            int i2 = this.q;
            boolean z = false;
            if (i2 == 1 || i2 == 3) {
                this.k = 0;
                d();
                return;
            }
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
            int i3 = this.j;
            if (i3 == 0) {
                i3 = this.i.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - min) - y.p(this)) - i3) - this.l) - y.q(this)) / 2;
            boolean b2 = b();
            if (this.q == 4) {
                z = true;
            }
            if (b2 != z) {
                measuredWidth = -measuredWidth;
            }
            if (this.k != measuredWidth) {
                this.k = measuredWidth;
                d();
            }
        }
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    public boolean a() {
        a aVar = this.f13968f;
        return aVar != null && aVar.k();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (c()) {
            return this.f13968f.a();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.q;
    }

    public int getIconPadding() {
        return this.l;
    }

    public int getIconSize() {
        return this.j;
    }

    public ColorStateList getIconTint() {
        return this.f13970h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f13969g;
    }

    public ColorStateList getRippleColor() {
        if (c()) {
            return this.f13968f.d();
        }
        return null;
    }

    public h getShapeAppearanceModel() {
        if (c()) {
            return this.f13968f.e();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (c()) {
            return this.f13968f.f();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (c()) {
            return this.f13968f.g();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return c() ? this.f13968f.h() : super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return c() ? this.f13968f.i() : super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.m;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f13965c);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f13966d);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        a aVar;
        super.onLayout(z, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f13968f) != null) {
            aVar.a(i5 - i3, i4 - i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        e();
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        e();
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i2) {
        if (c()) {
            this.f13968f.a(i2);
        } else {
            super.setBackgroundColor(i2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (c()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
                this.f13968f.l();
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? b.a.a.a.a.b(getContext(), i2) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (c()) {
            this.f13968f.a(z);
        }
    }

    public void setChecked(boolean z) {
        if (a() && isEnabled() && this.m != z) {
            this.m = z;
            refreshDrawableState();
            if (!this.n) {
                this.n = true;
                Iterator it = this.o.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(this, this.m);
                }
                this.n = false;
            }
        }
    }

    public void setCornerRadius(int i2) {
        if (c()) {
            this.f13968f.b(i2);
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (c()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        if (c()) {
            this.f13968f.c().a(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            d();
        }
    }

    public void setIconGravity(int i2) {
        if (this.q != i2) {
            this.q = i2;
            e();
        }
    }

    public void setIconPadding(int i2) {
        if (this.l != i2) {
            this.l = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? b.a.a.a.a.b(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.j != i2) {
            this.j = i2;
            d();
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f13970h != colorStateList) {
            this.f13970h = colorStateList;
            d();
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f13969g != mode) {
            this.f13969g = mode;
            d();
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(b.a.a.a.a.a(getContext(), i2));
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(b bVar) {
        this.p = bVar;
    }

    public void setPressed(boolean z) {
        b bVar = this.p;
        if (bVar != null) {
            bVar.a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (c()) {
            this.f13968f.a(colorStateList);
        }
    }

    public void setRippleColorResource(int i2) {
        if (c()) {
            setRippleColor(b.a.a.a.a.a(getContext(), i2));
        }
    }

    public void setShapeAppearanceModel(h hVar) {
        if (c()) {
            this.f13968f.a(hVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (c()) {
            this.f13968f.b(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (c()) {
            this.f13968f.b(colorStateList);
        }
    }

    public void setStrokeColorResource(int i2) {
        if (c()) {
            setStrokeColor(b.a.a.a.a.a(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (c()) {
            this.f13968f.c(i2);
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (c()) {
            this.f13968f.c(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (c()) {
            this.f13968f.a(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void toggle() {
        setChecked(!this.m);
    }
}
