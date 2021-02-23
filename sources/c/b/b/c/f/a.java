package c.b.b.c.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.View;
import c.b.b.c.l.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class a {
    public static int a(int i, int i2) {
        return b.h.b.a.a(i2, i);
    }

    public static int a(int i, int i2, float f2) {
        return a(i, b.h.b.a.b(i2, Math.round(((float) Color.alpha(i2)) * f2)));
    }

    public static int a(Context context, int i, int i2) {
        TypedValue a2 = b.a(context, i);
        return a2 != null ? a2.data : i2;
    }

    public static int a(View view, int i) {
        return b.a(view, i);
    }

    public static int a(View view, int i, int i2, float f2) {
        return a(a(view, i), a(view, i2), f2);
    }

    public static ColorStateList a(ColorStateList colorStateList, int i, ColorStateList colorStateList2, int i2, int[][] iArr) {
        int i3;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = iArr.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            int[] iArr2 = iArr[length];
            int a2 = a(colorStateList.getColorForState(iArr2, i), colorStateList2.getColorForState(iArr2, i2));
            if (a((List<Integer>) arrayList, a2, (List<int[]>) arrayList2, iArr2)) {
                arrayList.add(0, Integer.valueOf(a2));
                arrayList2.add(0, iArr2);
            }
        }
        int size = arrayList.size();
        int[] iArr3 = new int[size];
        int[][] iArr4 = new int[size][];
        for (i3 = 0; i3 < size; i3++) {
            iArr3[i3] = ((Integer) arrayList.get(i3)).intValue();
            iArr4[i3] = (int[]) arrayList2.get(i3);
        }
        return new ColorStateList(iArr4, iArr3);
    }

    private static boolean a(List<Integer> list, int i, List<int[]> list2, int[] iArr) {
        new HashSet(list);
        if (!list.contains(Integer.valueOf(i))) {
            return true;
        }
        for (int[] next : list2) {
            if (StateSet.stateSetMatches(next, iArr)) {
                return list.get(list2.indexOf(next)).intValue() != i;
            }
        }
        return true;
    }
}
