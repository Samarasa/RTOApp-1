package androidx.work;

import java.util.List;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1735a = h.a("InputMerger");

    public static g a(String str) {
        try {
            return (g) Class.forName(str).newInstance();
        } catch (Exception e2) {
            h a2 = h.a();
            String str2 = f1735a;
            a2.b(str2, "Trouble instantiating + " + str, e2);
            return null;
        }
    }

    public abstract e a(List<e> list);
}
