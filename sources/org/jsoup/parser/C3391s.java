package org.jsoup.parser;

import org.jsoup.helper.StringUtil;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.s  reason: case insensitive filesystem */
class C3391s extends C3403z {
    C3391s(String str, int i) {
        super(str, i, (C3378l) null);
    }

    /* access modifiers changed from: package-private */
    public boolean a(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        if (C3403z.b(c2)) {
            return true;
        }
        if (c2.g()) {
            htmlTreeBuilder.a(c2.b());
        } else if (c2.h()) {
            htmlTreeBuilder.a((C3403z) this);
            return false;
        } else if (c2.k() && c2.e().s().equals("html")) {
            return C3403z.InBody.a(c2, htmlTreeBuilder);
        } else {
            if (c2.k() && c2.e().s().equals("head")) {
                htmlTreeBuilder.k(htmlTreeBuilder.a(c2.e()));
                htmlTreeBuilder.b(C3403z.InHead);
            } else if (c2.j() && StringUtil.in(c2.d().s(), "head", "body", "html", "br")) {
                htmlTreeBuilder.b("head");
                return htmlTreeBuilder.a(c2);
            } else if (c2.j()) {
                htmlTreeBuilder.a((C3403z) this);
                return false;
            } else {
                htmlTreeBuilder.b("head");
                return htmlTreeBuilder.a(c2);
            }
        }
        return true;
    }
}
