package c.b.b.b.c;

import android.os.IBinder;
import android.os.IInterface;
import c.b.b.b.d.c.b;

public interface a extends IInterface {

    /* renamed from: c.b.b.b.c.a$a  reason: collision with other inner class name */
    public static abstract class C0060a extends c.b.b.b.d.c.a implements a {

        /* renamed from: c.b.b.b.c.a$a$a  reason: collision with other inner class name */
        public static class C0061a extends b implements a {
            C0061a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public C0060a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new C0061a(iBinder);
        }
    }
}
