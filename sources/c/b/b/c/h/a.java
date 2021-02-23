package c.b.b.c.h;

import android.content.Context;
import c.b.b.c.l.b;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f4787a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4788b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4789c;

    /* renamed from: d  reason: collision with root package name */
    private final float f4790d;

    public a(Context context) {
        this.f4787a = b.a(context, c.b.b.c.b.elevationOverlaysEnabled, false);
        this.f4788b = c.b.b.c.f.a.a(context, c.b.b.c.b.elevationOverlaysColor, 0);
        this.f4789c = c.b.b.c.f.a.a(context, c.b.b.c.b.colorSurface, 0);
        this.f4790d = context.getResources().getDisplayMetrics().density;
    }

    private boolean a(int i) {
        return b.h.b.a.b(i, 255) == this.f4789c;
    }

    public float a(float f2) {
        float f3 = this.f4790d;
        if (f3 <= 0.0f || f2 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f2 / f3))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int a(int i, float f2) {
        return c.b.b.c.f.a.a(i, this.f4788b, a(f2));
    }

    public int b(int i, float f2) {
        return (!this.f4787a || !a(i)) ? i : a(i, f2);
    }
}
