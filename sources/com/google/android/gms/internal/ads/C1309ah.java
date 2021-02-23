package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.p;

/* renamed from: com.google.android.gms.internal.ads.ah  reason: case insensitive filesystem */
final class C1309ah implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f9825a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f9826b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C1380bh f9827c;

    C1309ah(C1380bh bhVar, String str, String str2) {
        this.f9827c = bhVar;
        this.f9825a = str;
        this.f9826b = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.f9827c.f9946d.getSystemService("download");
        try {
            String str = this.f9825a;
            String str2 = this.f9826b;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            p.e();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f9827c.a("Could not store picture.");
        }
    }
}
