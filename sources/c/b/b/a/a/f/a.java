package c.b.b.a.a.f;

import android.util.SparseArray;
import c.b.b.a.d;
import java.util.EnumMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static SparseArray<d> f3814a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private static EnumMap<d, Integer> f3815b = new EnumMap<>(d.class);

    static {
        f3815b.put(d.DEFAULT, 0);
        f3815b.put(d.VERY_LOW, 1);
        f3815b.put(d.HIGHEST, 2);
        for (d next : f3815b.keySet()) {
            f3814a.append(f3815b.get(next).intValue(), next);
        }
    }

    public static int a(d dVar) {
        Integer num = f3815b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d a(int i) {
        d dVar = f3814a.get(i);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
