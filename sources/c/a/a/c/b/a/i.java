package c.a.a.c.b.a;

public final class i implements a<int[]> {
    public int a() {
        return 4;
    }

    public int a(int[] iArr) {
        return iArr.length;
    }

    public String getTag() {
        return "IntegerArrayPool";
    }

    public int[] newArray(int i) {
        return new int[i];
    }
}
