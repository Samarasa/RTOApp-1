package org.jsoup.nodes;

import org.jsoup.nodes.Document;

public class Comment extends Node {
    public Comment(String str, String str2) {
        super(str2);
        this.f15440d.put("comment", str);
    }

    /* access modifiers changed from: package-private */
    public void b(Appendable appendable, int i, Document.OutputSettings outputSettings) {
        if (outputSettings.prettyPrint()) {
            a(appendable, i, outputSettings);
        }
        appendable.append("<!--").append(getData()).append("-->");
    }

    /* access modifiers changed from: package-private */
    public void c(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }

    public String getData() {
        return this.f15440d.get("comment");
    }

    public String nodeName() {
        return "#comment";
    }

    public String toString() {
        return outerHtml();
    }
}
