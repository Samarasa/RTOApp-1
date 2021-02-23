package b.r.a.a;

import android.graphics.drawable.Drawable;

class c implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f2815a;

    c(d dVar) {
        this.f2815a = dVar;
    }

    public void invalidateDrawable(Drawable drawable) {
        this.f2815a.invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f2815a.scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f2815a.unscheduleSelf(runnable);
    }
}
