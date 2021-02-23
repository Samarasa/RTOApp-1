package org.jsoup.parser;

import java.util.HashMap;
import java.util.Map;
import org.jsoup.helper.Validate;

public class Tag {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Tag> f15492a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f15493b = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "s", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f15494c = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi"};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f15495d = {"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f15496e = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f15497f = {"pre", "plaintext", "title", "textarea"};

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f15498g = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f15499h = {"input", "keygen", "object", "select", "textarea"};
    private String i;
    private boolean j = true;
    private boolean k = true;
    private boolean l = true;
    private boolean m = true;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private boolean q = false;
    private boolean r = false;

    static {
        for (String tag : f15493b) {
            a(new Tag(tag));
        }
        for (String tag2 : f15494c) {
            Tag tag3 = new Tag(tag2);
            tag3.j = false;
            tag3.l = false;
            tag3.k = false;
            a(tag3);
        }
        for (String str : f15495d) {
            Tag tag4 = f15492a.get(str);
            Validate.notNull(tag4);
            tag4.l = false;
            tag4.m = false;
            tag4.n = true;
        }
        for (String str2 : f15496e) {
            Tag tag5 = f15492a.get(str2);
            Validate.notNull(tag5);
            tag5.k = false;
        }
        for (String str3 : f15497f) {
            Tag tag6 = f15492a.get(str3);
            Validate.notNull(tag6);
            tag6.p = true;
        }
        for (String str4 : f15498g) {
            Tag tag7 = f15492a.get(str4);
            Validate.notNull(tag7);
            tag7.q = true;
        }
        for (String str5 : f15499h) {
            Tag tag8 = f15492a.get(str5);
            Validate.notNull(tag8);
            tag8.r = true;
        }
    }

    private Tag(String str) {
        this.i = str;
    }

    private static void a(Tag tag) {
        f15492a.put(tag.i, tag);
    }

    public static boolean isKnownTag(String str) {
        return f15492a.containsKey(str);
    }

    public static Tag valueOf(String str) {
        return valueOf(str, ParseSettings.preserveCase);
    }

    public static Tag valueOf(String str, ParseSettings parseSettings) {
        Validate.notNull(str);
        Tag tag = f15492a.get(str);
        if (tag != null) {
            return tag;
        }
        String a2 = parseSettings.a(str);
        Validate.notEmpty(a2);
        Tag tag2 = f15492a.get(a2);
        if (tag2 != null) {
            return tag2;
        }
        Tag tag3 = new Tag(a2);
        tag3.j = false;
        tag3.l = true;
        return tag3;
    }

    /* access modifiers changed from: package-private */
    public Tag a() {
        this.o = true;
        return this;
    }

    public boolean canContainBlock() {
        return this.l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) obj;
        return this.i.equals(tag.i) && this.l == tag.l && this.m == tag.m && this.n == tag.n && this.k == tag.k && this.j == tag.j && this.p == tag.p && this.o == tag.o && this.q == tag.q && this.r == tag.r;
    }

    public boolean formatAsBlock() {
        return this.k;
    }

    public String getName() {
        return this.i;
    }

    public int hashCode() {
        return (((((((((((((((((this.i.hashCode() * 31) + (this.j ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31) + (this.n ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31) + (this.p ? 1 : 0)) * 31) + (this.q ? 1 : 0)) * 31) + (this.r ? 1 : 0);
    }

    public boolean isBlock() {
        return this.j;
    }

    public boolean isData() {
        return !this.m && !isEmpty();
    }

    public boolean isEmpty() {
        return this.n;
    }

    public boolean isFormListed() {
        return this.q;
    }

    public boolean isFormSubmittable() {
        return this.r;
    }

    public boolean isInline() {
        return !this.j;
    }

    public boolean isKnownTag() {
        return f15492a.containsKey(this.i);
    }

    public boolean isSelfClosing() {
        return this.n || this.o;
    }

    public boolean preserveWhitespace() {
        return this.p;
    }

    public String toString() {
        return this.i;
    }
}
