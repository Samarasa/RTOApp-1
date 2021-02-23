package org.jsoup.parser;

import org.jsoup.helper.StringUtil;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.g  reason: case insensitive filesystem */
class C3368g extends C3403z {
    C3368g(String str, int i) {
        super(str, i, (C3378l) null);
    }

    private void a(HtmlTreeBuilder htmlTreeBuilder) {
        String str = "td";
        if (!htmlTreeBuilder.j(str)) {
            str = "th";
        }
        htmlTreeBuilder.a(str);
    }

    private boolean b(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        return htmlTreeBuilder.a(c2, C3403z.InBody);
    }

    /* access modifiers changed from: package-private */
    public boolean a(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        if (c2.j()) {
            String s = c2.d().s();
            if (StringUtil.in(s, "td", "th")) {
                if (!htmlTreeBuilder.j(s)) {
                    htmlTreeBuilder.a((C3403z) this);
                    htmlTreeBuilder.b(C3403z.InRow);
                    return false;
                }
                htmlTreeBuilder.i();
                if (!htmlTreeBuilder.a().nodeName().equals(s)) {
                    htmlTreeBuilder.a((C3403z) this);
                }
                htmlTreeBuilder.m(s);
                htmlTreeBuilder.d();
                htmlTreeBuilder.b(C3403z.InRow);
                return true;
            } else if (StringUtil.in(s, "body", "caption", "col", "colgroup", "html")) {
                htmlTreeBuilder.a((C3403z) this);
                return false;
            } else if (!StringUtil.in(s, "table", "tbody", "tfoot", "thead", "tr")) {
                return b(c2, htmlTreeBuilder);
            } else {
                if (!htmlTreeBuilder.j(s)) {
                    htmlTreeBuilder.a((C3403z) this);
                    return false;
                }
            }
        } else if (!c2.k() || !StringUtil.in(c2.e().s(), "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr")) {
            return b(c2, htmlTreeBuilder);
        } else {
            if (!htmlTreeBuilder.j("td") && !htmlTreeBuilder.j("th")) {
                htmlTreeBuilder.a((C3403z) this);
                return false;
            }
        }
        a(htmlTreeBuilder);
        return htmlTreeBuilder.a(c2);
    }
}
