package org.jsoup.parser;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.ta  reason: case insensitive filesystem */
class C3394ta extends Ua {
    C3394ta(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        char j = aVar.j();
        if (j == 0) {
            d2.c((Ua) this);
            aVar.a();
            d2.o.f15456b.append(65533);
        } else if (j == '-') {
            d2.a(Ua.CommentEndDash);
        } else if (j != 65535) {
            d2.o.f15456b.append(aVar.a('-', 0));
        } else {
            d2.b((Ua) this);
            d2.f();
            d2.d(Ua.f15502a);
        }
    }
}
