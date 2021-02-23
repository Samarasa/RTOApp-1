package org.jsoup.nodes;

import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;

public class TextNode extends Node {

    /* renamed from: g  reason: collision with root package name */
    String f15445g;

    public TextNode(String str, String str2) {
        this.f15441e = str2;
        this.f15445g = str;
    }

    static String a(String str) {
        return StringUtil.normaliseWhitespace(str);
    }

    static boolean a(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    public static TextNode createFromEncoded(String str, String str2) {
        return new TextNode(Entities.a(str), str2);
    }

    private void f() {
        if (this.f15440d == null) {
            this.f15440d = new Attributes();
            this.f15440d.put("text", this.f15445g);
        }
    }

    public String absUrl(String str) {
        f();
        return super.absUrl(str);
    }

    public String attr(String str) {
        f();
        return super.attr(str);
    }

    public Node attr(String str, String str2) {
        f();
        super.attr(str, str2);
        return this;
    }

    public Attributes attributes() {
        f();
        return super.attributes();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (isBlank() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        a(r7, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (isBlank() == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.lang.Appendable r7, int r8, org.jsoup.nodes.Document.OutputSettings r9) {
        /*
            r6 = this;
            boolean r0 = r9.prettyPrint()
            if (r0 == 0) goto L_0x003d
            int r0 = r6.siblingIndex()
            if (r0 != 0) goto L_0x0024
            org.jsoup.nodes.Node r0 = r6.f15438b
            boolean r1 = r0 instanceof org.jsoup.nodes.Element
            if (r1 == 0) goto L_0x0024
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            org.jsoup.parser.Tag r0 = r0.tag()
            boolean r0 = r0.formatAsBlock()
            if (r0 == 0) goto L_0x0024
            boolean r0 = r6.isBlank()
            if (r0 == 0) goto L_0x003a
        L_0x0024:
            boolean r0 = r9.outline()
            if (r0 == 0) goto L_0x003d
            java.util.List r0 = r6.siblingNodes()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x003d
            boolean r0 = r6.isBlank()
            if (r0 != 0) goto L_0x003d
        L_0x003a:
            r6.a(r7, r8, r9)
        L_0x003d:
            boolean r8 = r9.prettyPrint()
            if (r8 == 0) goto L_0x0058
            org.jsoup.nodes.Node r8 = r6.parent()
            boolean r8 = r8 instanceof org.jsoup.nodes.Element
            if (r8 == 0) goto L_0x0058
            org.jsoup.nodes.Node r8 = r6.parent()
            boolean r8 = org.jsoup.nodes.Element.e(r8)
            if (r8 != 0) goto L_0x0058
            r8 = 1
            r4 = 1
            goto L_0x005a
        L_0x0058:
            r8 = 0
            r4 = 0
        L_0x005a:
            java.lang.String r1 = r6.getWholeText()
            r3 = 0
            r5 = 0
            r0 = r7
            r2 = r9
            org.jsoup.nodes.Entities.a(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.TextNode.b(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings):void");
    }

    /* access modifiers changed from: package-private */
    public void c(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }

    public String getWholeText() {
        Attributes attributes = this.f15440d;
        return attributes == null ? this.f15445g : attributes.get("text");
    }

    public boolean hasAttr(String str) {
        f();
        return super.hasAttr(str);
    }

    public boolean isBlank() {
        return StringUtil.isBlank(getWholeText());
    }

    public String nodeName() {
        return "#text";
    }

    public Node removeAttr(String str) {
        f();
        super.removeAttr(str);
        return this;
    }

    public TextNode splitText(int i) {
        Validate.isTrue(i >= 0, "Split offset must be not be negative");
        Validate.isTrue(i < this.f15445g.length(), "Split offset must not be greater than current text length");
        String substring = getWholeText().substring(0, i);
        String substring2 = getWholeText().substring(i);
        text(substring);
        TextNode textNode = new TextNode(substring2, baseUri());
        if (parent() != null) {
            parent().a(siblingIndex() + 1, textNode);
        }
        return textNode;
    }

    public String text() {
        return a(getWholeText());
    }

    public TextNode text(String str) {
        this.f15445g = str;
        Attributes attributes = this.f15440d;
        if (attributes != null) {
            attributes.put("text", str);
        }
        return this;
    }

    public String toString() {
        return outerHtml();
    }
}
