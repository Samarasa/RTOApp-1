package c.a.a.d;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.C;
import androidx.fragment.app.C0158h;
import androidx.fragment.app.C0159i;
import androidx.fragment.app.C0164n;
import b.e.b;
import c.a.a.c;
import c.a.a.i.k;
import java.util.HashMap;
import java.util.Map;

public class n implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private static final a f3525a = new m();

    /* renamed from: b  reason: collision with root package name */
    private volatile c.a.a.n f3526b;

    /* renamed from: c  reason: collision with root package name */
    final Map<FragmentManager, l> f3527c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    final Map<C0164n, q> f3528d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Handler f3529e;

    /* renamed from: f  reason: collision with root package name */
    private final a f3530f;

    /* renamed from: g  reason: collision with root package name */
    private final b<View, C0158h> f3531g = new b<>();

    /* renamed from: h  reason: collision with root package name */
    private final b<View, Fragment> f3532h = new b<>();
    private final Bundle i = new Bundle();

    public interface a {
        c.a.a.n a(c cVar, i iVar, o oVar, Context context);
    }

    public n(a aVar) {
        this.f3530f = aVar == null ? f3525a : aVar;
        this.f3529e = new Handler(Looper.getMainLooper(), this);
    }

    private l a(FragmentManager fragmentManager, Fragment fragment, boolean z) {
        l lVar = (l) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (lVar == null && (lVar = this.f3527c.get(fragmentManager)) == null) {
            lVar = new l();
            lVar.a(fragment);
            if (z) {
                lVar.a().b();
            }
            this.f3527c.put(fragmentManager, lVar);
            fragmentManager.beginTransaction().add(lVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f3529e.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return lVar;
    }

    private q a(C0164n nVar, C0158h hVar, boolean z) {
        q qVar = (q) nVar.a("com.bumptech.glide.manager");
        if (qVar == null && (qVar = this.f3528d.get(nVar)) == null) {
            qVar = new q();
            qVar.b(hVar);
            if (z) {
                qVar.fa().b();
            }
            this.f3528d.put(nVar, qVar);
            C a2 = nVar.a();
            a2.a(qVar, "com.bumptech.glide.manager");
            a2.b();
            this.f3529e.obtainMessage(2, nVar).sendToTarget();
        }
        return qVar;
    }

    @Deprecated
    private c.a.a.n a(Context context, FragmentManager fragmentManager, Fragment fragment, boolean z) {
        l a2 = a(fragmentManager, fragment, z);
        c.a.a.n b2 = a2.b();
        if (b2 != null) {
            return b2;
        }
        c.a.a.n a3 = this.f3530f.a(c.a(context), a2.a(), a2.c(), context);
        a2.a(a3);
        return a3;
    }

    private c.a.a.n a(Context context, C0164n nVar, C0158h hVar, boolean z) {
        q a2 = a(nVar, hVar, z);
        c.a.a.n ga = a2.ga();
        if (ga != null) {
            return ga;
        }
        c.a.a.n a3 = this.f3530f.a(c.a(context), a2.fa(), a2.ha(), context);
        a2.a(a3);
        return a3;
    }

    private c.a.a.n b(Context context) {
        if (this.f3526b == null) {
            synchronized (this) {
                if (this.f3526b == null) {
                    this.f3526b = this.f3530f.a(c.a(context.getApplicationContext()), new b(), new h(), context.getApplicationContext());
                }
            }
        }
        return this.f3526b;
    }

    @TargetApi(17)
    private static void c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static boolean d(Activity activity) {
        return !activity.isFinishing();
    }

    public c.a.a.n a(Activity activity) {
        if (k.b()) {
            return a(activity.getApplicationContext());
        }
        c(activity);
        return a((Context) activity, activity.getFragmentManager(), (Fragment) null, d(activity));
    }

    public c.a.a.n a(Context context) {
        if (context != null) {
            if (k.c() && !(context instanceof Application)) {
                if (context instanceof C0159i) {
                    return a((C0159i) context);
                }
                if (context instanceof Activity) {
                    return a((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    return a(((ContextWrapper) context).getBaseContext());
                }
            }
            return b(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public c.a.a.n a(C0159i iVar) {
        if (k.b()) {
            return a(iVar.getApplicationContext());
        }
        c(iVar);
        return a((Context) iVar, iVar.getSupportFragmentManager(), (C0158h) null, d(iVar));
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public l b(Activity activity) {
        return a(activity.getFragmentManager(), (Fragment) null, d(activity));
    }

    /* access modifiers changed from: package-private */
    public q b(C0159i iVar) {
        return a(iVar.getSupportFragmentManager(), (C0158h) null, d(iVar));
    }

    public boolean handleMessage(Message message) {
        Object obj;
        Map map;
        int i2 = message.what;
        Object obj2 = null;
        boolean z = true;
        if (i2 == 1) {
            obj2 = (FragmentManager) message.obj;
            map = this.f3527c;
        } else if (i2 != 2) {
            z = false;
            obj = null;
            if (z && obj == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
            }
            return z;
        } else {
            obj2 = (C0164n) message.obj;
            map = this.f3528d;
        }
        obj = map.remove(obj2);
        Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        return z;
    }
}
