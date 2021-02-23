package org.jsoup.parser;

import org.jsoup.parser.C;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.ga  reason: case insensitive filesystem */
class C3369ga extends Ua {
    C3369ga(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        C.g gVar;
        Ua ua;
        d2.j.a(aVar.b(Ua.ra));
        char b2 = aVar.b();
        if (b2 != 0) {
            if (b2 != ' ') {
                if (!(b2 == '\"' || b2 == '\'')) {
                    if (b2 != '/') {
                        if (b2 == 65535) {
                            d2.b((Ua) this);
                        } else if (!(b2 == 9 || b2 == 10 || b2 == 12 || b2 == 13)) {
                            switch (b2) {
                                case '<':
                                    break;
                                case '=':
                                    ua = Ua.BeforeAttributeValue;
                                    break;
                                case '>':
                                    d2.h();
                                    break;
                                default:
                                    return;
                            }
                        }
                        ua = Ua.f15502a;
                    } else {
                        ua = Ua.SelfClosingStartTag;
                    }
                    d2.d(ua);
                    return;
                }
                d2.c((Ua) this);
                gVar = d2.j;
            }
            ua = Ua.AfterAttributeName;
            d2.d(ua);
            return;
        }
        d2.c((Ua) this);
        gVar = d2.j;
        b2 = 65533;
        gVar.a(b2);
    }
}
