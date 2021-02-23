package org.jsoup.parser;

/* 'enum' modifier removed */
class Ba extends Ua {
    Ba(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        Ua ua2;
        if (aVar.k()) {
            d2.b((Ua) this);
            d2.n.f15461e = true;
            d2.g();
            d2.d(Ua.f15502a);
        } else if (aVar.c(9, 10, 13, 12, ' ')) {
            aVar.a();
        } else {
            if (aVar.b('>')) {
                d2.g();
                ua = Ua.f15502a;
            } else {
                if (aVar.d("PUBLIC")) {
                    ua2 = Ua.AfterDoctypePublicKeyword;
                } else if (aVar.d("SYSTEM")) {
                    ua2 = Ua.AfterDoctypeSystemKeyword;
                } else {
                    d2.c((Ua) this);
                    d2.n.f15461e = true;
                    ua = Ua.BogusDoctype;
                }
                d2.d(ua2);
                return;
            }
            d2.a(ua);
        }
    }
}
