package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.parser.C;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.l  reason: case insensitive filesystem */
class C3378l extends C3403z {
    C3378l(String str, int i) {
        super(str, i, (C3378l) null);
    }

    /* access modifiers changed from: package-private */
    public boolean a(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        if (C3403z.b(c2)) {
            return true;
        }
        if (c2.g()) {
            htmlTreeBuilder.a(c2.b());
        } else if (c2.h()) {
            C.c c3 = c2.c();
            htmlTreeBuilder.k().appendChild(new DocumentType(htmlTreeBuilder.f15517h.a(c3.n()), c3.o(), c3.p(), htmlTreeBuilder.j()));
            if (c3.q()) {
                htmlTreeBuilder.k().quirksMode(Document.QuirksMode.quirks);
            }
            htmlTreeBuilder.b(C3403z.BeforeHtml);
        } else {
            htmlTreeBuilder.b(C3403z.BeforeHtml);
            return htmlTreeBuilder.a(c2);
        }
        return true;
    }
}
