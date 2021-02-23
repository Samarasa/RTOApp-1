package org.jsoup.parser;

import org.jsoup.parser.C;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.ha  reason: case insensitive filesystem */
class C3371ha extends Ua {
    C3371ha(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        C.g gVar;
        Ua ua;
        char b2 = aVar.b();
        if (b2 == 0) {
            d2.c((Ua) this);
            gVar = d2.j;
            b2 = 65533;
            gVar.a(b2);
        } else if (b2 != ' ') {
            if (!(b2 == '\"' || b2 == '\'')) {
                if (b2 != '/') {
                    if (b2 != 65535) {
                        if (b2 != 9 && b2 != 10 && b2 != 12 && b2 != 13) {
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
                                    d2.j.r();
                                    aVar.q();
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
            gVar = d2.j;
            gVar.a(b2);
        } else {
            return;
        }
        ua = Ua.AttributeName;
        d2.d(ua);
    }
}
