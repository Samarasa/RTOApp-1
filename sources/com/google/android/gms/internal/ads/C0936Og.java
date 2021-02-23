package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.Og  reason: case insensitive filesystem */
public class C0936Og {

    /* renamed from: a  reason: collision with root package name */
    private static String f8123a = "Volley";

    /* renamed from: b  reason: collision with root package name */
    public static boolean f8124b = Log.isLoggable("Volley", 2);

    /* renamed from: c  reason: collision with root package name */
    private static final String f8125c = C0936Og.class.getName();

    /* renamed from: com.google.android.gms.internal.ads.Og$a */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final boolean f8126a = C0936Og.f8124b;

        /* renamed from: b  reason: collision with root package name */
        private final List<C0859Lh> f8127b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private boolean f8128c = false;

        a() {
        }

        public final synchronized void a(String str) {
            long j;
            this.f8128c = true;
            if (this.f8127b.size() == 0) {
                j = 0;
            } else {
                j = this.f8127b.get(this.f8127b.size() - 1).f7706c - this.f8127b.get(0).f7706c;
            }
            if (j > 0) {
                long j2 = this.f8127b.get(0).f7706c;
                C0936Og.a("(%-4d ms) %s", Long.valueOf(j), str);
                for (C0859Lh next : this.f8127b) {
                    long j3 = next.f7706c;
                    C0936Og.a("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(next.f7705b), next.f7704a);
                    j2 = j3;
                }
            }
        }

        public final synchronized void a(String str, long j) {
            if (!this.f8128c) {
                this.f8127b.add(new C0859Lh(str, j, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            if (!this.f8128c) {
                a("Request on the loose");
                C0936Og.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    public static void a(String str, Object... objArr) {
        Log.d(f8123a, d(str, objArr));
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Log.e(f8123a, d(str, objArr), th);
    }

    public static void b(String str, Object... objArr) {
        Log.e(f8123a, d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        if (f8124b) {
            Log.v(f8123a, d(str, objArr));
        }
    }

    private static String d(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClassName().equals(f8125c)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i].getMethodName();
                StringBuilder sb = new StringBuilder(String.valueOf(substring2).length() + 1 + String.valueOf(methodName).length());
                sb.append(substring2);
                sb.append(".");
                sb.append(methodName);
                str2 = sb.toString();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }
}
