package org.jsoup.select;

import java.util.Iterator;
import org.jsoup.nodes.Element;

abstract class c extends Evaluator {

    /* renamed from: a  reason: collision with root package name */
    Evaluator f15586a;

    static class a extends c {
        public a(Evaluator evaluator) {
            this.f15586a = evaluator;
        }

        public boolean matches(Element element, Element element2) {
            Iterator it = element2.getAllElements().iterator();
            while (it.hasNext()) {
                Element element3 = (Element) it.next();
                if (element3 != element2 && this.f15586a.matches(element, element3)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format(":has(%s)", new Object[]{this.f15586a});
        }
    }

    static class b extends c {
        public b(Evaluator evaluator) {
            this.f15586a = evaluator;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
            r4 = r4.parent();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean matches(org.jsoup.nodes.Element r3, org.jsoup.nodes.Element r4) {
            /*
                r2 = this;
                r0 = 0
                if (r3 != r4) goto L_0x0004
                return r0
            L_0x0004:
                org.jsoup.nodes.Element r4 = r4.parent()
                if (r4 == 0) goto L_0x0013
                org.jsoup.select.Evaluator r1 = r2.f15586a
                boolean r3 = r1.matches(r3, r4)
                if (r3 == 0) goto L_0x0013
                r0 = 1
            L_0x0013:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.c.b.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element):boolean");
        }

        public String toString() {
            return String.format(":ImmediateParent%s", new Object[]{this.f15586a});
        }
    }

    /* renamed from: org.jsoup.select.c$c  reason: collision with other inner class name */
    static class C0093c extends c {
        public C0093c(Evaluator evaluator) {
            this.f15586a = evaluator;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
            r4 = r4.previousElementSibling();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean matches(org.jsoup.nodes.Element r3, org.jsoup.nodes.Element r4) {
            /*
                r2 = this;
                r0 = 0
                if (r3 != r4) goto L_0x0004
                return r0
            L_0x0004:
                org.jsoup.nodes.Element r4 = r4.previousElementSibling()
                if (r4 == 0) goto L_0x0013
                org.jsoup.select.Evaluator r1 = r2.f15586a
                boolean r3 = r1.matches(r3, r4)
                if (r3 == 0) goto L_0x0013
                r0 = 1
            L_0x0013:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.c.C0093c.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element):boolean");
        }

        public String toString() {
            return String.format(":prev%s", new Object[]{this.f15586a});
        }
    }

    static class d extends c {
        public d(Evaluator evaluator) {
            this.f15586a = evaluator;
        }

        public boolean matches(Element element, Element element2) {
            return !this.f15586a.matches(element, element2);
        }

        public String toString() {
            return String.format(":not%s", new Object[]{this.f15586a});
        }
    }

    static class e extends c {
        public e(Evaluator evaluator) {
            this.f15586a = evaluator;
        }

        public boolean matches(Element element, Element element2) {
            if (element == element2) {
                return false;
            }
            do {
                element2 = element2.parent();
                if (this.f15586a.matches(element, element2)) {
                    return true;
                }
            } while (element2 != element);
            return false;
        }

        public String toString() {
            return String.format(":parent%s", new Object[]{this.f15586a});
        }
    }

    static class f extends c {
        public f(Evaluator evaluator) {
            this.f15586a = evaluator;
        }

        public boolean matches(Element element, Element element2) {
            if (element == element2) {
                return false;
            }
            do {
                element2 = element2.previousElementSibling();
                if (element2 == null) {
                    return false;
                }
            } while (!this.f15586a.matches(element, element2));
            return true;
        }

        public String toString() {
            return String.format(":prev*%s", new Object[]{this.f15586a});
        }
    }

    static class g extends Evaluator {
        g() {
        }

        public boolean matches(Element element, Element element2) {
            return element == element2;
        }
    }

    c() {
    }
}
