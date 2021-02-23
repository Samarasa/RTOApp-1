package org.jsoup.parser;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.n  reason: case insensitive filesystem */
class C3382n extends C3403z {
    C3382n(String str, int i) {
        super(str, i, (C3378l) null);
    }

    /* access modifiers changed from: package-private */
    public boolean a(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        if (c2.g()) {
            htmlTreeBuilder.a(c2.b());
            return true;
        } else if (c2.h() || C3403z.b(c2) || (c2.k() && c2.e().s().equals("html"))) {
            return htmlTreeBuilder.a(c2, C3403z.InBody);
        } else {
            if (c2.i()) {
                return true;
            }
            htmlTreeBuilder.a((C3403z) this);
            htmlTreeBuilder.b(C3403z.InBody);
            return htmlTreeBuilder.a(c2);
        }
    }
}
