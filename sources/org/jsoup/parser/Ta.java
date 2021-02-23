package org.jsoup.parser;

/* 'enum' modifier removed */
class Ta extends Ua {
    Ta(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        Ua ua2;
        if (aVar.k()) {
            d2.b((Ua) this);
            d2.a("</");
            ua2 = Ua.f15502a;
        } else if (aVar.n()) {
            d2.a(false);
            ua2 = Ua.TagName;
        } else {
            if (aVar.b('>')) {
                d2.c((Ua) this);
                ua = Ua.f15502a;
            } else {
                d2.c((Ua) this);
                ua = Ua.BogusComment;
            }
            d2.a(ua);
            return;
        }
        d2.d(ua2);
    }
}
