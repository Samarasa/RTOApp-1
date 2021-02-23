package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.e;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

public final class Bb extends C3249zc {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public char f13189c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public long f13190d = -1;

    /* renamed from: e  reason: collision with root package name */
    private String f13191e;

    /* renamed from: f  reason: collision with root package name */
    private final Db f13192f = new Db(this, 6, false, false);

    /* renamed from: g  reason: collision with root package name */
    private final Db f13193g = new Db(this, 6, true, false);

    /* renamed from: h  reason: collision with root package name */
    private final Db f13194h = new Db(this, 6, false, true);
    private final Db i = new Db(this, 5, false, false);
    private final Db j = new Db(this, 5, true, false);
    private final Db k = new Db(this, 5, false, true);
    private final Db l = new Db(this, 4, false, false);
    private final Db m = new Db(this, 3, false, false);
    private final Db n = new Db(this, 2, false, false);

    Bb(C3144fc fcVar) {
        super(fcVar);
    }

    private final String D() {
        String str;
        String str2;
        synchronized (this) {
            if (this.f13191e == null) {
                if (this.f13807a.B() != null) {
                    str2 = this.f13807a.B();
                } else {
                    m().i();
                    str2 = "FA";
                }
                this.f13191e = str2;
            }
            str = this.f13191e;
        }
        return str;
    }

    protected static Object a(String str) {
        if (str == null) {
            return null;
        }
        return new Cb(str);
    }

    private static String a(boolean z, Object obj) {
        String className;
        String str = BuildConfig.FLAVOR;
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i2 = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l2 = (Long) obj;
            if (Math.abs(l2.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l2.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (!(obj instanceof Throwable)) {
                return obj instanceof Cb ? ((Cb) obj).f13201a : z ? "-" : String.valueOf(obj);
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String b2 = b(C3144fc.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && b(className).equals(b2)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
                i2++;
            }
            return sb2.toString();
        }
    }

    static String a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str = str2;
        }
        String a2 = a(z, obj);
        String a3 = a(z, obj2);
        String a4 = a(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str2);
            sb.append(a3);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a4)) {
            sb.append(str2);
            sb.append(a4);
        }
        return sb.toString();
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.FLAVOR;
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    public final Db A() {
        return this.m;
    }

    public final Db B() {
        return this.n;
    }

    public final String C() {
        Pair<String, Long> a2 = l().f13336e.a();
        if (a2 == null || a2 == Lb.f13334c) {
            return null;
        }
        String valueOf = String.valueOf(a2.second);
        String str = (String) a2.first;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, String str) {
        Log.println(i2, D(), str);
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        String str2;
        if (!z && a(i2)) {
            a(i2, a(false, str, obj, obj2, obj3));
        }
        if (!z2 && i2 >= 5) {
            C0563t.a(str);
            Zb t = this.f13807a.t();
            if (t == null) {
                str2 = "Scheduler not set. Not logging error/warn";
            } else if (!t.s()) {
                str2 = "Scheduler not initialized. Not logging error/warn";
            } else {
                if (i2 < 0) {
                    i2 = 0;
                }
                t.a((Runnable) new Ab(this, i2 >= 9 ? 8 : i2, str, obj, obj2, obj3));
                return;
            }
            a(6, str2);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i2) {
        return Log.isLoggable(D(), i2);
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ C3159i d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C3248zb e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ Context f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ Zb g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ Bb h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ He i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ e j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ se k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Lb l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Ie m() {
        return super.m();
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return false;
    }

    public final Db t() {
        return this.f13192f;
    }

    public final Db u() {
        return this.f13193g;
    }

    public final Db v() {
        return this.f13194h;
    }

    public final Db w() {
        return this.i;
    }

    public final Db x() {
        return this.j;
    }

    public final Db y() {
        return this.k;
    }

    public final Db z() {
        return this.l;
    }
}
