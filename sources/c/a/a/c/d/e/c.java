package c.a.a.c.d.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import c.a.a.c.d.e.g;
import c.a.a.c.n;
import c.a.a.i.i;
import java.nio.ByteBuffer;

public class c extends Drawable implements g.b, Animatable {

    /* renamed from: a  reason: collision with root package name */
    private final a f3445a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3446b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3447c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3448d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3449e;

    /* renamed from: f  reason: collision with root package name */
    private int f3450f;

    /* renamed from: g  reason: collision with root package name */
    private int f3451g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3452h;
    private Paint i;
    private Rect j;

    static final class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        final g f3453a;

        a(g gVar) {
            this.f3453a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return new c(this);
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public c(Context context, c.a.a.b.a aVar, n<Bitmap> nVar, int i2, int i3, Bitmap bitmap) {
        this(new a(new g(c.a.a.c.a(context), aVar, i2, i3, nVar, bitmap)));
    }

    c(a aVar) {
        this.f3449e = true;
        this.f3451g = -1;
        i.a(aVar);
        this.f3445a = aVar;
    }

    private Drawable.Callback h() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect i() {
        if (this.j == null) {
            this.j = new Rect();
        }
        return this.j;
    }

    private Paint j() {
        if (this.i == null) {
            this.i = new Paint(2);
        }
        return this.i;
    }

    private void k() {
        this.f3450f = 0;
    }

    private void l() {
        i.a(!this.f3448d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f3445a.f3453a.f() != 1) {
            if (!this.f3446b) {
                this.f3446b = true;
                this.f3445a.f3453a.a((g.b) this);
            } else {
                return;
            }
        }
        invalidateSelf();
    }

    private void m() {
        this.f3446b = false;
        this.f3445a.f3453a.b(this);
    }

    public void a() {
        if (h() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (e() == d() - 1) {
            this.f3450f++;
        }
        int i2 = this.f3451g;
        if (i2 != -1 && this.f3450f >= i2) {
            stop();
        }
    }

    public void a(n<Bitmap> nVar, Bitmap bitmap) {
        this.f3445a.f3453a.a(nVar, bitmap);
    }

    public ByteBuffer b() {
        return this.f3445a.f3453a.b();
    }

    public Bitmap c() {
        return this.f3445a.f3453a.e();
    }

    public int d() {
        return this.f3445a.f3453a.f();
    }

    public void draw(Canvas canvas) {
        if (!this.f3448d) {
            if (this.f3452h) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), i());
                this.f3452h = false;
            }
            canvas.drawBitmap(this.f3445a.f3453a.c(), (Rect) null, i(), j());
        }
    }

    public int e() {
        return this.f3445a.f3453a.d();
    }

    public int f() {
        return this.f3445a.f3453a.h();
    }

    public void g() {
        this.f3448d = true;
        this.f3445a.f3453a.a();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f3445a;
    }

    public int getIntrinsicHeight() {
        return this.f3445a.f3453a.g();
    }

    public int getIntrinsicWidth() {
        return this.f3445a.f3453a.i();
    }

    public int getOpacity() {
        return -2;
    }

    public boolean isRunning() {
        return this.f3446b;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3452h = true;
    }

    public void setAlpha(int i2) {
        j().setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        j().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        i.a(!this.f3448d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f3449e = z;
        if (!z) {
            m();
        } else if (this.f3447c) {
            l();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f3447c = true;
        k();
        if (this.f3449e) {
            l();
        }
    }

    public void stop() {
        this.f3447c = false;
        m();
    }
}
