package org.jsoup.select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Element;

abstract class a extends Evaluator {

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<Evaluator> f15577a;

    /* renamed from: b  reason: collision with root package name */
    int f15578b;

    /* renamed from: org.jsoup.select.a$a  reason: collision with other inner class name */
    static final class C0092a extends a {
        C0092a(Collection<Evaluator> collection) {
            super(collection);
        }

        C0092a(Evaluator... evaluatorArr) {
            this((Collection<Evaluator>) Arrays.asList(evaluatorArr));
        }

        public boolean matches(Element element, Element element2) {
            for (int i = 0; i < this.f15578b; i++) {
                if (!this.f15577a.get(i).matches(element, element2)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return StringUtil.join((Collection) this.f15577a, " ");
        }
    }

    static final class b extends a {
        b() {
        }

        b(Collection<Evaluator> collection) {
            if (this.f15578b > 1) {
                this.f15577a.add(new C0092a(collection));
            } else {
                this.f15577a.addAll(collection);
            }
            b();
        }

        b(Evaluator... evaluatorArr) {
            this((Collection<Evaluator>) Arrays.asList(evaluatorArr));
        }

        public void b(Evaluator evaluator) {
            this.f15577a.add(evaluator);
            b();
        }

        public boolean matches(Element element, Element element2) {
            for (int i = 0; i < this.f15578b; i++) {
                if (this.f15577a.get(i).matches(element, element2)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format(":or%s", new Object[]{this.f15577a});
        }
    }

    a() {
        this.f15578b = 0;
        this.f15577a = new ArrayList<>();
    }

    a(Collection<Evaluator> collection) {
        this();
        this.f15577a.addAll(collection);
        b();
    }

    /* access modifiers changed from: package-private */
    public Evaluator a() {
        int i = this.f15578b;
        if (i > 0) {
            return this.f15577a.get(i - 1);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(Evaluator evaluator) {
        this.f15577a.set(this.f15578b - 1, evaluator);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f15578b = this.f15577a.size();
    }
}
