package c.b.b.b.d.a;

import android.os.Parcel;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final ClassLoader f3919a = c.class.getClassLoader();

    private c() {
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(1);
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
