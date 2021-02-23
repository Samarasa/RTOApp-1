package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import c.b.b.b.d.e.j;
import c.b.b.b.d.e.l;
import c.b.b.b.g.i;
import com.google.android.gms.common.internal.C0563t;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Executor;

final class p implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final URL f14665a;

    /* renamed from: b  reason: collision with root package name */
    private i<Bitmap> f14666b;

    /* renamed from: c  reason: collision with root package name */
    private volatile InputStream f14667c;

    private p(URL url) {
        this.f14665a = url;
    }

    public static p e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new p(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(valueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    private final byte[] s() {
        URLConnection openConnection = this.f14665a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                this.f14667c = inputStream;
                byte[] a2 = c.b.b.b.d.e.i.a(c.b.b.b.d.e.i.a(inputStream, 1048577));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    int length = a2.length;
                    String valueOf = String.valueOf(this.f14665a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("Downloaded ");
                    sb.append(length);
                    sb.append(" bytes from ");
                    sb.append(valueOf);
                    Log.v("FirebaseMessaging", sb.toString());
                }
                if (a2.length <= 1048576) {
                    return a2;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                l.a(th, th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    public final i<Bitmap> a() {
        i<Bitmap> iVar = this.f14666b;
        C0563t.a(iVar);
        return iVar;
    }

    public final void a(Executor executor) {
        this.f14666b = c.b.b.b.g.l.a(executor, new o(this));
    }

    public final void close() {
        try {
            j.a(this.f14667c);
        } catch (NullPointerException e2) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e2);
        }
    }

    public final Bitmap r() {
        String valueOf = String.valueOf(this.f14665a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Starting download of: ");
        sb.append(valueOf);
        Log.i("FirebaseMessaging", sb.toString());
        byte[] s = s();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(s, 0, s.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf2 = String.valueOf(this.f14665a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                sb2.append("Successfully downloaded image: ");
                sb2.append(valueOf2);
                Log.d("FirebaseMessaging", sb2.toString());
            }
            return decodeByteArray;
        }
        String valueOf3 = String.valueOf(this.f14665a);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 24);
        sb3.append("Failed to decode image: ");
        sb3.append(valueOf3);
        throw new IOException(sb3.toString());
    }
}
