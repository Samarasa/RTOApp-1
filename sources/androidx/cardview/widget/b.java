package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.cardview.widget.j;

class b implements j.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f759a;

    b(c cVar) {
        this.f759a = cVar;
    }

    public void a(Canvas canvas, RectF rectF, float f2, Paint paint) {
        canvas.drawRoundRect(rectF, f2, f2, paint);
    }
}
