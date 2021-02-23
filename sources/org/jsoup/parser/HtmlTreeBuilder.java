package org.jsoup.parser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.C;
import org.jsoup.select.Elements;

public class HtmlTreeBuilder extends Va {
    public static final String[] TagsSearchInScope = {"applet", "caption", "html", "table", "td", "th", "marquee", "object"};
    private static final String[] k = {"ol", "ul"};
    private static final String[] l = {"button"};
    private static final String[] m = {"html", "table"};
    private static final String[] n = {"optgroup", "option"};
    private static final String[] o = {"dd", "dt", "li", "option", "optgroup", "p", "rp", "rt"};
    private static final String[] p = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};
    private boolean A = false;
    private boolean B = false;
    private String[] C = {null};
    private C3403z q;
    private C3403z r;
    private boolean s = false;
    private Element t;
    private FormElement u;
    private Element v;
    private ArrayList<Element> w = new ArrayList<>();
    private List<String> x = new ArrayList();
    private C.e y = new C.e();
    private boolean z = true;

    HtmlTreeBuilder() {
    }

    private void a(ArrayList<Element> arrayList, Element element, Element element2) {
        int lastIndexOf = arrayList.lastIndexOf(element);
        Validate.isTrue(lastIndexOf != -1);
        arrayList.set(lastIndexOf, element2);
    }

    private boolean a(String str, String[] strArr, String[] strArr2) {
        String[] strArr3 = this.C;
        strArr3[0] = str;
        return a(strArr3, strArr, strArr2);
    }

    private boolean a(ArrayList<Element> arrayList, Element element) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == element) {
                return true;
            }
        }
        return false;
    }

    private boolean a(String[] strArr, String[] strArr2, String[] strArr3) {
        for (int size = this.f15513d.size() - 1; size >= 0; size--) {
            String nodeName = this.f15513d.get(size).nodeName();
            if (StringUtil.in(nodeName, strArr)) {
                return true;
            }
            if (StringUtil.in(nodeName, strArr2)) {
                return false;
            }
            if (strArr3 != null && StringUtil.in(nodeName, strArr3)) {
                return false;
            }
        }
        Validate.fail("Should not be reachable");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(org.jsoup.nodes.Node r2) {
        /*
            r1 = this;
            java.util.ArrayList<org.jsoup.nodes.Element> r0 = r1.f15513d
            int r0 = r0.size()
            if (r0 != 0) goto L_0x000e
            org.jsoup.nodes.Document r0 = r1.f15512c
        L_0x000a:
            r0.appendChild(r2)
            goto L_0x001d
        L_0x000e:
            boolean r0 = r1.q()
            if (r0 == 0) goto L_0x0018
            r1.a((org.jsoup.nodes.Node) r2)
            goto L_0x001d
        L_0x0018:
            org.jsoup.nodes.Element r0 = r1.a()
            goto L_0x000a
        L_0x001d:
            boolean r0 = r2 instanceof org.jsoup.nodes.Element
            if (r0 == 0) goto L_0x0034
            org.jsoup.nodes.Element r2 = (org.jsoup.nodes.Element) r2
            org.jsoup.parser.Tag r0 = r2.tag()
            boolean r0 = r0.isFormListed()
            if (r0 == 0) goto L_0x0034
            org.jsoup.nodes.FormElement r0 = r1.u
            if (r0 == 0) goto L_0x0034
            r0.addElement(r2)
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilder.b(org.jsoup.nodes.Node):void");
    }

    private void c(String... strArr) {
        int size = this.f15513d.size() - 1;
        while (size >= 0) {
            Element element = this.f15513d.get(size);
            if (!StringUtil.in(element.nodeName(), strArr) && !element.nodeName().equals("html")) {
                this.f15513d.remove(size);
                size--;
            } else {
                return;
            }
        }
    }

    private boolean d(Element element, Element element2) {
        return element.nodeName().equals(element2.nodeName()) && element.attributes().equals(element2.attributes());
    }

    /* access modifiers changed from: package-private */
    public C3403z A() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public List<Node> a(String str, Element element, String str2, A a2, ParseSettings parseSettings) {
        Element element2;
        D d2;
        Ua ua;
        this.q = C3403z.Initial;
        a(str, str2, a2, parseSettings);
        this.v = element;
        this.B = true;
        if (element != null) {
            if (element.ownerDocument() != null) {
                this.f15512c.quirksMode(element.ownerDocument().quirksMode());
            }
            String tagName = element.tagName();
            if (StringUtil.in(tagName, "title", "textarea")) {
                d2 = this.f15511b;
                ua = Ua.Rcdata;
            } else if (StringUtil.in(tagName, "iframe", "noembed", "noframes", "style", "xmp")) {
                d2 = this.f15511b;
                ua = Ua.Rawtext;
            } else if (tagName.equals("script")) {
                d2 = this.f15511b;
                ua = Ua.ScriptData;
            } else {
                if (!tagName.equals("noscript")) {
                    boolean equals = tagName.equals("plaintext");
                }
                d2 = this.f15511b;
                ua = Ua.f15502a;
            }
            d2.d(ua);
            element2 = new Element(Tag.valueOf("html", parseSettings), str2);
            this.f15512c.appendChild(element2);
            this.f15513d.add(element2);
            z();
            Elements parents = element.parents();
            parents.add(0, element);
            Iterator it = parents.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Element element3 = (Element) it.next();
                if (element3 instanceof FormElement) {
                    this.u = (FormElement) element3;
                    break;
                }
            }
        } else {
            element2 = null;
        }
        c();
        return (element == null || element2 == null) ? this.f15512c.childNodes() : element2.childNodes();
    }

    /* access modifiers changed from: package-private */
    public Element a(Element element) {
        for (int size = this.f15513d.size() - 1; size >= 0; size--) {
            if (this.f15513d.get(size) == element) {
                return this.f15513d.get(size - 1);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Element a(C.f fVar) {
        if (fVar.p()) {
            Element b2 = b(fVar);
            this.f15513d.add(b2);
            this.f15511b.d(Ua.f15502a);
            D d2 = this.f15511b;
            C.e eVar = this.y;
            eVar.l();
            eVar.d(b2.tagName());
            d2.a((C) eVar);
            return b2;
        }
        Element element = new Element(Tag.valueOf(fVar.q(), this.f15517h), this.f15514e, this.f15517h.a(fVar.j));
        b(element);
        return element;
    }

    /* access modifiers changed from: package-private */
    public FormElement a(C.f fVar, boolean z2) {
        FormElement formElement = new FormElement(Tag.valueOf(fVar.q(), this.f15517h), this.f15514e, fVar.j);
        a(formElement);
        b((Node) formElement);
        if (z2) {
            this.f15513d.add(formElement);
        }
        return formElement;
    }

    /* access modifiers changed from: package-private */
    public void a(Element element, Element element2) {
        int lastIndexOf = this.f15513d.lastIndexOf(element);
        Validate.isTrue(lastIndexOf != -1);
        this.f15513d.add(lastIndexOf + 1, element2);
    }

    /* access modifiers changed from: package-private */
    public void a(FormElement formElement) {
        this.u = formElement;
    }

    /* access modifiers changed from: package-private */
    public void a(Node node) {
        Element element;
        Element e2 = e("table");
        boolean z2 = false;
        if (e2 == null) {
            element = this.f15513d.get(0);
        } else if (e2.parent() != null) {
            element = e2.parent();
            z2 = true;
        } else {
            element = a(e2);
        }
        if (z2) {
            Validate.notNull(e2);
            e2.before(node);
            return;
        }
        element.appendChild(node);
    }

    /* access modifiers changed from: package-private */
    public void a(C.a aVar) {
        String tagName = a().tagName();
        a().appendChild((tagName.equals("script") || tagName.equals("style")) ? new DataNode(aVar.n(), this.f15514e) : new TextNode(aVar.n(), this.f15514e));
    }

    /* access modifiers changed from: package-private */
    public void a(C.b bVar) {
        b((Node) new Comment(bVar.n(), this.f15514e));
    }

    /* access modifiers changed from: package-private */
    public void a(C3403z zVar) {
        if (this.f15516g.e()) {
            this.f15516g.add(new ParseError(this.f15510a.o(), "Unexpected token [%s] when in state [%s]", this.f15515f.m(), zVar));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z2) {
        this.z = z2;
    }

    /* access modifiers changed from: package-private */
    public boolean a(String str, String[] strArr) {
        return a(str, TagsSearchInScope, strArr);
    }

    /* access modifiers changed from: protected */
    public boolean a(C c2) {
        this.f15515f = c2;
        return this.q.a(c2, this);
    }

    /* access modifiers changed from: package-private */
    public boolean a(C c2, C3403z zVar) {
        this.f15515f = c2;
        return zVar.a(c2, this);
    }

    /* access modifiers changed from: package-private */
    public boolean a(String[] strArr) {
        return a(strArr, TagsSearchInScope, (String[]) null);
    }

    /* access modifiers changed from: package-private */
    public Document b(String str, String str2, A a2, ParseSettings parseSettings) {
        this.q = C3403z.Initial;
        this.s = false;
        return super.b(str, str2, a2, parseSettings);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        if (r0.isSelfClosing() != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jsoup.nodes.Element b(org.jsoup.parser.C.f r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.q()
            org.jsoup.parser.ParseSettings r1 = r4.f15517h
            org.jsoup.parser.Tag r0 = org.jsoup.parser.Tag.valueOf(r0, r1)
            org.jsoup.nodes.Element r1 = new org.jsoup.nodes.Element
            java.lang.String r2 = r4.f15514e
            org.jsoup.nodes.Attributes r3 = r5.j
            r1.<init>(r0, r2, r3)
            r4.b((org.jsoup.nodes.Node) r1)
            boolean r5 = r5.p()
            if (r5 == 0) goto L_0x0031
            boolean r5 = r0.isKnownTag()
            if (r5 == 0) goto L_0x0029
            boolean r5 = r0.isSelfClosing()
            if (r5 == 0) goto L_0x0031
            goto L_0x002c
        L_0x0029:
            r0.a()
        L_0x002c:
            org.jsoup.parser.D r5 = r4.f15511b
            r5.a()
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilder.b(org.jsoup.parser.C$f):org.jsoup.nodes.Element");
    }

    /* access modifiers changed from: package-private */
    public ParseSettings b() {
        return ParseSettings.htmlDefault;
    }

    /* access modifiers changed from: package-private */
    public void b(Element element) {
        b((Node) element);
        this.f15513d.add(element);
    }

    /* access modifiers changed from: package-private */
    public void b(Element element, Element element2) {
        a(this.w, element, element2);
    }

    /* access modifiers changed from: package-private */
    public void b(C3403z zVar) {
        this.q = zVar;
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z2) {
        this.A = z2;
    }

    /* access modifiers changed from: package-private */
    public void b(String... strArr) {
        int size = this.f15513d.size() - 1;
        while (size >= 0) {
            this.f15513d.remove(size);
            if (!StringUtil.in(this.f15513d.get(size).nodeName(), strArr)) {
                size--;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(String str) {
        while (str != null && !a().nodeName().equals(str) && StringUtil.in(a().nodeName(), o)) {
            w();
        }
    }

    /* access modifiers changed from: package-private */
    public void c(Element element, Element element2) {
        a(this.f15513d, element, element2);
    }

    /* access modifiers changed from: package-private */
    public boolean c(Element element) {
        return a(this.w, element);
    }

    /* access modifiers changed from: package-private */
    public Element d(String str) {
        for (int size = this.w.size() - 1; size >= 0; size--) {
            Element element = this.w.get(size);
            if (element == null) {
                return null;
            }
            if (element.nodeName().equals(str)) {
                return element;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000c, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r1 = this;
        L_0x0000:
            java.util.ArrayList<org.jsoup.nodes.Element> r0 = r1.w
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x000e
            org.jsoup.nodes.Element r0 = r1.y()
            if (r0 != 0) goto L_0x0000
        L_0x000e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilder.d():void");
    }

    /* access modifiers changed from: package-private */
    public boolean d(Element element) {
        return StringUtil.in(element.nodeName(), p);
    }

    /* access modifiers changed from: package-private */
    public Element e(String str) {
        for (int size = this.f15513d.size() - 1; size >= 0; size--) {
            Element element = this.f15513d.get(size);
            if (element.nodeName().equals(str)) {
                return element;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        c("tbody", "tfoot", "thead");
    }

    /* access modifiers changed from: package-private */
    public void e(Element element) {
        if (!this.s) {
            String absUrl = element.absUrl("href");
            if (absUrl.length() != 0) {
                this.f15514e = absUrl;
                this.s = true;
                this.f15512c.setBaseUri(absUrl);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        c("table");
    }

    /* access modifiers changed from: package-private */
    public boolean f(String str) {
        return a(str, l);
    }

    /* access modifiers changed from: package-private */
    public boolean f(Element element) {
        return a(this.f15513d, element);
    }

    /* access modifiers changed from: package-private */
    public void g() {
        c("tr");
    }

    /* access modifiers changed from: package-private */
    public void g(Element element) {
        this.f15513d.add(element);
    }

    /* access modifiers changed from: package-private */
    public boolean g(String str) {
        return a(str, k);
    }

    /* access modifiers changed from: package-private */
    public void h(Element element) {
        int size = this.w.size() - 1;
        int i = 0;
        while (true) {
            if (size >= 0) {
                Element element2 = this.w.get(size);
                if (element2 == null) {
                    break;
                }
                if (d(element, element2)) {
                    i++;
                }
                if (i == 3) {
                    this.w.remove(size);
                    break;
                }
                size--;
            } else {
                break;
            }
        }
        this.w.add(element);
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return this.z;
    }

    /* access modifiers changed from: package-private */
    public boolean h(String str) {
        return a(str, (String[]) null);
    }

    /* access modifiers changed from: package-private */
    public void i() {
        c((String) null);
    }

    /* access modifiers changed from: package-private */
    public void i(Element element) {
        for (int size = this.w.size() - 1; size >= 0; size--) {
            if (this.w.get(size) == element) {
                this.w.remove(size);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean i(String str) {
        for (int size = this.f15513d.size() - 1; size >= 0; size--) {
            String nodeName = this.f15513d.get(size).nodeName();
            if (nodeName.equals(str)) {
                return true;
            }
            if (!StringUtil.in(nodeName, n)) {
                return false;
            }
        }
        Validate.fail("Should not be reachable");
        throw null;
    }

    /* access modifiers changed from: package-private */
    public String j() {
        return this.f15514e;
    }

    /* access modifiers changed from: package-private */
    public boolean j(String str) {
        return a(str, m, (String[]) null);
    }

    /* access modifiers changed from: package-private */
    public boolean j(Element element) {
        for (int size = this.f15513d.size() - 1; size >= 0; size--) {
            if (this.f15513d.get(size) == element) {
                this.f15513d.remove(size);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public Document k() {
        return this.f15512c;
    }

    /* access modifiers changed from: package-private */
    public Element k(String str) {
        Element element = new Element(Tag.valueOf(str, this.f15517h), this.f15514e);
        b(element);
        return element;
    }

    /* access modifiers changed from: package-private */
    public void k(Element element) {
        this.t = element;
    }

    /* access modifiers changed from: package-private */
    public FormElement l() {
        return this.u;
    }

    /* access modifiers changed from: package-private */
    public void l(String str) {
        int size = this.f15513d.size() - 1;
        while (size >= 0 && !this.f15513d.get(size).nodeName().equals(str)) {
            this.f15513d.remove(size);
            size--;
        }
    }

    /* access modifiers changed from: package-private */
    public Element m() {
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public void m(String str) {
        int size = this.f15513d.size() - 1;
        while (size >= 0) {
            this.f15513d.remove(size);
            if (!this.f15513d.get(size).nodeName().equals(str)) {
                size--;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public List<String> n() {
        return this.x;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<Element> o() {
        return this.f15513d;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        this.w.add((Object) null);
    }

    public /* bridge */ /* synthetic */ boolean processStartTag(String str, Attributes attributes) {
        return super.processStartTag(str, attributes);
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return this.A;
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        return this.B;
    }

    /* access modifiers changed from: package-private */
    public Element s() {
        if (this.w.size() <= 0) {
            return null;
        }
        ArrayList<Element> arrayList = this.w;
        return arrayList.get(arrayList.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public void t() {
        this.r = this.q;
    }

    public String toString() {
        return "TreeBuilder{currentToken=" + this.f15515f + ", state=" + this.q + ", currentElement=" + a() + '}';
    }

    /* access modifiers changed from: package-private */
    public void u() {
        this.x = new ArrayList();
    }

    /* access modifiers changed from: package-private */
    public C3403z v() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public Element w() {
        return this.f15513d.remove(this.f15513d.size() - 1);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    void x() {
        /*
            r7 = this;
            org.jsoup.nodes.Element r0 = r7.s()
            if (r0 == 0) goto L_0x0058
            boolean r1 = r7.f((org.jsoup.nodes.Element) r0)
            if (r1 == 0) goto L_0x000d
            goto L_0x0058
        L_0x000d:
            java.util.ArrayList<org.jsoup.nodes.Element> r1 = r7.w
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            r3 = r0
            r0 = r1
        L_0x0017:
            r4 = 0
            if (r0 != 0) goto L_0x001b
            goto L_0x002e
        L_0x001b:
            java.util.ArrayList<org.jsoup.nodes.Element> r3 = r7.w
            int r0 = r0 + -1
            java.lang.Object r3 = r3.get(r0)
            org.jsoup.nodes.Element r3 = (org.jsoup.nodes.Element) r3
            if (r3 == 0) goto L_0x002d
            boolean r5 = r7.f((org.jsoup.nodes.Element) r3)
            if (r5 == 0) goto L_0x0017
        L_0x002d:
            r2 = 0
        L_0x002e:
            if (r2 != 0) goto L_0x003b
            java.util.ArrayList<org.jsoup.nodes.Element> r2 = r7.w
            int r0 = r0 + 1
            java.lang.Object r2 = r2.get(r0)
            org.jsoup.nodes.Element r2 = (org.jsoup.nodes.Element) r2
            r3 = r2
        L_0x003b:
            org.jsoup.helper.Validate.notNull(r3)
            java.lang.String r2 = r3.nodeName()
            org.jsoup.nodes.Element r2 = r7.k((java.lang.String) r2)
            org.jsoup.nodes.Attributes r5 = r2.attributes()
            org.jsoup.nodes.Attributes r6 = r3.attributes()
            r5.addAll(r6)
            java.util.ArrayList<org.jsoup.nodes.Element> r5 = r7.w
            r5.set(r0, r2)
            if (r0 != r1) goto L_0x002d
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilder.x():void");
    }

    /* access modifiers changed from: package-private */
    public Element y() {
        int size = this.w.size();
        if (size > 0) {
            return this.w.remove(size - 1);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void z() {
        C3403z zVar;
        int size = this.f15513d.size() - 1;
        boolean z2 = false;
        while (size >= 0) {
            Element element = this.f15513d.get(size);
            if (size == 0) {
                element = this.v;
                z2 = true;
            }
            String nodeName = element.nodeName();
            if ("select".equals(nodeName)) {
                zVar = C3403z.InSelect;
            } else if ("td".equals(nodeName) || ("th".equals(nodeName) && !z2)) {
                zVar = C3403z.InCell;
            } else if ("tr".equals(nodeName)) {
                zVar = C3403z.InRow;
            } else if ("tbody".equals(nodeName) || "thead".equals(nodeName) || "tfoot".equals(nodeName)) {
                zVar = C3403z.InTableBody;
            } else if ("caption".equals(nodeName)) {
                zVar = C3403z.InCaption;
            } else if ("colgroup".equals(nodeName)) {
                zVar = C3403z.InColumnGroup;
            } else if ("table".equals(nodeName)) {
                zVar = C3403z.InTable;
            } else {
                if (!"head".equals(nodeName) && !"body".equals(nodeName)) {
                    if ("frameset".equals(nodeName)) {
                        zVar = C3403z.InFrameset;
                    } else if ("html".equals(nodeName)) {
                        zVar = C3403z.BeforeHead;
                    } else if (!z2) {
                        size--;
                    }
                }
                zVar = C3403z.InBody;
            }
            b(zVar);
            return;
        }
    }
}
