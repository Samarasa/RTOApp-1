package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.parser.C;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.b  reason: case insensitive filesystem */
class C3358b extends C3403z {
    C3358b(String str, int i) {
        super(str, i, (C3378l) null);
    }

    /* access modifiers changed from: package-private */
    public boolean a(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        if (C3388q.f15524a[c2.f15454a.ordinal()] != 5) {
            if (htmlTreeBuilder.n().size() > 0) {
                for (String next : htmlTreeBuilder.n()) {
                    if (!C3403z.b(next)) {
                        htmlTreeBuilder.a((C3403z) this);
                        if (StringUtil.in(htmlTreeBuilder.a().nodeName(), "table", "tbody", "tfoot", "thead", "tr")) {
                            htmlTreeBuilder.b(true);
                            C.a aVar = new C.a();
                            aVar.a(next);
                            htmlTreeBuilder.a((C) aVar, C3403z.InBody);
                            htmlTreeBuilder.b(false);
                        } else {
                            C.a aVar2 = new C.a();
                            aVar2.a(next);
                            htmlTreeBuilder.a((C) aVar2, C3403z.InBody);
                        }
                    } else {
                        C.a aVar3 = new C.a();
                        aVar3.a(next);
                        htmlTreeBuilder.a(aVar3);
                    }
                }
                htmlTreeBuilder.u();
            }
            htmlTreeBuilder.b(htmlTreeBuilder.v());
            return htmlTreeBuilder.a(c2);
        }
        C.a a2 = c2.a();
        if (a2.n().equals(C3403z.x)) {
            htmlTreeBuilder.a((C3403z) this);
            return false;
        }
        htmlTreeBuilder.n().add(a2.n());
        return true;
    }
}
