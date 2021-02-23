package b.h.g;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AtomicReference f2453a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Callable f2454b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ReentrantLock f2455c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AtomicBoolean f2456d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Condition f2457e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ k f2458f;

    j(k kVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
        this.f2458f = kVar;
        this.f2453a = atomicReference;
        this.f2454b = callable;
        this.f2455c = reentrantLock;
        this.f2456d = atomicBoolean;
        this.f2457e = condition;
    }

    public void run() {
        try {
            this.f2453a.set(this.f2454b.call());
        } catch (Exception unused) {
        }
        this.f2455c.lock();
        try {
            this.f2456d.set(false);
            this.f2457e.signal();
        } finally {
            this.f2455c.unlock();
        }
    }
}
