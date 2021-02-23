package c.b.b.b.b;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.C0155e;
import androidx.fragment.app.C0164n;
import com.google.android.gms.common.internal.C0563t;

public class m extends C0155e {
    private Dialog ha = null;
    private DialogInterface.OnCancelListener ia = null;

    public static m a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        m mVar = new m();
        C0563t.a(dialog, (Object) "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        mVar.ha = dialog2;
        if (onCancelListener != null) {
            mVar.ia = onCancelListener;
        }
        return mVar;
    }

    public void a(C0164n nVar, String str) {
        super.a(nVar, str);
    }

    public Dialog n(Bundle bundle) {
        if (this.ha == null) {
            g(false);
        }
        return this.ha;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.ia;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
