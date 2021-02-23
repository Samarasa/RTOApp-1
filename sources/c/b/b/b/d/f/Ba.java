package c.b.b.b.d.f;

import android.util.Log;

final class Ba extends C0443wa<Boolean> {
    Ba(Ca ca, String str, Boolean bool) {
        super(ca, str, bool, (C0457ya) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (C0333ga.f4440c.matcher(str).matches()) {
                return true;
            }
            if (C0333ga.f4441d.matcher(str).matches()) {
                return false;
            }
        }
        String b2 = super.b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(b2);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
