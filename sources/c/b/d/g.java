package c.b.d;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0533m;

public class g implements C0533m {
    public Exception a(Status status) {
        return status.g() == 8 ? new f(status.a()) : new b(status.a());
    }
}
