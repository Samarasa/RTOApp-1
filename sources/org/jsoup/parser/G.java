package org.jsoup.parser;

/* 'enum' modifier removed */
class G extends Ua {
    G(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        if (aVar.n()) {
            d2.a(false);
            d2.j.c(aVar.j());
            d2.i.append(aVar.j());
            d2.a(Ua.RCDATAEndTagName);
            return;
        }
        d2.a("</");
        d2.d(Ua.Rcdata);
    }
}
