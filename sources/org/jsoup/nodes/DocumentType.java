package org.jsoup.nodes;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document;

public class DocumentType extends Node {
    public DocumentType(String str, String str2, String str3, String str4) {
        super(str4);
        attr("name", str);
        attr("publicId", str2);
        attr("systemId", str3);
    }

    private boolean a(String str) {
        return !StringUtil.isBlank(attr(str));
    }

    /* access modifiers changed from: package-private */
    public void b(Appendable appendable, int i, Document.OutputSettings outputSettings) {
        appendable.append((outputSettings.syntax() != Document.OutputSettings.Syntax.html || a("publicId") || a("systemId")) ? "<!DOCTYPE" : "<!doctype");
        if (a("name")) {
            appendable.append(" ").append(attr("name"));
        }
        if (a("publicId")) {
            appendable.append(" PUBLIC \"").append(attr("publicId")).append('\"');
        }
        if (a("systemId")) {
            appendable.append(" \"").append(attr("systemId")).append('\"');
        }
        appendable.append('>');
    }

    /* access modifiers changed from: package-private */
    public void c(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }

    public String nodeName() {
        return "#doctype";
    }
}
