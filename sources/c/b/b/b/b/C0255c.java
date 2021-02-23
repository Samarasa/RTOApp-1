package c.b.b.b.b;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.C0563t;

/* renamed from: c.b.b.b.b.c  reason: case insensitive filesystem */
public class C0255c extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    private Dialog f3868a = null;

    /* renamed from: b  reason: collision with root package name */
    private DialogInterface.OnCancelListener f3869b = null;

    public static C0255c a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C0255c cVar = new C0255c();
        C0563t.a(dialog, (Object) "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        cVar.f3868a = dialog2;
        if (onCancelListener != null) {
            cVar.f3869b = onCancelListener;
        }
        return cVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f3869b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f3868a == null) {
            setShowsDialog(false);
        }
        return this.f3868a;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
