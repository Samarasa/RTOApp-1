package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

public class Collector {

    private static class a implements NodeVisitor {

        /* renamed from: a  reason: collision with root package name */
        private final Element f15554a;

        /* renamed from: b  reason: collision with root package name */
        private final Elements f15555b;

        /* renamed from: c  reason: collision with root package name */
        private final Evaluator f15556c;

        a(Element element, Elements elements, Evaluator evaluator) {
            this.f15554a = element;
            this.f15555b = elements;
            this.f15556c = evaluator;
        }

        public void head(Node node, int i) {
            if (node instanceof Element) {
                Element element = (Element) node;
                if (this.f15556c.matches(this.f15554a, element)) {
                    this.f15555b.add(element);
                }
            }
        }

        public void tail(Node node, int i) {
        }
    }

    private Collector() {
    }

    public static Elements collect(Evaluator evaluator, Element element) {
        Elements elements = new Elements();
        new NodeTraversor(new a(element, elements, evaluator)).traverse(element);
        return elements;
    }
}
