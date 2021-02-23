package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.Bma;
import java.io.IOException;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.google.android.gms.internal.ads.xma  reason: case insensitive filesystem */
final class C2950xma<T extends Bma> extends Handler implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final T f12836a;

    /* renamed from: b  reason: collision with root package name */
    private final C3021yma<T> f12837b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12838c;

    /* renamed from: d  reason: collision with root package name */
    private final long f12839d;

    /* renamed from: e  reason: collision with root package name */
    private IOException f12840e;

    /* renamed from: f  reason: collision with root package name */
    private int f12841f;

    /* renamed from: g  reason: collision with root package name */
    private volatile Thread f12842g;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f12843h;
    private final /* synthetic */ C2808vma i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2950xma(C2808vma vma, Looper looper, T t, C3021yma<T> yma, int i2, long j) {
        super(looper);
        this.i = vma;
        this.f12836a = t;
        this.f12837b = yma;
        this.f12838c = i2;
        this.f12839d = j;
    }

    private final void a() {
        this.f12840e = null;
        this.i.f12563a.execute(this.i.f12564b);
    }

    private final void b() {
        C2950xma unused = this.i.f12564b = null;
    }

    public final void a(int i2) {
        IOException iOException = this.f12840e;
        if (iOException != null && this.f12841f > i2) {
            throw iOException;
        }
    }

    public final void a(long j) {
        Cma.b(this.i.f12564b == null);
        C2950xma unused = this.i.f12564b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            a();
        }
    }

    public final void a(boolean z) {
        this.f12843h = z;
        this.f12840e = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.f12836a.b();
            if (this.f12842g != null) {
                this.f12842g.interrupt();
            }
        }
        if (z) {
            b();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f12837b.a(this.f12836a, elapsedRealtime, elapsedRealtime - this.f12839d, true);
        }
    }

    public final void handleMessage(Message message) {
        if (!this.f12843h) {
            int i2 = message.what;
            if (i2 == 0) {
                a();
            } else if (i2 != 4) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.f12839d;
                if (this.f12836a.c()) {
                    this.f12837b.a(this.f12836a, elapsedRealtime, j, false);
                    return;
                }
                int i3 = message.what;
                if (i3 == 1) {
                    this.f12837b.a(this.f12836a, elapsedRealtime, j, false);
                } else if (i3 == 2) {
                    this.f12837b.a(this.f12836a, elapsedRealtime, j);
                } else if (i3 == 3) {
                    this.f12840e = (IOException) message.obj;
                    int a2 = this.f12837b.a(this.f12836a, elapsedRealtime, j, this.f12840e);
                    if (a2 == 3) {
                        IOException unused = this.i.f12565c = this.f12840e;
                    } else if (a2 != 2) {
                        this.f12841f = a2 == 1 ? 1 : this.f12841f + 1;
                        a((long) Math.min((this.f12841f - 1) * 1000, 5000));
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    public final void run() {
        try {
            this.f12842g = Thread.currentThread();
            if (!this.f12836a.c()) {
                String valueOf = String.valueOf(this.f12836a.getClass().getSimpleName());
                Qma.a(valueOf.length() != 0 ? "load:".concat(valueOf) : new String("load:"));
                this.f12836a.a();
                Qma.a();
            }
            if (!this.f12843h) {
                sendEmptyMessage(2);
            }
        } catch (IOException e2) {
            if (!this.f12843h) {
                obtainMessage(3, e2).sendToTarget();
            }
        } catch (InterruptedException unused) {
            Cma.b(this.f12836a.c());
            if (!this.f12843h) {
                sendEmptyMessage(2);
            }
        } catch (Exception e3) {
            Log.e("LoadTask", "Unexpected exception loading stream", e3);
            if (!this.f12843h) {
                obtainMessage(3, new Ama(e3)).sendToTarget();
            }
        } catch (OutOfMemoryError e4) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e4);
            if (!this.f12843h) {
                obtainMessage(3, new Ama(e4)).sendToTarget();
            }
        } catch (Error e5) {
            Log.e("LoadTask", "Unexpected error loading stream", e5);
            if (!this.f12843h) {
                obtainMessage(4, e5).sendToTarget();
            }
            throw e5;
        } catch (Throwable th) {
            Qma.a();
            throw th;
        }
    }
}
