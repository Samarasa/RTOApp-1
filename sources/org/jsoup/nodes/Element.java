package org.jsoup.nodes;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Collector;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.Selector;

public class Element extends Node {

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f15424g = Pattern.compile("\\s+");
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public Tag f15425h;

    public Element(Tag tag, String str) {
        this(tag, str, new Attributes());
    }

    public Element(Tag tag, String str, Attributes attributes) {
        super(str, attributes);
        Validate.notNull(tag);
        this.f15425h = tag;
    }

    private static <E extends Element> Integer a(Element element, List<E> list) {
        Validate.notNull(element);
        Validate.notNull(list);
        for (int i = 0; i < list.size(); i++) {
            if (((Element) list.get(i)) == element) {
                return Integer.valueOf(i);
            }
        }
        return null;
    }

    private void a(StringBuilder sb) {
        for (Node a2 : this.f15439c) {
            a2.a((Appendable) sb);
        }
    }

    private static void a(Element element, StringBuilder sb) {
        if (element.f15425h.getName().equals("br") && !TextNode.a(sb)) {
            sb.append(" ");
        }
    }

    private static void a(Element element, Elements elements) {
        Element parent = element.parent();
        if (parent != null && !parent.tagName().equals("#root")) {
            elements.add(parent);
            a(parent, elements);
        }
    }

    private void b(StringBuilder sb) {
        for (Node next : this.f15439c) {
            if (next instanceof TextNode) {
                b(sb, (TextNode) next);
            } else if (next instanceof Element) {
                a((Element) next, sb);
            }
        }
    }

    /* access modifiers changed from: private */
    public static void b(StringBuilder sb, TextNode textNode) {
        String wholeText = textNode.getWholeText();
        if (e(textNode.f15438b)) {
            sb.append(wholeText);
        } else {
            StringUtil.appendNormalisedWhitespace(sb, wholeText, TextNode.a(sb));
        }
    }

    static boolean e(Node node) {
        if (node == null || !(node instanceof Element)) {
            return false;
        }
        Element element = (Element) node;
        return element.f15425h.preserveWhitespace() || (element.parent() != null && element.parent().f15425h.preserveWhitespace());
    }

    public Element addClass(String str) {
        Validate.notNull(str);
        Set<String> classNames = classNames();
        classNames.add(str);
        classNames(classNames);
        return this;
    }

    public Element after(String str) {
        super.after(str);
        return this;
    }

    public Element after(Node node) {
        super.after(node);
        return this;
    }

    public Element append(String str) {
        Validate.notNull(str);
        List<Node> parseFragment = Parser.parseFragment(str, this, baseUri());
        a((Node[]) parseFragment.toArray(new Node[parseFragment.size()]));
        return this;
    }

    public Element appendChild(Node node) {
        Validate.notNull(node);
        c(node);
        b();
        this.f15439c.add(node);
        node.a(this.f15439c.size() - 1);
        return this;
    }

    public Element appendElement(String str) {
        Element element = new Element(Tag.valueOf(str), baseUri());
        appendChild(element);
        return element;
    }

    public Element appendText(String str) {
        Validate.notNull(str);
        appendChild(new TextNode(str, baseUri()));
        return this;
    }

    public Element attr(String str, String str2) {
        super.attr(str, str2);
        return this;
    }

    public Element attr(String str, boolean z) {
        this.f15440d.put(str, z);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void b(Appendable appendable, int i, Document.OutputSettings outputSettings) {
        String str;
        if (outputSettings.prettyPrint() && ((this.f15425h.formatAsBlock() || ((parent() != null && parent().tag().formatAsBlock()) || outputSettings.outline())) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0))) {
            a(appendable, i, outputSettings);
        }
        appendable.append("<").append(tagName());
        this.f15440d.a(appendable, outputSettings);
        if (!this.f15439c.isEmpty() || !this.f15425h.isSelfClosing()) {
            str = ">";
        } else if (outputSettings.syntax() != Document.OutputSettings.Syntax.html || !this.f15425h.isEmpty()) {
            str = " />";
        } else {
            appendable.append('>');
            return;
        }
        appendable.append(str);
    }

    public Element before(String str) {
        super.before(str);
        return this;
    }

    public Element before(Node node) {
        super.before(node);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void c(Appendable appendable, int i, Document.OutputSettings outputSettings) {
        if (!this.f15439c.isEmpty() || !this.f15425h.isSelfClosing()) {
            if (outputSettings.prettyPrint() && !this.f15439c.isEmpty() && (this.f15425h.formatAsBlock() || (outputSettings.outline() && (this.f15439c.size() > 1 || (this.f15439c.size() == 1 && !(this.f15439c.get(0) instanceof TextNode)))))) {
                a(appendable, i, outputSettings);
            }
            appendable.append("</").append(tagName()).append(">");
        }
    }

    public Element child(int i) {
        return (Element) children().get(i);
    }

    public Elements children() {
        ArrayList arrayList = new ArrayList(this.f15439c.size());
        for (Node next : this.f15439c) {
            if (next instanceof Element) {
                arrayList.add((Element) next);
            }
        }
        return new Elements((List<Element>) arrayList);
    }

    public String className() {
        return attr("class").trim();
    }

    public Set<String> classNames() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(f15424g.split(className())));
        linkedHashSet.remove(BuildConfig.FLAVOR);
        return linkedHashSet;
    }

    public Element classNames(Set<String> set) {
        Validate.notNull(set);
        this.f15440d.put("class", StringUtil.join((Collection) set, " "));
        return this;
    }

    public Element clone() {
        return (Element) super.clone();
    }

    public String cssSelector() {
        StringBuilder sb;
        String sb2;
        if (id().length() > 0) {
            sb = new StringBuilder();
            sb.append("#");
            sb2 = id();
        } else {
            StringBuilder sb3 = new StringBuilder(tagName().replace(':', '|'));
            String join = StringUtil.join((Collection) classNames(), ".");
            if (join.length() > 0) {
                sb3.append('.');
                sb3.append(join);
            }
            if (parent() == null || (parent() instanceof Document)) {
                return sb3.toString();
            }
            sb3.insert(0, " > ");
            if (parent().select(sb3.toString()).size() > 1) {
                sb3.append(String.format(":nth-child(%d)", new Object[]{Integer.valueOf(elementSiblingIndex().intValue() + 1)}));
            }
            sb = new StringBuilder();
            sb.append(parent().cssSelector());
            sb2 = sb3.toString();
        }
        sb.append(sb2);
        return sb.toString();
    }

    public String data() {
        String data;
        StringBuilder sb = new StringBuilder();
        for (Node next : this.f15439c) {
            if (next instanceof DataNode) {
                data = ((DataNode) next).getWholeData();
            } else if (next instanceof Element) {
                data = ((Element) next).data();
            }
            sb.append(data);
        }
        return sb.toString();
    }

    public List<DataNode> dataNodes() {
        ArrayList arrayList = new ArrayList();
        for (Node next : this.f15439c) {
            if (next instanceof DataNode) {
                arrayList.add((DataNode) next);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Map<String, String> dataset() {
        return this.f15440d.dataset();
    }

    public Integer elementSiblingIndex() {
        if (parent() == null) {
            return 0;
        }
        return a(this, parent().children());
    }

    public Element empty() {
        this.f15439c.clear();
        return this;
    }

    public Element firstElementSibling() {
        Elements children = parent().children();
        if (children.size() > 1) {
            return (Element) children.get(0);
        }
        return null;
    }

    public Elements getAllElements() {
        return Collector.collect(new Evaluator.AllElements(), this);
    }

    public Element getElementById(String str) {
        Validate.notEmpty(str);
        Elements collect = Collector.collect(new Evaluator.Id(str), this);
        if (collect.size() > 0) {
            return (Element) collect.get(0);
        }
        return null;
    }

    public Elements getElementsByAttribute(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.Attribute(str.trim()), this);
    }

    public Elements getElementsByAttributeStarting(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.AttributeStarting(str.trim()), this);
    }

    public Elements getElementsByAttributeValue(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValue(str, str2), this);
    }

    public Elements getElementsByAttributeValueContaining(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueContaining(str, str2), this);
    }

    public Elements getElementsByAttributeValueEnding(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueEnding(str, str2), this);
    }

    public Elements getElementsByAttributeValueMatching(String str, String str2) {
        try {
            return getElementsByAttributeValueMatching(str, Pattern.compile(str2));
        } catch (PatternSyntaxException e2) {
            throw new IllegalArgumentException("Pattern syntax error: " + str2, e2);
        }
    }

    public Elements getElementsByAttributeValueMatching(String str, Pattern pattern) {
        return Collector.collect(new Evaluator.AttributeWithValueMatching(str, pattern), this);
    }

    public Elements getElementsByAttributeValueNot(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueNot(str, str2), this);
    }

    public Elements getElementsByAttributeValueStarting(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueStarting(str, str2), this);
    }

    public Elements getElementsByClass(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.Class(str), this);
    }

    public Elements getElementsByIndexEquals(int i) {
        return Collector.collect(new Evaluator.IndexEquals(i), this);
    }

    public Elements getElementsByIndexGreaterThan(int i) {
        return Collector.collect(new Evaluator.IndexGreaterThan(i), this);
    }

    public Elements getElementsByIndexLessThan(int i) {
        return Collector.collect(new Evaluator.IndexLessThan(i), this);
    }

    public Elements getElementsByTag(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.Tag(str.toLowerCase().trim()), this);
    }

    public Elements getElementsContainingOwnText(String str) {
        return Collector.collect(new Evaluator.ContainsOwnText(str), this);
    }

    public Elements getElementsContainingText(String str) {
        return Collector.collect(new Evaluator.ContainsText(str), this);
    }

    public Elements getElementsMatchingOwnText(String str) {
        try {
            return getElementsMatchingOwnText(Pattern.compile(str));
        } catch (PatternSyntaxException e2) {
            throw new IllegalArgumentException("Pattern syntax error: " + str, e2);
        }
    }

    public Elements getElementsMatchingOwnText(Pattern pattern) {
        return Collector.collect(new Evaluator.MatchesOwn(pattern), this);
    }

    public Elements getElementsMatchingText(String str) {
        try {
            return getElementsMatchingText(Pattern.compile(str));
        } catch (PatternSyntaxException e2) {
            throw new IllegalArgumentException("Pattern syntax error: " + str, e2);
        }
    }

    public Elements getElementsMatchingText(Pattern pattern) {
        return Collector.collect(new Evaluator.Matches(pattern), this);
    }

    public boolean hasClass(String str) {
        String str2 = this.f15440d.get("class");
        int length = str2.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(str2);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isWhitespace(str2.charAt(i2))) {
                    if (!z) {
                        continue;
                    } else if (i2 - i == length2 && str2.regionMatches(true, i, str, 0, length2)) {
                        return true;
                    } else {
                        z = false;
                    }
                } else if (!z) {
                    i = i2;
                    z = true;
                }
            }
            if (z && length - i == length2) {
                return str2.regionMatches(true, i, str, 0, length2);
            }
        }
        return false;
    }

    public boolean hasText() {
        for (Node next : this.f15439c) {
            if (next instanceof TextNode) {
                if (!((TextNode) next).isBlank()) {
                    return true;
                }
            } else if ((next instanceof Element) && ((Element) next).hasText()) {
                return true;
            }
        }
        return false;
    }

    public <T extends Appendable> T html(T t) {
        for (Node a2 : this.f15439c) {
            a2.a((Appendable) t);
        }
        return t;
    }

    public String html() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return e().prettyPrint() ? sb.toString().trim() : sb.toString();
    }

    public Element html(String str) {
        empty();
        append(str);
        return this;
    }

    public String id() {
        return this.f15440d.getIgnoreCase("id");
    }

    public Element insertChildren(int i, Collection<? extends Node> collection) {
        Validate.notNull(collection, "Children collection to be inserted must not be null.");
        int childNodeSize = childNodeSize();
        if (i < 0) {
            i += childNodeSize + 1;
        }
        Validate.isTrue(i >= 0 && i <= childNodeSize, "Insert position out of bounds.");
        ArrayList arrayList = new ArrayList(collection);
        a(i, (Node[]) arrayList.toArray(new Node[arrayList.size()]));
        return this;
    }

    public boolean isBlock() {
        return this.f15425h.isBlock();
    }

    public Element lastElementSibling() {
        Elements children = parent().children();
        if (children.size() > 1) {
            return (Element) children.get(children.size() - 1);
        }
        return null;
    }

    public Element nextElementSibling() {
        if (this.f15438b == null) {
            return null;
        }
        Elements children = parent().children();
        Integer a2 = a(this, children);
        Validate.notNull(a2);
        if (children.size() > a2.intValue() + 1) {
            return (Element) children.get(a2.intValue() + 1);
        }
        return null;
    }

    public String nodeName() {
        return this.f15425h.getName();
    }

    public String ownText() {
        StringBuilder sb = new StringBuilder();
        b(sb);
        return sb.toString().trim();
    }

    public final Element parent() {
        return (Element) this.f15438b;
    }

    public Elements parents() {
        Elements elements = new Elements();
        a(this, elements);
        return elements;
    }

    public Element prepend(String str) {
        Validate.notNull(str);
        List<Node> parseFragment = Parser.parseFragment(str, this, baseUri());
        a(0, (Node[]) parseFragment.toArray(new Node[parseFragment.size()]));
        return this;
    }

    public Element prependChild(Node node) {
        Validate.notNull(node);
        a(0, node);
        return this;
    }

    public Element prependElement(String str) {
        Element element = new Element(Tag.valueOf(str), baseUri());
        prependChild(element);
        return element;
    }

    public Element prependText(String str) {
        Validate.notNull(str);
        prependChild(new TextNode(str, baseUri()));
        return this;
    }

    public Element previousElementSibling() {
        if (this.f15438b == null) {
            return null;
        }
        Elements children = parent().children();
        Integer a2 = a(this, children);
        Validate.notNull(a2);
        if (a2.intValue() > 0) {
            return (Element) children.get(a2.intValue() - 1);
        }
        return null;
    }

    public Element removeClass(String str) {
        Validate.notNull(str);
        Set<String> classNames = classNames();
        classNames.remove(str);
        classNames(classNames);
        return this;
    }

    public Elements select(String str) {
        return Selector.select(str, this);
    }

    public Elements siblingElements() {
        if (this.f15438b == null) {
            return new Elements(0);
        }
        Elements<Element> children = parent().children();
        Elements elements = new Elements(children.size() - 1);
        for (Element element : children) {
            if (element != this) {
                elements.add(element);
            }
        }
        return elements;
    }

    public Tag tag() {
        return this.f15425h;
    }

    public String tagName() {
        return this.f15425h.getName();
    }

    public Element tagName(String str) {
        Validate.notEmpty(str, "Tag name must not be empty.");
        this.f15425h = Tag.valueOf(str, ParseSettings.preserveCase);
        return this;
    }

    public String text() {
        StringBuilder sb = new StringBuilder();
        new NodeTraversor(new b(this, sb)).traverse(this);
        return sb.toString().trim();
    }

    public Element text(String str) {
        Validate.notNull(str);
        empty();
        appendChild(new TextNode(str, this.f15441e));
        return this;
    }

    public List<TextNode> textNodes() {
        ArrayList arrayList = new ArrayList();
        for (Node next : this.f15439c) {
            if (next instanceof TextNode) {
                arrayList.add((TextNode) next);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public String toString() {
        return outerHtml();
    }

    public Element toggleClass(String str) {
        Validate.notNull(str);
        Set<String> classNames = classNames();
        if (classNames.contains(str)) {
            classNames.remove(str);
        } else {
            classNames.add(str);
        }
        classNames(classNames);
        return this;
    }

    public String val() {
        return tagName().equals("textarea") ? text() : attr("value");
    }

    public Element val(String str) {
        if (tagName().equals("textarea")) {
            text(str);
        } else {
            attr("value", str);
        }
        return this;
    }

    public Element wrap(String str) {
        return (Element) super.wrap(str);
    }
}
