package org.jsoup.parser;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.ra  reason: case insensitive filesystem */
class C3390ra extends Ua {
    C3390ra(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        char b2 = aVar.b();
        if (b2 != 0) {
            if (b2 != '-') {
                if (b2 == '>') {
                    d2.c((Ua) this);
                } else if (b2 != 65535) {
                    d2.o.f15456b.append(b2);
                } else {
                    d2.b((Ua) this);
                }
                d2.f();
                ua = Ua.f15502a;
            } else {
                ua = Ua.CommentStartDash;
            }
            d2.d(ua);
        }
        d2.c((Ua) this);
        d2.o.f15456b.append(65533);
        ua = Ua.Comment;
        d2.d(ua);
    }
}
