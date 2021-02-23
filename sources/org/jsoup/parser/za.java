package org.jsoup.parser;

/* 'enum' modifier removed */
class za extends Ua {
    za(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        if (aVar.n()) {
            d2.d();
            d2.d(Ua.aa);
            return;
        }
        char b2 = aVar.b();
        if (b2 == 0) {
            d2.c((Ua) this);
            d2.d();
            d2.n.f15458b.append(65533);
        } else if (b2 == ' ') {
            return;
        } else {
            if (b2 == 65535) {
                d2.b((Ua) this);
                d2.d();
                d2.n.f15461e = true;
                d2.g();
                ua = Ua.f15502a;
                d2.d(ua);
            } else if (b2 != 9 && b2 != 10 && b2 != 12 && b2 != 13) {
                d2.d();
                d2.n.f15458b.append(b2);
            } else {
                return;
            }
        }
        ua = Ua.aa;
        d2.d(ua);
    }
}
