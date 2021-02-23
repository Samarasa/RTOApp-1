package org.jsoup.parser;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.na  reason: case insensitive filesystem */
class C3383na extends Ua {
    C3383na(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        char b2 = aVar.b();
        if (!(b2 == 9 || b2 == 10 || b2 == 12 || b2 == 13 || b2 == ' ')) {
            if (b2 != '/') {
                if (b2 == '>') {
                    d2.h();
                } else if (b2 != 65535) {
                    d2.c((Ua) this);
                    aVar.q();
                } else {
                    d2.b((Ua) this);
                }
                ua = Ua.f15502a;
            } else {
                ua = Ua.SelfClosingStartTag;
            }
            d2.d(ua);
        }
        ua = Ua.BeforeAttributeName;
        d2.d(ua);
    }
}
