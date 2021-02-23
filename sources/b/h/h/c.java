package b.h.h;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.concurrent.Executor;

public class c implements Spannable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f2486a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static Executor f2487b = null;

    /* renamed from: c  reason: collision with root package name */
    private final Spannable f2488c;

    /* renamed from: d  reason: collision with root package name */
    private final a f2489d;

    /* renamed from: e  reason: collision with root package name */
    private final PrecomputedText f2490e;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final TextPaint f2491a;

        /* renamed from: b  reason: collision with root package name */
        private final TextDirectionHeuristic f2492b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2493c;

        /* renamed from: d  reason: collision with root package name */
        private final int f2494d;

        /* renamed from: e  reason: collision with root package name */
        final PrecomputedText.Params f2495e;

        /* renamed from: b.h.h.c$a$a  reason: collision with other inner class name */
        public static class C0032a {

            /* renamed from: a  reason: collision with root package name */
            private final TextPaint f2496a;

            /* renamed from: b  reason: collision with root package name */
            private TextDirectionHeuristic f2497b;

            /* renamed from: c  reason: collision with root package name */
            private int f2498c;

            /* renamed from: d  reason: collision with root package name */
            private int f2499d;

            public C0032a(TextPaint textPaint) {
                this.f2496a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f2498c = 1;
                    this.f2499d = 1;
                } else {
                    this.f2499d = 0;
                    this.f2498c = 0;
                }
                this.f2497b = Build.VERSION.SDK_INT >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            public C0032a a(int i) {
                this.f2498c = i;
                return this;
            }

            public C0032a a(TextDirectionHeuristic textDirectionHeuristic) {
                this.f2497b = textDirectionHeuristic;
                return this;
            }

            public a a() {
                return new a(this.f2496a, this.f2497b, this.f2498c, this.f2499d);
            }

            public C0032a b(int i) {
                this.f2499d = i;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.f2491a = params.getTextPaint();
            this.f2492b = params.getTextDirection();
            this.f2493c = params.getBreakStrategy();
            this.f2494d = params.getHyphenationFrequency();
            this.f2495e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        @SuppressLint({"NewApi"})
        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f2495e = Build.VERSION.SDK_INT >= 29 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build() : null;
            this.f2491a = textPaint;
            this.f2492b = textDirectionHeuristic;
            this.f2493c = i;
            this.f2494d = i2;
        }

        public int a() {
            return this.f2493c;
        }

        public boolean a(a aVar) {
            if ((Build.VERSION.SDK_INT >= 23 && (this.f2493c != aVar.a() || this.f2494d != aVar.b())) || this.f2491a.getTextSize() != aVar.d().getTextSize() || this.f2491a.getTextScaleX() != aVar.d().getTextScaleX() || this.f2491a.getTextSkewX() != aVar.d().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f2491a.getLetterSpacing() != aVar.d().getLetterSpacing() || !TextUtils.equals(this.f2491a.getFontFeatureSettings(), aVar.d().getFontFeatureSettings()))) || this.f2491a.getFlags() != aVar.d().getFlags()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f2491a.getTextLocales().equals(aVar.d().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f2491a.getTextLocale().equals(aVar.d().getTextLocale())) {
                return false;
            }
            return this.f2491a.getTypeface() == null ? aVar.d().getTypeface() == null : this.f2491a.getTypeface().equals(aVar.d().getTypeface());
        }

        public int b() {
            return this.f2494d;
        }

        public TextDirectionHeuristic c() {
            return this.f2492b;
        }

        public TextPaint d() {
            return this.f2491a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.f2492b == aVar.c();
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return b.h.i.c.a(Float.valueOf(this.f2491a.getTextSize()), Float.valueOf(this.f2491a.getTextScaleX()), Float.valueOf(this.f2491a.getTextSkewX()), Float.valueOf(this.f2491a.getLetterSpacing()), Integer.valueOf(this.f2491a.getFlags()), this.f2491a.getTextLocales(), this.f2491a.getTypeface(), Boolean.valueOf(this.f2491a.isElegantTextHeight()), this.f2492b, Integer.valueOf(this.f2493c), Integer.valueOf(this.f2494d));
            } else if (i >= 21) {
                return b.h.i.c.a(Float.valueOf(this.f2491a.getTextSize()), Float.valueOf(this.f2491a.getTextScaleX()), Float.valueOf(this.f2491a.getTextSkewX()), Float.valueOf(this.f2491a.getLetterSpacing()), Integer.valueOf(this.f2491a.getFlags()), this.f2491a.getTextLocale(), this.f2491a.getTypeface(), Boolean.valueOf(this.f2491a.isElegantTextHeight()), this.f2492b, Integer.valueOf(this.f2493c), Integer.valueOf(this.f2494d));
            } else if (i >= 18) {
                return b.h.i.c.a(Float.valueOf(this.f2491a.getTextSize()), Float.valueOf(this.f2491a.getTextScaleX()), Float.valueOf(this.f2491a.getTextSkewX()), Integer.valueOf(this.f2491a.getFlags()), this.f2491a.getTextLocale(), this.f2491a.getTypeface(), this.f2492b, Integer.valueOf(this.f2493c), Integer.valueOf(this.f2494d));
            } else if (i >= 17) {
                return b.h.i.c.a(Float.valueOf(this.f2491a.getTextSize()), Float.valueOf(this.f2491a.getTextScaleX()), Float.valueOf(this.f2491a.getTextSkewX()), Integer.valueOf(this.f2491a.getFlags()), this.f2491a.getTextLocale(), this.f2491a.getTypeface(), this.f2492b, Integer.valueOf(this.f2493c), Integer.valueOf(this.f2494d));
            } else {
                return b.h.i.c.a(Float.valueOf(this.f2491a.getTextSize()), Float.valueOf(this.f2491a.getTextScaleX()), Float.valueOf(this.f2491a.getTextSkewX()), Integer.valueOf(this.f2491a.getFlags()), this.f2491a.getTypeface(), this.f2492b, Integer.valueOf(this.f2493c), Integer.valueOf(this.f2494d));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x00e3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "{"
                r0.<init>(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "textSize="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f2491a
                float r2 = r2.getTextSize()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textScaleX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f2491a
                float r2 = r2.getTextScaleX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textSkewX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f2491a
                float r2 = r2.getTextSkewX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 21
                if (r1 < r2) goto L_0x008f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", letterSpacing="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f2491a
                float r2 = r2.getLetterSpacing()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", elegantTextHeight="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f2491a
                boolean r2 = r2.isElegantTextHeight()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L_0x008f:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 24
                java.lang.String r3 = ", textLocale="
                if (r1 < r2) goto L_0x00b0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                android.text.TextPaint r2 = r4.f2491a
                android.os.LocaleList r2 = r2.getTextLocales()
            L_0x00a5:
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                goto L_0x00c3
            L_0x00b0:
                r2 = 17
                if (r1 < r2) goto L_0x00c3
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                android.text.TextPaint r2 = r4.f2491a
                java.util.Locale r2 = r2.getTextLocale()
                goto L_0x00a5
            L_0x00c3:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", typeface="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f2491a
                android.graphics.Typeface r2 = r2.getTypeface()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 26
                if (r1 < r2) goto L_0x00fd
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", variationSettings="
                r1.append(r2)
                android.text.TextPaint r2 = r4.f2491a
                java.lang.String r2 = r2.getFontVariationSettings()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L_0x00fd:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textDir="
                r1.append(r2)
                android.text.TextDirectionHeuristic r2 = r4.f2492b
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", breakStrategy="
                r1.append(r2)
                int r2 = r4.f2493c
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", hyphenationFrequency="
                r1.append(r2)
                int r2 = r4.f2494d
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b.h.h.c.a.toString():java.lang.String");
        }
    }

    public a a() {
        return this.f2489d;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f2488c;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i) {
        return this.f2488c.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f2488c.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f2488c.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f2488c.getSpanStart(obj);
    }

    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? this.f2490e.getSpans(i, i2, cls) : this.f2488c.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f2488c.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f2488c.nextSpanTransition(i, i2, cls);
    }

    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f2490e.removeSpan(obj);
        } else {
            this.f2488c.removeSpan(obj);
        }
    }

    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f2490e.setSpan(obj, i, i2, i3);
        } else {
            this.f2488c.setSpan(obj, i, i2, i3);
        }
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f2488c.subSequence(i, i2);
    }

    public String toString() {
        return this.f2488c.toString();
    }
}
