package org.jsoup.nodes;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

public class BooleanAttribute extends Attribute {
    public BooleanAttribute(String str) {
        super(str, BuildConfig.FLAVOR);
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        return true;
    }
}
