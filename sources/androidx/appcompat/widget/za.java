package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

class za extends C0119ea {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f746b;

    public za(Context context, Resources resources) {
        super(resources);
        this.f746b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f746b.get();
        if (!(drawable == null || context == null)) {
            C0117da.a().a(context, i, drawable);
        }
        return drawable;
    }
}
