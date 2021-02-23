package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Element;
import org.jsoup.parser.C;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.v  reason: case insensitive filesystem */
class C3397v extends C3403z {
    C3397v(String str, int i) {
        super(str, i, (C3378l) null);
    }

    private boolean b(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.b("body");
        htmlTreeBuilder.a(true);
        return htmlTreeBuilder.a(c2);
    }

    /* access modifiers changed from: package-private */
    public boolean a(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        C3403z zVar;
        C c3 = c2;
        HtmlTreeBuilder htmlTreeBuilder2 = htmlTreeBuilder;
        if (C3403z.b(c2)) {
            htmlTreeBuilder2.a(c2.a());
            return true;
        } else if (c2.g()) {
            htmlTreeBuilder2.a(c2.b());
            return true;
        } else if (c2.h()) {
            htmlTreeBuilder2.a((C3403z) this);
            return true;
        } else {
            if (c2.k()) {
                C.f e2 = c2.e();
                String s = e2.s();
                if (s.equals("html")) {
                    return htmlTreeBuilder2.a(c3, C3403z.InBody);
                }
                if (s.equals("body")) {
                    htmlTreeBuilder2.a(e2);
                    htmlTreeBuilder2.a(false);
                    zVar = C3403z.InBody;
                } else if (s.equals("frameset")) {
                    htmlTreeBuilder2.a(e2);
                    zVar = C3403z.InFrameset;
                } else if (StringUtil.in(s, "base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "title")) {
                    htmlTreeBuilder2.a((C3403z) this);
                    Element m = htmlTreeBuilder.m();
                    htmlTreeBuilder2.g(m);
                    htmlTreeBuilder2.a(c3, C3403z.InHead);
                    htmlTreeBuilder2.j(m);
                    return true;
                } else if (s.equals("head")) {
                    htmlTreeBuilder2.a((C3403z) this);
                    return false;
                }
                htmlTreeBuilder2.b(zVar);
                return true;
            } else if (c2.j() && !StringUtil.in(c2.d().s(), "body", "html")) {
                htmlTreeBuilder2.a((C3403z) this);
                return false;
            }
            b(c2, htmlTreeBuilder);
            return true;
        }
    }
}
