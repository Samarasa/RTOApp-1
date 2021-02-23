package b.h.j;

import android.os.Build;
import android.view.ViewGroup;
import b.h.c;

public final class A {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(c.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && y.s(viewGroup) == null) ? false : true;
    }
}
