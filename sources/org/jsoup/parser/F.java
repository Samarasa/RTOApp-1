package org.jsoup.parser;

import org.jsoup.parser.C;

/* 'enum' modifier removed */
class F extends Ua {
    F(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        if (aVar.b('/')) {
            d2.e();
            d2.a(Ua.RCDATAEndTagOpen);
            return;
        }
        if (aVar.n() && d2.b() != null) {
            if (!aVar.b("</" + d2.b())) {
                C.g a2 = d2.a(false);
                a2.d(d2.b());
                d2.j = a2;
                d2.h();
                aVar.q();
                ua = Ua.f15502a;
                d2.d(ua);
            }
        }
        d2.a("<");
        ua = Ua.Rcdata;
        d2.d(ua);
    }
}
