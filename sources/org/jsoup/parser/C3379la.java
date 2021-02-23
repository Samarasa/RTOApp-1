package org.jsoup.parser;

import org.jsoup.parser.C;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.la  reason: case insensitive filesystem */
class C3379la extends Ua {
    C3379la(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        char j = aVar.j();
        if (j != 0) {
            if (j == '&') {
                ua = Ua.CharacterReferenceInRcdata;
            } else if (j == '<') {
                ua = Ua.RcdataLessthanSign;
            } else if (j != 65535) {
                d2.a(aVar.a('&', '<', 0));
                return;
            } else {
                d2.a((C) new C.d());
                return;
            }
            d2.a(ua);
            return;
        }
        d2.c((Ua) this);
        aVar.a();
        d2.a(65533);
    }
}
