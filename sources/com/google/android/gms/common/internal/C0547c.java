package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import c.b.b.b.b.C0254b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C0554j;
import com.google.android.gms.common.internal.C0559o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.c  reason: case insensitive filesystem */
public abstract class C0547c<T extends IInterface> {

    /* renamed from: a  reason: collision with root package name */
    private static final c.b.b.b.b.d[] f5925a = new c.b.b.b.b.d[0];

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f5926b = {"service_esmobile", "service_googleme"};
    /* access modifiers changed from: private */
    public C0254b A;
    /* access modifiers changed from: private */
    public boolean B;
    private volatile E C;
    protected AtomicInteger D;

    /* renamed from: c  reason: collision with root package name */
    private int f5927c;

    /* renamed from: d  reason: collision with root package name */
    private long f5928d;

    /* renamed from: e  reason: collision with root package name */
    private long f5929e;

    /* renamed from: f  reason: collision with root package name */
    private int f5930f;

    /* renamed from: g  reason: collision with root package name */
    private long f5931g;

    /* renamed from: h  reason: collision with root package name */
    private volatile String f5932h;
    private M i;
    private final Context j;
    private final Looper k;
    private final C0554j l;
    private final c.b.b.b.b.f m;
    final Handler n;
    private final Object o;
    /* access modifiers changed from: private */
    public final Object p;
    /* access modifiers changed from: private */
    public C0561q q;
    protected C0077c r;
    private T s;
    /* access modifiers changed from: private */
    public final ArrayList<h<?>> t;
    private i u;
    private int v;
    /* access modifiers changed from: private */
    public final a w;
    /* access modifiers changed from: private */
    public final b x;
    private final int y;
    private final String z;

    /* renamed from: com.google.android.gms.common.internal.c$a */
    public interface a {
        void d(int i);

        void h(Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.internal.c$b */
    public interface b {
        void a(C0254b bVar);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c  reason: collision with other inner class name */
    public interface C0077c {
        void a(C0254b bVar);
    }

    /* renamed from: com.google.android.gms.common.internal.c$d */
    protected class d implements C0077c {
        public d() {
        }

        public void a(C0254b bVar) {
            if (bVar.k()) {
                C0547c cVar = C0547c.this;
                cVar.a((C0557m) null, cVar.s());
            } else if (C0547c.this.x != null) {
                C0547c.this.x.a(bVar);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$e */
    public interface e {
        void a();
    }

    /* renamed from: com.google.android.gms.common.internal.c$f */
    private abstract class f extends h<Boolean> {

        /* renamed from: d  reason: collision with root package name */
        private final int f5934d;

        /* renamed from: e  reason: collision with root package name */
        private final Bundle f5935e;

        protected f(int i, Bundle bundle) {
            super(true);
            this.f5934d = i;
            this.f5935e = bundle;
        }

        /* access modifiers changed from: protected */
        public final void a() {
        }

        /* access modifiers changed from: protected */
        public abstract void a(C0254b bVar);

        /* JADX WARNING: type inference failed for: r5v11, types: [android.os.Parcelable] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void a(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                r0 = 1
                r1 = 0
                if (r5 != 0) goto L_0x000c
                com.google.android.gms.common.internal.c r5 = com.google.android.gms.common.internal.C0547c.this
                r5.b(r0, null)
                return
            L_0x000c:
                int r5 = r4.f5934d
                if (r5 == 0) goto L_0x0061
                r2 = 10
                if (r5 == r2) goto L_0x0031
                com.google.android.gms.common.internal.c r5 = com.google.android.gms.common.internal.C0547c.this
                r5.b(r0, null)
                android.os.Bundle r5 = r4.f5935e
                if (r5 == 0) goto L_0x0026
                java.lang.String r0 = "pendingIntent"
                android.os.Parcelable r5 = r5.getParcelable(r0)
                r1 = r5
                android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            L_0x0026:
                c.b.b.b.b.b r5 = new c.b.b.b.b.b
                int r0 = r4.f5934d
                r5.<init>(r0, r1)
                r4.a((c.b.b.b.b.C0254b) r5)
                goto L_0x0076
            L_0x0031:
                com.google.android.gms.common.internal.c r5 = com.google.android.gms.common.internal.C0547c.this
                r5.b(r0, null)
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                java.lang.Class r3 = r4.getClass()
                java.lang.String r3 = r3.getSimpleName()
                r1[r2] = r3
                com.google.android.gms.common.internal.c r2 = com.google.android.gms.common.internal.C0547c.this
                java.lang.String r2 = r2.v()
                r1[r0] = r2
                r0 = 2
                com.google.android.gms.common.internal.c r2 = com.google.android.gms.common.internal.C0547c.this
                java.lang.String r2 = r2.u()
                r1[r0] = r2
                java.lang.String r0 = "A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. "
                java.lang.String r0 = java.lang.String.format(r0, r1)
                r5.<init>(r0)
                throw r5
            L_0x0061:
                boolean r5 = r4.e()
                if (r5 != 0) goto L_0x0076
                com.google.android.gms.common.internal.c r5 = com.google.android.gms.common.internal.C0547c.this
                r5.b(r0, null)
                c.b.b.b.b.b r5 = new c.b.b.b.b.b
                r0 = 8
                r5.<init>(r0, r1)
                r4.a((c.b.b.b.b.C0254b) r5)
            L_0x0076:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0547c.f.a(java.lang.Object):void");
        }

        /* access modifiers changed from: protected */
        public abstract boolean e();
    }

    /* renamed from: com.google.android.gms.common.internal.c$g */
    final class g extends c.b.b.b.d.c.h {
        public g(Looper looper) {
            super(looper);
        }

        private static void a(Message message) {
            h hVar = (h) message.obj;
            hVar.a();
            hVar.c();
        }

        private static boolean b(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r8) {
            /*
                r7 = this;
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0547c.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.D
                int r0 = r0.get()
                int r1 = r8.arg1
                if (r0 == r1) goto L_0x0016
                boolean r0 = b(r8)
                if (r0 == 0) goto L_0x0015
                a(r8)
            L_0x0015:
                return
            L_0x0016:
                int r0 = r8.what
                r1 = 4
                r2 = 1
                r3 = 5
                if (r0 == r2) goto L_0x002e
                r4 = 7
                if (r0 == r4) goto L_0x002e
                if (r0 != r1) goto L_0x002a
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0547c.this
                boolean r0 = r0.l()
                if (r0 == 0) goto L_0x002e
            L_0x002a:
                int r0 = r8.what
                if (r0 != r3) goto L_0x003a
            L_0x002e:
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0547c.this
                boolean r0 = r0.c()
                if (r0 != 0) goto L_0x003a
                a(r8)
                return
            L_0x003a:
                int r0 = r8.what
                r4 = 8
                r5 = 3
                r6 = 0
                if (r0 != r1) goto L_0x0085
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0547c.this
                c.b.b.b.b.b r1 = new c.b.b.b.b.b
                int r8 = r8.arg2
                r1.<init>(r8)
                c.b.b.b.b.C0254b unused = r0.A = r1
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.C0547c.this
                boolean r8 = r8.A()
                if (r8 == 0) goto L_0x0064
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.C0547c.this
                boolean r8 = r8.B
                if (r8 != 0) goto L_0x0064
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.C0547c.this
                r8.b(r5, null)
                return
            L_0x0064:
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.C0547c.this
                c.b.b.b.b.b r8 = r8.A
                if (r8 == 0) goto L_0x0073
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.C0547c.this
                c.b.b.b.b.b r8 = r8.A
                goto L_0x0078
            L_0x0073:
                c.b.b.b.b.b r8 = new c.b.b.b.b.b
                r8.<init>(r4)
            L_0x0078:
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0547c.this
                com.google.android.gms.common.internal.c$c r0 = r0.r
                r0.a(r8)
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0547c.this
                r0.a((c.b.b.b.b.C0254b) r8)
                return
            L_0x0085:
                if (r0 != r3) goto L_0x00a8
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.C0547c.this
                c.b.b.b.b.b r8 = r8.A
                if (r8 == 0) goto L_0x0096
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.C0547c.this
                c.b.b.b.b.b r8 = r8.A
                goto L_0x009b
            L_0x0096:
                c.b.b.b.b.b r8 = new c.b.b.b.b.b
                r8.<init>(r4)
            L_0x009b:
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0547c.this
                com.google.android.gms.common.internal.c$c r0 = r0.r
                r0.a(r8)
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0547c.this
                r0.a((c.b.b.b.b.C0254b) r8)
                return
            L_0x00a8:
                if (r0 != r5) goto L_0x00c7
                java.lang.Object r0 = r8.obj
                boolean r1 = r0 instanceof android.app.PendingIntent
                if (r1 == 0) goto L_0x00b3
                r6 = r0
                android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            L_0x00b3:
                c.b.b.b.b.b r0 = new c.b.b.b.b.b
                int r8 = r8.arg2
                r0.<init>(r8, r6)
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.C0547c.this
                com.google.android.gms.common.internal.c$c r8 = r8.r
                r8.a(r0)
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.C0547c.this
                r8.a((c.b.b.b.b.C0254b) r0)
                return
            L_0x00c7:
                r1 = 6
                if (r0 != r1) goto L_0x00ef
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0547c.this
                r0.b(r3, null)
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0547c.this
                com.google.android.gms.common.internal.c$a r0 = r0.w
                if (r0 == 0) goto L_0x00e2
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0547c.this
                com.google.android.gms.common.internal.c$a r0 = r0.w
                int r1 = r8.arg2
                r0.d(r1)
            L_0x00e2:
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0547c.this
                int r8 = r8.arg2
                r0.a((int) r8)
                com.google.android.gms.common.internal.c r8 = com.google.android.gms.common.internal.C0547c.this
                boolean unused = r8.a((int) r3, (int) r2, r6)
                return
            L_0x00ef:
                r1 = 2
                if (r0 != r1) goto L_0x00fe
                com.google.android.gms.common.internal.c r0 = com.google.android.gms.common.internal.C0547c.this
                boolean r0 = r0.isConnected()
                if (r0 != 0) goto L_0x00fe
                a(r8)
                return
            L_0x00fe:
                boolean r0 = b(r8)
                if (r0 == 0) goto L_0x010c
                java.lang.Object r8 = r8.obj
                com.google.android.gms.common.internal.c$h r8 = (com.google.android.gms.common.internal.C0547c.h) r8
                r8.b()
                return
            L_0x010c:
                int r8 = r8.what
                r0 = 45
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Don't know how to handle message: "
                r1.append(r0)
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                java.lang.Exception r0 = new java.lang.Exception
                r0.<init>()
                java.lang.String r1 = "GmsClient"
                android.util.Log.wtf(r1, r8, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0547c.g.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$h */
    protected abstract class h<TListener> {

        /* renamed from: a  reason: collision with root package name */
        private TListener f5938a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f5939b = false;

        public h(TListener tlistener) {
            this.f5938a = tlistener;
        }

        /* access modifiers changed from: protected */
        public abstract void a();

        /* access modifiers changed from: protected */
        public abstract void a(TListener tlistener);

        public final void b() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f5938a;
                if (this.f5939b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    a(tlistener);
                } catch (RuntimeException e2) {
                    a();
                    throw e2;
                }
            } else {
                a();
            }
            synchronized (this) {
                this.f5939b = true;
            }
            c();
        }

        public final void c() {
            d();
            synchronized (C0547c.this.t) {
                C0547c.this.t.remove(this);
            }
        }

        public final void d() {
            synchronized (this) {
                this.f5938a = null;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$i */
    public final class i implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private final int f5941a;

        public i(int i) {
            this.f5941a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C0561q qVar;
            if (iBinder == null) {
                C0547c.this.c(16);
                return;
            }
            synchronized (C0547c.this.p) {
                C0547c cVar = C0547c.this;
                if (iBinder == null) {
                    qVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    qVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C0561q)) ? new C0560p(iBinder) : (C0561q) queryLocalInterface;
                }
                C0561q unused = cVar.q = qVar;
            }
            C0547c.this.a(0, (Bundle) null, this.f5941a);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (C0547c.this.p) {
                C0561q unused = C0547c.this.q = null;
            }
            Handler handler = C0547c.this.n;
            handler.sendMessage(handler.obtainMessage(6, this.f5941a, 1));
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$j */
    public static final class j extends C0559o.a {

        /* renamed from: a  reason: collision with root package name */
        private C0547c f5943a;

        /* renamed from: b  reason: collision with root package name */
        private final int f5944b;

        public j(C0547c cVar, int i) {
            this.f5943a = cVar;
            this.f5944b = i;
        }

        public final void a(int i, IBinder iBinder, Bundle bundle) {
            C0563t.a(this.f5943a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
            this.f5943a.a(i, iBinder, bundle, this.f5944b);
            this.f5943a = null;
        }

        public final void a(int i, IBinder iBinder, E e2) {
            C0563t.a(this.f5943a, (Object) "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C0563t.a(e2);
            this.f5943a.a(e2);
            a(i, iBinder, e2.f5898a);
        }

        public final void c(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$k */
    protected final class k extends f {

        /* renamed from: g  reason: collision with root package name */
        private final IBinder f5945g;

        public k(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.f5945g = iBinder;
        }

        /* access modifiers changed from: protected */
        public final void a(C0254b bVar) {
            if (C0547c.this.x != null) {
                C0547c.this.x.a(bVar);
            }
            C0547c.this.a(bVar);
        }

        /* access modifiers changed from: protected */
        public final boolean e() {
            try {
                String interfaceDescriptor = this.f5945g.getInterfaceDescriptor();
                if (!C0547c.this.u().equals(interfaceDescriptor)) {
                    String u = C0547c.this.u();
                    StringBuilder sb = new StringBuilder(String.valueOf(u).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(u);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface a2 = C0547c.this.a(this.f5945g);
                if (a2 == null || (!C0547c.this.a(2, 4, a2) && !C0547c.this.a(3, 4, a2))) {
                    return false;
                }
                C0254b unused = C0547c.this.A = null;
                Bundle o = C0547c.this.o();
                if (C0547c.this.w == null) {
                    return true;
                }
                C0547c.this.w.h(o);
                return true;
            } catch (RemoteException unused2) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$l */
    protected final class l extends f {
        public l(int i, Bundle bundle) {
            super(i, (Bundle) null);
        }

        /* access modifiers changed from: protected */
        public final void a(C0254b bVar) {
            if (!C0547c.this.l() || !C0547c.this.A()) {
                C0547c.this.r.a(bVar);
                C0547c.this.a(bVar);
                return;
            }
            C0547c.this.c(16);
        }

        /* access modifiers changed from: protected */
        public final boolean e() {
            C0547c.this.r.a(C0254b.f3862a);
            return true;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C0547c(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.C0547c.a r13, com.google.android.gms.common.internal.C0547c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.j r3 = com.google.android.gms.common.internal.C0554j.a(r10)
            c.b.b.b.b.f r4 = c.b.b.b.b.f.a()
            com.google.android.gms.common.internal.C0563t.a(r13)
            r6 = r13
            com.google.android.gms.common.internal.c$a r6 = (com.google.android.gms.common.internal.C0547c.a) r6
            com.google.android.gms.common.internal.C0563t.a(r14)
            r7 = r14
            com.google.android.gms.common.internal.c$b r7 = (com.google.android.gms.common.internal.C0547c.b) r7
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0547c.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.c$a, com.google.android.gms.common.internal.c$b, java.lang.String):void");
    }

    protected C0547c(Context context, Looper looper, C0554j jVar, c.b.b.b.b.f fVar, int i2, a aVar, b bVar, String str) {
        this.f5932h = null;
        this.o = new Object();
        this.p = new Object();
        this.t = new ArrayList<>();
        this.v = 1;
        this.A = null;
        this.B = false;
        this.C = null;
        this.D = new AtomicInteger(0);
        C0563t.a(context, (Object) "Context must not be null");
        this.j = context;
        C0563t.a(looper, (Object) "Looper must not be null");
        this.k = looper;
        C0563t.a(jVar, (Object) "Supervisor must not be null");
        this.l = jVar;
        C0563t.a(fVar, (Object) "API availability must not be null");
        this.m = fVar;
        this.n = new g(looper);
        this.y = i2;
        this.w = aVar;
        this.x = bVar;
        this.z = str;
    }

    /* access modifiers changed from: private */
    public final boolean A() {
        if (this.B || TextUtils.isEmpty(u()) || TextUtils.isEmpty(r())) {
            return false;
        }
        try {
            Class.forName(u());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final String a() {
        String str = this.z;
        return str == null ? this.j.getClass().getName() : str;
    }

    /* access modifiers changed from: private */
    public final void a(E e2) {
        this.C = e2;
    }

    /* access modifiers changed from: private */
    public final boolean a(int i2, int i3, T t2) {
        synchronized (this.o) {
            if (this.v != i2) {
                return false;
            }
            b(i3, t2);
            return true;
        }
    }

    /* access modifiers changed from: private */
    public final void b(int i2, T t2) {
        boolean z2 = false;
        if ((i2 == 4) == (t2 != null)) {
            z2 = true;
        }
        C0563t.a(z2);
        synchronized (this.o) {
            this.v = i2;
            this.s = t2;
            a(i2, t2);
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    if (!(this.u == null || this.i == null)) {
                        String a2 = this.i.a();
                        String b2 = this.i.b();
                        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 70 + String.valueOf(b2).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(a2);
                        sb.append(" on ");
                        sb.append(b2);
                        Log.e("GmsClient", sb.toString());
                        this.l.a(this.i.a(), this.i.b(), this.i.c(), this.u, a(), this.i.d());
                        this.D.incrementAndGet();
                    }
                    this.u = new i(this.D.get());
                    this.i = (this.v != 3 || r() == null) ? new M(w(), v(), false, C0554j.a(), x()) : new M(p().getPackageName(), r(), true, C0554j.a(), false);
                    if (!this.i.d() || g() >= 17895000) {
                        if (!this.l.a(new C0554j.a(this.i.a(), this.i.b(), this.i.c(), this.i.d()), this.u, a())) {
                            String a3 = this.i.a();
                            String b3 = this.i.b();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(a3).length() + 34 + String.valueOf(b3).length());
                            sb2.append("unable to connect to service: ");
                            sb2.append(a3);
                            sb2.append(" on ");
                            sb2.append(b3);
                            Log.e("GmsClient", sb2.toString());
                            a(16, (Bundle) null, this.D.get());
                        }
                    } else {
                        String valueOf = String.valueOf(this.i.a());
                        throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                    }
                } else if (i2 == 4) {
                    a(t2);
                }
            } else if (this.u != null) {
                this.l.a(this.i.a(), this.i.b(), this.i.c(), this.u, a(), this.i.d());
                this.u = null;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void c(int i2) {
        int i3;
        if (z()) {
            i3 = 5;
            this.B = true;
        } else {
            i3 = 4;
        }
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(i3, this.D.get(), 16));
    }

    private final boolean z() {
        boolean z2;
        synchronized (this.o) {
            z2 = this.v == 3;
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    public abstract T a(IBinder iBinder);

    /* access modifiers changed from: protected */
    public void a(int i2) {
        this.f5927c = i2;
        this.f5928d = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, Bundle bundle, int i3) {
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, new l(i2, (Bundle) null)));
    }

    /* access modifiers changed from: protected */
    public void a(int i2, IBinder iBinder, Bundle bundle, int i3) {
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new k(i2, iBinder, bundle)));
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, T t2) {
    }

    /* access modifiers changed from: protected */
    public void a(T t2) {
        this.f5929e = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void a(C0254b bVar) {
        this.f5930f = bVar.g();
        this.f5931g = System.currentTimeMillis();
    }

    public void a(C0077c cVar) {
        C0563t.a(cVar, (Object) "Connection progress callbacks cannot be null.");
        this.r = cVar;
        b(2, (IInterface) null);
    }

    /* access modifiers changed from: protected */
    public void a(C0077c cVar, int i2, PendingIntent pendingIntent) {
        C0563t.a(cVar, (Object) "Connection progress callbacks cannot be null.");
        this.r = cVar;
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(3, this.D.get(), i2, pendingIntent));
    }

    public void a(e eVar) {
        eVar.a();
    }

    public void a(C0557m mVar, Set<Scope> set) {
        Bundle q2 = q();
        C0551g gVar = new C0551g(this.y);
        gVar.f5969d = this.j.getPackageName();
        gVar.f5972g = q2;
        if (set != null) {
            gVar.f5971f = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (i()) {
            gVar.f5973h = m() != null ? m() : new Account("<<default account>>", "com.google");
            if (mVar != null) {
                gVar.f5970e = mVar.asBinder();
            }
        } else if (y()) {
            gVar.f5973h = m();
        }
        gVar.i = f5925a;
        gVar.j = n();
        try {
            synchronized (this.p) {
                if (this.q != null) {
                    this.q.a(new j(this, this.D.get()), gVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            b(3);
        } catch (SecurityException e3) {
            throw e3;
        } catch (RemoteException | RuntimeException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            a(8, (IBinder) null, (Bundle) null, this.D.get());
        }
    }

    public void b(int i2) {
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(6, this.D.get(), i2));
    }

    public boolean c() {
        boolean z2;
        synchronized (this.o) {
            if (this.v != 2) {
                if (this.v != 3) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return z2;
    }

    public String d() {
        M m2;
        if (isConnected() && (m2 = this.i) != null) {
            return m2.b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public void e() {
        this.D.incrementAndGet();
        synchronized (this.t) {
            int size = this.t.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.t.get(i2).d();
            }
            this.t.clear();
        }
        synchronized (this.p) {
            this.q = null;
        }
        b(1, (IInterface) null);
    }

    public boolean f() {
        return true;
    }

    public int g() {
        return c.b.b.b.b.f.f3884a;
    }

    public final c.b.b.b.b.d[] h() {
        E e2 = this.C;
        if (e2 == null) {
            return null;
        }
        return e2.f5899b;
    }

    public boolean i() {
        return false;
    }

    public boolean isConnected() {
        boolean z2;
        synchronized (this.o) {
            z2 = this.v == 4;
        }
        return z2;
    }

    public void j() {
        int a2 = this.m.a(this.j, g());
        if (a2 != 0) {
            b(1, (IInterface) null);
            a((C0077c) new d(), a2, (PendingIntent) null);
            return;
        }
        a((C0077c) new d());
    }

    /* access modifiers changed from: protected */
    public final void k() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    public boolean l() {
        return false;
    }

    public Account m() {
        return null;
    }

    public c.b.b.b.b.d[] n() {
        return f5925a;
    }

    public Bundle o() {
        return null;
    }

    public final Context p() {
        return this.j;
    }

    /* access modifiers changed from: protected */
    public Bundle q() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    public String r() {
        return null;
    }

    /* access modifiers changed from: protected */
    public Set<Scope> s() {
        return Collections.emptySet();
    }

    public final T t() {
        T t2;
        synchronized (this.o) {
            if (this.v != 5) {
                k();
                C0563t.b(this.s != null, "Client is connected but service is null");
                t2 = this.s;
            } else {
                throw new DeadObjectException();
            }
        }
        return t2;
    }

    /* access modifiers changed from: protected */
    public abstract String u();

    /* access modifiers changed from: protected */
    public abstract String v();

    /* access modifiers changed from: protected */
    public String w() {
        return "com.google.android.gms";
    }

    /* access modifiers changed from: protected */
    public boolean x() {
        return false;
    }

    public boolean y() {
        return false;
    }
}
