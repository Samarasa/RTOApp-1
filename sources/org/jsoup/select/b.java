package org.jsoup.select;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.parser.TokenQueue;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.jsoup.select.a;
import org.jsoup.select.c;

class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f15579a = {",", ">", "+", "~", " "};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f15580b = {"=", "!=", "^=", "$=", "*=", "~="};

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f15581c = Pattern.compile("((\\+|-)?(\\d+)?)n(\\s*(\\+|-)?\\s*\\d+)?", 2);

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f15582d = Pattern.compile("(\\+|-)?(\\d+)");

    /* renamed from: e  reason: collision with root package name */
    private TokenQueue f15583e;

    /* renamed from: f  reason: collision with root package name */
    private String f15584f;

    /* renamed from: g  reason: collision with root package name */
    private List<Evaluator> f15585g = new ArrayList();

    private b(String str) {
        this.f15584f = str;
        this.f15583e = new TokenQueue(str);
    }

    public static Evaluator a(String str) {
        return new b(str).a();
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(char r11) {
        /*
            r10 = this;
            org.jsoup.parser.TokenQueue r0 = r10.f15583e
            r0.consumeWhitespace()
            java.lang.String r0 = r10.h()
            org.jsoup.select.Evaluator r0 = a((java.lang.String) r0)
            java.util.List<org.jsoup.select.Evaluator> r1 = r10.f15585g
            int r1 = r1.size()
            r2 = 44
            r3 = 1
            r4 = 0
            if (r1 != r3) goto L_0x0033
            java.util.List<org.jsoup.select.Evaluator> r1 = r10.f15585g
            java.lang.Object r1 = r1.get(r4)
            org.jsoup.select.Evaluator r1 = (org.jsoup.select.Evaluator) r1
            boolean r5 = r1 instanceof org.jsoup.select.a.b
            if (r5 == 0) goto L_0x003a
            if (r11 == r2) goto L_0x003a
            r5 = r1
            org.jsoup.select.a$b r5 = (org.jsoup.select.a.b) r5
            org.jsoup.select.Evaluator r5 = r5.a()
            r6 = 1
            r9 = r5
            r5 = r1
            r1 = r9
            goto L_0x003c
        L_0x0033:
            org.jsoup.select.a$a r1 = new org.jsoup.select.a$a
            java.util.List<org.jsoup.select.Evaluator> r5 = r10.f15585g
            r1.<init>((java.util.Collection<org.jsoup.select.Evaluator>) r5)
        L_0x003a:
            r5 = r1
            r6 = 0
        L_0x003c:
            java.util.List<org.jsoup.select.Evaluator> r7 = r10.f15585g
            r7.clear()
            r7 = 62
            r8 = 2
            if (r11 != r7) goto L_0x0057
            org.jsoup.select.a$a r11 = new org.jsoup.select.a$a
            org.jsoup.select.Evaluator[] r2 = new org.jsoup.select.Evaluator[r8]
            r2[r4] = r0
            org.jsoup.select.c$b r0 = new org.jsoup.select.c$b
            r0.<init>(r1)
            r2[r3] = r0
            r11.<init>((org.jsoup.select.Evaluator[]) r2)
            goto L_0x00ae
        L_0x0057:
            r7 = 32
            if (r11 != r7) goto L_0x006c
            org.jsoup.select.a$a r11 = new org.jsoup.select.a$a
            org.jsoup.select.Evaluator[] r2 = new org.jsoup.select.Evaluator[r8]
            r2[r4] = r0
            org.jsoup.select.c$e r0 = new org.jsoup.select.c$e
            r0.<init>(r1)
            r2[r3] = r0
            r11.<init>((org.jsoup.select.Evaluator[]) r2)
            goto L_0x00ae
        L_0x006c:
            r7 = 43
            if (r11 != r7) goto L_0x0081
            org.jsoup.select.a$a r11 = new org.jsoup.select.a$a
            org.jsoup.select.Evaluator[] r2 = new org.jsoup.select.Evaluator[r8]
            r2[r4] = r0
            org.jsoup.select.c$c r0 = new org.jsoup.select.c$c
            r0.<init>(r1)
            r2[r3] = r0
            r11.<init>((org.jsoup.select.Evaluator[]) r2)
            goto L_0x00ae
        L_0x0081:
            r7 = 126(0x7e, float:1.77E-43)
            if (r11 != r7) goto L_0x0096
            org.jsoup.select.a$a r11 = new org.jsoup.select.a$a
            org.jsoup.select.Evaluator[] r2 = new org.jsoup.select.Evaluator[r8]
            r2[r4] = r0
            org.jsoup.select.c$f r0 = new org.jsoup.select.c$f
            r0.<init>(r1)
            r2[r3] = r0
            r11.<init>((org.jsoup.select.Evaluator[]) r2)
            goto L_0x00ae
        L_0x0096:
            if (r11 != r2) goto L_0x00bd
            boolean r11 = r1 instanceof org.jsoup.select.a.b
            if (r11 == 0) goto L_0x00a3
            org.jsoup.select.a$b r1 = (org.jsoup.select.a.b) r1
            r1.b(r0)
            r11 = r1
            goto L_0x00ae
        L_0x00a3:
            org.jsoup.select.a$b r11 = new org.jsoup.select.a$b
            r11.<init>()
            r11.b(r1)
            r11.b(r0)
        L_0x00ae:
            if (r6 == 0) goto L_0x00b7
            r0 = r5
            org.jsoup.select.a$b r0 = (org.jsoup.select.a.b) r0
            r0.a(r11)
            r11 = r5
        L_0x00b7:
            java.util.List<org.jsoup.select.Evaluator> r0 = r10.f15585g
            r0.add(r11)
            return
        L_0x00bd:
            org.jsoup.select.Selector$SelectorParseException r0 = new org.jsoup.select.Selector$SelectorParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown combinator: "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0.<init>(r11, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.b.a(char):void");
    }

    private void a(boolean z) {
        List<Evaluator> list;
        Object obj;
        this.f15583e.consume(z ? ":containsOwn" : ":contains");
        String unescape = TokenQueue.unescape(this.f15583e.chompBalanced('(', ')'));
        Validate.notEmpty(unescape, ":contains(text) query must not be empty");
        if (z) {
            list = this.f15585g;
            obj = new Evaluator.ContainsOwnText(unescape);
        } else {
            list = this.f15585g;
            obj = new Evaluator.ContainsText(unescape);
        }
        list.add(obj);
    }

    private void a(boolean z, boolean z2) {
        Object obj;
        List<Evaluator> list;
        String lowerCase = this.f15583e.chompTo(")").trim().toLowerCase();
        Matcher matcher = f15581c.matcher(lowerCase);
        Matcher matcher2 = f15582d.matcher(lowerCase);
        int i = 2;
        int i2 = 0;
        if ("odd".equals(lowerCase)) {
            i2 = 1;
        } else if (!"even".equals(lowerCase)) {
            if (matcher.matches()) {
                int parseInt = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", BuildConfig.FLAVOR)) : 1;
                if (matcher.group(4) != null) {
                    i2 = Integer.parseInt(matcher.group(4).replaceFirst("^\\+", BuildConfig.FLAVOR));
                }
                i = parseInt;
            } else if (matcher2.matches()) {
                i2 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", BuildConfig.FLAVOR));
                i = 0;
            } else {
                throw new Selector.SelectorParseException("Could not parse nth-index '%s': unexpected format", lowerCase);
            }
        }
        if (z2) {
            if (z) {
                list = this.f15585g;
                obj = new Evaluator.IsNthLastOfType(i, i2);
            } else {
                list = this.f15585g;
                obj = new Evaluator.IsNthOfType(i, i2);
            }
        } else if (z) {
            list = this.f15585g;
            obj = new Evaluator.IsNthLastChild(i, i2);
        } else {
            list = this.f15585g;
            obj = new Evaluator.IsNthChild(i, i2);
        }
        list.add(obj);
    }

    private void b() {
        this.f15585g.add(new Evaluator.AllElements());
    }

    private void b(boolean z) {
        List<Evaluator> list;
        Object obj;
        this.f15583e.consume(z ? ":matchesOwn" : ":matches");
        String chompBalanced = this.f15583e.chompBalanced('(', ')');
        Validate.notEmpty(chompBalanced, ":matches(regex) query must not be empty");
        if (z) {
            list = this.f15585g;
            obj = new Evaluator.MatchesOwn(Pattern.compile(chompBalanced));
        } else {
            list = this.f15585g;
            obj = new Evaluator.Matches(Pattern.compile(chompBalanced));
        }
        list.add(obj);
    }

    private void c() {
        List<Evaluator> list;
        Object attributeWithValueMatching;
        Object obj;
        List<Evaluator> list2;
        TokenQueue tokenQueue = new TokenQueue(this.f15583e.chompBalanced('[', ']'));
        String consumeToAny = tokenQueue.consumeToAny(f15580b);
        Validate.notEmpty(consumeToAny);
        tokenQueue.consumeWhitespace();
        if (tokenQueue.isEmpty()) {
            if (consumeToAny.startsWith("^")) {
                list2 = this.f15585g;
                obj = new Evaluator.AttributeStarting(consumeToAny.substring(1));
            } else {
                list2 = this.f15585g;
                obj = new Evaluator.Attribute(consumeToAny);
            }
            list2.add(obj);
            return;
        }
        if (tokenQueue.matchChomp("=")) {
            list = this.f15585g;
            attributeWithValueMatching = new Evaluator.AttributeWithValue(consumeToAny, tokenQueue.remainder());
        } else if (tokenQueue.matchChomp("!=")) {
            list = this.f15585g;
            attributeWithValueMatching = new Evaluator.AttributeWithValueNot(consumeToAny, tokenQueue.remainder());
        } else if (tokenQueue.matchChomp("^=")) {
            list = this.f15585g;
            attributeWithValueMatching = new Evaluator.AttributeWithValueStarting(consumeToAny, tokenQueue.remainder());
        } else if (tokenQueue.matchChomp("$=")) {
            list = this.f15585g;
            attributeWithValueMatching = new Evaluator.AttributeWithValueEnding(consumeToAny, tokenQueue.remainder());
        } else if (tokenQueue.matchChomp("*=")) {
            list = this.f15585g;
            attributeWithValueMatching = new Evaluator.AttributeWithValueContaining(consumeToAny, tokenQueue.remainder());
        } else if (tokenQueue.matchChomp("~=")) {
            list = this.f15585g;
            attributeWithValueMatching = new Evaluator.AttributeWithValueMatching(consumeToAny, Pattern.compile(tokenQueue.remainder()));
        } else {
            throw new Selector.SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", this.f15584f, tokenQueue.remainder());
        }
        list.add(attributeWithValueMatching);
    }

    private void d() {
        String consumeCssIdentifier = this.f15583e.consumeCssIdentifier();
        Validate.notEmpty(consumeCssIdentifier);
        this.f15585g.add(new Evaluator.Class(consumeCssIdentifier.trim()));
    }

    private void e() {
        String consumeCssIdentifier = this.f15583e.consumeCssIdentifier();
        Validate.notEmpty(consumeCssIdentifier);
        this.f15585g.add(new Evaluator.Id(consumeCssIdentifier));
    }

    private void f() {
        String consumeElementSelector = this.f15583e.consumeElementSelector();
        Validate.notEmpty(consumeElementSelector);
        if (consumeElementSelector.startsWith("*|")) {
            this.f15585g.add(new a.b(new Evaluator.Tag(consumeElementSelector.trim().toLowerCase()), new Evaluator.TagEndsWith(consumeElementSelector.replace("*|", ":").trim().toLowerCase())));
            return;
        }
        if (consumeElementSelector.contains("|")) {
            consumeElementSelector = consumeElementSelector.replace("|", ":");
        }
        this.f15585g.add(new Evaluator.Tag(consumeElementSelector.trim()));
    }

    private int g() {
        String trim = this.f15583e.chompTo(")").trim();
        Validate.isTrue(StringUtil.isNumeric(trim), "Index must be numeric");
        return Integer.parseInt(trim);
    }

    private String h() {
        String str;
        StringBuilder sb = new StringBuilder();
        while (!this.f15583e.isEmpty()) {
            if (this.f15583e.matches("(")) {
                sb.append("(");
                sb.append(this.f15583e.chompBalanced('(', ')'));
                str = ")";
            } else if (this.f15583e.matches("[")) {
                sb.append("[");
                sb.append(this.f15583e.chompBalanced('[', ']'));
                str = "]";
            } else if (this.f15583e.matchesAny(f15579a)) {
                break;
            } else {
                sb.append(this.f15583e.consume());
            }
            sb.append(str);
        }
        return sb.toString();
    }

    private void i() {
        List<Evaluator> list;
        Object isRoot;
        if (this.f15583e.matchChomp("#")) {
            e();
        } else if (this.f15583e.matchChomp(".")) {
            d();
        } else if (this.f15583e.matchesWord() || this.f15583e.matches("*|")) {
            f();
        } else if (this.f15583e.matches("[")) {
            c();
        } else if (this.f15583e.matchChomp("*")) {
            b();
        } else if (this.f15583e.matchChomp(":lt(")) {
            m();
        } else if (this.f15583e.matchChomp(":gt(")) {
            l();
        } else if (this.f15583e.matchChomp(":eq(")) {
            k();
        } else if (this.f15583e.matches(":has(")) {
            j();
        } else if (this.f15583e.matches(":contains(")) {
            a(false);
        } else if (this.f15583e.matches(":containsOwn(")) {
            a(true);
        } else if (this.f15583e.matches(":matches(")) {
            b(false);
        } else if (this.f15583e.matches(":matchesOwn(")) {
            b(true);
        } else if (this.f15583e.matches(":not(")) {
            n();
        } else if (this.f15583e.matchChomp(":nth-child(")) {
            a(false, false);
        } else if (this.f15583e.matchChomp(":nth-last-child(")) {
            a(true, false);
        } else if (this.f15583e.matchChomp(":nth-of-type(")) {
            a(false, true);
        } else if (this.f15583e.matchChomp(":nth-last-of-type(")) {
            a(true, true);
        } else {
            if (this.f15583e.matchChomp(":first-child")) {
                list = this.f15585g;
                isRoot = new Evaluator.IsFirstChild();
            } else if (this.f15583e.matchChomp(":last-child")) {
                list = this.f15585g;
                isRoot = new Evaluator.IsLastChild();
            } else if (this.f15583e.matchChomp(":first-of-type")) {
                list = this.f15585g;
                isRoot = new Evaluator.IsFirstOfType();
            } else if (this.f15583e.matchChomp(":last-of-type")) {
                list = this.f15585g;
                isRoot = new Evaluator.IsLastOfType();
            } else if (this.f15583e.matchChomp(":only-child")) {
                list = this.f15585g;
                isRoot = new Evaluator.IsOnlyChild();
            } else if (this.f15583e.matchChomp(":only-of-type")) {
                list = this.f15585g;
                isRoot = new Evaluator.IsOnlyOfType();
            } else if (this.f15583e.matchChomp(":empty")) {
                list = this.f15585g;
                isRoot = new Evaluator.IsEmpty();
            } else if (this.f15583e.matchChomp(":root")) {
                list = this.f15585g;
                isRoot = new Evaluator.IsRoot();
            } else {
                throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.f15584f, this.f15583e.remainder());
            }
            list.add(isRoot);
        }
    }

    private void j() {
        this.f15583e.consume(":has");
        String chompBalanced = this.f15583e.chompBalanced('(', ')');
        Validate.notEmpty(chompBalanced, ":has(el) subselect must not be empty");
        this.f15585g.add(new c.a(a(chompBalanced)));
    }

    private void k() {
        this.f15585g.add(new Evaluator.IndexEquals(g()));
    }

    private void l() {
        this.f15585g.add(new Evaluator.IndexGreaterThan(g()));
    }

    private void m() {
        this.f15585g.add(new Evaluator.IndexLessThan(g()));
    }

    private void n() {
        this.f15583e.consume(":not");
        String chompBalanced = this.f15583e.chompBalanced('(', ')');
        Validate.notEmpty(chompBalanced, ":not(selector) subselect must not be empty");
        this.f15585g.add(new c.d(a(chompBalanced)));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jsoup.select.Evaluator a() {
        /*
            r3 = this;
            org.jsoup.parser.TokenQueue r0 = r3.f15583e
            r0.consumeWhitespace()
            org.jsoup.parser.TokenQueue r0 = r3.f15583e
            java.lang.String[] r1 = f15579a
            boolean r0 = r0.matchesAny((java.lang.String[]) r1)
            if (r0 == 0) goto L_0x0023
            java.util.List<org.jsoup.select.Evaluator> r0 = r3.f15585g
            org.jsoup.select.c$g r1 = new org.jsoup.select.c$g
            r1.<init>()
            r0.add(r1)
        L_0x0019:
            org.jsoup.parser.TokenQueue r0 = r3.f15583e
            char r0 = r0.consume()
        L_0x001f:
            r3.a((char) r0)
            goto L_0x0026
        L_0x0023:
            r3.i()
        L_0x0026:
            org.jsoup.parser.TokenQueue r0 = r3.f15583e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0044
            org.jsoup.parser.TokenQueue r0 = r3.f15583e
            boolean r0 = r0.consumeWhitespace()
            org.jsoup.parser.TokenQueue r1 = r3.f15583e
            java.lang.String[] r2 = f15579a
            boolean r1 = r1.matchesAny((java.lang.String[]) r2)
            if (r1 == 0) goto L_0x003f
            goto L_0x0019
        L_0x003f:
            if (r0 == 0) goto L_0x0023
            r0 = 32
            goto L_0x001f
        L_0x0044:
            java.util.List<org.jsoup.select.Evaluator> r0 = r3.f15585g
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L_0x0057
            java.util.List<org.jsoup.select.Evaluator> r0 = r3.f15585g
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            org.jsoup.select.Evaluator r0 = (org.jsoup.select.Evaluator) r0
            return r0
        L_0x0057:
            org.jsoup.select.a$a r0 = new org.jsoup.select.a$a
            java.util.List<org.jsoup.select.Evaluator> r1 = r3.f15585g
            r0.<init>((java.util.Collection<org.jsoup.select.Evaluator>) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.b.a():org.jsoup.select.Evaluator");
    }
}
