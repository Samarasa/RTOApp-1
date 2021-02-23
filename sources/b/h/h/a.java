package b.h.h;

import android.text.SpannableStringBuilder;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Locale;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final d f2467a = e.f2502c;

    /* renamed from: b  reason: collision with root package name */
    private static final String f2468b = Character.toString(8206);

    /* renamed from: c  reason: collision with root package name */
    private static final String f2469c = Character.toString(8207);

    /* renamed from: d  reason: collision with root package name */
    static final a f2470d = new a(false, 2, f2467a);

    /* renamed from: e  reason: collision with root package name */
    static final a f2471e = new a(true, 2, f2467a);

    /* renamed from: f  reason: collision with root package name */
    private final boolean f2472f;

    /* renamed from: g  reason: collision with root package name */
    private final int f2473g;

    /* renamed from: h  reason: collision with root package name */
    private final d f2474h;

    /* renamed from: b.h.h.a$a  reason: collision with other inner class name */
    public static final class C0031a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f2475a;

        /* renamed from: b  reason: collision with root package name */
        private int f2476b;

        /* renamed from: c  reason: collision with root package name */
        private d f2477c;

        public C0031a() {
            b(a.a(Locale.getDefault()));
        }

        private static a a(boolean z) {
            return z ? a.f2471e : a.f2470d;
        }

        private void b(boolean z) {
            this.f2475a = z;
            this.f2477c = a.f2467a;
            this.f2476b = 2;
        }

        public a a() {
            return (this.f2476b == 2 && this.f2477c == a.f2467a) ? a(this.f2475a) : new a(this.f2475a, this.f2476b, this.f2477c);
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private static final byte[] f2478a = new byte[1792];

        /* renamed from: b  reason: collision with root package name */
        private final CharSequence f2479b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f2480c;

        /* renamed from: d  reason: collision with root package name */
        private final int f2481d;

        /* renamed from: e  reason: collision with root package name */
        private int f2482e;

        /* renamed from: f  reason: collision with root package name */
        private char f2483f;

        static {
            for (int i = 0; i < 1792; i++) {
                f2478a[i] = Character.getDirectionality(i);
            }
        }

        b(CharSequence charSequence, boolean z) {
            this.f2479b = charSequence;
            this.f2480c = z;
            this.f2481d = charSequence.length();
        }

        private static byte a(char c2) {
            return c2 < 1792 ? f2478a[c2] : Character.getDirectionality(c2);
        }

        private byte e() {
            char c2;
            int i = this.f2482e;
            do {
                int i2 = this.f2482e;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2479b;
                int i3 = i2 - 1;
                this.f2482e = i3;
                this.f2483f = charSequence.charAt(i3);
                c2 = this.f2483f;
                if (c2 == '&') {
                    return 12;
                }
            } while (c2 != ';');
            this.f2482e = i;
            this.f2483f = ';';
            return 13;
        }

        private byte f() {
            char charAt;
            do {
                int i = this.f2482e;
                if (i >= this.f2481d) {
                    return 12;
                }
                CharSequence charSequence = this.f2479b;
                this.f2482e = i + 1;
                charAt = charSequence.charAt(i);
                this.f2483f = charAt;
            } while (charAt != ';');
            return 12;
        }

        private byte g() {
            char charAt;
            int i = this.f2482e;
            while (true) {
                int i2 = this.f2482e;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2479b;
                int i3 = i2 - 1;
                this.f2482e = i3;
                this.f2483f = charSequence.charAt(i3);
                char c2 = this.f2483f;
                if (c2 == '<') {
                    return 12;
                }
                if (c2 == '>') {
                    break;
                } else if (c2 == '\"' || c2 == '\'') {
                    char c3 = this.f2483f;
                    do {
                        int i4 = this.f2482e;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f2479b;
                        int i5 = i4 - 1;
                        this.f2482e = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f2483f = charAt;
                    } while (charAt != c3);
                }
            }
            this.f2482e = i;
            this.f2483f = '>';
            return 13;
        }

        private byte h() {
            char charAt;
            int i = this.f2482e;
            while (true) {
                int i2 = this.f2482e;
                if (i2 < this.f2481d) {
                    CharSequence charSequence = this.f2479b;
                    this.f2482e = i2 + 1;
                    this.f2483f = charSequence.charAt(i2);
                    char c2 = this.f2483f;
                    if (c2 == '>') {
                        return 12;
                    }
                    if (c2 == '\"' || c2 == '\'') {
                        char c3 = this.f2483f;
                        do {
                            int i3 = this.f2482e;
                            if (i3 >= this.f2481d) {
                                break;
                            }
                            CharSequence charSequence2 = this.f2479b;
                            this.f2482e = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f2483f = charAt;
                        } while (charAt != c3);
                    }
                } else {
                    this.f2482e = i;
                    this.f2483f = '<';
                    return 13;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public byte a() {
            this.f2483f = this.f2479b.charAt(this.f2482e - 1);
            if (Character.isLowSurrogate(this.f2483f)) {
                int codePointBefore = Character.codePointBefore(this.f2479b, this.f2482e);
                this.f2482e -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f2482e--;
            byte a2 = a(this.f2483f);
            if (!this.f2480c) {
                return a2;
            }
            char c2 = this.f2483f;
            return c2 == '>' ? g() : c2 == ';' ? e() : a2;
        }

        /* access modifiers changed from: package-private */
        public byte b() {
            this.f2483f = this.f2479b.charAt(this.f2482e);
            if (Character.isHighSurrogate(this.f2483f)) {
                int codePointAt = Character.codePointAt(this.f2479b, this.f2482e);
                this.f2482e += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f2482e++;
            byte a2 = a(this.f2483f);
            if (!this.f2480c) {
                return a2;
            }
            char c2 = this.f2483f;
            return c2 == '<' ? h() : c2 == '&' ? f() : a2;
        }

        /* access modifiers changed from: package-private */
        public int c() {
            this.f2482e = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f2482e < this.f2481d && i == 0) {
                byte b2 = b();
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b2 != 9) {
                        switch (b2) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f2482e > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r2 = r2 - 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int d() {
            /*
                r7 = this;
                int r0 = r7.f2481d
                r7.f2482e = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r7.f2482e
                if (r3 <= 0) goto L_0x003b
                byte r3 = r7.a()
                r4 = -1
                if (r3 == 0) goto L_0x0034
                r5 = 1
                if (r3 == r5) goto L_0x002e
                r6 = 2
                if (r3 == r6) goto L_0x002e
                r6 = 9
                if (r3 == r6) goto L_0x0007
                switch(r3) {
                    case 14: goto L_0x0028;
                    case 15: goto L_0x0028;
                    case 16: goto L_0x0025;
                    case 17: goto L_0x0025;
                    case 18: goto L_0x0022;
                    default: goto L_0x001f;
                }
            L_0x001f:
                if (r1 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0022:
                int r2 = r2 + 1
                goto L_0x0007
            L_0x0025:
                if (r1 != r2) goto L_0x002b
                return r5
            L_0x0028:
                if (r1 != r2) goto L_0x002b
                return r4
            L_0x002b:
                int r2 = r2 + -1
                goto L_0x0007
            L_0x002e:
                if (r2 != 0) goto L_0x0031
                return r5
            L_0x0031:
                if (r1 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0034:
                if (r2 != 0) goto L_0x0037
                return r4
            L_0x0037:
                if (r1 != 0) goto L_0x0007
            L_0x0039:
                r1 = r2
                goto L_0x0007
            L_0x003b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b.h.h.a.b.d():int");
        }
    }

    a(boolean z, int i, d dVar) {
        this.f2472f = z;
        this.f2473g = i;
        this.f2474h = dVar;
    }

    public static a a() {
        return new C0031a().a();
    }

    private String a(CharSequence charSequence, d dVar) {
        boolean isRtl = dVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f2472f || (!isRtl && c(charSequence) != 1)) ? this.f2472f ? (!isRtl || c(charSequence) == -1) ? f2469c : BuildConfig.FLAVOR : BuildConfig.FLAVOR : f2468b;
    }

    static boolean a(Locale locale) {
        return f.a(locale) == 1;
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).c();
    }

    private String b(CharSequence charSequence, d dVar) {
        boolean isRtl = dVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f2472f || (!isRtl && b(charSequence) != 1)) ? this.f2472f ? (!isRtl || b(charSequence) == -1) ? f2469c : BuildConfig.FLAVOR : BuildConfig.FLAVOR : f2468b;
    }

    private static int c(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    public CharSequence a(CharSequence charSequence) {
        return a(charSequence, this.f2474h, true);
    }

    public CharSequence a(CharSequence charSequence, d dVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean isRtl = dVar.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (b() && z) {
            spannableStringBuilder.append(b(charSequence, isRtl ? e.f2501b : e.f2500a));
        }
        if (isRtl != this.f2472f) {
            spannableStringBuilder.append(isRtl ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append(a(charSequence, isRtl ? e.f2501b : e.f2500a));
        }
        return spannableStringBuilder;
    }

    public boolean b() {
        return (this.f2473g & 2) != 0;
    }
}
