package org.jsoup.parser;

/* 'enum' modifier removed */
class Fa extends Ua {
    Fa(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        StringBuilder sb;
        Ua ua;
        char b2 = aVar.b();
        if (b2 != 0) {
            if (b2 != '\'') {
                if (b2 == '>') {
                    d2.c((Ua) this);
                } else if (b2 != 65535) {
                    sb = d2.n.f15459c;
                } else {
                    d2.b((Ua) this);
                }
                d2.n.f15461e = true;
                d2.g();
                ua = Ua.f15502a;
            } else {
                ua = Ua.AfterDoctypePublicIdentifier;
            }
            d2.d(ua);
            return;
        }
        d2.c((Ua) this);
        sb = d2.n.f15459c;
        b2 = 65533;
        sb.append(b2);
    }
}
