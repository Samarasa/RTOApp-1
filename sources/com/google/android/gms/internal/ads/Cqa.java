package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public final class Cqa extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<C1339b<?>> f6479a;

    /* renamed from: b  reason: collision with root package name */
    private final _qa f6480b;

    /* renamed from: c  reason: collision with root package name */
    private final Xja f6481c;

    /* renamed from: d  reason: collision with root package name */
    private final C1089Ud f6482d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f6483e = false;

    public Cqa(BlockingQueue<C1339b<?>> blockingQueue, _qa _qa, Xja xja, C1089Ud ud) {
        this.f6479a = blockingQueue;
        this.f6480b = _qa;
        this.f6481c = xja;
        this.f6482d = ud;
    }

    private final void b() {
        C1339b take = this.f6479a.take();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        take.a(3);
        try {
            take.a("network-queue-take");
            take.m();
            TrafficStats.setThreadStatsTag(take.e());
            Ara a2 = this.f6480b.a(take);
            take.a("network-http-complete");
            if (!a2.f6215e || !take.u()) {
                C3073zd a3 = take.a(a2);
                take.a("network-parse-complete");
                if (take.q() && a3.f13079b != null) {
                    this.f6481c.a(take.n(), a3.f13079b);
                    take.a("network-cache-written");
                }
                take.t();
                this.f6482d.a((C1339b<?>) take, (C3073zd<?>) a3);
                take.a((C3073zd<?>) a3);
                take.a(4);
                return;
            }
            take.b("not-modified");
            take.v();
        } catch (C1143Wf e2) {
            e2.a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f6482d.a((C1339b<?>) take, e2);
            take.v();
        } catch (Exception e3) {
            C0936Og.a(e3, "Unhandled exception %s", e3.toString());
            C1143Wf wf = new C1143Wf((Throwable) e3);
            wf.a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f6482d.a((C1339b<?>) take, wf);
            take.v();
        } finally {
            take.a(4);
        }
    }

    public final void a() {
        this.f6483e = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f6483e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C0936Og.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
