package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

public class Na extends Resources {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f508a = false;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f509b;

    public Na(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f509b = new WeakReference<>(context);
    }

    public static boolean a() {
        return f508a;
    }

    public static boolean b() {
        return a() && Build.VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: package-private */
    public final Drawable a(int i) {
        return super.getDrawable(i);
    }

    public Drawable getDrawable(int i) {
        Context context = (Context) this.f509b.get();
        return context != null ? C0117da.a().a(context, this, i) : super.getDrawable(i);
    }
}
