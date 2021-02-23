package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.view.menu.w;
import androidx.appcompat.widget.F;

class D extends W {
    final /* synthetic */ F.c j;
    final /* synthetic */ F k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    D(F f2, View view, F.c cVar) {
        super(view);
        this.k = f2;
        this.j = cVar;
    }

    public w a() {
        return this.j;
    }

    @SuppressLint({"SyntheticAccessor"})
    public boolean b() {
        if (this.k.getInternalPopup().v()) {
            return true;
        }
        this.k.a();
        return true;
    }
}
