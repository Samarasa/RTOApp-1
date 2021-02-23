package org.jsoup.parser;

import org.jsoup.parser.C;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.d  reason: case insensitive filesystem */
class C3362d extends C3403z {
    C3362d(String str, int i) {
        super(str, i, (C3378l) null);
    }

    private boolean a(C c2, Va va) {
        if (va.a("colgroup")) {
            return va.a(c2);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean a(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        if (C3403z.b(c2)) {
            htmlTreeBuilder.a(c2.a());
            return true;
        }
        int i = C3388q.f15524a[c2.f15454a.ordinal()];
        if (i == 1) {
            htmlTreeBuilder.a(c2.b());
        } else if (i == 2) {
            htmlTreeBuilder.a((C3403z) this);
        } else if (i == 3) {
            C.f e2 = c2.e();
            String s = e2.s();
            if (s.equals("html")) {
                return htmlTreeBuilder.a(c2, C3403z.InBody);
            }
            if (!s.equals("col")) {
                return a(c2, (Va) htmlTreeBuilder);
            }
            htmlTreeBuilder.b(e2);
        } else if (i != 4) {
            if (i != 6) {
                return a(c2, (Va) htmlTreeBuilder);
            }
            if (htmlTreeBuilder.a().nodeName().equals("html")) {
                return true;
            }
            return a(c2, (Va) htmlTreeBuilder);
        } else if (!c2.d().s().equals("colgroup")) {
            return a(c2, (Va) htmlTreeBuilder);
        } else {
            if (htmlTreeBuilder.a().nodeName().equals("html")) {
                htmlTreeBuilder.a((C3403z) this);
                return false;
            }
            htmlTreeBuilder.w();
            htmlTreeBuilder.b(C3403z.InTable);
        }
        return true;
    }
}
