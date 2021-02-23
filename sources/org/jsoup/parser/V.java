package org.jsoup.parser;

/* 'enum' modifier removed */
class V extends Ua {
    V(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        if (aVar.n()) {
            d2.e();
            d2.i.append(aVar.j());
            d2.a("<" + aVar.j());
            ua = Ua.ScriptDataDoubleEscapeStart;
        } else if (aVar.b('/')) {
            d2.e();
            ua = Ua.ScriptDataEscapedEndTagOpen;
        } else {
            d2.a('<');
            d2.d(Ua.ScriptDataEscaped);
            return;
        }
        d2.a(ua);
    }
}
