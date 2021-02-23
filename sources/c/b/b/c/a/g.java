package c.b.b.c.a;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

public class g implements TypeEvaluator<Matrix> {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f4759a = new float[9];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f4760b = new float[9];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f4761c = new Matrix();

    public Matrix a(float f2, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f4759a);
        matrix2.getValues(this.f4760b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f4760b;
            float f3 = fArr[i];
            float[] fArr2 = this.f4759a;
            fArr[i] = fArr2[i] + ((f3 - fArr2[i]) * f2);
        }
        this.f4761c.setValues(this.f4760b);
        return this.f4761c;
    }
}
