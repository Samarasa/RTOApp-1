package c.b.b.b.b.c;

import android.content.Context;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static c f3873a = new c();

    /* renamed from: b  reason: collision with root package name */
    private b f3874b = null;

    public static b a(Context context) {
        return f3873a.b(context);
    }

    private final synchronized b b(Context context) {
        if (this.f3874b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f3874b = new b(context);
        }
        return this.f3874b;
    }
}
