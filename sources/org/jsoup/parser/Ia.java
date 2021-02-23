package org.jsoup.parser;

/* 'enum' modifier removed */
class Ia extends Ua {
    Ia(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        char b2 = aVar.b();
        if (b2 != 9 && b2 != 10 && b2 != 12 && b2 != 13 && b2 != ' ') {
            if (b2 == '\"') {
                d2.c((Ua) this);
                ua = Ua.DoctypeSystemIdentifier_doubleQuoted;
            } else if (b2 != '\'') {
                if (b2 != '>') {
                    if (b2 != 65535) {
                        d2.c((Ua) this);
                        d2.n.f15461e = true;
                        ua = Ua.BogusDoctype;
                    } else {
                        d2.b((Ua) this);
                        d2.n.f15461e = true;
                    }
                }
                d2.g();
                ua = Ua.f15502a;
            } else {
                d2.c((Ua) this);
                ua = Ua.DoctypeSystemIdentifier_singleQuoted;
            }
            d2.d(ua);
        }
    }
}
