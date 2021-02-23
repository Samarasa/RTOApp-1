package g;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import g.a.e;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class A {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f14825a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b  reason: collision with root package name */
    final String f14826b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14827c;

    /* renamed from: d  reason: collision with root package name */
    private final String f14828d;

    /* renamed from: e  reason: collision with root package name */
    final String f14829e;

    /* renamed from: f  reason: collision with root package name */
    final int f14830f;

    /* renamed from: g  reason: collision with root package name */
    private final List<String> f14831g;

    /* renamed from: h  reason: collision with root package name */
    private final List<String> f14832h;
    private final String i;
    private final String j;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        String f14833a;

        /* renamed from: b  reason: collision with root package name */
        String f14834b = BuildConfig.FLAVOR;

        /* renamed from: c  reason: collision with root package name */
        String f14835c = BuildConfig.FLAVOR;

        /* renamed from: d  reason: collision with root package name */
        String f14836d;

        /* renamed from: e  reason: collision with root package name */
        int f14837e = -1;

        /* renamed from: f  reason: collision with root package name */
        final List<String> f14838f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        List<String> f14839g;

        /* renamed from: h  reason: collision with root package name */
        String f14840h;

        /* renamed from: g.A$a$a  reason: collision with other inner class name */
        enum C0088a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public a() {
            this.f14838f.add(BuildConfig.FLAVOR);
        }

        private static String a(String str, int i, int i2) {
            String a2 = A.a(str, i, i2, false);
            if (!a2.contains(":")) {
                return e.a(a2);
            }
            InetAddress b2 = (!a2.startsWith("[") || !a2.endsWith("]")) ? b(a2, 0, a2.length()) : b(a2, 1, a2.length() - 1);
            if (b2 == null) {
                return null;
            }
            byte[] address = b2.getAddress();
            if (address.length == 16) {
                return a(address);
            }
            throw new AssertionError();
        }

        private static String a(byte[] bArr) {
            int i = 0;
            int i2 = 0;
            int i3 = -1;
            int i4 = 0;
            while (i2 < bArr.length) {
                int i5 = i2;
                while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                    i5 += 2;
                }
                int i6 = i5 - i2;
                if (i6 > i4 && i6 >= 4) {
                    i3 = i2;
                    i4 = i6;
                }
                i2 = i5 + 2;
            }
            h.e eVar = new h.e();
            while (i < bArr.length) {
                if (i == i3) {
                    eVar.writeByte(58);
                    i += i4;
                    if (i == 16) {
                        eVar.writeByte(58);
                    }
                } else {
                    if (i > 0) {
                        eVar.writeByte(58);
                    }
                    eVar.d((long) (((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)));
                    i += 2;
                }
            }
            return eVar.n();
        }

        private void a(String str, int i, int i2, boolean z, boolean z2) {
            String a2 = A.a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true);
            if (!f(a2)) {
                if (g(a2)) {
                    d();
                    return;
                }
                List<String> list = this.f14838f;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.f14838f;
                    list2.set(list2.size() - 1, a2);
                } else {
                    this.f14838f.add(a2);
                }
                if (z) {
                    this.f14838f.add(BuildConfig.FLAVOR);
                }
            }
        }

        private static boolean a(String str, int i, int i2, byte[] bArr, int i3) {
            int i4 = i3;
            while (i < i2) {
                if (i4 == bArr.length) {
                    return false;
                }
                if (i4 != i3) {
                    if (str.charAt(i) != '.') {
                        return false;
                    }
                    i++;
                }
                int i5 = i;
                int i6 = 0;
                while (i5 < i2) {
                    char charAt = str.charAt(i5);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                        return false;
                    } else {
                        i5++;
                    }
                }
                if (i5 - i == 0) {
                    return false;
                }
                bArr[i4] = (byte) i6;
                i4++;
                i = i5;
            }
            return i4 == i3 + 4;
        }

        private static InetAddress b(String str, int i, int i2) {
            byte[] bArr = new byte[16];
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            while (true) {
                if (i >= i2) {
                    break;
                } else if (i3 == bArr.length) {
                    return null;
                } else {
                    int i6 = i + 2;
                    if (i6 > i2 || !str.regionMatches(i, "::", 0, 2)) {
                        if (i3 != 0) {
                            if (str.regionMatches(i, ":", 0, 1)) {
                                i++;
                            } else if (!str.regionMatches(i, ".", 0, 1) || !a(str, i5, i2, bArr, i3 - 2)) {
                                return null;
                            } else {
                                i3 += 2;
                            }
                        }
                        i5 = i;
                    } else if (i4 != -1) {
                        return null;
                    } else {
                        i3 += 2;
                        if (i6 == i2) {
                            i4 = i3;
                            break;
                        }
                        i4 = i3;
                        i5 = i6;
                    }
                    i = i5;
                    int i7 = 0;
                    while (i < i2) {
                        int a2 = A.a(str.charAt(i));
                        if (a2 == -1) {
                            break;
                        }
                        i7 = (i7 << 4) + a2;
                        i++;
                    }
                    int i8 = i - i5;
                    if (i8 == 0 || i8 > 4) {
                        return null;
                    }
                    int i9 = i3 + 1;
                    bArr[i3] = (byte) ((i7 >>> 8) & 255);
                    i3 = i9 + 1;
                    bArr[i9] = (byte) (i7 & 255);
                }
            }
            if (i3 != bArr.length) {
                if (i4 == -1) {
                    return null;
                }
                int i10 = i3 - i4;
                System.arraycopy(bArr, i4, bArr, bArr.length - i10, i10);
                Arrays.fill(bArr, i4, (bArr.length - i3) + i4, (byte) 0);
            }
            try {
                return InetAddress.getByAddress(bArr);
            } catch (UnknownHostException unused) {
                throw new AssertionError();
            }
        }

        private static int c(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(A.a(str, i, i2, BuildConfig.FLAVOR, false, false, false, true));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        private static int d(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) == ']');
                }
                i++;
            }
            return i2;
        }

        private void d() {
            List<String> list = this.f14838f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f14838f.isEmpty()) {
                this.f14838f.add(BuildConfig.FLAVOR);
                return;
            }
            List<String> list2 = this.f14838f;
            list2.set(list2.size() - 1, BuildConfig.FLAVOR);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        private void e(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f14838f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f14838f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f14838f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = g.a.e.a((java.lang.String) r11, (int) r6, (int) r13, (java.lang.String) r12)
                if (r12 >= r13) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.a((java.lang.String) r5, (int) r6, (int) r7, (boolean) r8, (boolean) r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.A.a.e(java.lang.String, int, int):void");
        }

        private static int f(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }

        private boolean f(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private static int g(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        private boolean g(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* access modifiers changed from: package-private */
        public C0088a a(A a2, String str) {
            int i;
            int a3;
            int i2;
            A a4 = a2;
            String str2 = str;
            int a5 = e.a(str2, 0, str.length());
            int b2 = e.b(str2, a5, str.length());
            if (f(str2, a5, b2) != -1) {
                if (str.regionMatches(true, a5, "https:", 0, 6)) {
                    this.f14833a = "https";
                    a5 += 6;
                } else if (!str.regionMatches(true, a5, "http:", 0, 5)) {
                    return C0088a.UNSUPPORTED_SCHEME;
                } else {
                    this.f14833a = "http";
                    a5 += 5;
                }
            } else if (a4 == null) {
                return C0088a.MISSING_SCHEME;
            } else {
                this.f14833a = a4.f14826b;
            }
            int g2 = g(str2, a5, b2);
            char c2 = '?';
            char c3 = '#';
            if (g2 >= 2 || a4 == null || !a4.f14826b.equals(this.f14833a)) {
                int i3 = a5 + g2;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    a3 = e.a(str2, i3, b2, "@/\\?#");
                    char charAt = a3 != b2 ? str2.charAt(a3) : 65535;
                    if (charAt == 65535 || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        i = a3;
                        int d2 = d(str2, i3, i);
                        int i4 = d2 + 1;
                    } else {
                        if (charAt == '@') {
                            if (!z) {
                                int a6 = e.a(str2, i3, a3, ':');
                                int i5 = a6;
                                String str3 = "%40";
                                i2 = a3;
                                String a7 = A.a(str, i3, a6, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                if (z2) {
                                    a7 = this.f14834b + str3 + a7;
                                }
                                this.f14834b = a7;
                                if (i5 != i2) {
                                    this.f14835c = A.a(str, i5 + 1, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                i2 = a3;
                                this.f14835c += "%40" + A.a(str, i3, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                            }
                            i3 = i2 + 1;
                        }
                        c2 = '?';
                        c3 = '#';
                    }
                }
                i = a3;
                int d22 = d(str2, i3, i);
                int i42 = d22 + 1;
                if (i42 < i) {
                    this.f14836d = a(str2, i3, d22);
                    this.f14837e = c(str2, i42, i);
                    if (this.f14837e == -1) {
                        return C0088a.INVALID_PORT;
                    }
                } else {
                    this.f14836d = a(str2, i3, d22);
                    this.f14837e = A.a(this.f14833a);
                }
                if (this.f14836d == null) {
                    return C0088a.INVALID_HOST;
                }
            } else {
                this.f14834b = a2.f();
                this.f14835c = a2.b();
                this.f14836d = a4.f14829e;
                this.f14837e = a4.f14830f;
                this.f14838f.clear();
                this.f14838f.addAll(a2.d());
                if (a5 == b2 || str2.charAt(a5) == '#') {
                    a(a2.e());
                }
                i = a5;
            }
            int a8 = e.a(str2, i, b2, "?#");
            e(str2, i, a8);
            if (a8 < b2 && str2.charAt(a8) == '?') {
                int a9 = e.a(str2, a8, b2, '#');
                this.f14839g = A.d(A.a(str, a8 + 1, a9, " \"'<>#", true, false, true, true));
                a8 = a9;
            }
            if (a8 < b2 && str2.charAt(a8) == '#') {
                this.f14840h = A.a(str, 1 + a8, b2, BuildConfig.FLAVOR, true, false, false, false);
            }
            return C0088a.SUCCESS;
        }

        public a a(int i) {
            if (i <= 0 || i > 65535) {
                throw new IllegalArgumentException("unexpected port: " + i);
            }
            this.f14837e = i;
            return this;
        }

        public a a(String str) {
            this.f14839g = str != null ? A.d(A.a(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public a a(String str, String str2) {
            if (str != null) {
                if (this.f14839g == null) {
                    this.f14839g = new ArrayList();
                }
                this.f14839g.add(A.a(str, " \"'<>#&=", false, false, true, true));
                this.f14839g.add(str2 != null ? A.a(str2, " \"'<>#&=", false, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        public A a() {
            if (this.f14833a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f14836d != null) {
                return new A(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* access modifiers changed from: package-private */
        public int b() {
            int i = this.f14837e;
            return i != -1 ? i : A.a(this.f14833a);
        }

        public a b(String str) {
            if (str != null) {
                String a2 = a(str, 0, str.length());
                if (a2 != null) {
                    this.f14836d = a2;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            throw new NullPointerException("host == null");
        }

        /* access modifiers changed from: package-private */
        public a c() {
            int size = this.f14838f.size();
            for (int i = 0; i < size; i++) {
                this.f14838f.set(i, A.a(this.f14838f.get(i), "[]", true, true, false, true));
            }
            List<String> list = this.f14839g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.f14839g.get(i2);
                    if (str != null) {
                        this.f14839g.set(i2, A.a(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f14840h;
            if (str2 != null) {
                this.f14840h = A.a(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public a c(String str) {
            if (str != null) {
                this.f14835c = A.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        public a d(String str) {
            if (str != null) {
                String str2 = "http";
                if (!str.equalsIgnoreCase(str2)) {
                    str2 = "https";
                    if (!str.equalsIgnoreCase(str2)) {
                        throw new IllegalArgumentException("unexpected scheme: " + str);
                    }
                }
                this.f14833a = str2;
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        public a e(String str) {
            if (str != null) {
                this.f14834b = A.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f14833a);
            sb.append("://");
            if (!this.f14834b.isEmpty() || !this.f14835c.isEmpty()) {
                sb.append(this.f14834b);
                if (!this.f14835c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f14835c);
                }
                sb.append('@');
            }
            if (this.f14836d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f14836d);
                sb.append(']');
            } else {
                sb.append(this.f14836d);
            }
            int b2 = b();
            if (b2 != A.a(this.f14833a)) {
                sb.append(':');
                sb.append(b2);
            }
            A.b(sb, this.f14838f);
            if (this.f14839g != null) {
                sb.append('?');
                A.a(sb, this.f14839g);
            }
            if (this.f14840h != null) {
                sb.append('#');
                sb.append(this.f14840h);
            }
            return sb.toString();
        }
    }

    A(a aVar) {
        this.f14826b = aVar.f14833a;
        this.f14827c = a(aVar.f14834b, false);
        this.f14828d = a(aVar.f14835c, false);
        this.f14829e = aVar.f14836d;
        this.f14830f = aVar.b();
        this.f14831g = a(aVar.f14838f, false);
        List<String> list = aVar.f14839g;
        String str = null;
        this.f14832h = list != null ? a(list, true) : null;
        String str2 = aVar.f14840h;
        this.i = str2 != null ? a(str2, false) : str;
        this.j = aVar.toString();
    }

    static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    static String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        String str3 = str;
        int i4 = i3;
        int i5 = i2;
        while (i5 < i4) {
            int codePointAt = str.codePointAt(i5);
            if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && z4)) {
                String str4 = str2;
            } else {
                String str5 = str2;
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || a(str, i5, i3)))) && (codePointAt != 43 || !z3))) {
                    i5 += Character.charCount(codePointAt);
                }
            }
            h.e eVar = new h.e();
            int i6 = i2;
            eVar.a(str, i2, i5);
            a(eVar, str, i5, i3, str2, z, z2, z3, z4);
            return eVar.n();
        }
        int i7 = i2;
        return str.substring(i2, i3);
    }

    static String a(String str, int i2, int i3, boolean z) {
        for (int i4 = i2; i4 < i3; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '%' || (charAt == '+' && z)) {
                h.e eVar = new h.e();
                eVar.a(str, i2, i4);
                a(eVar, str, i4, i3, z);
                return eVar.n();
            }
        }
        return str.substring(i2, i3);
    }

    static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4);
    }

    static String a(String str, boolean z) {
        return a(str, 0, str.length(), z);
    }

    private List<String> a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = list.get(i2);
            arrayList.add(str != null ? a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static void a(h.e eVar, String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        h.e eVar2 = null;
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z3) {
                    eVar.a(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !a(str, i2, i3)))))) {
                    if (eVar2 == null) {
                        eVar2 = new h.e();
                    }
                    eVar2.c(codePointAt);
                    while (!eVar2.e()) {
                        byte readByte = eVar2.readByte() & 255;
                        eVar.writeByte(37);
                        eVar.writeByte((int) f14825a[(readByte >> 4) & 15]);
                        eVar.writeByte((int) f14825a[readByte & 15]);
                    }
                } else {
                    eVar.c(codePointAt);
                }
            }
            i2 += Character.charCount(codePointAt);
        }
    }

    static void a(h.e eVar, String str, int i2, int i3, boolean z) {
        int i4;
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt == 37 && (i4 = i2 + 2) < i3) {
                int a2 = a(str.charAt(i2 + 1));
                int a3 = a(str.charAt(i4));
                if (!(a2 == -1 || a3 == -1)) {
                    eVar.writeByte((a2 << 4) + a3);
                    i2 = i4;
                    i2 += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z) {
                eVar.writeByte(32);
                i2 += Character.charCount(codePointAt);
            }
            eVar.c(codePointAt);
            i2 += Character.charCount(codePointAt);
        }
    }

    static void a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = list.get(i2);
            String str2 = list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    static boolean a(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && a(str.charAt(i2 + 1)) != -1 && a(str.charAt(i4)) != -1;
    }

    static void b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append(list.get(i2));
        }
    }

    public static A c(String str) {
        a aVar = new a();
        if (aVar.a((A) null, str) == a.C0088a.SUCCESS) {
            return aVar.a();
        }
        return null;
    }

    static List<String> d(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    public String a() {
        if (this.i == null) {
            return null;
        }
        return this.j.substring(this.j.indexOf(35) + 1);
    }

    public a b(String str) {
        a aVar = new a();
        if (aVar.a(this, str) == a.C0088a.SUCCESS) {
            return aVar;
        }
        return null;
    }

    public String b() {
        if (this.f14828d.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        int indexOf = this.j.indexOf(64);
        return this.j.substring(this.j.indexOf(58, this.f14826b.length() + 3) + 1, indexOf);
    }

    public String c() {
        int indexOf = this.j.indexOf(47, this.f14826b.length() + 3);
        String str = this.j;
        return this.j.substring(indexOf, e.a(str, indexOf, str.length(), "?#"));
    }

    public List<String> d() {
        int indexOf = this.j.indexOf(47, this.f14826b.length() + 3);
        String str = this.j;
        int a2 = e.a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a2) {
            int i2 = indexOf + 1;
            int a3 = e.a(this.j, i2, a2, '/');
            arrayList.add(this.j.substring(i2, a3));
            indexOf = a3;
        }
        return arrayList;
    }

    public A e(String str) {
        a b2 = b(str);
        if (b2 != null) {
            return b2.a();
        }
        return null;
    }

    public String e() {
        if (this.f14832h == null) {
            return null;
        }
        int indexOf = this.j.indexOf(63) + 1;
        String str = this.j;
        return this.j.substring(indexOf, e.a(str, indexOf + 1, str.length(), '#'));
    }

    public boolean equals(Object obj) {
        return (obj instanceof A) && ((A) obj).j.equals(this.j);
    }

    public String f() {
        if (this.f14827c.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        int length = this.f14826b.length() + 3;
        String str = this.j;
        return this.j.substring(length, e.a(str, length, str.length(), ":@"));
    }

    public String g() {
        return this.f14829e;
    }

    public boolean h() {
        return this.f14826b.equals("https");
    }

    public int hashCode() {
        return this.j.hashCode();
    }

    public a i() {
        a aVar = new a();
        aVar.f14833a = this.f14826b;
        aVar.f14834b = f();
        aVar.f14835c = b();
        aVar.f14836d = this.f14829e;
        aVar.f14837e = this.f14830f != a(this.f14826b) ? this.f14830f : -1;
        aVar.f14838f.clear();
        aVar.f14838f.addAll(d());
        aVar.a(e());
        aVar.f14840h = a();
        return aVar;
    }

    public int j() {
        return this.f14830f;
    }

    public String k() {
        if (this.f14832h == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        a(sb, this.f14832h);
        return sb.toString();
    }

    public String l() {
        a b2 = b("/...");
        b2.e(BuildConfig.FLAVOR);
        b2.c(BuildConfig.FLAVOR);
        return b2.a().toString();
    }

    public String m() {
        return this.f14826b;
    }

    public URI n() {
        a i2 = i();
        i2.c();
        String aVar = i2.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", BuildConfig.FLAVOR));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public String toString() {
        return this.j;
    }
}
