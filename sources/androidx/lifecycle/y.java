package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.g;
import androidx.lifecycle.z;

public class y implements k {

    /* renamed from: a  reason: collision with root package name */
    private static final y f1249a = new y();

    /* renamed from: b  reason: collision with root package name */
    private int f1250b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f1251c = 0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1252d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1253e = true;

    /* renamed from: f  reason: collision with root package name */
    private Handler f1254f;

    /* renamed from: g  reason: collision with root package name */
    private final m f1255g = new m(this);

    /* renamed from: h  reason: collision with root package name */
    private Runnable f1256h = new v(this);
    z.a i = new w(this);

    private y() {
    }

    static void b(Context context) {
        f1249a.a(context);
    }

    public static k g() {
        return f1249a;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f1251c--;
        if (this.f1251c == 0) {
            this.f1254f.postDelayed(this.f1256h, 700);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Context context) {
        this.f1254f = new Handler();
        this.f1255g.b(g.a.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new x(this));
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f1251c++;
        if (this.f1251c != 1) {
            return;
        }
        if (this.f1252d) {
            this.f1255g.b(g.a.ON_RESUME);
            this.f1252d = false;
            return;
        }
        this.f1254f.removeCallbacks(this.f1256h);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f1250b++;
        if (this.f1250b == 1 && this.f1253e) {
            this.f1255g.b(g.a.ON_START);
            this.f1253e = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.f1250b--;
        f();
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (this.f1251c == 0) {
            this.f1252d = true;
            this.f1255g.b(g.a.ON_PAUSE);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (this.f1250b == 0 && this.f1252d) {
            this.f1255g.b(g.a.ON_STOP);
            this.f1253e = true;
        }
    }

    public g getLifecycle() {
        return this.f1255g;
    }
}
