package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C0134m;
import b.h.j.C0195a;
import b.h.j.a.c;
import b.h.j.y;
import c.b.b.c.b;
import c.b.b.c.i;
import c.b.b.c.j;
import c.b.b.c.k;
import c.b.b.c.l.f;
import c.b.b.c.l.h;
import c.b.b.c.o.l;
import com.google.android.material.chip.c;
import com.google.android.material.internal.v;
import com.google.android.material.internal.w;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class Chip extends C0134m implements c.a, l {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final Rect f13979d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f13980e = {16842913};
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public c f13981f;

    /* renamed from: g  reason: collision with root package name */
    private InsetDrawable f13982g;

    /* renamed from: h  reason: collision with root package name */
    private RippleDrawable f13983h;
    private View.OnClickListener i;
    private CompoundButton.OnCheckedChangeListener j;
    private boolean k;
    private boolean l;
    private boolean m;
    /* access modifiers changed from: private */
    public boolean n;
    private boolean o;
    private int p;
    private int q;
    private final a r;
    private final Rect s;
    private final RectF t;
    private final h u;

    private class a extends b.j.b.c {
        a(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        public int a(float f2, float f3) {
            return (!Chip.this.i() || !Chip.this.getCloseIconTouchBounds().contains(f2, f3)) ? 0 : 1;
        }

        /* access modifiers changed from: protected */
        public void a(int i, b.h.j.a.c cVar) {
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = i.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (TextUtils.isEmpty(text)) {
                        text = BuildConfig.FLAVOR;
                    }
                    objArr[0] = text;
                    closeIconContentDescription = context.getString(i2, objArr).trim();
                }
                cVar.c(closeIconContentDescription);
                cVar.c(Chip.this.getCloseIconTouchBoundsInt());
                cVar.a(c.a.f2546e);
                cVar.f(Chip.this.isEnabled());
                return;
            }
            cVar.c((CharSequence) BuildConfig.FLAVOR);
            cVar.c(Chip.f13979d);
        }

        /* access modifiers changed from: protected */
        public void a(int i, boolean z) {
            if (i == 1) {
                boolean unused = Chip.this.n = z;
                Chip.this.refreshDrawableState();
            }
        }

        /* access modifiers changed from: protected */
        public void a(b.h.j.a.c cVar) {
            cVar.b(Chip.this.c());
            cVar.d(Chip.this.isClickable());
            cVar.b((CharSequence) Chip.class.getName());
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                cVar.f(text);
            } else {
                cVar.c(text);
            }
        }

        /* access modifiers changed from: protected */
        public void a(List<Integer> list) {
            list.add(0);
            if (Chip.this.i() && Chip.this.d()) {
                list.add(1);
            }
        }

        /* access modifiers changed from: protected */
        public boolean a(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.e();
            }
            return false;
        }
    }

    public Chip(Context context) {
        this(context, (AttributeSet) null);
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.chipStyle);
    }

    public Chip(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.s = new Rect();
        this.t = new RectF();
        this.u = new a(this);
        a(attributeSet);
        c a2 = c.a(context, attributeSet, i2, j.Widget_MaterialComponents_Chip_Action);
        a(context, attributeSet, i2);
        setChipDrawable(a2);
        a2.a(y.i(this));
        TypedArray a3 = v.a(context, attributeSet, k.Chip, i2, j.Widget_MaterialComponents_Chip_Action, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(c.b.b.c.l.c.a(context, a3, k.Chip_android_textColor));
        }
        boolean hasValue = a3.hasValue(k.Chip_shapeAppearance);
        a3.recycle();
        this.r = new a(this);
        if (Build.VERSION.SDK_INT >= 24) {
            y.a((View) this, (C0195a) this.r);
        } else {
            l();
        }
        if (!hasValue) {
            j();
        }
        setChecked(this.k);
        a2.e(false);
        setText(a2.L());
        setEllipsize(a2.F());
        setIncludeFontPadding(false);
        p();
        if (!this.f13981f.U()) {
            setSingleLine();
        }
        setGravity(8388627);
        o();
        if (f()) {
            setMinHeight(this.q);
        }
        this.p = y.m(this);
    }

    private void a(int i2, int i3, int i4, int i5) {
        this.f13982g = new InsetDrawable(this.f13981f, i2, i3, i4, i5);
    }

    private void a(Context context, AttributeSet attributeSet, int i2) {
        if (attributeSet != null) {
            TypedArray a2 = v.a(context, attributeSet, k.Chip, i2, j.Widget_MaterialComponents_Chip_Action, new int[0]);
            this.o = a2.getBoolean(k.Chip_ensureMinTouchTargetSize, false);
            this.q = (int) Math.ceil((double) a2.getDimension(k.Chip_chipMinTouchTargetSize, (float) Math.ceil((double) w.a(getContext(), 48))));
            a2.recycle();
        }
    }

    private void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    private void a(c cVar) {
        cVar.a((c.a) this);
    }

    @SuppressLint({"PrivateApi"})
    private boolean a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = b.j.b.c.class.getDeclaredField("p");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.r)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = b.j.b.c.class.getDeclaredMethod("i", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.r, new Object[]{Integer.MIN_VALUE});
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            }
        }
        return false;
    }

    private void b(c cVar) {
        if (cVar != null) {
            cVar.a((c.a) null);
        }
    }

    private int[] g() {
        int i2 = 0;
        int i3 = isEnabled() ? 1 : 0;
        if (this.n) {
            i3++;
        }
        if (this.m) {
            i3++;
        }
        if (this.l) {
            i3++;
        }
        if (isChecked()) {
            i3++;
        }
        int[] iArr = new int[i3];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i2 = 1;
        }
        if (this.n) {
            iArr[i2] = 16842908;
            i2++;
        }
        if (this.m) {
            iArr[i2] = 16843623;
            i2++;
        }
        if (this.l) {
            iArr[i2] = 16842919;
            i2++;
        }
        if (isChecked()) {
            iArr[i2] = 16842913;
        }
        return iArr;
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.t.setEmpty();
        if (i()) {
            this.f13981f.a(this.t);
        }
        return this.t;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.s.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.s;
    }

    private f getTextAppearance() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.M();
        }
        return null;
    }

    private void h() {
        if (getBackgroundDrawable() == this.f13982g && this.f13981f.getCallback() == null) {
            this.f13981f.setCallback(this.f13982g);
        }
    }

    /* access modifiers changed from: private */
    public boolean i() {
        c cVar = this.f13981f;
        return (cVar == null || cVar.y() == null) ? false : true;
    }

    private void j() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new b(this));
        }
    }

    private void k() {
        if (this.f13982g != null) {
            this.f13982g = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m();
        }
    }

    private void l() {
        if (Build.VERSION.SDK_INT < 24) {
            y.a((View) this, (C0195a) (!i() || !d()) ? null : this.r);
        }
    }

    private void m() {
        if (c.b.b.c.m.a.f4814a) {
            n();
            return;
        }
        this.f13981f.f(true);
        y.a((View) this, getBackgroundDrawable());
        h();
    }

    private void n() {
        this.f13983h = new RippleDrawable(c.b.b.c.m.a.a(this.f13981f.J()), getBackgroundDrawable(), (Drawable) null);
        this.f13981f.f(false);
        y.a((View) this, (Drawable) this.f13983h);
    }

    private void o() {
        c cVar;
        if (!TextUtils.isEmpty(getText()) && (cVar = this.f13981f) != null) {
            y.a(this, (int) (this.f13981f.v() + this.f13981f.O() + this.f13981f.l()), getPaddingTop(), (int) (cVar.q() + this.f13981f.N() + this.f13981f.m()), getPaddingBottom());
        }
    }

    private void p() {
        TextPaint paint = getPaint();
        c cVar = this.f13981f;
        if (cVar != null) {
            paint.drawableState = cVar.getState();
        }
        f textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.b(getContext(), paint, this.u);
        }
    }

    private void setCloseIconHovered(boolean z) {
        if (this.m != z) {
            this.m = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.l != z) {
            this.l = z;
            refreshDrawableState();
        }
    }

    public void a() {
        a(this.q);
        m();
        o();
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        if (getMinWidth() != r6) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r6) {
        /*
            r5 = this;
            r5.q = r6
            boolean r0 = r5.f()
            r1 = 0
            if (r0 != 0) goto L_0x000d
            r5.k()
            return r1
        L_0x000d:
            com.google.android.material.chip.c r0 = r5.f13981f
            int r0 = r0.getIntrinsicHeight()
            int r0 = r6 - r0
            int r0 = java.lang.Math.max(r1, r0)
            com.google.android.material.chip.c r2 = r5.f13981f
            int r2 = r2.getIntrinsicWidth()
            int r2 = r6 - r2
            int r2 = java.lang.Math.max(r1, r2)
            if (r2 > 0) goto L_0x002d
            if (r0 > 0) goto L_0x002d
            r5.k()
            return r1
        L_0x002d:
            if (r2 <= 0) goto L_0x0032
            int r2 = r2 / 2
            goto L_0x0033
        L_0x0032:
            r2 = 0
        L_0x0033:
            if (r0 <= 0) goto L_0x0037
            int r1 = r0 / 2
        L_0x0037:
            android.graphics.drawable.InsetDrawable r0 = r5.f13982g
            r3 = 1
            if (r0 == 0) goto L_0x0057
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.drawable.InsetDrawable r4 = r5.f13982g
            r4.getPadding(r0)
            int r4 = r0.top
            if (r4 != r1) goto L_0x0057
            int r4 = r0.bottom
            if (r4 != r1) goto L_0x0057
            int r4 = r0.left
            if (r4 != r2) goto L_0x0057
            int r0 = r0.right
            if (r0 != r2) goto L_0x0057
            return r3
        L_0x0057:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 16
            if (r0 < r4) goto L_0x006d
            int r0 = r5.getMinHeight()
            if (r0 == r6) goto L_0x0066
            r5.setMinHeight(r6)
        L_0x0066:
            int r0 = r5.getMinWidth()
            if (r0 == r6) goto L_0x0073
            goto L_0x0070
        L_0x006d:
            r5.setMinHeight(r6)
        L_0x0070:
            r5.setMinWidth(r6)
        L_0x0073:
            r5.a(r2, r1, r2, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.a(int):boolean");
    }

    public boolean c() {
        c cVar = this.f13981f;
        return cVar != null && cVar.Q();
    }

    public boolean d() {
        c cVar = this.f13981f;
        return cVar != null && cVar.S();
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return a(motionEvent) || this.r.a(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.r.a(keyEvent) || this.r.c() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        c cVar = this.f13981f;
        if ((cVar == null || !cVar.R()) ? false : this.f13981f.a(g())) {
            invalidate();
        }
    }

    public boolean e() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.i;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.r.a(1, 1);
        return z;
    }

    public boolean f() {
        return this.o;
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f13982g;
        return insetDrawable == null ? this.f13981f : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.n();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.o();
        }
        return null;
    }

    public float getChipCornerRadius() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.p();
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f13981f;
    }

    public float getChipEndPadding() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.q();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.r();
        }
        return null;
    }

    public float getChipIconSize() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.s();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.t();
        }
        return null;
    }

    public float getChipMinHeight() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.u();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.v();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.w();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.x();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.y();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.z();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.A();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.B();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.C();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.E();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.F();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.r.c() == 1 || this.r.b() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public c.b.b.c.a.h getHideMotionSpec() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.G();
        }
        return null;
    }

    public float getIconEndPadding() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.H();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.I();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.J();
        }
        return null;
    }

    public c.b.b.c.o.h getShapeAppearanceModel() {
        return this.f13981f.h();
    }

    public c.b.b.c.a.h getShowMotionSpec() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.K();
        }
        return null;
    }

    public float getTextEndPadding() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.N();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        c cVar = this.f13981f;
        if (cVar != null) {
            return cVar.O();
        }
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f13980e);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        this.r.a(z, i2, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                z = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        z = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(z);
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Chip.class.getName());
        accessibilityNodeInfo.setCheckable(c());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.p != i2) {
            this.p = i2;
            o();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.l
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.l
            if (r0 == 0) goto L_0x0034
            r5.e()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f13983h) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f13983h) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.a(z);
        }
    }

    public void setCheckableResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.c(i2);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        c cVar = this.f13981f;
        if (cVar == null) {
            this.k = z;
        } else if (cVar.Q()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.j) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.a(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.d(i2);
        }
    }

    public void setCheckedIconVisible(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.e(i2);
        }
    }

    public void setCheckedIconVisible(boolean z) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.b(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.c(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.f(i2);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.d(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.g(i2);
        }
    }

    public void setChipDrawable(c cVar) {
        c cVar2 = this.f13981f;
        if (cVar2 != cVar) {
            b(cVar2);
            this.f13981f = cVar;
            a(this.f13981f);
            a(this.q);
            m();
        }
    }

    public void setChipEndPadding(float f2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.e(f2);
        }
    }

    public void setChipEndPaddingResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.h(i2);
        }
    }

    public void setChipIcon(Drawable drawable) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.b(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.i(i2);
        }
    }

    public void setChipIconSize(float f2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.f(f2);
        }
    }

    public void setChipIconSizeResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.j(i2);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.d(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.k(i2);
        }
    }

    public void setChipIconVisible(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.l(i2);
        }
    }

    public void setChipIconVisible(boolean z) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.c(z);
        }
    }

    public void setChipMinHeight(float f2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.g(f2);
        }
    }

    public void setChipMinHeightResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.m(i2);
        }
    }

    public void setChipStartPadding(float f2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.h(f2);
        }
    }

    public void setChipStartPaddingResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.n(i2);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.e(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.o(i2);
        }
    }

    public void setChipStrokeWidth(float f2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.i(f2);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.p(i2);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.c(drawable);
        }
        l();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.a(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.j(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.q(i2);
        }
    }

    public void setCloseIconResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.r(i2);
        }
        l();
    }

    public void setCloseIconSize(float f2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.k(f2);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.s(i2);
        }
    }

    public void setCloseIconStartPadding(float f2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.l(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.t(i2);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.f(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.u(i2);
        }
    }

    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    public void setCloseIconVisible(boolean z) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.d(z);
        }
        l();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.a(f2);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f13981f != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                c cVar = this.f13981f;
                if (cVar != null) {
                    cVar.a(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.o = z;
        a(this.q);
    }

    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(c.b.b.c.a.h hVar) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.a(hVar);
        }
    }

    public void setHideMotionSpecResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.v(i2);
        }
    }

    public void setIconEndPadding(float f2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.m(f2);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.w(i2);
        }
    }

    public void setIconStartPadding(float f2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.n(f2);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.x(i2);
        }
    }

    public void setLayoutDirection(int i2) {
        if (this.f13981f != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i2);
        }
    }

    public void setLines(int i2) {
        if (i2 <= 1) {
            super.setLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i2) {
        if (i2 <= 1) {
            super.setMaxLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.y(i2);
        }
    }

    public void setMinLines(int i2) {
        if (i2 <= 1) {
            super.setMinLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.j = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.i = onClickListener;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.g(colorStateList);
        }
        if (!this.f13981f.P()) {
            n();
        }
    }

    public void setRippleColorResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.z(i2);
            if (!this.f13981f.P()) {
                n();
            }
        }
    }

    public void setShapeAppearanceModel(c.b.b.c.o.h hVar) {
        this.f13981f.a(hVar);
    }

    public void setShowMotionSpec(c.b.b.c.a.h hVar) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.b(hVar);
        }
    }

    public void setShowMotionSpecResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.A(i2);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.f13981f != null) {
            if (charSequence == null) {
                charSequence = BuildConfig.FLAVOR;
            }
            super.setText(this.f13981f.U() ? null : charSequence, bufferType);
            c cVar = this.f13981f;
            if (cVar != null) {
                cVar.b(charSequence);
            }
        }
    }

    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.B(i2);
        }
        p();
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.B(i2);
        }
        p();
    }

    public void setTextAppearance(f fVar) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.a(fVar);
        }
        p();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.o(f2);
        }
    }

    public void setTextEndPaddingResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.C(i2);
        }
    }

    public void setTextStartPadding(float f2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.p(f2);
        }
    }

    public void setTextStartPaddingResource(int i2) {
        c cVar = this.f13981f;
        if (cVar != null) {
            cVar.D(i2);
        }
    }
}
