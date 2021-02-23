package b.q;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class M {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f2704a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f2705b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<E> f2706c = new ArrayList<>();

    public boolean equals(Object obj) {
        if (!(obj instanceof M)) {
            return false;
        }
        M m = (M) obj;
        return this.f2705b == m.f2705b && this.f2704a.equals(m.f2704a);
    }

    public int hashCode() {
        return (this.f2705b.hashCode() * 31) + this.f2704a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2705b + "\n") + "    values:";
        for (String next : this.f2704a.keySet()) {
            str = str + "    " + next + ": " + this.f2704a.get(next) + "\n";
        }
        return str;
    }
}
