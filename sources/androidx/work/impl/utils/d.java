package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.work.c;
import androidx.work.e;
import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.b;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.c.o;
import androidx.work.impl.f;
import androidx.work.impl.m;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.l;
import java.util.List;

public class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2002a = h.a("EnqueueRunnable");

    /* renamed from: b  reason: collision with root package name */
    private final f f2003b;

    /* renamed from: c  reason: collision with root package name */
    private final b f2004c = new b();

    public d(f fVar) {
        this.f2003b = fVar;
    }

    private static void a(o oVar) {
        c cVar = oVar.l;
        if (cVar.f() || cVar.i()) {
            String str = oVar.f1892e;
            e.a aVar = new e.a();
            aVar.a(oVar.f1894g);
            aVar.a("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            oVar.f1892e = ConstraintTrackingWorker.class.getName();
            oVar.f1894g = aVar.a();
        }
    }

    private static boolean a(f fVar) {
        boolean a2 = a(fVar.g(), fVar.f(), (String[]) f.a(fVar).toArray(new String[0]), fVar.d(), fVar.b());
        fVar.j();
        return a2;
    }

    private static boolean a(m mVar, String str) {
        try {
            Class<?> cls = Class.forName(str);
            for (androidx.work.impl.d dVar : mVar.f()) {
                if (cls.isAssignableFrom(dVar.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01a2 A[LOOP:6: B:107:0x019c->B:109:0x01a2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01cb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(androidx.work.impl.m r19, java.util.List<? extends androidx.work.q> r20, java.lang.String[] r21, java.lang.String r22, androidx.work.f r23) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            long r4 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r6 = r19.g()
            r8 = 1
            if (r1 == 0) goto L_0x0018
            int r9 = r1.length
            if (r9 <= 0) goto L_0x0018
            r9 = 1
            goto L_0x0019
        L_0x0018:
            r9 = 0
        L_0x0019:
            if (r9 == 0) goto L_0x005d
            int r10 = r1.length
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
        L_0x0020:
            if (r11 >= r10) goto L_0x0060
            r15 = r1[r11]
            androidx.work.impl.c.p r7 = r6.r()
            androidx.work.impl.c.o r7 = r7.d(r15)
            if (r7 != 0) goto L_0x0045
            androidx.work.h r0 = androidx.work.h.a()
            java.lang.String r1 = f2002a
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r3 = 0
            r2[r3] = r15
            java.lang.String r4 = "Prerequisite %s doesn't exist; not enqueuing"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r0.b(r1, r2, r4)
            return r3
        L_0x0045:
            androidx.work.o r7 = r7.f1891d
            androidx.work.o r15 = androidx.work.o.SUCCEEDED
            if (r7 != r15) goto L_0x004d
            r15 = 1
            goto L_0x004e
        L_0x004d:
            r15 = 0
        L_0x004e:
            r12 = r12 & r15
            androidx.work.o r15 = androidx.work.o.FAILED
            if (r7 != r15) goto L_0x0055
            r13 = 1
            goto L_0x005a
        L_0x0055:
            androidx.work.o r15 = androidx.work.o.CANCELLED
            if (r7 != r15) goto L_0x005a
            r14 = 1
        L_0x005a:
            int r11 = r11 + 1
            goto L_0x0020
        L_0x005d:
            r12 = 1
            r13 = 0
            r14 = 0
        L_0x0060:
            boolean r7 = android.text.TextUtils.isEmpty(r22)
            r7 = r7 ^ r8
            if (r7 == 0) goto L_0x006b
            if (r9 != 0) goto L_0x006b
            r10 = 1
            goto L_0x006c
        L_0x006b:
            r10 = 0
        L_0x006c:
            if (r10 == 0) goto L_0x00cc
            androidx.work.impl.c.p r10 = r6.r()
            java.util.List r10 = r10.a((java.lang.String) r2)
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x00cc
            androidx.work.f r11 = androidx.work.f.APPEND
            if (r3 != r11) goto L_0x00ce
            androidx.work.impl.c.b r3 = r6.l()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x008d:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00c0
            java.lang.Object r11 = r10.next()
            androidx.work.impl.c.o$a r11 = (androidx.work.impl.c.o.a) r11
            java.lang.String r15 = r11.f1896a
            boolean r15 = r3.c(r15)
            if (r15 != 0) goto L_0x00be
            androidx.work.o r15 = r11.f1897b
            androidx.work.o r8 = androidx.work.o.SUCCEEDED
            if (r15 != r8) goto L_0x00a9
            r8 = 1
            goto L_0x00aa
        L_0x00a9:
            r8 = 0
        L_0x00aa:
            r8 = r8 & r12
            androidx.work.o r12 = r11.f1897b
            androidx.work.o r15 = androidx.work.o.FAILED
            if (r12 != r15) goto L_0x00b3
            r13 = 1
            goto L_0x00b8
        L_0x00b3:
            androidx.work.o r15 = androidx.work.o.CANCELLED
            if (r12 != r15) goto L_0x00b8
            r14 = 1
        L_0x00b8:
            java.lang.String r11 = r11.f1896a
            r9.add(r11)
            r12 = r8
        L_0x00be:
            r8 = 1
            goto L_0x008d
        L_0x00c0:
            java.lang.Object[] r1 = r9.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r3 = r1.length
            if (r3 <= 0) goto L_0x00cb
            r9 = 1
            goto L_0x00cc
        L_0x00cb:
            r9 = 0
        L_0x00cc:
            r3 = 0
            goto L_0x0113
        L_0x00ce:
            androidx.work.f r8 = androidx.work.f.KEEP
            if (r3 != r8) goto L_0x00ee
            java.util.Iterator r3 = r10.iterator()
        L_0x00d6:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x00ee
            java.lang.Object r8 = r3.next()
            androidx.work.impl.c.o$a r8 = (androidx.work.impl.c.o.a) r8
            androidx.work.o r8 = r8.f1897b
            androidx.work.o r11 = androidx.work.o.ENQUEUED
            if (r8 == r11) goto L_0x00ec
            androidx.work.o r11 = androidx.work.o.RUNNING
            if (r8 != r11) goto L_0x00d6
        L_0x00ec:
            r3 = 0
            return r3
        L_0x00ee:
            r3 = 0
            androidx.work.impl.utils.c r8 = androidx.work.impl.utils.c.a(r2, r0, r3)
            r8.run()
            androidx.work.impl.c.p r8 = r6.r()
            java.util.Iterator r10 = r10.iterator()
        L_0x00fe:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0110
            java.lang.Object r11 = r10.next()
            androidx.work.impl.c.o$a r11 = (androidx.work.impl.c.o.a) r11
            java.lang.String r11 = r11.f1896a
            r8.delete(r11)
            goto L_0x00fe
        L_0x0110:
            r16 = 1
            goto L_0x0115
        L_0x0113:
            r16 = 0
        L_0x0115:
            java.util.Iterator r8 = r20.iterator()
        L_0x0119:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x01d0
            java.lang.Object r10 = r8.next()
            androidx.work.q r10 = (androidx.work.q) r10
            androidx.work.impl.c.o r11 = r10.c()
            if (r9 == 0) goto L_0x013c
            if (r12 != 0) goto L_0x013c
            if (r13 == 0) goto L_0x0134
            androidx.work.o r15 = androidx.work.o.FAILED
        L_0x0131:
            r11.f1891d = r15
            goto L_0x0144
        L_0x0134:
            if (r14 == 0) goto L_0x0139
            androidx.work.o r15 = androidx.work.o.CANCELLED
            goto L_0x0131
        L_0x0139:
            androidx.work.o r15 = androidx.work.o.BLOCKED
            goto L_0x0131
        L_0x013c:
            boolean r15 = r11.d()
            if (r15 != 0) goto L_0x0147
            r11.p = r4
        L_0x0144:
            r17 = r4
            goto L_0x014d
        L_0x0147:
            r17 = r4
            r3 = 0
            r11.p = r3
        L_0x014d:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r3 < r4) goto L_0x015b
            r4 = 25
            if (r3 > r4) goto L_0x015b
        L_0x0157:
            a((androidx.work.impl.c.o) r11)
            goto L_0x016a
        L_0x015b:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 22
            if (r3 > r4) goto L_0x016a
            java.lang.String r3 = "androidx.work.impl.background.gcm.GcmScheduler"
            boolean r3 = a(r0, r3)
            if (r3 == 0) goto L_0x016a
            goto L_0x0157
        L_0x016a:
            androidx.work.o r3 = r11.f1891d
            androidx.work.o r4 = androidx.work.o.ENQUEUED
            if (r3 != r4) goto L_0x0172
            r16 = 1
        L_0x0172:
            androidx.work.impl.c.p r3 = r6.r()
            r3.a((androidx.work.impl.c.o) r11)
            if (r9 == 0) goto L_0x0194
            int r3 = r1.length
            r4 = 0
        L_0x017d:
            if (r4 >= r3) goto L_0x0194
            r5 = r1[r4]
            androidx.work.impl.c.a r11 = new androidx.work.impl.c.a
            java.lang.String r15 = r10.a()
            r11.<init>(r15, r5)
            androidx.work.impl.c.b r5 = r6.l()
            r5.a((androidx.work.impl.c.C0189a) r11)
            int r4 = r4 + 1
            goto L_0x017d
        L_0x0194:
            java.util.Set r3 = r10.b()
            java.util.Iterator r3 = r3.iterator()
        L_0x019c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01b9
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            androidx.work.impl.c.B r5 = r6.s()
            androidx.work.impl.c.A r11 = new androidx.work.impl.c.A
            java.lang.String r15 = r10.a()
            r11.<init>(r4, r15)
            r5.a((androidx.work.impl.c.A) r11)
            goto L_0x019c
        L_0x01b9:
            if (r7 == 0) goto L_0x01cb
            androidx.work.impl.c.k r3 = r6.q()
            androidx.work.impl.c.j r4 = new androidx.work.impl.c.j
            java.lang.String r5 = r10.a()
            r4.<init>(r2, r5)
            r3.a(r4)
        L_0x01cb:
            r4 = r17
            r3 = 0
            goto L_0x0119
        L_0x01d0:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.d.a(androidx.work.impl.m, java.util.List, java.lang.String[], java.lang.String, androidx.work.f):boolean");
    }

    private static boolean b(f fVar) {
        List<f> e2 = fVar.e();
        boolean z = false;
        if (e2 != null) {
            boolean z2 = false;
            for (f next : e2) {
                if (!next.i()) {
                    z2 |= b(next);
                } else {
                    h.a().e(f2002a, String.format("Already enqueued work ids (%s).", new Object[]{TextUtils.join(", ", next.c())}), new Throwable[0]);
                }
            }
            z = z2;
        }
        return a(fVar) | z;
    }

    public boolean a() {
        WorkDatabase g2 = this.f2003b.g().g();
        g2.c();
        try {
            boolean b2 = b(this.f2003b);
            g2.k();
            return b2;
        } finally {
            g2.e();
        }
    }

    public l b() {
        return this.f2004c;
    }

    public void c() {
        m g2 = this.f2003b.g();
        androidx.work.impl.e.a(g2.b(), g2.g(), g2.f());
    }

    public void run() {
        try {
            if (!this.f2003b.h()) {
                if (a()) {
                    f.a(this.f2003b.g().a(), RescheduleReceiver.class, true);
                    c();
                }
                this.f2004c.a(l.f2032a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.f2003b}));
        } catch (Throwable th) {
            this.f2004c.a(new l.a.C0025a(th));
        }
    }
}
