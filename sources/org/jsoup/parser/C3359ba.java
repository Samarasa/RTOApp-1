package org.jsoup.parser;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.ba  reason: case insensitive filesystem */
class C3359ba extends Ua {
    C3359ba(String str, int i) {
        super(str, i, (O) null);
    }

    /* access modifiers changed from: package-private */
    public void a(D d2, C3356a aVar) {
        Ua ua;
        char b2 = aVar.b();
        if (b2 != 0) {
            if (b2 == '-') {
                d2.a(b2);
                ua = Ua.ScriptDataDoubleEscapedDashDash;
            } else if (b2 == '<') {
                d2.a(b2);
                ua = Ua.ScriptDataDoubleEscapedLessthanSign;
            } else if (b2 == 65535) {
                d2.b((Ua) this);
                ua = Ua.f15502a;
            }
            d2.d(ua);
        }
        d2.c((Ua) this);
        b2 = 65533;
        d2.a(b2);
        ua = Ua.ScriptDataDoubleEscaped;
        d2.d(ua);
    }
}
