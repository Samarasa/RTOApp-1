package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.parser.C;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.e  reason: case insensitive filesystem */
class C3364e extends C3403z {
    C3364e(String str, int i) {
        super(str, i, (C3378l) null);
    }

    private boolean b(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        return htmlTreeBuilder.a(c2, C3403z.InTable);
    }

    private boolean c(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        if (htmlTreeBuilder.j("tbody") || htmlTreeBuilder.j("thead") || htmlTreeBuilder.h("tfoot")) {
            htmlTreeBuilder.e();
            htmlTreeBuilder.a(htmlTreeBuilder.a().nodeName());
            return htmlTreeBuilder.a(c2);
        }
        htmlTreeBuilder.a((C3403z) this);
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean a(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        C3403z zVar;
        int i = C3388q.f15524a[c2.f15454a.ordinal()];
        if (i == 3) {
            C.f e2 = c2.e();
            String s = e2.s();
            if (s.equals("tr")) {
                htmlTreeBuilder.e();
                htmlTreeBuilder.a(e2);
                zVar = C3403z.InRow;
            } else if (!StringUtil.in(s, "th", "td")) {
                return StringUtil.in(s, "caption", "col", "colgroup", "tbody", "tfoot", "thead") ? c(c2, htmlTreeBuilder) : b(c2, htmlTreeBuilder);
            } else {
                htmlTreeBuilder.a((C3403z) this);
                htmlTreeBuilder.b("tr");
                return htmlTreeBuilder.a((C) e2);
            }
        } else if (i != 4) {
            return b(c2, htmlTreeBuilder);
        } else {
            String s2 = c2.d().s();
            if (StringUtil.in(s2, "tbody", "tfoot", "thead")) {
                if (!htmlTreeBuilder.j(s2)) {
                    htmlTreeBuilder.a((C3403z) this);
                    return false;
                }
                htmlTreeBuilder.e();
                htmlTreeBuilder.w();
                zVar = C3403z.InTable;
            } else if (s2.equals("table")) {
                return c(c2, htmlTreeBuilder);
            } else {
                if (!StringUtil.in(s2, "body", "caption", "col", "colgroup", "html", "td", "th", "tr")) {
                    return b(c2, htmlTreeBuilder);
                }
                htmlTreeBuilder.a((C3403z) this);
                return false;
            }
        }
        htmlTreeBuilder.b(zVar);
        return true;
    }
}
