package org.jsoup.parser;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.ua  reason: case insensitive filesystem */
class C3396ua extends Ua {
    C3396ua(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        char b2 = aVar.b();
        if (b2 != 0) {
            if (b2 == '-') {
                ua = Ua.CommentEnd;
            } else if (b2 != 65535) {
                StringBuilder sb = d2.o.f15456b;
                sb.append('-');
                sb.append(b2);
            } else {
                d2.b((Ua) this);
                d2.f();
                ua = Ua.f15502a;
            }
            d2.d(ua);
        }
        d2.c((Ua) this);
        StringBuilder sb2 = d2.o.f15456b;
        sb2.append('-');
        sb2.append(65533);
        ua = Ua.Comment;
        d2.d(ua);
    }
}
