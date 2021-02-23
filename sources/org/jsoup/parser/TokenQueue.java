package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;

public class TokenQueue {

    /* renamed from: a  reason: collision with root package name */
    private String f15500a;

    /* renamed from: b  reason: collision with root package name */
    private int f15501b = 0;

    public TokenQueue(String str) {
        Validate.notNull(str);
        this.f15500a = str;
    }

    private int a() {
        return this.f15500a.length() - this.f15501b;
    }

    public static String unescape(String str) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c2 = 0;
        while (i < length) {
            char c3 = charArray[i];
            if (c3 != '\\' || (c2 != 0 && c2 == '\\')) {
                sb.append(c3);
            }
            i++;
            c2 = c3;
        }
        return sb.toString();
    }

    public void addFirst(Character ch) {
        addFirst(ch.toString());
    }

    public void addFirst(String str) {
        this.f15500a = str + this.f15500a.substring(this.f15501b);
        this.f15501b = 0;
    }

    public void advance() {
        if (!isEmpty()) {
            this.f15501b++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067 A[EDGE_INSN: B:32:0x0067->B:28:0x0067 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String chompBalanced(char r9, char r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = -1
            r2 = 0
            r3 = -1
            r4 = 0
            r5 = -1
        L_0x0006:
            boolean r6 = r8.isEmpty()
            if (r6 == 0) goto L_0x000d
            goto L_0x0067
        L_0x000d:
            char r6 = r8.consume()
            java.lang.Character r6 = java.lang.Character.valueOf(r6)
            if (r0 == 0) goto L_0x001b
            r7 = 92
            if (r0 == r7) goto L_0x005b
        L_0x001b:
            r7 = 39
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x0033
            r7 = 34
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x003b
        L_0x0033:
            char r7 = r6.charValue()
            if (r7 == r9) goto L_0x003b
            r2 = r2 ^ 1
        L_0x003b:
            if (r2 == 0) goto L_0x003e
            goto L_0x0065
        L_0x003e:
            java.lang.Character r7 = java.lang.Character.valueOf(r9)
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x004f
            int r4 = r4 + 1
            if (r3 != r1) goto L_0x005b
            int r3 = r8.f15501b
            goto L_0x005b
        L_0x004f:
            java.lang.Character r7 = java.lang.Character.valueOf(r10)
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x005b
            int r4 = r4 + -1
        L_0x005b:
            if (r4 <= 0) goto L_0x0061
            if (r0 == 0) goto L_0x0061
            int r5 = r8.f15501b
        L_0x0061:
            char r0 = r6.charValue()
        L_0x0065:
            if (r4 > 0) goto L_0x0006
        L_0x0067:
            if (r5 < 0) goto L_0x0070
            java.lang.String r9 = r8.f15500a
            java.lang.String r9 = r9.substring(r3, r5)
            goto L_0x0072
        L_0x0070:
            java.lang.String r9 = ""
        L_0x0072:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.TokenQueue.chompBalanced(char, char):java.lang.String");
    }

    public String chompTo(String str) {
        String consumeTo = consumeTo(str);
        matchChomp(str);
        return consumeTo;
    }

    public String chompToIgnoreCase(String str) {
        String consumeToIgnoreCase = consumeToIgnoreCase(str);
        matchChomp(str);
        return consumeToIgnoreCase;
    }

    public char consume() {
        String str = this.f15500a;
        int i = this.f15501b;
        this.f15501b = i + 1;
        return str.charAt(i);
    }

    public void consume(String str) {
        if (matches(str)) {
            int length = str.length();
            if (length <= a()) {
                this.f15501b += length;
                return;
            }
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        throw new IllegalStateException("Queue did not match expected sequence");
    }

    public String consumeAttributeKey() {
        int i = this.f15501b;
        while (!isEmpty() && (matchesWord() || matchesAny('-', '_', ':'))) {
            this.f15501b++;
        }
        return this.f15500a.substring(i, this.f15501b);
    }

    public String consumeCssIdentifier() {
        int i = this.f15501b;
        while (!isEmpty() && (matchesWord() || matchesAny('-', '_'))) {
            this.f15501b++;
        }
        return this.f15500a.substring(i, this.f15501b);
    }

    public String consumeElementSelector() {
        int i = this.f15501b;
        while (!isEmpty() && (matchesWord() || matchesAny("*|", "|", "_", "-"))) {
            this.f15501b++;
        }
        return this.f15500a.substring(i, this.f15501b);
    }

    public String consumeTagName() {
        int i = this.f15501b;
        while (!isEmpty() && (matchesWord() || matchesAny(':', '_', '-'))) {
            this.f15501b++;
        }
        return this.f15500a.substring(i, this.f15501b);
    }

    public String consumeTo(String str) {
        int indexOf = this.f15500a.indexOf(str, this.f15501b);
        if (indexOf == -1) {
            return remainder();
        }
        String substring = this.f15500a.substring(this.f15501b, indexOf);
        this.f15501b += substring.length();
        return substring;
    }

    public String consumeToAny(String... strArr) {
        int i = this.f15501b;
        while (!isEmpty() && !matchesAny(strArr)) {
            this.f15501b++;
        }
        return this.f15500a.substring(i, this.f15501b);
    }

    public String consumeToIgnoreCase(String str) {
        int i;
        int i2;
        int i3 = this.f15501b;
        String substring = str.substring(0, 1);
        boolean equals = substring.toLowerCase().equals(substring.toUpperCase());
        while (!isEmpty() && !matches(str)) {
            if (equals) {
                int indexOf = this.f15500a.indexOf(substring, this.f15501b);
                int i4 = this.f15501b;
                int i5 = indexOf - i4;
                if (i5 == 0) {
                    i2 = i4 + 1;
                } else if (i5 < 0) {
                    i = this.f15500a.length();
                } else {
                    i2 = i4 + i5;
                }
                this.f15501b = i2;
            } else {
                i = this.f15501b + 1;
            }
            this.f15501b = i;
        }
        return this.f15500a.substring(i3, this.f15501b);
    }

    public boolean consumeWhitespace() {
        boolean z = false;
        while (matchesWhitespace()) {
            this.f15501b++;
            z = true;
        }
        return z;
    }

    public String consumeWord() {
        int i = this.f15501b;
        while (matchesWord()) {
            this.f15501b++;
        }
        return this.f15500a.substring(i, this.f15501b);
    }

    public boolean isEmpty() {
        return a() == 0;
    }

    public boolean matchChomp(String str) {
        if (!matches(str)) {
            return false;
        }
        this.f15501b += str.length();
        return true;
    }

    public boolean matches(String str) {
        return this.f15500a.regionMatches(true, this.f15501b, str, 0, str.length());
    }

    public boolean matchesAny(char... cArr) {
        if (isEmpty()) {
            return false;
        }
        for (char c2 : cArr) {
            if (this.f15500a.charAt(this.f15501b) == c2) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesAny(String... strArr) {
        for (String matches : strArr) {
            if (matches(matches)) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesCS(String str) {
        return this.f15500a.startsWith(str, this.f15501b);
    }

    public boolean matchesStartTag() {
        return a() >= 2 && this.f15500a.charAt(this.f15501b) == '<' && Character.isLetter(this.f15500a.charAt(this.f15501b + 1));
    }

    public boolean matchesWhitespace() {
        return !isEmpty() && StringUtil.isWhitespace(this.f15500a.charAt(this.f15501b));
    }

    public boolean matchesWord() {
        return !isEmpty() && Character.isLetterOrDigit(this.f15500a.charAt(this.f15501b));
    }

    public char peek() {
        if (isEmpty()) {
            return 0;
        }
        return this.f15500a.charAt(this.f15501b);
    }

    public String remainder() {
        String str = this.f15500a;
        String substring = str.substring(this.f15501b, str.length());
        this.f15501b = this.f15500a.length();
        return substring;
    }

    public String toString() {
        return this.f15500a.substring(this.f15501b);
    }
}
