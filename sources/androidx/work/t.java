package androidx.work;

import android.content.Context;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2050a = h.a("WorkerFactory");

    public static t a() {
        return new s();
    }

    public abstract ListenableWorker a(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker b(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker a2 = a(context, str, workerParameters);
        if (a2 != null) {
            return a2;
        }
        try {
            try {
                return (ListenableWorker) Class.forName(str).asSubclass(ListenableWorker.class).getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
            } catch (Exception e2) {
                h a3 = h.a();
                String str2 = f2050a;
                a3.b(str2, "Could not instantiate " + str, e2);
                return null;
            }
        } catch (ClassNotFoundException unused) {
            h a4 = h.a();
            String str3 = f2050a;
            a4.b(str3, "Class not found: " + str, new Throwable[0]);
            return null;
        }
    }
}
