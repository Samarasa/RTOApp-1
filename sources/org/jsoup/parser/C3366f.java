package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.parser.C;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.f  reason: case insensitive filesystem */
class C3366f extends C3403z {
    C3366f(String str, int i) {
        super(str, i, (C3378l) null);
    }

    private boolean a(C c2, Va va) {
        if (va.a("tr")) {
            return va.a(c2);
        }
        return false;
    }

    private boolean b(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        return htmlTreeBuilder.a(c2, C3403z.InTable);
    }

    /* access modifiers changed from: package-private */
    public boolean a(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        if (c2.k()) {
            C.f e2 = c2.e();
            String s = e2.s();
            if (!StringUtil.in(s, "th", "td")) {
                return StringUtil.in(s, "caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr") ? a(c2, (Va) htmlTreeBuilder) : b(c2, htmlTreeBuilder);
            }
            htmlTreeBuilder.g();
            htmlTreeBuilder.a(e2);
            htmlTreeBuilder.b(C3403z.InCell);
            htmlTreeBuilder.p();
            return true;
        } else if (!c2.j()) {
            return b(c2, htmlTreeBuilder);
        } else {
            String s2 = c2.d().s();
            if (s2.equals("tr")) {
                if (!htmlTreeBuilder.j(s2)) {
                    htmlTreeBuilder.a((C3403z) this);
                    return false;
                }
                htmlTreeBuilder.g();
                htmlTreeBuilder.w();
                htmlTreeBuilder.b(C3403z.InTableBody);
                return true;
            } else if (s2.equals("table")) {
                return a(c2, (Va) htmlTreeBuilder);
            } else {
                if (StringUtil.in(s2, "tbody", "tfoot", "thead")) {
                    if (!htmlTreeBuilder.j(s2)) {
                        htmlTreeBuilder.a((C3403z) this);
                        return false;
                    }
                    htmlTreeBuilder.a("tr");
                    return htmlTreeBuilder.a(c2);
                } else if (!StringUtil.in(s2, "body", "caption", "col", "colgroup", "html", "td", "th")) {
                    return b(c2, htmlTreeBuilder);
                } else {
                    htmlTreeBuilder.a((C3403z) this);
                    return false;
                }
            }
        }
    }
}
