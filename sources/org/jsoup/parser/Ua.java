package org.jsoup.parser;

import java.util.Arrays;
import org.jsoup.parser.C;

enum Ua {
    CharacterReferenceInData,
    Rcdata,
    CharacterReferenceInRcdata,
    Rawtext,
    ScriptData,
    PLAINTEXT,
    TagOpen,
    EndTagOpen,
    TagName,
    RcdataLessthanSign,
    RCDATAEndTagOpen,
    RCDATAEndTagName,
    RawtextLessthanSign,
    RawtextEndTagOpen,
    RawtextEndTagName,
    ScriptDataLessthanSign,
    ScriptDataEndTagOpen,
    ScriptDataEndTagName,
    ScriptDataEscapeStart,
    ScriptDataEscapeStartDash,
    ScriptDataEscaped,
    ScriptDataEscapedDash,
    ScriptDataEscapedDashDash,
    ScriptDataEscapedLessthanSign,
    ScriptDataEscapedEndTagOpen,
    ScriptDataEscapedEndTagName,
    ScriptDataDoubleEscapeStart,
    ScriptDataDoubleEscaped,
    ScriptDataDoubleEscapedDash,
    ScriptDataDoubleEscapedDashDash,
    ScriptDataDoubleEscapedLessthanSign,
    ScriptDataDoubleEscapeEnd,
    BeforeAttributeName,
    AttributeName,
    AfterAttributeName,
    BeforeAttributeValue,
    AttributeValue_doubleQuoted,
    AttributeValue_singleQuoted,
    AttributeValue_unquoted,
    AfterAttributeValue_quoted,
    SelfClosingStartTag,
    BogusComment,
    MarkupDeclarationOpen,
    CommentStart,
    CommentStartDash,
    Comment,
    CommentEndDash,
    CommentEnd,
    CommentEndBang,
    Doctype,
    BeforeDoctypeName,
    AfterDoctypePublicKeyword,
    BeforeDoctypePublicIdentifier,
    DoctypePublicIdentifier_doubleQuoted,
    DoctypePublicIdentifier_singleQuoted,
    AfterDoctypePublicIdentifier,
    BetweenDoctypePublicAndSystemIdentifiers,
    AfterDoctypeSystemKeyword,
    BeforeDoctypeSystemIdentifier,
    DoctypeSystemIdentifier_doubleQuoted,
    DoctypeSystemIdentifier_singleQuoted,
    AfterDoctypeSystemIdentifier,
    BogusDoctype,
    CdataSection;
    
    /* access modifiers changed from: private */
    public static final char[] pa = null;
    /* access modifiers changed from: private */
    public static final char[] qa = null;
    /* access modifiers changed from: private */
    public static final char[] ra = null;
    /* access modifiers changed from: private */
    public static final char[] sa = null;
    /* access modifiers changed from: private */
    public static final String ta = null;

    static {
        pa = new char[]{'\'', '&', 0};
        qa = new char[]{'\"', '&', 0};
        ra = new char[]{9, 10, 13, 12, ' ', '/', '=', '>', 0, '\"', '\'', '<'};
        sa = new char[]{9, 10, 13, 12, ' ', '&', '>', 0, '\"', '\'', '<', '=', '`'};
        ta = String.valueOf(65533);
        Arrays.sort(pa);
        Arrays.sort(qa);
        Arrays.sort(ra);
        Arrays.sort(sa);
    }

    /* access modifiers changed from: private */
    public static void b(D d2, Ua ua2) {
        int[] a2 = d2.a((Character) null, false);
        if (a2 == null) {
            d2.a('&');
        } else {
            d2.a(a2);
        }
        d2.d(ua2);
    }

    /* access modifiers changed from: private */
    public static void b(D d2, C3356a aVar, Ua ua2) {
        Ua ua3;
        if (aVar.n()) {
            String f2 = aVar.f();
            d2.j.c(f2);
            d2.i.append(f2);
            return;
        }
        boolean z = true;
        if (d2.i() && !aVar.k()) {
            char b2 = aVar.b();
            if (b2 == 9 || b2 == 10 || b2 == 12 || b2 == 13 || b2 == ' ') {
                ua3 = BeforeAttributeName;
            } else if (b2 == '/') {
                ua3 = SelfClosingStartTag;
            } else if (b2 != '>') {
                d2.i.append(b2);
            } else {
                d2.h();
                ua3 = f15502a;
            }
            d2.d(ua3);
            z = false;
        }
        if (z) {
            d2.a("</" + d2.i.toString());
            d2.d(ua2);
        }
    }

    /* access modifiers changed from: private */
    public static void d(D d2, C3356a aVar, Ua ua2, Ua ua3) {
        if (aVar.n()) {
            String f2 = aVar.f();
            d2.i.append(f2);
            d2.a(f2);
            return;
        }
        char b2 = aVar.b();
        if (b2 == 9 || b2 == 10 || b2 == 12 || b2 == 13 || b2 == ' ' || b2 == '/' || b2 == '>') {
            if (d2.i.toString().equals("script")) {
                d2.d(ua2);
            } else {
                d2.d(ua3);
            }
            d2.a(b2);
            return;
        }
        aVar.q();
        d2.d(ua3);
    }

    /* access modifiers changed from: private */
    public static void e(D d2, C3356a aVar, Ua ua2, Ua ua3) {
        char j = aVar.j();
        if (j == 0) {
            d2.c(ua2);
            aVar.a();
            d2.a(65533);
        } else if (j == '<') {
            d2.a(ua3);
        } else if (j != 65535) {
            d2.a(aVar.a('<', 0));
        } else {
            d2.a((C) new C.d());
        }
    }

    /* access modifiers changed from: private */
    public static void f(D d2, C3356a aVar, Ua ua2, Ua ua3) {
        if (aVar.n()) {
            d2.a(false);
            d2.d(ua2);
            return;
        }
        d2.a("</");
        d2.d(ua3);
    }

    /* access modifiers changed from: package-private */
    public abstract void a(D d2, C3356a aVar);
}
