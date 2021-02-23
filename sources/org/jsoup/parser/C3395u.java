package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.parser.C;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.u  reason: case insensitive filesystem */
class C3395u extends C3403z {
    C3395u(String str, int i) {
        super(str, i, (C3378l) null);
    }

    private boolean b(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.a((C3403z) this);
        C.a aVar = new C.a();
        aVar.a(c2.toString());
        htmlTreeBuilder.a(aVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean a(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        if (c2.h()) {
            htmlTreeBuilder.a((C3403z) this);
            return true;
        } else if (c2.k() && c2.e().s().equals("html")) {
            return htmlTreeBuilder.a(c2, C3403z.InBody);
        } else {
            if (c2.j() && c2.d().s().equals("noscript")) {
                htmlTreeBuilder.w();
                htmlTreeBuilder.b(C3403z.InHead);
                return true;
            } else if (C3403z.b(c2) || c2.g() || (c2.k() && StringUtil.in(c2.e().s(), "basefont", "bgsound", "link", "meta", "noframes", "style"))) {
                return htmlTreeBuilder.a(c2, C3403z.InHead);
            } else {
                if (c2.j() && c2.d().s().equals("br")) {
                    return b(c2, htmlTreeBuilder);
                }
                if ((!c2.k() || !StringUtil.in(c2.e().s(), "head", "noscript")) && !c2.j()) {
                    return b(c2, htmlTreeBuilder);
                }
                htmlTreeBuilder.a((C3403z) this);
                return false;
            }
        }
    }
}
