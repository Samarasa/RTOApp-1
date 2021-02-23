package org.jsoup.parser;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.da  reason: case insensitive filesystem */
class C3363da extends Ua {
    C3363da(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        if (aVar.b('/')) {
            d2.a('/');
            d2.e();
            d2.a(Ua.ScriptDataDoubleEscapeEnd);
            return;
        }
        d2.d(Ua.ScriptDataDoubleEscaped);
    }
}
