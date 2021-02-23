package org.jsoup.parser;

/* 'enum' modifier removed */
class S extends Ua {
    S(String str, int i) {
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
        char j = aVar.j();
        if (j != 0) {
            if (j == '-') {
                d2.a('-');
                ua = Ua.ScriptDataEscapedDash;
            } else if (j != '<') {
                d2.a(aVar.a('-', '<', 0));
                return;
            } else {
                ua = Ua.ScriptDataEscapedLessthanSign;
            }
            d2.a(ua);
            return;
        }
        d2.c((Ua) this);
        aVar.a();
        d2.a(65533);
    }
}
