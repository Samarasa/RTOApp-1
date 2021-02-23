package org.jsoup.parser;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.qa  reason: case insensitive filesystem */
class C3389qa extends Ua {
    C3389qa(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        if (aVar.c("--")) {
            d2.c();
            ua = Ua.CommentStart;
        } else if (aVar.d("DOCTYPE")) {
            ua = Ua.Doctype;
        } else if (aVar.c("[CDATA[")) {
            ua = Ua.CdataSection;
        } else {
            d2.c((Ua) this);
            d2.a(Ua.BogusComment);
            return;
        }
        d2.d(ua);
    }
}
