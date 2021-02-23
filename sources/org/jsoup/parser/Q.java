package org.jsoup.parser;

/* 'enum' modifier removed */
class Q extends Ua {
    Q(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        if (aVar.b('-')) {
            d2.a('-');
            d2.a(Ua.ScriptDataEscapedDashDash);
            return;
        }
        d2.d(Ua.ScriptData);
    }
}
