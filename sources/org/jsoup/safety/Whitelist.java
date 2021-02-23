package org.jsoup.safety;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class Whitelist {

    /* renamed from: a  reason: collision with root package name */
    private Set<d> f15548a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private Map<d, Set<a>> f15549b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Map<d, Map<a, b>> f15550c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private Map<d, Map<a, Set<c>>> f15551d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private boolean f15552e = false;

    static class a extends e {
        a(String str) {
            super(str);
        }

        static a a(String str) {
            return new a(str);
        }
    }

    static class b extends e {
        b(String str) {
            super(str);
        }

        static b a(String str) {
            return new b(str);
        }
    }

    static class c extends e {
        c(String str) {
            super(str);
        }

        static c a(String str) {
            return new c(str);
        }
    }

    static class d extends e {
        d(String str) {
            super(str);
        }

        static d a(String str) {
            return new d(str);
        }
    }

    static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        private String f15553a;

        e(String str) {
            Validate.notNull(str);
            this.f15553a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            String str = this.f15553a;
            if (str == null) {
                if (eVar.f15553a != null) {
                    return false;
                }
            } else if (!str.equals(eVar.f15553a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f15553a;
            return 31 + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return this.f15553a;
        }
    }

    private boolean a(Element element, Attribute attribute, Set<c> set) {
        String absUrl = element.absUrl(attribute.getKey());
        if (absUrl.length() == 0) {
            absUrl = attribute.getValue();
        }
        if (!this.f15552e) {
            attribute.setValue(absUrl);
        }
        for (c eVar : set) {
            String eVar2 = eVar.toString();
            if (!eVar2.equals("#")) {
                if (absUrl.toLowerCase().startsWith(eVar2 + ":")) {
                    return true;
                }
            } else if (c(absUrl)) {
                return true;
            }
        }
        return false;
    }

    public static Whitelist basic() {
        return new Whitelist().addTags("a", "b", "blockquote", "br", "cite", "code", "dd", "dl", "dt", "em", "i", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong", "sub", "sup", "u", "ul").addAttributes("a", "href").addAttributes("blockquote", "cite").addAttributes("q", "cite").addProtocols("a", "href", "ftp", "http", "https", "mailto").addProtocols("blockquote", "cite", "http", "https").addProtocols("cite", "cite", "http", "https").addEnforcedAttribute("a", "rel", "nofollow");
    }

    public static Whitelist basicWithImages() {
        return basic().addTags("img").addAttributes("img", "align", "alt", "height", "src", "title", "width").addProtocols("img", "src", "http", "https");
    }

    private boolean c(String str) {
        return str.startsWith("#") && !str.matches(".*\\s.*");
    }

    public static Whitelist none() {
        return new Whitelist();
    }

    public static Whitelist relaxed() {
        return new Whitelist().addTags("a", "b", "blockquote", "br", "caption", "cite", "code", "col", "colgroup", "dd", "div", "dl", "dt", "em", "h1", "h2", "h3", "h4", "h5", "h6", "i", "img", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong", "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", "u", "ul").addAttributes("a", "href", "title").addAttributes("blockquote", "cite").addAttributes("col", "span", "width").addAttributes("colgroup", "span", "width").addAttributes("img", "align", "alt", "height", "src", "title", "width").addAttributes("ol", "start", "type").addAttributes("q", "cite").addAttributes("table", "summary", "width").addAttributes("td", "abbr", "axis", "colspan", "rowspan", "width").addAttributes("th", "abbr", "axis", "colspan", "rowspan", "scope", "width").addAttributes("ul", "type").addProtocols("a", "href", "ftp", "http", "https", "mailto").addProtocols("blockquote", "cite", "http", "https").addProtocols("cite", "cite", "http", "https").addProtocols("img", "src", "http", "https").addProtocols("q", "cite", "http", "https");
    }

    public static Whitelist simpleText() {
        return new Whitelist().addTags("b", "em", "i", "strong", "u");
    }

    /* access modifiers changed from: package-private */
    public Attributes a(String str) {
        Attributes attributes = new Attributes();
        d a2 = d.a(str);
        if (this.f15550c.containsKey(a2)) {
            for (Map.Entry entry : this.f15550c.get(a2).entrySet()) {
                attributes.put(((a) entry.getKey()).toString(), ((b) entry.getValue()).toString());
            }
        }
        return attributes;
    }

    /* access modifiers changed from: protected */
    public boolean a(String str, Element element, Attribute attribute) {
        d a2 = d.a(str);
        a a3 = a.a(attribute.getKey());
        if (!this.f15549b.containsKey(a2) || !this.f15549b.get(a2).contains(a3)) {
            return !str.equals(":all") && a(":all", element, attribute);
        }
        if (!this.f15551d.containsKey(a2)) {
            return true;
        }
        Map map = this.f15551d.get(a2);
        return !map.containsKey(a3) || a(element, attribute, (Set<c>) (Set) map.get(a3));
    }

    public Whitelist addAttributes(String str, String... strArr) {
        Validate.notEmpty(str);
        Validate.notNull(strArr);
        Validate.isTrue(strArr.length > 0, "No attributes supplied.");
        d a2 = d.a(str);
        if (!this.f15548a.contains(a2)) {
            this.f15548a.add(a2);
        }
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            Validate.notEmpty(str2);
            hashSet.add(a.a(str2));
        }
        if (this.f15549b.containsKey(a2)) {
            this.f15549b.get(a2).addAll(hashSet);
        } else {
            this.f15549b.put(a2, hashSet);
        }
        return this;
    }

    public Whitelist addEnforcedAttribute(String str, String str2, String str3) {
        Validate.notEmpty(str);
        Validate.notEmpty(str2);
        Validate.notEmpty(str3);
        d a2 = d.a(str);
        if (!this.f15548a.contains(a2)) {
            this.f15548a.add(a2);
        }
        a a3 = a.a(str2);
        b a4 = b.a(str3);
        if (this.f15550c.containsKey(a2)) {
            this.f15550c.get(a2).put(a3, a4);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(a3, a4);
            this.f15550c.put(a2, hashMap);
        }
        return this;
    }

    public Whitelist addProtocols(String str, String str2, String... strArr) {
        Map map;
        Set set;
        Validate.notEmpty(str);
        Validate.notEmpty(str2);
        Validate.notNull(strArr);
        d a2 = d.a(str);
        a a3 = a.a(str2);
        if (this.f15551d.containsKey(a2)) {
            map = this.f15551d.get(a2);
        } else {
            HashMap hashMap = new HashMap();
            this.f15551d.put(a2, hashMap);
            map = hashMap;
        }
        if (map.containsKey(a3)) {
            set = (Set) map.get(a3);
        } else {
            HashSet hashSet = new HashSet();
            map.put(a3, hashSet);
            set = hashSet;
        }
        for (String str3 : strArr) {
            Validate.notEmpty(str3);
            set.add(c.a(str3));
        }
        return this;
    }

    public Whitelist addTags(String... strArr) {
        Validate.notNull(strArr);
        for (String str : strArr) {
            Validate.notEmpty(str);
            this.f15548a.add(d.a(str));
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean b(String str) {
        return this.f15548a.contains(d.a(str));
    }

    public Whitelist preserveRelativeLinks(boolean z) {
        this.f15552e = z;
        return this;
    }

    public Whitelist removeAttributes(String str, String... strArr) {
        Validate.notEmpty(str);
        Validate.notNull(strArr);
        Validate.isTrue(strArr.length > 0, "No attributes supplied.");
        d a2 = d.a(str);
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            Validate.notEmpty(str2);
            hashSet.add(a.a(str2));
        }
        if (this.f15548a.contains(a2) && this.f15549b.containsKey(a2)) {
            Set set = this.f15549b.get(a2);
            set.removeAll(hashSet);
            if (set.isEmpty()) {
                this.f15549b.remove(a2);
            }
        }
        if (str.equals(":all")) {
            for (d next : this.f15549b.keySet()) {
                Set set2 = this.f15549b.get(next);
                set2.removeAll(hashSet);
                if (set2.isEmpty()) {
                    this.f15549b.remove(next);
                }
            }
        }
        return this;
    }

    public Whitelist removeEnforcedAttribute(String str, String str2) {
        Validate.notEmpty(str);
        Validate.notEmpty(str2);
        d a2 = d.a(str);
        if (this.f15548a.contains(a2) && this.f15550c.containsKey(a2)) {
            a a3 = a.a(str2);
            Map map = this.f15550c.get(a2);
            map.remove(a3);
            if (map.isEmpty()) {
                this.f15550c.remove(a2);
            }
        }
        return this;
    }

    public Whitelist removeProtocols(String str, String str2, String... strArr) {
        Validate.notEmpty(str);
        Validate.notEmpty(str2);
        Validate.notNull(strArr);
        d a2 = d.a(str);
        a a3 = a.a(str2);
        if (this.f15551d.containsKey(a2)) {
            Map map = this.f15551d.get(a2);
            if (map.containsKey(a3)) {
                Set set = (Set) map.get(a3);
                for (String str3 : strArr) {
                    Validate.notEmpty(str3);
                    set.remove(c.a(str3));
                }
                if (set.isEmpty()) {
                    map.remove(a3);
                    if (map.isEmpty()) {
                        this.f15551d.remove(a2);
                    }
                }
            }
        }
        return this;
    }

    public Whitelist removeTags(String... strArr) {
        Validate.notNull(strArr);
        for (String str : strArr) {
            Validate.notEmpty(str);
            d a2 = d.a(str);
            if (this.f15548a.remove(a2)) {
                this.f15549b.remove(a2);
                this.f15550c.remove(a2);
                this.f15551d.remove(a2);
            }
        }
        return this;
    }
}
