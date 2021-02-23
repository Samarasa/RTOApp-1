package b.a.b.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;

public class e extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f2081a;

    public e(Drawable drawable) {
        a(drawable);
    }

    public Drawable a() {
        return this.f2081a;
    }

    public void a(Drawable drawable) {
        Drawable drawable2 = this.f2081a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f2081a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f2081a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f2081a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f2081a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f2081a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2081a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f2081a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f2081a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f2081a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f2081a.getPadding(rect);
    }

    public int[] getState() {
        return this.f2081a.getState();
    }

    public Region getTransparentRegion() {
        return this.f2081a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.f(this.f2081a);
    }

    public boolean isStateful() {
        return this.f2081a.isStateful();
    }

    public void jumpToCurrentState() {
        a.g(this.f2081a);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f2081a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f2081a.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f2081a.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        a.a(this.f2081a, z);
    }

    public void setChangingConfigurations(int i) {
        this.f2081a.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2081a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f2081a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f2081a.setFilterBitmap(z);
    }

    public void setHotspot(float f2, float f3) {
        a.a(this.f2081a, f2, f3);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        a.a(this.f2081a, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f2081a.setState(iArr);
    }

    public void setTint(int i) {
        a.b(this.f2081a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        a.a(this.f2081a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        a.a(this.f2081a, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2081a.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
