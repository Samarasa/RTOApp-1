package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import com.google.android.gms.internal.ads.C0588Aw;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class HV {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final ConditionVariable f7148a = new ConditionVariable();

    /* renamed from: b  reason: collision with root package name */
    protected static volatile Woa f7149b = null;

    /* renamed from: c  reason: collision with root package name */
    private static volatile Random f7150c = null;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public C2869wha f7151d;

    /* renamed from: e  reason: collision with root package name */
    protected volatile Boolean f7152e;

    public HV(C2869wha wha) {
        this.f7151d = wha;
        wha.e().execute(new C1788hX(this));
    }

    public static int a() {
        try {
            return Build.VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : c().nextInt();
        } catch (RuntimeException unused) {
            return c().nextInt();
        }
    }

    private static Random c() {
        if (f7150c == null) {
            synchronized (HV.class) {
                if (f7150c == null) {
                    f7150c = new Random();
                }
            }
        }
        return f7150c;
    }

    public final void a(int i, int i2, long j) {
        a(i, i2, j, (String) null, (Exception) null);
    }

    public final void a(int i, int i2, long j, String str) {
        a(i, -1, j, str, (Exception) null);
    }

    public final void a(int i, int i2, long j, String str, Exception exc) {
        try {
            f7148a.block();
            if (this.f7152e.booleanValue() && f7149b != null) {
                C0588Aw.a o = C0588Aw.o();
                o.a(this.f7151d.f12651b.getPackageName());
                o.a(j);
                if (str != null) {
                    o.d(str);
                }
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    C2790vda.a((Throwable) exc, new PrintWriter(stringWriter));
                    o.b(stringWriter.toString());
                    o.c(exc.getClass().getName());
                }
                C1326apa a2 = f7149b.a(((C0588Aw) ((C2934xea) o.k())).f());
                a2.b(i);
                if (i2 != -1) {
                    a2.a(i2);
                }
                a2.a();
            }
        } catch (Exception unused) {
        }
    }
}
