package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.cb  reason: case insensitive filesystem */
public final class C1439cb {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f10048a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<C1339b<?>> f10049b;

    /* renamed from: c  reason: collision with root package name */
    private final PriorityBlockingQueue<C1339b<?>> f10050c;

    /* renamed from: d  reason: collision with root package name */
    private final PriorityBlockingQueue<C1339b<?>> f10051d;

    /* renamed from: e  reason: collision with root package name */
    private final Xja f10052e;

    /* renamed from: f  reason: collision with root package name */
    private final _qa f10053f;

    /* renamed from: g  reason: collision with root package name */
    private final C1089Ud f10054g;

    /* renamed from: h  reason: collision with root package name */
    private final Cqa[] f10055h;
    private Yka i;
    private final List<C1370bc> j;
    private final List<C3000yc> k;

    public C1439cb(Xja xja, _qa _qa) {
        this(xja, _qa, 4);
    }

    private C1439cb(Xja xja, _qa _qa, int i2) {
        this(xja, _qa, 4, new C3096zoa(new Handler(Looper.getMainLooper())));
    }

    private C1439cb(Xja xja, _qa _qa, int i2, C1089Ud ud) {
        this.f10048a = new AtomicInteger();
        this.f10049b = new HashSet();
        this.f10050c = new PriorityBlockingQueue<>();
        this.f10051d = new PriorityBlockingQueue<>();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.f10052e = xja;
        this.f10053f = _qa;
        this.f10055h = new Cqa[4];
        this.f10054g = ud;
    }

    public final <T> C1339b<T> a(C1339b<T> bVar) {
        bVar.a(this);
        synchronized (this.f10049b) {
            this.f10049b.add(bVar);
        }
        bVar.b(this.f10048a.incrementAndGet());
        bVar.a("add-to-queue");
        a(bVar, 0);
        (!bVar.q() ? this.f10051d : this.f10050c).add(bVar);
        return bVar;
    }

    public final void a() {
        Yka yka = this.i;
        if (yka != null) {
            yka.a();
        }
        for (Cqa cqa : this.f10055h) {
            if (cqa != null) {
                cqa.a();
            }
        }
        this.i = new Yka(this.f10050c, this.f10051d, this.f10052e, this.f10054g);
        this.i.start();
        for (int i2 = 0; i2 < this.f10055h.length; i2++) {
            Cqa cqa2 = new Cqa(this.f10051d, this.f10053f, this.f10052e, this.f10054g);
            this.f10055h[i2] = cqa2;
            cqa2.start();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(C1339b<?> bVar, int i2) {
        synchronized (this.k) {
            for (C3000yc a2 : this.k) {
                a2.a(bVar, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final <T> void b(C1339b<T> bVar) {
        synchronized (this.f10049b) {
            this.f10049b.remove(bVar);
        }
        synchronized (this.j) {
            for (C1370bc a2 : this.j) {
                a2.a(bVar);
            }
        }
        a(bVar, 5);
    }
}
