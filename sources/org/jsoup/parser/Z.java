package org.jsoup.parser;

/* 'enum' modifier removed */
class Z extends Ua {
    Z(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        char j = aVar.j();
        if (j != 0) {
            if (j == '-') {
                d2.a(j);
                ua = Ua.ScriptDataDoubleEscapedDash;
            } else if (j == '<') {
                d2.a(j);
                ua = Ua.ScriptDataDoubleEscapedLessthanSign;
            } else if (j != 65535) {
                d2.a(aVar.a('-', '<', 0));
                return;
            } else {
                d2.b((Ua) this);
                d2.d(Ua.f15502a);
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
