package c.b.b.c.m;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f4814a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f4815b = {16842919};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f4816c = {16843623, 16842908};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f4817d = {16842908};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f4818e = {16843623};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f4819f = {16842913, 16842919};

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f4820g = {16842913, 16843623, 16842908};

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f4821h = {16842913, 16842908};
    private static final int[] i = {16842913, 16843623};
    private static final int[] j = {16842913};

    @TargetApi(21)
    private static int a(int i2) {
        return b.h.b.a.b(i2, Math.min(Color.alpha(i2) * 2, 255));
    }

    private static int a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f4814a ? a(colorForState) : colorForState;
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (f4814a) {
            return new ColorStateList(new int[][]{j, StateSet.NOTHING}, new int[]{a(colorStateList, f4819f), a(colorStateList, f4815b)});
        }
        int[] iArr = f4819f;
        int[] iArr2 = f4820g;
        int[] iArr3 = f4821h;
        int[] iArr4 = i;
        int[] iArr5 = f4815b;
        int[] iArr6 = f4816c;
        int[] iArr7 = f4817d;
        int[] iArr8 = f4818e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{a(colorStateList, iArr), a(colorStateList, iArr2), a(colorStateList, iArr3), a(colorStateList, iArr4), 0, a(colorStateList, iArr5), a(colorStateList, iArr6), a(colorStateList, iArr7), a(colorStateList, iArr8), 0});
    }
}
