package org.jsoup.parser;

import org.jsoup.parser.C;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.ma  reason: case insensitive filesystem */
class C3381ma extends Ua {
    C3381ma(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        C.g gVar;
        Ua ua;
        String b2 = aVar.b(Ua.sa);
        if (b2.length() > 0) {
            d2.j.b(b2);
        }
        char b3 = aVar.b();
        if (b3 != 0) {
            if (b3 != ' ') {
                if (!(b3 == '\"' || b3 == '`')) {
                    if (b3 == 65535) {
                        d2.b((Ua) this);
                    } else if (!(b3 == 9 || b3 == 10 || b3 == 12 || b3 == 13)) {
                        if (b3 == '&') {
                            int[] a2 = d2.a('>', true);
                            if (a2 != null) {
                                d2.j.a(a2);
                                return;
                            } else {
                                d2.j.b('&');
                                return;
                            }
                        } else if (b3 != '\'') {
                            switch (b3) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    d2.h();
                                    break;
                                default:
                                    return;
                            }
                        }
                    }
                    ua = Ua.f15502a;
                    d2.d(ua);
                    return;
                }
                d2.c((Ua) this);
                gVar = d2.j;
            }
            ua = Ua.BeforeAttributeName;
            d2.d(ua);
            return;
        }
        d2.c((Ua) this);
        gVar = d2.j;
        b3 = 65533;
        gVar.b(b3);
    }
}
