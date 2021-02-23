package org.jsoup.parser;

/* 'enum' modifier removed */
class H extends Ua {
    H(String str, int i) {
        super(str, i, (O) null);
    }

    private void b(D d2, C3356a aVar) {
        d2.a("</" + d2.i.toString());
        aVar.q();
        d2.d(Ua.Rcdata);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        if (aVar.n()) {
            String f2 = aVar.f();
            d2.j.c(f2);
            d2.i.append(f2);
            return;
        }
        char b2 = aVar.b();
        if (b2 == 9 || b2 == 10 || b2 == 12 || b2 == 13 || b2 == ' ') {
            if (d2.i()) {
                ua = Ua.BeforeAttributeName;
                d2.d(ua);
                return;
            }
        } else if (b2 != '/') {
            if (b2 == '>' && d2.i()) {
                d2.h();
                ua = Ua.f15502a;
                d2.d(ua);
                return;
            }
        } else if (d2.i()) {
            ua = Ua.SelfClosingStartTag;
            d2.d(ua);
            return;
        }
        b(d2, aVar);
    }
}
