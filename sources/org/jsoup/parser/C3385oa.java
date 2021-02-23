package org.jsoup.parser;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.oa  reason: case insensitive filesystem */
class C3385oa extends Ua {
    C3385oa(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        char b2 = aVar.b();
        if (b2 == '>') {
            d2.j.i = true;
            d2.h();
            ua = Ua.f15502a;
        } else if (b2 != 65535) {
            d2.c((Ua) this);
            aVar.q();
            ua = Ua.BeforeAttributeName;
        } else {
            d2.b((Ua) this);
            ua = Ua.f15502a;
        }
        d2.d(ua);
    }
}
