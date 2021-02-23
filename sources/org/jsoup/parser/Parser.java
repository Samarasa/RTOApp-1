package org.jsoup.parser;

import java.util.List;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

public class Parser {

    /* renamed from: a  reason: collision with root package name */
    private Va f15488a;

    /* renamed from: b  reason: collision with root package name */
    private int f15489b = 0;

    /* renamed from: c  reason: collision with root package name */
    private A f15490c;

    /* renamed from: d  reason: collision with root package name */
    private ParseSettings f15491d;

    public Parser(Va va) {
        this.f15488a = va;
        this.f15491d = va.b();
    }

    public static Parser htmlParser() {
        return new Parser(new HtmlTreeBuilder());
    }

    public static Document parse(String str, String str2) {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        return htmlTreeBuilder.b(str, str2, A.f(), htmlTreeBuilder.b());
    }

    public static Document parseBodyFragment(String str, String str2) {
        Document createShell = Document.createShell(str2);
        Element body = createShell.body();
        List<Node> parseFragment = parseFragment(str, body, str2);
        Node[] nodeArr = (Node[]) parseFragment.toArray(new Node[parseFragment.size()]);
        for (int length = nodeArr.length - 1; length > 0; length--) {
            nodeArr[length].remove();
        }
        for (Node appendChild : nodeArr) {
            body.appendChild(appendChild);
        }
        return createShell;
    }

    public static Document parseBodyFragmentRelaxed(String str, String str2) {
        return parse(str, str2);
    }

    public static List<Node> parseFragment(String str, Element element, String str2) {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        return htmlTreeBuilder.a(str, element, str2, A.f(), htmlTreeBuilder.b());
    }

    public static List<Node> parseXmlFragment(String str, String str2) {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        return xmlTreeBuilder.c(str, str2, A.f(), xmlTreeBuilder.b());
    }

    public static String unescapeEntities(String str, boolean z) {
        return new D(new C3356a(str), A.f()).b(z);
    }

    public static Parser xmlParser() {
        return new Parser(new XmlTreeBuilder());
    }

    public List<ParseError> getErrors() {
        return this.f15490c;
    }

    public Va getTreeBuilder() {
        return this.f15488a;
    }

    public boolean isTrackErrors() {
        return this.f15489b > 0;
    }

    public Document parseInput(String str, String str2) {
        this.f15490c = isTrackErrors() ? A.j(this.f15489b) : A.f();
        return this.f15488a.b(str, str2, this.f15490c, this.f15491d);
    }

    public Parser setTrackErrors(int i) {
        this.f15489b = i;
        return this;
    }

    public Parser setTreeBuilder(Va va) {
        this.f15488a = va;
        return this;
    }

    public ParseSettings settings() {
        return this.f15491d;
    }

    public Parser settings(ParseSettings parseSettings) {
        this.f15491d = parseSettings;
        return this;
    }
}
