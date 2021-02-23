package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.qb  reason: case insensitive filesystem */
public final class C3204qb<V> {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f13725a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final String f13726b;

    /* renamed from: c  reason: collision with root package name */
    private final C3194ob<V> f13727c;

    /* renamed from: d  reason: collision with root package name */
    private final V f13728d;

    /* renamed from: e  reason: collision with root package name */
    private final V f13729e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f13730f;

    /* renamed from: g  reason: collision with root package name */
    private volatile V f13731g;

    /* renamed from: h  reason: collision with root package name */
    private volatile V f13732h;

    private C3204qb(String str, V v, V v2, C3194ob<V> obVar) {
        this.f13730f = new Object();
        this.f13731g = null;
        this.f13732h = null;
        this.f13726b = str;
        this.f13728d = v;
        this.f13729e = v2;
        this.f13727c = obVar;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x004a */
    public final V a(V r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f13730f
            monitor-enter(r0)
            V r1 = r3.f13731g     // Catch:{ all -> 0x0077 }
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            if (r4 == 0) goto L_0x0009
            return r4
        L_0x0009:
            com.google.android.gms.measurement.internal.He r4 = com.google.android.gms.measurement.internal.C3208rb.f13741a
            if (r4 != 0) goto L_0x0010
            V r4 = r3.f13728d
            return r4
        L_0x0010:
            java.lang.Object r4 = f13725a
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.He.a()     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x0024
            V r0 = r3.f13732h     // Catch:{ all -> 0x0074 }
            if (r0 != 0) goto L_0x0020
            V r0 = r3.f13728d     // Catch:{ all -> 0x0074 }
            goto L_0x0022
        L_0x0020:
            V r0 = r3.f13732h     // Catch:{ all -> 0x0074 }
        L_0x0022:
            monitor-exit(r4)     // Catch:{ all -> 0x0074 }
            return r0
        L_0x0024:
            monitor-exit(r4)     // Catch:{ all -> 0x0074 }
            java.util.List r4 = com.google.android.gms.measurement.internal.C3202q.f13716a     // Catch:{ SecurityException -> 0x005c }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x005c }
        L_0x002d:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x005c }
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x005c }
            com.google.android.gms.measurement.internal.qb r0 = (com.google.android.gms.measurement.internal.C3204qb) r0     // Catch:{ SecurityException -> 0x005c }
            boolean r1 = com.google.android.gms.measurement.internal.He.a()     // Catch:{ SecurityException -> 0x005c }
            if (r1 != 0) goto L_0x0054
            r1 = 0
            com.google.android.gms.measurement.internal.ob<V> r2 = r0.f13727c     // Catch:{ IllegalStateException -> 0x004a }
            if (r2 == 0) goto L_0x004a
            com.google.android.gms.measurement.internal.ob<V> r2 = r0.f13727c     // Catch:{ IllegalStateException -> 0x004a }
            java.lang.Object r1 = r2.a()     // Catch:{ IllegalStateException -> 0x004a }
        L_0x004a:
            java.lang.Object r2 = f13725a     // Catch:{ SecurityException -> 0x005c }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x005c }
            r0.f13732h = r1     // Catch:{ all -> 0x0051 }
            monitor-exit(r2)     // Catch:{ all -> 0x0051 }
            goto L_0x002d
        L_0x0051:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0051 }
            throw r4     // Catch:{ SecurityException -> 0x005c }
        L_0x0054:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x005c }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x005c }
            throw r4     // Catch:{ SecurityException -> 0x005c }
        L_0x005c:
            com.google.android.gms.measurement.internal.ob<V> r4 = r3.f13727c
            if (r4 != 0) goto L_0x0065
            com.google.android.gms.measurement.internal.He r4 = com.google.android.gms.measurement.internal.C3208rb.f13741a
            V r4 = r3.f13728d
            return r4
        L_0x0065:
            java.lang.Object r4 = r4.a()     // Catch:{ SecurityException -> 0x006f, IllegalStateException -> 0x006a }
            return r4
        L_0x006a:
            com.google.android.gms.measurement.internal.He r4 = com.google.android.gms.measurement.internal.C3208rb.f13741a
            V r4 = r3.f13728d
            return r4
        L_0x006f:
            com.google.android.gms.measurement.internal.He r4 = com.google.android.gms.measurement.internal.C3208rb.f13741a
            V r4 = r3.f13728d
            return r4
        L_0x0074:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0074 }
            throw r0
        L_0x0077:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            goto L_0x007b
        L_0x007a:
            throw r4
        L_0x007b:
            goto L_0x007a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3204qb.a(java.lang.Object):java.lang.Object");
    }

    public final String a() {
        return this.f13726b;
    }
}
