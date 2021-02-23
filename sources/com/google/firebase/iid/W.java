package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import b.h.a.a;
import c.b.b.b.d.e.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

final class W {
    W() {
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0095=Splitter:B:31:0x0095, B:19:0x0057=Splitter:B:19:0x0057} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.firebase.iid.Y a(android.content.Context r9, java.lang.String r10, com.google.firebase.iid.Y r11, boolean r12) {
        /*
            r8 = this;
            r0 = 3
            java.lang.String r1 = "FirebaseInstanceId"
            boolean r2 = android.util.Log.isLoggable(r1, r0)
            if (r2 == 0) goto L_0x000e
            java.lang.String r2 = "Writing ID to properties file"
            android.util.Log.d(r1, r2)
        L_0x000e:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            java.lang.String r3 = r11.a()
            java.lang.String r4 = "id"
            r2.setProperty(r4, r3)
            long r3 = r11.f14549b
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "cre"
            r2.setProperty(r4, r3)
            java.io.File r9 = e(r9, r10)
            r10 = 0
            r9.createNewFile()     // Catch:{ IOException -> 0x00af }
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x00af }
            java.lang.String r4 = "rw"
            r3.<init>(r9, r4)     // Catch:{ IOException -> 0x00af }
            java.nio.channels.FileChannel r9 = r3.getChannel()     // Catch:{ Throwable -> 0x00a5 }
            r9.lock()     // Catch:{ Throwable -> 0x0099 }
            r4 = 0
            if (r12 == 0) goto L_0x0086
            long r6 = r9.size()     // Catch:{ Throwable -> 0x0099 }
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x0086
            r9.position(r4)     // Catch:{ IOException -> 0x005d, Z -> 0x005b }
            com.google.firebase.iid.Y r11 = a((java.nio.channels.FileChannel) r9)     // Catch:{ IOException -> 0x005d, Z -> 0x005b }
            if (r9 == 0) goto L_0x0057
            r9.close()     // Catch:{ Throwable -> 0x00a5 }
        L_0x0057:
            r3.close()     // Catch:{ IOException -> 0x00af }
            return r11
        L_0x005b:
            r12 = move-exception
            goto L_0x005e
        L_0x005d:
            r12 = move-exception
        L_0x005e:
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ Throwable -> 0x0099 }
            if (r0 == 0) goto L_0x0086
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ Throwable -> 0x0099 }
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch:{ Throwable -> 0x0099 }
            int r0 = r0.length()     // Catch:{ Throwable -> 0x0099 }
            int r0 = r0 + 58
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0099 }
            r6.<init>(r0)     // Catch:{ Throwable -> 0x0099 }
            java.lang.String r0 = "Tried reading ID before writing new one, but failed with: "
            r6.append(r0)     // Catch:{ Throwable -> 0x0099 }
            r6.append(r12)     // Catch:{ Throwable -> 0x0099 }
            java.lang.String r12 = r6.toString()     // Catch:{ Throwable -> 0x0099 }
            android.util.Log.d(r1, r12)     // Catch:{ Throwable -> 0x0099 }
        L_0x0086:
            r9.truncate(r4)     // Catch:{ Throwable -> 0x0099 }
            java.io.OutputStream r12 = java.nio.channels.Channels.newOutputStream(r9)     // Catch:{ Throwable -> 0x0099 }
            r2.store(r12, r10)     // Catch:{ Throwable -> 0x0099 }
            if (r9 == 0) goto L_0x0095
            r9.close()     // Catch:{ Throwable -> 0x00a5 }
        L_0x0095:
            r3.close()     // Catch:{ IOException -> 0x00af }
            return r11
        L_0x0099:
            r11 = move-exception
            if (r9 == 0) goto L_0x00a4
            r9.close()     // Catch:{ Throwable -> 0x00a0 }
            goto L_0x00a4
        L_0x00a0:
            r9 = move-exception
            c.b.b.b.d.e.l.a(r11, r9)     // Catch:{ Throwable -> 0x00a5 }
        L_0x00a4:
            throw r11     // Catch:{ Throwable -> 0x00a5 }
        L_0x00a5:
            r9 = move-exception
            r3.close()     // Catch:{ Throwable -> 0x00aa }
            goto L_0x00ae
        L_0x00aa:
            r11 = move-exception
            c.b.b.b.d.e.l.a(r9, r11)     // Catch:{ IOException -> 0x00af }
        L_0x00ae:
            throw r9     // Catch:{ IOException -> 0x00af }
        L_0x00af:
            r9 = move-exception
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r11 = java.lang.String.valueOf(r9)
            int r11 = r11.length()
            int r11 = r11 + 21
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            java.lang.String r11 = "Failed to write key: "
            r12.append(r11)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            android.util.Log.w(r1, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.W.a(android.content.Context, java.lang.String, com.google.firebase.iid.Y, boolean):com.google.firebase.iid.Y");
    }

    private static Y a(SharedPreferences sharedPreferences, String str) {
        long b2 = b(sharedPreferences, str);
        String string = sharedPreferences.getString(C3334v.a(str, "id"), (String) null);
        if (string == null) {
            String string2 = sharedPreferences.getString(C3334v.a(str, "|P|"), (String) null);
            if (string2 == null) {
                return null;
            }
            string = C3324k.a(a(string2));
        }
        return new Y(string, b2);
    }

    private final Y a(File file) {
        FileChannel channel;
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            channel = fileInputStream.getChannel();
            channel.lock(0, Long.MAX_VALUE, true);
            Y a2 = a(channel);
            if (channel != null) {
                channel.close();
            }
            fileInputStream.close();
            return a2;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                l.a(th, th2);
            }
            throw th;
        }
        throw th;
    }

    private static Y a(FileChannel fileChannel) {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        try {
            long parseLong = Long.parseLong(properties.getProperty("cre"));
            String property = properties.getProperty("id");
            if (property == null) {
                String property2 = properties.getProperty("pub");
                if (property2 != null) {
                    property = C3324k.a(a(property2));
                } else {
                    throw new Z("Invalid properties file");
                }
            }
            return new Y(property, parseLong);
        } catch (NumberFormatException e2) {
            throw new Z((Exception) e2);
        }
    }

    private static PublicKey a(String str) {
        try {
            try {
                return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                throw new Z((Exception) e2);
            }
        } catch (IllegalArgumentException e3) {
            throw new Z((Exception) e3);
        }
    }

    static void a(Context context) {
        for (File file : b(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    private final void a(Context context, String str, Y y) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (y.equals(a(sharedPreferences, str))) {
                return;
            }
        } catch (Z unused) {
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to shared preferences");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(C3334v.a(str, "id"), y.a());
        edit.putString(C3334v.a(str, "cre"), String.valueOf(y.f14549b));
        edit.commit();
    }

    private static long b(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(C3334v.a(str, "cre"), (String) null);
        if (string == null) {
            return 0;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private static File b(Context context) {
        File b2 = a.b(context);
        if (b2 != null && b2.isDirectory()) {
            return b2;
        }
        Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    private final Y c(Context context, String str) {
        try {
            Y d2 = d(context, str);
            if (d2 != null) {
                a(context, str, d2);
                return d2;
            }
            e = null;
            try {
                Y a2 = a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
                if (a2 != null) {
                    a(context, str, a2, false);
                    return a2;
                }
            } catch (Z e2) {
                e = e2;
            }
            if (e == null) {
                return null;
            }
            throw e;
        } catch (Z e3) {
            e = e3;
        }
    }

    private final Y d(Context context, String str) {
        File e2 = e(context, str);
        if (!e2.exists()) {
            return null;
        }
        try {
            return a(e2);
        } catch (Z | IOException e3) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e3);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                sb.append("Failed to read ID from file, retrying: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            try {
                return a(e2);
            } catch (IOException e4) {
                String valueOf2 = String.valueOf(e4);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(valueOf2);
                Log.w("FirebaseInstanceId", sb2.toString());
                throw new Z((Exception) e4);
            }
        }
    }

    private static File e(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                str2 = sb.toString();
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }
        return new File(b(context), str2);
    }

    /* access modifiers changed from: package-private */
    public final Y a(Context context, String str) {
        Y c2 = c(context, str);
        return c2 != null ? c2 : b(context, str);
    }

    /* access modifiers changed from: package-private */
    public final Y b(Context context, String str) {
        Y y = new Y(C3324k.a(C.a().getPublic()), System.currentTimeMillis());
        Y a2 = a(context, str, y, true);
        if (a2 == null || a2.equals(y)) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Generated new key");
            }
            a(context, str, y);
            return y;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Loaded key after generating new one, using loaded one");
        }
        return a2;
    }
}
