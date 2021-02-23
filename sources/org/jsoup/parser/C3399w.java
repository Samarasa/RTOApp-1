package org.jsoup.parser;

import java.util.ArrayList;
import org.jsoup.nodes.Element;

/* 'enum' modifier removed */
/* renamed from: org.jsoup.parser.w  reason: case insensitive filesystem */
class C3399w extends C3403z {
    C3399w(String str, int i) {
        super(str, i, (C3378l) null);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01ec, code lost:
        if (r19.a().nodeName().equals(r5) == false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0272, code lost:
        if (r19.a().nodeName().equals(r5) == false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0299, code lost:
        if (r19.a().nodeName().equals(r5) == false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0384, code lost:
        if (r2.f("p") != false) goto L_0x0386;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x03df, code lost:
        if (r2.f("p") != false) goto L_0x0386;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0599, code lost:
        if (r2.f("p") != false) goto L_0x0386;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0654, code lost:
        if (r2.b(r3).attr("type").equalsIgnoreCase("hidden") == false) goto L_0x0371;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b6, code lost:
        if (r19.a().nodeName().equals(r5) == false) goto L_0x01b8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(org.jsoup.parser.C r18, org.jsoup.parser.HtmlTreeBuilder r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int[] r3 = org.jsoup.parser.C3388q.f15524a
            org.jsoup.parser.C$h r4 = r1.f15454a
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L_0x083b
            r5 = 2
            r6 = 0
            if (r3 == r5) goto L_0x0837
            r7 = 3
            java.lang.String r8 = "form"
            java.lang.String r9 = "li"
            java.lang.String r10 = "body"
            java.lang.String r11 = "p"
            if (r3 == r7) goto L_0x032d
            r5 = 4
            if (r3 == r5) goto L_0x005c
            r5 = 5
            if (r3 == r5) goto L_0x002b
        L_0x0028:
            r1 = 1
            goto L_0x0844
        L_0x002b:
            org.jsoup.parser.C$a r1 = r18.a()
            java.lang.String r3 = r1.n()
            java.lang.String r5 = org.jsoup.parser.C3403z.x
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0041
            r2.a((org.jsoup.parser.C3403z) r0)
            return r6
        L_0x0041:
            boolean r3 = r19.h()
            if (r3 == 0) goto L_0x0054
            boolean r3 = org.jsoup.parser.C3403z.b((org.jsoup.parser.C) r1)
            if (r3 == 0) goto L_0x0054
            r19.x()
            r2.a((org.jsoup.parser.C.a) r1)
            goto L_0x0028
        L_0x0054:
            r19.x()
            r2.a((org.jsoup.parser.C.a) r1)
            goto L_0x0371
        L_0x005c:
            org.jsoup.parser.C$e r3 = r18.d()
            java.lang.String r5 = r3.s()
            java.lang.String[] r12 = org.jsoup.parser.C3403z.a.p
            boolean r12 = org.jsoup.helper.StringUtil.inSorted(r5, r12)
            r13 = 0
            if (r12 == 0) goto L_0x0193
            r3 = 0
        L_0x0070:
            r8 = 8
            if (r3 >= r8) goto L_0x0028
            org.jsoup.nodes.Element r8 = r2.d((java.lang.String) r5)
            if (r8 != 0) goto L_0x007f
            boolean r1 = r17.b(r18, r19)
            return r1
        L_0x007f:
            boolean r9 = r2.f((org.jsoup.nodes.Element) r8)
            if (r9 != 0) goto L_0x008c
            r2.a((org.jsoup.parser.C3403z) r0)
        L_0x0088:
            r2.i((org.jsoup.nodes.Element) r8)
            return r4
        L_0x008c:
            java.lang.String r9 = r8.nodeName()
            boolean r9 = r2.h((java.lang.String) r9)
            if (r9 != 0) goto L_0x009a
            r2.a((org.jsoup.parser.C3403z) r0)
            return r6
        L_0x009a:
            org.jsoup.nodes.Element r9 = r19.a()
            if (r9 == r8) goto L_0x00a3
            r2.a((org.jsoup.parser.C3403z) r0)
        L_0x00a3:
            java.util.ArrayList r9 = r19.o()
            int r10 = r9.size()
            r14 = r13
            r11 = 0
            r12 = 0
        L_0x00ae:
            if (r11 >= r10) goto L_0x00d3
            r15 = 64
            if (r11 >= r15) goto L_0x00d3
            java.lang.Object r15 = r9.get(r11)
            org.jsoup.nodes.Element r15 = (org.jsoup.nodes.Element) r15
            if (r15 != r8) goto L_0x00c7
            int r12 = r11 + -1
            java.lang.Object r12 = r9.get(r12)
            org.jsoup.nodes.Element r12 = (org.jsoup.nodes.Element) r12
            r14 = r12
            r12 = 1
            goto L_0x00d0
        L_0x00c7:
            if (r12 == 0) goto L_0x00d0
            boolean r16 = r2.d((org.jsoup.nodes.Element) r15)
            if (r16 == 0) goto L_0x00d0
            goto L_0x00d4
        L_0x00d0:
            int r11 = r11 + 1
            goto L_0x00ae
        L_0x00d3:
            r15 = r13
        L_0x00d4:
            if (r15 != 0) goto L_0x00de
            java.lang.String r1 = r8.nodeName()
            r2.m(r1)
            goto L_0x0088
        L_0x00de:
            r10 = r15
            r11 = r10
            r9 = 0
        L_0x00e1:
            if (r9 >= r7) goto L_0x0126
            boolean r12 = r2.f((org.jsoup.nodes.Element) r10)
            if (r12 == 0) goto L_0x00ed
            org.jsoup.nodes.Element r10 = r2.a((org.jsoup.nodes.Element) r10)
        L_0x00ed:
            boolean r12 = r2.c((org.jsoup.nodes.Element) r10)
            if (r12 != 0) goto L_0x00f7
            r2.j((org.jsoup.nodes.Element) r10)
            goto L_0x0121
        L_0x00f7:
            if (r10 != r8) goto L_0x00fa
            goto L_0x0126
        L_0x00fa:
            org.jsoup.nodes.Element r12 = new org.jsoup.nodes.Element
            java.lang.String r7 = r10.nodeName()
            org.jsoup.parser.ParseSettings r4 = org.jsoup.parser.ParseSettings.preserveCase
            org.jsoup.parser.Tag r4 = org.jsoup.parser.Tag.valueOf(r7, r4)
            java.lang.String r7 = r19.j()
            r12.<init>(r4, r7)
            r2.b(r10, r12)
            r2.c(r10, r12)
            org.jsoup.nodes.Element r4 = r11.parent()
            if (r4 == 0) goto L_0x011c
            r11.remove()
        L_0x011c:
            r12.appendChild(r11)
            r10 = r12
            r11 = r10
        L_0x0121:
            int r9 = r9 + 1
            r4 = 1
            r7 = 3
            goto L_0x00e1
        L_0x0126:
            java.lang.String r4 = r14.nodeName()
            java.lang.String[] r7 = org.jsoup.parser.C3403z.a.q
            boolean r4 = org.jsoup.helper.StringUtil.inSorted(r4, r7)
            if (r4 == 0) goto L_0x0141
            org.jsoup.nodes.Element r4 = r11.parent()
            if (r4 == 0) goto L_0x013d
            r11.remove()
        L_0x013d:
            r2.a((org.jsoup.nodes.Node) r11)
            goto L_0x014d
        L_0x0141:
            org.jsoup.nodes.Element r4 = r11.parent()
            if (r4 == 0) goto L_0x014a
            r11.remove()
        L_0x014a:
            r14.appendChild(r11)
        L_0x014d:
            org.jsoup.nodes.Element r4 = new org.jsoup.nodes.Element
            org.jsoup.parser.Tag r7 = r8.tag()
            java.lang.String r9 = r19.j()
            r4.<init>(r7, r9)
            org.jsoup.nodes.Attributes r7 = r4.attributes()
            org.jsoup.nodes.Attributes r9 = r8.attributes()
            r7.addAll(r9)
            java.util.List r7 = r15.childNodes()
            int r9 = r15.childNodeSize()
            org.jsoup.nodes.Node[] r9 = new org.jsoup.nodes.Node[r9]
            java.lang.Object[] r7 = r7.toArray(r9)
            org.jsoup.nodes.Node[] r7 = (org.jsoup.nodes.Node[]) r7
            int r9 = r7.length
            r10 = 0
        L_0x0177:
            if (r10 >= r9) goto L_0x0181
            r11 = r7[r10]
            r4.appendChild(r11)
            int r10 = r10 + 1
            goto L_0x0177
        L_0x0181:
            r15.appendChild(r4)
            r2.i((org.jsoup.nodes.Element) r8)
            r2.j((org.jsoup.nodes.Element) r8)
            r2.a((org.jsoup.nodes.Element) r15, (org.jsoup.nodes.Element) r4)
            int r3 = r3 + 1
            r4 = 1
            r7 = 3
            goto L_0x0070
        L_0x0193:
            java.lang.String[] r4 = org.jsoup.parser.C3403z.a.o
            boolean r4 = org.jsoup.helper.StringUtil.inSorted(r5, r4)
            if (r4 == 0) goto L_0x01c0
            boolean r1 = r2.h((java.lang.String) r5)
            if (r1 != 0) goto L_0x01a7
            r2.a((org.jsoup.parser.C3403z) r0)
            return r6
        L_0x01a7:
            r19.i()
            org.jsoup.nodes.Element r1 = r19.a()
            java.lang.String r1 = r1.nodeName()
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x01bb
        L_0x01b8:
            r2.a((org.jsoup.parser.C3403z) r0)
        L_0x01bb:
            r2.m(r5)
            goto L_0x0028
        L_0x01c0:
            java.lang.String r4 = "span"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01cd
            boolean r1 = r17.b(r18, r19)
            return r1
        L_0x01cd:
            boolean r4 = r5.equals(r9)
            if (r4 == 0) goto L_0x01ef
            boolean r1 = r2.g((java.lang.String) r5)
            if (r1 != 0) goto L_0x01dd
            r2.a((org.jsoup.parser.C3403z) r0)
            return r6
        L_0x01dd:
            r2.c((java.lang.String) r5)
            org.jsoup.nodes.Element r1 = r19.a()
            java.lang.String r1 = r1.nodeName()
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x01bb
            goto L_0x01b8
        L_0x01ef:
            boolean r4 = r5.equals(r10)
            if (r4 == 0) goto L_0x0206
            boolean r1 = r2.h((java.lang.String) r10)
            if (r1 != 0) goto L_0x01ff
            r2.a((org.jsoup.parser.C3403z) r0)
            return r6
        L_0x01ff:
            org.jsoup.parser.z r1 = org.jsoup.parser.C3403z.AfterBody
        L_0x0201:
            r2.b((org.jsoup.parser.C3403z) r1)
            goto L_0x0028
        L_0x0206:
            java.lang.String r4 = "html"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0219
            boolean r1 = r2.a((java.lang.String) r10)
            if (r1 == 0) goto L_0x0028
            boolean r1 = r2.a((org.jsoup.parser.C) r3)
            return r1
        L_0x0219:
            boolean r4 = r5.equals(r8)
            if (r4 == 0) goto L_0x024c
            org.jsoup.nodes.FormElement r1 = r19.l()
            r2.a((org.jsoup.nodes.FormElement) r13)
            if (r1 == 0) goto L_0x0248
            boolean r3 = r2.h((java.lang.String) r5)
            if (r3 != 0) goto L_0x022f
            goto L_0x0248
        L_0x022f:
            r19.i()
            org.jsoup.nodes.Element r3 = r19.a()
            java.lang.String r3 = r3.nodeName()
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0243
            r2.a((org.jsoup.parser.C3403z) r0)
        L_0x0243:
            r2.j((org.jsoup.nodes.Element) r1)
            goto L_0x0028
        L_0x0248:
            r2.a((org.jsoup.parser.C3403z) r0)
            return r6
        L_0x024c:
            boolean r4 = r5.equals(r11)
            if (r4 == 0) goto L_0x0276
            boolean r1 = r2.f((java.lang.String) r5)
            if (r1 != 0) goto L_0x0263
            r2.a((org.jsoup.parser.C3403z) r0)
            r2.b(r5)
            boolean r1 = r2.a((org.jsoup.parser.C) r3)
            return r1
        L_0x0263:
            r2.c((java.lang.String) r5)
            org.jsoup.nodes.Element r1 = r19.a()
            java.lang.String r1 = r1.nodeName()
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x01bb
            goto L_0x01b8
        L_0x0276:
            java.lang.String[] r3 = org.jsoup.parser.C3403z.a.f15538f
            boolean r3 = org.jsoup.helper.StringUtil.inSorted(r5, r3)
            if (r3 == 0) goto L_0x029d
            boolean r1 = r2.h((java.lang.String) r5)
            if (r1 != 0) goto L_0x028a
            r2.a((org.jsoup.parser.C3403z) r0)
            return r6
        L_0x028a:
            r2.c((java.lang.String) r5)
            org.jsoup.nodes.Element r1 = r19.a()
            java.lang.String r1 = r1.nodeName()
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x01bb
            goto L_0x01b8
        L_0x029d:
            java.lang.String[] r3 = org.jsoup.parser.C3403z.a.f15535c
            boolean r3 = org.jsoup.helper.StringUtil.inSorted(r5, r3)
            if (r3 == 0) goto L_0x02d2
            java.lang.String[] r1 = org.jsoup.parser.C3403z.a.f15535c
            boolean r1 = r2.a((java.lang.String[]) r1)
            if (r1 != 0) goto L_0x02b5
            r2.a((org.jsoup.parser.C3403z) r0)
            return r6
        L_0x02b5:
            r2.c((java.lang.String) r5)
            org.jsoup.nodes.Element r1 = r19.a()
            java.lang.String r1 = r1.nodeName()
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x02c9
            r2.a((org.jsoup.parser.C3403z) r0)
        L_0x02c9:
            java.lang.String[] r1 = org.jsoup.parser.C3403z.a.f15535c
            r2.b((java.lang.String[]) r1)
            goto L_0x0028
        L_0x02d2:
            java.lang.String r3 = "sarcasm"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x02df
            boolean r1 = r17.b(r18, r19)
            return r1
        L_0x02df:
            java.lang.String[] r3 = org.jsoup.parser.C3403z.a.f15540h
            boolean r3 = org.jsoup.helper.StringUtil.inSorted(r5, r3)
            if (r3 == 0) goto L_0x0317
            java.lang.String r1 = "name"
            boolean r1 = r2.h((java.lang.String) r1)
            if (r1 != 0) goto L_0x0028
            boolean r1 = r2.h((java.lang.String) r5)
            if (r1 != 0) goto L_0x02fb
            r2.a((org.jsoup.parser.C3403z) r0)
            return r6
        L_0x02fb:
            r19.i()
            org.jsoup.nodes.Element r1 = r19.a()
            java.lang.String r1 = r1.nodeName()
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x030f
            r2.a((org.jsoup.parser.C3403z) r0)
        L_0x030f:
            r2.m(r5)
            r19.d()
            goto L_0x0028
        L_0x0317:
            java.lang.String r3 = "br"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0328
            r2.a((org.jsoup.parser.C3403z) r0)
            java.lang.String r1 = "br"
            r2.b(r1)
            return r6
        L_0x0328:
            boolean r1 = r17.b(r18, r19)
            return r1
        L_0x032d:
            org.jsoup.parser.C$f r3 = r18.e()
            java.lang.String r4 = r3.s()
            java.lang.String r7 = "a"
            boolean r12 = r4.equals(r7)
            if (r12 == 0) goto L_0x0361
            org.jsoup.nodes.Element r1 = r2.d((java.lang.String) r7)
            if (r1 == 0) goto L_0x0355
            r2.a((org.jsoup.parser.C3403z) r0)
            r2.a((java.lang.String) r7)
            org.jsoup.nodes.Element r1 = r2.e((java.lang.String) r7)
            if (r1 == 0) goto L_0x0355
            r2.i((org.jsoup.nodes.Element) r1)
            r2.j((org.jsoup.nodes.Element) r1)
        L_0x0355:
            r19.x()
        L_0x0358:
            org.jsoup.nodes.Element r1 = r2.a((org.jsoup.parser.C.f) r3)
            r2.h((org.jsoup.nodes.Element) r1)
            goto L_0x0028
        L_0x0361:
            java.lang.String[] r7 = org.jsoup.parser.C3403z.a.i
            boolean r7 = org.jsoup.helper.StringUtil.inSorted(r4, r7)
            if (r7 == 0) goto L_0x0376
            r19.x()
        L_0x036e:
            r2.b((org.jsoup.parser.C.f) r3)
        L_0x0371:
            r2.a((boolean) r6)
            goto L_0x0028
        L_0x0376:
            java.lang.String[] r7 = org.jsoup.parser.C3403z.a.f15534b
            boolean r7 = org.jsoup.helper.StringUtil.inSorted(r4, r7)
            if (r7 == 0) goto L_0x038a
            boolean r1 = r2.f((java.lang.String) r11)
            if (r1 == 0) goto L_0x0395
        L_0x0386:
            r2.a((java.lang.String) r11)
            goto L_0x0395
        L_0x038a:
            java.lang.String r7 = "span"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x039a
        L_0x0392:
            r19.x()
        L_0x0395:
            r2.a((org.jsoup.parser.C.f) r3)
            goto L_0x0028
        L_0x039a:
            boolean r7 = r4.equals(r9)
            if (r7 == 0) goto L_0x03e2
            r2.a((boolean) r6)
            java.util.ArrayList r1 = r19.o()
            int r4 = r1.size()
            r5 = 1
            int r4 = r4 - r5
        L_0x03ad:
            if (r4 <= 0) goto L_0x03db
            java.lang.Object r5 = r1.get(r4)
            org.jsoup.nodes.Element r5 = (org.jsoup.nodes.Element) r5
            java.lang.String r6 = r5.nodeName()
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x03c3
            r2.a((java.lang.String) r9)
            goto L_0x03db
        L_0x03c3:
            boolean r6 = r2.d((org.jsoup.nodes.Element) r5)
            if (r6 == 0) goto L_0x03d8
            java.lang.String r5 = r5.nodeName()
            java.lang.String[] r6 = org.jsoup.parser.C3403z.a.f15537e
            boolean r5 = org.jsoup.helper.StringUtil.inSorted(r5, r6)
            if (r5 != 0) goto L_0x03d8
            goto L_0x03db
        L_0x03d8:
            int r4 = r4 + -1
            goto L_0x03ad
        L_0x03db:
            boolean r1 = r2.f((java.lang.String) r11)
            if (r1 == 0) goto L_0x0395
            goto L_0x0386
        L_0x03e2:
            java.lang.String r7 = "html"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x041d
            r2.a((org.jsoup.parser.C3403z) r0)
            java.util.ArrayList r1 = r19.o()
            java.lang.Object r1 = r1.get(r6)
            org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
            org.jsoup.nodes.Attributes r2 = r3.o()
            java.util.Iterator r2 = r2.iterator()
        L_0x03ff:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0028
            java.lang.Object r3 = r2.next()
            org.jsoup.nodes.Attribute r3 = (org.jsoup.nodes.Attribute) r3
            java.lang.String r4 = r3.getKey()
            boolean r4 = r1.hasAttr(r4)
            if (r4 != 0) goto L_0x03ff
            org.jsoup.nodes.Attributes r4 = r1.attributes()
            r4.put(r3)
            goto L_0x03ff
        L_0x041d:
            java.lang.String[] r7 = org.jsoup.parser.C3403z.a.f15533a
            boolean r7 = org.jsoup.helper.StringUtil.inSorted(r4, r7)
            if (r7 == 0) goto L_0x042e
            org.jsoup.parser.z r3 = org.jsoup.parser.C3403z.InHead
            boolean r1 = r2.a((org.jsoup.parser.C) r1, (org.jsoup.parser.C3403z) r3)
            return r1
        L_0x042e:
            boolean r1 = r4.equals(r10)
            if (r1 == 0) goto L_0x0489
            r2.a((org.jsoup.parser.C3403z) r0)
            java.util.ArrayList r1 = r19.o()
            int r4 = r1.size()
            r7 = 1
            if (r4 == r7) goto L_0x0488
            int r4 = r1.size()
            if (r4 <= r5) goto L_0x0459
            java.lang.Object r4 = r1.get(r7)
            org.jsoup.nodes.Element r4 = (org.jsoup.nodes.Element) r4
            java.lang.String r4 = r4.nodeName()
            boolean r4 = r4.equals(r10)
            if (r4 != 0) goto L_0x0459
            goto L_0x0488
        L_0x0459:
            r2.a((boolean) r6)
            java.lang.Object r1 = r1.get(r7)
            org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
            org.jsoup.nodes.Attributes r2 = r3.o()
            java.util.Iterator r2 = r2.iterator()
        L_0x046a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0028
            java.lang.Object r3 = r2.next()
            org.jsoup.nodes.Attribute r3 = (org.jsoup.nodes.Attribute) r3
            java.lang.String r4 = r3.getKey()
            boolean r4 = r1.hasAttr(r4)
            if (r4 != 0) goto L_0x046a
            org.jsoup.nodes.Attributes r4 = r1.attributes()
            r4.put(r3)
            goto L_0x046a
        L_0x0488:
            return r6
        L_0x0489:
            java.lang.String r1 = "frameset"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x04e4
            r2.a((org.jsoup.parser.C3403z) r0)
            java.util.ArrayList r1 = r19.o()
            int r4 = r1.size()
            r7 = 1
            if (r4 == r7) goto L_0x04e3
            int r4 = r1.size()
            if (r4 <= r5) goto L_0x04b6
            java.lang.Object r4 = r1.get(r7)
            org.jsoup.nodes.Element r4 = (org.jsoup.nodes.Element) r4
            java.lang.String r4 = r4.nodeName()
            boolean r4 = r4.equals(r10)
            if (r4 != 0) goto L_0x04b6
            goto L_0x04e3
        L_0x04b6:
            boolean r4 = r19.h()
            if (r4 != 0) goto L_0x04bd
            return r6
        L_0x04bd:
            java.lang.Object r4 = r1.get(r7)
            org.jsoup.nodes.Element r4 = (org.jsoup.nodes.Element) r4
            org.jsoup.nodes.Element r5 = r4.parent()
            if (r5 == 0) goto L_0x04cc
            r4.remove()
        L_0x04cc:
            int r4 = r1.size()
            if (r4 <= r7) goto L_0x04dc
            int r4 = r1.size()
            int r4 = r4 - r7
            r1.remove(r4)
            r7 = 1
            goto L_0x04cc
        L_0x04dc:
            r2.a((org.jsoup.parser.C.f) r3)
            org.jsoup.parser.z r1 = org.jsoup.parser.C3403z.InFrameset
            goto L_0x0201
        L_0x04e3:
            return r6
        L_0x04e4:
            java.lang.String[] r1 = org.jsoup.parser.C3403z.a.f15535c
            boolean r1 = org.jsoup.helper.StringUtil.inSorted(r4, r1)
            if (r1 == 0) goto L_0x0511
            boolean r1 = r2.f((java.lang.String) r11)
            if (r1 == 0) goto L_0x04f7
            r2.a((java.lang.String) r11)
        L_0x04f7:
            org.jsoup.nodes.Element r1 = r19.a()
            java.lang.String r1 = r1.nodeName()
            java.lang.String[] r4 = org.jsoup.parser.C3403z.a.f15535c
            boolean r1 = org.jsoup.helper.StringUtil.inSorted(r1, r4)
            if (r1 == 0) goto L_0x0395
            r2.a((org.jsoup.parser.C3403z) r0)
            r19.w()
            goto L_0x0395
        L_0x0511:
            java.lang.String[] r1 = org.jsoup.parser.C3403z.a.f15536d
            boolean r1 = org.jsoup.helper.StringUtil.inSorted(r4, r1)
            if (r1 == 0) goto L_0x0529
            boolean r1 = r2.f((java.lang.String) r11)
            if (r1 == 0) goto L_0x0524
            r2.a((java.lang.String) r11)
        L_0x0524:
            r2.a((org.jsoup.parser.C.f) r3)
            goto L_0x0371
        L_0x0529:
            boolean r1 = r4.equals(r8)
            if (r1 == 0) goto L_0x0548
            org.jsoup.nodes.FormElement r1 = r19.l()
            if (r1 == 0) goto L_0x0539
            r2.a((org.jsoup.parser.C3403z) r0)
            return r6
        L_0x0539:
            boolean r1 = r2.f((java.lang.String) r11)
            if (r1 == 0) goto L_0x0542
            r2.a((java.lang.String) r11)
        L_0x0542:
            r1 = 1
            r2.a((org.jsoup.parser.C.f) r3, (boolean) r1)
            goto L_0x0844
        L_0x0548:
            r1 = 1
            java.lang.String[] r5 = org.jsoup.parser.C3403z.a.f15538f
            boolean r5 = org.jsoup.helper.StringUtil.inSorted(r4, r5)
            if (r5 == 0) goto L_0x059d
            r2.a((boolean) r6)
            java.util.ArrayList r4 = r19.o()
            int r5 = r4.size()
            int r5 = r5 - r1
        L_0x055f:
            if (r5 <= 0) goto L_0x0595
            java.lang.Object r1 = r4.get(r5)
            org.jsoup.nodes.Element r1 = (org.jsoup.nodes.Element) r1
            java.lang.String r6 = r1.nodeName()
            java.lang.String[] r7 = org.jsoup.parser.C3403z.a.f15538f
            boolean r6 = org.jsoup.helper.StringUtil.inSorted(r6, r7)
            if (r6 == 0) goto L_0x057d
            java.lang.String r1 = r1.nodeName()
            r2.a((java.lang.String) r1)
            goto L_0x0595
        L_0x057d:
            boolean r6 = r2.d((org.jsoup.nodes.Element) r1)
            if (r6 == 0) goto L_0x0592
            java.lang.String r1 = r1.nodeName()
            java.lang.String[] r6 = org.jsoup.parser.C3403z.a.f15537e
            boolean r1 = org.jsoup.helper.StringUtil.inSorted(r1, r6)
            if (r1 != 0) goto L_0x0592
            goto L_0x0595
        L_0x0592:
            int r5 = r5 + -1
            goto L_0x055f
        L_0x0595:
            boolean r1 = r2.f((java.lang.String) r11)
            if (r1 == 0) goto L_0x0395
            goto L_0x0386
        L_0x059d:
            java.lang.String r1 = "plaintext"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x05ba
            boolean r1 = r2.f((java.lang.String) r11)
            if (r1 == 0) goto L_0x05ae
            r2.a((java.lang.String) r11)
        L_0x05ae:
            r2.a((org.jsoup.parser.C.f) r3)
            org.jsoup.parser.D r1 = r2.f15511b
            org.jsoup.parser.Ua r2 = org.jsoup.parser.Ua.PLAINTEXT
            r1.d(r2)
            goto L_0x0028
        L_0x05ba:
            java.lang.String r1 = "button"
            boolean r5 = r4.equals(r1)
            if (r5 == 0) goto L_0x05d8
            boolean r4 = r2.f((java.lang.String) r1)
            if (r4 == 0) goto L_0x05d3
            r2.a((org.jsoup.parser.C3403z) r0)
            r2.a((java.lang.String) r1)
            r2.a((org.jsoup.parser.C) r3)
            goto L_0x0028
        L_0x05d3:
            r19.x()
            goto L_0x0524
        L_0x05d8:
            java.lang.String[] r1 = org.jsoup.parser.C3403z.a.f15539g
            boolean r1 = org.jsoup.helper.StringUtil.inSorted(r4, r1)
            if (r1 == 0) goto L_0x05e4
            goto L_0x0355
        L_0x05e4:
            java.lang.String r1 = "nobr"
            boolean r5 = r4.equals(r1)
            if (r5 == 0) goto L_0x05fd
            r19.x()
            boolean r4 = r2.h((java.lang.String) r1)
            if (r4 == 0) goto L_0x0358
            r2.a((org.jsoup.parser.C3403z) r0)
            r2.a((java.lang.String) r1)
            goto L_0x0355
        L_0x05fd:
            java.lang.String[] r1 = org.jsoup.parser.C3403z.a.f15540h
            boolean r1 = org.jsoup.helper.StringUtil.inSorted(r4, r1)
            if (r1 == 0) goto L_0x0612
            r19.x()
            r2.a((org.jsoup.parser.C.f) r3)
            r19.p()
            goto L_0x0371
        L_0x0612:
            java.lang.String r1 = "table"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0639
            org.jsoup.nodes.Document r1 = r19.k()
            org.jsoup.nodes.Document$QuirksMode r1 = r1.quirksMode()
            org.jsoup.nodes.Document$QuirksMode r4 = org.jsoup.nodes.Document.QuirksMode.quirks
            if (r1 == r4) goto L_0x062f
            boolean r1 = r2.f((java.lang.String) r11)
            if (r1 == 0) goto L_0x062f
            r2.a((java.lang.String) r11)
        L_0x062f:
            r2.a((org.jsoup.parser.C.f) r3)
            r2.a((boolean) r6)
            org.jsoup.parser.z r1 = org.jsoup.parser.C3403z.InTable
            goto L_0x0201
        L_0x0639:
            java.lang.String r1 = "input"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0658
            r19.x()
            org.jsoup.nodes.Element r1 = r2.b((org.jsoup.parser.C.f) r3)
            java.lang.String r3 = "type"
            java.lang.String r1 = r1.attr(r3)
            java.lang.String r3 = "hidden"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 != 0) goto L_0x0028
            goto L_0x0371
        L_0x0658:
            java.lang.String[] r1 = org.jsoup.parser.C3403z.a.j
            boolean r1 = org.jsoup.helper.StringUtil.inSorted(r4, r1)
            if (r1 == 0) goto L_0x0667
            r2.b((org.jsoup.parser.C.f) r3)
            goto L_0x0028
        L_0x0667:
            java.lang.String r1 = "hr"
            boolean r5 = r4.equals(r1)
            if (r5 == 0) goto L_0x067a
            boolean r1 = r2.f((java.lang.String) r11)
            if (r1 == 0) goto L_0x036e
            r2.a((java.lang.String) r11)
            goto L_0x036e
        L_0x067a:
            java.lang.String r5 = "image"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0694
            java.lang.String r1 = "svg"
            org.jsoup.nodes.Element r1 = r2.e((java.lang.String) r1)
            if (r1 != 0) goto L_0x0395
            java.lang.String r1 = "img"
            r3.d(r1)
            boolean r1 = r2.a((org.jsoup.parser.C) r3)
            return r1
        L_0x0694:
            java.lang.String r5 = "isindex"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x072f
            r2.a((org.jsoup.parser.C3403z) r0)
            org.jsoup.nodes.FormElement r4 = r19.l()
            if (r4 == 0) goto L_0x06a6
            return r6
        L_0x06a6:
            org.jsoup.parser.D r4 = r2.f15511b
            r4.a()
            r2.b(r8)
            org.jsoup.nodes.Attributes r4 = r3.j
            java.lang.String r5 = "action"
            boolean r4 = r4.hasKey(r5)
            if (r4 == 0) goto L_0x06c5
            org.jsoup.nodes.FormElement r4 = r19.l()
            org.jsoup.nodes.Attributes r6 = r3.j
            java.lang.String r6 = r6.get(r5)
            r4.attr((java.lang.String) r5, (java.lang.String) r6)
        L_0x06c5:
            r2.b(r1)
            java.lang.String r4 = "label"
            r2.b(r4)
            org.jsoup.nodes.Attributes r4 = r3.j
            java.lang.String r5 = "prompt"
            boolean r4 = r4.hasKey(r5)
            if (r4 == 0) goto L_0x06e0
            org.jsoup.nodes.Attributes r4 = r3.j
            java.lang.String r5 = "prompt"
            java.lang.String r4 = r4.get(r5)
            goto L_0x06e2
        L_0x06e0:
            java.lang.String r4 = "This is a searchable index. Enter search keywords: "
        L_0x06e2:
            org.jsoup.parser.C$a r5 = new org.jsoup.parser.C$a
            r5.<init>()
            r5.a(r4)
            r2.a((org.jsoup.parser.C) r5)
            org.jsoup.nodes.Attributes r4 = new org.jsoup.nodes.Attributes
            r4.<init>()
            org.jsoup.nodes.Attributes r3 = r3.j
            java.util.Iterator r3 = r3.iterator()
        L_0x06f8:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0716
            java.lang.Object r5 = r3.next()
            org.jsoup.nodes.Attribute r5 = (org.jsoup.nodes.Attribute) r5
            java.lang.String r6 = r5.getKey()
            java.lang.String[] r7 = org.jsoup.parser.C3403z.a.k
            boolean r6 = org.jsoup.helper.StringUtil.inSorted(r6, r7)
            if (r6 != 0) goto L_0x06f8
            r4.put(r5)
            goto L_0x06f8
        L_0x0716:
            java.lang.String r3 = "name"
            java.lang.String r5 = "isindex"
            r4.put((java.lang.String) r3, (java.lang.String) r5)
            java.lang.String r3 = "input"
            r2.processStartTag(r3, r4)
            java.lang.String r3 = "label"
            r2.a((java.lang.String) r3)
            r2.b(r1)
            r2.a((java.lang.String) r8)
            goto L_0x0028
        L_0x072f:
            java.lang.String r1 = "textarea"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x074b
            r2.a((org.jsoup.parser.C.f) r3)
            org.jsoup.parser.D r1 = r2.f15511b
            org.jsoup.parser.Ua r3 = org.jsoup.parser.Ua.Rcdata
            r1.d(r3)
            r19.t()
            r2.a((boolean) r6)
            org.jsoup.parser.z r1 = org.jsoup.parser.C3403z.Text
            goto L_0x0201
        L_0x074b:
            java.lang.String r1 = "xmp"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0760
            boolean r1 = r2.f((java.lang.String) r11)
            if (r1 == 0) goto L_0x075c
            r2.a((java.lang.String) r11)
        L_0x075c:
            r19.x()
            goto L_0x0768
        L_0x0760:
            java.lang.String r1 = "iframe"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0770
        L_0x0768:
            r2.a((boolean) r6)
        L_0x076b:
            org.jsoup.parser.C3403z.c(r3, r2)
            goto L_0x0028
        L_0x0770:
            java.lang.String r1 = "noembed"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0779
            goto L_0x076b
        L_0x0779:
            java.lang.String r1 = "select"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x07bf
            r19.x()
            r2.a((org.jsoup.parser.C.f) r3)
            r2.a((boolean) r6)
            org.jsoup.parser.z r1 = r19.A()
            org.jsoup.parser.z r3 = org.jsoup.parser.C3403z.InTable
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x07bb
            org.jsoup.parser.z r3 = org.jsoup.parser.C3403z.InCaption
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x07bb
            org.jsoup.parser.z r3 = org.jsoup.parser.C3403z.InTableBody
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x07bb
            org.jsoup.parser.z r3 = org.jsoup.parser.C3403z.InRow
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x07bb
            org.jsoup.parser.z r3 = org.jsoup.parser.C3403z.InCell
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x07b7
            goto L_0x07bb
        L_0x07b7:
            org.jsoup.parser.z r1 = org.jsoup.parser.C3403z.InSelect
            goto L_0x0201
        L_0x07bb:
            org.jsoup.parser.z r1 = org.jsoup.parser.C3403z.InSelectInTable
            goto L_0x0201
        L_0x07bf:
            java.lang.String[] r1 = org.jsoup.parser.C3403z.a.l
            boolean r1 = org.jsoup.helper.StringUtil.inSorted(r4, r1)
            if (r1 == 0) goto L_0x07e0
            org.jsoup.nodes.Element r1 = r19.a()
            java.lang.String r1 = r1.nodeName()
            java.lang.String r4 = "option"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0392
            java.lang.String r1 = "option"
            r2.a((java.lang.String) r1)
            goto L_0x0392
        L_0x07e0:
            java.lang.String[] r1 = org.jsoup.parser.C3403z.a.m
            boolean r1 = org.jsoup.helper.StringUtil.inSorted(r4, r1)
            if (r1 == 0) goto L_0x080b
            java.lang.String r1 = "ruby"
            boolean r4 = r2.h((java.lang.String) r1)
            if (r4 == 0) goto L_0x0028
            r19.i()
            org.jsoup.nodes.Element r4 = r19.a()
            java.lang.String r4 = r4.nodeName()
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0395
            r2.a((org.jsoup.parser.C3403z) r0)
            r2.l(r1)
            goto L_0x0395
        L_0x080b:
            java.lang.String r1 = "math"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0820
        L_0x0813:
            r19.x()
            r2.a((org.jsoup.parser.C.f) r3)
            org.jsoup.parser.D r1 = r2.f15511b
            r1.a()
            goto L_0x0028
        L_0x0820:
            java.lang.String r1 = "svg"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0829
            goto L_0x0813
        L_0x0829:
            java.lang.String[] r1 = org.jsoup.parser.C3403z.a.n
            boolean r1 = org.jsoup.helper.StringUtil.inSorted(r4, r1)
            if (r1 == 0) goto L_0x0392
            r2.a((org.jsoup.parser.C3403z) r0)
            return r6
        L_0x0837:
            r2.a((org.jsoup.parser.C3403z) r0)
            return r6
        L_0x083b:
            org.jsoup.parser.C$b r1 = r18.b()
            r2.a((org.jsoup.parser.C.b) r1)
            goto L_0x0028
        L_0x0844:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.C3399w.a(org.jsoup.parser.C, org.jsoup.parser.HtmlTreeBuilder):boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean b(C c2, HtmlTreeBuilder htmlTreeBuilder) {
        String s = c2.d().s();
        ArrayList<Element> o = htmlTreeBuilder.o();
        int size = o.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            Element element = o.get(size);
            if (element.nodeName().equals(s)) {
                htmlTreeBuilder.c(s);
                if (!s.equals(htmlTreeBuilder.a().nodeName())) {
                    htmlTreeBuilder.a((C3403z) this);
                }
                htmlTreeBuilder.m(s);
            } else if (htmlTreeBuilder.d(element)) {
                htmlTreeBuilder.a((C3403z) this);
                return false;
            } else {
                size--;
            }
        }
        return true;
    }
}
