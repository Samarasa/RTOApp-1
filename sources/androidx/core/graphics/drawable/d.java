package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

class d extends Drawable implements Drawable.Callback, c, b {

    /* renamed from: a  reason: collision with root package name */
    static final PorterDuff.Mode f935a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    private int f936b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f937c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f938d;

    /* renamed from: e  reason: collision with root package name */
    f f939e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f940f;

    /* renamed from: g  reason: collision with root package name */
    Drawable f941g;

    d(Drawable drawable) {
        this.f939e = c();
        a(drawable);
    }

    d(f fVar, Resources resources) {
        this.f939e = fVar;
        a(resources);
    }

    private void a(Resources resources) {
        Drawable.ConstantState constantState;
        f fVar = this.f939e;
        if (fVar != null && (constantState = fVar.f944b) != null) {
            a(constantState.newDrawable(resources));
        }
    }

    private boolean a(int[] iArr) {
        if (!b()) {
            return false;
        }
        f fVar = this.f939e;
        ColorStateList colorStateList = fVar.f945c;
        PorterDuff.Mode mode = fVar.f946d;
        if (colorStateList == null || mode == null) {
            this.f938d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f938d && colorForState == this.f936b && mode == this.f937c)) {
                setColorFilter(colorForState, mode);
                this.f936b = colorForState;
                this.f937c = mode;
                this.f938d = true;
                return true;
            }
        }
        return false;
    }

    private f c() {
        return new f(this.f939e);
    }

    public final Drawable a() {
        return this.f941g;
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f941g;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f941g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.f939e;
            if (fVar != null) {
                fVar.f944b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f941g.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.f939e;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f941g.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        f fVar = this.f939e;
        if (fVar == null || !fVar.a()) {
            return null;
        }
        this.f939e.f943a = getChangingConfigurations();
        return this.f939e;
    }

    public Drawable getCurrent() {
        return this.f941g.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f941g.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f941g.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f941g.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f941g.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f941g.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f941g.getPadding(rect);
    }

    public int[] getState() {
        return this.f941g.getState();
    }

    public Region getTransparentRegion() {
        return this.f941g.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f941g.isAutoMirrored();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f939e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.b()
            if (r0 == 0) goto L_0x000d
            androidx.core.graphics.drawable.f r0 = r1.f939e
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f945c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f941g
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.d.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f941g.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f940f && super.mutate() == this) {
            this.f939e = c();
            Drawable drawable = this.f941g;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.f939e;
            if (fVar != null) {
                Drawable drawable2 = this.f941g;
                fVar.f944b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f940f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f941g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f941g.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f941g.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f941g.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f941g.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f941g.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f941g.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f941g.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return a(iArr) || this.f941g.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f939e.f945c = colorStateList;
        a(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f939e.f946d = mode;
        a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f941g.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
