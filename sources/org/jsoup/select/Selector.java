package org.jsoup.select;

import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;

public class Selector {

    /* renamed from: a  reason: collision with root package name */
    private final Evaluator f15575a;

    /* renamed from: b  reason: collision with root package name */
    private final Element f15576b;

    public static class SelectorParseException extends IllegalStateException {
        public SelectorParseException(String str, Object... objArr) {
            super(String.format(str, objArr));
        }
    }

    private Selector(String str, Element element) {
        Validate.notNull(str);
        String trim = str.trim();
        Validate.notEmpty(trim);
        Validate.notNull(element);
        this.f15575a = b.a(trim);
        this.f15576b = element;
    }

    private Selector(Evaluator evaluator, Element element) {
        Validate.notNull(evaluator);
        Validate.notNull(element);
        this.f15575a = evaluator;
        this.f15576b = element;
    }

    private Elements a() {
        return Collector.collect(this.f15575a, this.f15576b);
    }

    static Elements a(Collection<Element> collection, Collection<Element> collection2) {
        Elements elements = new Elements();
        for (Element next : collection) {
            boolean z = false;
            Iterator<Element> it = collection2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (next.equals(it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                elements.add(next);
            }
        }
        return elements;
    }

    public static Elements select(String str, Iterable<Element> iterable) {
        Validate.notEmpty(str);
        Validate.notNull(iterable);
        Evaluator a2 = b.a(str);
        ArrayList arrayList = new ArrayList();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        for (Element select : iterable) {
            Iterator it = select(a2, select).iterator();
            while (it.hasNext()) {
                Element element = (Element) it.next();
                if (!identityHashMap.containsKey(element)) {
                    arrayList.add(element);
                    identityHashMap.put(element, Boolean.TRUE);
                }
            }
        }
        return new Elements((List<Element>) arrayList);
    }

    public static Elements select(String str, Element element) {
        return new Selector(str, element).a();
    }

    public static Elements select(Evaluator evaluator, Element element) {
        return new Selector(evaluator, element).a();
    }
}
