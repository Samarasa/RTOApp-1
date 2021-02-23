package c.b.b.c.o;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.b;
import b.h.i.c;
import c.b.b.c.o.h;
import c.b.b.c.o.i;
import c.b.b.c.o.k;

public class e extends Drawable implements b, h.a {

    /* renamed from: a  reason: collision with root package name */
    private static final Paint f4832a = new Paint(1);

    /* renamed from: b  reason: collision with root package name */
    private a f4833b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final k.f[] f4834c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final k.f[] f4835d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f4836e;

    /* renamed from: f  reason: collision with root package name */
    private final Matrix f4837f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f4838g;

    /* renamed from: h  reason: collision with root package name */
    private final Path f4839h;
    private final RectF i;
    private final RectF j;
    private final Region k;
    private final Region l;
    private h m;
    private final Paint n;
    private final Paint o;
    private final c.b.b.c.n.a p;
    private final i.a q;
    private final i r;
    private PorterDuffColorFilter s;
    private PorterDuffColorFilter t;
    private Rect u;

    static final class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public h f4840a;

        /* renamed from: b  reason: collision with root package name */
        public c.b.b.c.h.a f4841b;

        /* renamed from: c  reason: collision with root package name */
        public ColorFilter f4842c;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f4843d = null;

        /* renamed from: e  reason: collision with root package name */
        public ColorStateList f4844e = null;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f4845f = null;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f4846g = null;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f4847h = PorterDuff.Mode.SRC_IN;
        public Rect i = null;
        public float j = 1.0f;
        public float k = 1.0f;
        public float l;
        public int m = 255;
        public float n = 0.0f;
        public float o = 0.0f;
        public int p = 0;
        public int q = 0;
        public int r = 0;
        public int s = 0;
        public boolean t = false;
        public Paint.Style u = Paint.Style.FILL_AND_STROKE;

        public a(a aVar) {
            this.f4840a = aVar.f4840a;
            this.f4841b = aVar.f4841b;
            this.l = aVar.l;
            this.f4842c = aVar.f4842c;
            this.f4843d = aVar.f4843d;
            this.f4844e = aVar.f4844e;
            this.f4847h = aVar.f4847h;
            this.f4846g = aVar.f4846g;
            this.m = aVar.m;
            this.j = aVar.j;
            this.r = aVar.r;
            this.p = aVar.p;
            this.t = aVar.t;
            this.k = aVar.k;
            this.n = aVar.n;
            this.o = aVar.o;
            this.q = aVar.q;
            this.s = aVar.s;
            this.f4845f = aVar.f4845f;
            this.u = aVar.u;
            Rect rect = aVar.i;
            if (rect != null) {
                this.i = new Rect(rect);
            }
        }

        public a(h hVar, c.b.b.c.h.a aVar) {
            this.f4840a = hVar;
            this.f4841b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            e eVar = new e(this, (d) null);
            boolean unused = eVar.f4836e = true;
            return eVar;
        }
    }

    public e() {
        this(new h());
    }

    public e(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(new h(context, attributeSet, i2, i3));
    }

    private e(a aVar) {
        this.f4834c = new k.f[4];
        this.f4835d = new k.f[4];
        this.f4837f = new Matrix();
        this.f4838g = new Path();
        this.f4839h = new Path();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new Region();
        this.l = new Region();
        this.n = new Paint(1);
        this.o = new Paint(1);
        this.p = new c.b.b.c.n.a();
        this.r = new i();
        this.f4833b = aVar;
        this.o.setStyle(Paint.Style.STROKE);
        this.n.setStyle(Paint.Style.FILL);
        f4832a.setColor(-1);
        f4832a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        t();
        a(getState());
        this.q = new d(this);
        aVar.f4840a.a((h.a) this);
    }

    /* synthetic */ e(a aVar, d dVar) {
        this(aVar);
    }

    public e(h hVar) {
        this(new a(hVar, (c.b.b.c.h.a) null));
    }

    private static int a(int i2, int i3) {
        return (i2 * (i3 + (i3 >>> 7))) >>> 8;
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? a(paint, z) : a(colorStateList, mode, z);
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = c(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r2 = r2.getColor();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.PorterDuffColorFilter a(android.graphics.Paint r2, boolean r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0014
            int r2 = r2.getColor()
            int r3 = r1.c((int) r2)
            if (r3 == r2) goto L_0x0014
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r0)
            return r2
        L_0x0014:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.c.o.e.a(android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    private void a(Canvas canvas) {
        if (this.f4833b.r != 0) {
            canvas.drawPath(this.f4838g, this.p.a());
        }
        for (int i2 = 0; i2 < 4; i2++) {
            this.f4834c[i2].a(this.p, this.f4833b.q, canvas);
            this.f4835d[i2].a(this.p, this.f4833b.q, canvas);
        }
        int e2 = e();
        int f2 = f();
        canvas.translate((float) (-e2), (float) (-f2));
        canvas.drawPath(this.f4838g, f4832a);
        canvas.translate((float) e2, (float) f2);
    }

    private void a(Canvas canvas, Paint paint, Path path, h hVar, RectF rectF) {
        if (hVar.i()) {
            float a2 = hVar.h().a();
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void a(RectF rectF, Path path) {
        b(rectF, path);
        if (this.f4833b.j != 1.0f) {
            this.f4837f.reset();
            Matrix matrix = this.f4837f;
            float f2 = this.f4833b.j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f4837f);
        }
    }

    private boolean a(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f4833b.f4843d == null || (color2 = this.n.getColor()) == (colorForState2 = this.f4833b.f4843d.getColorForState(iArr, color2))) {
            z = false;
        } else {
            this.n.setColor(colorForState2);
            z = true;
        }
        if (this.f4833b.f4844e == null || (color = this.o.getColor()) == (colorForState = this.f4833b.f4844e.getColorForState(iArr, color))) {
            return z;
        }
        this.o.setColor(colorForState);
        return true;
    }

    private void b(Canvas canvas) {
        a(canvas, this.n, this.f4838g, this.f4833b.f4840a, c());
    }

    private void b(RectF rectF, Path path) {
        i iVar = this.r;
        a aVar = this.f4833b;
        h hVar = aVar.f4840a;
        float f2 = aVar.k;
        iVar.a(hVar, f2, rectF, this.q, path);
    }

    private int c(int i2) {
        c.b.b.c.h.a aVar = this.f4833b.f4841b;
        return aVar != null ? aVar.b(i2, k()) : i2;
    }

    private void c(Canvas canvas) {
        a(canvas, this.o, this.f4839h, this.m, m());
    }

    private float d(float f2) {
        return Math.max(f2 - n(), 0.0f);
    }

    private void d(Canvas canvas) {
        int e2 = e();
        int f2 = f();
        if (Build.VERSION.SDK_INT < 21) {
            Rect clipBounds = canvas.getClipBounds();
            int i2 = this.f4833b.q;
            clipBounds.inset(-i2, -i2);
            clipBounds.offset(e2, f2);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate((float) e2, (float) f2);
    }

    private void l() {
        this.m = new h(h());
        this.m.a(d(this.m.g().f4830a), d(this.m.h().f4830a), d(this.m.c().f4830a), d(this.m.b().f4830a));
        this.r.a(this.m, this.f4833b.k, m(), this.f4839h);
    }

    private RectF m() {
        RectF c2 = c();
        float n2 = n();
        this.j.set(c2.left + n2, c2.top + n2, c2.right - n2, c2.bottom - n2);
        return this.j;
    }

    private float n() {
        if (q()) {
            return this.o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean o() {
        a aVar = this.f4833b;
        int i2 = aVar.p;
        return i2 != 1 && aVar.q > 0 && (i2 == 2 || s());
    }

    private boolean p() {
        Paint.Style style = this.f4833b.u;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean q() {
        Paint.Style style = this.f4833b.u;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.o.getStrokeWidth() > 0.0f;
    }

    private void r() {
        super.invalidateSelf();
    }

    private boolean s() {
        return Build.VERSION.SDK_INT < 21 || (!this.f4833b.f4840a.i() && !this.f4838g.isConvex());
    }

    private boolean t() {
        PorterDuffColorFilter porterDuffColorFilter = this.s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        a aVar = this.f4833b;
        this.s = a(aVar.f4846g, aVar.f4847h, this.n, true);
        a aVar2 = this.f4833b;
        this.t = a(aVar2.f4845f, aVar2.f4847h, this.o, false);
        a aVar3 = this.f4833b;
        if (aVar3.t) {
            this.p.a(aVar3.f4846g.getColorForState(getState(), 0));
        }
        return !c.a(porterDuffColorFilter, this.s) || !c.a(porterDuffColorFilter2, this.t);
    }

    private void u() {
        float k2 = k();
        this.f4833b.q = (int) Math.ceil((double) (0.75f * k2));
        this.f4833b.r = (int) Math.ceil((double) (k2 * 0.25f));
        t();
        r();
    }

    public void a(float f2) {
        a aVar = this.f4833b;
        if (aVar.n != f2) {
            aVar.n = f2;
            u();
        }
    }

    public void a(float f2, int i2) {
        c(f2);
        b(ColorStateList.valueOf(i2));
    }

    public void a(float f2, ColorStateList colorStateList) {
        c(f2);
        b(colorStateList);
    }

    public void a(int i2) {
        this.p.a(i2);
        this.f4833b.t = false;
        r();
    }

    public void a(Context context) {
        this.f4833b.f4841b = new c.b.b.c.h.a(context);
        u();
    }

    public void a(ColorStateList colorStateList) {
        a aVar = this.f4833b;
        if (aVar.f4843d != colorStateList) {
            aVar.f4843d = colorStateList;
            onStateChange(getState());
        }
    }

    /* access modifiers changed from: protected */
    public void a(Canvas canvas, Paint paint, Path path, RectF rectF) {
        a(canvas, paint, path, this.f4833b.f4840a, rectF);
    }

    @Deprecated
    public void a(Rect rect, Path path) {
        b(new RectF(rect), path);
    }

    public void a(h hVar) {
        this.f4833b.f4840a.b((h.a) this);
        this.f4833b.f4840a = hVar;
        hVar.a((h.a) this);
        invalidateSelf();
    }

    public void b() {
        invalidateSelf();
    }

    public void b(float f2) {
        a aVar = this.f4833b;
        if (aVar.k != f2) {
            aVar.k = f2;
            this.f4836e = true;
            invalidateSelf();
        }
    }

    public void b(int i2) {
        a aVar = this.f4833b;
        if (aVar.s != i2) {
            aVar.s = i2;
            r();
        }
    }

    public void b(ColorStateList colorStateList) {
        a aVar = this.f4833b;
        if (aVar.f4844e != colorStateList) {
            aVar.f4844e = colorStateList;
            onStateChange(getState());
        }
    }

    /* access modifiers changed from: protected */
    public RectF c() {
        Rect bounds = getBounds();
        this.i.set((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom);
        return this.i;
    }

    public void c(float f2) {
        this.f4833b.l = f2;
        invalidateSelf();
    }

    public float d() {
        return this.f4833b.n;
    }

    public void draw(Canvas canvas) {
        this.n.setColorFilter(this.s);
        int alpha = this.n.getAlpha();
        this.n.setAlpha(a(alpha, this.f4833b.m));
        this.o.setColorFilter(this.t);
        this.o.setStrokeWidth(this.f4833b.l);
        int alpha2 = this.o.getAlpha();
        this.o.setAlpha(a(alpha2, this.f4833b.m));
        if (this.f4836e) {
            l();
            a(c(), this.f4838g);
            this.f4836e = false;
        }
        if (o()) {
            canvas.save();
            d(canvas);
            Bitmap createBitmap = Bitmap.createBitmap(getBounds().width() + (this.f4833b.q * 2), getBounds().height() + (this.f4833b.q * 2), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f2 = (float) (getBounds().left - this.f4833b.q);
            float f3 = (float) (getBounds().top - this.f4833b.q);
            canvas2.translate(-f2, -f3);
            a(canvas2);
            canvas.drawBitmap(createBitmap, f2, f3, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
        if (p()) {
            b(canvas);
        }
        if (q()) {
            c(canvas);
        }
        this.n.setAlpha(alpha);
        this.o.setAlpha(alpha2);
    }

    public int e() {
        a aVar = this.f4833b;
        double d2 = (double) aVar.r;
        double sin = Math.sin(Math.toRadians((double) aVar.s));
        Double.isNaN(d2);
        return (int) (d2 * sin);
    }

    public int f() {
        a aVar = this.f4833b;
        double d2 = (double) aVar.r;
        double cos = Math.cos(Math.toRadians((double) aVar.s));
        Double.isNaN(d2);
        return (int) (d2 * cos);
    }

    public int g() {
        return this.f4833b.q;
    }

    public Drawable.ConstantState getConstantState() {
        return this.f4833b;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        a aVar = this.f4833b;
        if (aVar.p != 2) {
            if (aVar.f4840a.i()) {
                outline.setRoundRect(getBounds(), this.f4833b.f4840a.g().a());
                return;
            }
            a(c(), this.f4838g);
            if (this.f4838g.isConvex()) {
                outline.setConvexPath(this.f4838g);
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.u;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.k.set(getBounds());
        a(c(), this.f4838g);
        this.l.setPath(this.f4838g, this.k);
        this.k.op(this.l, Region.Op.DIFFERENCE);
        return this.k;
    }

    public h h() {
        return this.f4833b.f4840a;
    }

    public ColorStateList i() {
        return this.f4833b.f4846g;
    }

    public void invalidateSelf() {
        this.f4836e = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f4833b.f4844e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f4833b.f4843d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f4833b.f4846g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f4833b.f4845f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            c.b.b.c.o.e$a r0 = r1.f4833b
            android.content.res.ColorStateList r0 = r0.f4846g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            c.b.b.c.o.e$a r0 = r1.f4833b
            android.content.res.ColorStateList r0 = r0.f4845f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            c.b.b.c.o.e$a r0 = r1.f4833b
            android.content.res.ColorStateList r0 = r0.f4844e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            c.b.b.c.o.e$a r0 = r1.f4833b
            android.content.res.ColorStateList r0 = r0.f4843d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.c.o.e.isStateful():boolean");
    }

    public float j() {
        return this.f4833b.o;
    }

    public float k() {
        return d() + j();
    }

    public Drawable mutate() {
        this.f4833b = new a(this.f4833b);
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f4836e = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z = a(iArr) || t();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public void setAlpha(int i2) {
        a aVar = this.f4833b;
        if (aVar.m != i2) {
            aVar.m = i2;
            r();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4833b.f4842c = colorFilter;
        r();
    }

    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f4833b.f4846g = colorStateList;
        t();
        r();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        a aVar = this.f4833b;
        if (aVar.f4847h != mode) {
            aVar.f4847h = mode;
            t();
            r();
        }
    }
}
