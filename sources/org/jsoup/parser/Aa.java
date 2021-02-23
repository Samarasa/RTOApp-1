package org.jsoup.parser;

/* 'enum' modifier removed */
class Aa extends Ua {
    Aa(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        StringBuilder sb;
        Ua ua;
        if (aVar.n()) {
            d2.n.f15458b.append(aVar.f());
            return;
        }
        char b2 = aVar.b();
        if (b2 != 0) {
            if (b2 != ' ') {
                if (b2 != '>') {
                    if (b2 == 65535) {
                        d2.b((Ua) this);
                        d2.n.f15461e = true;
                    } else if (!(b2 == 9 || b2 == 10 || b2 == 12 || b2 == 13)) {
                        sb = d2.n.f15458b;
                    }
                }
                d2.g();
                ua = Ua.f15502a;
                d2.d(ua);
                return;
            }
            ua = Ua.ba;
            d2.d(ua);
            return;
        }
        d2.c((Ua) this);
        sb = d2.n.f15458b;
        b2 = 65533;
        sb.append(b2);
    }
}
