package org.jsoup.parser;

/* 'enum' modifier removed */
class L extends Ua {
    L(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        char b2 = aVar.b();
        if (b2 == '!') {
            d2.a("<!");
            ua = Ua.ScriptDataEscapeStart;
        } else if (b2 != '/') {
            d2.a("<");
            aVar.q();
            ua = Ua.ScriptData;
        } else {
            d2.e();
            ua = Ua.ScriptDataEndTagOpen;
        }
        d2.d(ua);
    }
}
