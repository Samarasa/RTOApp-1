package org.jsoup.select;

import java.util.Iterator;
import java.util.regex.Pattern;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;

public abstract class Evaluator {

    public static final class AllElements extends Evaluator {
        public boolean matches(Element element, Element element2) {
            return true;
        }

        public String toString() {
            return "*";
        }
    }

    public static final class Attribute extends Evaluator {

        /* renamed from: a  reason: collision with root package name */
        private String f15557a;

        public Attribute(String str) {
            this.f15557a = str;
        }

        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.f15557a);
        }

        public String toString() {
            return String.format("[%s]", new Object[]{this.f15557a});
        }
    }

    public static abstract class AttributeKeyPair extends Evaluator {

        /* renamed from: a  reason: collision with root package name */
        String f15558a;

        /* renamed from: b  reason: collision with root package name */
        String f15559b;

        public AttributeKeyPair(String str, String str2) {
            Validate.notEmpty(str);
            Validate.notEmpty(str2);
            this.f15558a = str.trim().toLowerCase();
            if ((str2.startsWith("\"") && str2.endsWith("\"")) || (str2.startsWith("'") && str2.endsWith("'"))) {
                str2 = str2.substring(1, str2.length() - 1);
            }
            this.f15559b = str2.trim().toLowerCase();
        }
    }

    public static final class AttributeStarting extends Evaluator {

        /* renamed from: a  reason: collision with root package name */
        private String f15560a;

        public AttributeStarting(String str) {
            Validate.notEmpty(str);
            this.f15560a = str.toLowerCase();
        }

        public boolean matches(Element element, Element element2) {
            for (org.jsoup.nodes.Attribute key : element2.attributes().asList()) {
                if (key.getKey().toLowerCase().startsWith(this.f15560a)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("[^%s]", new Object[]{this.f15560a});
        }
    }

    public static final class AttributeWithValue extends AttributeKeyPair {
        public AttributeWithValue(String str, String str2) {
            super(str, str2);
        }

        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.f15558a) && this.f15559b.equalsIgnoreCase(element2.attr(this.f15558a).trim());
        }

        public String toString() {
            return String.format("[%s=%s]", new Object[]{this.f15558a, this.f15559b});
        }
    }

    public static final class AttributeWithValueContaining extends AttributeKeyPair {
        public AttributeWithValueContaining(String str, String str2) {
            super(str, str2);
        }

        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.f15558a) && element2.attr(this.f15558a).toLowerCase().contains(this.f15559b);
        }

        public String toString() {
            return String.format("[%s*=%s]", new Object[]{this.f15558a, this.f15559b});
        }
    }

    public static final class AttributeWithValueEnding extends AttributeKeyPair {
        public AttributeWithValueEnding(String str, String str2) {
            super(str, str2);
        }

        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.f15558a) && element2.attr(this.f15558a).toLowerCase().endsWith(this.f15559b);
        }

        public String toString() {
            return String.format("[%s$=%s]", new Object[]{this.f15558a, this.f15559b});
        }
    }

    public static final class AttributeWithValueMatching extends Evaluator {

        /* renamed from: a  reason: collision with root package name */
        String f15561a;

        /* renamed from: b  reason: collision with root package name */
        Pattern f15562b;

        public AttributeWithValueMatching(String str, Pattern pattern) {
            this.f15561a = str.trim().toLowerCase();
            this.f15562b = pattern;
        }

        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.f15561a) && this.f15562b.matcher(element2.attr(this.f15561a)).find();
        }

        public String toString() {
            return String.format("[%s~=%s]", new Object[]{this.f15561a, this.f15562b.toString()});
        }
    }

    public static final class AttributeWithValueNot extends AttributeKeyPair {
        public AttributeWithValueNot(String str, String str2) {
            super(str, str2);
        }

        public boolean matches(Element element, Element element2) {
            return !this.f15559b.equalsIgnoreCase(element2.attr(this.f15558a));
        }

        public String toString() {
            return String.format("[%s!=%s]", new Object[]{this.f15558a, this.f15559b});
        }
    }

    public static final class AttributeWithValueStarting extends AttributeKeyPair {
        public AttributeWithValueStarting(String str, String str2) {
            super(str, str2);
        }

        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.f15558a) && element2.attr(this.f15558a).toLowerCase().startsWith(this.f15559b);
        }

        public String toString() {
            return String.format("[%s^=%s]", new Object[]{this.f15558a, this.f15559b});
        }
    }

    public static final class Class extends Evaluator {

        /* renamed from: a  reason: collision with root package name */
        private String f15563a;

        public Class(String str) {
            this.f15563a = str;
        }

        public boolean matches(Element element, Element element2) {
            return element2.hasClass(this.f15563a);
        }

        public String toString() {
            return String.format(".%s", new Object[]{this.f15563a});
        }
    }

    public static final class ContainsOwnText extends Evaluator {

        /* renamed from: a  reason: collision with root package name */
        private String f15564a;

        public ContainsOwnText(String str) {
            this.f15564a = str.toLowerCase();
        }

        public boolean matches(Element element, Element element2) {
            return element2.ownText().toLowerCase().contains(this.f15564a);
        }

        public String toString() {
            return String.format(":containsOwn(%s", new Object[]{this.f15564a});
        }
    }

    public static final class ContainsText extends Evaluator {

        /* renamed from: a  reason: collision with root package name */
        private String f15565a;

        public ContainsText(String str) {
            this.f15565a = str.toLowerCase();
        }

        public boolean matches(Element element, Element element2) {
            return element2.text().toLowerCase().contains(this.f15565a);
        }

        public String toString() {
            return String.format(":contains(%s", new Object[]{this.f15565a});
        }
    }

    public static abstract class CssNthEvaluator extends Evaluator {

        /* renamed from: a  reason: collision with root package name */
        protected final int f15566a;

        /* renamed from: b  reason: collision with root package name */
        protected final int f15567b;

        public CssNthEvaluator(int i) {
            this(0, i);
        }

        public CssNthEvaluator(int i, int i2) {
            this.f15566a = i;
            this.f15567b = i2;
        }

        /* access modifiers changed from: protected */
        public abstract int a(Element element, Element element2);

        /* access modifiers changed from: protected */
        public abstract String a();

        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            if (parent == null || (parent instanceof Document)) {
                return false;
            }
            int a2 = a(element, element2);
            int i = this.f15566a;
            if (i == 0) {
                return a2 == this.f15567b;
            }
            int i2 = this.f15567b;
            return (a2 - i2) * i >= 0 && (a2 - i2) % i == 0;
        }

        public String toString() {
            if (this.f15566a == 0) {
                return String.format(":%s(%d)", new Object[]{a(), Integer.valueOf(this.f15567b)});
            } else if (this.f15567b == 0) {
                return String.format(":%s(%dn)", new Object[]{a(), Integer.valueOf(this.f15566a)});
            } else {
                return String.format(":%s(%dn%+d)", new Object[]{a(), Integer.valueOf(this.f15566a), Integer.valueOf(this.f15567b)});
            }
        }
    }

    public static final class Id extends Evaluator {

        /* renamed from: a  reason: collision with root package name */
        private String f15568a;

        public Id(String str) {
            this.f15568a = str;
        }

        public boolean matches(Element element, Element element2) {
            return this.f15568a.equals(element2.id());
        }

        public String toString() {
            return String.format("#%s", new Object[]{this.f15568a});
        }
    }

    public static final class IndexEquals extends IndexEvaluator {
        public IndexEquals(int i) {
            super(i);
        }

        public boolean matches(Element element, Element element2) {
            return element2.elementSiblingIndex().intValue() == this.f15569a;
        }

        public String toString() {
            return String.format(":eq(%d)", new Object[]{Integer.valueOf(this.f15569a)});
        }
    }

    public static abstract class IndexEvaluator extends Evaluator {

        /* renamed from: a  reason: collision with root package name */
        int f15569a;

        public IndexEvaluator(int i) {
            this.f15569a = i;
        }
    }

    public static final class IndexGreaterThan extends IndexEvaluator {
        public IndexGreaterThan(int i) {
            super(i);
        }

        public boolean matches(Element element, Element element2) {
            return element2.elementSiblingIndex().intValue() > this.f15569a;
        }

        public String toString() {
            return String.format(":gt(%d)", new Object[]{Integer.valueOf(this.f15569a)});
        }
    }

    public static final class IndexLessThan extends IndexEvaluator {
        public IndexLessThan(int i) {
            super(i);
        }

        public boolean matches(Element element, Element element2) {
            return element2.elementSiblingIndex().intValue() < this.f15569a;
        }

        public String toString() {
            return String.format(":lt(%d)", new Object[]{Integer.valueOf(this.f15569a)});
        }
    }

    public static final class IsEmpty extends Evaluator {
        public boolean matches(Element element, Element element2) {
            for (Node next : element2.childNodes()) {
                if (!(next instanceof Comment) && !(next instanceof XmlDeclaration) && !(next instanceof DocumentType)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return ":empty";
        }
    }

    public static final class IsFirstChild extends Evaluator {
        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            return parent != null && !(parent instanceof Document) && element2.elementSiblingIndex().intValue() == 0;
        }

        public String toString() {
            return ":first-child";
        }
    }

    public static final class IsFirstOfType extends IsNthOfType {
        public IsFirstOfType() {
            super(0, 1);
        }

        public String toString() {
            return ":first-of-type";
        }
    }

    public static final class IsLastChild extends Evaluator {
        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            return parent != null && !(parent instanceof Document) && element2.elementSiblingIndex().intValue() == parent.children().size() - 1;
        }

        public String toString() {
            return ":last-child";
        }
    }

    public static final class IsLastOfType extends IsNthLastOfType {
        public IsLastOfType() {
            super(0, 1);
        }

        public String toString() {
            return ":last-of-type";
        }
    }

    public static final class IsNthChild extends CssNthEvaluator {
        public IsNthChild(int i, int i2) {
            super(i, i2);
        }

        /* access modifiers changed from: protected */
        public int a(Element element, Element element2) {
            return element2.elementSiblingIndex().intValue() + 1;
        }

        /* access modifiers changed from: protected */
        public String a() {
            return "nth-child";
        }
    }

    public static final class IsNthLastChild extends CssNthEvaluator {
        public IsNthLastChild(int i, int i2) {
            super(i, i2);
        }

        /* access modifiers changed from: protected */
        public int a(Element element, Element element2) {
            return element2.parent().children().size() - element2.elementSiblingIndex().intValue();
        }

        /* access modifiers changed from: protected */
        public String a() {
            return "nth-last-child";
        }
    }

    public static class IsNthLastOfType extends CssNthEvaluator {
        public IsNthLastOfType(int i, int i2) {
            super(i, i2);
        }

        /* access modifiers changed from: protected */
        public int a(Element element, Element element2) {
            Elements children = element2.parent().children();
            int i = 0;
            for (int intValue = element2.elementSiblingIndex().intValue(); intValue < children.size(); intValue++) {
                if (((Element) children.get(intValue)).tag().equals(element2.tag())) {
                    i++;
                }
            }
            return i;
        }

        /* access modifiers changed from: protected */
        public String a() {
            return "nth-last-of-type";
        }
    }

    public static class IsNthOfType extends CssNthEvaluator {
        public IsNthOfType(int i, int i2) {
            super(i, i2);
        }

        /* access modifiers changed from: protected */
        public int a(Element element, Element element2) {
            Iterator it = element2.parent().children().iterator();
            int i = 0;
            while (it.hasNext()) {
                Element element3 = (Element) it.next();
                if (element3.tag().equals(element2.tag())) {
                    i++;
                    continue;
                }
                if (element3 == element2) {
                    break;
                }
            }
            return i;
        }

        /* access modifiers changed from: protected */
        public String a() {
            return "nth-of-type";
        }
    }

    public static final class IsOnlyChild extends Evaluator {
        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            return parent != null && !(parent instanceof Document) && element2.siblingElements().size() == 0;
        }

        public String toString() {
            return ":only-child";
        }
    }

    public static final class IsOnlyOfType extends Evaluator {
        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            if (parent == null || (parent instanceof Document)) {
                return false;
            }
            Iterator it = parent.children().iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((Element) it.next()).tag().equals(element2.tag())) {
                    i++;
                }
            }
            return i == 1;
        }

        public String toString() {
            return ":only-of-type";
        }
    }

    public static final class IsRoot extends Evaluator {
        public boolean matches(Element element, Element element2) {
            if (element instanceof Document) {
                element = element.child(0);
            }
            return element2 == element;
        }

        public String toString() {
            return ":root";
        }
    }

    public static final class Matches extends Evaluator {

        /* renamed from: a  reason: collision with root package name */
        private Pattern f15570a;

        public Matches(Pattern pattern) {
            this.f15570a = pattern;
        }

        public boolean matches(Element element, Element element2) {
            return this.f15570a.matcher(element2.text()).find();
        }

        public String toString() {
            return String.format(":matches(%s", new Object[]{this.f15570a});
        }
    }

    public static final class MatchesOwn extends Evaluator {

        /* renamed from: a  reason: collision with root package name */
        private Pattern f15571a;

        public MatchesOwn(Pattern pattern) {
            this.f15571a = pattern;
        }

        public boolean matches(Element element, Element element2) {
            return this.f15571a.matcher(element2.ownText()).find();
        }

        public String toString() {
            return String.format(":matchesOwn(%s", new Object[]{this.f15571a});
        }
    }

    public static final class Tag extends Evaluator {

        /* renamed from: a  reason: collision with root package name */
        private String f15572a;

        public Tag(String str) {
            this.f15572a = str;
        }

        public boolean matches(Element element, Element element2) {
            return element2.tagName().equalsIgnoreCase(this.f15572a);
        }

        public String toString() {
            return String.format("%s", new Object[]{this.f15572a});
        }
    }

    public static final class TagEndsWith extends Evaluator {

        /* renamed from: a  reason: collision with root package name */
        private String f15573a;

        public TagEndsWith(String str) {
            this.f15573a = str;
        }

        public boolean matches(Element element, Element element2) {
            return element2.tagName().endsWith(this.f15573a);
        }

        public String toString() {
            return String.format("%s", new Object[]{this.f15573a});
        }
    }

    protected Evaluator() {
    }

    public abstract boolean matches(Element element, Element element2);
}
