package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.parser.C;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.y  reason: case insensitive filesystem */
class C3402y extends C3403z {
    C3402y(String str, int i) {
        super(str, i, (C3378l) null);
    }

    /* access modifiers changed from: package-private */
    public boolean a(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        C3403z zVar;
        C c3 = c2;
        HtmlTreeBuilder htmlTreeBuilder2 = htmlTreeBuilder;
        if (c2.f()) {
            htmlTreeBuilder.u();
            htmlTreeBuilder.t();
            htmlTreeBuilder2.b(C3403z.InTableText);
            return htmlTreeBuilder2.a(c3);
        } else if (c2.g()) {
            htmlTreeBuilder2.a(c2.b());
            return true;
        } else if (c2.h()) {
            htmlTreeBuilder2.a((C3403z) this);
            return false;
        } else if (c2.k()) {
            C.f e2 = c2.e();
            String s = e2.s();
            if (s.equals("caption")) {
                htmlTreeBuilder.f();
                htmlTreeBuilder.p();
                htmlTreeBuilder2.a(e2);
                zVar = C3403z.InCaption;
            } else if (s.equals("colgroup")) {
                htmlTreeBuilder.f();
                htmlTreeBuilder2.a(e2);
                zVar = C3403z.InColumnGroup;
            } else if (s.equals("col")) {
                htmlTreeBuilder2.b("colgroup");
                return htmlTreeBuilder2.a(c3);
            } else if (StringUtil.in(s, "tbody", "tfoot", "thead")) {
                htmlTreeBuilder.f();
                htmlTreeBuilder2.a(e2);
                zVar = C3403z.InTableBody;
            } else if (StringUtil.in(s, "td", "th", "tr")) {
                htmlTreeBuilder2.b("tbody");
                return htmlTreeBuilder2.a(c3);
            } else {
                if (s.equals("table")) {
                    htmlTreeBuilder2.a((C3403z) this);
                    if (htmlTreeBuilder2.a("table")) {
                        return htmlTreeBuilder2.a(c3);
                    }
                } else if (StringUtil.in(s, "style", "script")) {
                    return htmlTreeBuilder2.a(c3, C3403z.InHead);
                } else {
                    if (s.equals("input")) {
                        if (!e2.j.get("type").equalsIgnoreCase("hidden")) {
                            return b(c2, htmlTreeBuilder);
                        }
                        htmlTreeBuilder2.b(e2);
                    } else if (!s.equals("form")) {
                        return b(c2, htmlTreeBuilder);
                    } else {
                        htmlTreeBuilder2.a((C3403z) this);
                        if (htmlTreeBuilder.l() != null) {
                            return false;
                        }
                        htmlTreeBuilder2.a(e2, false);
                    }
                }
                return true;
            }
            htmlTreeBuilder2.b(zVar);
            return true;
        } else if (c2.j()) {
            String s2 = c2.d().s();
            if (s2.equals("table")) {
                if (!htmlTreeBuilder2.j(s2)) {
                    htmlTreeBuilder2.a((C3403z) this);
                    return false;
                }
                htmlTreeBuilder2.m("table");
                htmlTreeBuilder.z();
                return true;
            } else if (!StringUtil.in(s2, "body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr")) {
                return b(c2, htmlTreeBuilder);
            } else {
                htmlTreeBuilder2.a((C3403z) this);
                return false;
            }
        } else if (!c2.i()) {
            return b(c2, htmlTreeBuilder);
        } else {
            if (htmlTreeBuilder.a().nodeName().equals("html")) {
                htmlTreeBuilder2.a((C3403z) this);
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.a((C3403z) this);
        if (!StringUtil.in(htmlTreeBuilder.a().nodeName(), "table", "tbody", "tfoot", "thead", "tr")) {
            return htmlTreeBuilder.a(c2, C3403z.InBody);
        }
        htmlTreeBuilder.b(true);
        boolean a2 = htmlTreeBuilder.a(c2, C3403z.InBody);
        htmlTreeBuilder.b(false);
        return a2;
    }
}
