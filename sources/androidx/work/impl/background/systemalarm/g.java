package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.h;
import androidx.work.impl.m;
import androidx.work.impl.utils.k;
import java.util.ArrayList;
import java.util.List;

public class g implements androidx.work.impl.a {

    /* renamed from: a  reason: collision with root package name */
    static final String f1816a = h.a("SystemAlarmDispatcher");

    /* renamed from: b  reason: collision with root package name */
    final Context f1817b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.work.impl.utils.b.a f1818c;

    /* renamed from: d  reason: collision with root package name */
    private final j f1819d;

    /* renamed from: e  reason: collision with root package name */
    private final androidx.work.impl.c f1820e;

    /* renamed from: f  reason: collision with root package name */
    private final m f1821f;

    /* renamed from: g  reason: collision with root package name */
    final b f1822g;

    /* renamed from: h  reason: collision with root package name */
    private final Handler f1823h;
    final List<Intent> i;
    Intent j;
    private b k;

    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final g f1824a;

        /* renamed from: b  reason: collision with root package name */
        private final Intent f1825b;

        /* renamed from: c  reason: collision with root package name */
        private final int f1826c;

        a(g gVar, Intent intent, int i) {
            this.f1824a = gVar;
            this.f1825b = intent;
            this.f1826c = i;
        }

        public void run() {
            this.f1824a.a(this.f1825b, this.f1826c);
        }
    }

    interface b {
        void a();
    }

    static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final g f1827a;

        c(g gVar) {
            this.f1827a = gVar;
        }

        public void run() {
            this.f1827a.a();
        }
    }

    g(Context context) {
        this(context, (androidx.work.impl.c) null, (m) null);
    }

    g(Context context, androidx.work.impl.c cVar, m mVar) {
        this.f1817b = context.getApplicationContext();
        this.f1822g = new b(this.f1817b);
        this.f1819d = new j();
        this.f1821f = mVar == null ? m.a(context) : mVar;
        this.f1820e = cVar == null ? this.f1821f.e() : cVar;
        this.f1818c = this.f1821f.h();
        this.f1820e.a((androidx.work.impl.a) this);
        this.i = new ArrayList();
        this.j = null;
        this.f1823h = new Handler(Looper.getMainLooper());
    }

    private boolean a(String str) {
        g();
        synchronized (this.i) {
            for (Intent action : this.i) {
                if (str.equals(action.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void g() {
        if (this.f1823h.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private void h() {
        g();
        PowerManager.WakeLock a2 = k.a(this.f1817b, "ProcessCommand");
        try {
            a2.acquire();
            this.f1821f.h().a(new f(this));
        } finally {
            a2.release();
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        h.a().a(f1816a, "Checking if commands are complete.", new Throwable[0]);
        g();
        synchronized (this.i) {
            if (this.j != null) {
                h.a().a(f1816a, String.format("Removing command %s", new Object[]{this.j}), new Throwable[0]);
                if (this.i.remove(0).equals(this.j)) {
                    this.j = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            if (!this.f1822g.a() && this.i.isEmpty()) {
                h.a().a(f1816a, "No more commands & intents.", new Throwable[0]);
                if (this.k != null) {
                    this.k.a();
                }
            } else if (!this.i.isEmpty()) {
                h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar) {
        if (this.k != null) {
            h.a().b(f1816a, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.k = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Runnable runnable) {
        this.f1823h.post(runnable);
    }

    public void a(String str, boolean z) {
        a((Runnable) new a(this, b.a(this.f1817b, str, z), 0));
    }

    public boolean a(Intent intent, int i2) {
        boolean z = false;
        h.a().a(f1816a, String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i2)}), new Throwable[0]);
        g();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            h.a().e(f1816a, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && a("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i2);
            synchronized (this.i) {
                if (!this.i.isEmpty()) {
                    z = true;
                }
                this.i.add(intent);
                if (!z) {
                    h();
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public androidx.work.impl.c b() {
        return this.f1820e;
    }

    /* access modifiers changed from: package-private */
    public androidx.work.impl.utils.b.a c() {
        return this.f1818c;
    }

    /* access modifiers changed from: package-private */
    public m d() {
        return this.f1821f;
    }

    /* access modifiers changed from: package-private */
    public j e() {
        return this.f1819d;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        h.a().a(f1816a, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f1820e.b((androidx.work.impl.a) this);
        this.f1819d.a();
        this.k = null;
    }
}
