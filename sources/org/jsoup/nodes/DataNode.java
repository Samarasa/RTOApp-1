package org.jsoup.nodes;

import org.jsoup.nodes.Document;

public class DataNode extends Node {
    public DataNode(String str, String str2) {
        super(str2);
        this.f15440d.put("data", str);
    }

    public static DataNode createFromEncoded(String str, String str2) {
        return new DataNode(Entities.a(str), str2);
    }

    /* access modifiers changed from: package-private */
    public void b(Appendable appendable, int i, Document.OutputSettings outputSettings) {
        appendable.append(getWholeData());
    }

    /* access modifiers changed from: package-private */
    public void c(Appendable appendable, int i, Document.OutputSettings outputSettings) {
    }

    public String getWholeData() {
        return this.f15440d.get("data");
    }

    public String nodeName() {
        return "#data";
    }

    public DataNode setWholeData(String str) {
        this.f15440d.put("data", str);
        return this;
    }

    public String toString() {
        return outerHtml();
    }
}
