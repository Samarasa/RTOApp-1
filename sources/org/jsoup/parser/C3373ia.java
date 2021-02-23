package org.jsoup.parser;

import org.jsoup.parser.C;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.ia  reason: case insensitive filesystem */
class C3373ia extends Ua {
    C3373ia(String str, int i) {
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
            gVar.b(b2);
        } else if (b2 != ' ') {
            if (b2 != '\"') {
                if (b2 != '`') {
                    if (b2 == 65535) {
                        d2.b((Ua) this);
                    } else if (b2 != 9 && b2 != 10 && b2 != 12 && b2 != 13) {
                        if (b2 != '&') {
                            if (b2 != '\'') {
                                switch (b2) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        d2.c((Ua) this);
                                        break;
                                }
                            } else {
                                ua = Ua.AttributeValue_singleQuoted;
                            }
                        }
                        aVar.q();
                    } else {
                        return;
                    }
                    d2.h();
                    ua = Ua.f15502a;
                }
                d2.c((Ua) this);
                gVar = d2.j;
                gVar.b(b2);
            } else {
                ua = Ua.AttributeValue_doubleQuoted;
            }
            d2.d(ua);
        } else {
            return;
        }
        ua = Ua.AttributeValue_unquoted;
        d2.d(ua);
    }
}
