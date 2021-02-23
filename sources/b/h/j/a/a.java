package b.h.j.a;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    private final int f2535a;

    /* renamed from: b  reason: collision with root package name */
    private final c f2536b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2537c;

    public a(int i, c cVar, int i2) {
        this.f2535a = i;
        this.f2536b = cVar;
        this.f2537c = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2535a);
        this.f2536b.a(this.f2537c, bundle);
    }
}
