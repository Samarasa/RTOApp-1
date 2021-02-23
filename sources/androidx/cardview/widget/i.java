package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

class i extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private float f762a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f763b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f764c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f765d;

    /* renamed from: e  reason: collision with root package name */
    private float f766e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f767f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f768g = true;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f769h;
    private PorterDuffColorFilter i;
    private ColorStateList j;
    private PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    i(ColorStateList colorStateList, float f2) {
        this.f762a = f2;
        this.f763b = new Paint(5);
        b(colorStateList);
        this.f764c = new RectF();
        this.f765d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f764c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f765d.set(rect);
        if (this.f767f) {
            float b2 = j.b(this.f766e, this.f762a, this.f768g);
            this.f765d.inset((int) Math.ceil((double) j.a(this.f766e, this.f762a, this.f768g)), (int) Math.ceil((double) b2));
            this.f764c.set(this.f765d);
        }
    }

    private void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f769h = colorStateList;
        this.f763b.setColor(this.f769h.getColorForState(getState(), this.f769h.getDefaultColor()));
    }

    public ColorStateList a() {
        return this.f769h;
    }

    /* access modifiers changed from: package-private */
    public void a(float f2) {
        if (f2 != this.f762a) {
            this.f762a = f2;
            a((Rect) null);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(float f2, boolean z, boolean z2) {
        if (f2 != this.f766e || this.f767f != z || this.f768g != z2) {
            this.f766e = f2;
            this.f767f = z;
            this.f768g = z2;
            a((Rect) null);
            invalidateSelf();
        }
    }

    public void a(ColorStateList colorStateList) {
        b(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public float b() {
        return this.f766e;
    }

    public float c() {
        return this.f762a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f763b;
        if (this.i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.i);
            z = true;
        }
        RectF rectF = this.f764c;
        float f2 = this.f762a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f765d, this.f762a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f769h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f769h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.cardview.widget.i.isStateful():boolean");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f769h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f763b.getColor();
        if (z) {
            this.f763b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.k) == null) {
            return z;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i2) {
        this.f763b.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f763b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.i = a(this.j, this.k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.i = a(this.j, this.k);
        invalidateSelf();
    }
}
