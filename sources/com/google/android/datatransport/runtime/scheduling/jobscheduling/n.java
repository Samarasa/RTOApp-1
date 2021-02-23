package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import c.b.b.a.a.c.a.C0248d;
import c.b.b.a.a.c.a.i;
import c.b.b.a.a.d.b;
import c.b.b.a.a.e.a;
import c.b.b.a.a.l;
import c.b.b.a.a.p;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.h;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public class n {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5321a;

    /* renamed from: b  reason: collision with root package name */
    private final f f5322b;

    /* renamed from: c  reason: collision with root package name */
    private final C0248d f5323c;

    /* renamed from: d  reason: collision with root package name */
    private final t f5324d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f5325e;

    /* renamed from: f  reason: collision with root package name */
    private final b f5326f;

    /* renamed from: g  reason: collision with root package name */
    private final a f5327g;

    public n(Context context, f fVar, C0248d dVar, t tVar, Executor executor, b bVar, a aVar) {
        this.f5321a = context;
        this.f5322b = fVar;
        this.f5323c = dVar;
        this.f5324d = tVar;
        this.f5325e = executor;
        this.f5326f = bVar;
        this.f5327g = aVar;
    }

    static /* synthetic */ Object a(n nVar, h hVar, Iterable iterable, p pVar, int i) {
        if (hVar.c() == h.a.TRANSIENT_ERROR) {
            nVar.f5323c.b((Iterable<i>) iterable);
            nVar.f5324d.a(pVar, i + 1);
            return null;
        }
        nVar.f5323c.a((Iterable<i>) iterable);
        if (hVar.c() == h.a.OK) {
            nVar.f5323c.a(pVar, nVar.f5327g.a() + hVar.b());
        }
        if (!nVar.f5323c.c(pVar)) {
            return null;
        }
        nVar.f5324d.a(pVar, 1);
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r5.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r2.f5324d.a(r3, r4 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void a(com.google.android.datatransport.runtime.scheduling.jobscheduling.n r2, c.b.b.a.a.p r3, int r4, java.lang.Runnable r5) {
        /*
            c.b.b.a.a.d.b r0 = r2.f5326f     // Catch:{ a -> 0x0024 }
            c.b.b.a.a.c.a.d r1 = r2.f5323c     // Catch:{ a -> 0x0024 }
            r1.getClass()     // Catch:{ a -> 0x0024 }
            c.b.b.a.a.d.b$a r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.l.a(r1)     // Catch:{ a -> 0x0024 }
            r0.a(r1)     // Catch:{ a -> 0x0024 }
            boolean r0 = r2.a()     // Catch:{ a -> 0x0024 }
            if (r0 != 0) goto L_0x001e
            c.b.b.a.a.d.b r0 = r2.f5326f     // Catch:{ a -> 0x0024 }
            c.b.b.a.a.d.b$a r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.m.a(r2, r3, r4)     // Catch:{ a -> 0x0024 }
            r0.a(r1)     // Catch:{ a -> 0x0024 }
            goto L_0x002b
        L_0x001e:
            r2.a((c.b.b.a.a.p) r3, (int) r4)     // Catch:{ a -> 0x0024 }
            goto L_0x002b
        L_0x0022:
            r2 = move-exception
            goto L_0x002f
        L_0x0024:
            com.google.android.datatransport.runtime.scheduling.jobscheduling.t r2 = r2.f5324d     // Catch:{ all -> 0x0022 }
            int r4 = r4 + 1
            r2.a(r3, r4)     // Catch:{ all -> 0x0022 }
        L_0x002b:
            r5.run()
            return
        L_0x002f:
            r5.run()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.n.a(com.google.android.datatransport.runtime.scheduling.jobscheduling.n, c.b.b.a.a.p, int, java.lang.Runnable):void");
    }

    /* access modifiers changed from: package-private */
    public void a(p pVar, int i) {
        h hVar;
        com.google.android.datatransport.runtime.backends.n a2 = this.f5322b.a(pVar.b());
        Iterable<i> iterable = (Iterable) this.f5326f.a(j.a(this, pVar));
        if (iterable.iterator().hasNext()) {
            if (a2 == null) {
                c.b.b.a.a.a.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", (Object) pVar);
                hVar = h.a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (i a3 : iterable) {
                    arrayList.add(a3.a());
                }
                g.a a4 = g.a();
                a4.a((Iterable<l>) arrayList);
                a4.a(pVar.c());
                hVar = a2.a(a4.a());
            }
            this.f5326f.a(k.a(this, hVar, iterable, pVar, i));
        }
    }

    public void a(p pVar, int i, Runnable runnable) {
        this.f5325e.execute(i.a(this, pVar, i, runnable));
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f5321a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
