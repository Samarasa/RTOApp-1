package org.jsoup.parser;

import org.jsoup.parser.C;

/* 'enum' modifier removed */
class O extends Ua {
    O(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        char j = aVar.j();
        if (j != 0) {
            if (j == '&') {
                ua = Ua.CharacterReferenceInData;
            } else if (j == '<') {
                ua = Ua.TagOpen;
            } else if (j != 65535) {
                d2.a(aVar.c());
                return;
            } else {
                d2.a((C) new C.d());
                return;
            }
            d2.a(ua);
            return;
        }
        d2.c((Ua) this);
        d2.a(aVar.b());
    }
}
