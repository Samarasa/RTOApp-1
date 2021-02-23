package org.jsoup.parser;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.m  reason: case insensitive filesystem */
class C3380m extends C3403z {
    C3380m(String str, int i) {
        super(str, i, (C3378l) null);
    }

    /* access modifiers changed from: package-private */
    public boolean a(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        C3403z zVar;
        if (C3403z.b(c2)) {
            htmlTreeBuilder.a(c2.a());
            return true;
        } else if (c2.g()) {
            htmlTreeBuilder.a(c2.b());
            return true;
        } else if (c2.h()) {
            htmlTreeBuilder.a((C3403z) this);
            return false;
        } else {
            if (c2.k() && c2.e().s().equals("html")) {
                zVar = C3403z.InBody;
            } else if (c2.j() && c2.d().s().equals("html")) {
                htmlTreeBuilder.b(C3403z.AfterAfterFrameset);
                return true;
            } else if (c2.k() && c2.e().s().equals("noframes")) {
                zVar = C3403z.InHead;
            } else if (c2.i()) {
                return true;
            } else {
                htmlTreeBuilder.a((C3403z) this);
                return false;
            }
            return htmlTreeBuilder.a(c2, zVar);
        }
    }
}
