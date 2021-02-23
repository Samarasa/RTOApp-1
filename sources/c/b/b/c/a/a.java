package c.b.b.c.a;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import b.k.a.a.b;
import b.k.a.a.c;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeInterpolator f4749a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final TimeInterpolator f4750b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final TimeInterpolator f4751c = new b.k.a.a.a();

    /* renamed from: d  reason: collision with root package name */
    public static final TimeInterpolator f4752d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final TimeInterpolator f4753e = new DecelerateInterpolator();

    public static float a(float f2, float f3, float f4) {
        return f2 + (f4 * (f3 - f2));
    }
}
