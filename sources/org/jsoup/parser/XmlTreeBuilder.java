package org.jsoup.parser;

import java.util.List;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.C;

public class XmlTreeBuilder extends Va {
    private void a(Node node) {
        a().appendChild(node);
    }

    private void a(C.e eVar) {
        Element element;
        String q = eVar.q();
        int size = this.f15513d.size() - 1;
        while (true) {
            if (size < 0) {
                element = null;
                break;
            }
            element = this.f15513d.get(size);
            if (element.nodeName().equals(q)) {
                break;
            }
            size--;
        }
        if (element != null) {
            int size2 = this.f15513d.size() - 1;
            while (size2 >= 0) {
                Element element2 = this.f15513d.get(size2);
                this.f15513d.remove(size2);
                if (element2 != element) {
                    size2--;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Element a(C.f fVar) {
        Tag valueOf = Tag.valueOf(fVar.q(), this.f15517h);
        Element element = new Element(valueOf, this.f15514e, this.f15517h.a(fVar.j));
        a((Node) element);
        if (fVar.p()) {
            this.f15511b.a();
            if (!valueOf.isKnownTag()) {
                valueOf.a();
            }
        } else {
            this.f15513d.add(element);
        }
        return element;
    }

    /* access modifiers changed from: protected */
    public void a(String str, String str2, A a2, ParseSettings parseSettings) {
        super.a(str, str2, a2, parseSettings);
        this.f15513d.add(this.f15512c);
        this.f15512c.outputSettings().syntax(Document.OutputSettings.Syntax.xml);
    }

    /* access modifiers changed from: package-private */
    public void a(C.a aVar) {
        a((Node) new TextNode(aVar.n(), this.f15514e));
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [org.jsoup.nodes.Node, org.jsoup.nodes.XmlDeclaration] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(org.jsoup.parser.C.b r7) {
        /*
            r6 = this;
            org.jsoup.nodes.Comment r0 = new org.jsoup.nodes.Comment
            java.lang.String r1 = r7.n()
            java.lang.String r2 = r6.f15514e
            r0.<init>(r1, r2)
            boolean r7 = r7.f15457c
            if (r7 == 0) goto L_0x007b
            java.lang.String r7 = r0.getData()
            int r1 = r7.length()
            r2 = 1
            if (r1 <= r2) goto L_0x007b
            java.lang.String r1 = "!"
            boolean r3 = r7.startsWith(r1)
            if (r3 != 0) goto L_0x002a
            java.lang.String r3 = "?"
            boolean r3 = r7.startsWith(r3)
            if (r3 == 0) goto L_0x007b
        L_0x002a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "<"
            r3.append(r4)
            int r4 = r7.length()
            int r4 = r4 - r2
            java.lang.String r2 = r7.substring(r2, r4)
            r3.append(r2)
            java.lang.String r2 = ">"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = r6.f15514e
            org.jsoup.parser.Parser r4 = org.jsoup.parser.Parser.xmlParser()
            org.jsoup.nodes.Document r2 = org.jsoup.Jsoup.parse((java.lang.String) r2, (java.lang.String) r3, (org.jsoup.parser.Parser) r4)
            r3 = 0
            org.jsoup.nodes.Element r2 = r2.child(r3)
            org.jsoup.nodes.XmlDeclaration r3 = new org.jsoup.nodes.XmlDeclaration
            org.jsoup.parser.ParseSettings r4 = r6.f15517h
            java.lang.String r5 = r2.tagName()
            java.lang.String r4 = r4.a((java.lang.String) r5)
            java.lang.String r0 = r0.baseUri()
            boolean r7 = r7.startsWith(r1)
            r3.<init>(r4, r0, r7)
            org.jsoup.nodes.Attributes r7 = r3.attributes()
            org.jsoup.nodes.Attributes r0 = r2.attributes()
            r7.addAll(r0)
            r0 = r3
        L_0x007b:
            r6.a((org.jsoup.nodes.Node) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.XmlTreeBuilder.a(org.jsoup.parser.C$b):void");
    }

    /* access modifiers changed from: package-private */
    public void a(C.c cVar) {
        a((Node) new DocumentType(this.f15517h.a(cVar.n()), cVar.o(), cVar.p(), this.f15514e));
    }

    /* access modifiers changed from: protected */
    public boolean a(C c2) {
        switch (Wa.f15518a[c2.f15454a.ordinal()]) {
            case 1:
                a(c2.e());
                return true;
            case 2:
                a(c2.d());
                return true;
            case 3:
                a(c2.b());
                return true;
            case 4:
                a(c2.a());
                return true;
            case 5:
                a(c2.c());
                return true;
            case 6:
                return true;
            default:
                Validate.fail("Unexpected token type: " + c2.f15454a);
                throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public ParseSettings b() {
        return ParseSettings.preserveCase;
    }

    /* access modifiers changed from: package-private */
    public List<Node> c(String str, String str2, A a2, ParseSettings parseSettings) {
        a(str, str2, a2, parseSettings);
        c();
        return this.f15512c.childNodes();
    }

    public /* bridge */ /* synthetic */ boolean processStartTag(String str, Attributes attributes) {
        return super.processStartTag(str, attributes);
    }
}
