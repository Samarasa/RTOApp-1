package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Pattern;

public class q {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f6054a = Pattern.compile("\\$\\{(.*?)\\}");

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public static boolean b(String str) {
        return str == null || str.trim().isEmpty();
    }
}
