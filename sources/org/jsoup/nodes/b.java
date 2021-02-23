package org.jsoup.nodes;

import org.jsoup.select.NodeVisitor;

class b implements NodeVisitor {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ StringBuilder f15448a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Element f15449b;

    b(Element element, StringBuilder sb) {
        this.f15449b = element;
        this.f15448a = sb;
    }

    public void head(Node node, int i) {
        if (node instanceof TextNode) {
            Element.b(this.f15448a, (TextNode) node);
        } else if (node instanceof Element) {
            Element element = (Element) node;
            if (this.f15448a.length() <= 0) {
                return;
            }
            if ((element.isBlock() || element.f15425h.getName().equals("br")) && !TextNode.a(this.f15448a)) {
                this.f15448a.append(" ");
            }
        }
    }

    public void tail(Node node, int i) {
    }
}
