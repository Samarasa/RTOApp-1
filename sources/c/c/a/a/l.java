package c.c.a.a;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

class l implements HttpEntity {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f5118a = "\r\n".getBytes();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f5119b = "Content-Transfer-Encoding: binary\r\n".getBytes();

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f5120c = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /* renamed from: d  reason: collision with root package name */
    private String f5121d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public byte[] f5122e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f5123f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5124g = false;

    /* renamed from: h  reason: collision with root package name */
    private List<a> f5125h = new ArrayList();
    private ByteArrayOutputStream i = new ByteArrayOutputStream();
    private j j;
    private int k;
    private int l;

    private class a {

        /* renamed from: a  reason: collision with root package name */
        public File f5126a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f5127b;

        public a(String str, File file, String str2) {
            this.f5127b = a(str, file.getName(), str2);
            this.f5126a = file;
        }

        private byte[] a(String str, String str2, String str3) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(l.this.f5122e);
                byteArrayOutputStream.write(l.this.b(str, str2));
                byteArrayOutputStream.write(l.this.b(str3));
                byteArrayOutputStream.write(l.f5119b);
                byteArrayOutputStream.write(l.f5118a);
            } catch (IOException e2) {
                Log.e("SimpleMultipartEntity", "createHeader ByteArrayOutputStream exception", e2);
            }
            return byteArrayOutputStream.toByteArray();
        }

        public long a() {
            return ((long) this.f5127b.length) + this.f5126a.length();
        }

        public void a(OutputStream outputStream) {
            outputStream.write(this.f5127b);
            l.this.a(this.f5127b.length);
            FileInputStream fileInputStream = new FileInputStream(this.f5126a);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                    l.this.a(read);
                } else {
                    outputStream.write(l.f5118a);
                    l.this.a(l.f5118a.length);
                    outputStream.flush();
                    try {
                        fileInputStream.close();
                        return;
                    } catch (IOException e2) {
                        Log.w("SimpleMultipartEntity", "Cannot close input stream", e2);
                        return;
                    }
                }
            }
        }
    }

    public l(j jVar) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i2 = 0; i2 < 30; i2++) {
            char[] cArr = f5120c;
            sb.append(cArr[random.nextInt(cArr.length)]);
        }
        this.f5121d = sb.toString();
        this.f5122e = ("--" + this.f5121d + "\r\n").getBytes();
        this.f5123f = ("--" + this.f5121d + "--\r\n").getBytes();
        this.j = jVar;
    }

    /* access modifiers changed from: private */
    public void a(int i2) {
        this.k += i2;
        this.j.sendProgressMessage(this.k, this.l);
    }

    private byte[] a(String str) {
        return ("Content-Disposition: form-data; name=\"" + str + "\"\r\n").getBytes();
    }

    /* access modifiers changed from: private */
    public byte[] b(String str) {
        return ("Content-Type: " + str + "\r\n").getBytes();
    }

    /* access modifiers changed from: private */
    public byte[] b(String str, String str2) {
        return ("Content-Disposition: form-data; name=\"" + str + "\"; filename=\"" + str2 + "\"\r\n").getBytes();
    }

    public void a(String str, File file, String str2) {
        if (str2 == null) {
            str2 = "application/octet-stream";
        }
        this.f5125h.add(new a(str, file, str2));
    }

    public void a(String str, String str2) {
        a(str, str2, "text/plain; charset=UTF-8");
    }

    public void a(String str, String str2, InputStream inputStream, String str3) {
        if (str3 == null) {
            str3 = "application/octet-stream";
        }
        this.i.write(this.f5122e);
        this.i.write(b(str, str2));
        this.i.write(b(str3));
        this.i.write(f5119b);
        this.i.write(f5118a);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                this.i.write(bArr, 0, read);
            } else {
                this.i.write(f5118a);
                this.i.flush();
                try {
                    inputStream.close();
                    return;
                } catch (IOException e2) {
                    Log.w("SimpleMultipartEntity", "Cannot close input stream", e2);
                    return;
                }
            }
        }
    }

    public void a(String str, String str2, String str3) {
        try {
            this.i.write(this.f5122e);
            this.i.write(a(str));
            this.i.write(b(str3));
            this.i.write(f5118a);
            this.i.write(str2.getBytes());
            this.i.write(f5118a);
        } catch (IOException e2) {
            Log.e("SimpleMultipartEntity", "addPart ByteArrayOutputStream exception", e2);
        }
    }

    public void a(boolean z) {
        this.f5124g = z;
    }

    public void consumeContent() {
        if (isStreaming()) {
            throw new UnsupportedOperationException("Streaming entity does not implement #consumeContent()");
        }
    }

    public InputStream getContent() {
        throw new UnsupportedOperationException("getContent() is not supported. Use writeTo() instead.");
    }

    public Header getContentEncoding() {
        return null;
    }

    public long getContentLength() {
        long size = (long) this.i.size();
        for (a a2 : this.f5125h) {
            long a3 = a2.a();
            if (a3 < 0) {
                return -1;
            }
            size += a3;
        }
        return size + ((long) this.f5123f.length);
    }

    public Header getContentType() {
        return new BasicHeader("Content-Type", "multipart/form-data; boundary=" + this.f5121d);
    }

    public boolean isChunked() {
        return false;
    }

    public boolean isRepeatable() {
        return this.f5124g;
    }

    public boolean isStreaming() {
        return false;
    }

    public void writeTo(OutputStream outputStream) {
        this.k = 0;
        this.l = (int) getContentLength();
        this.i.writeTo(outputStream);
        a(this.i.size());
        for (a a2 : this.f5125h) {
            a2.a(outputStream);
        }
        outputStream.write(this.f5123f);
        a(this.f5123f.length);
    }
}
