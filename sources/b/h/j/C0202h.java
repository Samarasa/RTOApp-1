package b.h.j;

import android.view.MotionEvent;

/* renamed from: b.h.j.h  reason: case insensitive filesystem */
public final class C0202h {
    @Deprecated
    public static int a(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    public static int a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @Deprecated
    public static int b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    public static float c(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    public static boolean d(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
