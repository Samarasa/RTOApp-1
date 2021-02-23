package org.jsoup.parser;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.fa  reason: case insensitive filesystem */
class C3367fa extends Ua {
    C3367fa(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        char b2 = aVar.b();
        if (b2 == 0) {
            d2.c((Ua) this);
        } else if (b2 != ' ') {
            if (!(b2 == '\"' || b2 == '\'')) {
                if (b2 != '/') {
                    if (b2 != 65535) {
                        if (b2 != 9 && b2 != 10 && b2 != 12 && b2 != 13) {
                            switch (b2) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    d2.h();
                                    break;
                            }
                        } else {
                            return;
                        }
                    } else {
                        d2.b((Ua) this);
                    }
                    ua = Ua.f15502a;
                } else {
                    ua = Ua.SelfClosingStartTag;
                }
                d2.d(ua);
            }
            d2.c((Ua) this);
            d2.j.r();
            d2.j.a(b2);
            ua = Ua.AttributeName;
            d2.d(ua);
        } else {
            return;
        }
        d2.j.r();
        aVar.q();
        ua = Ua.AttributeName;
        d2.d(ua);
    }
}
