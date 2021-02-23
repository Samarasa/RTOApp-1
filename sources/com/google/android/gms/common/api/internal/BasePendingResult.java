package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import c.b.b.b.d.b.d;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.C0558n;
import com.google.android.gms.common.internal.C0563t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends k> extends h<R> {

    /* renamed from: a  reason: collision with root package name */
    static final ThreadLocal<Boolean> f5789a = new S();

    /* renamed from: b  reason: collision with root package name */
    private final Object f5790b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final a<R> f5791c = new a<>(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    private final WeakReference<f> f5792d = new WeakReference<>((Object) null);

    /* renamed from: e  reason: collision with root package name */
    private final CountDownLatch f5793e = new CountDownLatch(1);

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<h.a> f5794f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private l<? super R> f5795g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicReference<L> f5796h = new AtomicReference<>();
    /* access modifiers changed from: private */
    public R i;
    private Status j;
    private volatile boolean k;
    private boolean l;
    private boolean m;
    @KeepName
    private b mResultGuardian;
    private C0558n n;
    private boolean o = false;

    public static class a<R extends k> extends d {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(l<? super R> lVar, R r) {
            l unused = BasePendingResult.b(lVar);
            sendMessage(obtainMessage(1, new Pair(lVar, r)));
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                l lVar = (l) pair.first;
                k kVar = (k) pair.second;
                try {
                    lVar.a(kVar);
                } catch (RuntimeException e2) {
                    BasePendingResult.b(kVar);
                    throw e2;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).b(Status.f5758d);
            }
        }
    }

    private final class b {
        private b() {
        }

        /* synthetic */ b(BasePendingResult basePendingResult, S s) {
            this();
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            BasePendingResult.b(BasePendingResult.this.i);
            super.finalize();
        }
    }

    @Deprecated
    BasePendingResult() {
    }

    private final R b() {
        R r;
        synchronized (this.f5790b) {
            C0563t.b(!this.k, "Result has already been consumed.");
            C0563t.b(a(), "Result is not ready.");
            r = this.i;
            this.i = null;
            this.f5795g = null;
            this.k = true;
        }
        L andSet = this.f5796h.getAndSet((Object) null);
        if (andSet != null) {
            andSet.a(this);
        }
        return r;
    }

    /* access modifiers changed from: private */
    public static <R extends k> l<R> b(l<R> lVar) {
        return lVar;
    }

    public static void b(k kVar) {
        if (kVar instanceof i) {
            try {
                ((i) kVar).a();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(kVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e2);
            }
        }
    }

    private final void c(R r) {
        this.i = r;
        this.n = null;
        this.f5793e.countDown();
        this.j = this.i.f();
        if (this.l) {
            this.f5795g = null;
        } else if (this.f5795g != null) {
            this.f5791c.removeMessages(2);
            this.f5791c.a(this.f5795g, b());
        } else if (this.i instanceof i) {
            this.mResultGuardian = new b(this, (S) null);
        }
        ArrayList<h.a> arrayList = this.f5794f;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            h.a aVar = arrayList.get(i2);
            i2++;
            aVar.a(this.j);
        }
        this.f5794f.clear();
    }

    /* access modifiers changed from: protected */
    public abstract R a(Status status);

    public final void a(R r) {
        synchronized (this.f5790b) {
            if (this.m || this.l) {
                b((k) r);
                return;
            }
            a();
            boolean z = true;
            C0563t.b(!a(), "Results have already been set");
            if (this.k) {
                z = false;
            }
            C0563t.b(z, "Result has already been consumed");
            c(r);
        }
    }

    public final boolean a() {
        return this.f5793e.getCount() == 0;
    }

    public final void b(Status status) {
        synchronized (this.f5790b) {
            if (!a()) {
                a(a(status));
                this.m = true;
            }
        }
    }
}
