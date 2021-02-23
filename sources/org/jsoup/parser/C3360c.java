package org.jsoup.parser;

import org.jsoup.helper.StringUtil;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.c  reason: case insensitive filesystem */
class C3360c extends C3403z {
    C3360c(String str, int i) {
        super(str, i, (C3378l) null);
    }

    /* access modifiers changed from: package-private */
    public boolean a(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        if (!c2.j() || !c2.d().s().equals("caption")) {
            if ((c2.k() && StringUtil.in(c2.e().s(), "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr")) || (c2.j() && c2.d().s().equals("table"))) {
                htmlTreeBuilder.a((C3403z) this);
                if (htmlTreeBuilder.a("caption")) {
                    return htmlTreeBuilder.a(c2);
                }
                return true;
            } else if (!c2.j() || !StringUtil.in(c2.d().s(), "body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr")) {
                return htmlTreeBuilder.a(c2, C3403z.InBody);
            } else {
                htmlTreeBuilder.a((C3403z) this);
                return false;
            }
        } else if (!htmlTreeBuilder.j(c2.d().s())) {
            htmlTreeBuilder.a((C3403z) this);
            return false;
        } else {
            htmlTreeBuilder.i();
            if (!htmlTreeBuilder.a().nodeName().equals("caption")) {
                htmlTreeBuilder.a((C3403z) this);
            }
            htmlTreeBuilder.m("caption");
            htmlTreeBuilder.d();
            htmlTreeBuilder.b(C3403z.InTable);
            return true;
        }
    }
}
