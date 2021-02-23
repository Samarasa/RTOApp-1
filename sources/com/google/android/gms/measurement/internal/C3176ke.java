package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import b.e.b;
import c.b.b.b.b.c.c;
import c.b.b.b.d.f.C0298ba;
import c.b.b.b.d.f.C0419se;
import c.b.b.b.d.f.C0426te;
import c.b.b.b.d.f.Le;
import c.b.b.b.d.f.M;
import c.b.b.b.d.f.T;
import c.b.b.b.d.f.Tf;
import c.b.b.b.d.f.V;
import c.b.b.b.d.f.X;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.e;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.measurement.internal.ke  reason: case insensitive filesystem */
public class C3176ke implements C3244yc {

    /* renamed from: a  reason: collision with root package name */
    private static volatile C3176ke f13641a;

    /* renamed from: b  reason: collision with root package name */
    private _b f13642b;

    /* renamed from: c  reason: collision with root package name */
    private Gb f13643c;

    /* renamed from: d  reason: collision with root package name */
    private C3129d f13644d;

    /* renamed from: e  reason: collision with root package name */
    private Jb f13645e;

    /* renamed from: f  reason: collision with root package name */
    private C3152ge f13646f;

    /* renamed from: g  reason: collision with root package name */
    private ye f13647g;

    /* renamed from: h  reason: collision with root package name */
    private final oe f13648h;
    private C3163id i;
    private final C3144fc j;
    private boolean k;
    private boolean l;
    private boolean m;
    private long n;
    private List<Runnable> o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private FileLock u;
    private FileChannel v;
    private List<Long> w;
    private List<Long> x;
    private long y;

    /* renamed from: com.google.android.gms.measurement.internal.ke$a */
    class a implements C3141f {

        /* renamed from: a  reason: collision with root package name */
        X f13649a;

        /* renamed from: b  reason: collision with root package name */
        List<Long> f13650b;

        /* renamed from: c  reason: collision with root package name */
        List<T> f13651c;

        /* renamed from: d  reason: collision with root package name */
        private long f13652d;

        private a() {
        }

        /* synthetic */ a(C3176ke keVar, C3170je jeVar) {
            this();
        }

        private static long a(T t) {
            return ((t.s() / 1000) / 60) / 60;
        }

        public final void a(X x) {
            C0563t.a(x);
            this.f13649a = x;
        }

        public final boolean a(long j, T t) {
            C0563t.a(t);
            if (this.f13651c == null) {
                this.f13651c = new ArrayList();
            }
            if (this.f13650b == null) {
                this.f13650b = new ArrayList();
            }
            if (this.f13651c.size() > 0 && a(this.f13651c.get(0)) != a(t)) {
                return false;
            }
            long f2 = this.f13652d + ((long) t.f());
            if (f2 >= ((long) Math.max(0, C3202q.k.a(null).intValue()))) {
                return false;
            }
            this.f13652d = f2;
            this.f13651c.add(t);
            this.f13650b.add(Long.valueOf(j));
            return this.f13651c.size() < Math.max(1, C3202q.l.a(null).intValue());
        }
    }

    private C3176ke(pe peVar) {
        this(peVar, (C3144fc) null);
    }

    private C3176ke(pe peVar, C3144fc fcVar) {
        this.k = false;
        C0563t.a(peVar);
        this.j = C3144fc.a(peVar.f13715a, (Tf) null);
        this.y = -1;
        oe oeVar = new oe(this);
        oeVar.s();
        this.f13648h = oeVar;
        Gb gb = new Gb(this);
        gb.s();
        this.f13643c = gb;
        _b _bVar = new _b(this);
        _bVar.s();
        this.f13642b = _bVar;
        this.j.g().a((Runnable) new C3170je(this, peVar));
    }

    private final long A() {
        long a2 = this.j.j().a();
        Lb p2 = this.j.p();
        p2.o();
        p2.c();
        long a3 = p2.j.a();
        if (a3 == 0) {
            a3 = 1 + ((long) p2.k().u().nextInt(86400000));
            p2.j.a(a3);
        }
        return ((((a2 + a3) / 1000) / 60) / 60) / 24;
    }

    private final boolean B() {
        z();
        p();
        return e().M() || !TextUtils.isEmpty(e().w());
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void C() {
        /*
            r21 = this;
            r0 = r21
            r21.z()
            r21.p()
            boolean r1 = r21.w()
            if (r1 != 0) goto L_0x001d
            com.google.android.gms.measurement.internal.fc r1 = r0.j
            com.google.android.gms.measurement.internal.Ie r1 = r1.o()
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C3202q.ea
            boolean r1 = r1.a((com.google.android.gms.measurement.internal.C3204qb<java.lang.Boolean>) r2)
            if (r1 != 0) goto L_0x001d
            return
        L_0x001d:
            long r1 = r0.n
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0062
            com.google.android.gms.measurement.internal.fc r1 = r0.j
            com.google.android.gms.common.util.e r1 = r1.j()
            long r1 = r1.b()
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r0.n
            long r1 = r1 - r7
            long r1 = java.lang.Math.abs(r1)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0060
            com.google.android.gms.measurement.internal.fc r1 = r0.j
            com.google.android.gms.measurement.internal.Bb r1 = r1.h()
            com.google.android.gms.measurement.internal.Db r1 = r1.B()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.a(r3, r2)
            com.google.android.gms.measurement.internal.Jb r1 = r21.x()
            r1.b()
            com.google.android.gms.measurement.internal.ge r1 = r21.y()
            r1.u()
            return
        L_0x0060:
            r0.n = r3
        L_0x0062:
            com.google.android.gms.measurement.internal.fc r1 = r0.j
            boolean r1 = r1.m()
            if (r1 == 0) goto L_0x024f
            boolean r1 = r21.B()
            if (r1 != 0) goto L_0x0072
            goto L_0x024f
        L_0x0072:
            com.google.android.gms.measurement.internal.fc r1 = r0.j
            com.google.android.gms.common.util.e r1 = r1.j()
            long r1 = r1.a()
            com.google.android.gms.measurement.internal.qb<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C3202q.C
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.d r5 = r21.e()
            boolean r5 = r5.N()
            if (r5 != 0) goto L_0x00a4
            com.google.android.gms.measurement.internal.d r5 = r21.e()
            boolean r5 = r5.I()
            if (r5 == 0) goto L_0x00a2
            goto L_0x00a4
        L_0x00a2:
            r5 = 0
            goto L_0x00a5
        L_0x00a4:
            r5 = 1
        L_0x00a5:
            if (r5 == 0) goto L_0x00c5
            com.google.android.gms.measurement.internal.fc r10 = r0.j
            com.google.android.gms.measurement.internal.Ie r10 = r10.o()
            java.lang.String r10 = r10.u()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x00c2
            java.lang.String r11 = ".none."
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00c2
            com.google.android.gms.measurement.internal.qb<java.lang.Long> r10 = com.google.android.gms.measurement.internal.C3202q.x
            goto L_0x00c7
        L_0x00c2:
            com.google.android.gms.measurement.internal.qb<java.lang.Long> r10 = com.google.android.gms.measurement.internal.C3202q.w
            goto L_0x00c7
        L_0x00c5:
            com.google.android.gms.measurement.internal.qb<java.lang.Long> r10 = com.google.android.gms.measurement.internal.C3202q.v
        L_0x00c7:
            java.lang.Object r10 = r10.a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            com.google.android.gms.measurement.internal.fc r12 = r0.j
            com.google.android.gms.measurement.internal.Lb r12 = r12.p()
            com.google.android.gms.measurement.internal.Qb r12 = r12.f13337f
            long r12 = r12.a()
            com.google.android.gms.measurement.internal.fc r14 = r0.j
            com.google.android.gms.measurement.internal.Lb r14 = r14.p()
            com.google.android.gms.measurement.internal.Qb r14 = r14.f13338g
            long r14 = r14.a()
            com.google.android.gms.measurement.internal.d r16 = r21.e()
            r17 = r10
            long r9 = r16.K()
            com.google.android.gms.measurement.internal.d r11 = r21.e()
            r19 = r7
            long r6 = r11.L()
            long r6 = java.lang.Math.max(r9, r6)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x010c
        L_0x0109:
            r8 = r3
            goto L_0x0182
        L_0x010c:
            long r6 = r6 - r1
            long r6 = java.lang.Math.abs(r6)
            long r6 = r1 - r6
            long r12 = r12 - r1
            long r8 = java.lang.Math.abs(r12)
            long r8 = r1 - r8
            long r14 = r14 - r1
            long r10 = java.lang.Math.abs(r14)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r6 + r19
            if (r5 == 0) goto L_0x0132
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0132
            long r10 = java.lang.Math.min(r6, r8)
            long r10 = r10 + r17
        L_0x0132:
            com.google.android.gms.measurement.internal.oe r5 = r21.m()
            r12 = r17
            boolean r5 = r5.a((long) r8, (long) r12)
            if (r5 != 0) goto L_0x0140
            long r8 = r8 + r12
            goto L_0x0141
        L_0x0140:
            r8 = r10
        L_0x0141:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0182
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0182
            r5 = 0
        L_0x014a:
            r6 = 20
            com.google.android.gms.measurement.internal.qb<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C3202q.E
            r10 = 0
            java.lang.Object r7 = r7.a(r10)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r11 = 0
            int r7 = java.lang.Math.max(r11, r7)
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L_0x0109
            r6 = 1
            long r6 = r6 << r5
            com.google.android.gms.measurement.internal.qb<java.lang.Long> r12 = com.google.android.gms.measurement.internal.C3202q.D
            java.lang.Object r12 = r12.a(r10)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r3, r12)
            long r12 = r12 * r6
            long r8 = r8 + r12
            int r6 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x017f
            goto L_0x0182
        L_0x017f:
            int r5 = r5 + 1
            goto L_0x014a
        L_0x0182:
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x01a4
            com.google.android.gms.measurement.internal.fc r1 = r0.j
            com.google.android.gms.measurement.internal.Bb r1 = r1.h()
            com.google.android.gms.measurement.internal.Db r1 = r1.B()
            java.lang.String r2 = "Next upload time is 0"
            r1.a(r2)
            com.google.android.gms.measurement.internal.Jb r1 = r21.x()
            r1.b()
            com.google.android.gms.measurement.internal.ge r1 = r21.y()
            r1.u()
            return
        L_0x01a4:
            com.google.android.gms.measurement.internal.Gb r1 = r21.d()
            boolean r1 = r1.u()
            if (r1 != 0) goto L_0x01cc
            com.google.android.gms.measurement.internal.fc r1 = r0.j
            com.google.android.gms.measurement.internal.Bb r1 = r1.h()
            com.google.android.gms.measurement.internal.Db r1 = r1.B()
            java.lang.String r2 = "No network"
            r1.a(r2)
            com.google.android.gms.measurement.internal.Jb r1 = r21.x()
            r1.a()
            com.google.android.gms.measurement.internal.ge r1 = r21.y()
            r1.u()
            return
        L_0x01cc:
            com.google.android.gms.measurement.internal.fc r1 = r0.j
            com.google.android.gms.measurement.internal.Lb r1 = r1.p()
            com.google.android.gms.measurement.internal.Qb r1 = r1.f13339h
            long r1 = r1.a()
            com.google.android.gms.measurement.internal.qb<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C3202q.t
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.oe r7 = r21.m()
            boolean r7 = r7.a((long) r1, (long) r5)
            if (r7 != 0) goto L_0x01f8
            long r1 = r1 + r5
            long r8 = java.lang.Math.max(r8, r1)
        L_0x01f8:
            com.google.android.gms.measurement.internal.Jb r1 = r21.x()
            r1.b()
            com.google.android.gms.measurement.internal.fc r1 = r0.j
            com.google.android.gms.common.util.e r1 = r1.j()
            long r1 = r1.a()
            long r8 = r8 - r1
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0234
            com.google.android.gms.measurement.internal.qb<java.lang.Long> r1 = com.google.android.gms.measurement.internal.C3202q.y
            r2 = 0
            java.lang.Object r1 = r1.a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r8 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.fc r1 = r0.j
            com.google.android.gms.measurement.internal.Lb r1 = r1.p()
            com.google.android.gms.measurement.internal.Qb r1 = r1.f13337f
            com.google.android.gms.measurement.internal.fc r2 = r0.j
            com.google.android.gms.common.util.e r2 = r2.j()
            long r2 = r2.a()
            r1.a(r2)
        L_0x0234:
            com.google.android.gms.measurement.internal.fc r1 = r0.j
            com.google.android.gms.measurement.internal.Bb r1 = r1.h()
            com.google.android.gms.measurement.internal.Db r1 = r1.B()
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.a(r3, r2)
            com.google.android.gms.measurement.internal.ge r1 = r21.y()
            r1.a(r8)
            return
        L_0x024f:
            com.google.android.gms.measurement.internal.fc r1 = r0.j
            com.google.android.gms.measurement.internal.Bb r1 = r1.h()
            com.google.android.gms.measurement.internal.Db r1 = r1.B()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.a(r2)
            com.google.android.gms.measurement.internal.Jb r1 = r21.x()
            r1.b()
            com.google.android.gms.measurement.internal.ge r1 = r21.y()
            r1.u()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3176ke.C():void");
    }

    private final int a(FileChannel fileChannel) {
        z();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.j.h().t().a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    this.j.h().w().a("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            return allocate.getInt();
        } catch (IOException e2) {
            this.j.h().t().a("Failed to read from channel", e2);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.measurement.internal.C3138ec a(com.google.android.gms.measurement.internal.xe r9, com.google.android.gms.measurement.internal.C3138ec r10, java.lang.String r11) {
        /*
            r8 = this;
            r0 = 1
            if (r10 != 0) goto L_0x001e
            com.google.android.gms.measurement.internal.ec r10 = new com.google.android.gms.measurement.internal.ec
            com.google.android.gms.measurement.internal.fc r1 = r8.j
            java.lang.String r2 = r9.f13822a
            r10.<init>(r1, r2)
            com.google.android.gms.measurement.internal.fc r1 = r8.j
            com.google.android.gms.measurement.internal.se r1 = r1.v()
            java.lang.String r1 = r1.x()
            r10.a((java.lang.String) r1)
            r10.e((java.lang.String) r11)
        L_0x001c:
            r11 = 1
            goto L_0x003a
        L_0x001e:
            java.lang.String r1 = r10.q()
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L_0x0039
            r10.e((java.lang.String) r11)
            com.google.android.gms.measurement.internal.fc r11 = r8.j
            com.google.android.gms.measurement.internal.se r11 = r11.v()
            java.lang.String r11 = r11.x()
            r10.a((java.lang.String) r11)
            goto L_0x001c
        L_0x0039:
            r11 = 0
        L_0x003a:
            java.lang.String r1 = r9.f13823b
            java.lang.String r2 = r10.n()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x004c
            java.lang.String r11 = r9.f13823b
            r10.b((java.lang.String) r11)
            r11 = 1
        L_0x004c:
            java.lang.String r1 = r9.r
            java.lang.String r2 = r10.o()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x005e
            java.lang.String r11 = r9.r
            r10.c((java.lang.String) r11)
            r11 = 1
        L_0x005e:
            boolean r1 = c.b.b.b.d.f.Le.b()
            if (r1 == 0) goto L_0x0088
            com.google.android.gms.measurement.internal.fc r1 = r8.j
            com.google.android.gms.measurement.internal.Ie r1 = r1.o()
            java.lang.String r2 = r10.l()
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C3202q.Fa
            boolean r1 = r1.e(r2, r3)
            if (r1 == 0) goto L_0x0088
            java.lang.String r1 = r9.v
            java.lang.String r2 = r10.p()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x0088
            java.lang.String r11 = r9.v
            r10.d((java.lang.String) r11)
            r11 = 1
        L_0x0088:
            java.lang.String r1 = r9.k
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00a2
            java.lang.String r1 = r9.k
            java.lang.String r2 = r10.r()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00a2
            java.lang.String r11 = r9.k
            r10.f((java.lang.String) r11)
            r11 = 1
        L_0x00a2:
            long r1 = r9.f13826e
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00b8
            long r5 = r10.x()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00b8
            long r1 = r9.f13826e
            r10.d((long) r1)
            r11 = 1
        L_0x00b8:
            java.lang.String r1 = r9.f13824c
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00d2
            java.lang.String r1 = r9.f13824c
            java.lang.String r2 = r10.u()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00d2
            java.lang.String r11 = r9.f13824c
            r10.g((java.lang.String) r11)
            r11 = 1
        L_0x00d2:
            long r1 = r9.j
            long r5 = r10.v()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00e2
            long r1 = r9.j
            r10.c((long) r1)
            r11 = 1
        L_0x00e2:
            java.lang.String r1 = r9.f13825d
            if (r1 == 0) goto L_0x00f6
            java.lang.String r2 = r10.w()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00f6
            java.lang.String r11 = r9.f13825d
            r10.h((java.lang.String) r11)
            r11 = 1
        L_0x00f6:
            long r1 = r9.f13827f
            long r5 = r10.y()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0106
            long r1 = r9.f13827f
            r10.e((long) r1)
            r11 = 1
        L_0x0106:
            boolean r1 = r9.f13829h
            boolean r2 = r10.A()
            if (r1 == r2) goto L_0x0114
            boolean r11 = r9.f13829h
            r10.a((boolean) r11)
            r11 = 1
        L_0x0114:
            java.lang.String r1 = r9.f13828g
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x012e
            java.lang.String r1 = r9.f13828g
            java.lang.String r2 = r10.d()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x012e
            java.lang.String r11 = r9.f13828g
            r10.i((java.lang.String) r11)
            r11 = 1
        L_0x012e:
            long r1 = r9.l
            long r5 = r10.f()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x013e
            long r1 = r9.l
            r10.p(r1)
            r11 = 1
        L_0x013e:
            boolean r1 = r9.o
            boolean r2 = r10.g()
            if (r1 == r2) goto L_0x014c
            boolean r11 = r9.o
            r10.b((boolean) r11)
            r11 = 1
        L_0x014c:
            boolean r1 = r9.p
            boolean r2 = r10.h()
            if (r1 == r2) goto L_0x015a
            boolean r11 = r9.p
            r10.c((boolean) r11)
            r11 = 1
        L_0x015a:
            com.google.android.gms.measurement.internal.fc r1 = r8.j
            com.google.android.gms.measurement.internal.Ie r1 = r1.o()
            java.lang.String r2 = r9.f13822a
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C3202q.ca
            boolean r1 = r1.e(r2, r5)
            if (r1 == 0) goto L_0x0178
            java.lang.Boolean r1 = r9.s
            java.lang.Boolean r2 = r10.i()
            if (r1 == r2) goto L_0x0178
            java.lang.Boolean r11 = r9.s
            r10.a((java.lang.Boolean) r11)
            r11 = 1
        L_0x0178:
            long r1 = r9.t
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x018c
            long r3 = r10.z()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x018c
            long r1 = r9.t
            r10.f((long) r1)
            r11 = 1
        L_0x018c:
            if (r11 == 0) goto L_0x0195
            com.google.android.gms.measurement.internal.d r9 = r8.e()
            r9.a((com.google.android.gms.measurement.internal.C3138ec) r10)
        L_0x0195:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3176ke.a(com.google.android.gms.measurement.internal.xe, com.google.android.gms.measurement.internal.ec, java.lang.String):com.google.android.gms.measurement.internal.ec");
    }

    public static C3176ke a(Context context) {
        C0563t.a(context);
        C0563t.a(context.getApplicationContext());
        if (f13641a == null) {
            synchronized (C3176ke.class) {
                if (f13641a == null) {
                    f13641a = new C3176ke(new pe(context));
                }
            }
        }
        return f13641a;
    }

    private final xe a(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j2, String str3, String str4) {
        String str5;
        String str6;
        int i2;
        String str7 = str;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            this.j.h().t().a("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str5 = packageManager.getInstallerPackageName(str7);
        } catch (IllegalArgumentException unused) {
            this.j.h().t().a("Error retrieving installer package name. appId", Bb.a(str));
            str5 = "Unknown";
        }
        if (str5 == null) {
            str5 = "manual_install";
        } else if ("com.android.vending".equals(str5)) {
            str5 = BuildConfig.FLAVOR;
        }
        String str8 = str5;
        try {
            PackageInfo b2 = c.a(context).b(str7, 0);
            if (b2 != null) {
                CharSequence b3 = c.a(context).b(str7);
                if (!TextUtils.isEmpty(b3)) {
                    String charSequence = b3.toString();
                }
                str6 = b2.versionName;
                i2 = b2.versionCode;
            } else {
                str6 = "Unknown";
                i2 = Integer.MIN_VALUE;
            }
            return new xe(str, str2, str6, (long) i2, str8, this.j.o().n(), this.j.v().a(context, str7), (String) null, z, false, BuildConfig.FLAVOR, 0, j2, 0, z2, z3, false, str3, (Boolean) null, 0, (List<String>) null, (!Le.b() || !this.j.o().e(str7, C3202q.Fa)) ? null : str4);
        } catch (PackageManager.NameNotFoundException unused2) {
            this.j.h().t().a("Error retrieving newly installed package info. appId, appName", Bb.a(str), "Unknown");
            return null;
        }
    }

    private final xe a(String str) {
        String str2 = str;
        C3138ec b2 = e().b(str2);
        if (b2 == null || TextUtils.isEmpty(b2.u())) {
            this.j.h().A().a("No app data available; dropping", str2);
            return null;
        }
        Boolean b3 = b(b2);
        if (b3 == null || b3.booleanValue()) {
            return new xe(str, b2.n(), b2.u(), b2.v(), b2.w(), b2.x(), b2.y(), (String) null, b2.A(), false, b2.r(), b2.f(), 0, 0, b2.g(), b2.h(), false, b2.o(), b2.i(), b2.z(), b2.j(), (!Le.b() || !this.j.o().e(str2, C3202q.Fa)) ? null : b2.p());
        }
        this.j.h().t().a("App version does not match; dropping. appId", Bb.a(str));
        return null;
    }

    private static void a(T.a aVar, int i2, String str) {
        List<V> k2 = aVar.k();
        int i3 = 0;
        while (i3 < k2.size()) {
            if (!"_err".equals(k2.get(i3).o())) {
                i3++;
            } else {
                return;
            }
        }
        V.a v2 = V.v();
        v2.a("_err");
        v2.a(Long.valueOf((long) i2).longValue());
        V.a v3 = V.v();
        v3.a("_ev");
        v3.b(str);
        aVar.a((V) v2.j());
        aVar.a((V) v3.j());
    }

    private static void a(T.a aVar, String str) {
        List<V> k2 = aVar.k();
        for (int i2 = 0; i2 < k2.size(); i2++) {
            if (str.equals(k2.get(i2).o())) {
                aVar.b(i2);
                return;
            }
        }
    }

    private static void a(X.a aVar) {
        aVar.b(Long.MAX_VALUE);
        aVar.c(Long.MIN_VALUE);
        for (int i2 = 0; i2 < aVar.l(); i2++) {
            T b2 = aVar.b(i2);
            if (b2.s() < aVar.p()) {
                aVar.b(b2.s());
            }
            if (b2.s() > aVar.q()) {
                aVar.c(b2.s());
            }
        }
    }

    private final void a(X.a aVar, long j2, boolean z) {
        String str = z ? "_se" : "_lte";
        te c2 = e().c(aVar.t(), str);
        te teVar = (c2 == null || c2.f13778e == null) ? new te(aVar.t(), "auto", str, this.j.j().a(), Long.valueOf(j2)) : new te(aVar.t(), "auto", str, this.j.j().a(), Long.valueOf(((Long) c2.f13778e).longValue() + j2));
        C0298ba.a x2 = C0298ba.x();
        x2.a(str);
        x2.a(this.j.j().a());
        x2.b(((Long) teVar.f13778e).longValue());
        C0298ba baVar = (C0298ba) x2.j();
        boolean z2 = false;
        int a2 = oe.a(aVar, str);
        if (a2 >= 0) {
            aVar.a(a2, baVar);
            z2 = true;
        }
        if (!z2) {
            aVar.a(baVar);
        }
        if (j2 > 0) {
            e().a(teVar);
            this.j.h().A().a("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", teVar.f13778e);
        }
    }

    private final void a(C3138ec ecVar) {
        b bVar;
        z();
        if (!Le.b() || !this.j.o().e(ecVar.l(), C3202q.Fa)) {
            if (TextUtils.isEmpty(ecVar.n()) && TextUtils.isEmpty(ecVar.o())) {
                a(ecVar.l(), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
                return;
            }
        } else if (TextUtils.isEmpty(ecVar.n()) && TextUtils.isEmpty(ecVar.p()) && TextUtils.isEmpty(ecVar.o())) {
            a(ecVar.l(), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
            return;
        }
        String a2 = this.j.o().a(ecVar);
        try {
            URL url = new URL(a2);
            this.j.h().B().a("Fetching remote configuration", ecVar.l());
            M a3 = c().a(ecVar.l());
            String b2 = c().b(ecVar.l());
            if (a3 == null || TextUtils.isEmpty(b2)) {
                bVar = null;
            } else {
                b bVar2 = new b();
                bVar2.put("If-Modified-Since", b2);
                bVar = bVar2;
            }
            this.r = true;
            Gb d2 = d();
            String l2 = ecVar.l();
            le leVar = new le(this);
            d2.c();
            d2.r();
            C0563t.a(url);
            C0563t.a(leVar);
            d2.g().b((Runnable) new Kb(d2, l2, url, (byte[]) null, bVar, leVar));
        } catch (MalformedURLException unused) {
            this.j.h().t().a("Failed to parse config URL. Not fetching. appId", Bb.a(ecVar.l()), a2);
        }
    }

    /* access modifiers changed from: private */
    public final void a(pe peVar) {
        this.j.g().c();
        C3129d dVar = new C3129d(this);
        dVar.s();
        this.f13644d = dVar;
        this.j.o().a((Ke) this.f13642b);
        ye yeVar = new ye(this);
        yeVar.s();
        this.f13647g = yeVar;
        C3163id idVar = new C3163id(this);
        idVar.s();
        this.i = idVar;
        C3152ge geVar = new C3152ge(this);
        geVar.s();
        this.f13646f = geVar;
        this.f13645e = new Jb(this);
        if (this.p != this.q) {
            this.j.h().t().a("Not all upload components initialized", Integer.valueOf(this.p), Integer.valueOf(this.q));
        }
        this.k = true;
    }

    private final boolean a(int i2, FileChannel fileChannel) {
        z();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.j.h().t().a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i2);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            if (this.j.o().a(C3202q.Ta) && Build.VERSION.SDK_INT <= 19) {
                fileChannel.position(0);
            }
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.j.h().t().a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e2) {
            this.j.h().t().a("Failed to write to channel", e2);
            return false;
        }
    }

    private final boolean a(T.a aVar, T.a aVar2) {
        C0563t.a("_e".equals(aVar.n()));
        m();
        V a2 = oe.a((T) aVar.j(), "_sc");
        String str = null;
        String q2 = a2 == null ? null : a2.q();
        m();
        V a3 = oe.a((T) aVar2.j(), "_pc");
        if (a3 != null) {
            str = a3.q();
        }
        if (str == null || !str.equals(q2)) {
            return false;
        }
        b(aVar, aVar2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0222, code lost:
        if (r5 != null) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0244, code lost:
        if (r6 == null) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        r2 = r0;
        r22 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0261, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0262, code lost:
        r6 = r3;
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0281, code lost:
        if (r6 != null) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        r6 = null;
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0083, code lost:
        if (r3 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:?, code lost:
        r22.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01cf, code lost:
        if (r5 != null) goto L_0x01d1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040 A[ExcHandler: all (r0v20 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r3 
      PHI: (r3v46 android.database.Cursor) = (r3v39 android.database.Cursor), (r3v49 android.database.Cursor), (r3v49 android.database.Cursor), (r3v49 android.database.Cursor), (r3v49 android.database.Cursor), (r3v1 android.database.Cursor), (r3v1 android.database.Cursor) binds: [B:47:0x00dc, B:24:0x007d, B:30:0x008a, B:32:0x008e, B:33:?, B:9:0x0031, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:9:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0288 A[Catch:{ SQLiteException -> 0x0ef4, all -> 0x0f31 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0296 A[Catch:{ SQLiteException -> 0x0ef4, all -> 0x0f31 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x03d0 A[Catch:{ SQLiteException -> 0x0ef4, all -> 0x0f31 }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03d2 A[Catch:{ SQLiteException -> 0x0ef4, all -> 0x0f31 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03d5 A[Catch:{ SQLiteException -> 0x0ef4, all -> 0x0f31 }] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03d6 A[Catch:{ SQLiteException -> 0x0ef4, all -> 0x0f31 }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x05b5 A[Catch:{ SQLiteException -> 0x0ef4, all -> 0x0f31 }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0690 A[Catch:{ SQLiteException -> 0x0ef4, all -> 0x0f31 }] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0793 A[Catch:{ SQLiteException -> 0x0ef4, all -> 0x0f31 }] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x07a9 A[Catch:{ SQLiteException -> 0x0ef4, all -> 0x0f31 }] */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x07c3 A[Catch:{ SQLiteException -> 0x0ef4, all -> 0x0f31 }] */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x0b46 A[Catch:{ SQLiteException -> 0x0ef4, all -> 0x0f31 }] */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x0b59 A[Catch:{ SQLiteException -> 0x0ef4, all -> 0x0f31 }] */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0b5c A[Catch:{ SQLiteException -> 0x0ef4, all -> 0x0f31 }] */
    /* JADX WARNING: Removed duplicated region for block: B:463:0x0b80 A[Catch:{ SQLiteException -> 0x0ef4, all -> 0x0f31 }] */
    /* JADX WARNING: Removed duplicated region for block: B:576:0x0f17 A[SYNTHETIC, Splitter:B:576:0x0f17] */
    /* JADX WARNING: Removed duplicated region for block: B:583:0x0f2d A[SYNTHETIC, Splitter:B:583:0x0f2d] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011d A[SYNTHETIC, Splitter:B:60:0x011d] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0140 A[SYNTHETIC, Splitter:B:69:0x0140] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:98:0x01d1=Splitter:B:98:0x01d1, B:145:0x0284=Splitter:B:145:0x0284, B:28:0x0085=Splitter:B:28:0x0085, B:124:0x0246=Splitter:B:124:0x0246} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(java.lang.String r64, long r65) {
        /*
            r63 = this;
            r1 = r63
            com.google.android.gms.measurement.internal.d r2 = r63.e()
            r2.G()
            com.google.android.gms.measurement.internal.ke$a r2 = new com.google.android.gms.measurement.internal.ke$a     // Catch:{ all -> 0x0f31 }
            r3 = 0
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.d r4 = r63.e()     // Catch:{ all -> 0x0f31 }
            long r5 = r1.y     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.common.internal.C0563t.a(r2)     // Catch:{ all -> 0x0f31 }
            r4.c()     // Catch:{ all -> 0x0f31 }
            r4.r()     // Catch:{ all -> 0x0f31 }
            r8 = -1
            r10 = 2
            r11 = 0
            r12 = 1
            android.database.sqlite.SQLiteDatabase r15 = r4.v()     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            boolean r13 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            if (r13 == 0) goto L_0x009d
            int r13 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x004c
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
            java.lang.String r14 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
            r13[r11] = r14     // Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
            java.lang.String r14 = java.lang.String.valueOf(r65)     // Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
            r13[r12] = r14     // Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
            goto L_0x0054
        L_0x0040:
            r0 = move-exception
            r2 = r0
            r22 = r3
            goto L_0x0f2b
        L_0x0046:
            r0 = move-exception
            r6 = r3
            r7 = r6
        L_0x0049:
            r3 = r0
            goto L_0x0270
        L_0x004c:
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            java.lang.String r14 = java.lang.String.valueOf(r65)     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            r13[r11] = r14     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
        L_0x0054:
            int r14 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r14 == 0) goto L_0x005b
            java.lang.String r14 = "rowid <= ? and "
            goto L_0x005d
        L_0x005b:
            java.lang.String r14 = ""
        L_0x005d:
            int r7 = r14.length()     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            int r7 = r7 + 148
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            r3.<init>(r7)     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            java.lang.String r7 = "select app_id, metadata_fingerprint from raw_events where "
            r3.append(r7)     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            r3.append(r14)     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            java.lang.String r7 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r3.append(r7)     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            java.lang.String r3 = r3.toString()     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            android.database.Cursor r3 = r15.rawQuery(r3, r13)     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            boolean r7 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0261, all -> 0x0040 }
            if (r7 != 0) goto L_0x008a
            if (r3 == 0) goto L_0x0284
        L_0x0085:
            r3.close()     // Catch:{ all -> 0x0f31 }
            goto L_0x0284
        L_0x008a:
            java.lang.String r7 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0261, all -> 0x0040 }
            java.lang.String r13 = r3.getString(r12)     // Catch:{ SQLiteException -> 0x009a, all -> 0x0040 }
            r3.close()     // Catch:{ SQLiteException -> 0x009a, all -> 0x0040 }
            r23 = r3
            r3 = r7
            r7 = r13
            goto L_0x00f0
        L_0x009a:
            r0 = move-exception
            r6 = r3
            goto L_0x0049
        L_0x009d:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x00ad
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            r7 = 0
            r3[r11] = r7     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            r3[r12] = r7     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            goto L_0x00b3
        L_0x00ad:
            r3 = 0
            java.lang.String[] r7 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            r3 = r7
        L_0x00b3:
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x00ba
            java.lang.String r7 = " and rowid <= ?"
            goto L_0x00bc
        L_0x00ba:
            java.lang.String r7 = ""
        L_0x00bc:
            int r13 = r7.length()     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            int r13 = r13 + 84
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            r14.<init>(r13)     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            java.lang.String r13 = "select metadata_fingerprint from raw_events where app_id = ?"
            r14.append(r13)     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            r14.append(r7)     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            java.lang.String r7 = " order by rowid limit 1;"
            r14.append(r7)     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            java.lang.String r7 = r14.toString()     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            android.database.Cursor r3 = r15.rawQuery(r7, r3)     // Catch:{ SQLiteException -> 0x026c, all -> 0x0266 }
            boolean r7 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0261, all -> 0x0040 }
            if (r7 != 0) goto L_0x00e5
            if (r3 == 0) goto L_0x0284
            goto L_0x0085
        L_0x00e5:
            java.lang.String r13 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0261, all -> 0x0040 }
            r3.close()     // Catch:{ SQLiteException -> 0x0261, all -> 0x0040 }
            r23 = r3
            r7 = r13
            r3 = 0
        L_0x00f0:
            java.lang.String r14 = "raw_events_metadata"
            java.lang.String r13 = "metadata"
            java.lang.String[] r16 = new java.lang.String[]{r13}     // Catch:{ SQLiteException -> 0x025b, all -> 0x0255 }
            java.lang.String r17 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x025b, all -> 0x0255 }
            r13[r11] = r3     // Catch:{ SQLiteException -> 0x025b, all -> 0x0255 }
            r13[r12] = r7     // Catch:{ SQLiteException -> 0x025b, all -> 0x0255 }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            java.lang.String r21 = "2"
            r24 = r13
            r13 = r15
            r25 = r15
            r15 = r16
            r16 = r17
            r17 = r24
            android.database.Cursor r15 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x025b, all -> 0x0255 }
            boolean r13 = r15.moveToFirst()     // Catch:{ SQLiteException -> 0x0250, all -> 0x024c }
            if (r13 != 0) goto L_0x0140
            com.google.android.gms.measurement.internal.Bb r5 = r4.h()     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            com.google.android.gms.measurement.internal.Db r5 = r5.t()     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            java.lang.String r6 = "Raw event metadata record is missing. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r3)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            r5.a(r6, r7)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            if (r15 == 0) goto L_0x0284
            r15.close()     // Catch:{ all -> 0x0f31 }
            goto L_0x0284
        L_0x0135:
            r0 = move-exception
            r2 = r0
            r22 = r15
            goto L_0x0f2b
        L_0x013b:
            r0 = move-exception
            r7 = r3
            r6 = r15
            goto L_0x0049
        L_0x0140:
            byte[] r13 = r15.getBlob(r11)     // Catch:{ SQLiteException -> 0x0250, all -> 0x024c }
            c.b.b.b.d.f.X$a r14 = c.b.b.b.d.f.X.V()     // Catch:{ IOException -> 0x0230 }
            com.google.android.gms.measurement.internal.oe.a(r14, (byte[]) r13)     // Catch:{ IOException -> 0x0230 }
            c.b.b.b.d.f.X$a r14 = (c.b.b.b.d.f.X.a) r14     // Catch:{ IOException -> 0x0230 }
            c.b.b.b.d.f.wc r13 = r14.j()     // Catch:{ IOException -> 0x0230 }
            c.b.b.b.d.f.Lb r13 = (c.b.b.b.d.f.Lb) r13     // Catch:{ IOException -> 0x0230 }
            c.b.b.b.d.f.X r13 = (c.b.b.b.d.f.X) r13     // Catch:{ IOException -> 0x0230 }
            boolean r14 = r15.moveToNext()     // Catch:{ SQLiteException -> 0x0250, all -> 0x024c }
            if (r14 == 0) goto L_0x016c
            com.google.android.gms.measurement.internal.Bb r14 = r4.h()     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            com.google.android.gms.measurement.internal.Db r14 = r14.w()     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            java.lang.String r10 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r3)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            r14.a(r10, r12)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
        L_0x016c:
            r15.close()     // Catch:{ SQLiteException -> 0x0250, all -> 0x024c }
            r2.a(r13)     // Catch:{ SQLiteException -> 0x0250, all -> 0x024c }
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x018c
            java.lang.String r10 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r12 = 3
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            r13[r11] = r3     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            r12 = 1
            r13[r12] = r7     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            r6 = 2
            r13[r6] = r5     // Catch:{ SQLiteException -> 0x013b, all -> 0x0135 }
            r16 = r10
            r17 = r13
            goto L_0x019a
        L_0x018c:
            java.lang.String r5 = "app_id = ? and metadata_fingerprint = ?"
            r6 = 2
            java.lang.String[] r10 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0250, all -> 0x024c }
            r10[r11] = r3     // Catch:{ SQLiteException -> 0x0250, all -> 0x024c }
            r6 = 1
            r10[r6] = r7     // Catch:{ SQLiteException -> 0x0250, all -> 0x024c }
            r16 = r5
            r17 = r10
        L_0x019a:
            java.lang.String r14 = "raw_events"
            java.lang.String r5 = "rowid"
            java.lang.String r6 = "name"
            java.lang.String r7 = "timestamp"
            java.lang.String r10 = "data"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r10}     // Catch:{ SQLiteException -> 0x0250, all -> 0x024c }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            r21 = 0
            r13 = r25
            r6 = r15
            r15 = r5
            android.database.Cursor r5 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x024a }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x022b, all -> 0x0225 }
            if (r6 != 0) goto L_0x01d6
            com.google.android.gms.measurement.internal.Bb r6 = r4.h()     // Catch:{ SQLiteException -> 0x022b, all -> 0x0225 }
            com.google.android.gms.measurement.internal.Db r6 = r6.w()     // Catch:{ SQLiteException -> 0x022b, all -> 0x0225 }
            java.lang.String r7 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r3)     // Catch:{ SQLiteException -> 0x022b, all -> 0x0225 }
            r6.a(r7, r10)     // Catch:{ SQLiteException -> 0x022b, all -> 0x0225 }
            if (r5 == 0) goto L_0x0284
        L_0x01d1:
            r5.close()     // Catch:{ all -> 0x0f31 }
            goto L_0x0284
        L_0x01d6:
            long r6 = r5.getLong(r11)     // Catch:{ SQLiteException -> 0x022b, all -> 0x0225 }
            r10 = 3
            byte[] r12 = r5.getBlob(r10)     // Catch:{ SQLiteException -> 0x022b, all -> 0x0225 }
            c.b.b.b.d.f.T$a r10 = c.b.b.b.d.f.T.x()     // Catch:{ IOException -> 0x0209 }
            com.google.android.gms.measurement.internal.oe.a(r10, (byte[]) r12)     // Catch:{ IOException -> 0x0209 }
            c.b.b.b.d.f.T$a r10 = (c.b.b.b.d.f.T.a) r10     // Catch:{ IOException -> 0x0209 }
            r12 = 1
            java.lang.String r13 = r5.getString(r12)     // Catch:{ SQLiteException -> 0x022b, all -> 0x0225 }
            r10.a((java.lang.String) r13)     // Catch:{ SQLiteException -> 0x022b, all -> 0x0225 }
            r12 = 2
            long r13 = r5.getLong(r12)     // Catch:{ SQLiteException -> 0x022b, all -> 0x0225 }
            r10.a((long) r13)     // Catch:{ SQLiteException -> 0x022b, all -> 0x0225 }
            c.b.b.b.d.f.wc r10 = r10.j()     // Catch:{ SQLiteException -> 0x022b, all -> 0x0225 }
            c.b.b.b.d.f.Lb r10 = (c.b.b.b.d.f.Lb) r10     // Catch:{ SQLiteException -> 0x022b, all -> 0x0225 }
            c.b.b.b.d.f.T r10 = (c.b.b.b.d.f.T) r10     // Catch:{ SQLiteException -> 0x022b, all -> 0x0225 }
            boolean r6 = r2.a(r6, r10)     // Catch:{ SQLiteException -> 0x022b, all -> 0x0225 }
            if (r6 != 0) goto L_0x021c
            if (r5 == 0) goto L_0x0284
            goto L_0x01d1
        L_0x0209:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.Bb r7 = r4.h()     // Catch:{ SQLiteException -> 0x022b, all -> 0x0225 }
            com.google.android.gms.measurement.internal.Db r7 = r7.t()     // Catch:{ SQLiteException -> 0x022b, all -> 0x0225 }
            java.lang.String r10 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r3)     // Catch:{ SQLiteException -> 0x022b, all -> 0x0225 }
            r7.a(r10, r12, r6)     // Catch:{ SQLiteException -> 0x022b, all -> 0x0225 }
        L_0x021c:
            boolean r6 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x022b, all -> 0x0225 }
            if (r6 != 0) goto L_0x01d6
            if (r5 == 0) goto L_0x0284
            goto L_0x01d1
        L_0x0225:
            r0 = move-exception
            r2 = r0
            r22 = r5
            goto L_0x0f2b
        L_0x022b:
            r0 = move-exception
            r7 = r3
            r6 = r5
            goto L_0x0049
        L_0x0230:
            r0 = move-exception
            r6 = r15
            r5 = r0
            com.google.android.gms.measurement.internal.Bb r7 = r4.h()     // Catch:{ SQLiteException -> 0x024a }
            com.google.android.gms.measurement.internal.Db r7 = r7.t()     // Catch:{ SQLiteException -> 0x024a }
            java.lang.String r10 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r3)     // Catch:{ SQLiteException -> 0x024a }
            r7.a(r10, r12, r5)     // Catch:{ SQLiteException -> 0x024a }
            if (r6 == 0) goto L_0x0284
        L_0x0246:
            r6.close()     // Catch:{ all -> 0x0f31 }
            goto L_0x0284
        L_0x024a:
            r0 = move-exception
            goto L_0x0252
        L_0x024c:
            r0 = move-exception
            r6 = r15
            goto L_0x0f28
        L_0x0250:
            r0 = move-exception
            r6 = r15
        L_0x0252:
            r7 = r3
            goto L_0x0049
        L_0x0255:
            r0 = move-exception
            r2 = r0
            r22 = r23
            goto L_0x0f2b
        L_0x025b:
            r0 = move-exception
            r7 = r3
            r6 = r23
            goto L_0x0049
        L_0x0261:
            r0 = move-exception
            r6 = r3
            r7 = 0
            goto L_0x0049
        L_0x0266:
            r0 = move-exception
            r2 = r0
            r22 = 0
            goto L_0x0f2b
        L_0x026c:
            r0 = move-exception
            r3 = r0
            r6 = 0
            r7 = 0
        L_0x0270:
            com.google.android.gms.measurement.internal.Bb r4 = r4.h()     // Catch:{ all -> 0x0f27 }
            com.google.android.gms.measurement.internal.Db r4 = r4.t()     // Catch:{ all -> 0x0f27 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r7)     // Catch:{ all -> 0x0f27 }
            r4.a(r5, r7, r3)     // Catch:{ all -> 0x0f27 }
            if (r6 == 0) goto L_0x0284
            goto L_0x0246
        L_0x0284:
            java.util.List<c.b.b.b.d.f.T> r3 = r2.f13651c     // Catch:{ all -> 0x0f31 }
            if (r3 == 0) goto L_0x0293
            java.util.List<c.b.b.b.d.f.T> r3 = r2.f13651c     // Catch:{ all -> 0x0f31 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0f31 }
            if (r3 == 0) goto L_0x0291
            goto L_0x0293
        L_0x0291:
            r3 = 0
            goto L_0x0294
        L_0x0293:
            r3 = 1
        L_0x0294:
            if (r3 != 0) goto L_0x0f17
            c.b.b.b.d.f.X r3 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb$b r3 = r3.k()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.X$a r3 = (c.b.b.b.d.f.X.a) r3     // Catch:{ all -> 0x0f31 }
            r3.m()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Ie r4 = r4.o()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.X r5 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r5 = r5.ra()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C3202q.ba     // Catch:{ all -> 0x0f31 }
            boolean r4 = r4.e(r5, r6)     // Catch:{ all -> 0x0f31 }
            r7 = 0
            r8 = -1
            r9 = -1
            r12 = 0
            r13 = 0
            r15 = 0
            r18 = 0
            r19 = 0
        L_0x02be:
            java.util.List<c.b.b.b.d.f.T> r11 = r2.f13651c     // Catch:{ all -> 0x0f31 }
            int r11 = r11.size()     // Catch:{ all -> 0x0f31 }
            java.lang.String r5 = "_e"
            java.lang.String r6 = "_et"
            r21 = r12
            r26 = r13
            if (r7 >= r11) goto L_0x0814
            java.util.List<c.b.b.b.d.f.T> r11 = r2.f13651c     // Catch:{ all -> 0x0f31 }
            java.lang.Object r11 = r11.get(r7)     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.T r11 = (c.b.b.b.d.f.T) r11     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb$b r11 = r11.k()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.T$a r11 = (c.b.b.b.d.f.T.a) r11     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal._b r14 = r63.c()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.X r10 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r10 = r10.ra()     // Catch:{ all -> 0x0f31 }
            java.lang.String r12 = r11.n()     // Catch:{ all -> 0x0f31 }
            boolean r10 = r14.b(r10, r12)     // Catch:{ all -> 0x0f31 }
            java.lang.String r12 = "_err"
            if (r10 == 0) goto L_0x0371
            com.google.android.gms.measurement.internal.fc r5 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Bb r5 = r5.h()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Db r5 = r5.w()     // Catch:{ all -> 0x0f31 }
            java.lang.String r6 = "Dropping blacklisted raw event. appId"
            c.b.b.b.d.f.X r10 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r10 = r10.ra()     // Catch:{ all -> 0x0f31 }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r10)     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.fc r13 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.zb r13 = r13.w()     // Catch:{ all -> 0x0f31 }
            java.lang.String r14 = r11.n()     // Catch:{ all -> 0x0f31 }
            java.lang.String r13 = r13.a((java.lang.String) r14)     // Catch:{ all -> 0x0f31 }
            r5.a(r6, r10, r13)     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal._b r5 = r63.c()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.X r6 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r6 = r6.ra()     // Catch:{ all -> 0x0f31 }
            boolean r5 = r5.g(r6)     // Catch:{ all -> 0x0f31 }
            if (r5 != 0) goto L_0x033c
            com.google.android.gms.measurement.internal._b r5 = r63.c()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.X r6 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r6 = r6.ra()     // Catch:{ all -> 0x0f31 }
            boolean r5 = r5.h(r6)     // Catch:{ all -> 0x0f31 }
            if (r5 == 0) goto L_0x033a
            goto L_0x033c
        L_0x033a:
            r5 = 0
            goto L_0x033d
        L_0x033c:
            r5 = 1
        L_0x033d:
            if (r5 != 0) goto L_0x0362
            java.lang.String r5 = r11.n()     // Catch:{ all -> 0x0f31 }
            boolean r5 = r12.equals(r5)     // Catch:{ all -> 0x0f31 }
            if (r5 != 0) goto L_0x0362
            com.google.android.gms.measurement.internal.fc r5 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.se r28 = r5.v()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.X r5 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r29 = r5.ra()     // Catch:{ all -> 0x0f31 }
            r30 = 11
            java.lang.String r31 = "_ev"
            java.lang.String r32 = r11.n()     // Catch:{ all -> 0x0f31 }
            r33 = 0
            r28.a((java.lang.String) r29, (int) r30, (java.lang.String) r31, (java.lang.String) r32, (int) r33)     // Catch:{ all -> 0x0f31 }
        L_0x0362:
            r31 = r4
            r12 = r21
            r13 = r26
            r6 = -1
            r10 = 3
            r62 = r9
            r9 = r7
            r7 = r62
            goto L_0x080c
        L_0x0371:
            com.google.android.gms.measurement.internal._b r10 = r63.c()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.X r13 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r13 = r13.ra()     // Catch:{ all -> 0x0f31 }
            java.lang.String r14 = r11.n()     // Catch:{ all -> 0x0f31 }
            boolean r10 = r10.c(r13, r14)     // Catch:{ all -> 0x0f31 }
            java.lang.String r13 = "_c"
            if (r10 != 0) goto L_0x03df
            r63.m()     // Catch:{ all -> 0x0f31 }
            java.lang.String r14 = r11.n()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r14)     // Catch:{ all -> 0x0f31 }
            r25 = r15
            int r15 = r14.hashCode()     // Catch:{ all -> 0x0f31 }
            r30 = r7
            r7 = 94660(0x171c4, float:1.32647E-40)
            if (r15 == r7) goto L_0x03bd
            r7 = 95025(0x17331, float:1.33158E-40)
            if (r15 == r7) goto L_0x03b3
            r7 = 95027(0x17333, float:1.33161E-40)
            if (r15 == r7) goto L_0x03a9
            goto L_0x03c7
        L_0x03a9:
            java.lang.String r7 = "_ui"
            boolean r7 = r14.equals(r7)     // Catch:{ all -> 0x0f31 }
            if (r7 == 0) goto L_0x03c7
            r7 = 1
            goto L_0x03c8
        L_0x03b3:
            java.lang.String r7 = "_ug"
            boolean r7 = r14.equals(r7)     // Catch:{ all -> 0x0f31 }
            if (r7 == 0) goto L_0x03c7
            r7 = 2
            goto L_0x03c8
        L_0x03bd:
            java.lang.String r7 = "_in"
            boolean r7 = r14.equals(r7)     // Catch:{ all -> 0x0f31 }
            if (r7 == 0) goto L_0x03c7
            r7 = 0
            goto L_0x03c8
        L_0x03c7:
            r7 = -1
        L_0x03c8:
            if (r7 == 0) goto L_0x03d2
            r14 = 1
            if (r7 == r14) goto L_0x03d2
            r14 = 2
            if (r7 == r14) goto L_0x03d2
            r7 = 0
            goto L_0x03d3
        L_0x03d2:
            r7 = 1
        L_0x03d3:
            if (r7 == 0) goto L_0x03d6
            goto L_0x03e3
        L_0x03d6:
            r31 = r4
            r32 = r8
            r33 = r9
            r9 = r6
            goto L_0x05b3
        L_0x03df:
            r30 = r7
            r25 = r15
        L_0x03e3:
            r31 = r4
            r7 = 0
            r14 = 0
            r15 = 0
        L_0x03e8:
            int r4 = r11.l()     // Catch:{ all -> 0x0f31 }
            r32 = r8
            java.lang.String r8 = "_r"
            if (r7 >= r4) goto L_0x0450
            c.b.b.b.d.f.V r4 = r11.a((int) r7)     // Catch:{ all -> 0x0f31 }
            java.lang.String r4 = r4.o()     // Catch:{ all -> 0x0f31 }
            boolean r4 = r13.equals(r4)     // Catch:{ all -> 0x0f31 }
            if (r4 == 0) goto L_0x041e
            c.b.b.b.d.f.V r4 = r11.a((int) r7)     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb$b r4 = r4.k()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.V$a r4 = (c.b.b.b.d.f.V.a) r4     // Catch:{ all -> 0x0f31 }
            r33 = r9
            r8 = 1
            r4.a((long) r8)     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.wc r4 = r4.j()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb r4 = (c.b.b.b.d.f.Lb) r4     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.V r4 = (c.b.b.b.d.f.V) r4     // Catch:{ all -> 0x0f31 }
            r11.a((int) r7, (c.b.b.b.d.f.V) r4)     // Catch:{ all -> 0x0f31 }
            r14 = 1
            goto L_0x0449
        L_0x041e:
            r33 = r9
            c.b.b.b.d.f.V r4 = r11.a((int) r7)     // Catch:{ all -> 0x0f31 }
            java.lang.String r4 = r4.o()     // Catch:{ all -> 0x0f31 }
            boolean r4 = r8.equals(r4)     // Catch:{ all -> 0x0f31 }
            if (r4 == 0) goto L_0x0449
            c.b.b.b.d.f.V r4 = r11.a((int) r7)     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb$b r4 = r4.k()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.V$a r4 = (c.b.b.b.d.f.V.a) r4     // Catch:{ all -> 0x0f31 }
            r8 = 1
            r4.a((long) r8)     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.wc r4 = r4.j()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb r4 = (c.b.b.b.d.f.Lb) r4     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.V r4 = (c.b.b.b.d.f.V) r4     // Catch:{ all -> 0x0f31 }
            r11.a((int) r7, (c.b.b.b.d.f.V) r4)     // Catch:{ all -> 0x0f31 }
            r15 = 1
        L_0x0449:
            int r7 = r7 + 1
            r8 = r32
            r9 = r33
            goto L_0x03e8
        L_0x0450:
            r33 = r9
            if (r14 != 0) goto L_0x0484
            if (r10 == 0) goto L_0x0484
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Bb r4 = r4.h()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Db r4 = r4.B()     // Catch:{ all -> 0x0f31 }
            java.lang.String r7 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.fc r9 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.zb r9 = r9.w()     // Catch:{ all -> 0x0f31 }
            java.lang.String r14 = r11.n()     // Catch:{ all -> 0x0f31 }
            java.lang.String r9 = r9.a((java.lang.String) r14)     // Catch:{ all -> 0x0f31 }
            r4.a(r7, r9)     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.V$a r4 = c.b.b.b.d.f.V.v()     // Catch:{ all -> 0x0f31 }
            r4.a((java.lang.String) r13)     // Catch:{ all -> 0x0f31 }
            r9 = r6
            r6 = 1
            r4.a((long) r6)     // Catch:{ all -> 0x0f31 }
            r11.a((c.b.b.b.d.f.V.a) r4)     // Catch:{ all -> 0x0f31 }
            goto L_0x0485
        L_0x0484:
            r9 = r6
        L_0x0485:
            if (r15 != 0) goto L_0x04b3
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Bb r4 = r4.h()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Db r4 = r4.B()     // Catch:{ all -> 0x0f31 }
            java.lang.String r6 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.fc r7 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.zb r7 = r7.w()     // Catch:{ all -> 0x0f31 }
            java.lang.String r14 = r11.n()     // Catch:{ all -> 0x0f31 }
            java.lang.String r7 = r7.a((java.lang.String) r14)     // Catch:{ all -> 0x0f31 }
            r4.a(r6, r7)     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.V$a r4 = c.b.b.b.d.f.V.v()     // Catch:{ all -> 0x0f31 }
            r4.a((java.lang.String) r8)     // Catch:{ all -> 0x0f31 }
            r6 = 1
            r4.a((long) r6)     // Catch:{ all -> 0x0f31 }
            r11.a((c.b.b.b.d.f.V.a) r4)     // Catch:{ all -> 0x0f31 }
        L_0x04b3:
            com.google.android.gms.measurement.internal.d r34 = r63.e()     // Catch:{ all -> 0x0f31 }
            long r35 = r63.A()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.X r4 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r37 = r4.ra()     // Catch:{ all -> 0x0f31 }
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 1
            com.google.android.gms.measurement.internal.c r4 = r34.a(r35, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x0f31 }
            long r6 = r4.f13525e     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Ie r4 = r4.o()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.X r14 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r14 = r14.ra()     // Catch:{ all -> 0x0f31 }
            int r4 = r4.a((java.lang.String) r14)     // Catch:{ all -> 0x0f31 }
            long r14 = (long) r4     // Catch:{ all -> 0x0f31 }
            int r4 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x04ea
            a((c.b.b.b.d.f.T.a) r11, (java.lang.String) r8)     // Catch:{ all -> 0x0f31 }
            goto L_0x04ec
        L_0x04ea:
            r21 = 1
        L_0x04ec:
            java.lang.String r4 = r11.n()     // Catch:{ all -> 0x0f31 }
            boolean r4 = com.google.android.gms.measurement.internal.se.a((java.lang.String) r4)     // Catch:{ all -> 0x0f31 }
            if (r4 == 0) goto L_0x05b3
            if (r10 == 0) goto L_0x05b3
            com.google.android.gms.measurement.internal.d r34 = r63.e()     // Catch:{ all -> 0x0f31 }
            long r35 = r63.A()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.X r4 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r37 = r4.ra()     // Catch:{ all -> 0x0f31 }
            r38 = 0
            r39 = 0
            r40 = 1
            r41 = 0
            r42 = 0
            com.google.android.gms.measurement.internal.c r4 = r34.a(r35, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x0f31 }
            long r6 = r4.f13523c     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Ie r4 = r4.o()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.X r8 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r8 = r8.ra()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.qb<java.lang.Integer> r14 = com.google.android.gms.measurement.internal.C3202q.p     // Catch:{ all -> 0x0f31 }
            int r4 = r4.b(r8, r14)     // Catch:{ all -> 0x0f31 }
            long r14 = (long) r4     // Catch:{ all -> 0x0f31 }
            int r4 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x05b3
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Bb r4 = r4.h()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Db r4 = r4.w()     // Catch:{ all -> 0x0f31 }
            java.lang.String r6 = "Too many conversions. Not logging as conversion. appId"
            c.b.b.b.d.f.X r7 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r7 = r7.ra()     // Catch:{ all -> 0x0f31 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r7)     // Catch:{ all -> 0x0f31 }
            r4.a(r6, r7)     // Catch:{ all -> 0x0f31 }
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = -1
        L_0x054a:
            int r14 = r11.l()     // Catch:{ all -> 0x0f31 }
            if (r4 >= r14) goto L_0x0574
            c.b.b.b.d.f.V r14 = r11.a((int) r4)     // Catch:{ all -> 0x0f31 }
            java.lang.String r15 = r14.o()     // Catch:{ all -> 0x0f31 }
            boolean r15 = r13.equals(r15)     // Catch:{ all -> 0x0f31 }
            if (r15 == 0) goto L_0x0566
            c.b.b.b.d.f.Lb$b r7 = r14.k()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.V$a r7 = (c.b.b.b.d.f.V.a) r7     // Catch:{ all -> 0x0f31 }
            r8 = r4
            goto L_0x0571
        L_0x0566:
            java.lang.String r14 = r14.o()     // Catch:{ all -> 0x0f31 }
            boolean r14 = r12.equals(r14)     // Catch:{ all -> 0x0f31 }
            if (r14 == 0) goto L_0x0571
            r6 = 1
        L_0x0571:
            int r4 = r4 + 1
            goto L_0x054a
        L_0x0574:
            if (r6 == 0) goto L_0x057c
            if (r7 == 0) goto L_0x057c
            r11.b((int) r8)     // Catch:{ all -> 0x0f31 }
            goto L_0x05b3
        L_0x057c:
            if (r7 == 0) goto L_0x059a
            java.lang.Object r4 = r7.clone()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb$b r4 = (c.b.b.b.d.f.Lb.b) r4     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.V$a r4 = (c.b.b.b.d.f.V.a) r4     // Catch:{ all -> 0x0f31 }
            r4.a((java.lang.String) r12)     // Catch:{ all -> 0x0f31 }
            r6 = 10
            r4.a((long) r6)     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.wc r4 = r4.j()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb r4 = (c.b.b.b.d.f.Lb) r4     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.V r4 = (c.b.b.b.d.f.V) r4     // Catch:{ all -> 0x0f31 }
            r11.a((int) r8, (c.b.b.b.d.f.V) r4)     // Catch:{ all -> 0x0f31 }
            goto L_0x05b3
        L_0x059a:
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Bb r4 = r4.h()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Db r4 = r4.t()     // Catch:{ all -> 0x0f31 }
            java.lang.String r6 = "Did not find conversion parameter. appId"
            c.b.b.b.d.f.X r7 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r7 = r7.ra()     // Catch:{ all -> 0x0f31 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r7)     // Catch:{ all -> 0x0f31 }
            r4.a(r6, r7)     // Catch:{ all -> 0x0f31 }
        L_0x05b3:
            if (r10 == 0) goto L_0x067a
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0f31 }
            java.util.List r6 = r11.k()     // Catch:{ all -> 0x0f31 }
            r4.<init>(r6)     // Catch:{ all -> 0x0f31 }
            r6 = 0
            r7 = -1
            r8 = -1
        L_0x05c1:
            int r10 = r4.size()     // Catch:{ all -> 0x0f31 }
            if (r6 >= r10) goto L_0x05f1
            java.lang.String r10 = "value"
            java.lang.Object r12 = r4.get(r6)     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.V r12 = (c.b.b.b.d.f.V) r12     // Catch:{ all -> 0x0f31 }
            java.lang.String r12 = r12.o()     // Catch:{ all -> 0x0f31 }
            boolean r10 = r10.equals(r12)     // Catch:{ all -> 0x0f31 }
            if (r10 == 0) goto L_0x05db
            r7 = r6
            goto L_0x05ee
        L_0x05db:
            java.lang.String r10 = "currency"
            java.lang.Object r12 = r4.get(r6)     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.V r12 = (c.b.b.b.d.f.V) r12     // Catch:{ all -> 0x0f31 }
            java.lang.String r12 = r12.o()     // Catch:{ all -> 0x0f31 }
            boolean r10 = r10.equals(r12)     // Catch:{ all -> 0x0f31 }
            if (r10 == 0) goto L_0x05ee
            r8 = r6
        L_0x05ee:
            int r6 = r6 + 1
            goto L_0x05c1
        L_0x05f1:
            r6 = -1
            if (r7 == r6) goto L_0x067b
            java.lang.Object r6 = r4.get(r7)     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.V r6 = (c.b.b.b.d.f.V) r6     // Catch:{ all -> 0x0f31 }
            boolean r6 = r6.r()     // Catch:{ all -> 0x0f31 }
            if (r6 != 0) goto L_0x0629
            java.lang.Object r6 = r4.get(r7)     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.V r6 = (c.b.b.b.d.f.V) r6     // Catch:{ all -> 0x0f31 }
            boolean r6 = r6.t()     // Catch:{ all -> 0x0f31 }
            if (r6 != 0) goto L_0x0629
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Bb r4 = r4.h()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Db r4 = r4.y()     // Catch:{ all -> 0x0f31 }
            java.lang.String r6 = "Value must be specified with a numeric type."
            r4.a(r6)     // Catch:{ all -> 0x0f31 }
            r11.b((int) r7)     // Catch:{ all -> 0x0f31 }
            a((c.b.b.b.d.f.T.a) r11, (java.lang.String) r13)     // Catch:{ all -> 0x0f31 }
            r4 = 18
            java.lang.String r6 = "value"
            a((c.b.b.b.d.f.T.a) r11, (int) r4, (java.lang.String) r6)     // Catch:{ all -> 0x0f31 }
            goto L_0x067a
        L_0x0629:
            r6 = -1
            if (r8 != r6) goto L_0x062f
            r4 = 1
            r10 = 3
            goto L_0x065b
        L_0x062f:
            java.lang.Object r4 = r4.get(r8)     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.V r4 = (c.b.b.b.d.f.V) r4     // Catch:{ all -> 0x0f31 }
            java.lang.String r4 = r4.q()     // Catch:{ all -> 0x0f31 }
            int r8 = r4.length()     // Catch:{ all -> 0x0f31 }
            r10 = 3
            if (r8 == r10) goto L_0x0642
        L_0x0640:
            r4 = 1
            goto L_0x065b
        L_0x0642:
            r8 = 0
        L_0x0643:
            int r12 = r4.length()     // Catch:{ all -> 0x0f31 }
            if (r8 >= r12) goto L_0x065a
            int r12 = r4.codePointAt(r8)     // Catch:{ all -> 0x0f31 }
            boolean r14 = java.lang.Character.isLetter(r12)     // Catch:{ all -> 0x0f31 }
            if (r14 != 0) goto L_0x0654
            goto L_0x0640
        L_0x0654:
            int r12 = java.lang.Character.charCount(r12)     // Catch:{ all -> 0x0f31 }
            int r8 = r8 + r12
            goto L_0x0643
        L_0x065a:
            r4 = 0
        L_0x065b:
            if (r4 == 0) goto L_0x067c
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Bb r4 = r4.h()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Db r4 = r4.y()     // Catch:{ all -> 0x0f31 }
            java.lang.String r8 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r4.a(r8)     // Catch:{ all -> 0x0f31 }
            r11.b((int) r7)     // Catch:{ all -> 0x0f31 }
            a((c.b.b.b.d.f.T.a) r11, (java.lang.String) r13)     // Catch:{ all -> 0x0f31 }
            r4 = 19
            java.lang.String r7 = "currency"
            a((c.b.b.b.d.f.T.a) r11, (int) r4, (java.lang.String) r7)     // Catch:{ all -> 0x0f31 }
            goto L_0x067c
        L_0x067a:
            r6 = -1
        L_0x067b:
            r10 = 3
        L_0x067c:
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Ie r4 = r4.o()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.X r7 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r7 = r7.ra()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.C3202q.aa     // Catch:{ all -> 0x0f31 }
            boolean r4 = r4.e(r7, r8)     // Catch:{ all -> 0x0f31 }
            if (r4 == 0) goto L_0x0793
            java.lang.String r4 = r11.n()     // Catch:{ all -> 0x0f31 }
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x0f31 }
            if (r4 == 0) goto L_0x06eb
            r63.m()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.wc r4 = r11.j()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb r4 = (c.b.b.b.d.f.Lb) r4     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.T r4 = (c.b.b.b.d.f.T) r4     // Catch:{ all -> 0x0f31 }
            java.lang.String r7 = "_fr"
            c.b.b.b.d.f.V r4 = com.google.android.gms.measurement.internal.oe.a((c.b.b.b.d.f.T) r4, (java.lang.String) r7)     // Catch:{ all -> 0x0f31 }
            if (r4 != 0) goto L_0x06e5
            if (r19 == 0) goto L_0x06dd
            long r7 = r19.o()     // Catch:{ all -> 0x0f31 }
            long r12 = r11.o()     // Catch:{ all -> 0x0f31 }
            long r7 = r7 - r12
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x0f31 }
            r12 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 > 0) goto L_0x06dd
            java.lang.Object r4 = r19.clone()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb$b r4 = (c.b.b.b.d.f.Lb.b) r4     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.T$a r4 = (c.b.b.b.d.f.T.a) r4     // Catch:{ all -> 0x0f31 }
            boolean r7 = r1.a((c.b.b.b.d.f.T.a) r11, (c.b.b.b.d.f.T.a) r4)     // Catch:{ all -> 0x0f31 }
            if (r7 == 0) goto L_0x06dd
            r7 = r33
            r3.a((int) r7, (c.b.b.b.d.f.T.a) r4)     // Catch:{ all -> 0x0f31 }
            r8 = r32
        L_0x06d7:
            r18 = 0
            r19 = 0
            goto L_0x0797
        L_0x06dd:
            r7 = r33
            r18 = r11
            r8 = r25
            goto L_0x0797
        L_0x06e5:
            r7 = r33
        L_0x06e7:
            r8 = r32
            goto L_0x0797
        L_0x06eb:
            r7 = r33
            java.lang.String r4 = "_vs"
            java.lang.String r8 = r11.n()     // Catch:{ all -> 0x0f31 }
            boolean r4 = r4.equals(r8)     // Catch:{ all -> 0x0f31 }
            if (r4 == 0) goto L_0x073a
            r63.m()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.wc r4 = r11.j()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb r4 = (c.b.b.b.d.f.Lb) r4     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.T r4 = (c.b.b.b.d.f.T) r4     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.V r4 = com.google.android.gms.measurement.internal.oe.a((c.b.b.b.d.f.T) r4, (java.lang.String) r9)     // Catch:{ all -> 0x0f31 }
            if (r4 != 0) goto L_0x06e7
            if (r18 == 0) goto L_0x0733
            long r12 = r18.o()     // Catch:{ all -> 0x0f31 }
            long r14 = r11.o()     // Catch:{ all -> 0x0f31 }
            long r12 = r12 - r14
            long r12 = java.lang.Math.abs(r12)     // Catch:{ all -> 0x0f31 }
            r14 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 > 0) goto L_0x0733
            java.lang.Object r4 = r18.clone()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb$b r4 = (c.b.b.b.d.f.Lb.b) r4     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.T$a r4 = (c.b.b.b.d.f.T.a) r4     // Catch:{ all -> 0x0f31 }
            boolean r8 = r1.a((c.b.b.b.d.f.T.a) r4, (c.b.b.b.d.f.T.a) r11)     // Catch:{ all -> 0x0f31 }
            if (r8 == 0) goto L_0x0733
            r8 = r32
            r3.a((int) r8, (c.b.b.b.d.f.T.a) r4)     // Catch:{ all -> 0x0f31 }
            goto L_0x06d7
        L_0x0733:
            r8 = r32
            r19 = r11
            r7 = r25
            goto L_0x0797
        L_0x073a:
            r8 = r32
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Ie r4 = r4.o()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.X r12 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r12 = r12.ra()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.C3202q.Ja     // Catch:{ all -> 0x0f31 }
            boolean r4 = r4.e(r12, r13)     // Catch:{ all -> 0x0f31 }
            if (r4 == 0) goto L_0x0797
            java.lang.String r4 = "_ab"
            java.lang.String r12 = r11.n()     // Catch:{ all -> 0x0f31 }
            boolean r4 = r4.equals(r12)     // Catch:{ all -> 0x0f31 }
            if (r4 == 0) goto L_0x0797
            r63.m()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.wc r4 = r11.j()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb r4 = (c.b.b.b.d.f.Lb) r4     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.T r4 = (c.b.b.b.d.f.T) r4     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.V r4 = com.google.android.gms.measurement.internal.oe.a((c.b.b.b.d.f.T) r4, (java.lang.String) r9)     // Catch:{ all -> 0x0f31 }
            if (r4 != 0) goto L_0x0797
            if (r18 == 0) goto L_0x0797
            long r12 = r18.o()     // Catch:{ all -> 0x0f31 }
            long r14 = r11.o()     // Catch:{ all -> 0x0f31 }
            long r12 = r12 - r14
            long r12 = java.lang.Math.abs(r12)     // Catch:{ all -> 0x0f31 }
            r14 = 4000(0xfa0, double:1.9763E-320)
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 > 0) goto L_0x0797
            java.lang.Object r4 = r18.clone()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb$b r4 = (c.b.b.b.d.f.Lb.b) r4     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.T$a r4 = (c.b.b.b.d.f.T.a) r4     // Catch:{ all -> 0x0f31 }
            r1.b((c.b.b.b.d.f.T.a) r4, (c.b.b.b.d.f.T.a) r11)     // Catch:{ all -> 0x0f31 }
            r3.a((int) r8, (c.b.b.b.d.f.T.a) r4)     // Catch:{ all -> 0x0f31 }
            r18 = 0
            goto L_0x0797
        L_0x0793:
            r8 = r32
            r7 = r33
        L_0x0797:
            if (r31 != 0) goto L_0x07f4
            java.lang.String r4 = r11.n()     // Catch:{ all -> 0x0f31 }
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x0f31 }
            if (r4 == 0) goto L_0x07f4
            int r4 = r11.l()     // Catch:{ all -> 0x0f31 }
            if (r4 != 0) goto L_0x07c3
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Bb r4 = r4.h()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Db r4 = r4.w()     // Catch:{ all -> 0x0f31 }
            java.lang.String r5 = "Engagement event does not contain any parameters. appId"
            c.b.b.b.d.f.X r9 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r9 = r9.ra()     // Catch:{ all -> 0x0f31 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r9)     // Catch:{ all -> 0x0f31 }
        L_0x07bf:
            r4.a(r5, r9)     // Catch:{ all -> 0x0f31 }
            goto L_0x07f4
        L_0x07c3:
            r63.m()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.wc r4 = r11.j()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb r4 = (c.b.b.b.d.f.Lb) r4     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.T r4 = (c.b.b.b.d.f.T) r4     // Catch:{ all -> 0x0f31 }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.oe.b(r4, r9)     // Catch:{ all -> 0x0f31 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0f31 }
            if (r4 != 0) goto L_0x07ed
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Bb r4 = r4.h()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Db r4 = r4.w()     // Catch:{ all -> 0x0f31 }
            java.lang.String r5 = "Engagement event does not include duration. appId"
            c.b.b.b.d.f.X r9 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r9 = r9.ra()     // Catch:{ all -> 0x0f31 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r9)     // Catch:{ all -> 0x0f31 }
            goto L_0x07bf
        L_0x07ed:
            long r4 = r4.longValue()     // Catch:{ all -> 0x0f31 }
            long r13 = r26 + r4
            goto L_0x07f6
        L_0x07f4:
            r13 = r26
        L_0x07f6:
            java.util.List<c.b.b.b.d.f.T> r4 = r2.f13651c     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.wc r5 = r11.j()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb r5 = (c.b.b.b.d.f.Lb) r5     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.T r5 = (c.b.b.b.d.f.T) r5     // Catch:{ all -> 0x0f31 }
            r9 = r30
            r4.set(r9, r5)     // Catch:{ all -> 0x0f31 }
            int r15 = r25 + 1
            r3.a((c.b.b.b.d.f.T.a) r11)     // Catch:{ all -> 0x0f31 }
            r12 = r21
        L_0x080c:
            int r4 = r9 + 1
            r9 = r7
            r7 = r4
            r4 = r31
            goto L_0x02be
        L_0x0814:
            r31 = r4
            r9 = r6
            r25 = r15
            if (r31 == 0) goto L_0x0870
            r6 = r25
            r13 = r26
            r4 = 0
        L_0x0820:
            if (r4 >= r6) goto L_0x0872
            c.b.b.b.d.f.T r7 = r3.b((int) r4)     // Catch:{ all -> 0x0f31 }
            java.lang.String r8 = r7.q()     // Catch:{ all -> 0x0f31 }
            boolean r8 = r5.equals(r8)     // Catch:{ all -> 0x0f31 }
            if (r8 == 0) goto L_0x0843
            r63.m()     // Catch:{ all -> 0x0f31 }
            java.lang.String r8 = "_fr"
            c.b.b.b.d.f.V r8 = com.google.android.gms.measurement.internal.oe.a((c.b.b.b.d.f.T) r7, (java.lang.String) r8)     // Catch:{ all -> 0x0f31 }
            if (r8 == 0) goto L_0x0843
            r3.c((int) r4)     // Catch:{ all -> 0x0f31 }
            int r6 = r6 + -1
            int r4 = r4 + -1
            goto L_0x086d
        L_0x0843:
            r63.m()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.V r7 = com.google.android.gms.measurement.internal.oe.a((c.b.b.b.d.f.T) r7, (java.lang.String) r9)     // Catch:{ all -> 0x0f31 }
            if (r7 == 0) goto L_0x086d
            boolean r8 = r7.r()     // Catch:{ all -> 0x0f31 }
            if (r8 == 0) goto L_0x085b
            long r7 = r7.s()     // Catch:{ all -> 0x0f31 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0f31 }
            goto L_0x085c
        L_0x085b:
            r7 = 0
        L_0x085c:
            if (r7 == 0) goto L_0x086d
            long r10 = r7.longValue()     // Catch:{ all -> 0x0f31 }
            r18 = 0
            int r8 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r8 <= 0) goto L_0x086d
            long r7 = r7.longValue()     // Catch:{ all -> 0x0f31 }
            long r13 = r13 + r7
        L_0x086d:
            r7 = 1
            int r4 = r4 + r7
            goto L_0x0820
        L_0x0870:
            r13 = r26
        L_0x0872:
            r4 = 0
            r1.a((c.b.b.b.d.f.X.a) r3, (long) r13, (boolean) r4)     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Ie r4 = r4.o()     // Catch:{ all -> 0x0f31 }
            java.lang.String r5 = r3.t()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C3202q.pa     // Catch:{ all -> 0x0f31 }
            boolean r4 = r4.e(r5, r6)     // Catch:{ all -> 0x0f31 }
            java.lang.String r5 = "_se"
            if (r4 == 0) goto L_0x0907
            java.util.List r4 = r3.k()     // Catch:{ all -> 0x0f31 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0f31 }
        L_0x0892:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x0f31 }
            if (r6 == 0) goto L_0x08ac
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.T r6 = (c.b.b.b.d.f.T) r6     // Catch:{ all -> 0x0f31 }
            java.lang.String r7 = "_s"
            java.lang.String r6 = r6.q()     // Catch:{ all -> 0x0f31 }
            boolean r6 = r7.equals(r6)     // Catch:{ all -> 0x0f31 }
            if (r6 == 0) goto L_0x0892
            r4 = 1
            goto L_0x08ad
        L_0x08ac:
            r4 = 0
        L_0x08ad:
            if (r4 == 0) goto L_0x08ba
            com.google.android.gms.measurement.internal.d r4 = r63.e()     // Catch:{ all -> 0x0f31 }
            java.lang.String r6 = r3.t()     // Catch:{ all -> 0x0f31 }
            r4.b((java.lang.String) r6, (java.lang.String) r5)     // Catch:{ all -> 0x0f31 }
        L_0x08ba:
            boolean r4 = c.b.b.b.d.f.C0407qf.b()     // Catch:{ all -> 0x0f31 }
            if (r4 == 0) goto L_0x0902
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Ie r4 = r4.o()     // Catch:{ all -> 0x0f31 }
            java.lang.String r6 = r3.t()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C3202q.qa     // Catch:{ all -> 0x0f31 }
            boolean r4 = r4.e(r6, r7)     // Catch:{ all -> 0x0f31 }
            if (r4 == 0) goto L_0x0902
            java.lang.String r4 = "_sid"
            int r4 = com.google.android.gms.measurement.internal.oe.a((c.b.b.b.d.f.X.a) r3, (java.lang.String) r4)     // Catch:{ all -> 0x0f31 }
            if (r4 < 0) goto L_0x08dc
            r4 = 1
            goto L_0x08dd
        L_0x08dc:
            r4 = 0
        L_0x08dd:
            if (r4 != 0) goto L_0x0902
            int r4 = com.google.android.gms.measurement.internal.oe.a((c.b.b.b.d.f.X.a) r3, (java.lang.String) r5)     // Catch:{ all -> 0x0f31 }
            if (r4 < 0) goto L_0x0924
            r3.e((int) r4)     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Bb r4 = r4.h()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Db r4 = r4.w()     // Catch:{ all -> 0x0f31 }
            java.lang.String r5 = "Session engagement user property is in the bundle without session ID. appId"
            c.b.b.b.d.f.X r6 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r6 = r6.ra()     // Catch:{ all -> 0x0f31 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r6)     // Catch:{ all -> 0x0f31 }
            r4.a(r5, r6)     // Catch:{ all -> 0x0f31 }
            goto L_0x0924
        L_0x0902:
            r4 = 1
            r1.a((c.b.b.b.d.f.X.a) r3, (long) r13, (boolean) r4)     // Catch:{ all -> 0x0f31 }
            goto L_0x0924
        L_0x0907:
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Ie r4 = r4.o()     // Catch:{ all -> 0x0f31 }
            java.lang.String r6 = r3.t()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C3202q.sa     // Catch:{ all -> 0x0f31 }
            boolean r4 = r4.e(r6, r7)     // Catch:{ all -> 0x0f31 }
            if (r4 == 0) goto L_0x0924
            com.google.android.gms.measurement.internal.d r4 = r63.e()     // Catch:{ all -> 0x0f31 }
            java.lang.String r6 = r3.t()     // Catch:{ all -> 0x0f31 }
            r4.b((java.lang.String) r6, (java.lang.String) r5)     // Catch:{ all -> 0x0f31 }
        L_0x0924:
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Ie r4 = r4.o()     // Catch:{ all -> 0x0f31 }
            java.lang.String r5 = r3.t()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C3202q.ca     // Catch:{ all -> 0x0f31 }
            boolean r4 = r4.e(r5, r6)     // Catch:{ all -> 0x0f31 }
            if (r4 == 0) goto L_0x09c6
            com.google.android.gms.measurement.internal.oe r4 = r63.m()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Bb r5 = r4.h()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Db r5 = r5.B()     // Catch:{ all -> 0x0f31 }
            java.lang.String r6 = "Checking account type status for ad personalization signals"
            r5.a(r6)     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal._b r5 = r4.p()     // Catch:{ all -> 0x0f31 }
            java.lang.String r6 = r3.t()     // Catch:{ all -> 0x0f31 }
            boolean r5 = r5.e(r6)     // Catch:{ all -> 0x0f31 }
            if (r5 == 0) goto L_0x09c6
            com.google.android.gms.measurement.internal.d r5 = r4.o()     // Catch:{ all -> 0x0f31 }
            java.lang.String r6 = r3.t()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.ec r5 = r5.b(r6)     // Catch:{ all -> 0x0f31 }
            if (r5 == 0) goto L_0x09c6
            boolean r5 = r5.g()     // Catch:{ all -> 0x0f31 }
            if (r5 == 0) goto L_0x09c6
            com.google.android.gms.measurement.internal.i r5 = r4.d()     // Catch:{ all -> 0x0f31 }
            boolean r5 = r5.x()     // Catch:{ all -> 0x0f31 }
            if (r5 == 0) goto L_0x09c6
            com.google.android.gms.measurement.internal.Bb r5 = r4.h()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Db r5 = r5.A()     // Catch:{ all -> 0x0f31 }
            java.lang.String r6 = "Turning off ad personalization due to account type"
            r5.a(r6)     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.ba$a r5 = c.b.b.b.d.f.C0298ba.x()     // Catch:{ all -> 0x0f31 }
            java.lang.String r6 = "_npa"
            r5.a((java.lang.String) r6)     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.i r4 = r4.d()     // Catch:{ all -> 0x0f31 }
            long r6 = r4.v()     // Catch:{ all -> 0x0f31 }
            r5.a((long) r6)     // Catch:{ all -> 0x0f31 }
            r6 = 1
            r5.b((long) r6)     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.wc r4 = r5.j()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb r4 = (c.b.b.b.d.f.Lb) r4     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.ba r4 = (c.b.b.b.d.f.C0298ba) r4     // Catch:{ all -> 0x0f31 }
            r5 = 0
        L_0x09a2:
            int r6 = r3.o()     // Catch:{ all -> 0x0f31 }
            if (r5 >= r6) goto L_0x09c0
            java.lang.String r6 = "_npa"
            c.b.b.b.d.f.ba r7 = r3.d((int) r5)     // Catch:{ all -> 0x0f31 }
            java.lang.String r7 = r7.q()     // Catch:{ all -> 0x0f31 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0f31 }
            if (r6 == 0) goto L_0x09bd
            r3.a((int) r5, (c.b.b.b.d.f.C0298ba) r4)     // Catch:{ all -> 0x0f31 }
            r5 = 1
            goto L_0x09c1
        L_0x09bd:
            int r5 = r5 + 1
            goto L_0x09a2
        L_0x09c0:
            r5 = 0
        L_0x09c1:
            if (r5 != 0) goto L_0x09c6
            r3.a((c.b.b.b.d.f.C0298ba) r4)     // Catch:{ all -> 0x0f31 }
        L_0x09c6:
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Ie r4 = r4.o()     // Catch:{ all -> 0x0f31 }
            java.lang.String r5 = r3.t()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C3202q.Ea     // Catch:{ all -> 0x0f31 }
            boolean r4 = r4.e(r5, r6)     // Catch:{ all -> 0x0f31 }
            if (r4 == 0) goto L_0x09db
            a((c.b.b.b.d.f.X.a) r3)     // Catch:{ all -> 0x0f31 }
        L_0x09db:
            r3.w()     // Catch:{ all -> 0x0f31 }
            java.lang.String r4 = r3.t()     // Catch:{ all -> 0x0f31 }
            java.util.List r5 = r3.n()     // Catch:{ all -> 0x0f31 }
            java.util.List r6 = r3.k()     // Catch:{ all -> 0x0f31 }
            long r7 = r3.p()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r4)     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.ye r9 = r63.k()     // Catch:{ all -> 0x0f31 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0f31 }
            java.util.List r4 = r9.a(r4, r6, r5, r7)     // Catch:{ all -> 0x0f31 }
            r3.b((java.lang.Iterable<? extends c.b.b.b.d.f.Q>) r4)     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Ie r4 = r4.o()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.X r5 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r5 = r5.ra()     // Catch:{ all -> 0x0f31 }
            boolean r4 = r4.e(r5)     // Catch:{ all -> 0x0f31 }
            if (r4 == 0) goto L_0x0d72
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0f31 }
            r4.<init>()     // Catch:{ all -> 0x0f31 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0f31 }
            r5.<init>()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.fc r6 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.se r6 = r6.v()     // Catch:{ all -> 0x0f31 }
            java.security.SecureRandom r6 = r6.u()     // Catch:{ all -> 0x0f31 }
            r7 = 0
        L_0x0a27:
            int r8 = r3.l()     // Catch:{ all -> 0x0f31 }
            if (r7 >= r8) goto L_0x0d3e
            c.b.b.b.d.f.T r8 = r3.b((int) r7)     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb$b r8 = r8.k()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.T$a r8 = (c.b.b.b.d.f.T.a) r8     // Catch:{ all -> 0x0f31 }
            java.lang.String r9 = r8.n()     // Catch:{ all -> 0x0f31 }
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0f31 }
            if (r9 == 0) goto L_0x0ab8
            r63.m()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.wc r9 = r8.j()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb r9 = (c.b.b.b.d.f.Lb) r9     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.T r9 = (c.b.b.b.d.f.T) r9     // Catch:{ all -> 0x0f31 }
            java.lang.String r10 = "_en"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.oe.b(r9, r10)     // Catch:{ all -> 0x0f31 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0f31 }
            java.lang.Object r10 = r4.get(r9)     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.k r10 = (com.google.android.gms.measurement.internal.C3171k) r10     // Catch:{ all -> 0x0f31 }
            if (r10 != 0) goto L_0x0a6f
            com.google.android.gms.measurement.internal.d r10 = r63.e()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.X r11 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r11 = r11.ra()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.k r10 = r10.a((java.lang.String) r11, (java.lang.String) r9)     // Catch:{ all -> 0x0f31 }
            r4.put(r9, r10)     // Catch:{ all -> 0x0f31 }
        L_0x0a6f:
            java.lang.Long r9 = r10.i     // Catch:{ all -> 0x0f31 }
            if (r9 != 0) goto L_0x0aae
            java.lang.Long r9 = r10.j     // Catch:{ all -> 0x0f31 }
            long r11 = r9.longValue()     // Catch:{ all -> 0x0f31 }
            r13 = 1
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x0a89
            r63.m()     // Catch:{ all -> 0x0f31 }
            java.lang.String r9 = "_sr"
            java.lang.Long r11 = r10.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.oe.a((c.b.b.b.d.f.T.a) r8, (java.lang.String) r9, (java.lang.Object) r11)     // Catch:{ all -> 0x0f31 }
        L_0x0a89:
            java.lang.Boolean r9 = r10.k     // Catch:{ all -> 0x0f31 }
            if (r9 == 0) goto L_0x0aa3
            java.lang.Boolean r9 = r10.k     // Catch:{ all -> 0x0f31 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0f31 }
            if (r9 == 0) goto L_0x0aa3
            r63.m()     // Catch:{ all -> 0x0f31 }
            java.lang.String r9 = "_efs"
            r10 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.oe.a((c.b.b.b.d.f.T.a) r8, (java.lang.String) r9, (java.lang.Object) r12)     // Catch:{ all -> 0x0f31 }
        L_0x0aa3:
            c.b.b.b.d.f.wc r9 = r8.j()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb r9 = (c.b.b.b.d.f.Lb) r9     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.T r9 = (c.b.b.b.d.f.T) r9     // Catch:{ all -> 0x0f31 }
            r5.add(r9)     // Catch:{ all -> 0x0f31 }
        L_0x0aae:
            r3.a((int) r7, (c.b.b.b.d.f.T.a) r8)     // Catch:{ all -> 0x0f31 }
            r64 = r2
            r23 = r6
            r2 = r7
            goto L_0x0d36
        L_0x0ab8:
            com.google.android.gms.measurement.internal._b r9 = r63.c()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.X r10 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r10 = r10.ra()     // Catch:{ all -> 0x0f31 }
            long r9 = r9.f(r10)     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.fc r11 = r1.j     // Catch:{ all -> 0x0f31 }
            r11.v()     // Catch:{ all -> 0x0f31 }
            long r11 = r8.o()     // Catch:{ all -> 0x0f31 }
            long r11 = com.google.android.gms.measurement.internal.se.a((long) r11, (long) r9)     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.wc r13 = r8.j()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb r13 = (c.b.b.b.d.f.Lb) r13     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.T r13 = (c.b.b.b.d.f.T) r13     // Catch:{ all -> 0x0f31 }
            java.lang.String r14 = "_dbg"
            r18 = 1
            java.lang.Long r15 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0f31 }
            boolean r18 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x0f31 }
            if (r18 != 0) goto L_0x0b43
            if (r15 != 0) goto L_0x0aec
            goto L_0x0b43
        L_0x0aec:
            java.util.List r13 = r13.o()     // Catch:{ all -> 0x0f31 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x0f31 }
        L_0x0af4:
            boolean r18 = r13.hasNext()     // Catch:{ all -> 0x0f31 }
            if (r18 == 0) goto L_0x0b43
            java.lang.Object r18 = r13.next()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.V r18 = (c.b.b.b.d.f.V) r18     // Catch:{ all -> 0x0f31 }
            r64 = r13
            java.lang.String r13 = r18.o()     // Catch:{ all -> 0x0f31 }
            boolean r13 = r14.equals(r13)     // Catch:{ all -> 0x0f31 }
            if (r13 == 0) goto L_0x0b40
            boolean r13 = r15 instanceof java.lang.Long     // Catch:{ all -> 0x0f31 }
            if (r13 == 0) goto L_0x0b1e
            long r13 = r18.s()     // Catch:{ all -> 0x0f31 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0f31 }
            boolean r13 = r15.equals(r13)     // Catch:{ all -> 0x0f31 }
            if (r13 != 0) goto L_0x0b3e
        L_0x0b1e:
            boolean r13 = r15 instanceof java.lang.String     // Catch:{ all -> 0x0f31 }
            if (r13 == 0) goto L_0x0b2c
            java.lang.String r13 = r18.q()     // Catch:{ all -> 0x0f31 }
            boolean r13 = r15.equals(r13)     // Catch:{ all -> 0x0f31 }
            if (r13 != 0) goto L_0x0b3e
        L_0x0b2c:
            boolean r13 = r15 instanceof java.lang.Double     // Catch:{ all -> 0x0f31 }
            if (r13 == 0) goto L_0x0b43
            double r13 = r18.u()     // Catch:{ all -> 0x0f31 }
            java.lang.Double r13 = java.lang.Double.valueOf(r13)     // Catch:{ all -> 0x0f31 }
            boolean r13 = r15.equals(r13)     // Catch:{ all -> 0x0f31 }
            if (r13 == 0) goto L_0x0b43
        L_0x0b3e:
            r13 = 1
            goto L_0x0b44
        L_0x0b40:
            r13 = r64
            goto L_0x0af4
        L_0x0b43:
            r13 = 0
        L_0x0b44:
            if (r13 != 0) goto L_0x0b59
            com.google.android.gms.measurement.internal._b r13 = r63.c()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.X r14 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r14 = r14.ra()     // Catch:{ all -> 0x0f31 }
            java.lang.String r15 = r8.n()     // Catch:{ all -> 0x0f31 }
            int r13 = r13.d(r14, r15)     // Catch:{ all -> 0x0f31 }
            goto L_0x0b5a
        L_0x0b59:
            r13 = 1
        L_0x0b5a:
            if (r13 > 0) goto L_0x0b80
            com.google.android.gms.measurement.internal.fc r9 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Bb r9 = r9.h()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Db r9 = r9.w()     // Catch:{ all -> 0x0f31 }
            java.lang.String r10 = "Sample rate must be positive. event, rate"
            java.lang.String r11 = r8.n()     // Catch:{ all -> 0x0f31 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0f31 }
            r9.a(r10, r11, r12)     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.wc r9 = r8.j()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb r9 = (c.b.b.b.d.f.Lb) r9     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.T r9 = (c.b.b.b.d.f.T) r9     // Catch:{ all -> 0x0f31 }
            r5.add(r9)     // Catch:{ all -> 0x0f31 }
            goto L_0x0aae
        L_0x0b80:
            java.lang.String r14 = r8.n()     // Catch:{ all -> 0x0f31 }
            java.lang.Object r14 = r4.get(r14)     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.k r14 = (com.google.android.gms.measurement.internal.C3171k) r14     // Catch:{ all -> 0x0f31 }
            if (r14 != 0) goto L_0x0c1a
            com.google.android.gms.measurement.internal.d r14 = r63.e()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.X r15 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r15 = r15.ra()     // Catch:{ all -> 0x0f31 }
            r18 = r9
            java.lang.String r9 = r8.n()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.k r14 = r14.a((java.lang.String) r15, (java.lang.String) r9)     // Catch:{ all -> 0x0f31 }
            if (r14 != 0) goto L_0x0c1c
            com.google.android.gms.measurement.internal.fc r9 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Bb r9 = r9.h()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Db r9 = r9.w()     // Catch:{ all -> 0x0f31 }
            java.lang.String r10 = "Event being bundled has no eventAggregate. appId, eventName"
            c.b.b.b.d.f.X r14 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r14 = r14.ra()     // Catch:{ all -> 0x0f31 }
            java.lang.String r15 = r8.n()     // Catch:{ all -> 0x0f31 }
            r9.a(r10, r14, r15)     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.fc r9 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Ie r9 = r9.o()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.X r10 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r10 = r10.ra()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.C3202q.oa     // Catch:{ all -> 0x0f31 }
            boolean r9 = r9.e(r10, r14)     // Catch:{ all -> 0x0f31 }
            if (r9 == 0) goto L_0x0bf5
            com.google.android.gms.measurement.internal.k r9 = new com.google.android.gms.measurement.internal.k     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.X r10 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r31 = r10.ra()     // Catch:{ all -> 0x0f31 }
            java.lang.String r32 = r8.n()     // Catch:{ all -> 0x0f31 }
            r33 = 1
            r35 = 1
            r37 = 1
            long r39 = r8.o()     // Catch:{ all -> 0x0f31 }
            r41 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r30 = r9
            r30.<init>(r31, r32, r33, r35, r37, r39, r41, r43, r44, r45, r46)     // Catch:{ all -> 0x0f31 }
            goto L_0x0c18
        L_0x0bf5:
            com.google.android.gms.measurement.internal.k r9 = new com.google.android.gms.measurement.internal.k     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.X r10 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r48 = r10.ra()     // Catch:{ all -> 0x0f31 }
            java.lang.String r49 = r8.n()     // Catch:{ all -> 0x0f31 }
            r50 = 1
            r52 = 1
            long r54 = r8.o()     // Catch:{ all -> 0x0f31 }
            r56 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r47 = r9
            r47.<init>(r48, r49, r50, r52, r54, r56, r58, r59, r60, r61)     // Catch:{ all -> 0x0f31 }
        L_0x0c18:
            r14 = r9
            goto L_0x0c1c
        L_0x0c1a:
            r18 = r9
        L_0x0c1c:
            r63.m()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.wc r9 = r8.j()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb r9 = (c.b.b.b.d.f.Lb) r9     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.T r9 = (c.b.b.b.d.f.T) r9     // Catch:{ all -> 0x0f31 }
            java.lang.String r10 = "_eid"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.oe.b(r9, r10)     // Catch:{ all -> 0x0f31 }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x0f31 }
            if (r9 == 0) goto L_0x0c33
            r10 = 1
            goto L_0x0c34
        L_0x0c33:
            r10 = 0
        L_0x0c34:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x0f31 }
            r15 = 1
            if (r13 != r15) goto L_0x0c66
            c.b.b.b.d.f.wc r9 = r8.j()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb r9 = (c.b.b.b.d.f.Lb) r9     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.T r9 = (c.b.b.b.d.f.T) r9     // Catch:{ all -> 0x0f31 }
            r5.add(r9)     // Catch:{ all -> 0x0f31 }
            boolean r9 = r10.booleanValue()     // Catch:{ all -> 0x0f31 }
            if (r9 == 0) goto L_0x0aae
            java.lang.Long r9 = r14.i     // Catch:{ all -> 0x0f31 }
            if (r9 != 0) goto L_0x0c58
            java.lang.Long r9 = r14.j     // Catch:{ all -> 0x0f31 }
            if (r9 != 0) goto L_0x0c58
            java.lang.Boolean r9 = r14.k     // Catch:{ all -> 0x0f31 }
            if (r9 == 0) goto L_0x0aae
        L_0x0c58:
            r9 = 0
            com.google.android.gms.measurement.internal.k r10 = r14.a(r9, r9, r9)     // Catch:{ all -> 0x0f31 }
            java.lang.String r9 = r8.n()     // Catch:{ all -> 0x0f31 }
            r4.put(r9, r10)     // Catch:{ all -> 0x0f31 }
            goto L_0x0aae
        L_0x0c66:
            int r15 = r6.nextInt(r13)     // Catch:{ all -> 0x0f31 }
            if (r15 != 0) goto L_0x0cab
            r63.m()     // Catch:{ all -> 0x0f31 }
            java.lang.String r9 = "_sr"
            r64 = r2
            r15 = r3
            long r2 = (long) r13     // Catch:{ all -> 0x0f31 }
            java.lang.Long r13 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.oe.a((c.b.b.b.d.f.T.a) r8, (java.lang.String) r9, (java.lang.Object) r13)     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.wc r9 = r8.j()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb r9 = (c.b.b.b.d.f.Lb) r9     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.T r9 = (c.b.b.b.d.f.T) r9     // Catch:{ all -> 0x0f31 }
            r5.add(r9)     // Catch:{ all -> 0x0f31 }
            boolean r9 = r10.booleanValue()     // Catch:{ all -> 0x0f31 }
            if (r9 == 0) goto L_0x0c96
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0f31 }
            r3 = 0
            com.google.android.gms.measurement.internal.k r14 = r14.a(r3, r2, r3)     // Catch:{ all -> 0x0f31 }
        L_0x0c96:
            java.lang.String r2 = r8.n()     // Catch:{ all -> 0x0f31 }
            long r9 = r8.o()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.k r3 = r14.a(r9, r11)     // Catch:{ all -> 0x0f31 }
            r4.put(r2, r3)     // Catch:{ all -> 0x0f31 }
            r23 = r6
            r2 = r7
            r3 = r15
            goto L_0x0d33
        L_0x0cab:
            r64 = r2
            r15 = r3
            java.lang.Long r2 = r14.f13630h     // Catch:{ all -> 0x0f31 }
            if (r2 == 0) goto L_0x0cbd
            java.lang.Long r2 = r14.f13630h     // Catch:{ all -> 0x0f31 }
            long r2 = r2.longValue()     // Catch:{ all -> 0x0f31 }
            r23 = r6
            r25 = r7
            goto L_0x0cd0
        L_0x0cbd:
            com.google.android.gms.measurement.internal.fc r2 = r1.j     // Catch:{ all -> 0x0f31 }
            r2.v()     // Catch:{ all -> 0x0f31 }
            long r2 = r8.p()     // Catch:{ all -> 0x0f31 }
            r23 = r6
            r25 = r7
            r6 = r18
            long r2 = com.google.android.gms.measurement.internal.se.a((long) r2, (long) r6)     // Catch:{ all -> 0x0f31 }
        L_0x0cd0:
            int r6 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x0d1e
            r63.m()     // Catch:{ all -> 0x0f31 }
            java.lang.String r2 = "_efs"
            r6 = 1
            java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.oe.a((c.b.b.b.d.f.T.a) r8, (java.lang.String) r2, (java.lang.Object) r3)     // Catch:{ all -> 0x0f31 }
            r63.m()     // Catch:{ all -> 0x0f31 }
            java.lang.String r2 = "_sr"
            long r6 = (long) r13     // Catch:{ all -> 0x0f31 }
            java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.oe.a((c.b.b.b.d.f.T.a) r8, (java.lang.String) r2, (java.lang.Object) r3)     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.wc r2 = r8.j()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb r2 = (c.b.b.b.d.f.Lb) r2     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.T r2 = (c.b.b.b.d.f.T) r2     // Catch:{ all -> 0x0f31 }
            r5.add(r2)     // Catch:{ all -> 0x0f31 }
            boolean r2 = r10.booleanValue()     // Catch:{ all -> 0x0f31 }
            if (r2 == 0) goto L_0x0d0e
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0f31 }
            r3 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0f31 }
            r3 = 0
            com.google.android.gms.measurement.internal.k r14 = r14.a(r3, r2, r6)     // Catch:{ all -> 0x0f31 }
        L_0x0d0e:
            java.lang.String r2 = r8.n()     // Catch:{ all -> 0x0f31 }
            long r6 = r8.o()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.k r3 = r14.a(r6, r11)     // Catch:{ all -> 0x0f31 }
            r4.put(r2, r3)     // Catch:{ all -> 0x0f31 }
            goto L_0x0d30
        L_0x0d1e:
            boolean r2 = r10.booleanValue()     // Catch:{ all -> 0x0f31 }
            if (r2 == 0) goto L_0x0d30
            java.lang.String r2 = r8.n()     // Catch:{ all -> 0x0f31 }
            r3 = 0
            com.google.android.gms.measurement.internal.k r6 = r14.a(r9, r3, r3)     // Catch:{ all -> 0x0f31 }
            r4.put(r2, r6)     // Catch:{ all -> 0x0f31 }
        L_0x0d30:
            r3 = r15
            r2 = r25
        L_0x0d33:
            r3.a((int) r2, (c.b.b.b.d.f.T.a) r8)     // Catch:{ all -> 0x0f31 }
        L_0x0d36:
            int r7 = r2 + 1
            r2 = r64
            r6 = r23
            goto L_0x0a27
        L_0x0d3e:
            r64 = r2
            int r2 = r5.size()     // Catch:{ all -> 0x0f31 }
            int r6 = r3.l()     // Catch:{ all -> 0x0f31 }
            if (r2 >= r6) goto L_0x0d50
            r3.m()     // Catch:{ all -> 0x0f31 }
            r3.a((java.lang.Iterable<? extends c.b.b.b.d.f.T>) r5)     // Catch:{ all -> 0x0f31 }
        L_0x0d50:
            java.util.Set r2 = r4.entrySet()     // Catch:{ all -> 0x0f31 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0f31 }
        L_0x0d58:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0f31 }
            if (r4 == 0) goto L_0x0d74
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0f31 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.d r5 = r63.e()     // Catch:{ all -> 0x0f31 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.k r4 = (com.google.android.gms.measurement.internal.C3171k) r4     // Catch:{ all -> 0x0f31 }
            r5.a((com.google.android.gms.measurement.internal.C3171k) r4)     // Catch:{ all -> 0x0f31 }
            goto L_0x0d58
        L_0x0d72:
            r64 = r2
        L_0x0d74:
            com.google.android.gms.measurement.internal.fc r2 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Ie r2 = r2.o()     // Catch:{ all -> 0x0f31 }
            java.lang.String r4 = r3.t()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C3202q.Ea     // Catch:{ all -> 0x0f31 }
            boolean r2 = r2.e(r4, r5)     // Catch:{ all -> 0x0f31 }
            if (r2 != 0) goto L_0x0d89
            a((c.b.b.b.d.f.X.a) r3)     // Catch:{ all -> 0x0f31 }
        L_0x0d89:
            r2 = r64
            c.b.b.b.d.f.X r4 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r4 = r4.ra()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.d r5 = r63.e()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.ec r5 = r5.b(r4)     // Catch:{ all -> 0x0f31 }
            if (r5 != 0) goto L_0x0db5
            com.google.android.gms.measurement.internal.fc r5 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Bb r5 = r5.h()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Db r5 = r5.t()     // Catch:{ all -> 0x0f31 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            c.b.b.b.d.f.X r7 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r7 = r7.ra()     // Catch:{ all -> 0x0f31 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r7)     // Catch:{ all -> 0x0f31 }
            r5.a(r6, r7)     // Catch:{ all -> 0x0f31 }
            goto L_0x0e10
        L_0x0db5:
            int r6 = r3.l()     // Catch:{ all -> 0x0f31 }
            if (r6 <= 0) goto L_0x0e10
            long r6 = r5.t()     // Catch:{ all -> 0x0f31 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0dc9
            r3.e((long) r6)     // Catch:{ all -> 0x0f31 }
            goto L_0x0dcc
        L_0x0dc9:
            r3.s()     // Catch:{ all -> 0x0f31 }
        L_0x0dcc:
            long r8 = r5.s()     // Catch:{ all -> 0x0f31 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0dd7
            goto L_0x0dd8
        L_0x0dd7:
            r6 = r8
        L_0x0dd8:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0de0
            r3.d((long) r6)     // Catch:{ all -> 0x0f31 }
            goto L_0x0de3
        L_0x0de0:
            r3.r()     // Catch:{ all -> 0x0f31 }
        L_0x0de3:
            r5.E()     // Catch:{ all -> 0x0f31 }
            long r6 = r5.B()     // Catch:{ all -> 0x0f31 }
            int r7 = (int) r6     // Catch:{ all -> 0x0f31 }
            r3.g((int) r7)     // Catch:{ all -> 0x0f31 }
            long r6 = r3.p()     // Catch:{ all -> 0x0f31 }
            r5.a((long) r6)     // Catch:{ all -> 0x0f31 }
            long r6 = r3.q()     // Catch:{ all -> 0x0f31 }
            r5.b((long) r6)     // Catch:{ all -> 0x0f31 }
            java.lang.String r6 = r5.e()     // Catch:{ all -> 0x0f31 }
            if (r6 == 0) goto L_0x0e06
            r3.j((java.lang.String) r6)     // Catch:{ all -> 0x0f31 }
            goto L_0x0e09
        L_0x0e06:
            r3.u()     // Catch:{ all -> 0x0f31 }
        L_0x0e09:
            com.google.android.gms.measurement.internal.d r6 = r63.e()     // Catch:{ all -> 0x0f31 }
            r6.a((com.google.android.gms.measurement.internal.C3138ec) r5)     // Catch:{ all -> 0x0f31 }
        L_0x0e10:
            int r5 = r3.l()     // Catch:{ all -> 0x0f31 }
            if (r5 <= 0) goto L_0x0e76
            com.google.android.gms.measurement.internal.fc r5 = r1.j     // Catch:{ all -> 0x0f31 }
            r5.i()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal._b r5 = r63.c()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.X r6 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r6 = r6.ra()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.M r5 = r5.a((java.lang.String) r6)     // Catch:{ all -> 0x0f31 }
            if (r5 == 0) goto L_0x0e3a
            boolean r6 = r5.o()     // Catch:{ all -> 0x0f31 }
            if (r6 != 0) goto L_0x0e32
            goto L_0x0e3a
        L_0x0e32:
            long r5 = r5.p()     // Catch:{ all -> 0x0f31 }
            r3.i((long) r5)     // Catch:{ all -> 0x0f31 }
            goto L_0x0e65
        L_0x0e3a:
            c.b.b.b.d.f.X r5 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r5 = r5.B()     // Catch:{ all -> 0x0f31 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0f31 }
            if (r5 == 0) goto L_0x0e4c
            r5 = -1
            r3.i((long) r5)     // Catch:{ all -> 0x0f31 }
            goto L_0x0e65
        L_0x0e4c:
            com.google.android.gms.measurement.internal.fc r5 = r1.j     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Bb r5 = r5.h()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Db r5 = r5.w()     // Catch:{ all -> 0x0f31 }
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            c.b.b.b.d.f.X r7 = r2.f13649a     // Catch:{ all -> 0x0f31 }
            java.lang.String r7 = r7.ra()     // Catch:{ all -> 0x0f31 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r7)     // Catch:{ all -> 0x0f31 }
            r5.a(r6, r7)     // Catch:{ all -> 0x0f31 }
        L_0x0e65:
            com.google.android.gms.measurement.internal.d r5 = r63.e()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.wc r3 = r3.j()     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.Lb r3 = (c.b.b.b.d.f.Lb) r3     // Catch:{ all -> 0x0f31 }
            c.b.b.b.d.f.X r3 = (c.b.b.b.d.f.X) r3     // Catch:{ all -> 0x0f31 }
            r12 = r21
            r5.a((c.b.b.b.d.f.X) r3, (boolean) r12)     // Catch:{ all -> 0x0f31 }
        L_0x0e76:
            com.google.android.gms.measurement.internal.d r3 = r63.e()     // Catch:{ all -> 0x0f31 }
            java.util.List<java.lang.Long> r2 = r2.f13650b     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.common.internal.C0563t.a(r2)     // Catch:{ all -> 0x0f31 }
            r3.c()     // Catch:{ all -> 0x0f31 }
            r3.r()     // Catch:{ all -> 0x0f31 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0f31 }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0f31 }
            r6 = 0
        L_0x0e8d:
            int r7 = r2.size()     // Catch:{ all -> 0x0f31 }
            if (r6 >= r7) goto L_0x0eaa
            if (r6 == 0) goto L_0x0e9a
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0f31 }
        L_0x0e9a:
            java.lang.Object r7 = r2.get(r6)     // Catch:{ all -> 0x0f31 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0f31 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0f31 }
            r5.append(r7)     // Catch:{ all -> 0x0f31 }
            int r6 = r6 + 1
            goto L_0x0e8d
        L_0x0eaa:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0f31 }
            android.database.sqlite.SQLiteDatabase r6 = r3.v()     // Catch:{ all -> 0x0f31 }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0f31 }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0f31 }
            int r6 = r2.size()     // Catch:{ all -> 0x0f31 }
            if (r5 == r6) goto L_0x0edd
            com.google.android.gms.measurement.internal.Bb r3 = r3.h()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Db r3 = r3.t()     // Catch:{ all -> 0x0f31 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0f31 }
            int r2 = r2.size()     // Catch:{ all -> 0x0f31 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0f31 }
            r3.a(r6, r5, r2)     // Catch:{ all -> 0x0f31 }
        L_0x0edd:
            com.google.android.gms.measurement.internal.d r2 = r63.e()     // Catch:{ all -> 0x0f31 }
            android.database.sqlite.SQLiteDatabase r3 = r2.v()     // Catch:{ all -> 0x0f31 }
            java.lang.String r5 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0ef4 }
            r7 = 0
            r6[r7] = r4     // Catch:{ SQLiteException -> 0x0ef4 }
            r7 = 1
            r6[r7] = r4     // Catch:{ SQLiteException -> 0x0ef4 }
            r3.execSQL(r5, r6)     // Catch:{ SQLiteException -> 0x0ef4 }
            goto L_0x0f07
        L_0x0ef4:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.Bb r2 = r2.h()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.Db r2 = r2.t()     // Catch:{ all -> 0x0f31 }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r4)     // Catch:{ all -> 0x0f31 }
            r2.a(r5, r4, r3)     // Catch:{ all -> 0x0f31 }
        L_0x0f07:
            com.google.android.gms.measurement.internal.d r2 = r63.e()     // Catch:{ all -> 0x0f31 }
            r2.u()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.d r2 = r63.e()
            r2.H()
            r2 = 1
            return r2
        L_0x0f17:
            com.google.android.gms.measurement.internal.d r2 = r63.e()     // Catch:{ all -> 0x0f31 }
            r2.u()     // Catch:{ all -> 0x0f31 }
            com.google.android.gms.measurement.internal.d r2 = r63.e()
            r2.H()
            r2 = 0
            return r2
        L_0x0f27:
            r0 = move-exception
        L_0x0f28:
            r2 = r0
            r22 = r6
        L_0x0f2b:
            if (r22 == 0) goto L_0x0f30
            r22.close()     // Catch:{ all -> 0x0f31 }
        L_0x0f30:
            throw r2     // Catch:{ all -> 0x0f31 }
        L_0x0f31:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.d r3 = r63.e()
            r3.H()
            goto L_0x0f3c
        L_0x0f3b:
            throw r2
        L_0x0f3c:
            goto L_0x0f3b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3176ke.a(java.lang.String, long):boolean");
    }

    private final Boolean b(C3138ec ecVar) {
        try {
            if (ecVar.v() != -2147483648L) {
                if (ecVar.v() == ((long) c.a(this.j.f()).b(ecVar.l(), 0).versionCode)) {
                    return true;
                }
            } else {
                String str = c.a(this.j.f()).b(ecVar.l(), 0).versionName;
                if (ecVar.u() != null && ecVar.u().equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void b(T.a aVar, T.a aVar2) {
        C0563t.a("_e".equals(aVar.n()));
        m();
        V a2 = oe.a((T) aVar.j(), "_et");
        if (a2.r() && a2.s() > 0) {
            long s2 = a2.s();
            m();
            V a3 = oe.a((T) aVar2.j(), "_et");
            if (a3 != null && a3.s() > 0) {
                s2 += a3.s();
            }
            m();
            oe.a(aVar2, "_et", (Object) Long.valueOf(s2));
            m();
            oe.a(aVar, "_fr", (Object) 1L);
        }
    }

    private static void b(C3158he heVar) {
        if (heVar == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!heVar.q()) {
            String valueOf = String.valueOf(heVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:198:0x063b A[Catch:{ SQLiteException -> 0x023a, all -> 0x0916 }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x067a A[Catch:{ SQLiteException -> 0x023a, all -> 0x0916 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0695 A[Catch:{ SQLiteException -> 0x023a, all -> 0x0916 }] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0752 A[Catch:{ SQLiteException -> 0x023a, all -> 0x0916 }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0763 A[Catch:{ SQLiteException -> 0x023a, all -> 0x0916 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x07d4 A[Catch:{ SQLiteException -> 0x023a, all -> 0x0916 }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x07e5 A[Catch:{ SQLiteException -> 0x023a, all -> 0x0916 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x07fd A[Catch:{ SQLiteException -> 0x023a, all -> 0x0916 }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0844 A[Catch:{ SQLiteException -> 0x023a, all -> 0x0916 }] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x08a1 A[Catch:{ SQLiteException -> 0x023a, all -> 0x0916 }] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x08d1 A[Catch:{ SQLiteException -> 0x023a, all -> 0x0916 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0272 A[Catch:{ SQLiteException -> 0x023a, all -> 0x0916 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02a9 A[Catch:{ SQLiteException -> 0x023a, all -> 0x0916 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02f7 A[Catch:{ SQLiteException -> 0x023a, all -> 0x0916 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0324  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(com.google.android.gms.measurement.internal.C3192o r28, com.google.android.gms.measurement.internal.xe r29) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r3 = r29
            java.lang.String r4 = "_s"
            com.google.android.gms.common.internal.C0563t.a(r29)
            java.lang.String r5 = r3.f13822a
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r5)
            long r5 = java.lang.System.nanoTime()
            r27.z()
            r27.p()
            java.lang.String r15 = r3.f13822a
            com.google.android.gms.measurement.internal.oe r7 = r27.m()
            boolean r7 = r7.a((com.google.android.gms.measurement.internal.C3192o) r2, (com.google.android.gms.measurement.internal.xe) r3)
            if (r7 != 0) goto L_0x0027
            return
        L_0x0027:
            boolean r7 = r3.f13829h
            if (r7 != 0) goto L_0x002f
            r1.c(r3)
            return
        L_0x002f:
            com.google.android.gms.measurement.internal._b r7 = r27.c()
            java.lang.String r8 = r2.f13696a
            boolean r7 = r7.b(r15, r8)
            java.lang.String r14 = "_err"
            r13 = 0
            r12 = 1
            if (r7 == 0) goto L_0x00db
            com.google.android.gms.measurement.internal.fc r3 = r1.j
            com.google.android.gms.measurement.internal.Bb r3 = r3.h()
            com.google.android.gms.measurement.internal.Db r3 = r3.w()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r15)
            com.google.android.gms.measurement.internal.fc r5 = r1.j
            com.google.android.gms.measurement.internal.zb r5 = r5.w()
            java.lang.String r6 = r2.f13696a
            java.lang.String r5 = r5.a((java.lang.String) r6)
            java.lang.String r6 = "Dropping blacklisted event. appId"
            r3.a(r6, r4, r5)
            com.google.android.gms.measurement.internal._b r3 = r27.c()
            boolean r3 = r3.g(r15)
            if (r3 != 0) goto L_0x0075
            com.google.android.gms.measurement.internal._b r3 = r27.c()
            boolean r3 = r3.h(r15)
            if (r3 == 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r3 = 0
            goto L_0x0076
        L_0x0075:
            r3 = 1
        L_0x0076:
            if (r3 != 0) goto L_0x0091
            java.lang.String r4 = r2.f13696a
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x0091
            com.google.android.gms.measurement.internal.fc r4 = r1.j
            com.google.android.gms.measurement.internal.se r7 = r4.v()
            r9 = 11
            java.lang.String r11 = r2.f13696a
            r12 = 0
            java.lang.String r10 = "_ev"
            r8 = r15
            r7.a((java.lang.String) r8, (int) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12)
        L_0x0091:
            if (r3 == 0) goto L_0x00da
            com.google.android.gms.measurement.internal.d r2 = r27.e()
            com.google.android.gms.measurement.internal.ec r2 = r2.b(r15)
            if (r2 == 0) goto L_0x00da
            long r3 = r2.D()
            long r5 = r2.C()
            long r3 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.fc r5 = r1.j
            com.google.android.gms.common.util.e r5 = r5.j()
            long r5 = r5.a()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            com.google.android.gms.measurement.internal.qb<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C3202q.B
            java.lang.Object r5 = r5.a(r13)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00da
            com.google.android.gms.measurement.internal.fc r3 = r1.j
            com.google.android.gms.measurement.internal.Bb r3 = r3.h()
            com.google.android.gms.measurement.internal.Db r3 = r3.A()
            java.lang.String r4 = "Fetching config for blacklisted app"
            r3.a(r4)
            r1.a((com.google.android.gms.measurement.internal.C3138ec) r2)
        L_0x00da:
            return
        L_0x00db:
            com.google.android.gms.measurement.internal.fc r7 = r1.j
            com.google.android.gms.measurement.internal.Bb r7 = r7.h()
            r10 = 2
            boolean r7 = r7.a((int) r10)
            if (r7 == 0) goto L_0x0101
            com.google.android.gms.measurement.internal.fc r7 = r1.j
            com.google.android.gms.measurement.internal.Bb r7 = r7.h()
            com.google.android.gms.measurement.internal.Db r7 = r7.B()
            com.google.android.gms.measurement.internal.fc r8 = r1.j
            com.google.android.gms.measurement.internal.zb r8 = r8.w()
            java.lang.String r8 = r8.a((com.google.android.gms.measurement.internal.C3192o) r2)
            java.lang.String r9 = "Logging event"
            r7.a(r9, r8)
        L_0x0101:
            com.google.android.gms.measurement.internal.d r7 = r27.e()
            r7.G()
            r1.c(r3)     // Catch:{ all -> 0x0916 }
            java.lang.String r7 = "_iap"
            java.lang.String r8 = r2.f13696a     // Catch:{ all -> 0x0916 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0916 }
            java.lang.String r8 = "ecommerce_purchase"
            if (r7 != 0) goto L_0x0125
            java.lang.String r7 = r2.f13696a     // Catch:{ all -> 0x0916 }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x0916 }
            if (r7 == 0) goto L_0x0120
            goto L_0x0125
        L_0x0120:
            r23 = r5
            r6 = 0
            goto L_0x02b8
        L_0x0125:
            com.google.android.gms.measurement.internal.n r7 = r2.f13697b     // Catch:{ all -> 0x0916 }
            java.lang.String r9 = "currency"
            java.lang.String r7 = r7.d(r9)     // Catch:{ all -> 0x0916 }
            java.lang.String r9 = r2.f13696a     // Catch:{ all -> 0x0916 }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0916 }
            java.lang.String r9 = "value"
            if (r8 == 0) goto L_0x018c
            com.google.android.gms.measurement.internal.n r8 = r2.f13697b     // Catch:{ all -> 0x0916 }
            java.lang.Double r8 = r8.c(r9)     // Catch:{ all -> 0x0916 }
            double r16 = r8.doubleValue()     // Catch:{ all -> 0x0916 }
            r18 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r16 = r16 * r18
            r20 = 0
            int r8 = (r16 > r20 ? 1 : (r16 == r20 ? 0 : -1))
            if (r8 != 0) goto L_0x015e
            com.google.android.gms.measurement.internal.n r8 = r2.f13697b     // Catch:{ all -> 0x0916 }
            java.lang.Long r8 = r8.b(r9)     // Catch:{ all -> 0x0916 }
            long r8 = r8.longValue()     // Catch:{ all -> 0x0916 }
            double r8 = (double) r8
            java.lang.Double.isNaN(r8)
            double r16 = r8 * r18
        L_0x015e:
            r8 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r18 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r18 > 0) goto L_0x016f
            r8 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r18 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r18 < 0) goto L_0x016f
            long r8 = java.lang.Math.round(r16)     // Catch:{ all -> 0x0916 }
            goto L_0x0196
        L_0x016f:
            com.google.android.gms.measurement.internal.fc r7 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Bb r7 = r7.h()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Db r7 = r7.w()     // Catch:{ all -> 0x0916 }
            java.lang.String r8 = "Data lost. Currency value is too big. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r15)     // Catch:{ all -> 0x0916 }
            java.lang.Double r10 = java.lang.Double.valueOf(r16)     // Catch:{ all -> 0x0916 }
            r7.a(r8, r9, r10)     // Catch:{ all -> 0x0916 }
            r23 = r5
            r6 = 0
            r11 = 0
            goto L_0x02a7
        L_0x018c:
            com.google.android.gms.measurement.internal.n r8 = r2.f13697b     // Catch:{ all -> 0x0916 }
            java.lang.Long r8 = r8.b(r9)     // Catch:{ all -> 0x0916 }
            long r8 = r8.longValue()     // Catch:{ all -> 0x0916 }
        L_0x0196:
            boolean r10 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0916 }
            if (r10 != 0) goto L_0x02a3
            java.util.Locale r10 = java.util.Locale.US     // Catch:{ all -> 0x0916 }
            java.lang.String r7 = r7.toUpperCase(r10)     // Catch:{ all -> 0x0916 }
            java.lang.String r10 = "[A-Z]{3}"
            boolean r10 = r7.matches(r10)     // Catch:{ all -> 0x0916 }
            if (r10 == 0) goto L_0x02a3
            java.lang.String r10 = "_ltv_"
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0916 }
            int r16 = r7.length()     // Catch:{ all -> 0x0916 }
            if (r16 == 0) goto L_0x01bb
            java.lang.String r7 = r10.concat(r7)     // Catch:{ all -> 0x0916 }
            goto L_0x01c0
        L_0x01bb:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x0916 }
            r7.<init>(r10)     // Catch:{ all -> 0x0916 }
        L_0x01c0:
            r10 = r7
            com.google.android.gms.measurement.internal.d r7 = r27.e()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.te r7 = r7.c((java.lang.String) r15, (java.lang.String) r10)     // Catch:{ all -> 0x0916 }
            if (r7 == 0) goto L_0x0201
            java.lang.Object r11 = r7.f13778e     // Catch:{ all -> 0x0916 }
            boolean r11 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0916 }
            if (r11 != 0) goto L_0x01d2
            goto L_0x0201
        L_0x01d2:
            java.lang.Object r7 = r7.f13778e     // Catch:{ all -> 0x0916 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0916 }
            long r19 = r7.longValue()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.te r17 = new com.google.android.gms.measurement.internal.te     // Catch:{ all -> 0x0916 }
            java.lang.String r11 = r2.f13698c     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.fc r7 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.common.util.e r7 = r7.j()     // Catch:{ all -> 0x0916 }
            long r21 = r7.a()     // Catch:{ all -> 0x0916 }
            long r19 = r19 + r8
            java.lang.Long r19 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0916 }
            r7 = r17
            r8 = r15
            r9 = r11
            r11 = 2
            r23 = r5
            r5 = 1
            r6 = 0
            r11 = r21
            r13 = r19
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x0916 }
            r5 = r17
            goto L_0x0268
        L_0x0201:
            r23 = r5
            r5 = 1
            r6 = 0
            com.google.android.gms.measurement.internal.d r7 = r27.e()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.fc r11 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Ie r11 = r11.o()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.qb<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.C3202q.G     // Catch:{ all -> 0x0916 }
            int r11 = r11.b(r15, r12)     // Catch:{ all -> 0x0916 }
            int r11 = r11 - r5
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r15)     // Catch:{ all -> 0x0916 }
            r7.c()     // Catch:{ all -> 0x0916 }
            r7.r()     // Catch:{ all -> 0x0916 }
            android.database.sqlite.SQLiteDatabase r12 = r7.v()     // Catch:{ SQLiteException -> 0x023a }
            java.lang.String r13 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r5 = 3
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x023a }
            r5[r6] = r15     // Catch:{ SQLiteException -> 0x023a }
            r16 = 1
            r5[r16] = r15     // Catch:{ SQLiteException -> 0x023a }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ SQLiteException -> 0x023a }
            r16 = 2
            r5[r16] = r11     // Catch:{ SQLiteException -> 0x023a }
            r12.execSQL(r13, r5)     // Catch:{ SQLiteException -> 0x023a }
            goto L_0x024d
        L_0x023a:
            r0 = move-exception
            r5 = r0
            com.google.android.gms.measurement.internal.Bb r7 = r7.h()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Db r7 = r7.t()     // Catch:{ all -> 0x0916 }
            java.lang.String r11 = "Error pruning currencies. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r15)     // Catch:{ all -> 0x0916 }
            r7.a(r11, r12, r5)     // Catch:{ all -> 0x0916 }
        L_0x024d:
            com.google.android.gms.measurement.internal.te r5 = new com.google.android.gms.measurement.internal.te     // Catch:{ all -> 0x0916 }
            java.lang.String r11 = r2.f13698c     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.fc r7 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.common.util.e r7 = r7.j()     // Catch:{ all -> 0x0916 }
            long r12 = r7.a()     // Catch:{ all -> 0x0916 }
            java.lang.Long r16 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0916 }
            r7 = r5
            r8 = r15
            r9 = r11
            r11 = r12
            r13 = r16
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x0916 }
        L_0x0268:
            com.google.android.gms.measurement.internal.d r7 = r27.e()     // Catch:{ all -> 0x0916 }
            boolean r7 = r7.a((com.google.android.gms.measurement.internal.te) r5)     // Catch:{ all -> 0x0916 }
            if (r7 != 0) goto L_0x02a6
            com.google.android.gms.measurement.internal.fc r7 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Bb r7 = r7.h()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Db r7 = r7.t()     // Catch:{ all -> 0x0916 }
            java.lang.String r8 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r15)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.fc r10 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.zb r10 = r10.w()     // Catch:{ all -> 0x0916 }
            java.lang.String r11 = r5.f13776c     // Catch:{ all -> 0x0916 }
            java.lang.String r10 = r10.c(r11)     // Catch:{ all -> 0x0916 }
            java.lang.Object r5 = r5.f13778e     // Catch:{ all -> 0x0916 }
            r7.a(r8, r9, r10, r5)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.fc r5 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.se r7 = r5.v()     // Catch:{ all -> 0x0916 }
            r9 = 9
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r15
            r7.a((java.lang.String) r8, (int) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12)     // Catch:{ all -> 0x0916 }
            goto L_0x02a6
        L_0x02a3:
            r23 = r5
            r6 = 0
        L_0x02a6:
            r11 = 1
        L_0x02a7:
            if (r11 != 0) goto L_0x02b8
            com.google.android.gms.measurement.internal.d r2 = r27.e()     // Catch:{ all -> 0x0916 }
            r2.u()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.d r2 = r27.e()
            r2.H()
            return
        L_0x02b8:
            java.lang.String r5 = r2.f13696a     // Catch:{ all -> 0x0916 }
            boolean r5 = com.google.android.gms.measurement.internal.se.a((java.lang.String) r5)     // Catch:{ all -> 0x0916 }
            java.lang.String r7 = r2.f13696a     // Catch:{ all -> 0x0916 }
            boolean r16 = r14.equals(r7)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.d r7 = r27.e()     // Catch:{ all -> 0x0916 }
            long r8 = r27.A()     // Catch:{ all -> 0x0916 }
            r11 = 1
            r13 = 0
            r17 = 0
            r10 = r15
            r12 = r5
            r14 = r16
            r18 = r15
            r15 = r17
            com.google.android.gms.measurement.internal.c r7 = r7.a(r8, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0916 }
            long r8 = r7.f13522b     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.qb<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.C3202q.m     // Catch:{ all -> 0x0916 }
            r14 = 0
            java.lang.Object r10 = r10.a(r14)     // Catch:{ all -> 0x0916 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x0916 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0916 }
            long r10 = (long) r10     // Catch:{ all -> 0x0916 }
            long r8 = r8 - r10
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 1
            r14 = 0
            int r17 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r17 <= 0) goto L_0x0324
            long r8 = r8 % r10
            int r2 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0315
            com.google.android.gms.measurement.internal.fc r2 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Bb r2 = r2.h()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Db r2 = r2.t()     // Catch:{ all -> 0x0916 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r18)     // Catch:{ all -> 0x0916 }
            long r5 = r7.f13522b     // Catch:{ all -> 0x0916 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0916 }
            r2.a(r3, r4, r5)     // Catch:{ all -> 0x0916 }
        L_0x0315:
            com.google.android.gms.measurement.internal.d r2 = r27.e()     // Catch:{ all -> 0x0916 }
            r2.u()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.d r2 = r27.e()
            r2.H()
            return
        L_0x0324:
            if (r5 == 0) goto L_0x037c
            long r8 = r7.f13521a     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.qb<java.lang.Integer> r6 = com.google.android.gms.measurement.internal.C3202q.o     // Catch:{ all -> 0x0916 }
            r12 = 0
            java.lang.Object r6 = r6.a(r12)     // Catch:{ all -> 0x0916 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0916 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0916 }
            long r12 = (long) r6     // Catch:{ all -> 0x0916 }
            long r8 = r8 - r12
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x037c
            long r8 = r8 % r10
            r3 = 1
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x035b
            com.google.android.gms.measurement.internal.fc r3 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Bb r3 = r3.h()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Db r3 = r3.t()     // Catch:{ all -> 0x0916 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r18)     // Catch:{ all -> 0x0916 }
            long r6 = r7.f13521a     // Catch:{ all -> 0x0916 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0916 }
            r3.a(r4, r5, r6)     // Catch:{ all -> 0x0916 }
        L_0x035b:
            com.google.android.gms.measurement.internal.fc r3 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.se r7 = r3.v()     // Catch:{ all -> 0x0916 }
            r9 = 16
            java.lang.String r10 = "_ev"
            java.lang.String r11 = r2.f13696a     // Catch:{ all -> 0x0916 }
            r12 = 0
            r8 = r18
            r7.a((java.lang.String) r8, (int) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.d r2 = r27.e()     // Catch:{ all -> 0x0916 }
            r2.u()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.d r2 = r27.e()
            r2.H()
            return
        L_0x037c:
            if (r16 == 0) goto L_0x03ce
            long r8 = r7.f13524d     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.fc r6 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Ie r6 = r6.o()     // Catch:{ all -> 0x0916 }
            java.lang.String r10 = r3.f13822a     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.qb<java.lang.Integer> r11 = com.google.android.gms.measurement.internal.C3202q.n     // Catch:{ all -> 0x0916 }
            int r6 = r6.b(r10, r11)     // Catch:{ all -> 0x0916 }
            r10 = 1000000(0xf4240, float:1.401298E-39)
            int r6 = java.lang.Math.min(r10, r6)     // Catch:{ all -> 0x0916 }
            r12 = 0
            int r6 = java.lang.Math.max(r12, r6)     // Catch:{ all -> 0x0916 }
            long r10 = (long) r6     // Catch:{ all -> 0x0916 }
            long r8 = r8 - r10
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x03cf
            r10 = 1
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x03bf
            com.google.android.gms.measurement.internal.fc r2 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Bb r2 = r2.h()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Db r2 = r2.t()     // Catch:{ all -> 0x0916 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r18)     // Catch:{ all -> 0x0916 }
            long r5 = r7.f13524d     // Catch:{ all -> 0x0916 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0916 }
            r2.a(r3, r4, r5)     // Catch:{ all -> 0x0916 }
        L_0x03bf:
            com.google.android.gms.measurement.internal.d r2 = r27.e()     // Catch:{ all -> 0x0916 }
            r2.u()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.d r2 = r27.e()
            r2.H()
            return
        L_0x03ce:
            r12 = 0
        L_0x03cf:
            com.google.android.gms.measurement.internal.n r6 = r2.f13697b     // Catch:{ all -> 0x0916 }
            android.os.Bundle r6 = r6.b()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.fc r7 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.se r7 = r7.v()     // Catch:{ all -> 0x0916 }
            java.lang.String r8 = "_o"
            java.lang.String r9 = r2.f13698c     // Catch:{ all -> 0x0916 }
            r7.a((android.os.Bundle) r6, (java.lang.String) r8, (java.lang.Object) r9)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.fc r7 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.se r7 = r7.v()     // Catch:{ all -> 0x0916 }
            r13 = r18
            boolean r7 = r7.f(r13)     // Catch:{ all -> 0x0916 }
            java.lang.String r11 = "_r"
            if (r7 == 0) goto L_0x0410
            com.google.android.gms.measurement.internal.fc r7 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.se r7 = r7.v()     // Catch:{ all -> 0x0916 }
            java.lang.String r8 = "_dbg"
            r9 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0916 }
            r7.a((android.os.Bundle) r6, (java.lang.String) r8, (java.lang.Object) r12)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.fc r7 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.se r7 = r7.v()     // Catch:{ all -> 0x0916 }
            java.lang.Long r8 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0916 }
            r7.a((android.os.Bundle) r6, (java.lang.String) r11, (java.lang.Object) r8)     // Catch:{ all -> 0x0916 }
        L_0x0410:
            java.lang.String r7 = r2.f13696a     // Catch:{ all -> 0x0916 }
            boolean r7 = r4.equals(r7)     // Catch:{ all -> 0x0916 }
            java.lang.String r8 = "_sno"
            if (r7 == 0) goto L_0x0447
            com.google.android.gms.measurement.internal.fc r7 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Ie r7 = r7.o()     // Catch:{ all -> 0x0916 }
            java.lang.String r9 = r3.f13822a     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.C3202q.S     // Catch:{ all -> 0x0916 }
            boolean r7 = r7.e(r9, r10)     // Catch:{ all -> 0x0916 }
            if (r7 == 0) goto L_0x0447
            com.google.android.gms.measurement.internal.d r7 = r27.e()     // Catch:{ all -> 0x0916 }
            java.lang.String r9 = r3.f13822a     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.te r7 = r7.c((java.lang.String) r9, (java.lang.String) r8)     // Catch:{ all -> 0x0916 }
            if (r7 == 0) goto L_0x0447
            java.lang.Object r9 = r7.f13778e     // Catch:{ all -> 0x0916 }
            boolean r9 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x0916 }
            if (r9 == 0) goto L_0x0447
            com.google.android.gms.measurement.internal.fc r9 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.se r9 = r9.v()     // Catch:{ all -> 0x0916 }
            java.lang.Object r7 = r7.f13778e     // Catch:{ all -> 0x0916 }
            r9.a((android.os.Bundle) r6, (java.lang.String) r8, (java.lang.Object) r7)     // Catch:{ all -> 0x0916 }
        L_0x0447:
            java.lang.String r7 = r2.f13696a     // Catch:{ all -> 0x0916 }
            boolean r4 = r4.equals(r7)     // Catch:{ all -> 0x0916 }
            if (r4 == 0) goto L_0x0479
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Ie r4 = r4.o()     // Catch:{ all -> 0x0916 }
            java.lang.String r7 = r3.f13822a     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C3202q.W     // Catch:{ all -> 0x0916 }
            boolean r4 = r4.e(r7, r9)     // Catch:{ all -> 0x0916 }
            if (r4 == 0) goto L_0x0479
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Ie r4 = r4.o()     // Catch:{ all -> 0x0916 }
            java.lang.String r7 = r3.f13822a     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C3202q.S     // Catch:{ all -> 0x0916 }
            boolean r4 = r4.e(r7, r9)     // Catch:{ all -> 0x0916 }
            if (r4 != 0) goto L_0x0479
            com.google.android.gms.measurement.internal.re r4 = new com.google.android.gms.measurement.internal.re     // Catch:{ all -> 0x0916 }
            r12 = 0
            r4.<init>(r8, r14, r12)     // Catch:{ all -> 0x0916 }
            r1.b((com.google.android.gms.measurement.internal.re) r4, (com.google.android.gms.measurement.internal.xe) r3)     // Catch:{ all -> 0x0916 }
            goto L_0x047a
        L_0x0479:
            r12 = 0
        L_0x047a:
            com.google.android.gms.measurement.internal.d r4 = r27.e()     // Catch:{ all -> 0x0916 }
            long r7 = r4.c(r13)     // Catch:{ all -> 0x0916 }
            int r4 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x049d
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Bb r4 = r4.h()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Db r4 = r4.w()     // Catch:{ all -> 0x0916 }
            java.lang.String r9 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r13)     // Catch:{ all -> 0x0916 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0916 }
            r4.a(r9, r10, r7)     // Catch:{ all -> 0x0916 }
        L_0x049d:
            com.google.android.gms.measurement.internal.l r4 = new com.google.android.gms.measurement.internal.l     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.fc r8 = r1.j     // Catch:{ all -> 0x0916 }
            java.lang.String r9 = r2.f13698c     // Catch:{ all -> 0x0916 }
            java.lang.String r10 = r2.f13696a     // Catch:{ all -> 0x0916 }
            long r14 = r2.f13699d     // Catch:{ all -> 0x0916 }
            r19 = 0
            r7 = r4
            r2 = r10
            r10 = r13
            r26 = r11
            r11 = r2
            r16 = r12
            r2 = r13
            r25 = 0
            r12 = r14
            r28 = r16
            r14 = r19
            r16 = r6
            r7.<init>((com.google.android.gms.measurement.internal.C3144fc) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (long) r12, (long) r14, (android.os.Bundle) r16)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.d r6 = r27.e()     // Catch:{ all -> 0x0916 }
            java.lang.String r7 = r4.f13655b     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.k r6 = r6.a((java.lang.String) r2, (java.lang.String) r7)     // Catch:{ all -> 0x0916 }
            if (r6 != 0) goto L_0x0530
            com.google.android.gms.measurement.internal.d r6 = r27.e()     // Catch:{ all -> 0x0916 }
            long r6 = r6.g(r2)     // Catch:{ all -> 0x0916 }
            r8 = 500(0x1f4, double:2.47E-321)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0516
            if (r5 == 0) goto L_0x0516
            com.google.android.gms.measurement.internal.fc r3 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Bb r3 = r3.h()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Db r3 = r3.t()     // Catch:{ all -> 0x0916 }
            java.lang.String r5 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r2)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.fc r7 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.zb r7 = r7.w()     // Catch:{ all -> 0x0916 }
            java.lang.String r4 = r4.f13655b     // Catch:{ all -> 0x0916 }
            java.lang.String r4 = r7.a((java.lang.String) r4)     // Catch:{ all -> 0x0916 }
            r7 = 500(0x1f4, float:7.0E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0916 }
            r3.a(r5, r6, r4, r7)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.fc r3 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.se r7 = r3.v()     // Catch:{ all -> 0x0916 }
            r9 = 8
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r2
            r7.a((java.lang.String) r8, (int) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.d r2 = r27.e()
            r2.H()
            return
        L_0x0516:
            com.google.android.gms.measurement.internal.k r5 = new com.google.android.gms.measurement.internal.k     // Catch:{ all -> 0x0916 }
            java.lang.String r9 = r4.f13655b     // Catch:{ all -> 0x0916 }
            r10 = 0
            r12 = 0
            long r14 = r4.f13657d     // Catch:{ all -> 0x0916 }
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r7 = r5
            r8 = r2
            r7.<init>(r8, r9, r10, r12, r14, r16, r18, r19, r20, r21)     // Catch:{ all -> 0x0916 }
            goto L_0x053e
        L_0x0530:
            com.google.android.gms.measurement.internal.fc r2 = r1.j     // Catch:{ all -> 0x0916 }
            long r7 = r6.f13628f     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.l r4 = r4.a(r2, r7)     // Catch:{ all -> 0x0916 }
            long r7 = r4.f13657d     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.k r5 = r6.a(r7)     // Catch:{ all -> 0x0916 }
        L_0x053e:
            com.google.android.gms.measurement.internal.d r2 = r27.e()     // Catch:{ all -> 0x0916 }
            r2.a((com.google.android.gms.measurement.internal.C3171k) r5)     // Catch:{ all -> 0x0916 }
            r27.z()     // Catch:{ all -> 0x0916 }
            r27.p()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.common.internal.C0563t.a(r4)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.common.internal.C0563t.a(r29)     // Catch:{ all -> 0x0916 }
            java.lang.String r2 = r4.f13654a     // Catch:{ all -> 0x0916 }
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r2)     // Catch:{ all -> 0x0916 }
            java.lang.String r2 = r4.f13654a     // Catch:{ all -> 0x0916 }
            java.lang.String r5 = r3.f13822a     // Catch:{ all -> 0x0916 }
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.common.internal.C0563t.a((boolean) r2)     // Catch:{ all -> 0x0916 }
            c.b.b.b.d.f.X$a r2 = c.b.b.b.d.f.X.V()     // Catch:{ all -> 0x0916 }
            r5 = 1
            r2.a((int) r5)     // Catch:{ all -> 0x0916 }
            java.lang.String r6 = "android"
            r2.a((java.lang.String) r6)     // Catch:{ all -> 0x0916 }
            java.lang.String r6 = r3.f13822a     // Catch:{ all -> 0x0916 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0916 }
            if (r6 != 0) goto L_0x057b
            java.lang.String r6 = r3.f13822a     // Catch:{ all -> 0x0916 }
            r2.f((java.lang.String) r6)     // Catch:{ all -> 0x0916 }
        L_0x057b:
            java.lang.String r6 = r3.f13825d     // Catch:{ all -> 0x0916 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0916 }
            if (r6 != 0) goto L_0x0588
            java.lang.String r6 = r3.f13825d     // Catch:{ all -> 0x0916 }
            r2.e((java.lang.String) r6)     // Catch:{ all -> 0x0916 }
        L_0x0588:
            java.lang.String r6 = r3.f13824c     // Catch:{ all -> 0x0916 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0916 }
            if (r6 != 0) goto L_0x0595
            java.lang.String r6 = r3.f13824c     // Catch:{ all -> 0x0916 }
            r2.g((java.lang.String) r6)     // Catch:{ all -> 0x0916 }
        L_0x0595:
            long r6 = r3.j     // Catch:{ all -> 0x0916 }
            r8 = -2147483648(0xffffffff80000000, double:NaN)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x05a4
            long r6 = r3.j     // Catch:{ all -> 0x0916 }
            int r7 = (int) r6     // Catch:{ all -> 0x0916 }
            r2.h((int) r7)     // Catch:{ all -> 0x0916 }
        L_0x05a4:
            long r6 = r3.f13826e     // Catch:{ all -> 0x0916 }
            r2.f((long) r6)     // Catch:{ all -> 0x0916 }
            java.lang.String r6 = r3.f13823b     // Catch:{ all -> 0x0916 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0916 }
            if (r6 != 0) goto L_0x05b6
            java.lang.String r6 = r3.f13823b     // Catch:{ all -> 0x0916 }
            r2.k((java.lang.String) r6)     // Catch:{ all -> 0x0916 }
        L_0x05b6:
            boolean r6 = c.b.b.b.d.f.Le.b()     // Catch:{ all -> 0x0916 }
            if (r6 == 0) goto L_0x0605
            com.google.android.gms.measurement.internal.fc r6 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Ie r6 = r6.o()     // Catch:{ all -> 0x0916 }
            java.lang.String r7 = r3.f13822a     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.C3202q.Fa     // Catch:{ all -> 0x0916 }
            boolean r6 = r6.e(r7, r8)     // Catch:{ all -> 0x0916 }
            if (r6 == 0) goto L_0x0605
            java.lang.String r6 = r2.v()     // Catch:{ all -> 0x0916 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0916 }
            if (r6 == 0) goto L_0x05e3
            java.lang.String r6 = r3.v     // Catch:{ all -> 0x0916 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0916 }
            if (r6 != 0) goto L_0x05e3
            java.lang.String r6 = r3.v     // Catch:{ all -> 0x0916 }
            r2.p(r6)     // Catch:{ all -> 0x0916 }
        L_0x05e3:
            java.lang.String r6 = r2.v()     // Catch:{ all -> 0x0916 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0916 }
            if (r6 == 0) goto L_0x0633
            java.lang.String r6 = r2.y()     // Catch:{ all -> 0x0916 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0916 }
            if (r6 == 0) goto L_0x0633
            java.lang.String r6 = r3.r     // Catch:{ all -> 0x0916 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0916 }
            if (r6 != 0) goto L_0x0633
            java.lang.String r6 = r3.r     // Catch:{ all -> 0x0916 }
        L_0x0601:
            r2.o(r6)     // Catch:{ all -> 0x0916 }
            goto L_0x0633
        L_0x0605:
            com.google.android.gms.measurement.internal.fc r6 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Ie r6 = r6.o()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C3202q.ia     // Catch:{ all -> 0x0916 }
            boolean r6 = r6.a((com.google.android.gms.measurement.internal.C3204qb<java.lang.Boolean>) r7)     // Catch:{ all -> 0x0916 }
            if (r6 == 0) goto L_0x0628
            java.lang.String r6 = r2.v()     // Catch:{ all -> 0x0916 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0916 }
            if (r6 == 0) goto L_0x0633
            java.lang.String r6 = r3.r     // Catch:{ all -> 0x0916 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0916 }
            if (r6 != 0) goto L_0x0633
            java.lang.String r6 = r3.r     // Catch:{ all -> 0x0916 }
            goto L_0x0601
        L_0x0628:
            java.lang.String r6 = r3.r     // Catch:{ all -> 0x0916 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0916 }
            if (r6 != 0) goto L_0x0633
            java.lang.String r6 = r3.r     // Catch:{ all -> 0x0916 }
            goto L_0x0601
        L_0x0633:
            long r6 = r3.f13827f     // Catch:{ all -> 0x0916 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0640
            long r6 = r3.f13827f     // Catch:{ all -> 0x0916 }
            r2.h((long) r6)     // Catch:{ all -> 0x0916 }
        L_0x0640:
            long r6 = r3.t     // Catch:{ all -> 0x0916 }
            r2.k((long) r6)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.fc r6 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Ie r6 = r6.o()     // Catch:{ all -> 0x0916 }
            java.lang.String r7 = r3.f13822a     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.C3202q.fa     // Catch:{ all -> 0x0916 }
            boolean r6 = r6.e(r7, r10)     // Catch:{ all -> 0x0916 }
            if (r6 == 0) goto L_0x0662
            com.google.android.gms.measurement.internal.oe r6 = r27.m()     // Catch:{ all -> 0x0916 }
            java.util.List r6 = r6.u()     // Catch:{ all -> 0x0916 }
            if (r6 == 0) goto L_0x0662
            r2.c((java.lang.Iterable<? extends java.lang.Integer>) r6)     // Catch:{ all -> 0x0916 }
        L_0x0662:
            com.google.android.gms.measurement.internal.fc r6 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Lb r6 = r6.p()     // Catch:{ all -> 0x0916 }
            java.lang.String r7 = r3.f13822a     // Catch:{ all -> 0x0916 }
            android.util.Pair r6 = r6.a((java.lang.String) r7)     // Catch:{ all -> 0x0916 }
            if (r6 == 0) goto L_0x0695
            java.lang.Object r7 = r6.first     // Catch:{ all -> 0x0916 }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ all -> 0x0916 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0916 }
            if (r7 != 0) goto L_0x0695
            boolean r7 = r3.o     // Catch:{ all -> 0x0916 }
            if (r7 == 0) goto L_0x06f7
            java.lang.Object r7 = r6.first     // Catch:{ all -> 0x0916 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0916 }
            r2.h((java.lang.String) r7)     // Catch:{ all -> 0x0916 }
            java.lang.Object r7 = r6.second     // Catch:{ all -> 0x0916 }
            if (r7 == 0) goto L_0x06f7
            java.lang.Object r6 = r6.second     // Catch:{ all -> 0x0916 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0916 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0916 }
            r2.a((boolean) r6)     // Catch:{ all -> 0x0916 }
            goto L_0x06f7
        L_0x0695:
            com.google.android.gms.measurement.internal.fc r6 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.i r6 = r6.F()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.fc r7 = r1.j     // Catch:{ all -> 0x0916 }
            android.content.Context r7 = r7.f()     // Catch:{ all -> 0x0916 }
            boolean r6 = r6.a(r7)     // Catch:{ all -> 0x0916 }
            if (r6 != 0) goto L_0x06f7
            boolean r6 = r3.p     // Catch:{ all -> 0x0916 }
            if (r6 == 0) goto L_0x06f7
            com.google.android.gms.measurement.internal.fc r6 = r1.j     // Catch:{ all -> 0x0916 }
            android.content.Context r6 = r6.f()     // Catch:{ all -> 0x0916 }
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ all -> 0x0916 }
            java.lang.String r7 = "android_id"
            java.lang.String r6 = android.provider.Settings.Secure.getString(r6, r7)     // Catch:{ all -> 0x0916 }
            if (r6 != 0) goto L_0x06d7
            com.google.android.gms.measurement.internal.fc r6 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Bb r6 = r6.h()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Db r6 = r6.w()     // Catch:{ all -> 0x0916 }
            java.lang.String r7 = "null secure ID. appId"
            java.lang.String r10 = r2.t()     // Catch:{ all -> 0x0916 }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r10)     // Catch:{ all -> 0x0916 }
            r6.a(r7, r10)     // Catch:{ all -> 0x0916 }
            java.lang.String r6 = "null"
            goto L_0x06f4
        L_0x06d7:
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x0916 }
            if (r7 == 0) goto L_0x06f4
            com.google.android.gms.measurement.internal.fc r7 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Bb r7 = r7.h()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Db r7 = r7.w()     // Catch:{ all -> 0x0916 }
            java.lang.String r10 = "empty secure ID. appId"
            java.lang.String r11 = r2.t()     // Catch:{ all -> 0x0916 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r11)     // Catch:{ all -> 0x0916 }
            r7.a(r10, r11)     // Catch:{ all -> 0x0916 }
        L_0x06f4:
            r2.m(r6)     // Catch:{ all -> 0x0916 }
        L_0x06f7:
            com.google.android.gms.measurement.internal.fc r6 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.i r6 = r6.F()     // Catch:{ all -> 0x0916 }
            r6.o()     // Catch:{ all -> 0x0916 }
            java.lang.String r6 = android.os.Build.MODEL     // Catch:{ all -> 0x0916 }
            r2.c((java.lang.String) r6)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.fc r6 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.i r6 = r6.F()     // Catch:{ all -> 0x0916 }
            r6.o()     // Catch:{ all -> 0x0916 }
            java.lang.String r6 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0916 }
            r2.b((java.lang.String) r6)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.fc r6 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.i r6 = r6.F()     // Catch:{ all -> 0x0916 }
            long r6 = r6.t()     // Catch:{ all -> 0x0916 }
            int r7 = (int) r6     // Catch:{ all -> 0x0916 }
            r2.f((int) r7)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.fc r6 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.i r6 = r6.F()     // Catch:{ all -> 0x0916 }
            java.lang.String r6 = r6.u()     // Catch:{ all -> 0x0916 }
            r2.d((java.lang.String) r6)     // Catch:{ all -> 0x0916 }
            long r6 = r3.l     // Catch:{ all -> 0x0916 }
            r2.j((long) r6)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.fc r6 = r1.j     // Catch:{ all -> 0x0916 }
            boolean r6 = r6.c()     // Catch:{ all -> 0x0916 }
            if (r6 == 0) goto L_0x0757
            com.google.android.gms.measurement.internal.fc r6 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Ie r6 = r6.o()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C3202q.f13718c     // Catch:{ all -> 0x0916 }
            boolean r6 = r6.a((com.google.android.gms.measurement.internal.C3204qb<java.lang.Boolean>) r7)     // Catch:{ all -> 0x0916 }
            if (r6 == 0) goto L_0x0757
            r2.t()     // Catch:{ all -> 0x0916 }
            boolean r6 = android.text.TextUtils.isEmpty(r28)     // Catch:{ all -> 0x0916 }
            if (r6 != 0) goto L_0x0757
            r6 = r28
            r2.n(r6)     // Catch:{ all -> 0x0916 }
        L_0x0757:
            com.google.android.gms.measurement.internal.d r6 = r27.e()     // Catch:{ all -> 0x0916 }
            java.lang.String r7 = r3.f13822a     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.ec r6 = r6.b(r7)     // Catch:{ all -> 0x0916 }
            if (r6 != 0) goto L_0x07ca
            com.google.android.gms.measurement.internal.ec r6 = new com.google.android.gms.measurement.internal.ec     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.fc r7 = r1.j     // Catch:{ all -> 0x0916 }
            java.lang.String r10 = r3.f13822a     // Catch:{ all -> 0x0916 }
            r6.<init>(r7, r10)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.fc r7 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.se r7 = r7.v()     // Catch:{ all -> 0x0916 }
            java.lang.String r7 = r7.x()     // Catch:{ all -> 0x0916 }
            r6.a((java.lang.String) r7)     // Catch:{ all -> 0x0916 }
            java.lang.String r7 = r3.k     // Catch:{ all -> 0x0916 }
            r6.f((java.lang.String) r7)     // Catch:{ all -> 0x0916 }
            java.lang.String r7 = r3.f13823b     // Catch:{ all -> 0x0916 }
            r6.b((java.lang.String) r7)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.fc r7 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Lb r7 = r7.p()     // Catch:{ all -> 0x0916 }
            java.lang.String r10 = r3.f13822a     // Catch:{ all -> 0x0916 }
            java.lang.String r7 = r7.b((java.lang.String) r10)     // Catch:{ all -> 0x0916 }
            r6.e((java.lang.String) r7)     // Catch:{ all -> 0x0916 }
            r6.g((long) r8)     // Catch:{ all -> 0x0916 }
            r6.a((long) r8)     // Catch:{ all -> 0x0916 }
            r6.b((long) r8)     // Catch:{ all -> 0x0916 }
            java.lang.String r7 = r3.f13824c     // Catch:{ all -> 0x0916 }
            r6.g((java.lang.String) r7)     // Catch:{ all -> 0x0916 }
            long r10 = r3.j     // Catch:{ all -> 0x0916 }
            r6.c((long) r10)     // Catch:{ all -> 0x0916 }
            java.lang.String r7 = r3.f13825d     // Catch:{ all -> 0x0916 }
            r6.h((java.lang.String) r7)     // Catch:{ all -> 0x0916 }
            long r10 = r3.f13826e     // Catch:{ all -> 0x0916 }
            r6.d((long) r10)     // Catch:{ all -> 0x0916 }
            long r10 = r3.f13827f     // Catch:{ all -> 0x0916 }
            r6.e((long) r10)     // Catch:{ all -> 0x0916 }
            boolean r7 = r3.f13829h     // Catch:{ all -> 0x0916 }
            r6.a((boolean) r7)     // Catch:{ all -> 0x0916 }
            long r10 = r3.l     // Catch:{ all -> 0x0916 }
            r6.p(r10)     // Catch:{ all -> 0x0916 }
            long r10 = r3.t     // Catch:{ all -> 0x0916 }
            r6.f((long) r10)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.d r7 = r27.e()     // Catch:{ all -> 0x0916 }
            r7.a((com.google.android.gms.measurement.internal.C3138ec) r6)     // Catch:{ all -> 0x0916 }
        L_0x07ca:
            java.lang.String r7 = r6.m()     // Catch:{ all -> 0x0916 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0916 }
            if (r7 != 0) goto L_0x07db
            java.lang.String r7 = r6.m()     // Catch:{ all -> 0x0916 }
            r2.i((java.lang.String) r7)     // Catch:{ all -> 0x0916 }
        L_0x07db:
            java.lang.String r7 = r6.r()     // Catch:{ all -> 0x0916 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0916 }
            if (r7 != 0) goto L_0x07ec
            java.lang.String r6 = r6.r()     // Catch:{ all -> 0x0916 }
            r2.l((java.lang.String) r6)     // Catch:{ all -> 0x0916 }
        L_0x07ec:
            com.google.android.gms.measurement.internal.d r6 = r27.e()     // Catch:{ all -> 0x0916 }
            java.lang.String r3 = r3.f13822a     // Catch:{ all -> 0x0916 }
            java.util.List r3 = r6.a((java.lang.String) r3)     // Catch:{ all -> 0x0916 }
            r6 = 0
        L_0x07f7:
            int r7 = r3.size()     // Catch:{ all -> 0x0916 }
            if (r6 >= r7) goto L_0x082c
            c.b.b.b.d.f.ba$a r7 = c.b.b.b.d.f.C0298ba.x()     // Catch:{ all -> 0x0916 }
            java.lang.Object r10 = r3.get(r6)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.te r10 = (com.google.android.gms.measurement.internal.te) r10     // Catch:{ all -> 0x0916 }
            java.lang.String r10 = r10.f13776c     // Catch:{ all -> 0x0916 }
            r7.a((java.lang.String) r10)     // Catch:{ all -> 0x0916 }
            java.lang.Object r10 = r3.get(r6)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.te r10 = (com.google.android.gms.measurement.internal.te) r10     // Catch:{ all -> 0x0916 }
            long r10 = r10.f13777d     // Catch:{ all -> 0x0916 }
            r7.a((long) r10)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.oe r10 = r27.m()     // Catch:{ all -> 0x0916 }
            java.lang.Object r11 = r3.get(r6)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.te r11 = (com.google.android.gms.measurement.internal.te) r11     // Catch:{ all -> 0x0916 }
            java.lang.Object r11 = r11.f13778e     // Catch:{ all -> 0x0916 }
            r10.a((c.b.b.b.d.f.C0298ba.a) r7, (java.lang.Object) r11)     // Catch:{ all -> 0x0916 }
            r2.a((c.b.b.b.d.f.C0298ba.a) r7)     // Catch:{ all -> 0x0916 }
            int r6 = r6 + 1
            goto L_0x07f7
        L_0x082c:
            com.google.android.gms.measurement.internal.d r3 = r27.e()     // Catch:{ IOException -> 0x08a4 }
            c.b.b.b.d.f.wc r6 = r2.j()     // Catch:{ IOException -> 0x08a4 }
            c.b.b.b.d.f.Lb r6 = (c.b.b.b.d.f.Lb) r6     // Catch:{ IOException -> 0x08a4 }
            c.b.b.b.d.f.X r6 = (c.b.b.b.d.f.X) r6     // Catch:{ IOException -> 0x08a4 }
            long r2 = r3.a((c.b.b.b.d.f.X) r6)     // Catch:{ IOException -> 0x08a4 }
            com.google.android.gms.measurement.internal.d r6 = r27.e()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.n r7 = r4.f13659f     // Catch:{ all -> 0x0916 }
            if (r7 == 0) goto L_0x089a
            com.google.android.gms.measurement.internal.n r7 = r4.f13659f     // Catch:{ all -> 0x0916 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0916 }
        L_0x084a:
            boolean r10 = r7.hasNext()     // Catch:{ all -> 0x0916 }
            if (r10 == 0) goto L_0x0862
            java.lang.Object r10 = r7.next()     // Catch:{ all -> 0x0916 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0916 }
            r11 = r26
            boolean r10 = r11.equals(r10)     // Catch:{ all -> 0x0916 }
            if (r10 == 0) goto L_0x085f
            goto L_0x089b
        L_0x085f:
            r26 = r11
            goto L_0x084a
        L_0x0862:
            com.google.android.gms.measurement.internal._b r7 = r27.c()     // Catch:{ all -> 0x0916 }
            java.lang.String r10 = r4.f13654a     // Catch:{ all -> 0x0916 }
            java.lang.String r11 = r4.f13655b     // Catch:{ all -> 0x0916 }
            boolean r7 = r7.c(r10, r11)     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.d r10 = r27.e()     // Catch:{ all -> 0x0916 }
            long r11 = r27.A()     // Catch:{ all -> 0x0916 }
            java.lang.String r13 = r4.f13654a     // Catch:{ all -> 0x0916 }
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            com.google.android.gms.measurement.internal.c r10 = r10.a(r11, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0916 }
            if (r7 == 0) goto L_0x089a
            long r10 = r10.f13525e     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.fc r7 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Ie r7 = r7.o()     // Catch:{ all -> 0x0916 }
            java.lang.String r12 = r4.f13654a     // Catch:{ all -> 0x0916 }
            int r7 = r7.a((java.lang.String) r12)     // Catch:{ all -> 0x0916 }
            long r12 = (long) r7     // Catch:{ all -> 0x0916 }
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 >= 0) goto L_0x089a
            goto L_0x089b
        L_0x089a:
            r5 = 0
        L_0x089b:
            boolean r2 = r6.a((com.google.android.gms.measurement.internal.C3177l) r4, (long) r2, (boolean) r5)     // Catch:{ all -> 0x0916 }
            if (r2 == 0) goto L_0x08bd
            r1.n = r8     // Catch:{ all -> 0x0916 }
            goto L_0x08bd
        L_0x08a4:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.fc r5 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Bb r5 = r5.h()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Db r5 = r5.t()     // Catch:{ all -> 0x0916 }
            java.lang.String r6 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.t()     // Catch:{ all -> 0x0916 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r2)     // Catch:{ all -> 0x0916 }
            r5.a(r6, r2, r3)     // Catch:{ all -> 0x0916 }
        L_0x08bd:
            com.google.android.gms.measurement.internal.d r2 = r27.e()     // Catch:{ all -> 0x0916 }
            r2.u()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.fc r2 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Bb r2 = r2.h()     // Catch:{ all -> 0x0916 }
            r3 = 2
            boolean r2 = r2.a((int) r3)     // Catch:{ all -> 0x0916 }
            if (r2 == 0) goto L_0x08ea
            com.google.android.gms.measurement.internal.fc r2 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Bb r2 = r2.h()     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.Db r2 = r2.B()     // Catch:{ all -> 0x0916 }
            java.lang.String r3 = "Event recorded"
            com.google.android.gms.measurement.internal.fc r5 = r1.j     // Catch:{ all -> 0x0916 }
            com.google.android.gms.measurement.internal.zb r5 = r5.w()     // Catch:{ all -> 0x0916 }
            java.lang.String r4 = r5.a((com.google.android.gms.measurement.internal.C3177l) r4)     // Catch:{ all -> 0x0916 }
            r2.a(r3, r4)     // Catch:{ all -> 0x0916 }
        L_0x08ea:
            com.google.android.gms.measurement.internal.d r2 = r27.e()
            r2.H()
            r27.C()
            com.google.android.gms.measurement.internal.fc r2 = r1.j
            com.google.android.gms.measurement.internal.Bb r2 = r2.h()
            com.google.android.gms.measurement.internal.Db r2 = r2.B()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r23
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.a(r4, r3)
            return
        L_0x0916:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.d r3 = r27.e()
            r3.H()
            goto L_0x0921
        L_0x0920:
            throw r2
        L_0x0921:
            goto L_0x0920
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3176ke.b(com.google.android.gms.measurement.internal.o, com.google.android.gms.measurement.internal.xe):void");
    }

    private final boolean e(xe xeVar) {
        return (!Le.b() || !this.j.o().e(xeVar.f13822a, C3202q.Fa)) ? !TextUtils.isEmpty(xeVar.f13823b) || !TextUtils.isEmpty(xeVar.r) : !TextUtils.isEmpty(xeVar.f13823b) || !TextUtils.isEmpty(xeVar.v) || !TextUtils.isEmpty(xeVar.r);
    }

    private final void u() {
        z();
        if (this.r || this.s || this.t) {
            this.j.h().B().a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.r), Boolean.valueOf(this.s), Boolean.valueOf(this.t));
            return;
        }
        this.j.h().B().a("Stopping uploading service(s)");
        List<Runnable> list = this.o;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            this.o.clear();
        }
    }

    private final boolean v() {
        String str;
        Db db;
        FileLock fileLock;
        z();
        if (!this.j.o().a(C3202q.Da) || (fileLock = this.u) == null || !fileLock.isValid()) {
            try {
                this.v = new RandomAccessFile(new File(this.j.f().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.u = this.v.tryLock();
                if (this.u != null) {
                    this.j.h().B().a("Storage concurrent access okay");
                    return true;
                }
                this.j.h().t().a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e2) {
                e = e2;
                db = this.j.h().t();
                str = "Failed to acquire storage lock";
                db.a(str, e);
                return false;
            } catch (IOException e3) {
                e = e3;
                db = this.j.h().t();
                str = "Failed to access storage lock file";
                db.a(str, e);
                return false;
            } catch (OverlappingFileLockException e4) {
                e = e4;
                db = this.j.h().w();
                str = "Storage lock already acquired";
                db.a(str, e);
                return false;
            }
        } else {
            this.j.h().B().a("Storage concurrent access okay");
            return true;
        }
    }

    private final boolean w() {
        z();
        p();
        return this.l;
    }

    private final Jb x() {
        Jb jb = this.f13645e;
        if (jb != null) {
            return jb;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final C3152ge y() {
        b((C3158he) this.f13646f);
        return this.f13646f;
    }

    private final void z() {
        this.j.g().c();
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.j.g().c();
        e().J();
        if (this.j.p().f13337f.a() == 0) {
            this.j.p().f13337f.a(this.j.j().a());
        }
        C();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final void a(int i2, Throwable th, byte[] bArr, String str) {
        C3129d e2;
        z();
        p();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.s = false;
                u();
                throw th2;
            }
        }
        List<Long> list = this.w;
        this.w = null;
        boolean z = true;
        if ((i2 == 200 || i2 == 204) && th == null) {
            try {
                this.j.p().f13337f.a(this.j.j().a());
                this.j.p().f13338g.a(0);
                C();
                this.j.h().B().a("Successful upload. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr.length));
                e().G();
                try {
                    for (Long next : list) {
                        try {
                            e2 = e();
                            long longValue = next.longValue();
                            e2.c();
                            e2.r();
                            if (e2.v().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e3) {
                            e2.h().t().a("Failed to delete a bundle in a queue table", e3);
                            throw e3;
                        } catch (SQLiteException e4) {
                            if (this.x == null || !this.x.contains(next)) {
                                throw e4;
                            }
                        }
                    }
                    e().u();
                    e().H();
                    this.x = null;
                    if (!d().u() || !B()) {
                        this.y = -1;
                        C();
                    } else {
                        q();
                    }
                    this.n = 0;
                } catch (Throwable th3) {
                    e().H();
                    throw th3;
                }
            } catch (SQLiteException e5) {
                this.j.h().t().a("Database error while trying to delete uploaded bundles", e5);
                this.n = this.j.j().b();
                this.j.h().B().a("Disable upload, time", Long.valueOf(this.n));
            }
        } else {
            this.j.h().B().a("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th);
            this.j.p().f13338g.a(this.j.j().a());
            if (i2 != 503) {
                if (i2 != 429) {
                    z = false;
                }
            }
            if (z) {
                this.j.p().f13339h.a(this.j.j().a());
            }
            e().a(list);
            C();
        }
        this.s = false;
        u();
    }

    /* access modifiers changed from: package-private */
    public final void a(Ge ge) {
        xe a2 = a(ge.f13267a);
        if (a2 != null) {
            a(ge, a2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Ge ge, xe xeVar) {
        Db t2;
        String str;
        Object a2;
        String c2;
        Object a3;
        Db t3;
        String str2;
        Object a4;
        String c3;
        Object obj;
        C0563t.a(ge);
        C0563t.b(ge.f13267a);
        C0563t.a(ge.f13268b);
        C0563t.a(ge.f13269c);
        C0563t.b(ge.f13269c.f13747b);
        z();
        p();
        if (e(xeVar)) {
            if (!xeVar.f13829h) {
                c(xeVar);
                return;
            }
            Ge ge2 = new Ge(ge);
            boolean z = false;
            ge2.f13271e = false;
            e().G();
            try {
                Ge d2 = e().d(ge2.f13267a, ge2.f13269c.f13747b);
                if (d2 != null && !d2.f13268b.equals(ge2.f13268b)) {
                    this.j.h().w().a("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.j.w().c(ge2.f13269c.f13747b), ge2.f13268b, d2.f13268b);
                }
                if (d2 != null && d2.f13271e) {
                    ge2.f13268b = d2.f13268b;
                    ge2.f13270d = d2.f13270d;
                    ge2.f13274h = d2.f13274h;
                    ge2.f13272f = d2.f13272f;
                    ge2.i = d2.i;
                    ge2.f13271e = d2.f13271e;
                    ge2.f13269c = new re(ge2.f13269c.f13747b, d2.f13269c.f13748c, ge2.f13269c.a(), d2.f13269c.f13752g);
                } else if (TextUtils.isEmpty(ge2.f13272f)) {
                    ge2.f13269c = new re(ge2.f13269c.f13747b, ge2.f13270d, ge2.f13269c.a(), ge2.f13269c.f13752g);
                    ge2.f13271e = true;
                    z = true;
                }
                if (ge2.f13271e) {
                    re reVar = ge2.f13269c;
                    te teVar = new te(ge2.f13267a, ge2.f13268b, reVar.f13747b, reVar.f13748c, reVar.a());
                    if (e().a(teVar)) {
                        t3 = this.j.h().A();
                        str2 = "User property updated immediately";
                        a4 = ge2.f13267a;
                        c3 = this.j.w().c(teVar.f13776c);
                        obj = teVar.f13778e;
                    } else {
                        t3 = this.j.h().t();
                        str2 = "(2)Too many active user properties, ignoring";
                        a4 = Bb.a(ge2.f13267a);
                        c3 = this.j.w().c(teVar.f13776c);
                        obj = teVar.f13778e;
                    }
                    t3.a(str2, a4, c3, obj);
                    if (z && ge2.i != null) {
                        b(new C3192o(ge2.i, ge2.f13270d), xeVar);
                    }
                }
                if (e().a(ge2)) {
                    t2 = this.j.h().A();
                    str = "Conditional property added";
                    a2 = ge2.f13267a;
                    c2 = this.j.w().c(ge2.f13269c.f13747b);
                    a3 = ge2.f13269c.a();
                } else {
                    t2 = this.j.h().t();
                    str = "Too many conditional properties, ignoring";
                    a2 = Bb.a(ge2.f13267a);
                    c2 = this.j.w().c(ge2.f13269c.f13747b);
                    a3 = ge2.f13269c.a();
                }
                t2.a(str, a2, c2, a3);
                e().u();
            } finally {
                e().H();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(C3158he heVar) {
        this.p++;
    }

    /* access modifiers changed from: package-private */
    public final void a(C3192o oVar, xe xeVar) {
        List<Ge> list;
        List<Ge> list2;
        List<Ge> list3;
        Db t2;
        String str;
        Object a2;
        String c2;
        Object obj;
        List<String> list4;
        C3192o oVar2 = oVar;
        xe xeVar2 = xeVar;
        C0563t.a(xeVar);
        C0563t.b(xeVar2.f13822a);
        z();
        p();
        String str2 = xeVar2.f13822a;
        long j2 = oVar2.f13699d;
        if (m().a(oVar2, xeVar2)) {
            if (!xeVar2.f13829h) {
                c(xeVar2);
                return;
            }
            if (this.j.o().e(str2, C3202q.ma) && (list4 = xeVar2.u) != null) {
                if (list4.contains(oVar2.f13696a)) {
                    Bundle b2 = oVar2.f13697b.b();
                    b2.putLong("ga_safelisted", 1);
                    oVar2 = new C3192o(oVar2.f13696a, new C3187n(b2), oVar2.f13698c, oVar2.f13699d);
                } else {
                    this.j.h().A().a("Dropping non-safelisted event. appId, event name, origin", str2, oVar2.f13696a, oVar2.f13698c);
                    return;
                }
            }
            e().G();
            try {
                C3129d e2 = e();
                C0563t.b(str2);
                e2.c();
                e2.r();
                if (j2 < 0) {
                    e2.h().w().a("Invalid time querying timed out conditional properties", Bb.a(str2), Long.valueOf(j2));
                    list = Collections.emptyList();
                } else {
                    list = e2.a("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j2)});
                }
                for (Ge next : list) {
                    if (next != null) {
                        this.j.h().A().a("User property timed out", next.f13267a, this.j.w().c(next.f13269c.f13747b), next.f13269c.a());
                        if (next.f13273g != null) {
                            b(new C3192o(next.f13273g, j2), xeVar2);
                        }
                        e().e(str2, next.f13269c.f13747b);
                    }
                }
                C3129d e3 = e();
                C0563t.b(str2);
                e3.c();
                e3.r();
                if (j2 < 0) {
                    e3.h().w().a("Invalid time querying expired conditional properties", Bb.a(str2), Long.valueOf(j2));
                    list2 = Collections.emptyList();
                } else {
                    list2 = e3.a("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j2)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (Ge next2 : list2) {
                    if (next2 != null) {
                        this.j.h().A().a("User property expired", next2.f13267a, this.j.w().c(next2.f13269c.f13747b), next2.f13269c.a());
                        e().b(str2, next2.f13269c.f13747b);
                        if (next2.k != null) {
                            arrayList.add(next2.k);
                        }
                        e().e(str2, next2.f13269c.f13747b);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    b(new C3192o((C3192o) obj2, j2), xeVar2);
                }
                C3129d e4 = e();
                String str3 = oVar2.f13696a;
                C0563t.b(str2);
                C0563t.b(str3);
                e4.c();
                e4.r();
                if (j2 < 0) {
                    e4.h().w().a("Invalid time querying triggered conditional properties", Bb.a(str2), e4.e().a(str3), Long.valueOf(j2));
                    list3 = Collections.emptyList();
                } else {
                    list3 = e4.a("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j2)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (Ge next3 : list3) {
                    if (next3 != null) {
                        re reVar = next3.f13269c;
                        te teVar = r4;
                        te teVar2 = new te(next3.f13267a, next3.f13268b, reVar.f13747b, j2, reVar.a());
                        if (e().a(teVar)) {
                            t2 = this.j.h().A();
                            str = "User property triggered";
                            a2 = next3.f13267a;
                            c2 = this.j.w().c(teVar.f13776c);
                            obj = teVar.f13778e;
                        } else {
                            t2 = this.j.h().t();
                            str = "Too many active user properties, ignoring";
                            a2 = Bb.a(next3.f13267a);
                            c2 = this.j.w().c(teVar.f13776c);
                            obj = teVar.f13778e;
                        }
                        t2.a(str, a2, c2, obj);
                        if (next3.i != null) {
                            arrayList2.add(next3.i);
                        }
                        next3.f13269c = new re(teVar);
                        next3.f13271e = true;
                        e().a(next3);
                    }
                }
                b(oVar2, xeVar2);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj3 = arrayList2.get(i3);
                    i3++;
                    b(new C3192o((C3192o) obj3, j2), xeVar2);
                }
                e().u();
            } finally {
                e().H();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(C3192o oVar, String str) {
        C3192o oVar2 = oVar;
        C3138ec b2 = e().b(str);
        if (b2 == null || TextUtils.isEmpty(b2.u())) {
            this.j.h().A().a("No app data available; dropping event", str);
            return;
        }
        Boolean b3 = b(b2);
        if (b3 == null) {
            if (!"_ui".equals(oVar2.f13696a)) {
                this.j.h().w().a("Could not find package. appId", Bb.a(str));
            }
        } else if (!b3.booleanValue()) {
            this.j.h().t().a("App version does not match; dropping event. appId", Bb.a(str));
            return;
        }
        xe xeVar = r2;
        xe xeVar2 = new xe(str, b2.n(), b2.u(), b2.v(), b2.w(), b2.x(), b2.y(), (String) null, b2.A(), false, b2.r(), b2.f(), 0, 0, b2.g(), b2.h(), false, b2.o(), b2.i(), b2.z(), b2.j(), (!Le.b() || !this.j.o().e(b2.l(), C3202q.Fa)) ? null : b2.p());
        a(oVar2, xeVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(re reVar, xe xeVar) {
        C3171k a2;
        z();
        p();
        if (e(xeVar)) {
            if (!xeVar.f13829h) {
                c(xeVar);
                return;
            }
            int c2 = this.j.v().c(reVar.f13747b);
            if (c2 != 0) {
                this.j.v();
                String a3 = se.a(reVar.f13747b, 24, true);
                String str = reVar.f13747b;
                this.j.v().a(xeVar.f13822a, c2, "_ev", a3, str != null ? str.length() : 0);
                return;
            }
            int b2 = this.j.v().b(reVar.f13747b, reVar.a());
            if (b2 != 0) {
                this.j.v();
                String a4 = se.a(reVar.f13747b, 24, true);
                Object a5 = reVar.a();
                this.j.v().a(xeVar.f13822a, b2, "_ev", a4, (a5 == null || (!(a5 instanceof String) && !(a5 instanceof CharSequence))) ? 0 : String.valueOf(a5).length());
                return;
            }
            Object c3 = this.j.v().c(reVar.f13747b, reVar.a());
            if (c3 != null) {
                if ("_sid".equals(reVar.f13747b) && this.j.o().e(xeVar.f13822a, C3202q.S)) {
                    long j2 = reVar.f13748c;
                    String str2 = reVar.f13752g;
                    long j3 = 0;
                    te c4 = e().c(xeVar.f13822a, "_sno");
                    if (c4 != null) {
                        Object obj = c4.f13778e;
                        if (obj instanceof Long) {
                            j3 = ((Long) obj).longValue();
                            a(new re("_sno", j2, Long.valueOf(j3 + 1), str2), xeVar);
                        }
                    }
                    if (c4 != null) {
                        this.j.h().w().a("Retrieved last session number from database does not contain a valid (long) value", c4.f13778e);
                    }
                    if (this.j.o().e(xeVar.f13822a, C3202q.V) && (a2 = e().a(xeVar.f13822a, "_s")) != null) {
                        j3 = a2.f13625c;
                        this.j.h().B().a("Backfill the session number. Last used session number", Long.valueOf(j3));
                    }
                    a(new re("_sno", j2, Long.valueOf(j3 + 1), str2), xeVar);
                }
                te teVar = new te(xeVar.f13822a, reVar.f13752g, reVar.f13747b, reVar.f13748c, c3);
                this.j.h().A().a("Setting user property", this.j.w().c(teVar.f13776c), c3);
                e().G();
                try {
                    c(xeVar);
                    boolean a6 = e().a(teVar);
                    e().u();
                    if (a6) {
                        this.j.h().A().a("User property set", this.j.w().c(teVar.f13776c), teVar.f13778e);
                    } else {
                        this.j.h().t().a("Too many unique user properties are set. Ignoring user property", this.j.w().c(teVar.f13776c), teVar.f13778e);
                        this.j.v().a(xeVar.f13822a, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    e().H();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(xe xeVar) {
        if (this.w != null) {
            this.x = new ArrayList();
            this.x.addAll(this.w);
        }
        C3129d e2 = e();
        String str = xeVar.f13822a;
        C0563t.b(str);
        e2.c();
        e2.r();
        try {
            SQLiteDatabase v2 = e2.v();
            String[] strArr = {str};
            int delete = v2.delete("apps", "app_id=?", strArr) + 0 + v2.delete("events", "app_id=?", strArr) + v2.delete("user_attributes", "app_id=?", strArr) + v2.delete("conditional_properties", "app_id=?", strArr) + v2.delete("raw_events", "app_id=?", strArr) + v2.delete("raw_events_metadata", "app_id=?", strArr) + v2.delete("queue", "app_id=?", strArr) + v2.delete("audience_filter_values", "app_id=?", strArr) + v2.delete("main_event_params", "app_id=?", strArr);
            if (delete > 0) {
                e2.h().B().a("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e3) {
            e2.h().t().a("Error resetting analytics data. appId, error", Bb.a(str), e3);
        }
        if (!C0419se.b() || !this.j.o().a(C3202q.Ka)) {
            xe a2 = a(this.j.f(), xeVar.f13822a, xeVar.f13823b, xeVar.f13829h, xeVar.o, xeVar.p, xeVar.m, xeVar.r, xeVar.v);
            if (xeVar.f13829h) {
                b(a2);
            }
        } else if (xeVar.f13829h) {
            b(xeVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Runnable runnable) {
        z();
        if (this.o == null) {
            this.o = new ArrayList();
        }
        this.o.add(runnable);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0132 A[Catch:{ all -> 0x0179, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0142 A[Catch:{ all -> 0x0179, all -> 0x0182 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            r6.z()
            r6.p()
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r7)
            r0 = 0
            if (r10 != 0) goto L_0x000e
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x0182 }
        L_0x000e:
            com.google.android.gms.measurement.internal.fc r1 = r6.j     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.Bb r1 = r1.h()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.Db r1 = r1.B()     // Catch:{ all -> 0x0182 }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x0182 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0182 }
            r1.a(r2, r3)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.d r1 = r6.e()     // Catch:{ all -> 0x0182 }
            r1.G()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.d r1 = r6.e()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.ec r1 = r1.b(r7)     // Catch:{ all -> 0x0179 }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            r4 = 1
            if (r8 == r2) goto L_0x003e
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x003e
            if (r8 != r3) goto L_0x0042
        L_0x003e:
            if (r9 != 0) goto L_0x0042
            r2 = 1
            goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            if (r1 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.fc r8 = r6.j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.Bb r8 = r8.h()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.Db r8 = r8.w()     // Catch:{ all -> 0x0179 }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r7)     // Catch:{ all -> 0x0179 }
            r8.a(r9, r7)     // Catch:{ all -> 0x0179 }
            goto L_0x016d
        L_0x005a:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00ca
            if (r8 != r5) goto L_0x0061
            goto L_0x00ca
        L_0x0061:
            com.google.android.gms.measurement.internal.fc r10 = r6.j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.common.util.e r10 = r10.j()     // Catch:{ all -> 0x0179 }
            long r10 = r10.a()     // Catch:{ all -> 0x0179 }
            r1.i((long) r10)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.d r10 = r6.e()     // Catch:{ all -> 0x0179 }
            r10.a((com.google.android.gms.measurement.internal.C3138ec) r1)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.fc r10 = r6.j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.Bb r10 = r10.h()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.Db r10 = r10.B()     // Catch:{ all -> 0x0179 }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0179 }
            r10.a(r11, r1, r9)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal._b r9 = r6.c()     // Catch:{ all -> 0x0179 }
            r9.c(r7)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.fc r7 = r6.j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.Lb r7 = r7.p()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.Qb r7 = r7.f13338g     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.fc r9 = r6.j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.common.util.e r9 = r9.j()     // Catch:{ all -> 0x0179 }
            long r9 = r9.a()     // Catch:{ all -> 0x0179 }
            r7.a(r9)     // Catch:{ all -> 0x0179 }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00ae
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r4 = 0
        L_0x00ae:
            if (r4 == 0) goto L_0x00c5
            com.google.android.gms.measurement.internal.fc r7 = r6.j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.Lb r7 = r7.p()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.Qb r7 = r7.f13339h     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.fc r8 = r6.j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.common.util.e r8 = r8.j()     // Catch:{ all -> 0x0179 }
            long r8 = r8.a()     // Catch:{ all -> 0x0179 }
            r7.a(r8)     // Catch:{ all -> 0x0179 }
        L_0x00c5:
            r6.C()     // Catch:{ all -> 0x0179 }
            goto L_0x016d
        L_0x00ca:
            r9 = 0
            if (r11 == 0) goto L_0x00d6
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x0179 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0179 }
            goto L_0x00d7
        L_0x00d6:
            r11 = r9
        L_0x00d7:
            if (r11 == 0) goto L_0x00e6
            int r2 = r11.size()     // Catch:{ all -> 0x0179 }
            if (r2 <= 0) goto L_0x00e6
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x0179 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0179 }
            goto L_0x00e7
        L_0x00e6:
            r11 = r9
        L_0x00e7:
            if (r8 == r5) goto L_0x0103
            if (r8 != r3) goto L_0x00ec
            goto L_0x0103
        L_0x00ec:
            com.google.android.gms.measurement.internal._b r9 = r6.c()     // Catch:{ all -> 0x0179 }
            boolean r9 = r9.a(r7, r10, r11)     // Catch:{ all -> 0x0179 }
            if (r9 != 0) goto L_0x011c
            com.google.android.gms.measurement.internal.d r7 = r6.e()     // Catch:{ all -> 0x0182 }
        L_0x00fa:
            r7.H()     // Catch:{ all -> 0x0182 }
            r6.r = r0
            r6.u()
            return
        L_0x0103:
            com.google.android.gms.measurement.internal._b r11 = r6.c()     // Catch:{ all -> 0x0179 }
            c.b.b.b.d.f.M r11 = r11.a((java.lang.String) r7)     // Catch:{ all -> 0x0179 }
            if (r11 != 0) goto L_0x011c
            com.google.android.gms.measurement.internal._b r11 = r6.c()     // Catch:{ all -> 0x0179 }
            boolean r9 = r11.a(r7, r9, r9)     // Catch:{ all -> 0x0179 }
            if (r9 != 0) goto L_0x011c
            com.google.android.gms.measurement.internal.d r7 = r6.e()     // Catch:{ all -> 0x0182 }
            goto L_0x00fa
        L_0x011c:
            com.google.android.gms.measurement.internal.fc r9 = r6.j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.common.util.e r9 = r9.j()     // Catch:{ all -> 0x0179 }
            long r2 = r9.a()     // Catch:{ all -> 0x0179 }
            r1.h((long) r2)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.d r9 = r6.e()     // Catch:{ all -> 0x0179 }
            r9.a((com.google.android.gms.measurement.internal.C3138ec) r1)     // Catch:{ all -> 0x0179 }
            if (r8 != r5) goto L_0x0142
            com.google.android.gms.measurement.internal.fc r8 = r6.j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.Bb r8 = r8.h()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.Db r8 = r8.y()     // Catch:{ all -> 0x0179 }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.a(r9, r7)     // Catch:{ all -> 0x0179 }
            goto L_0x015a
        L_0x0142:
            com.google.android.gms.measurement.internal.fc r7 = r6.j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.Bb r7 = r7.h()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.Db r7 = r7.B()     // Catch:{ all -> 0x0179 }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0179 }
            int r10 = r10.length     // Catch:{ all -> 0x0179 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0179 }
            r7.a(r9, r8, r10)     // Catch:{ all -> 0x0179 }
        L_0x015a:
            com.google.android.gms.measurement.internal.Gb r7 = r6.d()     // Catch:{ all -> 0x0179 }
            boolean r7 = r7.u()     // Catch:{ all -> 0x0179 }
            if (r7 == 0) goto L_0x00c5
            boolean r7 = r6.B()     // Catch:{ all -> 0x0179 }
            if (r7 == 0) goto L_0x00c5
            r6.q()     // Catch:{ all -> 0x0179 }
        L_0x016d:
            com.google.android.gms.measurement.internal.d r7 = r6.e()     // Catch:{ all -> 0x0179 }
            r7.u()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.d r7 = r6.e()     // Catch:{ all -> 0x0182 }
            goto L_0x00fa
        L_0x0179:
            r7 = move-exception
            com.google.android.gms.measurement.internal.d r8 = r6.e()     // Catch:{ all -> 0x0182 }
            r8.H()     // Catch:{ all -> 0x0182 }
            throw r7     // Catch:{ all -> 0x0182 }
        L_0x0182:
            r7 = move-exception
            r6.r = r0
            r6.u()
            goto L_0x018a
        L_0x0189:
            throw r7
        L_0x018a:
            goto L_0x0189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3176ke.a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        C();
    }

    public final Ie b() {
        return this.j.o();
    }

    /* access modifiers changed from: package-private */
    public final void b(Ge ge) {
        xe a2 = a(ge.f13267a);
        if (a2 != null) {
            b(ge, a2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(Ge ge, xe xeVar) {
        C0563t.a(ge);
        C0563t.b(ge.f13267a);
        C0563t.a(ge.f13269c);
        C0563t.b(ge.f13269c.f13747b);
        z();
        p();
        if (e(xeVar)) {
            if (!xeVar.f13829h) {
                c(xeVar);
                return;
            }
            e().G();
            try {
                c(xeVar);
                Ge d2 = e().d(ge.f13267a, ge.f13269c.f13747b);
                if (d2 != null) {
                    this.j.h().A().a("Removing conditional user property", ge.f13267a, this.j.w().c(ge.f13269c.f13747b));
                    e().e(ge.f13267a, ge.f13269c.f13747b);
                    if (d2.f13271e) {
                        e().b(ge.f13267a, ge.f13269c.f13747b);
                    }
                    if (ge.k != null) {
                        Bundle bundle = null;
                        if (ge.k.f13697b != null) {
                            bundle = ge.k.f13697b.b();
                        }
                        Bundle bundle2 = bundle;
                        b(this.j.v().a(ge.f13267a, ge.k.f13696a, bundle2, d2.f13268b, ge.k.f13699d, true, false), xeVar);
                    }
                } else {
                    this.j.h().w().a("Conditional user property doesn't exist", Bb.a(ge.f13267a), this.j.w().c(ge.f13269c.f13747b));
                }
                e().u();
            } finally {
                e().H();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(re reVar, xe xeVar) {
        z();
        p();
        if (e(xeVar)) {
            if (!xeVar.f13829h) {
                c(xeVar);
            } else if (!this.j.o().e(xeVar.f13822a, C3202q.ca)) {
                this.j.h().A().a("Removing user property", this.j.w().c(reVar.f13747b));
                e().G();
                try {
                    c(xeVar);
                    e().b(xeVar.f13822a, reVar.f13747b);
                    e().u();
                    this.j.h().A().a("User property removed", this.j.w().c(reVar.f13747b));
                } finally {
                    e().H();
                }
            } else if (!"_npa".equals(reVar.f13747b) || xeVar.s == null) {
                this.j.h().A().a("Removing user property", this.j.w().c(reVar.f13747b));
                e().G();
                try {
                    c(xeVar);
                    e().b(xeVar.f13822a, reVar.f13747b);
                    e().u();
                    this.j.h().A().a("User property removed", this.j.w().c(reVar.f13747b));
                } finally {
                    e().H();
                }
            } else {
                this.j.h().A().a("Falling back to manifest metadata value for ad personalization");
                a(new re("_npa", this.j.j().a(), Long.valueOf(xeVar.s.booleanValue() ? 1 : 0), "auto"), xeVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x047b A[Catch:{ NameNotFoundException -> 0x0347, all -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x04b0 A[Catch:{ NameNotFoundException -> 0x0347, all -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01eb A[Catch:{ NameNotFoundException -> 0x0347, all -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x021f A[Catch:{ NameNotFoundException -> 0x0347, all -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0221 A[Catch:{ NameNotFoundException -> 0x0347, all -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0225 A[Catch:{ NameNotFoundException -> 0x0347, all -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0248 A[Catch:{ NameNotFoundException -> 0x0347, all -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x024f A[Catch:{ NameNotFoundException -> 0x0347, all -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x025c A[Catch:{ NameNotFoundException -> 0x0347, all -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x026b A[Catch:{ NameNotFoundException -> 0x0347, all -> 0x04d9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.google.android.gms.measurement.internal.xe r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = "_sys"
            java.lang.String r4 = "_pfo"
            java.lang.String r5 = "_uwa"
            java.lang.String r0 = "app_id=?"
            r21.z()
            r21.p()
            com.google.android.gms.common.internal.C0563t.a(r22)
            java.lang.String r6 = r2.f13822a
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r6)
            boolean r6 = r21.e(r22)
            if (r6 != 0) goto L_0x0021
            return
        L_0x0021:
            com.google.android.gms.measurement.internal.d r6 = r21.e()
            java.lang.String r7 = r2.f13822a
            com.google.android.gms.measurement.internal.ec r6 = r6.b(r7)
            r7 = 0
            if (r6 == 0) goto L_0x0054
            java.lang.String r9 = r6.n()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x0054
            java.lang.String r9 = r2.f13823b
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x0054
            r6.h((long) r7)
            com.google.android.gms.measurement.internal.d r9 = r21.e()
            r9.a((com.google.android.gms.measurement.internal.C3138ec) r6)
            com.google.android.gms.measurement.internal._b r6 = r21.c()
            java.lang.String r9 = r2.f13822a
            r6.d(r9)
        L_0x0054:
            boolean r6 = r2.f13829h
            if (r6 != 0) goto L_0x005c
            r21.c(r22)
            return
        L_0x005c:
            long r9 = r2.m
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x006c
            com.google.android.gms.measurement.internal.fc r6 = r1.j
            com.google.android.gms.common.util.e r6 = r6.j()
            long r9 = r6.a()
        L_0x006c:
            com.google.android.gms.measurement.internal.fc r6 = r1.j
            com.google.android.gms.measurement.internal.Ie r6 = r6.o()
            java.lang.String r11 = r2.f13822a
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C3202q.ca
            boolean r6 = r6.e(r11, r12)
            if (r6 == 0) goto L_0x0085
            com.google.android.gms.measurement.internal.fc r6 = r1.j
            com.google.android.gms.measurement.internal.i r6 = r6.F()
            r6.w()
        L_0x0085:
            int r6 = r2.n
            r15 = 0
            r13 = 1
            if (r6 == 0) goto L_0x00a7
            if (r6 == r13) goto L_0x00a7
            com.google.android.gms.measurement.internal.fc r11 = r1.j
            com.google.android.gms.measurement.internal.Bb r11 = r11.h()
            com.google.android.gms.measurement.internal.Db r11 = r11.w()
            java.lang.String r12 = r2.f13822a
            java.lang.Object r12 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r12)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r14 = "Incorrect app type, assuming installed app. appId, appType"
            r11.a(r14, r12, r6)
            r6 = 0
        L_0x00a7:
            com.google.android.gms.measurement.internal.d r11 = r21.e()
            r11.G()
            com.google.android.gms.measurement.internal.fc r11 = r1.j     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.Ie r11 = r11.o()     // Catch:{ all -> 0x04d9 }
            java.lang.String r12 = r2.f13822a     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.C3202q.ca     // Catch:{ all -> 0x04d9 }
            boolean r11 = r11.e(r12, r14)     // Catch:{ all -> 0x04d9 }
            if (r11 == 0) goto L_0x0127
            com.google.android.gms.measurement.internal.d r11 = r21.e()     // Catch:{ all -> 0x04d9 }
            java.lang.String r12 = r2.f13822a     // Catch:{ all -> 0x04d9 }
            java.lang.String r14 = "_npa"
            com.google.android.gms.measurement.internal.te r14 = r11.c((java.lang.String) r12, (java.lang.String) r14)     // Catch:{ all -> 0x04d9 }
            if (r14 == 0) goto L_0x00d6
            java.lang.String r11 = "auto"
            java.lang.String r12 = r14.f13775b     // Catch:{ all -> 0x04d9 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x04d9 }
            if (r11 == 0) goto L_0x0127
        L_0x00d6:
            java.lang.Boolean r11 = r2.s     // Catch:{ all -> 0x04d9 }
            if (r11 == 0) goto L_0x0111
            com.google.android.gms.measurement.internal.re r12 = new com.google.android.gms.measurement.internal.re     // Catch:{ all -> 0x04d9 }
            java.lang.String r16 = "_npa"
            java.lang.Boolean r11 = r2.s     // Catch:{ all -> 0x04d9 }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x04d9 }
            if (r11 == 0) goto L_0x00e9
            r17 = 1
            goto L_0x00eb
        L_0x00e9:
            r17 = 0
        L_0x00eb:
            java.lang.Long r17 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x04d9 }
            java.lang.String r18 = "auto"
            r11 = r12
            r7 = r12
            r12 = r16
            r19 = r3
            r8 = r14
            r3 = 1
            r13 = r9
            r15 = r17
            r16 = r18
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04d9 }
            if (r8 == 0) goto L_0x010d
            java.lang.Object r8 = r8.f13778e     // Catch:{ all -> 0x04d9 }
            java.lang.Long r11 = r7.f13749d     // Catch:{ all -> 0x04d9 }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x04d9 }
            if (r8 != 0) goto L_0x012a
        L_0x010d:
            r1.a((com.google.android.gms.measurement.internal.re) r7, (com.google.android.gms.measurement.internal.xe) r2)     // Catch:{ all -> 0x04d9 }
            goto L_0x012a
        L_0x0111:
            r19 = r3
            r8 = r14
            r3 = 1
            if (r8 == 0) goto L_0x012a
            com.google.android.gms.measurement.internal.re r7 = new com.google.android.gms.measurement.internal.re     // Catch:{ all -> 0x04d9 }
            java.lang.String r12 = "_npa"
            r15 = 0
            java.lang.String r16 = "auto"
            r11 = r7
            r13 = r9
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04d9 }
            r1.b((com.google.android.gms.measurement.internal.re) r7, (com.google.android.gms.measurement.internal.xe) r2)     // Catch:{ all -> 0x04d9 }
            goto L_0x012a
        L_0x0127:
            r19 = r3
            r3 = 1
        L_0x012a:
            com.google.android.gms.measurement.internal.d r7 = r21.e()     // Catch:{ all -> 0x04d9 }
            java.lang.String r8 = r2.f13822a     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.ec r7 = r7.b(r8)     // Catch:{ all -> 0x04d9 }
            if (r7 == 0) goto L_0x01e8
            com.google.android.gms.measurement.internal.fc r11 = r1.j     // Catch:{ all -> 0x04d9 }
            r11.v()     // Catch:{ all -> 0x04d9 }
            java.lang.String r11 = r2.f13823b     // Catch:{ all -> 0x04d9 }
            java.lang.String r12 = r7.n()     // Catch:{ all -> 0x04d9 }
            java.lang.String r13 = r2.r     // Catch:{ all -> 0x04d9 }
            java.lang.String r14 = r7.o()     // Catch:{ all -> 0x04d9 }
            boolean r11 = com.google.android.gms.measurement.internal.se.a((java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14)     // Catch:{ all -> 0x04d9 }
            if (r11 == 0) goto L_0x01e8
            com.google.android.gms.measurement.internal.fc r11 = r1.j     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.Bb r11 = r11.h()     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.Db r11 = r11.w()     // Catch:{ all -> 0x04d9 }
            java.lang.String r12 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r13 = r7.l()     // Catch:{ all -> 0x04d9 }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r13)     // Catch:{ all -> 0x04d9 }
            r11.a(r12, r13)     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.d r11 = r21.e()     // Catch:{ all -> 0x04d9 }
            java.lang.String r7 = r7.l()     // Catch:{ all -> 0x04d9 }
            r11.r()     // Catch:{ all -> 0x04d9 }
            r11.c()     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r7)     // Catch:{ all -> 0x04d9 }
            android.database.sqlite.SQLiteDatabase r12 = r11.v()     // Catch:{ SQLiteException -> 0x01d3 }
            java.lang.String[] r13 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x01d3 }
            r15 = 0
            r13[r15] = r7     // Catch:{ SQLiteException -> 0x01d1 }
            java.lang.String r14 = "events"
            int r14 = r12.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01d1 }
            int r14 = r14 + r15
            java.lang.String r8 = "user_attributes"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01d1 }
            int r14 = r14 + r8
            java.lang.String r8 = "conditional_properties"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01d1 }
            int r14 = r14 + r8
            java.lang.String r8 = "apps"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01d1 }
            int r14 = r14 + r8
            java.lang.String r8 = "raw_events"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01d1 }
            int r14 = r14 + r8
            java.lang.String r8 = "raw_events_metadata"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01d1 }
            int r14 = r14 + r8
            java.lang.String r8 = "event_filters"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01d1 }
            int r14 = r14 + r8
            java.lang.String r8 = "property_filters"
            int r8 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01d1 }
            int r14 = r14 + r8
            java.lang.String r8 = "audience_filter_values"
            int r0 = r12.delete(r8, r0, r13)     // Catch:{ SQLiteException -> 0x01d1 }
            int r14 = r14 + r0
            if (r14 <= 0) goto L_0x01e6
            com.google.android.gms.measurement.internal.Bb r0 = r11.h()     // Catch:{ SQLiteException -> 0x01d1 }
            com.google.android.gms.measurement.internal.Db r0 = r0.B()     // Catch:{ SQLiteException -> 0x01d1 }
            java.lang.String r8 = "Deleted application data. app, records"
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x01d1 }
            r0.a(r8, r7, r12)     // Catch:{ SQLiteException -> 0x01d1 }
            goto L_0x01e6
        L_0x01d1:
            r0 = move-exception
            goto L_0x01d5
        L_0x01d3:
            r0 = move-exception
            r15 = 0
        L_0x01d5:
            com.google.android.gms.measurement.internal.Bb r8 = r11.h()     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.Db r8 = r8.t()     // Catch:{ all -> 0x04d9 }
            java.lang.String r11 = "Error deleting application data. appId, error"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r7)     // Catch:{ all -> 0x04d9 }
            r8.a(r11, r7, r0)     // Catch:{ all -> 0x04d9 }
        L_0x01e6:
            r7 = 0
            goto L_0x01e9
        L_0x01e8:
            r15 = 0
        L_0x01e9:
            if (r7 == 0) goto L_0x0248
            long r11 = r7.v()     // Catch:{ all -> 0x04d9 }
            r13 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0203
            long r11 = r7.v()     // Catch:{ all -> 0x04d9 }
            r8 = r4
            long r3 = r2.j     // Catch:{ all -> 0x04d9 }
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0204
            r0 = 1
            goto L_0x0205
        L_0x0203:
            r8 = r4
        L_0x0204:
            r0 = 0
        L_0x0205:
            long r3 = r7.v()     // Catch:{ all -> 0x04d9 }
            int r11 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x0221
            java.lang.String r3 = r7.u()     // Catch:{ all -> 0x04d9 }
            if (r3 == 0) goto L_0x0221
            java.lang.String r3 = r7.u()     // Catch:{ all -> 0x04d9 }
            java.lang.String r4 = r2.f13824c     // Catch:{ all -> 0x04d9 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x04d9 }
            if (r3 != 0) goto L_0x0221
            r3 = 1
            goto L_0x0222
        L_0x0221:
            r3 = 0
        L_0x0222:
            r0 = r0 | r3
            if (r0 == 0) goto L_0x0249
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04d9 }
            r0.<init>()     // Catch:{ all -> 0x04d9 }
            java.lang.String r3 = "_pv"
            java.lang.String r4 = r7.u()     // Catch:{ all -> 0x04d9 }
            r0.putString(r3, r4)     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.o r3 = new com.google.android.gms.measurement.internal.o     // Catch:{ all -> 0x04d9 }
            java.lang.String r12 = "_au"
            com.google.android.gms.measurement.internal.n r13 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x04d9 }
            r13.<init>(r0)     // Catch:{ all -> 0x04d9 }
            java.lang.String r14 = "auto"
            r11 = r3
            r4 = 0
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04d9 }
            r1.a((com.google.android.gms.measurement.internal.C3192o) r3, (com.google.android.gms.measurement.internal.xe) r2)     // Catch:{ all -> 0x04d9 }
            goto L_0x024a
        L_0x0248:
            r8 = r4
        L_0x0249:
            r4 = 0
        L_0x024a:
            r21.c(r22)     // Catch:{ all -> 0x04d9 }
            if (r6 != 0) goto L_0x025c
            com.google.android.gms.measurement.internal.d r0 = r21.e()     // Catch:{ all -> 0x04d9 }
            java.lang.String r3 = r2.f13822a     // Catch:{ all -> 0x04d9 }
            java.lang.String r7 = "_f"
        L_0x0257:
            com.google.android.gms.measurement.internal.k r0 = r0.a((java.lang.String) r3, (java.lang.String) r7)     // Catch:{ all -> 0x04d9 }
            goto L_0x0269
        L_0x025c:
            r3 = 1
            if (r6 != r3) goto L_0x0268
            com.google.android.gms.measurement.internal.d r0 = r21.e()     // Catch:{ all -> 0x04d9 }
            java.lang.String r3 = r2.f13822a     // Catch:{ all -> 0x04d9 }
            java.lang.String r7 = "_v"
            goto L_0x0257
        L_0x0268:
            r0 = 0
        L_0x0269:
            if (r0 != 0) goto L_0x04b0
            r11 = 3600000(0x36ee80, double:1.7786363E-317)
            long r13 = r9 / r11
            r15 = 1
            long r13 = r13 + r15
            long r13 = r13 * r11
            java.lang.String r0 = "_dac"
            java.lang.String r3 = "_r"
            java.lang.String r7 = "_c"
            java.lang.String r15 = "_et"
            if (r6 != 0) goto L_0x0412
            com.google.android.gms.measurement.internal.re r6 = new com.google.android.gms.measurement.internal.re     // Catch:{ all -> 0x04d9 }
            java.lang.String r12 = "_fot"
            java.lang.Long r16 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x04d9 }
            java.lang.String r20 = "auto"
            r11 = r6
            r13 = r9
            r4 = r15
            r15 = r16
            r16 = r20
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04d9 }
            r1.a((com.google.android.gms.measurement.internal.re) r6, (com.google.android.gms.measurement.internal.xe) r2)     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.fc r6 = r1.j     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.Ie r6 = r6.o()     // Catch:{ all -> 0x04d9 }
            java.lang.String r11 = r2.f13823b     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C3202q.Q     // Catch:{ all -> 0x04d9 }
            boolean r6 = r6.e(r11, r12)     // Catch:{ all -> 0x04d9 }
            if (r6 == 0) goto L_0x02b4
            r21.z()     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.fc r6 = r1.j     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.Rb r6 = r6.s()     // Catch:{ all -> 0x04d9 }
            java.lang.String r11 = r2.f13822a     // Catch:{ all -> 0x04d9 }
            r6.a(r11)     // Catch:{ all -> 0x04d9 }
        L_0x02b4:
            r21.z()     // Catch:{ all -> 0x04d9 }
            r21.p()     // Catch:{ all -> 0x04d9 }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x04d9 }
            r6.<init>()     // Catch:{ all -> 0x04d9 }
            r11 = 1
            r6.putLong(r7, r11)     // Catch:{ all -> 0x04d9 }
            r6.putLong(r3, r11)     // Catch:{ all -> 0x04d9 }
            r11 = 0
            r6.putLong(r5, r11)     // Catch:{ all -> 0x04d9 }
            r6.putLong(r8, r11)     // Catch:{ all -> 0x04d9 }
            r3 = r19
            r6.putLong(r3, r11)     // Catch:{ all -> 0x04d9 }
            java.lang.String r7 = "_sysu"
            r6.putLong(r7, r11)     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.fc r7 = r1.j     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.Ie r7 = r7.o()     // Catch:{ all -> 0x04d9 }
            java.lang.String r11 = r2.f13822a     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C3202q.aa     // Catch:{ all -> 0x04d9 }
            boolean r7 = r7.e(r11, r12)     // Catch:{ all -> 0x04d9 }
            if (r7 == 0) goto L_0x02ef
            r11 = 1
            r6.putLong(r4, r11)     // Catch:{ all -> 0x04d9 }
            goto L_0x02f1
        L_0x02ef:
            r11 = 1
        L_0x02f1:
            boolean r7 = r2.q     // Catch:{ all -> 0x04d9 }
            if (r7 == 0) goto L_0x02f8
            r6.putLong(r0, r11)     // Catch:{ all -> 0x04d9 }
        L_0x02f8:
            com.google.android.gms.measurement.internal.d r0 = r21.e()     // Catch:{ all -> 0x04d9 }
            java.lang.String r7 = r2.f13822a     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r7)     // Catch:{ all -> 0x04d9 }
            r0.c()     // Catch:{ all -> 0x04d9 }
            r0.r()     // Catch:{ all -> 0x04d9 }
            java.lang.String r11 = "first_open_count"
            long r13 = r0.h(r7, r11)     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.fc r0 = r1.j     // Catch:{ all -> 0x04d9 }
            android.content.Context r0 = r0.f()     // Catch:{ all -> 0x04d9 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x04d9 }
            if (r0 != 0) goto L_0x0335
            com.google.android.gms.measurement.internal.fc r0 = r1.j     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.Bb r0 = r0.h()     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.Db r0 = r0.t()     // Catch:{ all -> 0x04d9 }
            java.lang.String r3 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.String r5 = r2.f13822a     // Catch:{ all -> 0x04d9 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r5)     // Catch:{ all -> 0x04d9 }
            r0.a(r3, r5)     // Catch:{ all -> 0x04d9 }
            r19 = r8
            r7 = r13
        L_0x0331:
            r11 = 0
            goto L_0x03f5
        L_0x0335:
            com.google.android.gms.measurement.internal.fc r0 = r1.j     // Catch:{ NameNotFoundException -> 0x0347 }
            android.content.Context r0 = r0.f()     // Catch:{ NameNotFoundException -> 0x0347 }
            c.b.b.b.b.c.b r0 = c.b.b.b.b.c.c.a(r0)     // Catch:{ NameNotFoundException -> 0x0347 }
            java.lang.String r7 = r2.f13822a     // Catch:{ NameNotFoundException -> 0x0347 }
            r11 = 0
            android.content.pm.PackageInfo r0 = r0.b(r7, r11)     // Catch:{ NameNotFoundException -> 0x0347 }
            goto L_0x035e
        L_0x0347:
            r0 = move-exception
            com.google.android.gms.measurement.internal.fc r7 = r1.j     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.Bb r7 = r7.h()     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.Db r7 = r7.t()     // Catch:{ all -> 0x04d9 }
            java.lang.String r11 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.String r12 = r2.f13822a     // Catch:{ all -> 0x04d9 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r12)     // Catch:{ all -> 0x04d9 }
            r7.a(r11, r12, r0)     // Catch:{ all -> 0x04d9 }
            r0 = 0
        L_0x035e:
            if (r0 == 0) goto L_0x03ad
            long r11 = r0.firstInstallTime     // Catch:{ all -> 0x04d9 }
            r15 = 0
            int r7 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r7 == 0) goto L_0x03ad
            long r11 = r0.firstInstallTime     // Catch:{ all -> 0x04d9 }
            r19 = r8
            long r7 = r0.lastUpdateTime     // Catch:{ all -> 0x04d9 }
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0391
            com.google.android.gms.measurement.internal.fc r0 = r1.j     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.Ie r0 = r0.o()     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C3202q.La     // Catch:{ all -> 0x04d9 }
            boolean r0 = r0.a((com.google.android.gms.measurement.internal.C3204qb<java.lang.Boolean>) r7)     // Catch:{ all -> 0x04d9 }
            if (r0 == 0) goto L_0x038c
            r7 = 0
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x038f
            r7 = 1
        L_0x0388:
            r6.putLong(r5, r7)     // Catch:{ all -> 0x04d9 }
            goto L_0x038f
        L_0x038c:
            r7 = 1
            goto L_0x0388
        L_0x038f:
            r0 = 0
            goto L_0x0392
        L_0x0391:
            r0 = 1
        L_0x0392:
            com.google.android.gms.measurement.internal.re r5 = new com.google.android.gms.measurement.internal.re     // Catch:{ all -> 0x04d9 }
            java.lang.String r12 = "_fi"
            if (r0 == 0) goto L_0x039b
            r7 = 1
            goto L_0x039d
        L_0x039b:
            r7 = 0
        L_0x039d:
            java.lang.Long r15 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x04d9 }
            java.lang.String r16 = "auto"
            r11 = r5
            r7 = r13
            r13 = r9
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04d9 }
            r1.a((com.google.android.gms.measurement.internal.re) r5, (com.google.android.gms.measurement.internal.xe) r2)     // Catch:{ all -> 0x04d9 }
            goto L_0x03b0
        L_0x03ad:
            r19 = r8
            r7 = r13
        L_0x03b0:
            com.google.android.gms.measurement.internal.fc r0 = r1.j     // Catch:{ NameNotFoundException -> 0x03c2 }
            android.content.Context r0 = r0.f()     // Catch:{ NameNotFoundException -> 0x03c2 }
            c.b.b.b.b.c.b r0 = c.b.b.b.b.c.c.a(r0)     // Catch:{ NameNotFoundException -> 0x03c2 }
            java.lang.String r5 = r2.f13822a     // Catch:{ NameNotFoundException -> 0x03c2 }
            r11 = 0
            android.content.pm.ApplicationInfo r0 = r0.a((java.lang.String) r5, (int) r11)     // Catch:{ NameNotFoundException -> 0x03c2 }
            goto L_0x03d9
        L_0x03c2:
            r0 = move-exception
            com.google.android.gms.measurement.internal.fc r5 = r1.j     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.Bb r5 = r5.h()     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.Db r5 = r5.t()     // Catch:{ all -> 0x04d9 }
            java.lang.String r11 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.String r12 = r2.f13822a     // Catch:{ all -> 0x04d9 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r12)     // Catch:{ all -> 0x04d9 }
            r5.a(r11, r12, r0)     // Catch:{ all -> 0x04d9 }
            r0 = 0
        L_0x03d9:
            if (r0 == 0) goto L_0x0331
            int r5 = r0.flags     // Catch:{ all -> 0x04d9 }
            r11 = 1
            r5 = r5 & r11
            if (r5 == 0) goto L_0x03e6
            r11 = 1
            r6.putLong(r3, r11)     // Catch:{ all -> 0x04d9 }
        L_0x03e6:
            int r0 = r0.flags     // Catch:{ all -> 0x04d9 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0331
            java.lang.String r0 = "_sysu"
            r11 = 1
            r6.putLong(r0, r11)     // Catch:{ all -> 0x04d9 }
            goto L_0x0331
        L_0x03f5:
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x03fe
            r3 = r19
            r6.putLong(r3, r7)     // Catch:{ all -> 0x04d9 }
        L_0x03fe:
            com.google.android.gms.measurement.internal.o r0 = new com.google.android.gms.measurement.internal.o     // Catch:{ all -> 0x04d9 }
            java.lang.String r12 = "_f"
            com.google.android.gms.measurement.internal.n r13 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x04d9 }
            r13.<init>(r6)     // Catch:{ all -> 0x04d9 }
            java.lang.String r14 = "auto"
            r11 = r0
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04d9 }
        L_0x040e:
            r1.a((com.google.android.gms.measurement.internal.C3192o) r0, (com.google.android.gms.measurement.internal.xe) r2)     // Catch:{ all -> 0x04d9 }
            goto L_0x046b
        L_0x0412:
            r4 = r15
            r5 = 1
            if (r6 != r5) goto L_0x046b
            com.google.android.gms.measurement.internal.re r5 = new com.google.android.gms.measurement.internal.re     // Catch:{ all -> 0x04d9 }
            java.lang.String r12 = "_fvt"
            java.lang.Long r15 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x04d9 }
            java.lang.String r16 = "auto"
            r11 = r5
            r13 = r9
            r11.<init>(r12, r13, r15, r16)     // Catch:{ all -> 0x04d9 }
            r1.a((com.google.android.gms.measurement.internal.re) r5, (com.google.android.gms.measurement.internal.xe) r2)     // Catch:{ all -> 0x04d9 }
            r21.z()     // Catch:{ all -> 0x04d9 }
            r21.p()     // Catch:{ all -> 0x04d9 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x04d9 }
            r5.<init>()     // Catch:{ all -> 0x04d9 }
            r11 = 1
            r5.putLong(r7, r11)     // Catch:{ all -> 0x04d9 }
            r5.putLong(r3, r11)     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.fc r3 = r1.j     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.Ie r3 = r3.o()     // Catch:{ all -> 0x04d9 }
            java.lang.String r6 = r2.f13822a     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C3202q.aa     // Catch:{ all -> 0x04d9 }
            boolean r3 = r3.e(r6, r7)     // Catch:{ all -> 0x04d9 }
            if (r3 == 0) goto L_0x0451
            r6 = 1
            r5.putLong(r4, r6)     // Catch:{ all -> 0x04d9 }
            goto L_0x0453
        L_0x0451:
            r6 = 1
        L_0x0453:
            boolean r3 = r2.q     // Catch:{ all -> 0x04d9 }
            if (r3 == 0) goto L_0x045a
            r5.putLong(r0, r6)     // Catch:{ all -> 0x04d9 }
        L_0x045a:
            com.google.android.gms.measurement.internal.o r0 = new com.google.android.gms.measurement.internal.o     // Catch:{ all -> 0x04d9 }
            java.lang.String r12 = "_v"
            com.google.android.gms.measurement.internal.n r13 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x04d9 }
            r13.<init>(r5)     // Catch:{ all -> 0x04d9 }
            java.lang.String r14 = "auto"
            r11 = r0
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04d9 }
            goto L_0x040e
        L_0x046b:
            com.google.android.gms.measurement.internal.fc r0 = r1.j     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.Ie r0 = r0.o()     // Catch:{ all -> 0x04d9 }
            java.lang.String r3 = r2.f13822a     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C3202q.ba     // Catch:{ all -> 0x04d9 }
            boolean r0 = r0.e(r3, r5)     // Catch:{ all -> 0x04d9 }
            if (r0 != 0) goto L_0x04ca
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04d9 }
            r0.<init>()     // Catch:{ all -> 0x04d9 }
            r5 = 1
            r0.putLong(r4, r5)     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.fc r3 = r1.j     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.Ie r3 = r3.o()     // Catch:{ all -> 0x04d9 }
            java.lang.String r4 = r2.f13822a     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C3202q.aa     // Catch:{ all -> 0x04d9 }
            boolean r3 = r3.e(r4, r5)     // Catch:{ all -> 0x04d9 }
            if (r3 == 0) goto L_0x049c
            java.lang.String r3 = "_fr"
            r4 = 1
            r0.putLong(r3, r4)     // Catch:{ all -> 0x04d9 }
        L_0x049c:
            com.google.android.gms.measurement.internal.o r3 = new com.google.android.gms.measurement.internal.o     // Catch:{ all -> 0x04d9 }
            java.lang.String r12 = "_e"
            com.google.android.gms.measurement.internal.n r13 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x04d9 }
            r13.<init>(r0)     // Catch:{ all -> 0x04d9 }
            java.lang.String r14 = "auto"
            r11 = r3
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04d9 }
        L_0x04ac:
            r1.a((com.google.android.gms.measurement.internal.C3192o) r3, (com.google.android.gms.measurement.internal.xe) r2)     // Catch:{ all -> 0x04d9 }
            goto L_0x04ca
        L_0x04b0:
            boolean r0 = r2.i     // Catch:{ all -> 0x04d9 }
            if (r0 == 0) goto L_0x04ca
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04d9 }
            r0.<init>()     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.o r3 = new com.google.android.gms.measurement.internal.o     // Catch:{ all -> 0x04d9 }
            java.lang.String r12 = "_cd"
            com.google.android.gms.measurement.internal.n r13 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x04d9 }
            r13.<init>(r0)     // Catch:{ all -> 0x04d9 }
            java.lang.String r14 = "auto"
            r11 = r3
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x04d9 }
            goto L_0x04ac
        L_0x04ca:
            com.google.android.gms.measurement.internal.d r0 = r21.e()     // Catch:{ all -> 0x04d9 }
            r0.u()     // Catch:{ all -> 0x04d9 }
            com.google.android.gms.measurement.internal.d r0 = r21.e()
            r0.H()
            return
        L_0x04d9:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r2 = r21.e()
            r2.H()
            goto L_0x04e3
        L_0x04e2:
            throw r0
        L_0x04e3:
            goto L_0x04e2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3176ke.b(com.google.android.gms.measurement.internal.xe):void");
    }

    public final _b c() {
        b((C3158he) this.f13642b);
        return this.f13642b;
    }

    /* access modifiers changed from: package-private */
    public final C3138ec c(xe xeVar) {
        z();
        p();
        C0563t.a(xeVar);
        C0563t.b(xeVar.f13822a);
        C3138ec b2 = e().b(xeVar.f13822a);
        String b3 = this.j.p().b(xeVar.f13822a);
        if (!C0426te.b() || !this.j.o().a(C3202q.Na)) {
            return a(xeVar, b2, b3);
        }
        if (b2 == null) {
            b2 = new C3138ec(this.j, xeVar.f13822a);
            b2.a(this.j.v().x());
            b2.e(b3);
        } else if (!b3.equals(b2.q())) {
            b2.e(b3);
            b2.a(this.j.v().x());
        }
        b2.b(xeVar.f13823b);
        b2.c(xeVar.r);
        if (Le.b() && this.j.o().e(b2.l(), C3202q.Fa)) {
            b2.d(xeVar.v);
        }
        if (!TextUtils.isEmpty(xeVar.k)) {
            b2.f(xeVar.k);
        }
        long j2 = xeVar.f13826e;
        if (j2 != 0) {
            b2.d(j2);
        }
        if (!TextUtils.isEmpty(xeVar.f13824c)) {
            b2.g(xeVar.f13824c);
        }
        b2.c(xeVar.j);
        String str = xeVar.f13825d;
        if (str != null) {
            b2.h(str);
        }
        b2.e(xeVar.f13827f);
        b2.a(xeVar.f13829h);
        if (!TextUtils.isEmpty(xeVar.f13828g)) {
            b2.i(xeVar.f13828g);
        }
        b2.p(xeVar.l);
        b2.b(xeVar.o);
        b2.c(xeVar.p);
        if (this.j.o().e(xeVar.f13822a, C3202q.ca)) {
            b2.a(xeVar.s);
        }
        b2.f(xeVar.t);
        if (b2.a()) {
            e().a(b2);
        }
        return b2;
    }

    public final Gb d() {
        b((C3158he) this.f13643c);
        return this.f13643c;
    }

    /* access modifiers changed from: package-private */
    public final String d(xe xeVar) {
        try {
            return (String) this.j.g().a(new ne(this, xeVar)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            this.j.h().t().a("Failed to get app instance id. appId", Bb.a(xeVar.f13822a), e2);
            return null;
        }
    }

    public final C3129d e() {
        b((C3158he) this.f13644d);
        return this.f13644d;
    }

    public final Context f() {
        return this.j.f();
    }

    public final Zb g() {
        return this.j.g();
    }

    public final Bb h() {
        return this.j.h();
    }

    public final He i() {
        return this.j.i();
    }

    public final e j() {
        return this.j.j();
    }

    public final ye k() {
        b((C3158he) this.f13647g);
        return this.f13647g;
    }

    public final C3163id l() {
        b((C3158he) this.i);
        return this.i;
    }

    public final oe m() {
        b((C3158he) this.f13648h);
        return this.f13648h;
    }

    public final C3248zb n() {
        return this.j.w();
    }

    public final se o() {
        return this.j.v();
    }

    /* access modifiers changed from: package-private */
    public final void p() {
        if (!this.k) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:84|85) */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r1.j.h().t().a("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.Bb.a(r5), r9);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x02ae */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q() {
        /*
            r17 = this;
            r1 = r17
            r17.z()
            r17.p()
            r0 = 1
            r1.t = r0
            r2 = 0
            com.google.android.gms.measurement.internal.fc r3 = r1.j     // Catch:{ all -> 0x02e7 }
            r3.i()     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.fc r3 = r1.j     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.od r3 = r3.E()     // Catch:{ all -> 0x02e7 }
            java.lang.Boolean r3 = r3.G()     // Catch:{ all -> 0x02e7 }
            if (r3 != 0) goto L_0x0032
            com.google.android.gms.measurement.internal.fc r0 = r1.j     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.Bb r0 = r0.h()     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.Db r0 = r0.w()     // Catch:{ all -> 0x02e7 }
            java.lang.String r3 = "Upload data called on the client side before use of service was decided"
        L_0x0029:
            r0.a(r3)     // Catch:{ all -> 0x02e7 }
        L_0x002c:
            r1.t = r2
            r17.u()
            return
        L_0x0032:
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x02e7 }
            if (r3 == 0) goto L_0x0045
            com.google.android.gms.measurement.internal.fc r0 = r1.j     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.Bb r0 = r0.h()     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.Db r0 = r0.t()     // Catch:{ all -> 0x02e7 }
            java.lang.String r3 = "Upload called in the client side when service should be used"
            goto L_0x0029
        L_0x0045:
            long r3 = r1.n     // Catch:{ all -> 0x02e7 }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0051
        L_0x004d:
            r17.C()     // Catch:{ all -> 0x02e7 }
            goto L_0x002c
        L_0x0051:
            r17.z()     // Catch:{ all -> 0x02e7 }
            java.util.List<java.lang.Long> r3 = r1.w     // Catch:{ all -> 0x02e7 }
            if (r3 == 0) goto L_0x005a
            r3 = 1
            goto L_0x005b
        L_0x005a:
            r3 = 0
        L_0x005b:
            if (r3 == 0) goto L_0x006a
            com.google.android.gms.measurement.internal.fc r0 = r1.j     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.Bb r0 = r0.h()     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.Db r0 = r0.B()     // Catch:{ all -> 0x02e7 }
            java.lang.String r3 = "Uploading requested multiple times"
            goto L_0x0029
        L_0x006a:
            com.google.android.gms.measurement.internal.Gb r3 = r17.d()     // Catch:{ all -> 0x02e7 }
            boolean r3 = r3.u()     // Catch:{ all -> 0x02e7 }
            if (r3 != 0) goto L_0x0084
            com.google.android.gms.measurement.internal.fc r0 = r1.j     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.Bb r0 = r0.h()     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.Db r0 = r0.B()     // Catch:{ all -> 0x02e7 }
            java.lang.String r3 = "Network not connected, ignoring upload request"
            r0.a(r3)     // Catch:{ all -> 0x02e7 }
            goto L_0x004d
        L_0x0084:
            com.google.android.gms.measurement.internal.fc r3 = r1.j     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.common.util.e r3 = r3.j()     // Catch:{ all -> 0x02e7 }
            long r3 = r3.a()     // Catch:{ all -> 0x02e7 }
            long r7 = com.google.android.gms.measurement.internal.Ie.t()     // Catch:{ all -> 0x02e7 }
            long r7 = r3 - r7
            r9 = 0
            r1.a((java.lang.String) r9, (long) r7)     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.fc r7 = r1.j     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.Lb r7 = r7.p()     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.Qb r7 = r7.f13337f     // Catch:{ all -> 0x02e7 }
            long r7 = r7.a()     // Catch:{ all -> 0x02e7 }
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x00c1
            com.google.android.gms.measurement.internal.fc r5 = r1.j     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.Bb r5 = r5.h()     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.Db r5 = r5.A()     // Catch:{ all -> 0x02e7 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r3 - r7
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x02e7 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x02e7 }
            r5.a(r6, r7)     // Catch:{ all -> 0x02e7 }
        L_0x00c1:
            com.google.android.gms.measurement.internal.d r5 = r17.e()     // Catch:{ all -> 0x02e7 }
            java.lang.String r5 = r5.w()     // Catch:{ all -> 0x02e7 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x02e7 }
            r7 = -1
            if (r6 != 0) goto L_0x02c3
            long r10 = r1.y     // Catch:{ all -> 0x02e7 }
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00e1
            com.google.android.gms.measurement.internal.d r6 = r17.e()     // Catch:{ all -> 0x02e7 }
            long r6 = r6.x()     // Catch:{ all -> 0x02e7 }
            r1.y = r6     // Catch:{ all -> 0x02e7 }
        L_0x00e1:
            com.google.android.gms.measurement.internal.fc r6 = r1.j     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.Ie r6 = r6.o()     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.qb<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C3202q.i     // Catch:{ all -> 0x02e7 }
            int r6 = r6.b(r5, r7)     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.fc r7 = r1.j     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.Ie r7 = r7.o()     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.qb<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C3202q.j     // Catch:{ all -> 0x02e7 }
            int r7 = r7.b(r5, r8)     // Catch:{ all -> 0x02e7 }
            int r7 = java.lang.Math.max(r2, r7)     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.d r8 = r17.e()     // Catch:{ all -> 0x02e7 }
            java.util.List r6 = r8.a((java.lang.String) r5, (int) r6, (int) r7)     // Catch:{ all -> 0x02e7 }
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x02e7 }
            if (r7 != 0) goto L_0x002c
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x02e7 }
        L_0x010f:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x02e7 }
            if (r8 == 0) goto L_0x012e
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x02e7 }
            android.util.Pair r8 = (android.util.Pair) r8     // Catch:{ all -> 0x02e7 }
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x02e7 }
            c.b.b.b.d.f.X r8 = (c.b.b.b.d.f.X) r8     // Catch:{ all -> 0x02e7 }
            java.lang.String r10 = r8.s()     // Catch:{ all -> 0x02e7 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x02e7 }
            if (r10 != 0) goto L_0x010f
            java.lang.String r7 = r8.s()     // Catch:{ all -> 0x02e7 }
            goto L_0x012f
        L_0x012e:
            r7 = r9
        L_0x012f:
            if (r7 == 0) goto L_0x015e
            r8 = 0
        L_0x0132:
            int r10 = r6.size()     // Catch:{ all -> 0x02e7 }
            if (r8 >= r10) goto L_0x015e
            java.lang.Object r10 = r6.get(r8)     // Catch:{ all -> 0x02e7 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x02e7 }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x02e7 }
            c.b.b.b.d.f.X r10 = (c.b.b.b.d.f.X) r10     // Catch:{ all -> 0x02e7 }
            java.lang.String r11 = r10.s()     // Catch:{ all -> 0x02e7 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x02e7 }
            if (r11 != 0) goto L_0x015b
            java.lang.String r10 = r10.s()     // Catch:{ all -> 0x02e7 }
            boolean r10 = r10.equals(r7)     // Catch:{ all -> 0x02e7 }
            if (r10 != 0) goto L_0x015b
            java.util.List r6 = r6.subList(r2, r8)     // Catch:{ all -> 0x02e7 }
            goto L_0x015e
        L_0x015b:
            int r8 = r8 + 1
            goto L_0x0132
        L_0x015e:
            c.b.b.b.d.f.W$a r7 = c.b.b.b.d.f.W.p()     // Catch:{ all -> 0x02e7 }
            int r8 = r6.size()     // Catch:{ all -> 0x02e7 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x02e7 }
            int r11 = r6.size()     // Catch:{ all -> 0x02e7 }
            r10.<init>(r11)     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.fc r11 = r1.j     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.Ie r11 = r11.o()     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C3202q.f13718c     // Catch:{ all -> 0x02e7 }
            boolean r11 = r11.a((com.google.android.gms.measurement.internal.C3204qb<java.lang.Boolean>) r12)     // Catch:{ all -> 0x02e7 }
            if (r11 == 0) goto L_0x018b
            com.google.android.gms.measurement.internal.fc r11 = r1.j     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.Ie r11 = r11.o()     // Catch:{ all -> 0x02e7 }
            boolean r11 = r11.d(r5)     // Catch:{ all -> 0x02e7 }
            if (r11 == 0) goto L_0x018b
            r11 = 1
            goto L_0x018c
        L_0x018b:
            r11 = 0
        L_0x018c:
            r12 = 0
        L_0x018d:
            if (r12 >= r8) goto L_0x01f4
            java.lang.Object r13 = r6.get(r12)     // Catch:{ all -> 0x02e7 }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x02e7 }
            java.lang.Object r13 = r13.first     // Catch:{ all -> 0x02e7 }
            c.b.b.b.d.f.X r13 = (c.b.b.b.d.f.X) r13     // Catch:{ all -> 0x02e7 }
            c.b.b.b.d.f.Lb$b r13 = r13.k()     // Catch:{ all -> 0x02e7 }
            c.b.b.b.d.f.X$a r13 = (c.b.b.b.d.f.X.a) r13     // Catch:{ all -> 0x02e7 }
            java.lang.Object r14 = r6.get(r12)     // Catch:{ all -> 0x02e7 }
            android.util.Pair r14 = (android.util.Pair) r14     // Catch:{ all -> 0x02e7 }
            java.lang.Object r14 = r14.second     // Catch:{ all -> 0x02e7 }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ all -> 0x02e7 }
            r10.add(r14)     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.fc r14 = r1.j     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.Ie r14 = r14.o()     // Catch:{ all -> 0x02e7 }
            long r14 = r14.n()     // Catch:{ all -> 0x02e7 }
            r13.g((long) r14)     // Catch:{ all -> 0x02e7 }
            r13.a((long) r3)     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.fc r14 = r1.j     // Catch:{ all -> 0x02e7 }
            r14.i()     // Catch:{ all -> 0x02e7 }
            r13.b((boolean) r2)     // Catch:{ all -> 0x02e7 }
            if (r11 != 0) goto L_0x01c9
            r13.x()     // Catch:{ all -> 0x02e7 }
        L_0x01c9:
            com.google.android.gms.measurement.internal.fc r14 = r1.j     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.Ie r14 = r14.o()     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.C3202q.ha     // Catch:{ all -> 0x02e7 }
            boolean r14 = r14.e(r5, r15)     // Catch:{ all -> 0x02e7 }
            if (r14 == 0) goto L_0x01ee
            c.b.b.b.d.f.wc r14 = r13.j()     // Catch:{ all -> 0x02e7 }
            c.b.b.b.d.f.Lb r14 = (c.b.b.b.d.f.Lb) r14     // Catch:{ all -> 0x02e7 }
            c.b.b.b.d.f.X r14 = (c.b.b.b.d.f.X) r14     // Catch:{ all -> 0x02e7 }
            byte[] r14 = r14.g()     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.oe r15 = r17.m()     // Catch:{ all -> 0x02e7 }
            long r14 = r15.a((byte[]) r14)     // Catch:{ all -> 0x02e7 }
            r13.l((long) r14)     // Catch:{ all -> 0x02e7 }
        L_0x01ee:
            r7.a((c.b.b.b.d.f.X.a) r13)     // Catch:{ all -> 0x02e7 }
            int r12 = r12 + 1
            goto L_0x018d
        L_0x01f4:
            com.google.android.gms.measurement.internal.fc r6 = r1.j     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.Bb r6 = r6.h()     // Catch:{ all -> 0x02e7 }
            r11 = 2
            boolean r6 = r6.a((int) r11)     // Catch:{ all -> 0x02e7 }
            if (r6 == 0) goto L_0x0212
            com.google.android.gms.measurement.internal.oe r6 = r17.m()     // Catch:{ all -> 0x02e7 }
            c.b.b.b.d.f.wc r11 = r7.j()     // Catch:{ all -> 0x02e7 }
            c.b.b.b.d.f.Lb r11 = (c.b.b.b.d.f.Lb) r11     // Catch:{ all -> 0x02e7 }
            c.b.b.b.d.f.W r11 = (c.b.b.b.d.f.W) r11     // Catch:{ all -> 0x02e7 }
            java.lang.String r6 = r6.a((c.b.b.b.d.f.W) r11)     // Catch:{ all -> 0x02e7 }
            goto L_0x0213
        L_0x0212:
            r6 = r9
        L_0x0213:
            r17.m()     // Catch:{ all -> 0x02e7 }
            c.b.b.b.d.f.wc r11 = r7.j()     // Catch:{ all -> 0x02e7 }
            c.b.b.b.d.f.Lb r11 = (c.b.b.b.d.f.Lb) r11     // Catch:{ all -> 0x02e7 }
            c.b.b.b.d.f.W r11 = (c.b.b.b.d.f.W) r11     // Catch:{ all -> 0x02e7 }
            byte[] r14 = r11.g()     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.qb<java.lang.String> r11 = com.google.android.gms.measurement.internal.C3202q.s     // Catch:{ all -> 0x02e7 }
            java.lang.Object r9 = r11.a(r9)     // Catch:{ all -> 0x02e7 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x02e7 }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x02ae }
            r13.<init>(r9)     // Catch:{ MalformedURLException -> 0x02ae }
            boolean r11 = r10.isEmpty()     // Catch:{ MalformedURLException -> 0x02ae }
            if (r11 != 0) goto L_0x0237
            r11 = 1
            goto L_0x0238
        L_0x0237:
            r11 = 0
        L_0x0238:
            com.google.android.gms.common.internal.C0563t.a((boolean) r11)     // Catch:{ MalformedURLException -> 0x02ae }
            java.util.List<java.lang.Long> r11 = r1.w     // Catch:{ MalformedURLException -> 0x02ae }
            if (r11 == 0) goto L_0x024f
            com.google.android.gms.measurement.internal.fc r10 = r1.j     // Catch:{ MalformedURLException -> 0x02ae }
            com.google.android.gms.measurement.internal.Bb r10 = r10.h()     // Catch:{ MalformedURLException -> 0x02ae }
            com.google.android.gms.measurement.internal.Db r10 = r10.t()     // Catch:{ MalformedURLException -> 0x02ae }
            java.lang.String r11 = "Set uploading progress before finishing the previous upload"
            r10.a(r11)     // Catch:{ MalformedURLException -> 0x02ae }
            goto L_0x0256
        L_0x024f:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x02ae }
            r11.<init>(r10)     // Catch:{ MalformedURLException -> 0x02ae }
            r1.w = r11     // Catch:{ MalformedURLException -> 0x02ae }
        L_0x0256:
            com.google.android.gms.measurement.internal.fc r10 = r1.j     // Catch:{ MalformedURLException -> 0x02ae }
            com.google.android.gms.measurement.internal.Lb r10 = r10.p()     // Catch:{ MalformedURLException -> 0x02ae }
            com.google.android.gms.measurement.internal.Qb r10 = r10.f13338g     // Catch:{ MalformedURLException -> 0x02ae }
            r10.a(r3)     // Catch:{ MalformedURLException -> 0x02ae }
            java.lang.String r3 = "?"
            if (r8 <= 0) goto L_0x026d
            c.b.b.b.d.f.X r3 = r7.a((int) r2)     // Catch:{ MalformedURLException -> 0x02ae }
            java.lang.String r3 = r3.ra()     // Catch:{ MalformedURLException -> 0x02ae }
        L_0x026d:
            com.google.android.gms.measurement.internal.fc r4 = r1.j     // Catch:{ MalformedURLException -> 0x02ae }
            com.google.android.gms.measurement.internal.Bb r4 = r4.h()     // Catch:{ MalformedURLException -> 0x02ae }
            com.google.android.gms.measurement.internal.Db r4 = r4.B()     // Catch:{ MalformedURLException -> 0x02ae }
            java.lang.String r7 = "Uploading data. app, uncompressed size, data"
            int r8 = r14.length     // Catch:{ MalformedURLException -> 0x02ae }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ MalformedURLException -> 0x02ae }
            r4.a(r7, r3, r8, r6)     // Catch:{ MalformedURLException -> 0x02ae }
            r1.s = r0     // Catch:{ MalformedURLException -> 0x02ae }
            com.google.android.gms.measurement.internal.Gb r11 = r17.d()     // Catch:{ MalformedURLException -> 0x02ae }
            com.google.android.gms.measurement.internal.me r0 = new com.google.android.gms.measurement.internal.me     // Catch:{ MalformedURLException -> 0x02ae }
            r0.<init>(r1, r5)     // Catch:{ MalformedURLException -> 0x02ae }
            r11.c()     // Catch:{ MalformedURLException -> 0x02ae }
            r11.r()     // Catch:{ MalformedURLException -> 0x02ae }
            com.google.android.gms.common.internal.C0563t.a(r13)     // Catch:{ MalformedURLException -> 0x02ae }
            com.google.android.gms.common.internal.C0563t.a(r14)     // Catch:{ MalformedURLException -> 0x02ae }
            com.google.android.gms.common.internal.C0563t.a(r0)     // Catch:{ MalformedURLException -> 0x02ae }
            com.google.android.gms.measurement.internal.Zb r3 = r11.g()     // Catch:{ MalformedURLException -> 0x02ae }
            com.google.android.gms.measurement.internal.Kb r4 = new com.google.android.gms.measurement.internal.Kb     // Catch:{ MalformedURLException -> 0x02ae }
            r15 = 0
            r10 = r4
            r12 = r5
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x02ae }
            r3.b((java.lang.Runnable) r4)     // Catch:{ MalformedURLException -> 0x02ae }
            goto L_0x002c
        L_0x02ae:
            com.google.android.gms.measurement.internal.fc r0 = r1.j     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.Bb r0 = r0.h()     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.Db r0 = r0.t()     // Catch:{ all -> 0x02e7 }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r5)     // Catch:{ all -> 0x02e7 }
            r0.a(r3, r4, r9)     // Catch:{ all -> 0x02e7 }
            goto L_0x002c
        L_0x02c3:
            r1.y = r7     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.d r0 = r17.e()     // Catch:{ all -> 0x02e7 }
            long r5 = com.google.android.gms.measurement.internal.Ie.t()     // Catch:{ all -> 0x02e7 }
            long r3 = r3 - r5
            java.lang.String r0 = r0.a((long) r3)     // Catch:{ all -> 0x02e7 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02e7 }
            if (r3 != 0) goto L_0x002c
            com.google.android.gms.measurement.internal.d r3 = r17.e()     // Catch:{ all -> 0x02e7 }
            com.google.android.gms.measurement.internal.ec r0 = r3.b(r0)     // Catch:{ all -> 0x02e7 }
            if (r0 == 0) goto L_0x002c
            r1.a((com.google.android.gms.measurement.internal.C3138ec) r0)     // Catch:{ all -> 0x02e7 }
            goto L_0x002c
        L_0x02e7:
            r0 = move-exception
            r1.t = r2
            r17.u()
            goto L_0x02ef
        L_0x02ee:
            throw r0
        L_0x02ef:
            goto L_0x02ee
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3176ke.q():void");
    }

    /* access modifiers changed from: package-private */
    public final void r() {
        String str;
        Db db;
        Integer num;
        Integer num2;
        z();
        p();
        if (!this.m) {
            this.m = true;
            z();
            p();
            if ((this.j.o().a(C3202q.ea) || w()) && v()) {
                int a2 = a(this.v);
                int F = this.j.G().F();
                z();
                if (a2 > F) {
                    db = this.j.h().t();
                    num2 = Integer.valueOf(a2);
                    num = Integer.valueOf(F);
                    str = "Panic: can't downgrade version. Previous, current version";
                } else if (a2 < F) {
                    if (a(F, this.v)) {
                        db = this.j.h().B();
                        num2 = Integer.valueOf(a2);
                        num = Integer.valueOf(F);
                        str = "Storage version upgraded. Previous, current version";
                    } else {
                        db = this.j.h().t();
                        num2 = Integer.valueOf(a2);
                        num = Integer.valueOf(F);
                        str = "Storage version upgrade failed. Previous, current version";
                    }
                }
                db.a(str, num2, num);
            }
        }
        if (!this.l && !this.j.o().a(C3202q.ea)) {
            this.j.h().z().a("This instance being marked as an uploader");
            this.l = true;
            C();
        }
    }

    /* access modifiers changed from: package-private */
    public final void s() {
        this.q++;
    }

    /* access modifiers changed from: package-private */
    public final C3144fc t() {
        return this.j;
    }
}
