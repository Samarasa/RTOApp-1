package org.jsoup.nodes;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.CharEncoding;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.parser.Parser;

public class Entities {

    /* renamed from: a  reason: collision with root package name */
    private static Pattern f15426a = Pattern.compile("^(\\w+)=(\\w+)(?:,(\\w+))?;(\\w+)$");

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<String, String> f15427b = new HashMap<>();

    public enum EscapeMode {
        xhtml("entities-xhtml.properties", 4),
        base("entities-base.properties", 106),
        extended("entities-full.properties", 2125);
        
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String[] f15429b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int[] f15430c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int[] f15431d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public String[] f15432e;

        private EscapeMode(String str, int i) {
            Entities.b(this, str, i);
        }

        /* access modifiers changed from: package-private */
        public int a(String str) {
            int binarySearch = Arrays.binarySearch(this.f15429b, str);
            if (binarySearch >= 0) {
                return this.f15430c[binarySearch];
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public String a(int i) {
            int binarySearch = Arrays.binarySearch(this.f15431d, i);
            if (binarySearch < 0) {
                return BuildConfig.FLAVOR;
            }
            String[] strArr = this.f15432e;
            if (binarySearch < strArr.length - 1) {
                int i2 = binarySearch + 1;
                if (this.f15431d[i2] == i) {
                    return strArr[i2];
                }
            }
            return this.f15432e[binarySearch];
        }
    }

    private enum a {
        ascii,
        utf,
        fallback;

        /* access modifiers changed from: private */
        public static a b(String str) {
            return str.equals(CharEncoding.US_ASCII) ? ascii : str.startsWith("UTF-") ? utf : fallback;
        }
    }

    private Entities() {
    }

    static String a(String str) {
        return a(str, false);
    }

    static String a(String str, boolean z) {
        return Parser.unescapeEntities(str, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        if (a(r1, r8, r12) != false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0093, code lost:
        if (r12.canEncode(r8) != false) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(java.lang.Appendable r10, java.lang.String r11, org.jsoup.nodes.Document.OutputSettings r12, boolean r13, boolean r14, boolean r15) {
        /*
            org.jsoup.nodes.Entities$EscapeMode r0 = r12.escapeMode()
            java.nio.charset.CharsetEncoder r12 = r12.a()
            java.nio.charset.Charset r1 = r12.charset()
            java.lang.String r1 = r1.name()
            org.jsoup.nodes.Entities$a r1 = org.jsoup.nodes.Entities.a.b(r1)
            int r2 = r11.length()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x001c:
            if (r4 >= r2) goto L_0x009c
            int r7 = r11.codePointAt(r4)
            r8 = 1
            if (r14 == 0) goto L_0x003c
            boolean r9 = org.jsoup.helper.StringUtil.isWhitespace(r7)
            if (r9 == 0) goto L_0x003a
            if (r15 == 0) goto L_0x002f
            if (r5 == 0) goto L_0x0096
        L_0x002f:
            if (r6 == 0) goto L_0x0033
            goto L_0x0096
        L_0x0033:
            r6 = 32
            r10.append(r6)
            r6 = 1
            goto L_0x0096
        L_0x003a:
            r5 = 1
            r6 = 0
        L_0x003c:
            r8 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r8) goto L_0x0086
            char r8 = (char) r7
            r9 = 34
            if (r8 == r9) goto L_0x0081
            r9 = 38
            if (r8 == r9) goto L_0x007b
            r9 = 60
            if (r8 == r9) goto L_0x0072
            r9 = 62
            if (r8 == r9) goto L_0x006d
            r9 = 160(0xa0, float:2.24E-43)
            if (r8 == r9) goto L_0x0063
            boolean r9 = a((org.jsoup.nodes.Entities.a) r1, (char) r8, (java.nio.charset.CharsetEncoder) r12)
            if (r9 == 0) goto L_0x005f
        L_0x005b:
            r10.append(r8)
            goto L_0x0096
        L_0x005f:
            a((java.lang.Appendable) r10, (org.jsoup.nodes.Entities.EscapeMode) r0, (int) r7)
            goto L_0x0096
        L_0x0063:
            org.jsoup.nodes.Entities$EscapeMode r8 = org.jsoup.nodes.Entities.EscapeMode.xhtml
            if (r0 == r8) goto L_0x006a
            java.lang.String r8 = "&nbsp;"
            goto L_0x007d
        L_0x006a:
            java.lang.String r8 = "&#xa0;"
            goto L_0x007d
        L_0x006d:
            if (r13 != 0) goto L_0x005b
            java.lang.String r8 = "&gt;"
            goto L_0x007d
        L_0x0072:
            if (r13 == 0) goto L_0x0078
            org.jsoup.nodes.Entities$EscapeMode r9 = org.jsoup.nodes.Entities.EscapeMode.xhtml
            if (r0 != r9) goto L_0x005b
        L_0x0078:
            java.lang.String r8 = "&lt;"
            goto L_0x007d
        L_0x007b:
            java.lang.String r8 = "&amp;"
        L_0x007d:
            r10.append(r8)
            goto L_0x0096
        L_0x0081:
            if (r13 == 0) goto L_0x005b
            java.lang.String r8 = "&quot;"
            goto L_0x007d
        L_0x0086:
            java.lang.String r8 = new java.lang.String
            char[] r9 = java.lang.Character.toChars(r7)
            r8.<init>(r9)
            boolean r9 = r12.canEncode(r8)
            if (r9 == 0) goto L_0x005f
            goto L_0x007d
        L_0x0096:
            int r7 = java.lang.Character.charCount(r7)
            int r4 = r4 + r7
            goto L_0x001c
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.Entities.a(java.lang.Appendable, java.lang.String, org.jsoup.nodes.Document$OutputSettings, boolean, boolean, boolean):void");
    }

    private static void a(Appendable appendable, EscapeMode escapeMode, int i) {
        Appendable appendable2;
        String a2 = escapeMode.a(i);
        if (a2 != BuildConfig.FLAVOR) {
            appendable2 = appendable.append('&');
        } else {
            appendable2 = appendable.append("&#x");
            a2 = Integer.toHexString(i);
        }
        appendable2.append(a2).append(';');
    }

    private static boolean a(a aVar, char c2, CharsetEncoder charsetEncoder) {
        int i = c.f15450a[aVar.ordinal()];
        if (i == 1) {
            return c2 < 128;
        }
        if (i != 2) {
            return charsetEncoder.canEncode(c2);
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static void b(EscapeMode escapeMode, String str, int i) {
        String[] unused = escapeMode.f15429b = new String[i];
        int[] unused2 = escapeMode.f15430c = new int[i];
        int[] unused3 = escapeMode.f15431d = new int[i];
        String[] unused4 = escapeMode.f15432e = new String[i];
        InputStream resourceAsStream = Entities.class.getResourceAsStream(str);
        if (resourceAsStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream));
            int i2 = 0;
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        Matcher matcher = f15426a.matcher(readLine);
                        if (matcher.find()) {
                            String group = matcher.group(1);
                            int parseInt = Integer.parseInt(matcher.group(2), 36);
                            int parseInt2 = matcher.group(3) != null ? Integer.parseInt(matcher.group(3), 36) : -1;
                            int parseInt3 = Integer.parseInt(matcher.group(4), 36);
                            escapeMode.f15429b[i2] = group;
                            escapeMode.f15430c[i2] = parseInt;
                            escapeMode.f15431d[parseInt3] = parseInt;
                            escapeMode.f15432e[parseInt3] = group;
                            if (parseInt2 != -1) {
                                f15427b.put(group, new String(new int[]{parseInt, parseInt2}, 0, 2));
                            }
                            i2++;
                        }
                    } else {
                        bufferedReader.close();
                        return;
                    }
                } catch (IOException unused5) {
                    throw new IllegalStateException("Error reading resource " + str);
                }
            }
        } else {
            throw new IllegalStateException("Could not read resource " + str + ". Make sure you copy resources for " + Entities.class.getCanonicalName());
        }
    }

    public static int codepointsForName(String str, int[] iArr) {
        String str2 = f15427b.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int a2 = EscapeMode.extended.a(str);
        if (a2 == -1) {
            return 0;
        }
        iArr[0] = a2;
        return 1;
    }

    public static String getByName(String str) {
        String str2 = f15427b.get(str);
        if (str2 != null) {
            return str2;
        }
        int a2 = EscapeMode.extended.a(str);
        if (a2 == -1) {
            return BuildConfig.FLAVOR;
        }
        return new String(new int[]{a2}, 0, 1);
    }

    public static Character getCharacterByName(String str) {
        return Character.valueOf((char) EscapeMode.extended.a(str));
    }

    public static boolean isBaseNamedEntity(String str) {
        return EscapeMode.base.a(str) != -1;
    }

    public static boolean isNamedEntity(String str) {
        return EscapeMode.extended.a(str) != -1;
    }
}
