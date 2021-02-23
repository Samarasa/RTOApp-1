package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

/* renamed from: androidx.appcompat.app.n  reason: case insensitive filesystem */
public class C0107n extends D implements DialogInterface {

    /* renamed from: c  reason: collision with root package name */
    final AlertController f230c = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.n$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final AlertController.a f231a;

        /* renamed from: b  reason: collision with root package name */
        private final int f232b;

        public a(Context context) {
            this(context, C0107n.a(context, 0));
        }

        public a(Context context, int i) {
            this.f231a = new AlertController.a(new ContextThemeWrapper(context, C0107n.a(context, i)));
            this.f232b = i;
        }

        public a a(int i) {
            AlertController.a aVar = this.f231a;
            aVar.f124h = aVar.f117a.getText(i);
            return this;
        }

        public a a(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.a aVar = this.f231a;
            aVar.l = aVar.f117a.getText(i);
            this.f231a.n = onClickListener;
            return this;
        }

        public a a(DialogInterface.OnKeyListener onKeyListener) {
            this.f231a.u = onKeyListener;
            return this;
        }

        public a a(Drawable drawable) {
            this.f231a.f120d = drawable;
            return this;
        }

        public a a(View view) {
            this.f231a.f123g = view;
            return this;
        }

        public a a(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.a aVar = this.f231a;
            aVar.w = listAdapter;
            aVar.x = onClickListener;
            aVar.I = i;
            aVar.H = true;
            return this;
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.a aVar = this.f231a;
            aVar.w = listAdapter;
            aVar.x = onClickListener;
            return this;
        }

        public a a(CharSequence charSequence) {
            this.f231a.f124h = charSequence;
            return this;
        }

        public a a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.a aVar = this.f231a;
            aVar.l = charSequence;
            aVar.n = onClickListener;
            return this;
        }

        public a a(boolean z) {
            this.f231a.r = z;
            return this;
        }

        public C0107n a() {
            C0107n nVar = new C0107n(this.f231a.f117a, this.f232b);
            this.f231a.a(nVar.f230c);
            nVar.setCancelable(this.f231a.r);
            if (this.f231a.r) {
                nVar.setCanceledOnTouchOutside(true);
            }
            nVar.setOnCancelListener(this.f231a.s);
            nVar.setOnDismissListener(this.f231a.t);
            DialogInterface.OnKeyListener onKeyListener = this.f231a.u;
            if (onKeyListener != null) {
                nVar.setOnKeyListener(onKeyListener);
            }
            return nVar;
        }

        public Context b() {
            return this.f231a.f117a;
        }

        public a b(int i) {
            AlertController.a aVar = this.f231a;
            aVar.f122f = aVar.f117a.getText(i);
            return this;
        }

        public a b(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.a aVar = this.f231a;
            aVar.i = aVar.f117a.getText(i);
            this.f231a.k = onClickListener;
            return this;
        }

        public a b(View view) {
            AlertController.a aVar = this.f231a;
            aVar.z = view;
            aVar.y = 0;
            aVar.E = false;
            return this;
        }

        public a b(CharSequence charSequence) {
            this.f231a.f122f = charSequence;
            return this;
        }

        public a b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.a aVar = this.f231a;
            aVar.i = charSequence;
            aVar.k = onClickListener;
            return this;
        }

        public C0107n c() {
            C0107n a2 = a();
            a2.show();
            return a2;
        }
    }

    protected C0107n(Context context, int i) {
        super(context, a(context, i));
    }

    static int a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(b.a.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public void a(View view) {
        this.f230c.c(view);
    }

    public ListView b() {
        return this.f230c.a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f230c.b();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f230c.a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f230c.b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f230c.b(charSequence);
    }
}
