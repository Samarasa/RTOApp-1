package androidx.work;

import android.util.Log;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private static h f1736a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final int f1737b = 20;

    public static class a extends h {

        /* renamed from: c  reason: collision with root package name */
        private int f1738c;

        public a(int i) {
            super(i);
            this.f1738c = i;
        }

        public void a(String str, String str2, Throwable... thArr) {
            if (this.f1738c > 3) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.d(str, str2);
            } else {
                Log.d(str, str2, thArr[0]);
            }
        }

        public void b(String str, String str2, Throwable... thArr) {
            if (this.f1738c > 6) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, thArr[0]);
            }
        }

        public void c(String str, String str2, Throwable... thArr) {
            if (this.f1738c > 4) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.i(str, str2);
            } else {
                Log.i(str, str2, thArr[0]);
            }
        }

        public void d(String str, String str2, Throwable... thArr) {
            if (this.f1738c > 2) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.v(str, str2);
            } else {
                Log.v(str, str2, thArr[0]);
            }
        }

        public void e(String str, String str2, Throwable... thArr) {
            if (this.f1738c > 5) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.w(str, str2);
            } else {
                Log.w(str, str2, thArr[0]);
            }
        }
    }

    public h(int i) {
    }

    public static synchronized h a() {
        h hVar;
        synchronized (h.class) {
            if (f1736a == null) {
                f1736a = new a(3);
            }
            hVar = f1736a;
        }
        return hVar;
    }

    public static String a(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = f1737b;
        if (length >= i) {
            str = str.substring(0, i);
        }
        sb.append(str);
        return sb.toString();
    }

    public static synchronized void a(h hVar) {
        synchronized (h.class) {
            f1736a = hVar;
        }
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void c(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void e(String str, String str2, Throwable... thArr);
}
