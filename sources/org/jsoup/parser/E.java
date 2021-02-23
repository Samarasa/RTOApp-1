package org.jsoup.parser;

/* 'enum' modifier removed */
class E extends Ua {
    E(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        d2.j.c(aVar.h());
        char b2 = aVar.b();
        if (b2 != 0) {
            if (b2 != ' ') {
                if (b2 != '/') {
                    if (b2 == '>') {
                        d2.h();
                    } else if (b2 == 65535) {
                        d2.b((Ua) this);
                    } else if (!(b2 == 9 || b2 == 10 || b2 == 12 || b2 == 13)) {
                        return;
                    }
                    ua = Ua.f15502a;
                } else {
                    ua = Ua.SelfClosingStartTag;
                }
                d2.d(ua);
                return;
            }
            ua = Ua.BeforeAttributeName;
            d2.d(ua);
            return;
        }
        d2.j.c(Ua.ta);
    }
}
