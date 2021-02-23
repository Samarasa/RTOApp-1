package com.google.android.gms.measurement.internal;

import c.b.b.b.d.f.E;
import c.b.b.b.d.f.G;
import com.google.android.gms.common.internal.C0563t;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

abstract class Fe {

    /* renamed from: a  reason: collision with root package name */
    String f13253a;

    /* renamed from: b  reason: collision with root package name */
    int f13254b;

    /* renamed from: c  reason: collision with root package name */
    Boolean f13255c;

    /* renamed from: d  reason: collision with root package name */
    Boolean f13256d;

    /* renamed from: e  reason: collision with root package name */
    Long f13257e;

    /* renamed from: f  reason: collision with root package name */
    Long f13258f;

    Fe(String str, int i) {
        this.f13253a = str;
        this.f13254b = i;
    }

    static Boolean a(double d2, E e2) {
        try {
            return a(new BigDecimal(d2), e2, Math.ulp(d2));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean a(long j, E e2) {
        try {
            return a(new BigDecimal(j), e2, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean a(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    static Boolean a(String str, E e2) {
        if (!oe.a(str)) {
            return null;
        }
        try {
            return a(new BigDecimal(str), e2, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean a(String str, G.b bVar, boolean z, String str2, List<String> list, String str3, Bb bb) {
        boolean startsWith;
        if (str == null) {
            return null;
        }
        if (bVar == G.b.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && bVar != G.b.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (Be.f13197a[bVar.ordinal()]) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (bb != null) {
                        bb.w().a("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                startsWith = str.startsWith(str2);
                break;
            case 3:
                startsWith = str.endsWith(str2);
                break;
            case 4:
                startsWith = str.contains(str2);
                break;
            case 5:
                startsWith = str.equals(str2);
                break;
            case 6:
                startsWith = list.contains(str);
                break;
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    static Boolean a(String str, G g2, Bb bb) {
        List<String> list;
        C0563t.a(g2);
        if (str == null || !g2.o() || g2.p() == G.b.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (g2.p() == G.b.IN_LIST) {
            if (g2.v() == 0) {
                return null;
            }
        } else if (!g2.q()) {
            return null;
        }
        G.b p = g2.p();
        boolean t = g2.t();
        String r = (t || p == G.b.REGEXP || p == G.b.IN_LIST) ? g2.r() : g2.r().toUpperCase(Locale.ENGLISH);
        if (g2.v() == 0) {
            list = null;
        } else {
            List<String> u = g2.u();
            if (!t) {
                ArrayList arrayList = new ArrayList(u.size());
                for (String upperCase : u) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                u = Collections.unmodifiableList(arrayList);
            }
            list = u;
        }
        return a(str, p, t, r, list, p == G.b.REGEXP ? r : null, bb);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if (r2 != null) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean a(java.math.BigDecimal r9, c.b.b.b.d.f.E r10, double r11) {
        /*
            com.google.android.gms.common.internal.C0563t.a(r10)
            boolean r0 = r10.o()
            r1 = 0
            if (r0 == 0) goto L_0x0110
            c.b.b.b.d.f.E$a r0 = r10.p()
            c.b.b.b.d.f.E$a r2 = c.b.b.b.d.f.E.a.UNKNOWN_COMPARISON_TYPE
            if (r0 != r2) goto L_0x0014
            goto L_0x0110
        L_0x0014:
            c.b.b.b.d.f.E$a r0 = r10.p()
            c.b.b.b.d.f.E$a r2 = c.b.b.b.d.f.E.a.BETWEEN
            if (r0 != r2) goto L_0x0029
            boolean r0 = r10.u()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r10.w()
            if (r0 != 0) goto L_0x0030
        L_0x0028:
            return r1
        L_0x0029:
            boolean r0 = r10.s()
            if (r0 != 0) goto L_0x0030
            return r1
        L_0x0030:
            c.b.b.b.d.f.E$a r0 = r10.p()
            c.b.b.b.d.f.E$a r2 = r10.p()
            c.b.b.b.d.f.E$a r3 = c.b.b.b.d.f.E.a.BETWEEN
            if (r2 != r3) goto L_0x0067
            java.lang.String r2 = r10.v()
            boolean r2 = com.google.android.gms.measurement.internal.oe.a((java.lang.String) r2)
            if (r2 == 0) goto L_0x0066
            java.lang.String r2 = r10.x()
            boolean r2 = com.google.android.gms.measurement.internal.oe.a((java.lang.String) r2)
            if (r2 != 0) goto L_0x0051
            goto L_0x0066
        L_0x0051:
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0066 }
            java.lang.String r3 = r10.v()     // Catch:{ NumberFormatException -> 0x0066 }
            r2.<init>(r3)     // Catch:{ NumberFormatException -> 0x0066 }
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0066 }
            java.lang.String r10 = r10.x()     // Catch:{ NumberFormatException -> 0x0066 }
            r3.<init>(r10)     // Catch:{ NumberFormatException -> 0x0066 }
            r10 = r2
            r2 = r1
            goto L_0x007d
        L_0x0066:
            return r1
        L_0x0067:
            java.lang.String r2 = r10.t()
            boolean r2 = com.google.android.gms.measurement.internal.oe.a((java.lang.String) r2)
            if (r2 != 0) goto L_0x0072
            return r1
        L_0x0072:
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0110 }
            java.lang.String r10 = r10.t()     // Catch:{ NumberFormatException -> 0x0110 }
            r2.<init>(r10)     // Catch:{ NumberFormatException -> 0x0110 }
            r10 = r1
            r3 = r10
        L_0x007d:
            c.b.b.b.d.f.E$a r4 = c.b.b.b.d.f.E.a.BETWEEN
            if (r0 != r4) goto L_0x0085
            if (r10 == 0) goto L_0x0084
            goto L_0x0087
        L_0x0084:
            return r1
        L_0x0085:
            if (r2 == 0) goto L_0x0110
        L_0x0087:
            int[] r4 = com.google.android.gms.measurement.internal.Be.f13198b
            int r0 = r0.ordinal()
            r0 = r4[r0]
            r4 = -1
            r5 = 0
            r6 = 1
            if (r0 == r6) goto L_0x0104
            r7 = 2
            if (r0 == r7) goto L_0x00f8
            r8 = 3
            if (r0 == r8) goto L_0x00b0
            r11 = 4
            if (r0 == r11) goto L_0x009e
            goto L_0x0110
        L_0x009e:
            int r10 = r9.compareTo(r10)
            if (r10 == r4) goto L_0x00ab
            int r9 = r9.compareTo(r3)
            if (r9 == r6) goto L_0x00ab
            r5 = 1
        L_0x00ab:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00b0:
            r0 = 0
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x00ec
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r0)
            java.math.BigDecimal r10 = r2.subtract(r10)
            int r10 = r9.compareTo(r10)
            if (r10 != r6) goto L_0x00e7
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r11.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r11)
            java.math.BigDecimal r10 = r2.add(r10)
            int r9 = r9.compareTo(r10)
            if (r9 != r4) goto L_0x00e7
            r5 = 1
        L_0x00e7:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00ec:
            int r9 = r9.compareTo(r2)
            if (r9 != 0) goto L_0x00f3
            r5 = 1
        L_0x00f3:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00f8:
            int r9 = r9.compareTo(r2)
            if (r9 != r6) goto L_0x00ff
            r5 = 1
        L_0x00ff:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x0104:
            int r9 = r9.compareTo(r2)
            if (r9 != r4) goto L_0x010b
            r5 = 1
        L_0x010b:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x0110:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Fe.a(java.math.BigDecimal, c.b.b.b.d.f.E, double):java.lang.Boolean");
    }

    /* access modifiers changed from: package-private */
    public abstract int a();

    /* access modifiers changed from: package-private */
    public abstract boolean b();
}
