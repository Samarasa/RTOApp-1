package org.jsoup.parser;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.ja  reason: case insensitive filesystem */
class C3375ja extends Ua {
    C3375ja(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        String a2 = aVar.a(Ua.qa);
        if (a2.length() > 0) {
            d2.j.b(a2);
        } else {
            d2.j.t();
        }
        char b2 = aVar.b();
        if (b2 != 0) {
            if (b2 == '\"') {
                ua = Ua.AfterAttributeValue_quoted;
            } else if (b2 == '&') {
                int[] a3 = d2.a('\"', true);
                if (a3 != null) {
                    d2.j.a(a3);
                    return;
                } else {
                    d2.j.b('&');
                    return;
                }
            } else if (b2 == 65535) {
                d2.b((Ua) this);
                ua = Ua.f15502a;
            } else {
                return;
            }
            d2.d(ua);
            return;
        }
        d2.c((Ua) this);
        d2.j.b(65533);
    }
}
