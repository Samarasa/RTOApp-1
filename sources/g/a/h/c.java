package g.a.h;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import javax.security.auth.x500.X500Principal;

final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f15222a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15223b = this.f15222a.length();

    /* renamed from: c  reason: collision with root package name */
    private int f15224c;

    /* renamed from: d  reason: collision with root package name */
    private int f15225d;

    /* renamed from: e  reason: collision with root package name */
    private int f15226e;

    /* renamed from: f  reason: collision with root package name */
    private int f15227f;

    /* renamed from: g  reason: collision with root package name */
    private char[] f15228g;

    public c(X500Principal x500Principal) {
        this.f15222a = x500Principal.getName("RFC2253");
    }

    private int a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 < this.f15223b) {
            char c2 = this.f15228g[i];
            if (c2 >= '0' && c2 <= '9') {
                i2 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i2 = c2 - 'W';
            } else if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f15222a);
            } else {
                i2 = c2 - '7';
            }
            char c3 = this.f15228g[i4];
            if (c3 >= '0' && c3 <= '9') {
                i3 = c3 - '0';
            } else if (c3 >= 'a' && c3 <= 'f') {
                i3 = c3 - 'W';
            } else if (c3 < 'A' || c3 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f15222a);
            } else {
                i3 = c3 - '7';
            }
            return (i2 << 4) + i3;
        }
        throw new IllegalStateException("Malformed DN: " + this.f15222a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0097, code lost:
        r1 = r8.f15228g;
        r2 = r8.f15225d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a3, code lost:
        return new java.lang.String(r1, r2, r8.f15227f - r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a() {
        /*
            r8 = this;
            int r0 = r8.f15224c
            r8.f15225d = r0
            r8.f15226e = r0
        L_0x0006:
            int r0 = r8.f15224c
            int r1 = r8.f15223b
            if (r0 < r1) goto L_0x0019
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f15228g
            int r2 = r8.f15225d
            int r3 = r8.f15226e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0019:
            char[] r1 = r8.f15228g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L_0x005c
            if (r2 == r5) goto L_0x004f
            r5 = 92
            if (r2 == r5) goto L_0x0040
            if (r2 == r4) goto L_0x004f
            if (r2 == r3) goto L_0x004f
            int r2 = r8.f15226e
            int r3 = r2 + 1
            r8.f15226e = r3
            char r3 = r1[r0]
            r1[r2] = r3
        L_0x003b:
            int r0 = r0 + 1
            r8.f15224c = r0
            goto L_0x0006
        L_0x0040:
            int r0 = r8.f15226e
            int r2 = r0 + 1
            r8.f15226e = r2
            char r2 = r8.b()
            r1[r0] = r2
            int r0 = r8.f15224c
            goto L_0x003b
        L_0x004f:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f15228g
            int r2 = r8.f15225d
            int r3 = r8.f15226e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x005c:
            int r2 = r8.f15226e
            r8.f15227f = r2
            int r0 = r0 + 1
            r8.f15224c = r0
            int r0 = r2 + 1
            r8.f15226e = r0
            r1[r2] = r6
        L_0x006a:
            int r0 = r8.f15224c
            int r1 = r8.f15223b
            if (r0 >= r1) goto L_0x0083
            char[] r1 = r8.f15228g
            char r2 = r1[r0]
            if (r2 != r6) goto L_0x0083
            int r2 = r8.f15226e
            int r7 = r2 + 1
            r8.f15226e = r7
            r1[r2] = r6
            int r0 = r0 + 1
            r8.f15224c = r0
            goto L_0x006a
        L_0x0083:
            int r0 = r8.f15224c
            int r1 = r8.f15223b
            if (r0 == r1) goto L_0x0097
            char[] r1 = r8.f15228g
            char r2 = r1[r0]
            if (r2 == r3) goto L_0x0097
            char r2 = r1[r0]
            if (r2 == r4) goto L_0x0097
            char r0 = r1[r0]
            if (r0 != r5) goto L_0x0006
        L_0x0097:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f15228g
            int r2 = r8.f15225d
            int r3 = r8.f15227f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.h.c.a():java.lang.String");
    }

    private char b() {
        this.f15224c++;
        int i = this.f15224c;
        if (i != this.f15223b) {
            char c2 = this.f15228g[i];
            if (!(c2 == ' ' || c2 == '%' || c2 == '\\' || c2 == '_' || c2 == '\"' || c2 == '#')) {
                switch (c2) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c2) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                return c();
                        }
                }
            }
            return this.f15228g[this.f15224c];
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f15222a);
    }

    private char c() {
        int i;
        int i2;
        int a2 = a(this.f15224c);
        this.f15224c++;
        if (a2 < 128) {
            return (char) a2;
        }
        if (a2 < 192 || a2 > 247) {
            return '?';
        }
        if (a2 <= 223) {
            i2 = a2 & 31;
            i = 1;
        } else if (a2 <= 239) {
            i = 2;
            i2 = a2 & 15;
        } else {
            i = 3;
            i2 = a2 & 7;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.f15224c++;
            int i4 = this.f15224c;
            if (i4 == this.f15223b || this.f15228g[i4] != '\\') {
                return '?';
            }
            this.f15224c = i4 + 1;
            int a3 = a(this.f15224c);
            this.f15224c++;
            if ((a3 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (a3 & 63);
        }
        return (char) i2;
    }

    private String d() {
        int i = this.f15224c;
        if (i + 4 < this.f15223b) {
            this.f15225d = i;
            while (true) {
                this.f15224c = i + 1;
                int i2 = this.f15224c;
                if (i2 == this.f15223b) {
                    break;
                }
                char[] cArr = this.f15228g;
                if (cArr[i2] == '+' || cArr[i2] == ',' || cArr[i2] == ';') {
                    break;
                } else if (cArr[i2] == ' ') {
                    this.f15226e = i2;
                    do {
                        this.f15224c = i2 + 1;
                        i2 = this.f15224c;
                        if (i2 >= this.f15223b) {
                            break;
                        }
                    } while (this.f15228g[i2] != ' ');
                } else {
                    if (cArr[i2] >= 'A' && cArr[i2] <= 'F') {
                        cArr[i2] = (char) (cArr[i2] + ' ');
                    }
                    i = this.f15224c;
                }
            }
            this.f15226e = this.f15224c;
            int i3 = this.f15226e;
            int i4 = this.f15225d;
            int i5 = i3 - i4;
            if (i5 < 5 || (i5 & 1) == 0) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f15222a);
            }
            byte[] bArr = new byte[(i5 / 2)];
            int i6 = i4 + 1;
            for (int i7 = 0; i7 < bArr.length; i7++) {
                bArr[i7] = (byte) a(i6);
                i6 += 2;
            }
            return new String(this.f15228g, this.f15225d, i5);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f15222a);
    }

    private String e() {
        char[] cArr;
        while (true) {
            int i = this.f15224c;
            if (i >= this.f15223b || this.f15228g[i] != ' ') {
                int i2 = this.f15224c;
            } else {
                this.f15224c = i + 1;
            }
        }
        int i22 = this.f15224c;
        if (i22 == this.f15223b) {
            return null;
        }
        this.f15225d = i22;
        do {
            this.f15224c = i22 + 1;
            i22 = this.f15224c;
            if (i22 >= this.f15223b) {
                break;
            }
            cArr = this.f15228g;
            if (cArr[i22] == '=') {
                break;
            }
        } while (cArr[i22] == ' ');
        int i3 = this.f15224c;
        if (i3 < this.f15223b) {
            this.f15226e = i3;
            if (this.f15228g[i3] == ' ') {
                while (true) {
                    int i4 = this.f15224c;
                    if (i4 >= this.f15223b) {
                        break;
                    }
                    char[] cArr2 = this.f15228g;
                    if (cArr2[i4] == '=' || cArr2[i4] != ' ') {
                        break;
                    }
                    this.f15224c = i4 + 1;
                }
                char[] cArr3 = this.f15228g;
                int i5 = this.f15224c;
                if (cArr3[i5] != '=' || i5 == this.f15223b) {
                    throw new IllegalStateException("Unexpected end of DN: " + this.f15222a);
                }
            }
            int i6 = this.f15224c;
            do {
                this.f15224c = i6 + 1;
                i6 = this.f15224c;
                if (i6 >= this.f15223b || this.f15228g[i6] != ' ') {
                    int i7 = this.f15226e;
                    int i8 = this.f15225d;
                }
                this.f15224c = i6 + 1;
                i6 = this.f15224c;
                break;
            } while (this.f15228g[i6] != ' ');
            int i72 = this.f15226e;
            int i82 = this.f15225d;
            if (i72 - i82 > 4) {
                char[] cArr4 = this.f15228g;
                if (cArr4[i82 + 3] == '.' && (cArr4[i82] == 'O' || cArr4[i82] == 'o')) {
                    char[] cArr5 = this.f15228g;
                    int i9 = this.f15225d;
                    if (cArr5[i9 + 1] == 'I' || cArr5[i9 + 1] == 'i') {
                        char[] cArr6 = this.f15228g;
                        int i10 = this.f15225d;
                        if (cArr6[i10 + 2] == 'D' || cArr6[i10 + 2] == 'd') {
                            this.f15225d += 4;
                        }
                    }
                }
            }
            char[] cArr7 = this.f15228g;
            int i11 = this.f15225d;
            return new String(cArr7, i11, this.f15226e - i11);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f15222a);
    }

    private String f() {
        this.f15224c++;
        this.f15225d = this.f15224c;
        int i = this.f15225d;
        while (true) {
            this.f15226e = i;
            int i2 = this.f15224c;
            if (i2 != this.f15223b) {
                char[] cArr = this.f15228g;
                if (cArr[i2] == '\"') {
                    do {
                        this.f15224c = i2 + 1;
                        i2 = this.f15224c;
                        if (i2 >= this.f15223b || this.f15228g[i2] != ' ') {
                            char[] cArr2 = this.f15228g;
                            int i3 = this.f15225d;
                        }
                        this.f15224c = i2 + 1;
                        i2 = this.f15224c;
                        break;
                    } while (this.f15228g[i2] != ' ');
                    char[] cArr22 = this.f15228g;
                    int i32 = this.f15225d;
                    return new String(cArr22, i32, this.f15226e - i32);
                }
                if (cArr[i2] == '\\') {
                    cArr[this.f15226e] = b();
                } else {
                    cArr[this.f15226e] = cArr[i2];
                }
                this.f15224c++;
                i = this.f15226e + 1;
            } else {
                throw new IllegalStateException("Unexpected end of DN: " + this.f15222a);
            }
        }
    }

    public String a(String str) {
        this.f15224c = 0;
        this.f15225d = 0;
        this.f15226e = 0;
        this.f15227f = 0;
        this.f15228g = this.f15222a.toCharArray();
        String e2 = e();
        if (e2 == null) {
            return null;
        }
        do {
            int i = this.f15224c;
            if (i == this.f15223b) {
                return null;
            }
            char c2 = this.f15228g[i];
            String a2 = c2 != '\"' ? c2 != '#' ? (c2 == '+' || c2 == ',' || c2 == ';') ? BuildConfig.FLAVOR : a() : d() : f();
            if (str.equalsIgnoreCase(e2)) {
                return a2;
            }
            int i2 = this.f15224c;
            if (i2 >= this.f15223b) {
                return null;
            }
            char[] cArr = this.f15228g;
            if (cArr[i2] == ',' || cArr[i2] == ';' || cArr[i2] == '+') {
                this.f15224c++;
                e2 = e();
            } else {
                throw new IllegalStateException("Malformed DN: " + this.f15222a);
            }
        } while (e2 != null);
        throw new IllegalStateException("Malformed DN: " + this.f15222a);
    }
}
