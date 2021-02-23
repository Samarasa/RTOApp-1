package org.jsoup.parser;

import org.jsoup.parser.C;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.k  reason: case insensitive filesystem */
class C3376k extends C3403z {
    C3376k(String str, int i) {
        super(str, i, (C3378l) null);
    }

    /* access modifiers changed from: package-private */
    public boolean a(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        C3403z zVar;
        if (C3403z.b(c2)) {
            htmlTreeBuilder.a(c2.a());
        } else if (c2.g()) {
            htmlTreeBuilder.a(c2.b());
        } else if (c2.h()) {
            htmlTreeBuilder.a((C3403z) this);
            return false;
        } else if (c2.k()) {
            C.f e2 = c2.e();
            String s = e2.s();
            if (s.equals("html")) {
                zVar = C3403z.InBody;
            } else if (s.equals("frameset")) {
                htmlTreeBuilder.a(e2);
            } else if (s.equals("frame")) {
                htmlTreeBuilder.b(e2);
            } else if (s.equals("noframes")) {
                zVar = C3403z.InHead;
            } else {
                htmlTreeBuilder.a((C3403z) this);
                return false;
            }
            return htmlTreeBuilder.a((C) e2, zVar);
        } else if (!c2.j() || !c2.d().s().equals("frameset")) {
            if (!c2.i()) {
                htmlTreeBuilder.a((C3403z) this);
                return false;
            } else if (!htmlTreeBuilder.a().nodeName().equals("html")) {
                htmlTreeBuilder.a((C3403z) this);
            }
        } else if (htmlTreeBuilder.a().nodeName().equals("html")) {
            htmlTreeBuilder.a((C3403z) this);
            return false;
        } else {
            htmlTreeBuilder.w();
            if (!htmlTreeBuilder.r() && !htmlTreeBuilder.a().nodeName().equals("frameset")) {
                htmlTreeBuilder.b(C3403z.AfterFrameset);
            }
        }
        return true;
    }
}
