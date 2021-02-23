package b.h.a.a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class d {

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int[] f2387a;

        /* renamed from: b  reason: collision with root package name */
        final float[] f2388b;

        a(int i, int i2) {
            this.f2387a = new int[]{i, i2};
            this.f2388b = new float[]{0.0f, 1.0f};
        }

        a(int i, int i2, int i3) {
            this.f2387a = new int[]{i, i2, i3};
            this.f2388b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f2387a = new int[size];
            this.f2388b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f2387a[i] = list.get(i).intValue();
                this.f2388b[i] = list2.get(i).floatValue();
            }
        }
    }

    private static Shader.TileMode a(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    static Shader a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Resources.Theme theme2 = theme;
            TypedArray a2 = i.a(resources, theme2, attributeSet, b.h.d.GradientColor);
            float a3 = i.a(a2, xmlPullParser2, "startX", b.h.d.GradientColor_android_startX, 0.0f);
            float a4 = i.a(a2, xmlPullParser2, "startY", b.h.d.GradientColor_android_startY, 0.0f);
            float a5 = i.a(a2, xmlPullParser2, "endX", b.h.d.GradientColor_android_endX, 0.0f);
            float a6 = i.a(a2, xmlPullParser2, "endY", b.h.d.GradientColor_android_endY, 0.0f);
            float a7 = i.a(a2, xmlPullParser2, "centerX", b.h.d.GradientColor_android_centerX, 0.0f);
            float a8 = i.a(a2, xmlPullParser2, "centerY", b.h.d.GradientColor_android_centerY, 0.0f);
            int b2 = i.b(a2, xmlPullParser2, "type", b.h.d.GradientColor_android_type, 0);
            int a9 = i.a(a2, xmlPullParser2, "startColor", b.h.d.GradientColor_android_startColor, 0);
            boolean a10 = i.a(xmlPullParser2, "centerColor");
            int a11 = i.a(a2, xmlPullParser2, "centerColor", b.h.d.GradientColor_android_centerColor, 0);
            int a12 = i.a(a2, xmlPullParser2, "endColor", b.h.d.GradientColor_android_endColor, 0);
            int b3 = i.b(a2, xmlPullParser2, "tileMode", b.h.d.GradientColor_android_tileMode, 0);
            float f2 = a7;
            float a13 = i.a(a2, xmlPullParser2, "gradientRadius", b.h.d.GradientColor_android_gradientRadius, 0.0f);
            a2.recycle();
            a a14 = a(b(resources, xmlPullParser, attributeSet, theme), a9, a12, a10, a11);
            if (b2 == 1) {
                float f3 = f2;
                if (a13 > 0.0f) {
                    int[] iArr = a14.f2387a;
                    return new RadialGradient(f3, a8, a13, iArr, a14.f2388b, a(b3));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (b2 != 2) {
                return new LinearGradient(a3, a4, a5, a6, a14.f2387a, a14.f2388b, a(b3));
            } else {
                return new SweepGradient(f2, a8, a14.f2387a, a14.f2388b);
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    private static a a(a aVar, int i, int i2, boolean z, int i3) {
        return aVar != null ? aVar : z ? new a(i, i3, i2) : new a(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0084, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static b.h.a.a.d.a b(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r9.next()
            if (r3 == r1) goto L_0x0085
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0085
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = b.h.d.GradientColorItem
            android.content.res.TypedArray r3 = b.h.a.a.i.a((android.content.res.Resources) r8, (android.content.res.Resources.Theme) r11, (android.util.AttributeSet) r10, (int[]) r3)
            int r5 = b.h.d.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = b.h.d.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L_0x006a
            if (r6 == 0) goto L_0x006a
            int r5 = b.h.d.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = b.h.d.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x006a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x0085:
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x0091
            b.h.a.a.d$a r8 = new b.h.a.a.d$a
            r8.<init>((java.util.List<java.lang.Integer>) r4, (java.util.List<java.lang.Float>) r2)
            return r8
        L_0x0091:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.a.d.b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):b.h.a.a.d$a");
    }
}
