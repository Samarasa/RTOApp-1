package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;

public class XmlDeclaration extends Node {

    /* renamed from: g  reason: collision with root package name */
    private final String f15446g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f15447h;

    public XmlDeclaration(String str, String str2, boolean z) {
        super(str2);
        Validate.notNull(str);
        this.f15446g = str;
        this.f15447h = z;
    }

    /* access modifiers changed from: package-private */
    public void b(Appendable appendable, int i, Document.OutputSettings outputSettings) {
        String str = "!";
        appendable.append("<").append(this.f15447h ? str : "?").append(this.f15446g);
        this.f15440d.a(appendable, outputSettings);
        if (!this.f15447h) {
            str = "?";
        }
        appendable.append(str).append(">");
    }

    /* access modifiers changed from: package-private */
    public void c(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }

    public String getWholeDeclaration() {
        return this.f15440d.html().trim();
    }

    public String name() {
        return this.f15446g;
    }

    public String nodeName() {
        return "#declaration";
    }

    public String toString() {
        return outerHtml();
    }
}
