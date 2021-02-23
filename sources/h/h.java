package h;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class h implements Serializable, Comparable<h> {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f15329a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b  reason: collision with root package name */
    public static final h f15330b = a(new byte[0]);

    /* renamed from: c  reason: collision with root package name */
    final byte[] f15331c;

    /* renamed from: d  reason: collision with root package name */
    transient int f15332d;

    /* renamed from: e  reason: collision with root package name */
    transient String f15333e;

    h(byte[] bArr) {
        this.f15331c = bArr;
    }

    private static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: " + c2);
            }
        }
        return (c2 - c3) + 10;
    }

    static int a(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    public static h a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 == 0) {
            byte[] bArr = new byte[(str.length() / 2)];
            for (int i = 0; i < bArr.length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((a(str.charAt(i2)) << 4) + a(str.charAt(i2 + 1)));
            }
            return a(bArr);
        } else {
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
    }

    public static h a(byte... bArr) {
        if (bArr != null) {
            return new h((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static h b(String str) {
        if (str != null) {
            h hVar = new h(str.getBytes(z.f15371a));
            hVar.f15333e = str;
            return hVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    private h c(String str) {
        try {
            return a(MessageDigest.getInstance(str).digest(this.f15331c));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public byte a(int i) {
        return this.f15331c[i];
    }

    /* renamed from: a */
    public int compareTo(h hVar) {
        int n = n();
        int n2 = hVar.n();
        int min = Math.min(n, n2);
        for (int i = 0; i < min; i++) {
            byte a2 = a(i) & 255;
            byte a3 = hVar.a(i) & 255;
            if (a2 != a3) {
                return a2 < a3 ? -1 : 1;
            }
        }
        if (n == n2) {
            return 0;
        }
        return n < n2 ? -1 : 1;
    }

    public h a(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f15331c;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(this.f15331c, i, bArr2, 0, i3);
                    return new h(bArr2);
                }
            } else {
                throw new IllegalArgumentException("endIndex > length(" + this.f15331c.length + ")");
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    public String a() {
        return d.a(this.f15331c);
    }

    /* access modifiers changed from: package-private */
    public void a(e eVar) {
        byte[] bArr = this.f15331c;
        eVar.write(bArr, 0, bArr.length);
    }

    public boolean a(int i, h hVar, int i2, int i3) {
        return hVar.a(i2, this.f15331c, i, i3);
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f15331c;
            return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && z.a(bArr2, i, bArr, i2, i3);
        }
    }

    public final boolean b(h hVar) {
        return a(0, hVar, 0, hVar.n());
    }

    public String c() {
        byte[] bArr = this.f15331c;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f15329a;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public h d() {
        return c("SHA-1");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            int n = hVar.n();
            byte[] bArr = this.f15331c;
            return n == bArr.length && hVar.a(0, bArr, 0, bArr.length);
        }
    }

    public int hashCode() {
        int i = this.f15332d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f15331c);
        this.f15332d = hashCode;
        return hashCode;
    }

    public h m() {
        return c("SHA-256");
    }

    public int n() {
        return this.f15331c.length;
    }

    public h o() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f15331c;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            if (b2 < 65 || b2 > 90) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b3 = bArr2[i2];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr2[i2] = (byte) (b3 + 32);
                    }
                }
                return new h(bArr2);
            }
        }
    }

    public byte[] p() {
        return (byte[]) this.f15331c.clone();
    }

    public String q() {
        String str = this.f15333e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f15331c, z.f15371a);
        this.f15333e = str2;
        return str2;
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        if (this.f15331c.length == 0) {
            return "[size=0]";
        }
        String q = q();
        int a2 = a(q, 64);
        if (a2 == -1) {
            if (this.f15331c.length <= 64) {
                sb2 = new StringBuilder();
                sb2.append("[hex=");
                sb2.append(c());
                sb2.append("]");
            } else {
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(this.f15331c.length);
                sb2.append(" hex=");
                sb2.append(a(0, 64).c());
                sb2.append("…]");
            }
            return sb2.toString();
        }
        String replace = q.substring(0, a2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (a2 < q.length()) {
            sb = new StringBuilder();
            sb.append("[size=");
            sb.append(this.f15331c.length);
            sb.append(" text=");
            sb.append(replace);
            sb.append("…]");
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(replace);
            sb.append("]");
        }
        return sb.toString();
    }
}
