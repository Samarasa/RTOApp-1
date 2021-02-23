package org.jsoup.parser;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.j  reason: case insensitive filesystem */
class C3374j extends C3403z {
    C3374j(String str, int i) {
        super(str, i, (C3378l) null);
    }

    /* access modifiers changed from: package-private */
    public boolean a(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        if (C3403z.b(c2)) {
            return htmlTreeBuilder.a(c2, C3403z.InBody);
        }
        if (c2.g()) {
            htmlTreeBuilder.a(c2.b());
            return true;
        } else if (c2.h()) {
            htmlTreeBuilder.a((C3403z) this);
            return false;
        } else if (c2.k() && c2.e().s().equals("html")) {
            return htmlTreeBuilder.a(c2, C3403z.InBody);
        } else {
            if (!c2.j() || !c2.d().s().equals("html")) {
                if (c2.i()) {
                    return true;
                }
                htmlTreeBuilder.a((C3403z) this);
                htmlTreeBuilder.b(C3403z.InBody);
                return htmlTreeBuilder.a(c2);
            } else if (htmlTreeBuilder.r()) {
                htmlTreeBuilder.a((C3403z) this);
                return false;
            } else {
                htmlTreeBuilder.b(C3403z.AfterAfterBody);
                return true;
            }
        }
    }
}
