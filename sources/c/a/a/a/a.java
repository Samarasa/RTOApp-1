package c.a.a.a;

import java.util.concurrent.Callable;

class a implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f2873a;

    a(b bVar) {
        this.f2873a = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Void call() {
        /*
            r4 = this;
            c.a.a.a.b r0 = r4.f2873a
            monitor-enter(r0)
            c.a.a.a.b r1 = r4.f2873a     // Catch:{ all -> 0x0028 }
            java.io.Writer r1 = r1.i     // Catch:{ all -> 0x0028 }
            r2 = 0
            if (r1 != 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return r2
        L_0x000e:
            c.a.a.a.b r1 = r4.f2873a     // Catch:{ all -> 0x0028 }
            r1.w()     // Catch:{ all -> 0x0028 }
            c.a.a.a.b r1 = r4.f2873a     // Catch:{ all -> 0x0028 }
            boolean r1 = r1.s()     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0026
            c.a.a.a.b r1 = r4.f2873a     // Catch:{ all -> 0x0028 }
            r1.v()     // Catch:{ all -> 0x0028 }
            c.a.a.a.b r1 = r4.f2873a     // Catch:{ all -> 0x0028 }
            r3 = 0
            int unused = r1.k = r3     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return r2
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.a.call():java.lang.Void");
    }
}
