package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public final class UX implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    private final Pattern f8909a;

    public UX(Pattern pattern) {
        C1434cX.a(pattern);
        this.f8909a = pattern;
    }

    public final boolean accept(File file, String str) {
        return this.f8909a.matcher(str).matches();
    }
}
