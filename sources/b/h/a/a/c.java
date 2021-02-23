package b.h.a.a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public class c {

    public interface a {
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final C0029c[] f2377a;

        public b(C0029c[] cVarArr) {
            this.f2377a = cVarArr;
        }

        public C0029c[] a() {
            return this.f2377a;
        }
    }

    /* renamed from: b.h.a.a.c$c  reason: collision with other inner class name */
    public static final class C0029c {

        /* renamed from: a  reason: collision with root package name */
        private final String f2378a;

        /* renamed from: b  reason: collision with root package name */
        private int f2379b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f2380c;

        /* renamed from: d  reason: collision with root package name */
        private String f2381d;

        /* renamed from: e  reason: collision with root package name */
        private int f2382e;

        /* renamed from: f  reason: collision with root package name */
        private int f2383f;

        public C0029c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f2378a = str;
            this.f2379b = i;
            this.f2380c = z;
            this.f2381d = str2;
            this.f2382e = i2;
            this.f2383f = i3;
        }

        public String a() {
            return this.f2378a;
        }

        public int b() {
            return this.f2383f;
        }

        public int c() {
            return this.f2382e;
        }

        public String d() {
            return this.f2381d;
        }

        public int e() {
            return this.f2379b;
        }

        public boolean f() {
            return this.f2380c;
        }
    }

    public static final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        private final b.h.g.a f2384a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2385b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2386c;

        public d(b.h.g.a aVar, int i, int i2) {
            this.f2384a = aVar;
            this.f2386c = i;
            this.f2385b = i2;
        }

        public int a() {
            return this.f2386c;
        }

        public b.h.g.a b() {
            return this.f2384a;
        }

        public int c() {
            return this.f2385b;
        }
    }

    private static int a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static b.h.a.a.c.a a(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            b.h.a.a.c$a r3 = b(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            goto L_0x001b
        L_0x001a:
            throw r3
        L_0x001b:
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.a.c.a(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):b.h.a.a.c$a");
    }

    public static List<List<byte[]>> a(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(a(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static List<byte[]> a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    private static void a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    private static a b(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return c(xmlPullParser, resources);
        }
        a(xmlPullParser);
        return null;
    }

    private static a c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), b.h.d.FontFamily);
        String string = obtainAttributes.getString(b.h.d.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(b.h.d.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(b.h.d.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(b.h.d.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(b.h.d.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(b.h.d.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(d(xmlPullParser, resources));
                    } else {
                        a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new b((C0029c[]) arrayList.toArray(new C0029c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            a(xmlPullParser);
        }
        return new d(new b.h.g.a(string, string2, string3, a(resources, resourceId)), integer, integer2);
    }

    private static C0029c d(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), b.h.d.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(b.h.d.FontFamilyFont_fontWeight) ? b.h.d.FontFamilyFont_fontWeight : b.h.d.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(b.h.d.FontFamilyFont_fontStyle) ? b.h.d.FontFamilyFont_fontStyle : b.h.d.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(b.h.d.FontFamilyFont_ttcIndex) ? b.h.d.FontFamilyFont_ttcIndex : b.h.d.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(b.h.d.FontFamilyFont_fontVariationSettings) ? b.h.d.FontFamilyFont_fontVariationSettings : b.h.d.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(b.h.d.FontFamilyFont_font) ? b.h.d.FontFamilyFont_font : b.h.d.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            a(xmlPullParser);
        }
        return new C0029c(string2, i, z, string, i3, resourceId);
    }
}
