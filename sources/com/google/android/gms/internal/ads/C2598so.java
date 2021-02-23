package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.so  reason: case insensitive filesystem */
public final class C2598so {

    /* renamed from: a  reason: collision with root package name */
    public final String f12135a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f12136b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12137c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, String> f12138d;

    @TargetApi(21)
    public C2598so(WebResourceRequest webResourceRequest) {
        this(webResourceRequest.getUrl().toString(), webResourceRequest.getUrl(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders());
    }

    public C2598so(String str) {
        this(str, Uri.parse(str), (String) null, (Map<String, String>) null);
    }

    private C2598so(String str, Uri uri, String str2, Map<String, String> map) {
        this.f12135a = str;
        this.f12136b = uri;
        this.f12137c = str2 == null ? "GET" : str2;
        this.f12138d = map == null ? Collections.emptyMap() : map;
    }
}
