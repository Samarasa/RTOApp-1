package org.jsoup.parser;

import org.jsoup.parser.C;

/* 'enum' modifier removed */
class Ra extends Ua {
    Ra(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        char j = aVar.j();
        if (j == 0) {
            d2.c((Ua) this);
            aVar.a();
            d2.a(65533);
        } else if (j != 65535) {
            d2.a(aVar.a(0));
        } else {
            d2.a((C) new C.d());
        }
    }
}
