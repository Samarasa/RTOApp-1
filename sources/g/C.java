package g;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class C {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f14847a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f14848b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: c  reason: collision with root package name */
    private final String f14849c;

    /* renamed from: d  reason: collision with root package name */
    private final String f14850d;

    /* renamed from: e  reason: collision with root package name */
    private final String f14851e;

    /* renamed from: f  reason: collision with root package name */
    private final String f14852f;

    private C(String str, String str2, String str3, String str4) {
        this.f14849c = str;
        this.f14850d = str2;
        this.f14851e = str3;
        this.f14852f = str4;
    }

    public static C a(String str) {
        Matcher matcher = f14847a.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String lowerCase = matcher.group(1).toLowerCase(Locale.US);
        String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
        Matcher matcher2 = f14848b.matcher(str);
        String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group = matcher2.group(1);
            if (group != null && group.equalsIgnoreCase("charset")) {
                String group2 = matcher2.group(2);
                if (group2 == null) {
                    group2 = matcher2.group(3);
                } else if (group2.startsWith("'") && group2.endsWith("'") && group2.length() > 2) {
                    group2 = group2.substring(1, group2.length() - 1);
                }
                if (str2 != null && !group2.equalsIgnoreCase(str2)) {
                    return null;
                }
                str2 = group2;
            }
        }
        return new C(str, lowerCase, lowerCase2, str2);
    }

    public Charset a(Charset charset) {
        try {
            return this.f14852f != null ? Charset.forName(this.f14852f) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C) && ((C) obj).f14849c.equals(this.f14849c);
    }

    public int hashCode() {
        return this.f14849c.hashCode();
    }

    public String toString() {
        return this.f14849c;
    }
}
