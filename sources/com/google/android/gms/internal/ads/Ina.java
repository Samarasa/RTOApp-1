package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class Ina {

    /* renamed from: a  reason: collision with root package name */
    private final Object f7346a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private int f7347b;

    /* renamed from: c  reason: collision with root package name */
    private List<Fna> f7348c = new LinkedList();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.Fna a(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f7346a
            monitor-enter(r0)
            java.util.List<com.google.android.gms.internal.ads.Fna> r1 = r7.f7348c     // Catch:{ all -> 0x005a }
            int r1 = r1.size()     // Catch:{ all -> 0x005a }
            r2 = 0
            if (r1 != 0) goto L_0x0013
            java.lang.String r8 = "Queue empty"
            com.google.android.gms.internal.ads.C1018Rk.a((java.lang.String) r8)     // Catch:{ all -> 0x005a }
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return r2
        L_0x0013:
            java.util.List<com.google.android.gms.internal.ads.Fna> r1 = r7.f7348c     // Catch:{ all -> 0x005a }
            int r1 = r1.size()     // Catch:{ all -> 0x005a }
            r3 = 2
            r4 = 0
            if (r1 < r3) goto L_0x0045
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            java.util.List<com.google.android.gms.internal.ads.Fna> r1 = r7.f7348c     // Catch:{ all -> 0x005a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x005a }
            r3 = 0
        L_0x0026:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x005a }
            if (r5 == 0) goto L_0x003e
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x005a }
            com.google.android.gms.internal.ads.Fna r5 = (com.google.android.gms.internal.ads.Fna) r5     // Catch:{ all -> 0x005a }
            int r6 = r5.a()     // Catch:{ all -> 0x005a }
            if (r6 <= r8) goto L_0x003b
            r4 = r3
            r2 = r5
            r8 = r6
        L_0x003b:
            int r3 = r3 + 1
            goto L_0x0026
        L_0x003e:
            java.util.List<com.google.android.gms.internal.ads.Fna> r8 = r7.f7348c     // Catch:{ all -> 0x005a }
            r8.remove(r4)     // Catch:{ all -> 0x005a }
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return r2
        L_0x0045:
            java.util.List<com.google.android.gms.internal.ads.Fna> r1 = r7.f7348c     // Catch:{ all -> 0x005a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x005a }
            com.google.android.gms.internal.ads.Fna r1 = (com.google.android.gms.internal.ads.Fna) r1     // Catch:{ all -> 0x005a }
            if (r8 == 0) goto L_0x0055
            java.util.List<com.google.android.gms.internal.ads.Fna> r8 = r7.f7348c     // Catch:{ all -> 0x005a }
            r8.remove(r4)     // Catch:{ all -> 0x005a }
            goto L_0x0058
        L_0x0055:
            r1.f()     // Catch:{ all -> 0x005a }
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return r1
        L_0x005a:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            goto L_0x005e
        L_0x005d:
            throw r8
        L_0x005e:
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Ina.a(boolean):com.google.android.gms.internal.ads.Fna");
    }

    public final boolean a(Fna fna) {
        synchronized (this.f7346a) {
            return this.f7348c.contains(fna);
        }
    }

    public final boolean b(Fna fna) {
        synchronized (this.f7346a) {
            Iterator<Fna> it = this.f7348c.iterator();
            while (it.hasNext()) {
                Fna next = it.next();
                if (!p.g().i().i()) {
                    if (fna != next && next.c().equals(fna.c())) {
                        it.remove();
                        return true;
                    }
                } else if (!p.g().i().d() && fna != next && next.e().equals(fna.e())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void c(Fna fna) {
        synchronized (this.f7346a) {
            if (this.f7348c.size() >= 10) {
                int size = this.f7348c.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                C1018Rk.a(sb.toString());
                this.f7348c.remove(0);
            }
            int i = this.f7347b;
            this.f7347b = i + 1;
            fna.a(i);
            fna.i();
            this.f7348c.add(fna);
        }
    }
}
