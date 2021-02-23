package org.jsoup.parser;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.x  reason: case insensitive filesystem */
class C3401x extends C3403z {
    C3401x(String str, int i) {
        super(str, i, (C3378l) null);
    }

    /* access modifiers changed from: package-private */
    public boolean a(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        if (c2.f()) {
            htmlTreeBuilder.a(c2.a());
            return true;
        } else if (c2.i()) {
            htmlTreeBuilder.a((C3403z) this);
            htmlTreeBuilder.w();
            htmlTreeBuilder.b(htmlTreeBuilder.v());
            return htmlTreeBuilder.a(c2);
        } else if (!c2.j()) {
            return true;
        } else {
            htmlTreeBuilder.w();
            htmlTreeBuilder.b(htmlTreeBuilder.v());
            return true;
        }
    }
}
