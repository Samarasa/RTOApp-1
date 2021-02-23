package org.jsoup.parser;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Arrays;
import java.util.Locale;
import org.jsoup.helper.Validate;

/* renamed from: org.jsoup.parser.a  reason: case insensitive filesystem */
final class C3356a {

    /* renamed from: a  reason: collision with root package name */
    private final char[] f15519a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15520b;

    /* renamed from: c  reason: collision with root package name */
    private int f15521c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f15522d = 0;

    /* renamed from: e  reason: collision with root package name */
    private final String[] f15523e = new String[512];

    C3356a(String str) {
        Validate.notNull(str);
        this.f15519a = str.toCharArray();
        this.f15520b = this.f15519a.length;
    }

    private String a(int i, int i2) {
        char[] cArr = this.f15519a;
        String[] strArr = this.f15523e;
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        int i3 = 0;
        int i4 = i;
        int i5 = 0;
        while (i3 < i2) {
            i5 = (i5 * 31) + cArr[i4];
            i3++;
            i4++;
        }
        int length = (strArr.length - 1) & i5;
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i, i2);
            strArr[length] = str2;
            return str2;
        } else if (a(i, i2, str)) {
            return str;
        } else {
            String str3 = new String(cArr, i, i2);
            strArr[length] = str3;
            return str3;
        }
    }

    /* access modifiers changed from: package-private */
    public int a(CharSequence charSequence) {
        char charAt = charSequence.charAt(0);
        int i = this.f15521c;
        while (i < this.f15520b) {
            if (charAt != this.f15519a[i]) {
                do {
                    i++;
                    if (i >= this.f15520b) {
                        break;
                    }
                } while (charAt == this.f15519a[i]);
            }
            int i2 = i + 1;
            int length = (charSequence.length() + i2) - 1;
            int i3 = this.f15520b;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                int i5 = 1;
                while (i4 < length && charSequence.charAt(i5) == this.f15519a[i4]) {
                    i4++;
                    i5++;
                }
                if (i4 == length) {
                    return i - this.f15521c;
                }
            }
            i = i2;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public String a(char c2) {
        int c3 = c(c2);
        if (c3 == -1) {
            return i();
        }
        String a2 = a(this.f15521c, c3);
        this.f15521c += c3;
        return a2;
    }

    /* access modifiers changed from: package-private */
    public String a(String str) {
        int a2 = a((CharSequence) str);
        if (a2 == -1) {
            return i();
        }
        String a3 = a(this.f15521c, a2);
        this.f15521c += a2;
        return a3;
    }

    /* access modifiers changed from: package-private */
    public String a(char... cArr) {
        int i = this.f15521c;
        int i2 = this.f15520b;
        char[] cArr2 = this.f15519a;
        loop0:
        while (this.f15521c < i2) {
            for (char c2 : cArr) {
                if (cArr2[this.f15521c] == c2) {
                    break loop0;
                }
            }
            this.f15521c++;
        }
        int i3 = this.f15521c;
        return i3 > i ? a(i, i3 - i) : BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f15521c++;
    }

    /* access modifiers changed from: package-private */
    public boolean a(int i, int i2, String str) {
        if (i2 != str.length()) {
            return false;
        }
        char[] cArr = this.f15519a;
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 == 0) {
                return true;
            }
            int i5 = i + 1;
            int i6 = i3 + 1;
            if (cArr[i] != str.charAt(i3)) {
                return false;
            }
            i = i5;
            i2 = i4;
            i3 = i6;
        }
    }

    /* access modifiers changed from: package-private */
    public char b() {
        int i = this.f15521c;
        char c2 = i >= this.f15520b ? 65535 : this.f15519a[i];
        this.f15521c++;
        return c2;
    }

    /* access modifiers changed from: package-private */
    public String b(char... cArr) {
        int i = this.f15521c;
        int i2 = this.f15520b;
        char[] cArr2 = this.f15519a;
        while (true) {
            int i3 = this.f15521c;
            if (i3 >= i2 || Arrays.binarySearch(cArr, cArr2[i3]) >= 0) {
                int i4 = this.f15521c;
            } else {
                this.f15521c++;
            }
        }
        int i42 = this.f15521c;
        return i42 > i ? a(i, i42 - i) : BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: package-private */
    public boolean b(char c2) {
        return !k() && this.f15519a[this.f15521c] == c2;
    }

    /* access modifiers changed from: package-private */
    public boolean b(String str) {
        return a((CharSequence) str.toLowerCase(Locale.ENGLISH)) > -1 || a((CharSequence) str.toUpperCase(Locale.ENGLISH)) > -1;
    }

    /* access modifiers changed from: package-private */
    public int c(char c2) {
        for (int i = this.f15521c; i < this.f15520b; i++) {
            if (c2 == this.f15519a[i]) {
                return i - this.f15521c;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public String c() {
        char c2;
        int i = this.f15521c;
        int i2 = this.f15520b;
        char[] cArr = this.f15519a;
        while (true) {
            int i3 = this.f15521c;
            if (i3 >= i2 || (c2 = cArr[i3]) == '&' || c2 == '<' || c2 == 0) {
                int i4 = this.f15521c;
            } else {
                this.f15521c = i3 + 1;
            }
        }
        int i42 = this.f15521c;
        return i42 > i ? a(i, i42 - i) : BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: package-private */
    public boolean c(String str) {
        if (!e(str)) {
            return false;
        }
        this.f15521c += str.length();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean c(char... cArr) {
        if (k()) {
            return false;
        }
        char c2 = this.f15519a[this.f15521c];
        for (char c3 : cArr) {
            if (c3 == c2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        char c2;
        int i = this.f15521c;
        while (true) {
            int i2 = this.f15521c;
            if (i2 < this.f15520b && (c2 = this.f15519a[i2]) >= '0' && c2 <= '9') {
                this.f15521c = i2 + 1;
            }
        }
        return a(i, this.f15521c - i);
    }

    /* access modifiers changed from: package-private */
    public boolean d(String str) {
        if (!f(str)) {
            return false;
        }
        this.f15521c += str.length();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean d(char[] cArr) {
        return !k() && Arrays.binarySearch(cArr, this.f15519a[this.f15521c]) >= 0;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        char c2;
        int i = this.f15521c;
        while (true) {
            int i2 = this.f15521c;
            if (i2 < this.f15520b && (((c2 = this.f15519a[i2]) >= '0' && c2 <= '9') || ((c2 >= 'A' && c2 <= 'F') || (c2 >= 'a' && c2 <= 'f')))) {
                this.f15521c++;
            }
        }
        return a(i, this.f15521c - i);
    }

    /* access modifiers changed from: package-private */
    public boolean e(String str) {
        int length = str.length();
        if (length > this.f15520b - this.f15521c) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != this.f15519a[this.f15521c + i]) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public String f() {
        char c2;
        int i = this.f15521c;
        while (true) {
            int i2 = this.f15521c;
            if (i2 < this.f15520b && (((c2 = this.f15519a[i2]) >= 'A' && c2 <= 'Z') || ((c2 >= 'a' && c2 <= 'z') || Character.isLetter(c2)))) {
                this.f15521c++;
            }
        }
        return a(i, this.f15521c - i);
    }

    /* access modifiers changed from: package-private */
    public boolean f(String str) {
        int length = str.length();
        if (length > this.f15520b - this.f15521c) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.f15519a[this.f15521c + i])) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public String g() {
        char c2;
        int i = this.f15521c;
        while (true) {
            int i2 = this.f15521c;
            if (i2 < this.f15520b && (((c2 = this.f15519a[i2]) >= 'A' && c2 <= 'Z') || ((c2 >= 'a' && c2 <= 'z') || Character.isLetter(c2)))) {
                this.f15521c++;
            }
        }
        while (!k() && (r1 = this.f15519a[r2]) >= '0' && r1 <= '9') {
            this.f15521c = (r2 = this.f15521c) + 1;
        }
        return a(i, this.f15521c - i);
    }

    /* access modifiers changed from: package-private */
    public String h() {
        char c2;
        int i = this.f15521c;
        int i2 = this.f15520b;
        char[] cArr = this.f15519a;
        while (true) {
            int i3 = this.f15521c;
            if (i3 >= i2 || (c2 = cArr[i3]) == 9 || c2 == 10 || c2 == 13 || c2 == 12 || c2 == ' ' || c2 == '/' || c2 == '>' || c2 == 0) {
                int i4 = this.f15521c;
            } else {
                this.f15521c = i3 + 1;
            }
        }
        int i42 = this.f15521c;
        return i42 > i ? a(i, i42 - i) : BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: package-private */
    public String i() {
        int i = this.f15521c;
        String a2 = a(i, this.f15520b - i);
        this.f15521c = this.f15520b;
        return a2;
    }

    /* access modifiers changed from: package-private */
    public char j() {
        int i = this.f15521c;
        if (i >= this.f15520b) {
            return 65535;
        }
        return this.f15519a[i];
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.f15521c >= this.f15520b;
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.f15522d = this.f15521c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r3.f15519a[r3.f15521c];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m() {
        /*
            r3 = this;
            boolean r0 = r3.k()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            char[] r0 = r3.f15519a
            int r2 = r3.f15521c
            char r0 = r0[r2]
            r2 = 48
            if (r0 < r2) goto L_0x0017
            r2 = 57
            if (r0 > r2) goto L_0x0017
            r1 = 1
        L_0x0017:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.C3356a.m():boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        if (k()) {
            return false;
        }
        char c2 = this.f15519a[this.f15521c];
        return (c2 >= 'A' && c2 <= 'Z') || (c2 >= 'a' && c2 <= 'z') || Character.isLetter(c2);
    }

    /* access modifiers changed from: package-private */
    public int o() {
        return this.f15521c;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        this.f15521c = this.f15522d;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.f15521c--;
    }

    public String toString() {
        char[] cArr = this.f15519a;
        int i = this.f15521c;
        return new String(cArr, i, this.f15520b - i);
    }
}
