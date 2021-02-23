package c.b.b.c.a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private long f4764a = 0;

    /* renamed from: b  reason: collision with root package name */
    private long f4765b = 300;

    /* renamed from: c  reason: collision with root package name */
    private TimeInterpolator f4766c = null;

    /* renamed from: d  reason: collision with root package name */
    private int f4767d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f4768e = 1;

    public i(long j, long j2) {
        this.f4764a = j;
        this.f4765b = j2;
    }

    public i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f4764a = j;
        this.f4765b = j2;
        this.f4766c = timeInterpolator;
    }

    static i a(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), b(valueAnimator));
        iVar.f4767d = valueAnimator.getRepeatCount();
        iVar.f4768e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f4750b : interpolator instanceof AccelerateInterpolator ? a.f4751c : interpolator instanceof DecelerateInterpolator ? a.f4752d : interpolator;
    }

    public long a() {
        return this.f4764a;
    }

    public void a(Animator animator) {
        animator.setStartDelay(a());
        animator.setDuration(b());
        animator.setInterpolator(c());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(d());
            valueAnimator.setRepeatMode(e());
        }
    }

    public long b() {
        return this.f4765b;
    }

    public TimeInterpolator c() {
        TimeInterpolator timeInterpolator = this.f4766c;
        return timeInterpolator != null ? timeInterpolator : a.f4750b;
    }

    public int d() {
        return this.f4767d;
    }

    public int e() {
        return this.f4768e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (a() == iVar.a() && b() == iVar.b() && d() == iVar.d() && e() == iVar.e()) {
            return c().getClass().equals(iVar.c().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (a() ^ (a() >>> 32))) * 31) + ((int) (b() ^ (b() >>> 32)))) * 31) + c().getClass().hashCode()) * 31) + d()) * 31) + e();
    }

    public String toString() {
        return 10 + i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + a() + " duration: " + b() + " interpolator: " + c().getClass() + " repeatCount: " + d() + " repeatMode: " + e() + "}\n";
    }
}
