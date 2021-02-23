package org.jsoup.nodes;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class Document extends Element {
    private OutputSettings i = new OutputSettings();
    private QuirksMode j = QuirksMode.noQuirks;
    private String k;
    private boolean l = false;

    public static class OutputSettings implements Cloneable {

        /* renamed from: a  reason: collision with root package name */
        private Entities.EscapeMode f15416a = Entities.EscapeMode.base;

        /* renamed from: b  reason: collision with root package name */
        private Charset f15417b = Charset.forName("UTF-8");

        /* renamed from: c  reason: collision with root package name */
        private boolean f15418c = true;

        /* renamed from: d  reason: collision with root package name */
        private boolean f15419d = false;

        /* renamed from: e  reason: collision with root package name */
        private int f15420e = 1;

        /* renamed from: f  reason: collision with root package name */
        private Syntax f15421f = Syntax.html;

        public enum Syntax {
            html,
            xml
        }

        /* access modifiers changed from: package-private */
        public CharsetEncoder a() {
            return this.f15417b.newEncoder();
        }

        public Charset charset() {
            return this.f15417b;
        }

        public OutputSettings charset(String str) {
            charset(Charset.forName(str));
            return this;
        }

        public OutputSettings charset(Charset charset) {
            this.f15417b = charset;
            return this;
        }

        public OutputSettings clone() {
            try {
                OutputSettings outputSettings = (OutputSettings) super.clone();
                outputSettings.charset(this.f15417b.name());
                outputSettings.f15416a = Entities.EscapeMode.valueOf(this.f15416a.name());
                return outputSettings;
            } catch (CloneNotSupportedException e2) {
                throw new RuntimeException(e2);
            }
        }

        public OutputSettings escapeMode(Entities.EscapeMode escapeMode) {
            this.f15416a = escapeMode;
            return this;
        }

        public Entities.EscapeMode escapeMode() {
            return this.f15416a;
        }

        public int indentAmount() {
            return this.f15420e;
        }

        public OutputSettings indentAmount(int i) {
            Validate.isTrue(i >= 0);
            this.f15420e = i;
            return this;
        }

        public OutputSettings outline(boolean z) {
            this.f15419d = z;
            return this;
        }

        public boolean outline() {
            return this.f15419d;
        }

        public OutputSettings prettyPrint(boolean z) {
            this.f15418c = z;
            return this;
        }

        public boolean prettyPrint() {
            return this.f15418c;
        }

        public Syntax syntax() {
            return this.f15421f;
        }

        public OutputSettings syntax(Syntax syntax) {
            this.f15421f = syntax;
            return this;
        }
    }

    public enum QuirksMode {
        noQuirks,
        quirks,
        limitedQuirks
    }

    public Document(String str) {
        super(Tag.valueOf("#root", ParseSettings.htmlDefault), str);
        this.k = str;
    }

    private Element a(String str, Node node) {
        if (node.nodeName().equals(str)) {
            return (Element) node;
        }
        for (Node a2 : node.f15439c) {
            Element a3 = a(str, a2);
            if (a3 != null) {
                return a3;
            }
        }
        return null;
    }

    private void a(String str, Element element) {
        Elements elementsByTag = getElementsByTag(str);
        Element first = elementsByTag.first();
        if (elementsByTag.size() > 1) {
            ArrayList<Node> arrayList = new ArrayList<>();
            for (int i2 = 1; i2 < elementsByTag.size(); i2++) {
                Node node = (Node) elementsByTag.get(i2);
                for (Node add : node.f15439c) {
                    arrayList.add(add);
                }
                node.remove();
            }
            for (Node appendChild : arrayList) {
                first.appendChild(appendChild);
            }
        }
        if (!first.parent().equals(element)) {
            element.appendChild(first);
        }
    }

    private void b(Element element) {
        ArrayList arrayList = new ArrayList();
        for (Node next : element.f15439c) {
            if (next instanceof TextNode) {
                TextNode textNode = (TextNode) next;
                if (!textNode.isBlank()) {
                    arrayList.add(textNode);
                }
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Node node = (Node) arrayList.get(size);
            element.b(node);
            body().prependChild(new TextNode(" ", BuildConfig.FLAVOR));
            body().prependChild(node);
        }
    }

    public static Document createShell(String str) {
        Validate.notNull(str);
        Document document = new Document(str);
        Element appendElement = document.appendElement("html");
        appendElement.appendElement("head");
        appendElement.appendElement("body");
        return document;
    }

    private void f() {
        XmlDeclaration xmlDeclaration;
        if (this.l) {
            OutputSettings.Syntax syntax = outputSettings().syntax();
            if (syntax == OutputSettings.Syntax.html) {
                Element first = select("meta[charset]").first();
                if (first == null) {
                    Element head = head();
                    if (head != null) {
                        first = head.appendElement("meta");
                    }
                    select("meta[name=charset]").remove();
                }
                first.attr("charset", charset().displayName());
                select("meta[name=charset]").remove();
            } else if (syntax == OutputSettings.Syntax.xml) {
                Node node = childNodes().get(0);
                if (node instanceof XmlDeclaration) {
                    XmlDeclaration xmlDeclaration2 = (XmlDeclaration) node;
                    if (xmlDeclaration2.name().equals("xml")) {
                        xmlDeclaration2.attr("encoding", charset().displayName());
                        if (xmlDeclaration2.attr("version") != null) {
                            xmlDeclaration2.attr("version", "1.0");
                            return;
                        }
                        return;
                    }
                    xmlDeclaration = new XmlDeclaration("xml", this.f15441e, false);
                } else {
                    xmlDeclaration = new XmlDeclaration("xml", this.f15441e, false);
                }
                xmlDeclaration.attr("version", "1.0");
                xmlDeclaration.attr("encoding", charset().displayName());
                prependChild(xmlDeclaration);
            }
        }
    }

    public Element body() {
        return a("body", (Node) this);
    }

    public Charset charset() {
        return this.i.charset();
    }

    public void charset(Charset charset) {
        updateMetaCharsetElement(true);
        this.i.charset(charset);
        f();
    }

    public Document clone() {
        Document document = (Document) super.clone();
        document.i = this.i.clone();
        return document;
    }

    public Element createElement(String str) {
        return new Element(Tag.valueOf(str, ParseSettings.preserveCase), baseUri());
    }

    public Element head() {
        return a("head", (Node) this);
    }

    public String location() {
        return this.k;
    }

    public String nodeName() {
        return "#document";
    }

    public Document normalise() {
        Element a2 = a("html", (Node) this);
        if (a2 == null) {
            a2 = appendElement("html");
        }
        if (head() == null) {
            a2.prependElement("head");
        }
        if (body() == null) {
            a2.appendElement("body");
        }
        b(head());
        b(a2);
        b(this);
        a("head", a2);
        a("body", a2);
        f();
        return this;
    }

    public String outerHtml() {
        return super.html();
    }

    public OutputSettings outputSettings() {
        return this.i;
    }

    public Document outputSettings(OutputSettings outputSettings) {
        Validate.notNull(outputSettings);
        this.i = outputSettings;
        return this;
    }

    public QuirksMode quirksMode() {
        return this.j;
    }

    public Document quirksMode(QuirksMode quirksMode) {
        this.j = quirksMode;
        return this;
    }

    public Element text(String str) {
        body().text(str);
        return this;
    }

    public String title() {
        Element first = getElementsByTag("title").first();
        return first != null ? StringUtil.normaliseWhitespace(first.text()).trim() : BuildConfig.FLAVOR;
    }

    public void title(String str) {
        Validate.notNull(str);
        Element first = getElementsByTag("title").first();
        if (first == null) {
            head().appendElement("title").text(str);
        } else {
            first.text(str);
        }
    }

    public void updateMetaCharsetElement(boolean z) {
        this.l = z;
    }

    public boolean updateMetaCharsetElement() {
        return this.l;
    }
}
