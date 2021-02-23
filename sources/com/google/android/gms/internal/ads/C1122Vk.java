package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import com.google.android.gms.common.util.d;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.google.android.gms.internal.ads.Vk  reason: case insensitive filesystem */
public final class C1122Vk implements C0862Lk {

    /* renamed from: a  reason: collision with root package name */
    private final String f9069a;

    public C1122Vk() {
        this((String) null);
    }

    public C1122Vk(String str) {
        this.f9069a = str;
    }

    public final void a(String str) {
        HttpURLConnection httpURLConnection;
        try {
            if (d.a()) {
                TrafficStats.setThreadStatsTag(263);
            }
            String valueOf = String.valueOf(str);
            C1018Rk.a(valueOf.length() != 0 ? "Pinging URL: ".concat(valueOf) : new String("Pinging URL: "));
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            Qqa.a();
            C0758Hk.a(true, httpURLConnection, this.f9069a);
            C0836Kk kk = new C0836Kk();
            kk.a(httpURLConnection, (byte[]) null);
            int responseCode = httpURLConnection.getResponseCode();
            kk.a(httpURLConnection, responseCode);
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
                sb.append("Received non-success response code ");
                sb.append(responseCode);
                sb.append(" from pinging URL: ");
                sb.append(str);
                C1018Rk.d(sb.toString());
            }
            httpURLConnection.disconnect();
            if (d.a()) {
                TrafficStats.clearThreadStatsTag();
            }
        } catch (IndexOutOfBoundsException e2) {
            String message = e2.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message).length());
            sb2.append("Error while parsing ping URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            C1018Rk.d(sb2.toString());
            if (d.a()) {
                TrafficStats.clearThreadStatsTag();
            }
        } catch (IOException e3) {
            String message2 = e3.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message2).length());
            sb3.append("Error while pinging URL: ");
            sb3.append(str);
            sb3.append(". ");
            sb3.append(message2);
            C1018Rk.d(sb3.toString());
            if (d.a()) {
                TrafficStats.clearThreadStatsTag();
            }
        } catch (RuntimeException e4) {
            try {
                String message3 = e4.getMessage();
                StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
                sb4.append("Error while pinging URL: ");
                sb4.append(str);
                sb4.append(". ");
                sb4.append(message3);
                C1018Rk.d(sb4.toString());
            } finally {
                if (d.a()) {
                    TrafficStats.clearThreadStatsTag();
                }
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
