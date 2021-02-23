package org.jsoup.parser;

/* 'enum' modifier removed */
class U extends Ua {
    U(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        if (aVar.k()) {
            d2.b((Ua) this);
            d2.d(Ua.f15502a);
            return;
        }
        char b2 = aVar.b();
        if (b2 == 0) {
            d2.c((Ua) this);
            b2 = 65533;
        } else if (b2 != '-') {
            if (b2 == '<') {
                ua = Ua.ScriptDataEscapedLessthanSign;
            } else if (b2 == '>') {
                d2.a(b2);
                ua = Ua.ScriptData;
            }
            d2.d(ua);
        } else {
            d2.a(b2);
            return;
        }
        d2.a(b2);
        ua = Ua.ScriptDataEscaped;
        d2.d(ua);
    }
}
