package org.jsoup.nodes;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.jsoup.SerializationException;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

public abstract class Node implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final List<Node> f15437a = Collections.emptyList();

    /* renamed from: b  reason: collision with root package name */
    Node f15438b;

    /* renamed from: c  reason: collision with root package name */
    List<Node> f15439c;

    /* renamed from: d  reason: collision with root package name */
    Attributes f15440d;

    /* renamed from: e  reason: collision with root package name */
    String f15441e;

    /* renamed from: f  reason: collision with root package name */
    int f15442f;

    private static class a implements NodeVisitor {

        /* renamed from: a  reason: collision with root package name */
        private Appendable f15443a;

        /* renamed from: b  reason: collision with root package name */
        private Document.OutputSettings f15444b;

        a(Appendable appendable, Document.OutputSettings outputSettings) {
            this.f15443a = appendable;
            this.f15444b = outputSettings;
        }

        public void head(Node node, int i) {
            try {
                node.b(this.f15443a, i, this.f15444b);
            } catch (IOException e2) {
                throw new SerializationException((Throwable) e2);
            }
        }

        public void tail(Node node, int i) {
            if (!node.nodeName().equals("#text")) {
                try {
                    node.c(this.f15443a, i, this.f15444b);
                } catch (IOException e2) {
                    throw new SerializationException((Throwable) e2);
                }
            }
        }
    }

    protected Node() {
        this.f15439c = f15437a;
        this.f15440d = null;
    }

    protected Node(String str) {
        this(str, new Attributes());
    }

    protected Node(String str, Attributes attributes) {
        Validate.notNull(str);
        Validate.notNull(attributes);
        this.f15439c = f15437a;
        this.f15441e = str.trim();
        this.f15440d = attributes;
    }

    private Element a(Element element) {
        Elements children = element.children();
        return children.size() > 0 ? a((Element) children.get(0)) : element;
    }

    private void a(int i, String str) {
        Validate.notNull(str);
        Validate.notNull(this.f15438b);
        List<Node> parseFragment = Parser.parseFragment(str, parent() instanceof Element ? (Element) parent() : null, baseUri());
        this.f15438b.a(i, (Node[]) parseFragment.toArray(new Node[parseFragment.size()]));
    }

    private void b(int i) {
        while (i < this.f15439c.size()) {
            this.f15439c.get(i).a(i);
            i++;
        }
    }

    /* access modifiers changed from: protected */
    public Node a(Node node) {
        try {
            Node node2 = (Node) super.clone();
            node2.f15438b = node;
            node2.f15442f = node == null ? 0 : this.f15442f;
            Attributes attributes = this.f15440d;
            node2.f15440d = attributes != null ? attributes.clone() : null;
            node2.f15441e = this.f15441e;
            node2.f15439c = new ArrayList(this.f15439c.size());
            for (Node add : this.f15439c) {
                node2.f15439c.add(add);
            }
            return node2;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i) {
        this.f15442f = i;
    }

    /* access modifiers changed from: protected */
    public void a(int i, Node... nodeArr) {
        Validate.noNullElements(nodeArr);
        b();
        for (int length = nodeArr.length - 1; length >= 0; length--) {
            Node node = nodeArr[length];
            c(node);
            this.f15439c.add(i, node);
            b(i);
        }
    }

    /* access modifiers changed from: protected */
    public void a(Appendable appendable) {
        new NodeTraversor(new a(appendable, e())).traverse(this);
    }

    /* access modifiers changed from: protected */
    public void a(Appendable appendable, int i, Document.OutputSettings outputSettings) {
        appendable.append("\n").append(StringUtil.padding(i * outputSettings.indentAmount()));
    }

    /* access modifiers changed from: protected */
    public void a(Node node, Node node2) {
        Validate.isTrue(node.f15438b == this);
        Validate.notNull(node2);
        Node node3 = node2.f15438b;
        if (node3 != null) {
            node3.b(node2);
        }
        int i = node.f15442f;
        this.f15439c.set(i, node2);
        node2.f15438b = this;
        node2.a(i);
        node.f15438b = null;
    }

    /* access modifiers changed from: protected */
    public void a(Node... nodeArr) {
        for (Node node : nodeArr) {
            c(node);
            b();
            this.f15439c.add(node);
            node.a(this.f15439c.size() - 1);
        }
    }

    /* access modifiers changed from: protected */
    public Node[] a() {
        return (Node[]) this.f15439c.toArray(new Node[childNodeSize()]);
    }

    public String absUrl(String str) {
        Validate.notEmpty(str);
        return !hasAttr(str) ? BuildConfig.FLAVOR : StringUtil.resolve(this.f15441e, attr(str));
    }

    public Node after(String str) {
        a(this.f15442f + 1, str);
        return this;
    }

    public Node after(Node node) {
        Validate.notNull(node);
        Validate.notNull(this.f15438b);
        this.f15438b.a(this.f15442f + 1, node);
        return this;
    }

    public String attr(String str) {
        Validate.notNull(str);
        String ignoreCase = this.f15440d.getIgnoreCase(str);
        return ignoreCase.length() > 0 ? ignoreCase : str.toLowerCase().startsWith("abs:") ? absUrl(str.substring(4)) : BuildConfig.FLAVOR;
    }

    public Node attr(String str, String str2) {
        this.f15440d.put(str, str2);
        return this;
    }

    public Attributes attributes() {
        return this.f15440d;
    }

    /* access modifiers changed from: protected */
    public void b() {
        if (this.f15439c == f15437a) {
            this.f15439c = new ArrayList(4);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void b(Appendable appendable, int i, Document.OutputSettings outputSettings);

    /* access modifiers changed from: protected */
    public void b(Node node) {
        Validate.isTrue(node.f15438b == this);
        int i = node.f15442f;
        this.f15439c.remove(i);
        b(i);
        node.f15438b = null;
    }

    public String baseUri() {
        return this.f15441e;
    }

    public Node before(String str) {
        a(this.f15442f, str);
        return this;
    }

    public Node before(Node node) {
        Validate.notNull(node);
        Validate.notNull(this.f15438b);
        this.f15438b.a(this.f15442f, node);
        return this;
    }

    /* access modifiers changed from: package-private */
    public abstract void c(Appendable appendable, int i, Document.OutputSettings outputSettings);

    /* access modifiers changed from: protected */
    public void c(Node node) {
        Node node2 = node.f15438b;
        if (node2 != null) {
            node2.b(node);
        }
        node.d(this);
    }

    public Node childNode(int i) {
        return this.f15439c.get(i);
    }

    public final int childNodeSize() {
        return this.f15439c.size();
    }

    public List<Node> childNodes() {
        return Collections.unmodifiableList(this.f15439c);
    }

    public List<Node> childNodesCopy() {
        ArrayList arrayList = new ArrayList(this.f15439c.size());
        for (Node clone : this.f15439c) {
            arrayList.add(clone.clone());
        }
        return arrayList;
    }

    public Node clone() {
        Node a2 = a((Node) null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(a2);
        while (!linkedList.isEmpty()) {
            Node node = (Node) linkedList.remove();
            for (int i = 0; i < node.f15439c.size(); i++) {
                Node a3 = node.f15439c.get(i).a(node);
                node.f15439c.set(i, a3);
                linkedList.add(a3);
            }
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public void d(Node node) {
        Node node2 = this.f15438b;
        if (node2 != null) {
            node2.b(this);
        }
        this.f15438b = node;
    }

    /* access modifiers changed from: package-private */
    public Document.OutputSettings e() {
        return (ownerDocument() != null ? ownerDocument() : new Document(BuildConfig.FLAVOR)).outputSettings();
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public boolean hasAttr(String str) {
        Validate.notNull(str);
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if (this.f15440d.hasKeyIgnoreCase(substring) && !absUrl(substring).equals(BuildConfig.FLAVOR)) {
                return true;
            }
        }
        return this.f15440d.hasKeyIgnoreCase(str);
    }

    public boolean hasSameValue(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return outerHtml().equals(((Node) obj).outerHtml());
    }

    public <T extends Appendable> T html(T t) {
        a((Appendable) t);
        return t;
    }

    public Node nextSibling() {
        Node node = this.f15438b;
        if (node == null) {
            return null;
        }
        List<Node> list = node.f15439c;
        int i = this.f15442f + 1;
        if (list.size() > i) {
            return list.get(i);
        }
        return null;
    }

    public abstract String nodeName();

    public String outerHtml() {
        StringBuilder sb = new StringBuilder(128);
        a((Appendable) sb);
        return sb.toString();
    }

    public Document ownerDocument() {
        if (this instanceof Document) {
            return (Document) this;
        }
        Node node = this.f15438b;
        if (node == null) {
            return null;
        }
        return node.ownerDocument();
    }

    public Node parent() {
        return this.f15438b;
    }

    public final Node parentNode() {
        return this.f15438b;
    }

    public Node previousSibling() {
        int i;
        Node node = this.f15438b;
        if (node != null && (i = this.f15442f) > 0) {
            return node.f15439c.get(i - 1);
        }
        return null;
    }

    public void remove() {
        Validate.notNull(this.f15438b);
        this.f15438b.b(this);
    }

    public Node removeAttr(String str) {
        Validate.notNull(str);
        this.f15440d.removeIgnoreCase(str);
        return this;
    }

    public void replaceWith(Node node) {
        Validate.notNull(node);
        Validate.notNull(this.f15438b);
        this.f15438b.a(this, node);
    }

    public void setBaseUri(String str) {
        Validate.notNull(str);
        traverse(new d(this, str));
    }

    public int siblingIndex() {
        return this.f15442f;
    }

    public List<Node> siblingNodes() {
        Node node = this.f15438b;
        if (node == null) {
            return Collections.emptyList();
        }
        List<Node> list = node.f15439c;
        ArrayList arrayList = new ArrayList(list.size() - 1);
        for (Node next : list) {
            if (next != this) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public String toString() {
        return outerHtml();
    }

    public Node traverse(NodeVisitor nodeVisitor) {
        Validate.notNull(nodeVisitor);
        new NodeTraversor(nodeVisitor).traverse(this);
        return this;
    }

    public Node unwrap() {
        Validate.notNull(this.f15438b);
        Node node = this.f15439c.size() > 0 ? this.f15439c.get(0) : null;
        this.f15438b.a(this.f15442f, a());
        remove();
        return node;
    }

    public Node wrap(String str) {
        Validate.notEmpty(str);
        List<Node> parseFragment = Parser.parseFragment(str, parent() instanceof Element ? (Element) parent() : null, baseUri());
        Node node = parseFragment.get(0);
        if (node == null || !(node instanceof Element)) {
            return null;
        }
        Element element = (Element) node;
        Element a2 = a(element);
        this.f15438b.a(this, (Node) element);
        a2.a(this);
        if (parseFragment.size() > 0) {
            for (int i = 0; i < parseFragment.size(); i++) {
                Node node2 = parseFragment.get(i);
                node2.f15438b.b(node2);
                element.appendChild(node2);
            }
        }
        return this;
    }
}
