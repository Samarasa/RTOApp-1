package org.jsoup.parser;

import org.jsoup.helper.StringUtil;

/* 'enum' modifier removed */
class r extends C3403z {
    r(String str, int i) {
        super(str, i, (C3378l) null);
    }

    private boolean b(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.k("html");
        htmlTreeBuilder.b(C3403z.BeforeHead);
        return htmlTreeBuilder.a(c2);
    }

    /* access modifiers changed from: package-private */
    public boolean a(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        if (c2.h()) {
            htmlTreeBuilder.a((C3403z) this);
            return false;
        }
        if (c2.g()) {
            htmlTreeBuilder.a(c2.b());
        } else if (C3403z.b(c2)) {
            return true;
        } else {
            if (c2.k() && c2.e().s().equals("html")) {
                htmlTreeBuilder.a(c2.e());
                htmlTreeBuilder.b(C3403z.BeforeHead);
            } else if (c2.j() && StringUtil.in(c2.d().s(), "head", "body", "html", "br")) {
                return b(c2, htmlTreeBuilder);
            } else {
                if (!c2.j()) {
                    return b(c2, htmlTreeBuilder);
                }
                htmlTreeBuilder.a((C3403z) this);
                return false;
            }
        }
        return true;
    }
}
