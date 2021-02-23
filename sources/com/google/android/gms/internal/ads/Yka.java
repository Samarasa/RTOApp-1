package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class Yka extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f9461a = C0936Og.f8124b;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<C1339b<?>> f9462b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final BlockingQueue<C1339b<?>> f9463c;

    /* renamed from: d  reason: collision with root package name */
    private final Xja f9464d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C1089Ud f9465e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f9466f = false;

    /* renamed from: g  reason: collision with root package name */
    private final Zla f9467g;

    public Yka(BlockingQueue<C1339b<?>> blockingQueue, BlockingQueue<C1339b<?>> blockingQueue2, Xja xja, C1089Ud ud) {
        this.f9462b = blockingQueue;
        this.f9463c = blockingQueue2;
        this.f9464d = xja;
        this.f9465e = ud;
        this.f9467g = new Zla(this);
    }

    private final void b() {
        C1089Ud ud;
        C1339b take = this.f9462b.take();
        take.a("cache-queue-take");
        take.a(1);
        try {
            take.m();
            C3019yla d2 = this.f9464d.d(take.n());
            if (d2 == null) {
                take.a("cache-miss");
                if (!this.f9467g.b(take)) {
                    this.f9463c.put(take);
                }
            } else if (d2.a()) {
                take.a("cache-hit-expired");
                take.a(d2);
                if (!this.f9467g.b(take)) {
                    this.f9463c.put(take);
                }
                take.a(2);
            } else {
                take.a("cache-hit");
                C3073zd a2 = take.a(new Ara(d2.f12970a, d2.f12976g));
                take.a("cache-hit-parsed");
                if (!a2.a()) {
                    take.a("cache-parsing-failed");
                    this.f9464d.a(take.n(), true);
                    take.a((C3019yla) null);
                    if (!this.f9467g.b(take)) {
                        this.f9463c.put(take);
                    }
                    take.a(2);
                    return;
                }
                if (!(d2.f12975f < System.currentTimeMillis())) {
                    ud = this.f9465e;
                } else {
                    take.a("cache-hit-refresh-needed");
                    take.a(d2);
                    a2.f13081d = true;
                    if (!this.f9467g.b(take)) {
                        this.f9465e.a(take, a2, new C3092zma(this, take));
                        take.a(2);
                    }
                    ud = this.f9465e;
                }
                ud.a((C1339b<?>) take, (C3073zd<?>) a2);
                take.a(2);
            }
        } finally {
            take.a(2);
        }
    }

    public final void a() {
        this.f9466f = true;
        interrupt();
    }

    public final void run() {
        if (f9461a) {
            C0936Og.c("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f9464d.p();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f9466f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C0936Og.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
