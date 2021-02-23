package org.jsoup.safety;

import java.util.Iterator;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

public class Cleaner {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Whitelist f15541a;

    private final class a implements NodeVisitor {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f15542a;

        /* renamed from: b  reason: collision with root package name */
        private final Element f15543b;

        /* renamed from: c  reason: collision with root package name */
        private Element f15544c;

        private a(Element element, Element element2) {
            this.f15542a = 0;
            this.f15543b = element;
            this.f15544c = element2;
        }

        public void head(Node node, int i) {
            Node dataNode;
            if (node instanceof Element) {
                Element element = (Element) node;
                if (Cleaner.this.f15541a.b(element.tagName())) {
                    b a2 = Cleaner.this.a(element);
                    Element element2 = a2.f15546a;
                    this.f15544c.appendChild(element2);
                    this.f15542a += a2.f15547b;
                    this.f15544c = element2;
                    return;
                } else if (node == this.f15543b) {
                    return;
                }
            } else {
                if (node instanceof TextNode) {
                    dataNode = new TextNode(((TextNode) node).getWholeText(), node.baseUri());
                } else if ((node instanceof DataNode) && Cleaner.this.f15541a.b(node.parent().nodeName())) {
                    dataNode = new DataNode(((DataNode) node).getWholeData(), node.baseUri());
                }
                this.f15544c.appendChild(dataNode);
                return;
            }
            this.f15542a++;
        }

        public void tail(Node node, int i) {
            if ((node instanceof Element) && Cleaner.this.f15541a.b(node.nodeName())) {
                this.f15544c = this.f15544c.parent();
            }
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        Element f15546a;

        /* renamed from: b  reason: collision with root package name */
        int f15547b;

        b(Element element, int i) {
            this.f15546a = element;
            this.f15547b = i;
        }
    }

    public Cleaner(Whitelist whitelist) {
        Validate.notNull(whitelist);
        this.f15541a = whitelist;
    }

    private int a(Element element, Element element2) {
        a aVar = new a(element, element2);
        new NodeTraversor(aVar).traverse(element);
        return aVar.f15542a;
    }

    /* access modifiers changed from: private */
    public b a(Element element) {
        String tagName = element.tagName();
        Attributes attributes = new Attributes();
        Element element2 = new Element(Tag.valueOf(tagName), element.baseUri(), attributes);
        Iterator<Attribute> it = element.attributes().iterator();
        int i = 0;
        while (it.hasNext()) {
            Attribute next = it.next();
            if (this.f15541a.a(tagName, element, next)) {
                attributes.put(next);
            } else {
                i++;
            }
        }
        attributes.addAll(this.f15541a.a(tagName));
        return new b(element2, i);
    }

    public Document clean(Document document) {
        Validate.notNull(document);
        Document createShell = Document.createShell(document.baseUri());
        if (document.body() != null) {
            a(document.body(), createShell.body());
        }
        return createShell;
    }

    public boolean isValid(Document document) {
        Validate.notNull(document);
        return a(document.body(), Document.createShell(document.baseUri()).body()) == 0;
    }
}
