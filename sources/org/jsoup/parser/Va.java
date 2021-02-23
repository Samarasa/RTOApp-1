package org.jsoup.parser;

import java.util.ArrayList;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.C;

abstract class Va {

    /* renamed from: a  reason: collision with root package name */
    C3356a f15510a;

    /* renamed from: b  reason: collision with root package name */
    D f15511b;

    /* renamed from: c  reason: collision with root package name */
    protected Document f15512c;

    /* renamed from: d  reason: collision with root package name */
    protected ArrayList<Element> f15513d;

    /* renamed from: e  reason: collision with root package name */
    protected String f15514e;

    /* renamed from: f  reason: collision with root package name */
    protected C f15515f;

    /* renamed from: g  reason: collision with root package name */
    protected A f15516g;

    /* renamed from: h  reason: collision with root package name */
    protected ParseSettings f15517h;
    private C.f i = new C.f();
    private C.e j = new C.e();

    Va() {
    }

    /* access modifiers changed from: protected */
    public Element a() {
        int size = this.f15513d.size();
        if (size > 0) {
            return this.f15513d.get(size - 1);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void a(String str, String str2, A a2, ParseSettings parseSettings) {
        Validate.notNull(str, "String input must not be null");
        Validate.notNull(str2, "BaseURI must not be null");
        this.f15512c = new Document(str2);
        this.f15517h = parseSettings;
        this.f15510a = new C3356a(str);
        this.f15516g = a2;
        this.f15511b = new D(this.f15510a, a2);
        this.f15513d = new ArrayList<>(32);
        this.f15514e = str2;
    }

    /* access modifiers changed from: protected */
    public boolean a(String str) {
        C c2 = this.f15515f;
        C.e eVar = this.j;
        if (c2 == eVar) {
            C.e eVar2 = new C.e();
            eVar2.d(str);
            return a((C) eVar2);
        }
        eVar.l();
        eVar.d(str);
        return a((C) eVar);
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(C c2);

    /* access modifiers changed from: package-private */
    public Document b(String str, String str2, A a2, ParseSettings parseSettings) {
        a(str, str2, a2, parseSettings);
        c();
        return this.f15512c;
    }

    /* access modifiers changed from: package-private */
    public abstract ParseSettings b();

    /* access modifiers changed from: protected */
    public boolean b(String str) {
        C c2 = this.f15515f;
        C.f fVar = this.i;
        if (c2 == fVar) {
            C.f fVar2 = new C.f();
            fVar2.d(str);
            return a((C) fVar2);
        }
        fVar.l();
        fVar.d(str);
        return a((C) fVar);
    }

    /* access modifiers changed from: protected */
    public void c() {
        C j2;
        do {
            j2 = this.f15511b.j();
            a(j2);
            j2.l();
        } while (j2.f15454a != C.h.EOF);
    }

    public boolean processStartTag(String str, Attributes attributes) {
        C c2 = this.f15515f;
        C.f fVar = this.i;
        if (c2 == fVar) {
            C.f fVar2 = new C.f();
            fVar2.a(str, attributes);
            return a((C) fVar2);
        }
        fVar.l();
        this.i.a(str, attributes);
        return a((C) this.i);
    }
}
