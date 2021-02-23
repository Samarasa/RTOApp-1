package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.internal.ads.fT  reason: case insensitive filesystem */
public final class C1642fT {

    /* renamed from: a  reason: collision with root package name */
    private final Pattern f10405a;

    public C1642fT() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) Qqa.e().a(F.cf));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.f10405a = pattern;
    }

    public final String a(String str) {
        Pattern pattern = this.f10405a;
        if (!(pattern == null || str == null)) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
