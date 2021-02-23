package b.a.d;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import b.a.i;

public class d extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private int f2093a;

    /* renamed from: b  reason: collision with root package name */
    private Resources.Theme f2094b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f2095c;

    /* renamed from: d  reason: collision with root package name */
    private Configuration f2096d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f2097e;

    public d() {
        super((Context) null);
    }

    public d(Context context, int i) {
        super(context);
        this.f2093a = i;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f2094b = theme;
    }

    private Resources b() {
        Resources resources;
        if (this.f2097e == null) {
            Configuration configuration = this.f2096d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            }
            this.f2097e = resources;
        }
        return this.f2097e;
    }

    private void c() {
        boolean z = this.f2094b == null;
        if (z) {
            this.f2094b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2094b.setTo(theme);
            }
        }
        a(this.f2094b, this.f2093a, z);
    }

    public int a() {
        return this.f2093a;
    }

    /* access modifiers changed from: protected */
    public void a(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2095c == null) {
            this.f2095c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2095c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2094b;
        if (theme != null) {
            return theme;
        }
        if (this.f2093a == 0) {
            this.f2093a = i.Theme_AppCompat_Light;
        }
        c();
        return this.f2094b;
    }

    public void setTheme(int i) {
        if (this.f2093a != i) {
            this.f2093a = i;
            c();
        }
    }
}
