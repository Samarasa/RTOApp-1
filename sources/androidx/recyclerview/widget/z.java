package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

class z implements Interpolator {
    z() {
    }

    public float getInterpolation(float f2) {
        float f3 = f2 - 1.0f;
        return (f3 * f3 * f3 * f3 * f3) + 1.0f;
    }
}
