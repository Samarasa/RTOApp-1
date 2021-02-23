package androidx.lifecycle;

import java.util.HashMap;
import java.util.Map;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Integer> f1245a = new HashMap();

    public boolean a(String str, int i) {
        Integer num = this.f1245a.get(str);
        boolean z = false;
        int intValue = num != null ? num.intValue() : 0;
        if ((intValue & i) != 0) {
            z = true;
        }
        this.f1245a.put(str, Integer.valueOf(i | intValue));
        return !z;
    }
}
