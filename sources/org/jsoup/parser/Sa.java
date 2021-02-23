package org.jsoup.parser;

/* 'enum' modifier removed */
class Sa extends Ua {
    Sa(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        Ua ua2;
        char j = aVar.j();
        if (j == '!') {
            ua = Ua.MarkupDeclarationOpen;
        } else if (j == '/') {
            ua = Ua.EndTagOpen;
        } else if (j != '?') {
            if (aVar.n()) {
                d2.a(true);
                ua2 = Ua.TagName;
            } else {
                d2.c((Ua) this);
                d2.a('<');
                ua2 = Ua.f15502a;
            }
            d2.d(ua2);
            return;
        } else {
            ua = Ua.BogusComment;
        }
        d2.a(ua);
    }
}
