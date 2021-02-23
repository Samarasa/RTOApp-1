package org.jsoup.parser;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.ca  reason: case insensitive filesystem */
class C3361ca extends Ua {
    C3361ca(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        char b2 = aVar.b();
        if (b2 == 0) {
            d2.c((Ua) this);
            b2 = 65533;
        } else if (b2 != '-') {
            if (b2 == '<') {
                d2.a(b2);
                ua = Ua.ScriptDataDoubleEscapedLessthanSign;
            } else if (b2 == '>') {
                d2.a(b2);
                ua = Ua.ScriptData;
            } else if (b2 == 65535) {
                d2.b((Ua) this);
                ua = Ua.f15502a;
            }
            d2.d(ua);
        } else {
            d2.a(b2);
            return;
        }
        d2.a(b2);
        ua = Ua.ScriptDataDoubleEscaped;
        d2.d(ua);
    }
}
