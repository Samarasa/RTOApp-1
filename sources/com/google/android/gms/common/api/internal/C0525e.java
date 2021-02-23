package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import b.e.d;
import c.b.b.b.b.C0254b;
import c.b.b.b.b.e;
import c.b.b.b.g.j;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.C0523c;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.C0547c;
import com.google.android.gms.common.internal.C0556l;
import com.google.android.gms.common.internal.C0557m;
import com.google.android.gms.common.internal.C0562s;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.api.internal.e  reason: case insensitive filesystem */
public class C0525e implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static final Status f5847a = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final Status f5848b = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final Object f5849c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static C0525e f5850d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public long f5851e = 5000;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public long f5852f = 120000;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public long f5853g = 10000;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final Context f5854h;
    /* access modifiers changed from: private */
    public final e i;
    /* access modifiers changed from: private */
    public final C0556l j;
    private final AtomicInteger k = new AtomicInteger(1);
    private final AtomicInteger l = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public final Map<C0522b<?>, a<?>> m = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */
    public C0537q n = null;
    /* access modifiers changed from: private */
    public final Set<C0522b<?>> o = new d();
    private final Set<C0522b<?>> p = new d();
    /* access modifiers changed from: private */
    public final Handler q;

    /* renamed from: com.google.android.gms.common.api.internal.e$a */
    public class a<O extends a.d> implements f.a, f.b, T {

        /* renamed from: a  reason: collision with root package name */
        private final Queue<D> f5855a = new LinkedList();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final a.f f5856b;

        /* renamed from: c  reason: collision with root package name */
        private final a.b f5857c;

        /* renamed from: d  reason: collision with root package name */
        private final C0522b<O> f5858d;

        /* renamed from: e  reason: collision with root package name */
        private final U f5859e;

        /* renamed from: f  reason: collision with root package name */
        private final Set<P> f5860f = new HashSet();

        /* renamed from: g  reason: collision with root package name */
        private final Map<C0529i<?>, C> f5861g = new HashMap();

        /* renamed from: h  reason: collision with root package name */
        private final int f5862h;
        private final F i;
        private boolean j;
        private final List<c> k = new ArrayList();
        private C0254b l = null;

        public a(com.google.android.gms.common.api.e<O> eVar) {
            this.f5856b = eVar.a(C0525e.this.q.getLooper(), (a<O>) this);
            a.b bVar = this.f5856b;
            this.f5857c = bVar instanceof w ? ((w) bVar).z() : bVar;
            this.f5858d = eVar.b();
            this.f5859e = new U();
            this.f5862h = eVar.d();
            if (this.f5856b.i()) {
                this.i = eVar.a(C0525e.this.f5854h, C0525e.this.q);
            } else {
                this.i = null;
            }
        }

        private final c.b.b.b.b.d a(c.b.b.b.b.d[] dVarArr) {
            if (!(dVarArr == null || dVarArr.length == 0)) {
                c.b.b.b.b.d[] h2 = this.f5856b.h();
                if (h2 == null) {
                    h2 = new c.b.b.b.b.d[0];
                }
                b.e.b bVar = new b.e.b(h2.length);
                for (c.b.b.b.b.d dVar : h2) {
                    bVar.put(dVar.g(), Long.valueOf(dVar.h()));
                }
                for (c.b.b.b.b.d dVar2 : dVarArr) {
                    if (!bVar.containsKey(dVar2.g()) || ((Long) bVar.get(dVar2.g())).longValue() < dVar2.h()) {
                        return dVar2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public final void a(c cVar) {
            if (!this.k.contains(cVar) || this.j) {
                return;
            }
            if (!this.f5856b.isConnected()) {
                a();
            } else {
                o();
            }
        }

        /* access modifiers changed from: private */
        public final boolean a(boolean z) {
            C0563t.a(C0525e.this.q);
            if (!this.f5856b.isConnected() || this.f5861g.size() != 0) {
                return false;
            }
            if (this.f5859e.a()) {
                if (z) {
                    q();
                }
                return false;
            }
            this.f5856b.e();
            return true;
        }

        /* access modifiers changed from: private */
        public final void b(c cVar) {
            c.b.b.b.b.d[] b2;
            if (this.k.remove(cVar)) {
                C0525e.this.q.removeMessages(15, cVar);
                C0525e.this.q.removeMessages(16, cVar);
                c.b.b.b.b.d b3 = cVar.f5870b;
                ArrayList arrayList = new ArrayList(this.f5855a.size());
                for (D d2 : this.f5855a) {
                    if ((d2 instanceof C0539t) && (b2 = ((C0539t) d2).b(this)) != null && com.google.android.gms.common.util.b.a(b2, b3)) {
                        arrayList.add(d2);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    D d3 = (D) obj;
                    this.f5855a.remove(d3);
                    d3.a((RuntimeException) new m(b3));
                }
            }
        }

        private final boolean b(D d2) {
            if (!(d2 instanceof C0539t)) {
                c(d2);
                return true;
            }
            C0539t tVar = (C0539t) d2;
            c.b.b.b.b.d a2 = a(tVar.b(this));
            if (a2 == null) {
                c(d2);
                return true;
            } else if (tVar.c(this)) {
                c cVar = new c(this.f5858d, a2, (C0540u) null);
                int indexOf = this.k.indexOf(cVar);
                if (indexOf >= 0) {
                    c cVar2 = this.k.get(indexOf);
                    C0525e.this.q.removeMessages(15, cVar2);
                    C0525e.this.q.sendMessageDelayed(Message.obtain(C0525e.this.q, 15, cVar2), C0525e.this.f5851e);
                    return false;
                }
                this.k.add(cVar);
                C0525e.this.q.sendMessageDelayed(Message.obtain(C0525e.this.q, 15, cVar), C0525e.this.f5851e);
                C0525e.this.q.sendMessageDelayed(Message.obtain(C0525e.this.q, 16, cVar), C0525e.this.f5852f);
                C0254b bVar = new C0254b(2, (PendingIntent) null);
                if (c(bVar)) {
                    return false;
                }
                C0525e.this.b(bVar, this.f5862h);
                return false;
            } else {
                tVar.a((RuntimeException) new m(a2));
                return false;
            }
        }

        private final void c(D d2) {
            d2.a(this.f5859e, d());
            try {
                d2.a((a<?>) this);
            } catch (DeadObjectException unused) {
                d(1);
                this.f5856b.e();
            }
        }

        private final boolean c(C0254b bVar) {
            synchronized (C0525e.f5849c) {
                if (C0525e.this.n != null) {
                    if (C0525e.this.o.contains(this.f5858d)) {
                        C0525e.this.n.a(bVar, this.f5862h);
                        throw null;
                    }
                }
            }
            return false;
        }

        private final void d(C0254b bVar) {
            for (P next : this.f5860f) {
                String str = null;
                if (C0562s.a(bVar, C0254b.f3862a)) {
                    str = this.f5856b.d();
                }
                next.a(this.f5858d, bVar, str);
            }
            this.f5860f.clear();
        }

        /* access modifiers changed from: private */
        public final void m() {
            j();
            d(C0254b.f3862a);
            p();
            Iterator<C> it = this.f5861g.values().iterator();
            while (it.hasNext()) {
                C next = it.next();
                if (a(next.f5798a.b()) == null) {
                    try {
                        next.f5798a.a(this.f5857c, new j());
                    } catch (DeadObjectException unused) {
                        d(1);
                        this.f5856b.e();
                    } catch (RemoteException unused2) {
                    }
                }
                it.remove();
            }
            o();
            q();
        }

        /* access modifiers changed from: private */
        public final void n() {
            j();
            this.j = true;
            this.f5859e.c();
            C0525e.this.q.sendMessageDelayed(Message.obtain(C0525e.this.q, 9, this.f5858d), C0525e.this.f5851e);
            C0525e.this.q.sendMessageDelayed(Message.obtain(C0525e.this.q, 11, this.f5858d), C0525e.this.f5852f);
            C0525e.this.j.a();
        }

        private final void o() {
            ArrayList arrayList = new ArrayList(this.f5855a);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                D d2 = (D) obj;
                if (!this.f5856b.isConnected()) {
                    return;
                }
                if (b(d2)) {
                    this.f5855a.remove(d2);
                }
            }
        }

        private final void p() {
            if (this.j) {
                C0525e.this.q.removeMessages(11, this.f5858d);
                C0525e.this.q.removeMessages(9, this.f5858d);
                this.j = false;
            }
        }

        private final void q() {
            C0525e.this.q.removeMessages(12, this.f5858d);
            C0525e.this.q.sendMessageDelayed(C0525e.this.q.obtainMessage(12, this.f5858d), C0525e.this.f5853g);
        }

        public final void a() {
            C0563t.a(C0525e.this.q);
            if (!this.f5856b.isConnected() && !this.f5856b.c()) {
                int a2 = C0525e.this.j.a(C0525e.this.f5854h, this.f5856b);
                if (a2 != 0) {
                    a(new C0254b(a2, (PendingIntent) null));
                    return;
                }
                b bVar = new b(this.f5856b, this.f5858d);
                if (this.f5856b.i()) {
                    this.i.a((G) bVar);
                }
                this.f5856b.a((C0547c.C0077c) bVar);
            }
        }

        public final void a(C0254b bVar) {
            C0563t.a(C0525e.this.q);
            F f2 = this.i;
            if (f2 != null) {
                f2.c();
            }
            j();
            C0525e.this.j.a();
            d(bVar);
            if (bVar.g() == 4) {
                a(C0525e.f5848b);
            } else if (this.f5855a.isEmpty()) {
                this.l = bVar;
            } else if (!c(bVar) && !C0525e.this.b(bVar, this.f5862h)) {
                if (bVar.g() == 18) {
                    this.j = true;
                }
                if (this.j) {
                    C0525e.this.q.sendMessageDelayed(Message.obtain(C0525e.this.q, 9, this.f5858d), C0525e.this.f5851e);
                    return;
                }
                String a2 = this.f5858d.a();
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 63 + String.valueOf(valueOf).length());
                sb.append("API: ");
                sb.append(a2);
                sb.append(" is not available on this device. Connection failed with: ");
                sb.append(valueOf);
                a(new Status(17, sb.toString()));
            }
        }

        public final void a(Status status) {
            C0563t.a(C0525e.this.q);
            for (D a2 : this.f5855a) {
                a2.a(status);
            }
            this.f5855a.clear();
        }

        public final void a(D d2) {
            C0563t.a(C0525e.this.q);
            if (!this.f5856b.isConnected()) {
                this.f5855a.add(d2);
                C0254b bVar = this.l;
                if (bVar == null || !bVar.j()) {
                    a();
                } else {
                    a(this.l);
                }
            } else if (b(d2)) {
                q();
            } else {
                this.f5855a.add(d2);
            }
        }

        public final void a(P p) {
            C0563t.a(C0525e.this.q);
            this.f5860f.add(p);
        }

        public final int b() {
            return this.f5862h;
        }

        public final void b(C0254b bVar) {
            C0563t.a(C0525e.this.q);
            this.f5856b.e();
            a(bVar);
        }

        /* access modifiers changed from: package-private */
        public final boolean c() {
            return this.f5856b.isConnected();
        }

        public final void d(int i2) {
            if (Looper.myLooper() == C0525e.this.q.getLooper()) {
                n();
            } else {
                C0525e.this.q.post(new C0542w(this));
            }
        }

        public final boolean d() {
            return this.f5856b.i();
        }

        public final void e() {
            C0563t.a(C0525e.this.q);
            if (this.j) {
                a();
            }
        }

        public final a.f f() {
            return this.f5856b;
        }

        public final void g() {
            C0563t.a(C0525e.this.q);
            if (this.j) {
                p();
                a(C0525e.this.i.b(C0525e.this.f5854h) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                this.f5856b.e();
            }
        }

        public final void h() {
            C0563t.a(C0525e.this.q);
            a(C0525e.f5847a);
            this.f5859e.b();
            for (C0529i o : (C0529i[]) this.f5861g.keySet().toArray(new C0529i[this.f5861g.size()])) {
                a((D) new O(o, new j()));
            }
            d(new C0254b(4));
            if (this.f5856b.isConnected()) {
                this.f5856b.a((C0547c.e) new C0544y(this));
            }
        }

        public final void h(Bundle bundle) {
            if (Looper.myLooper() == C0525e.this.q.getLooper()) {
                m();
            } else {
                C0525e.this.q.post(new C0541v(this));
            }
        }

        public final Map<C0529i<?>, C> i() {
            return this.f5861g;
        }

        public final void j() {
            C0563t.a(C0525e.this.q);
            this.l = null;
        }

        public final C0254b k() {
            C0563t.a(C0525e.this.q);
            return this.l;
        }

        public final boolean l() {
            return a(true);
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.e$b */
    private class b implements G, C0547c.C0077c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final a.f f5863a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final C0522b<?> f5864b;

        /* renamed from: c  reason: collision with root package name */
        private C0557m f5865c = null;

        /* renamed from: d  reason: collision with root package name */
        private Set<Scope> f5866d = null;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f5867e = false;

        public b(a.f fVar, C0522b<?> bVar) {
            this.f5863a = fVar;
            this.f5864b = bVar;
        }

        /* access modifiers changed from: private */
        public final void a() {
            C0557m mVar;
            if (this.f5867e && (mVar = this.f5865c) != null) {
                this.f5863a.a(mVar, this.f5866d);
            }
        }

        public final void a(C0254b bVar) {
            C0525e.this.q.post(new A(this, bVar));
        }

        public final void a(C0557m mVar, Set<Scope> set) {
            if (mVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                b(new C0254b(4));
                return;
            }
            this.f5865c = mVar;
            this.f5866d = set;
            a();
        }

        public final void b(C0254b bVar) {
            ((a) C0525e.this.m.get(this.f5864b)).b(bVar);
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.e$c */
    private static class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final C0522b<?> f5869a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final c.b.b.b.b.d f5870b;

        private c(C0522b<?> bVar, c.b.b.b.b.d dVar) {
            this.f5869a = bVar;
            this.f5870b = dVar;
        }

        /* synthetic */ c(C0522b bVar, c.b.b.b.b.d dVar, C0540u uVar) {
            this(bVar, dVar);
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof c)) {
                c cVar = (c) obj;
                return C0562s.a(this.f5869a, cVar.f5869a) && C0562s.a(this.f5870b, cVar.f5870b);
            }
        }

        public final int hashCode() {
            return C0562s.a(this.f5869a, this.f5870b);
        }

        public final String toString() {
            C0562s.a a2 = C0562s.a((Object) this);
            a2.a("key", this.f5869a);
            a2.a("feature", this.f5870b);
            return a2.toString();
        }
    }

    private C0525e(Context context, Looper looper, e eVar) {
        this.f5854h = context;
        this.q = new c.b.b.b.d.b.d(looper, this);
        this.i = eVar;
        this.j = new C0556l(eVar);
        Handler handler = this.q;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static C0525e a(Context context) {
        C0525e eVar;
        synchronized (f5849c) {
            if (f5850d == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f5850d = new C0525e(context.getApplicationContext(), handlerThread.getLooper(), e.a());
            }
            eVar = f5850d;
        }
        return eVar;
    }

    private final void b(com.google.android.gms.common.api.e<?> eVar) {
        C0522b<?> b2 = eVar.b();
        a aVar = this.m.get(b2);
        if (aVar == null) {
            aVar = new a(eVar);
            this.m.put(b2, aVar);
        }
        if (aVar.d()) {
            this.p.add(b2);
        }
        aVar.a();
    }

    public final int a() {
        return this.k.getAndIncrement();
    }

    public final void a(C0254b bVar, int i2) {
        if (!b(bVar, i2)) {
            Handler handler = this.q;
            handler.sendMessage(handler.obtainMessage(5, i2, 0, bVar));
        }
    }

    public final void a(com.google.android.gms.common.api.e<?> eVar) {
        Handler handler = this.q;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final <O extends a.d, ResultT> void a(com.google.android.gms.common.api.e<O> eVar, int i2, C0534n<a.b, ResultT> nVar, j<ResultT> jVar, C0533m mVar) {
        N n2 = new N(i2, nVar, jVar, mVar);
        Handler handler = this.q;
        handler.sendMessage(handler.obtainMessage(4, new B(n2, this.l.get(), eVar)));
    }

    /* access modifiers changed from: package-private */
    public final boolean b(C0254b bVar, int i2) {
        return this.i.a(this.f5854h, bVar, i2);
    }

    public final void d() {
        Handler handler = this.q;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public boolean handleMessage(Message message) {
        a aVar;
        j<Boolean> jVar;
        boolean z;
        int i2 = message.what;
        long j2 = 300000;
        switch (i2) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j2 = 10000;
                }
                this.f5853g = j2;
                this.q.removeMessages(12);
                for (C0522b<?> obtainMessage : this.m.keySet()) {
                    Handler handler = this.q;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f5853g);
                }
                break;
            case 2:
                P p2 = (P) message.obj;
                Iterator<C0522b<?>> it = p2.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C0522b next = it.next();
                        a aVar2 = this.m.get(next);
                        if (aVar2 == null) {
                            p2.a(next, new C0254b(13), (String) null);
                            break;
                        } else if (aVar2.c()) {
                            p2.a(next, C0254b.f3862a, aVar2.f().d());
                        } else if (aVar2.k() != null) {
                            p2.a(next, aVar2.k(), (String) null);
                        } else {
                            aVar2.a(p2);
                            aVar2.a();
                        }
                    }
                }
            case 3:
                for (a next2 : this.m.values()) {
                    next2.j();
                    next2.a();
                }
                break;
            case 4:
            case 8:
            case 13:
                B b2 = (B) message.obj;
                a aVar3 = this.m.get(b2.f5788c.b());
                if (aVar3 == null) {
                    b(b2.f5788c);
                    aVar3 = this.m.get(b2.f5788c.b());
                }
                if (aVar3.d() && this.l.get() != b2.f5787b) {
                    b2.f5786a.a(f5847a);
                    aVar3.h();
                    break;
                } else {
                    aVar3.a(b2.f5786a);
                    break;
                }
            case 5:
                int i3 = message.arg1;
                C0254b bVar = (C0254b) message.obj;
                Iterator<a<?>> it2 = this.m.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        aVar = it2.next();
                        if (aVar.b() == i3) {
                        }
                    } else {
                        aVar = null;
                    }
                }
                if (aVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i3);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    break;
                } else {
                    String a2 = this.i.a(bVar.g());
                    String h2 = bVar.h();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 69 + String.valueOf(h2).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(a2);
                    sb2.append(": ");
                    sb2.append(h2);
                    aVar.a(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (com.google.android.gms.common.util.m.a() && (this.f5854h.getApplicationContext() instanceof Application)) {
                    C0523c.a((Application) this.f5854h.getApplicationContext());
                    C0523c.a().a((C0523c.a) new C0540u(this));
                    if (!C0523c.a().a(true)) {
                        this.f5853g = 300000;
                        break;
                    }
                }
                break;
            case 7:
                b((com.google.android.gms.common.api.e<?>) (com.google.android.gms.common.api.e) message.obj);
                break;
            case 9:
                if (this.m.containsKey(message.obj)) {
                    this.m.get(message.obj).e();
                    break;
                }
                break;
            case 10:
                for (C0522b<?> remove : this.p) {
                    this.m.remove(remove).h();
                }
                this.p.clear();
                break;
            case 11:
                if (this.m.containsKey(message.obj)) {
                    this.m.get(message.obj).g();
                    break;
                }
                break;
            case 12:
                if (this.m.containsKey(message.obj)) {
                    this.m.get(message.obj).l();
                    break;
                }
                break;
            case 14:
                r rVar = (r) message.obj;
                C0522b<?> a3 = rVar.a();
                if (!this.m.containsKey(a3)) {
                    jVar = rVar.b();
                    z = false;
                } else {
                    boolean a4 = this.m.get(a3).a(false);
                    jVar = rVar.b();
                    z = Boolean.valueOf(a4);
                }
                jVar.a(z);
                break;
            case 15:
                c cVar = (c) message.obj;
                if (this.m.containsKey(cVar.f5869a)) {
                    this.m.get(cVar.f5869a).a(cVar);
                    break;
                }
                break;
            case 16:
                c cVar2 = (c) message.obj;
                if (this.m.containsKey(cVar2.f5869a)) {
                    this.m.get(cVar2.f5869a).b(cVar2);
                    break;
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i2);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }
}
