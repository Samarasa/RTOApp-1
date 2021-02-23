package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class g extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f815a;

    /* renamed from: b  reason: collision with root package name */
    private View f816b;

    /* renamed from: c  reason: collision with root package name */
    private int f817c;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f816b != null) {
            ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
            ConstraintLayout.a aVar2 = (ConstraintLayout.a) this.f816b.getLayoutParams();
            aVar2.la.n(0);
            aVar.la.o(aVar2.la.s());
            aVar.la.g(aVar2.la.i());
            aVar2.la.n(8);
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f815a == -1 && !isInEditMode()) {
            setVisibility(this.f817c);
        }
        this.f816b = constraintLayout.findViewById(this.f815a);
        View view = this.f816b;
        if (view != null) {
            ((ConstraintLayout.a) view.getLayoutParams()).aa = true;
            this.f816b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f816b;
    }

    public int getEmptyVisibility() {
        return this.f817c;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f815a != i) {
            View view = this.f816b;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.a) this.f816b.getLayoutParams()).aa = false;
                this.f816b = null;
            }
            this.f815a = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f817c = i;
    }
}
