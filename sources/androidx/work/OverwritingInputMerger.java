package androidx.work;

import androidx.work.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class OverwritingInputMerger extends g {
    public e a(List<e> list) {
        e.a aVar = new e.a();
        HashMap hashMap = new HashMap();
        for (e a2 : list) {
            hashMap.putAll(a2.a());
        }
        aVar.a((Map<String, Object>) hashMap);
        return aVar.a();
    }
}
