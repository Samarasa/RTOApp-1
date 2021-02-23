package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.common.util.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.he  reason: case insensitive filesystem */
public class C1799he<ReferenceT> implements C1586ee {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, CopyOnWriteArrayList<C1088Uc<? super ReferenceT>>> f10691a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private ReferenceT f10692b;

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void b(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 2
            boolean r0 = com.google.android.gms.internal.ads.C1018Rk.a((int) r0)     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = "Received GMSG: "
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00c4 }
            int r2 = r1.length()     // Catch:{ all -> 0x00c4 }
            if (r2 == 0) goto L_0x0019
            java.lang.String r0 = r0.concat(r1)     // Catch:{ all -> 0x00c4 }
            goto L_0x001f
        L_0x0019:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x00c4 }
            r1.<init>(r0)     // Catch:{ all -> 0x00c4 }
            r0 = r1
        L_0x001f:
            com.google.android.gms.ads.internal.util.fa.f(r0)     // Catch:{ all -> 0x00c4 }
            java.util.Set r0 = r7.keySet()     // Catch:{ all -> 0x00c4 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00c4 }
        L_0x002a:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00c4 }
            if (r1 == 0) goto L_0x006c
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00c4 }
            java.lang.Object r2 = r7.get(r1)     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00c4 }
            int r3 = r3.length()     // Catch:{ all -> 0x00c4 }
            int r3 = r3 + 4
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00c4 }
            int r4 = r4.length()     // Catch:{ all -> 0x00c4 }
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r4.<init>(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = "  "
            r4.append(r3)     // Catch:{ all -> 0x00c4 }
            r4.append(r1)     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = ": "
            r4.append(r1)     // Catch:{ all -> 0x00c4 }
            r4.append(r2)     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00c4 }
            com.google.android.gms.ads.internal.util.fa.f(r1)     // Catch:{ all -> 0x00c4 }
            goto L_0x002a
        L_0x006c:
            java.util.Map<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<com.google.android.gms.internal.ads.Uc<? super ReferenceT>>> r0 = r5.f10691a     // Catch:{ all -> 0x00c4 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x00c4 }
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x0099
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x00c4 }
            if (r1 != 0) goto L_0x0099
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x00c4 }
        L_0x0080:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x0097
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x00c4 }
            com.google.android.gms.internal.ads.Uc r0 = (com.google.android.gms.internal.ads.C1088Uc) r0     // Catch:{ all -> 0x00c4 }
            com.google.android.gms.internal.ads.PY r1 = com.google.android.gms.internal.ads.C1252_k.f9703e     // Catch:{ all -> 0x00c4 }
            com.google.android.gms.internal.ads.ge r2 = new com.google.android.gms.internal.ads.ge     // Catch:{ all -> 0x00c4 }
            r2.<init>(r5, r0, r7)     // Catch:{ all -> 0x00c4 }
            r1.execute(r2)     // Catch:{ all -> 0x00c4 }
            goto L_0x0080
        L_0x0097:
            monitor-exit(r5)
            return
        L_0x0099:
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r7 = com.google.android.gms.internal.ads.F.Ze     // Catch:{ all -> 0x00c4 }
            com.google.android.gms.internal.ads.B r0 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x00c4 }
            java.lang.Object r7 = r0.a(r7)     // Catch:{ all -> 0x00c4 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x00c4 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x00c4 }
            if (r7 == 0) goto L_0x00c2
            com.google.android.gms.internal.ads.wk r7 = com.google.android.gms.ads.internal.p.g()     // Catch:{ all -> 0x00c4 }
            com.google.android.gms.internal.ads.I r7 = r7.c()     // Catch:{ all -> 0x00c4 }
            if (r7 != 0) goto L_0x00b6
            goto L_0x00c2
        L_0x00b6:
            com.google.android.gms.internal.ads.PY r7 = com.google.android.gms.internal.ads.C1252_k.f9699a     // Catch:{ all -> 0x00c4 }
            com.google.android.gms.internal.ads.je r0 = new com.google.android.gms.internal.ads.je     // Catch:{ all -> 0x00c4 }
            r0.<init>(r6)     // Catch:{ all -> 0x00c4 }
            r7.execute(r0)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r5)
            return
        L_0x00c2:
            monitor-exit(r5)
            return
        L_0x00c4:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x00c8
        L_0x00c7:
            throw r6
        L_0x00c8:
            goto L_0x00c7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1799he.b(java.lang.String, java.util.Map):void");
    }

    public final synchronized void a() {
        this.f10691a.clear();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(C1088Uc uc, Map map) {
        uc.a(this.f10692b, map);
    }

    public final void a(ReferenceT referencet) {
        this.f10692b = referencet;
    }

    public final synchronized void a(String str, n<C1088Uc<? super ReferenceT>> nVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10691a.get(str);
        if (copyOnWriteArrayList != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C1088Uc uc = (C1088Uc) it.next();
                if (nVar.apply(uc)) {
                    arrayList.add(uc);
                }
            }
            copyOnWriteArrayList.removeAll(arrayList);
        }
    }

    public final synchronized void a(String str, C1088Uc<? super ReferenceT> uc) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10691a.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(uc);
        }
    }

    public final boolean a(Uri uri) {
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        b(uri);
        return true;
    }

    public final void b(Uri uri) {
        String path = uri.getPath();
        p.c();
        b(path, oa.b(uri));
    }

    public final synchronized void b(String str, C1088Uc<? super ReferenceT> uc) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10691a.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f10691a.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(uc);
    }

    public final boolean b(String str) {
        return str != null && a(Uri.parse(str));
    }
}
