package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.app.d  reason: case insensitive filesystem */
class C0097d {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f201a = {16843531};

    /* renamed from: androidx.appcompat.app.d$a */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        public Method f202a;

        /* renamed from: b  reason: collision with root package name */
        public Method f203b;

        /* renamed from: c  reason: collision with root package name */
        public ImageView f204c;

        a(Activity activity) {
            try {
                this.f202a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[]{Drawable.class});
                this.f203b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[]{Integer.TYPE});
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(16908332);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        View childAt2 = childAt.getId() != 16908332 ? childAt : viewGroup.getChildAt(1);
                        if (childAt2 instanceof ImageView) {
                            this.f204c = (ImageView) childAt2;
                        }
                    }
                }
            }
        }
    }

    public static Drawable a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f201a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public static a a(Activity activity, Drawable drawable, int i) {
        a aVar = new a(activity);
        if (aVar.f202a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f202a.invoke(actionBar, new Object[]{drawable});
                aVar.f203b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
            } catch (Exception e2) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator via JB-MR2 API", e2);
            }
        } else {
            ImageView imageView = aVar.f204c;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            } else {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator");
            }
        }
        return aVar;
    }

    public static a a(a aVar, Activity activity, int i) {
        if (aVar == null) {
            aVar = new a(activity);
        }
        if (aVar.f202a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f203b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
                if (Build.VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Exception e2) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set content description via JB-MR2 API", e2);
            }
        }
        return aVar;
    }
}
