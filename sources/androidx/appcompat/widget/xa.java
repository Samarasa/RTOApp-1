package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class xa extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f732a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static ArrayList<WeakReference<xa>> f733b;

    /* renamed from: c  reason: collision with root package name */
    private final Resources f734c;

    /* renamed from: d  reason: collision with root package name */
    private final Resources.Theme f735d;

    private xa(Context context) {
        super(context);
        if (Na.b()) {
            this.f734c = new Na(this, context.getResources());
            this.f735d = this.f734c.newTheme();
            this.f735d.setTo(context.getTheme());
            return;
        }
        this.f734c = new za(this, context.getResources());
        this.f735d = null;
    }

    public static Context a(Context context) {
        if (!b(context)) {
            return context;
        }
        synchronized (f732a) {
            if (f733b == null) {
                f733b = new ArrayList<>();
            } else {
                for (int size = f733b.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f733b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f733b.remove(size);
                    }
                }
                for (int size2 = f733b.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f733b.get(size2);
                    xa xaVar = weakReference2 != null ? (xa) weakReference2.get() : null;
                    if (xaVar != null && xaVar.getBaseContext() == context) {
                        return xaVar;
                    }
                }
            }
            xa xaVar2 = new xa(context);
            f733b.add(new WeakReference(xaVar2));
            return xaVar2;
        }
    }

    private static boolean b(Context context) {
        if ((context instanceof xa) || (context.getResources() instanceof za) || (context.getResources() instanceof Na)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || Na.b();
    }

    public AssetManager getAssets() {
        return this.f734c.getAssets();
    }

    public Resources getResources() {
        return this.f734c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f735d;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f735d;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
