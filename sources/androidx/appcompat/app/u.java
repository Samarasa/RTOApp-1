package androidx.appcompat.app;

import android.graphics.Rect;
import androidx.appcompat.widget.V;

class u implements V.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z f239a;

    u(z zVar) {
        this.f239a = zVar;
    }

    public void a(Rect rect) {
        rect.top = this.f239a.j(rect.top);
    }
}
