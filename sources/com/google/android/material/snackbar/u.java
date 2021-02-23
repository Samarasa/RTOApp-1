package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

class u {

    /* renamed from: a  reason: collision with root package name */
    private static u f14179a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f14180b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Handler f14181c = new Handler(Looper.getMainLooper(), new t(this));

    /* renamed from: d  reason: collision with root package name */
    private b f14182d;

    /* renamed from: e  reason: collision with root package name */
    private b f14183e;

    interface a {
        void a(int i);

        void u();
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<a> f14184a;

        /* renamed from: b  reason: collision with root package name */
        int f14185b;

        /* renamed from: c  reason: collision with root package name */
        boolean f14186c;

        b(int i, a aVar) {
            this.f14184a = new WeakReference<>(aVar);
            this.f14185b = i;
        }

        /* access modifiers changed from: package-private */
        public boolean a(a aVar) {
            return aVar != null && this.f14184a.get() == aVar;
        }
    }

    private u() {
    }

    static u a() {
        if (f14179a == null) {
            f14179a = new u();
        }
        return f14179a;
    }

    private boolean a(b bVar, int i) {
        a aVar = (a) bVar.f14184a.get();
        if (aVar == null) {
            return false;
        }
        this.f14181c.removeCallbacksAndMessages(bVar);
        aVar.a(i);
        return true;
    }

    private void b() {
        b bVar = this.f14183e;
        if (bVar != null) {
            this.f14182d = bVar;
            this.f14183e = null;
            a aVar = (a) this.f14182d.f14184a.get();
            if (aVar != null) {
                aVar.u();
            } else {
                this.f14182d = null;
            }
        }
    }

    private void b(b bVar) {
        int i = bVar.f14185b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.f14181c.removeCallbacksAndMessages(bVar);
            Handler handler = this.f14181c;
            handler.sendMessageDelayed(Message.obtain(handler, 0, bVar), (long) i);
        }
    }

    private boolean f(a aVar) {
        b bVar = this.f14182d;
        return bVar != null && bVar.a(aVar);
    }

    private boolean g(a aVar) {
        b bVar = this.f14183e;
        return bVar != null && bVar.a(aVar);
    }

    public void a(int i, a aVar) {
        synchronized (this.f14180b) {
            if (f(aVar)) {
                this.f14182d.f14185b = i;
                this.f14181c.removeCallbacksAndMessages(this.f14182d);
                b(this.f14182d);
                return;
            }
            if (g(aVar)) {
                this.f14183e.f14185b = i;
            } else {
                this.f14183e = new b(i, aVar);
            }
            if (this.f14182d == null || !a(this.f14182d, 4)) {
                this.f14182d = null;
                b();
            }
        }
    }

    public void a(a aVar, int i) {
        b bVar;
        synchronized (this.f14180b) {
            if (f(aVar)) {
                bVar = this.f14182d;
            } else if (g(aVar)) {
                bVar = this.f14183e;
            }
            a(bVar, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar) {
        synchronized (this.f14180b) {
            if (this.f14182d == bVar || this.f14183e == bVar) {
                a(bVar, 2);
            }
        }
    }

    public boolean a(a aVar) {
        boolean z;
        synchronized (this.f14180b) {
            if (!f(aVar)) {
                if (!g(aVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public void b(a aVar) {
        synchronized (this.f14180b) {
            if (f(aVar)) {
                this.f14182d = null;
                if (this.f14183e != null) {
                    b();
                }
            }
        }
    }

    public void c(a aVar) {
        synchronized (this.f14180b) {
            if (f(aVar)) {
                b(this.f14182d);
            }
        }
    }

    public void d(a aVar) {
        synchronized (this.f14180b) {
            if (f(aVar) && !this.f14182d.f14186c) {
                this.f14182d.f14186c = true;
                this.f14181c.removeCallbacksAndMessages(this.f14182d);
            }
        }
    }

    public void e(a aVar) {
        synchronized (this.f14180b) {
            if (f(aVar) && this.f14182d.f14186c) {
                this.f14182d.f14186c = false;
                b(this.f14182d);
            }
        }
    }
}
