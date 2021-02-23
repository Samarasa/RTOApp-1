package org.jsoup.parser;

import org.jsoup.helper.StringUtil;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.i  reason: case insensitive filesystem */
class C3372i extends C3403z {
    C3372i(String str, int i) {
        super(str, i, (C3378l) null);
    }

    /* access modifiers changed from: package-private */
    public boolean a(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        if (c2.k() && StringUtil.in(c2.e().s(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th")) {
            htmlTreeBuilder.a((C3403z) this);
            htmlTreeBuilder.a("select");
            return htmlTreeBuilder.a(c2);
        } else if (!c2.j() || !StringUtil.in(c2.d().s(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th")) {
            return htmlTreeBuilder.a(c2, C3403z.InSelect);
        } else {
            htmlTreeBuilder.a((C3403z) this);
            if (!htmlTreeBuilder.j(c2.d().s())) {
                return false;
            }
            htmlTreeBuilder.a("select");
            return htmlTreeBuilder.a(c2);
        }
    }
}
