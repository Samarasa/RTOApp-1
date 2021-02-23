package org.jsoup.parser;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.h  reason: case insensitive filesystem */
class C3370h extends C3403z {
    C3370h(String str, int i) {
        super(str, i, (C3378l) null);
    }

    private boolean b(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.a((C3403z) this);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (r9.a().nodeName().equals("optgroup") != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
        if (r9.a().nodeName().equals("option") != false) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(org.jsoup.parser.C r8, org.jsoup.parser.HtmlTreeBuilder r9) {
        /*
            r7 = this;
            int[] r0 = org.jsoup.parser.C3388q.f15524a
            org.jsoup.parser.C$h r1 = r8.f15454a
            int r1 = r1.ordinal()
            r0 = r0[r1]
            java.lang.String r1 = "html"
            r2 = 0
            java.lang.String r3 = "select"
            java.lang.String r4 = "optgroup"
            java.lang.String r5 = "option"
            switch(r0) {
                case 1: goto L_0x015b;
                case 2: goto L_0x0157;
                case 3: goto L_0x00c9;
                case 4: goto L_0x0049;
                case 5: goto L_0x002e;
                case 6: goto L_0x001b;
                default: goto L_0x0016;
            }
        L_0x0016:
            boolean r8 = r7.b(r8, r9)
            return r8
        L_0x001b:
            org.jsoup.nodes.Element r8 = r9.a()
            java.lang.String r8 = r8.nodeName()
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x0162
        L_0x0029:
            r9.a((org.jsoup.parser.C3403z) r7)
            goto L_0x0162
        L_0x002e:
            org.jsoup.parser.C$a r8 = r8.a()
            java.lang.String r0 = r8.n()
            java.lang.String r1 = org.jsoup.parser.C3403z.x
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0044
            r9.a((org.jsoup.parser.C3403z) r7)
            return r2
        L_0x0044:
            r9.a((org.jsoup.parser.C.a) r8)
            goto L_0x0162
        L_0x0049:
            org.jsoup.parser.C$e r0 = r8.d()
            java.lang.String r0 = r0.s()
            boolean r1 = r0.equals(r4)
            if (r1 == 0) goto L_0x0093
            org.jsoup.nodes.Element r8 = r9.a()
            java.lang.String r8 = r8.nodeName()
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L_0x0084
            org.jsoup.nodes.Element r8 = r9.a()
            org.jsoup.nodes.Element r8 = r9.a((org.jsoup.nodes.Element) r8)
            if (r8 == 0) goto L_0x0084
            org.jsoup.nodes.Element r8 = r9.a()
            org.jsoup.nodes.Element r8 = r9.a((org.jsoup.nodes.Element) r8)
            java.lang.String r8 = r8.nodeName()
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L_0x0084
            r9.a((java.lang.String) r5)
        L_0x0084:
            org.jsoup.nodes.Element r8 = r9.a()
            java.lang.String r8 = r8.nodeName()
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L_0x0029
            goto L_0x00a7
        L_0x0093:
            boolean r1 = r0.equals(r5)
            if (r1 == 0) goto L_0x00ac
            org.jsoup.nodes.Element r8 = r9.a()
            java.lang.String r8 = r8.nodeName()
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L_0x0029
        L_0x00a7:
            r9.w()
            goto L_0x0162
        L_0x00ac:
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L_0x00c4
            boolean r8 = r9.i((java.lang.String) r0)
            if (r8 != 0) goto L_0x00bc
            r9.a((org.jsoup.parser.C3403z) r7)
            return r2
        L_0x00bc:
            r9.m(r0)
            r9.z()
            goto L_0x0162
        L_0x00c4:
            boolean r8 = r7.b(r8, r9)
            return r8
        L_0x00c9:
            org.jsoup.parser.C$f r0 = r8.e()
            java.lang.String r6 = r0.s()
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x00de
            org.jsoup.parser.z r8 = org.jsoup.parser.C3403z.InBody
            boolean r8 = r9.a((org.jsoup.parser.C) r0, (org.jsoup.parser.C3403z) r8)
            return r8
        L_0x00de:
            boolean r1 = r6.equals(r5)
            if (r1 == 0) goto L_0x00ec
        L_0x00e4:
            r9.a((java.lang.String) r5)
        L_0x00e7:
            r9.a((org.jsoup.parser.C.f) r0)
            goto L_0x0162
        L_0x00ec:
            boolean r1 = r6.equals(r4)
            if (r1 == 0) goto L_0x0113
            org.jsoup.nodes.Element r8 = r9.a()
            java.lang.String r8 = r8.nodeName()
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L_0x0101
            goto L_0x00e4
        L_0x0101:
            org.jsoup.nodes.Element r8 = r9.a()
            java.lang.String r8 = r8.nodeName()
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L_0x00e7
            r9.a((java.lang.String) r4)
            goto L_0x00e7
        L_0x0113:
            boolean r1 = r6.equals(r3)
            if (r1 == 0) goto L_0x0121
            r9.a((org.jsoup.parser.C3403z) r7)
            boolean r8 = r9.a((java.lang.String) r3)
            return r8
        L_0x0121:
            java.lang.String r1 = "input"
            java.lang.String r4 = "keygen"
            java.lang.String r5 = "textarea"
            java.lang.String[] r1 = new java.lang.String[]{r1, r4, r5}
            boolean r1 = org.jsoup.helper.StringUtil.in(r6, r1)
            if (r1 == 0) goto L_0x0143
            r9.a((org.jsoup.parser.C3403z) r7)
            boolean r8 = r9.i((java.lang.String) r3)
            if (r8 != 0) goto L_0x013b
            return r2
        L_0x013b:
            r9.a((java.lang.String) r3)
            boolean r8 = r9.a((org.jsoup.parser.C) r0)
            return r8
        L_0x0143:
            java.lang.String r0 = "script"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0152
            org.jsoup.parser.z r0 = org.jsoup.parser.C3403z.InHead
            boolean r8 = r9.a((org.jsoup.parser.C) r8, (org.jsoup.parser.C3403z) r0)
            return r8
        L_0x0152:
            boolean r8 = r7.b(r8, r9)
            return r8
        L_0x0157:
            r9.a((org.jsoup.parser.C3403z) r7)
            return r2
        L_0x015b:
            org.jsoup.parser.C$b r8 = r8.b()
            r9.a((org.jsoup.parser.C.b) r8)
        L_0x0162:
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.C3370h.a(org.jsoup.parser.C, org.jsoup.parser.HtmlTreeBuilder):boolean");
    }
}
