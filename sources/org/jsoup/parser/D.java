package org.jsoup.parser;

import java.util.Arrays;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.C;

final class D {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f15476a = {9, 10, 13, 12, ' ', '<', '&'};

    /* renamed from: b  reason: collision with root package name */
    private final C3356a f15477b;

    /* renamed from: c  reason: collision with root package name */
    private final A f15478c;

    /* renamed from: d  reason: collision with root package name */
    private Ua f15479d = Ua.f15502a;

    /* renamed from: e  reason: collision with root package name */
    private C f15480e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15481f = false;

    /* renamed from: g  reason: collision with root package name */
    private String f15482g = null;

    /* renamed from: h  reason: collision with root package name */
    private StringBuilder f15483h = new StringBuilder(1024);
    StringBuilder i = new StringBuilder(1024);
    C.g j;
    C.f k = new C.f();
    C.e l = new C.e();
    C.a m = new C.a();
    C.c n = new C.c();
    C.b o = new C.b();
    private String p;
    private boolean q = true;
    private final int[] r = new int[1];
    private final int[] s = new int[2];

    static {
        Arrays.sort(f15476a);
    }

    D(C3356a aVar, A a2) {
        this.f15477b = aVar;
        this.f15478c = a2;
    }

    private void b(String str) {
        if (this.f15478c.e()) {
            this.f15478c.add(new ParseError(this.f15477b.o(), "Invalid character reference: %s", str));
        }
    }

    private void c(String str) {
        if (this.f15478c.e()) {
            this.f15478c.add(new ParseError(this.f15477b.o(), str));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: org.jsoup.parser.C$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: org.jsoup.parser.C$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: org.jsoup.parser.C$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: org.jsoup.parser.C$e} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jsoup.parser.C.g a(boolean r1) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x0008
            org.jsoup.parser.C$f r1 = r0.k
            r1.l()
            goto L_0x000d
        L_0x0008:
            org.jsoup.parser.C$e r1 = r0.l
            r1.l()
        L_0x000d:
            r0.j = r1
            org.jsoup.parser.C$g r1 = r0.j
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.D.a(boolean):org.jsoup.parser.C$g");
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.q = true;
    }

    /* access modifiers changed from: package-private */
    public void a(char c2) {
        a(String.valueOf(c2));
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        if (this.f15482g == null) {
            this.f15482g = str;
            return;
        }
        if (this.f15483h.length() == 0) {
            this.f15483h.append(this.f15482g);
        }
        this.f15483h.append(str);
    }

    /* access modifiers changed from: package-private */
    public void a(C c2) {
        Validate.isFalse(this.f15481f, "There is an unread token pending!");
        this.f15480e = c2;
        this.f15481f = true;
        C.h hVar = c2.f15454a;
        if (hVar == C.h.StartTag) {
            C.f fVar = (C.f) c2;
            this.p = fVar.f15462b;
            if (fVar.i) {
                this.q = false;
            }
        } else if (hVar == C.h.EndTag && ((C.e) c2).j != null) {
            c("Attributes incorrectly present on end tag");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Ua ua) {
        this.f15477b.a();
        this.f15479d = ua;
    }

    /* access modifiers changed from: package-private */
    public void a(int[] iArr) {
        a(new String(iArr, 0, iArr.length));
    }

    /* access modifiers changed from: package-private */
    public int[] a(Character ch, boolean z) {
        int i2;
        if (this.f15477b.k()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.f15477b.j()) || this.f15477b.d(f15476a)) {
            return null;
        }
        int[] iArr = this.r;
        this.f15477b.l();
        if (this.f15477b.c("#")) {
            boolean d2 = this.f15477b.d("X");
            String e2 = d2 ? this.f15477b.e() : this.f15477b.d();
            if (e2.length() == 0) {
                b("numeric reference with no numerals");
            } else {
                if (!this.f15477b.c(";")) {
                    b("missing semicolon");
                }
                try {
                    i2 = Integer.valueOf(e2, d2 ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    i2 = -1;
                }
                if (i2 == -1 || ((i2 >= 55296 && i2 <= 57343) || i2 > 1114111)) {
                    b("character outside of valid range");
                    iArr[0] = 65533;
                    return iArr;
                }
                iArr[0] = i2;
                return iArr;
            }
        } else {
            String g2 = this.f15477b.g();
            boolean b2 = this.f15477b.b(';');
            if (!(Entities.isBaseNamedEntity(g2) || (Entities.isNamedEntity(g2) && b2))) {
                this.f15477b.p();
                if (b2) {
                    b(String.format("invalid named referenece '%s'", new Object[]{g2}));
                }
                return null;
            } else if (!z || (!this.f15477b.n() && !this.f15477b.m() && !this.f15477b.c('=', '-', '_'))) {
                if (!this.f15477b.c(";")) {
                    b("missing semicolon");
                }
                int codepointsForName = Entities.codepointsForName(g2, this.s);
                if (codepointsForName == 1) {
                    iArr[0] = this.s[0];
                    return iArr;
                } else if (codepointsForName == 2) {
                    return this.s;
                } else {
                    Validate.fail("Unexpected characters returned for " + g2);
                    throw null;
                }
            }
        }
        this.f15477b.p();
        return null;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        String str = this.p;
        if (str == null) {
            return null;
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    public String b(boolean z) {
        StringBuilder sb = new StringBuilder();
        while (!this.f15477b.k()) {
            sb.append(this.f15477b.a('&'));
            if (this.f15477b.b('&')) {
                this.f15477b.b();
                int[] a2 = a((Character) null, z);
                if (a2 == null || a2.length == 0) {
                    sb.append('&');
                } else {
                    sb.appendCodePoint(a2[0]);
                    if (a2.length == 2) {
                        sb.appendCodePoint(a2[1]);
                    }
                }
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public void b(Ua ua) {
        if (this.f15478c.e()) {
            this.f15478c.add(new ParseError(this.f15477b.o(), "Unexpectedly reached end of file (EOF) in input state [%s]", ua));
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.o.l();
    }

    /* access modifiers changed from: package-private */
    public void c(Ua ua) {
        if (this.f15478c.e()) {
            this.f15478c.add(new ParseError(this.f15477b.o(), "Unexpected character '%s' in input state [%s]", Character.valueOf(this.f15477b.j()), ua));
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.n.l();
    }

    /* access modifiers changed from: package-private */
    public void d(Ua ua) {
        this.f15479d = ua;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        C.a(this.i);
    }

    /* access modifiers changed from: package-private */
    public void f() {
        a((C) this.o);
    }

    /* access modifiers changed from: package-private */
    public void g() {
        a((C) this.n);
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.j.n();
        a((C) this.j);
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return this.p != null && this.j.q().equalsIgnoreCase(this.p);
    }

    /* access modifiers changed from: package-private */
    public C j() {
        if (!this.q) {
            c("Self closing flag not acknowledged");
            this.q = true;
        }
        while (!this.f15481f) {
            this.f15479d.a(this, this.f15477b);
        }
        if (this.f15483h.length() > 0) {
            String sb = this.f15483h.toString();
            StringBuilder sb2 = this.f15483h;
            sb2.delete(0, sb2.length());
            this.f15482g = null;
            C.a aVar = this.m;
            aVar.a(sb);
            return aVar;
        }
        String str = this.f15482g;
        if (str != null) {
            C.a aVar2 = this.m;
            aVar2.a(str);
            this.f15482g = null;
            return aVar2;
        }
        this.f15481f = false;
        return this.f15480e;
    }
}
