package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b  reason: case insensitive filesystem */
class C0112b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    final ActionBarContainer f613a;

    public C0112b(ActionBarContainer actionBarContainer) {
        this.f613a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f613a;
        if (actionBarContainer.f400h) {
            Drawable drawable = actionBarContainer.f399g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f397e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f613a;
        Drawable drawable3 = actionBarContainer2.f398f;
        if (drawable3 != null && actionBarContainer2.i) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f613a;
        if (actionBarContainer.f400h) {
            drawable = actionBarContainer.f399g;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f397e;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
