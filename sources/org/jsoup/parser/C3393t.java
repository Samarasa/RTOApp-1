package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Element;
import org.jsoup.parser.C;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.t  reason: case insensitive filesystem */
class C3393t extends C3403z {
    C3393t(String str, int i) {
        super(str, i, (C3378l) null);
    }

    private boolean a(C c2, Va va) {
        va.a("head");
        return va.a(c2);
    }

    /* access modifiers changed from: package-private */
    public boolean a(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        C3403z zVar;
        if (C3403z.b(c2)) {
            htmlTreeBuilder.a(c2.a());
            return true;
        }
        int i = C3388q.f15524a[c2.f15454a.ordinal()];
        if (i == 1) {
            htmlTreeBuilder.a(c2.b());
        } else if (i != 2) {
            if (i == 3) {
                C.f e2 = c2.e();
                String s = e2.s();
                if (s.equals("html")) {
                    return C3403z.InBody.a(c2, htmlTreeBuilder);
                }
                if (StringUtil.in(s, "base", "basefont", "bgsound", "command", "link")) {
                    Element b2 = htmlTreeBuilder.b(e2);
                    if (s.equals("base") && b2.hasAttr("href")) {
                        htmlTreeBuilder.e(b2);
                    }
                } else if (s.equals("meta")) {
                    htmlTreeBuilder.b(e2);
                } else if (s.equals("title")) {
                    C3403z.d(e2, htmlTreeBuilder);
                } else if (StringUtil.in(s, "noframes", "style")) {
                    C3403z.c(e2, htmlTreeBuilder);
                } else if (s.equals("noscript")) {
                    htmlTreeBuilder.a(e2);
                    zVar = C3403z.InHeadNoscript;
                } else if (s.equals("script")) {
                    htmlTreeBuilder.f15511b.d(Ua.ScriptData);
                    htmlTreeBuilder.t();
                    htmlTreeBuilder.b(C3403z.Text);
                    htmlTreeBuilder.a(e2);
                } else if (!s.equals("head")) {
                    return a(c2, (Va) htmlTreeBuilder);
                } else {
                    htmlTreeBuilder.a((C3403z) this);
                    return false;
                }
            } else if (i != 4) {
                return a(c2, (Va) htmlTreeBuilder);
            } else {
                String s2 = c2.d().s();
                if (s2.equals("head")) {
                    htmlTreeBuilder.w();
                    zVar = C3403z.AfterHead;
                } else if (StringUtil.in(s2, "body", "html", "br")) {
                    return a(c2, (Va) htmlTreeBuilder);
                } else {
                    htmlTreeBuilder.a((C3403z) this);
                    return false;
                }
            }
            htmlTreeBuilder.b(zVar);
        } else {
            htmlTreeBuilder.a((C3403z) this);
            return false;
        }
        return true;
    }
}
