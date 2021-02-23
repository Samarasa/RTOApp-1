package g.a;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.CharEncoding;
import g.A;
import g.C;
import g.J;
import g.M;
import h.g;
import h.h;
import h.w;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f15033a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f15034b = new String[0];

    /* renamed from: c  reason: collision with root package name */
    public static final M f15035c = M.a((C) null, f15033a);

    /* renamed from: d  reason: collision with root package name */
    public static final J f15036d = J.a((C) null, f15033a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f15037e = h.a("efbbbf");

    /* renamed from: f  reason: collision with root package name */
    private static final h f15038f = h.a("feff");

    /* renamed from: g  reason: collision with root package name */
    private static final h f15039g = h.a("fffe");

    /* renamed from: h  reason: collision with root package name */
    private static final h f15040h = h.a("0000ffff");
    private static final h i = h.a("ffff0000");
    public static final Charset j = Charset.forName("UTF-8");
    private static final Charset k = Charset.forName(CharEncoding.UTF_16BE);
    private static final Charset l = Charset.forName(CharEncoding.UTF_16LE);
    private static final Charset m = Charset.forName("UTF-32BE");
    private static final Charset n = Charset.forName("UTF-32LE");
    public static final TimeZone o = TimeZone.getTimeZone("GMT");
    public static final Comparator<String> p = new c();
    private static final Pattern q = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static int a(String str, int i2, int i3) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int a(String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int a(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int a(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], str) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static String a(A a2, boolean z) {
        String str;
        if (a2.g().contains(":")) {
            str = "[" + a2.g() + "]";
        } else {
            str = a2.g();
        }
        if (!z && a2.j() == A.a(a2.m())) {
            return str;
        }
        return str + ":" + a2.j();
    }

    public static String a(String str) {
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty() && !d(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static Charset a(g gVar, Charset charset) {
        if (gVar.a(0, f15037e)) {
            gVar.skip((long) f15037e.n());
            return j;
        } else if (gVar.a(0, f15038f)) {
            gVar.skip((long) f15038f.n());
            return k;
        } else if (gVar.a(0, f15039g)) {
            gVar.skip((long) f15039g.n());
            return l;
        } else if (gVar.a(0, f15040h)) {
            gVar.skip((long) f15040h.n());
            return m;
        } else if (!gVar.a(0, i)) {
            return charset;
        } else {
            gVar.skip((long) i.n());
            return n;
        }
    }

    public static <T> List<T> a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static ThreadFactory a(String str, boolean z) {
        return new d(str, z);
    }

    public static void a(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!a(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(w wVar, int i2, TimeUnit timeUnit) {
        try {
            return b(wVar, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String[] a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i2++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] a(String[] strArr, String str) {
        String[] strArr2 = new String[(strArr.length + 1)];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    public static int b(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                return i2;
            }
        }
        return -1;
    }

    public static int b(String str, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            char charAt = str.charAt(i4);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i4 + 1;
            }
        }
        return i2;
    }

    public static boolean b(w wVar, int i2, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c2 = wVar.timeout().d() ? wVar.timeout().c() - nanoTime : Long.MAX_VALUE;
        wVar.timeout().a(Math.min(c2, timeUnit.toNanos((long) i2)) + nanoTime);
        try {
            h.e eVar = new h.e();
            while (wVar.a(eVar, 8192) != -1) {
                eVar.a();
            }
            if (c2 == Long.MAX_VALUE) {
                wVar.timeout().a();
            } else {
                wVar.timeout().a(nanoTime + c2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                wVar.timeout().a();
            } else {
                wVar.timeout().a(nanoTime + c2);
            }
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                wVar.timeout().a();
            } else {
                wVar.timeout().a(nanoTime + c2);
            }
            throw th;
        }
    }

    public static boolean b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String c(String str, int i2, int i3) {
        int a2 = a(str, i2, i3);
        return str.substring(a2, b(str, a2, i3));
    }

    public static boolean c(String str) {
        return q.matcher(str).matches();
    }

    private static boolean d(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }
}
