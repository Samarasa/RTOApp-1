package c.b.d;

import com.google.android.gms.common.internal.C0563t;

public class f extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(String str) {
        super(str);
        C0563t.a(str, (Object) "Detail message must not be empty");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(String str, Throwable th) {
        super(str, th);
        C0563t.a(str, (Object) "Detail message must not be empty");
    }
}
