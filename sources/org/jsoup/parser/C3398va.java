package org.jsoup.parser;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.va  reason: case insensitive filesystem */
class C3398va extends Ua {
    C3398va(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        char b2 = aVar.b();
        if (b2 != 0) {
            if (b2 == '!') {
                d2.c((Ua) this);
                ua = Ua.CommentEndBang;
            } else if (b2 != '-') {
                if (b2 != '>') {
                    if (b2 != 65535) {
                        d2.c((Ua) this);
                        StringBuilder sb = d2.o.f15456b;
                        sb.append("--");
                        sb.append(b2);
                    } else {
                        d2.b((Ua) this);
                    }
                }
                d2.f();
                ua = Ua.f15502a;
            } else {
                d2.c((Ua) this);
                d2.o.f15456b.append('-');
                return;
            }
            d2.d(ua);
        }
        d2.c((Ua) this);
        StringBuilder sb2 = d2.o.f15456b;
        sb2.append("--");
        sb2.append(65533);
        ua = Ua.Comment;
        d2.d(ua);
    }
}
