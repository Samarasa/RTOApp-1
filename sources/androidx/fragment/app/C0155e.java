package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: androidx.fragment.app.e  reason: case insensitive filesystem */
public class C0155e extends C0158h implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler W;
    private Runnable X = new C0154d(this);
    int Y = 0;
    int Z = 0;
    boolean aa = true;
    boolean ba = true;
    int ca = -1;
    Dialog da;
    boolean ea;
    boolean fa;
    boolean ga;

    public void K() {
        super.K();
        Dialog dialog = this.da;
        if (dialog != null) {
            this.ea = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.da.dismiss();
            if (!this.fa) {
                onDismiss(this.da);
            }
            this.da = null;
        }
    }

    public void L() {
        super.L();
        if (!this.ga && !this.fa) {
            this.fa = true;
        }
    }

    public void O() {
        super.O();
        Dialog dialog = this.da;
        if (dialog != null) {
            this.ea = false;
            dialog.show();
        }
    }

    public void P() {
        super.P();
        Dialog dialog = this.da;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void a(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void a(Context context) {
        super.a(context);
        if (!this.ga) {
            this.fa = false;
        }
    }

    public void a(C0164n nVar, String str) {
        this.fa = false;
        this.ga = true;
        C a2 = nVar.a();
        a2.a(this, str);
        a2.a();
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z, boolean z2) {
        if (!this.fa) {
            this.fa = true;
            this.ga = false;
            Dialog dialog = this.da;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.da.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.W.getLooper()) {
                        onDismiss(this.da);
                    } else {
                        this.W.post(this.X);
                    }
                }
            }
            this.ea = true;
            if (this.ca >= 0) {
                ca().a(this.ca, 1);
                this.ca = -1;
                return;
            }
            C a2 = ca().a();
            a2.a((C0158h) this);
            if (z) {
                a2.b();
            } else {
                a2.a();
            }
        }
    }

    public void b(Bundle bundle) {
        Bundle bundle2;
        super.b(bundle);
        if (this.ba) {
            View z = z();
            if (z != null) {
                if (z.getParent() == null) {
                    this.da.setContentView(z);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            C0159i b2 = b();
            if (b2 != null) {
                this.da.setOwnerActivity(b2);
            }
            this.da.setCancelable(this.aa);
            this.da.setOnCancelListener(this);
            this.da.setOnDismissListener(this);
            if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                this.da.onRestoreInstanceState(bundle2);
            }
        }
    }

    public void c(Bundle bundle) {
        super.c(bundle);
        this.W = new Handler();
        this.ba = this.w == 0;
        if (bundle != null) {
            this.Y = bundle.getInt("android:style", 0);
            this.Z = bundle.getInt("android:theme", 0);
            this.aa = bundle.getBoolean("android:cancelable", true);
            this.ba = bundle.getBoolean("android:showsDialog", this.ba);
            this.ca = bundle.getInt("android:backStackId", -1);
        }
    }

    public LayoutInflater d(Bundle bundle) {
        Context c2;
        if (!this.ba) {
            return super.d(bundle);
        }
        this.da = n(bundle);
        Dialog dialog = this.da;
        if (dialog != null) {
            a(dialog, this.Y);
            c2 = this.da.getContext();
        } else {
            c2 = this.s.c();
        }
        return (LayoutInflater) c2.getSystemService("layout_inflater");
    }

    public void e(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.e(bundle);
        Dialog dialog = this.da;
        if (!(dialog == null || (onSaveInstanceState = dialog.onSaveInstanceState()) == null)) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.Y;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.Z;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.aa;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.ba;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.ca;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void g(boolean z) {
        this.ba = z;
    }

    public Dialog n(Bundle bundle) {
        throw null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.ea) {
            a(true, true);
        }
    }
}
