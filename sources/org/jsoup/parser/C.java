package org.jsoup.parser;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.BooleanAttribute;

abstract class C {

    /* renamed from: a  reason: collision with root package name */
    h f15454a;

    static final class a extends C {

        /* renamed from: b  reason: collision with root package name */
        private String f15455b;

        a() {
            super();
            this.f15454a = h.Character;
        }

        /* access modifiers changed from: package-private */
        public a a(String str) {
            this.f15455b = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public C l() {
            this.f15455b = null;
            return this;
        }

        /* access modifiers changed from: package-private */
        public String n() {
            return this.f15455b;
        }

        public String toString() {
            return n();
        }
    }

    static final class b extends C {

        /* renamed from: b  reason: collision with root package name */
        final StringBuilder f15456b = new StringBuilder();

        /* renamed from: c  reason: collision with root package name */
        boolean f15457c = false;

        b() {
            super();
            this.f15454a = h.Comment;
        }

        /* access modifiers changed from: package-private */
        public C l() {
            C.a(this.f15456b);
            this.f15457c = false;
            return this;
        }

        /* access modifiers changed from: package-private */
        public String n() {
            return this.f15456b.toString();
        }

        public String toString() {
            return "<!--" + n() + "-->";
        }
    }

    static final class c extends C {

        /* renamed from: b  reason: collision with root package name */
        final StringBuilder f15458b = new StringBuilder();

        /* renamed from: c  reason: collision with root package name */
        final StringBuilder f15459c = new StringBuilder();

        /* renamed from: d  reason: collision with root package name */
        final StringBuilder f15460d = new StringBuilder();

        /* renamed from: e  reason: collision with root package name */
        boolean f15461e = false;

        c() {
            super();
            this.f15454a = h.Doctype;
        }

        /* access modifiers changed from: package-private */
        public C l() {
            C.a(this.f15458b);
            C.a(this.f15459c);
            C.a(this.f15460d);
            this.f15461e = false;
            return this;
        }

        /* access modifiers changed from: package-private */
        public String n() {
            return this.f15458b.toString();
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return this.f15459c.toString();
        }

        public String p() {
            return this.f15460d.toString();
        }

        public boolean q() {
            return this.f15461e;
        }
    }

    static final class d extends C {
        d() {
            super();
            this.f15454a = h.EOF;
        }

        /* access modifiers changed from: package-private */
        public C l() {
            return this;
        }
    }

    static final class e extends g {
        e() {
            this.f15454a = h.EndTag;
        }

        public String toString() {
            return "</" + q() + ">";
        }
    }

    static final class f extends g {
        f() {
            this.j = new Attributes();
            this.f15454a = h.StartTag;
        }

        /* access modifiers changed from: package-private */
        public f a(String str, Attributes attributes) {
            this.f15462b = str;
            this.j = attributes;
            this.f15463c = this.f15462b.toLowerCase();
            return this;
        }

        /* access modifiers changed from: package-private */
        public g l() {
            super.l();
            this.j = new Attributes();
            return this;
        }

        public String toString() {
            StringBuilder sb;
            String q;
            Attributes attributes = this.j;
            if (attributes == null || attributes.size() <= 0) {
                sb = new StringBuilder();
                sb.append("<");
                q = q();
            } else {
                sb = new StringBuilder();
                sb.append("<");
                sb.append(q());
                sb.append(" ");
                q = this.j.toString();
            }
            sb.append(q);
            sb.append(">");
            return sb.toString();
        }
    }

    static abstract class g extends C {

        /* renamed from: b  reason: collision with root package name */
        protected String f15462b;

        /* renamed from: c  reason: collision with root package name */
        protected String f15463c;

        /* renamed from: d  reason: collision with root package name */
        private String f15464d;

        /* renamed from: e  reason: collision with root package name */
        private StringBuilder f15465e = new StringBuilder();

        /* renamed from: f  reason: collision with root package name */
        private String f15466f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f15467g = false;

        /* renamed from: h  reason: collision with root package name */
        private boolean f15468h = false;
        boolean i = false;
        Attributes j;

        g() {
            super();
        }

        private void u() {
            this.f15468h = true;
            String str = this.f15466f;
            if (str != null) {
                this.f15465e.append(str);
                this.f15466f = null;
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(char c2) {
            a(String.valueOf(c2));
        }

        /* access modifiers changed from: package-private */
        public final void a(String str) {
            String str2 = this.f15464d;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f15464d = str;
        }

        /* access modifiers changed from: package-private */
        public final void a(int[] iArr) {
            u();
            for (int appendCodePoint : iArr) {
                this.f15465e.appendCodePoint(appendCodePoint);
            }
        }

        /* access modifiers changed from: package-private */
        public final void b(char c2) {
            u();
            this.f15465e.append(c2);
        }

        /* access modifiers changed from: package-private */
        public final void b(String str) {
            u();
            if (this.f15465e.length() == 0) {
                this.f15466f = str;
            } else {
                this.f15465e.append(str);
            }
        }

        /* access modifiers changed from: package-private */
        public final void c(char c2) {
            c(String.valueOf(c2));
        }

        /* access modifiers changed from: package-private */
        public final void c(String str) {
            String str2 = this.f15462b;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f15462b = str;
            this.f15463c = this.f15462b.toLowerCase();
        }

        /* access modifiers changed from: package-private */
        public final g d(String str) {
            this.f15462b = str;
            this.f15463c = str.toLowerCase();
            return this;
        }

        /* access modifiers changed from: package-private */
        public g l() {
            this.f15462b = null;
            this.f15463c = null;
            this.f15464d = null;
            C.a(this.f15465e);
            this.f15466f = null;
            this.f15467g = false;
            this.f15468h = false;
            this.i = false;
            this.j = null;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final void n() {
            if (this.f15464d != null) {
                r();
            }
        }

        /* access modifiers changed from: package-private */
        public final Attributes o() {
            return this.j;
        }

        /* access modifiers changed from: package-private */
        public final boolean p() {
            return this.i;
        }

        /* access modifiers changed from: package-private */
        public final String q() {
            String str = this.f15462b;
            Validate.isFalse(str == null || str.length() == 0);
            return this.f15462b;
        }

        /* access modifiers changed from: package-private */
        public final void r() {
            Attribute attribute;
            if (this.j == null) {
                this.j = new Attributes();
            }
            String str = this.f15464d;
            if (str != null) {
                if (this.f15468h) {
                    attribute = new Attribute(str, this.f15465e.length() > 0 ? this.f15465e.toString() : this.f15466f);
                } else {
                    attribute = this.f15467g ? new Attribute(str, BuildConfig.FLAVOR) : new BooleanAttribute(str);
                }
                this.j.put(attribute);
            }
            this.f15464d = null;
            this.f15467g = false;
            this.f15468h = false;
            C.a(this.f15465e);
            this.f15466f = null;
        }

        /* access modifiers changed from: package-private */
        public final String s() {
            return this.f15463c;
        }

        /* access modifiers changed from: package-private */
        public final void t() {
            this.f15467g = true;
        }
    }

    enum h {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    private C() {
    }

    static void a(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    /* access modifiers changed from: package-private */
    public final a a() {
        return (a) this;
    }

    /* access modifiers changed from: package-private */
    public final b b() {
        return (b) this;
    }

    /* access modifiers changed from: package-private */
    public final c c() {
        return (c) this;
    }

    /* access modifiers changed from: package-private */
    public final e d() {
        return (e) this;
    }

    /* access modifiers changed from: package-private */
    public final f e() {
        return (f) this;
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        return this.f15454a == h.Character;
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        return this.f15454a == h.Comment;
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        return this.f15454a == h.Doctype;
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return this.f15454a == h.EOF;
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return this.f15454a == h.EndTag;
    }

    /* access modifiers changed from: package-private */
    public final boolean k() {
        return this.f15454a == h.StartTag;
    }

    /* access modifiers changed from: package-private */
    public abstract C l();

    /* access modifiers changed from: package-private */
    public String m() {
        return getClass().getSimpleName();
    }
}
