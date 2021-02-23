package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.parser.C;

/* renamed from: org.jsoup.parser.z  reason: case insensitive filesystem */
enum C3403z {
    Initial,
    BeforeHtml,
    BeforeHead,
    InHead,
    InHeadNoscript,
    AfterHead,
    InBody,
    Text,
    InTable,
    InTableText,
    InCaption,
    InColumnGroup,
    InTableBody,
    InRow,
    InCell,
    InSelect,
    InSelectInTable,
    AfterBody,
    InFrameset,
    AfterFrameset,
    AfterAfterBody,
    AfterAfterFrameset,
    ForeignContent;
    
    /* access modifiers changed from: private */
    public static String x;

    /* renamed from: org.jsoup.parser.z$a */
    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final String[] f15533a = null;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f15534b = null;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final String[] f15535c = null;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final String[] f15536d = null;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public static final String[] f15537e = null;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static final String[] f15538f = null;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public static final String[] f15539g = null;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public static final String[] f15540h = null;
        /* access modifiers changed from: private */
        public static final String[] i = null;
        /* access modifiers changed from: private */
        public static final String[] j = null;
        /* access modifiers changed from: private */
        public static final String[] k = null;
        /* access modifiers changed from: private */
        public static final String[] l = null;
        /* access modifiers changed from: private */
        public static final String[] m = null;
        /* access modifiers changed from: private */
        public static final String[] n = null;
        /* access modifiers changed from: private */
        public static final String[] o = null;
        /* access modifiers changed from: private */
        public static final String[] p = null;
        /* access modifiers changed from: private */
        public static final String[] q = null;

        static {
            f15533a = new String[]{"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "title"};
            f15534b = new String[]{"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};
            f15535c = new String[]{"h1", "h2", "h3", "h4", "h5", "h6"};
            f15536d = new String[]{"pre", "listing"};
            f15537e = new String[]{"address", "div", "p"};
            f15538f = new String[]{"dd", "dt"};
            f15539g = new String[]{"b", "big", "code", "em", "font", "i", "s", "small", "strike", "strong", "tt", "u"};
            f15540h = new String[]{"applet", "marquee", "object"};
            i = new String[]{"area", "br", "embed", "img", "keygen", "wbr"};
            j = new String[]{"param", "source", "track"};
            k = new String[]{"name", "action", "prompt"};
            l = new String[]{"optgroup", "option"};
            m = new String[]{"rp", "rt"};
            n = new String[]{"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
            o = new String[]{"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
            p = new String[]{"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
            q = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
        }
    }

    static {
        x = String.valueOf(0);
    }

    /* access modifiers changed from: private */
    public static boolean b(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!StringUtil.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static boolean b(C c2) {
        if (c2.f()) {
            return b(c2.a().n());
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static void c(C.f fVar, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.a(fVar);
        htmlTreeBuilder.f15511b.d(Ua.Rawtext);
        htmlTreeBuilder.t();
        htmlTreeBuilder.b(Text);
    }

    /* access modifiers changed from: private */
    public static void d(C.f fVar, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.a(fVar);
        htmlTreeBuilder.f15511b.d(Ua.Rcdata);
        htmlTreeBuilder.t();
        htmlTreeBuilder.b(Text);
    }

    /* access modifiers changed from: package-private */
    public abstract boolean a(C c2, HtmlTreeBuilder htmlTreeBuilder);
}
