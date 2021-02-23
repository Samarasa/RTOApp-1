package org.jsoup.parser;

/* 'enum' modifier removed */
class Na extends Ua {
    Na(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        char b2 = aVar.b();
        if (b2 != 9 && b2 != 10 && b2 != 12 && b2 != 13 && b2 != ' ') {
            if (b2 != '>') {
                if (b2 != 65535) {
                    d2.c((Ua) this);
                    ua = Ua.BogusDoctype;
                    d2.d(ua);
                }
                d2.b((Ua) this);
                d2.n.f15461e = true;
            }
            d2.g();
            ua = Ua.f15502a;
            d2.d(ua);
        }
    }
}
