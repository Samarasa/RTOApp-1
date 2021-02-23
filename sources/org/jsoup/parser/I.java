package org.jsoup.parser;

/* 'enum' modifier removed */
class I extends Ua {
    I(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        if (aVar.b('/')) {
            d2.e();
            d2.a(Ua.RawtextEndTagOpen);
            return;
        }
        d2.a('<');
        d2.d(Ua.Rawtext);
    }
}
