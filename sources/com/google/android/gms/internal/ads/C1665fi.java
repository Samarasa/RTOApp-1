package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fi  reason: case insensitive filesystem */
public final class C1665fi {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<byte[]> f10434a = new C2943xj();

    /* renamed from: b  reason: collision with root package name */
    private final List<byte[]> f10435b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final List<byte[]> f10436c = new ArrayList(64);

    /* renamed from: d  reason: collision with root package name */
    private int f10437d = 0;

    /* renamed from: e  reason: collision with root package name */
    private final int f10438e = 4096;

    public C1665fi(int i) {
    }

    private final synchronized void a() {
        while (this.f10437d > this.f10438e) {
            byte[] remove = this.f10435b.remove(0);
            this.f10436c.remove(remove);
            this.f10437d -= remove.length;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(byte[] r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x002e
            int r0 = r3.length     // Catch:{ all -> 0x002b }
            int r1 = r2.f10438e     // Catch:{ all -> 0x002b }
            if (r0 <= r1) goto L_0x0009
            goto L_0x002e
        L_0x0009:
            java.util.List<byte[]> r0 = r2.f10435b     // Catch:{ all -> 0x002b }
            r0.add(r3)     // Catch:{ all -> 0x002b }
            java.util.List<byte[]> r0 = r2.f10436c     // Catch:{ all -> 0x002b }
            java.util.Comparator<byte[]> r1 = f10434a     // Catch:{ all -> 0x002b }
            int r0 = java.util.Collections.binarySearch(r0, r3, r1)     // Catch:{ all -> 0x002b }
            if (r0 >= 0) goto L_0x001b
            int r0 = -r0
            int r0 = r0 + -1
        L_0x001b:
            java.util.List<byte[]> r1 = r2.f10436c     // Catch:{ all -> 0x002b }
            r1.add(r0, r3)     // Catch:{ all -> 0x002b }
            int r0 = r2.f10437d     // Catch:{ all -> 0x002b }
            int r3 = r3.length     // Catch:{ all -> 0x002b }
            int r0 = r0 + r3
            r2.f10437d = r0     // Catch:{ all -> 0x002b }
            r2.a()     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x002e:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1665fi.a(byte[]):void");
    }

    public final synchronized byte[] a(int i) {
        for (int i2 = 0; i2 < this.f10436c.size(); i2++) {
            byte[] bArr = this.f10436c.get(i2);
            if (bArr.length >= i) {
                this.f10437d -= bArr.length;
                this.f10436c.remove(i2);
                this.f10435b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }
}
