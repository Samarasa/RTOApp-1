package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.YX;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.jY  reason: case insensitive filesystem */
abstract class C1930jY<OutputT> extends YX.j<OutputT> {

    /* renamed from: h  reason: collision with root package name */
    private static final b f10945h;
    private static final Logger i = Logger.getLogger(C1930jY.class.getName());
    /* access modifiers changed from: private */
    public volatile Set<Throwable> j = null;
    private volatile int k;

    /* renamed from: com.google.android.gms.internal.ads.jY$a */
    static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicReferenceFieldUpdater<C1930jY, Set<Throwable>> f10946a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicIntegerFieldUpdater<C1930jY> f10947b;

        a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f10946a = atomicReferenceFieldUpdater;
            this.f10947b = atomicIntegerFieldUpdater;
        }

        /* access modifiers changed from: package-private */
        public final int a(C1930jY jYVar) {
            return this.f10947b.decrementAndGet(jYVar);
        }

        /* access modifiers changed from: package-private */
        public final void a(C1930jY jYVar, Set<Throwable> set, Set<Throwable> set2) {
            this.f10946a.compareAndSet(jYVar, (Object) null, set2);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.jY$b */
    static abstract class b {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract int a(C1930jY jYVar);

        /* access modifiers changed from: package-private */
        public abstract void a(C1930jY jYVar, Set<Throwable> set, Set<Throwable> set2);
    }

    /* renamed from: com.google.android.gms.internal.ads.jY$c */
    static final class c extends b {
        private c() {
            super();
        }

        /* access modifiers changed from: package-private */
        public final int a(C1930jY jYVar) {
            int b2;
            synchronized (jYVar) {
                b2 = C1930jY.b(jYVar);
            }
            return b2;
        }

        /* access modifiers changed from: package-private */
        public final void a(C1930jY jYVar, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (jYVar) {
                if (jYVar.j == null) {
                    Set unused = jYVar.j = set2;
                }
            }
        }
    }

    static {
        Throwable th;
        b bVar;
        try {
            bVar = new a(AtomicReferenceFieldUpdater.newUpdater(C1930jY.class, Set.class, "j"), AtomicIntegerFieldUpdater.newUpdater(C1930jY.class, "k"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            bVar = new c();
        }
        f10945h = bVar;
        if (th != null) {
            i.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    C1930jY(int i2) {
        this.k = i2;
    }

    static /* synthetic */ int b(C1930jY jYVar) {
        int i2 = jYVar.k - 1;
        jYVar.k = i2;
        return i2;
    }

    /* access modifiers changed from: package-private */
    public abstract void a(Set<Throwable> set);

    /* access modifiers changed from: package-private */
    public final Set<Throwable> h() {
        Set<Throwable> set = this.j;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        a((Set<Throwable>) newSetFromMap);
        f10945h.a(this, (Set<Throwable>) null, newSetFromMap);
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public final int i() {
        return f10945h.a(this);
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        this.j = null;
    }
}
