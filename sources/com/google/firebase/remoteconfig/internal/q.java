package com.google.firebase.remoteconfig.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

class q extends ThreadLocal<DateFormat> {
    q() {
    }

    /* access modifiers changed from: protected */
    public DateFormat initialValue() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    }
}
