package c.b.d;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import c.b.d.g.g;
import com.google.android.gms.common.api.internal.C0523c;
import com.google.android.gms.common.internal.C0562s;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.m;
import com.google.android.gms.common.util.o;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.h;
import com.google.firebase.components.j;
import com.google.firebase.components.n;
import com.google.firebase.components.v;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Object f4935a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Executor f4936b = new c();

    /* renamed from: c  reason: collision with root package name */
    static final Map<String, e> f4937c = new b.e.b();

    /* renamed from: d  reason: collision with root package name */
    private final Context f4938d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4939e;

    /* renamed from: f  reason: collision with root package name */
    private final i f4940f;

    /* renamed from: g  reason: collision with root package name */
    private final n f4941g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final AtomicBoolean f4942h = new AtomicBoolean(false);
    private final AtomicBoolean i = new AtomicBoolean();
    private final v<c.b.d.f.a> j;
    private final List<a> k = new CopyOnWriteArrayList();
    private final List<Object> l = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z);
    }

    @TargetApi(14)
    private static class b implements C0523c.a {

        /* renamed from: a  reason: collision with root package name */
        private static AtomicReference<b> f4943a = new AtomicReference<>();

        private b() {
        }

        /* access modifiers changed from: private */
        public static void b(Context context) {
            if (m.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f4943a.get() == null) {
                    b bVar = new b();
                    if (f4943a.compareAndSet((Object) null, bVar)) {
                        C0523c.a(application);
                        C0523c.a().a((C0523c.a) bVar);
                    }
                }
            }
        }

        public void a(boolean z) {
            synchronized (e.f4935a) {
                Iterator it = new ArrayList(e.f4937c.values()).iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (eVar.f4942h.get()) {
                        eVar.a(z);
                    }
                }
            }
        }
    }

    private static class c implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private static final Handler f4944a = new Handler(Looper.getMainLooper());

        private c() {
        }

        public void execute(Runnable runnable) {
            f4944a.post(runnable);
        }
    }

    @TargetApi(24)
    private static class d extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private static AtomicReference<d> f4945a = new AtomicReference<>();

        /* renamed from: b  reason: collision with root package name */
        private final Context f4946b;

        public d(Context context) {
            this.f4946b = context;
        }

        /* access modifiers changed from: private */
        public static void b(Context context) {
            if (f4945a.get() == null) {
                d dVar = new d(context);
                if (f4945a.compareAndSet((Object) null, dVar)) {
                    context.registerReceiver(dVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void a() {
            this.f4946b.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (e.f4935a) {
                for (e a2 : e.f4937c.values()) {
                    a2.k();
                }
            }
            a();
        }
    }

    protected e(Context context, String str, i iVar) {
        C0563t.a(context);
        this.f4938d = context;
        C0563t.b(str);
        this.f4939e = str;
        C0563t.a(iVar);
        this.f4940f = iVar;
        List<j> a2 = h.a(context, ComponentDiscoveryService.class).a();
        String a3 = c.b.d.g.e.a();
        Executor executor = f4936b;
        com.google.firebase.components.e[] eVarArr = new com.google.firebase.components.e[8];
        eVarArr[0] = com.google.firebase.components.e.a(context, Context.class, new Class[0]);
        eVarArr[1] = com.google.firebase.components.e.a(this, e.class, new Class[0]);
        eVarArr[2] = com.google.firebase.components.e.a(iVar, i.class, new Class[0]);
        eVarArr[3] = g.a("fire-android", BuildConfig.FLAVOR);
        eVarArr[4] = g.a("fire-core", "19.3.0");
        eVarArr[5] = a3 != null ? g.a("kotlin", a3) : null;
        eVarArr[6] = c.b.d.g.c.b();
        eVarArr[7] = c.b.d.d.b.a();
        this.f4941g = new n(executor, a2, eVarArr);
        this.j = new v<>(c.a(this, context));
    }

    public static e a(Context context) {
        synchronized (f4935a) {
            if (f4937c.containsKey("[DEFAULT]")) {
                e c2 = c();
                return c2;
            }
            i a2 = i.a(context);
            if (a2 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            e a3 = a(context, a2);
            return a3;
        }
    }

    public static e a(Context context, i iVar) {
        return a(context, iVar, "[DEFAULT]");
    }

    public static e a(Context context, i iVar, String str) {
        e eVar;
        b.b(context);
        String b2 = b(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f4935a) {
            boolean z = !f4937c.containsKey(b2);
            C0563t.b(z, "FirebaseApp name " + b2 + " already exists!");
            C0563t.a(context, (Object) "Application context cannot be null.");
            eVar = new e(context, b2, iVar);
            f4937c.put(b2, eVar);
        }
        eVar.k();
        return eVar;
    }

    public static e a(String str) {
        e eVar;
        String str2;
        synchronized (f4935a) {
            eVar = f4937c.get(b(str));
            if (eVar == null) {
                List<String> j2 = j();
                if (j2.isEmpty()) {
                    str2 = BuildConfig.FLAVOR;
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", j2);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", new Object[]{str, str2}));
            }
        }
        return eVar;
    }

    static /* synthetic */ c.b.d.f.a a(e eVar, Context context) {
        return new c.b.d.f.a(context, eVar.f(), (c.b.d.c.c) eVar.f4941g.a(c.b.d.c.c.class));
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (a a2 : this.k) {
            a2.a(z);
        }
    }

    private static String b(String str) {
        return str.trim();
    }

    public static e c() {
        e eVar;
        synchronized (f4935a) {
            eVar = f4937c.get("[DEFAULT]");
            if (eVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + o.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return eVar;
    }

    private void i() {
        C0563t.b(!this.i.get(), "FirebaseApp was deleted");
    }

    private static List<String> j() {
        ArrayList arrayList = new ArrayList();
        synchronized (f4935a) {
            for (e d2 : f4937c.values()) {
                arrayList.add(d2.d());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* access modifiers changed from: private */
    public void k() {
        if (!b.h.f.b.a(this.f4938d)) {
            d.b(this.f4938d);
        } else {
            this.f4941g.a(h());
        }
    }

    public <T> T a(Class<T> cls) {
        i();
        return this.f4941g.a((Class) cls);
    }

    public Context b() {
        i();
        return this.f4938d;
    }

    public String d() {
        i();
        return this.f4939e;
    }

    public i e() {
        i();
        return this.f4940f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f4939e.equals(((e) obj).d());
    }

    public String f() {
        return com.google.android.gms.common.util.c.c(d().getBytes(Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.c.c(e().b().getBytes(Charset.defaultCharset()));
    }

    public boolean g() {
        i();
        return this.j.get().a();
    }

    public boolean h() {
        return "[DEFAULT]".equals(d());
    }

    public int hashCode() {
        return this.f4939e.hashCode();
    }

    public String toString() {
        C0562s.a a2 = C0562s.a((Object) this);
        a2.a("name", this.f4939e);
        a2.a("options", this.f4940f);
        return a2.toString();
    }
}
