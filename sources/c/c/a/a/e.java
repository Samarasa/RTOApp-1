package c.c.a.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;

public class e implements j {
    protected static final int BUFFER_SIZE = 4096;
    public static final String DEFAULT_CHARSET = "UTF-8";
    protected static final int FAILURE_MESSAGE = 1;
    protected static final int FINISH_MESSAGE = 3;
    private static final String LOG_TAG = "AsyncHttpResponseHandler";
    protected static final int PROGRESS_MESSAGE = 4;
    protected static final int RETRY_MESSAGE = 5;
    protected static final int START_MESSAGE = 2;
    protected static final int SUCCESS_MESSAGE = 0;
    private Handler handler;
    private Header[] requestHeaders = null;
    private URI requestURI = null;
    private String responseCharset = "UTF-8";
    private Boolean useSynchronousMode = false;

    static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<e> f5100a;

        a(e eVar) {
            this.f5100a = new WeakReference<>(eVar);
        }

        public void handleMessage(Message message) {
            e eVar = (e) this.f5100a.get();
            if (eVar != null) {
                eVar.handleMessage(message);
            }
        }
    }

    public e() {
        if (Looper.myLooper() != null) {
            this.handler = new a(this);
        }
    }

    public String getCharset() {
        String str = this.responseCharset;
        return str == null ? "UTF-8" : str;
    }

    public Header[] getRequestHeaders() {
        return this.requestHeaders;
    }

    public URI getRequestURI() {
        return this.requestURI;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r8.toByteArray();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getResponseData(org.apache.http.HttpEntity r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x0060
            java.io.InputStream r0 = r8.getContent()
            if (r0 == 0) goto L_0x0060
            long r1 = r8.getContentLength()
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 > 0) goto L_0x0058
            r3 = 0
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 >= 0) goto L_0x001b
            r1 = 4096(0x1000, double:2.0237E-320)
        L_0x001b:
            org.apache.http.util.ByteArrayBuffer r8 = new org.apache.http.util.ByteArrayBuffer     // Catch:{ OutOfMemoryError -> 0x004d }
            int r2 = (int) r1     // Catch:{ OutOfMemoryError -> 0x004d }
            r8.<init>(r2)     // Catch:{ OutOfMemoryError -> 0x004d }
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x0048 }
            r3 = 0
            r4 = 0
        L_0x0027:
            int r5 = r0.read(r1)     // Catch:{ all -> 0x0048 }
            r6 = -1
            if (r5 == r6) goto L_0x0040
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0048 }
            boolean r6 = r6.isInterrupted()     // Catch:{ all -> 0x0048 }
            if (r6 != 0) goto L_0x0040
            int r4 = r4 + r5
            r8.append(r1, r3, r5)     // Catch:{ all -> 0x0048 }
            r7.sendProgressMessage(r4, r2)     // Catch:{ all -> 0x0048 }
            goto L_0x0027
        L_0x0040:
            r0.close()     // Catch:{ OutOfMemoryError -> 0x004d }
            byte[] r8 = r8.toByteArray()     // Catch:{ OutOfMemoryError -> 0x004d }
            goto L_0x0061
        L_0x0048:
            r8 = move-exception
            r0.close()     // Catch:{ OutOfMemoryError -> 0x004d }
            throw r8     // Catch:{ OutOfMemoryError -> 0x004d }
        L_0x004d:
            java.lang.System.gc()
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "File too large to fit into available memory"
            r8.<init>(r0)
            throw r8
        L_0x0058:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "HTTP entity too large to be buffered in memory"
            r8.<init>(r0)
            throw r8
        L_0x0060:
            r8 = 0
        L_0x0061:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.e.getResponseData(org.apache.http.HttpEntity):byte[]");
    }

    public boolean getUseSynchronousMode() {
        return this.useSynchronousMode.booleanValue();
    }

    /* access modifiers changed from: protected */
    public void handleMessage(Message message) {
        String str;
        int i = message.what;
        if (i == 0) {
            Object[] objArr = (Object[]) message.obj;
            if (objArr == null || objArr.length < 3) {
                str = "SUCCESS_MESSAGE didn't got enough params";
            } else {
                onSuccess(((Integer) objArr[0]).intValue(), (Header[]) objArr[1], (byte[]) objArr[2]);
                return;
            }
        } else if (i == 1) {
            Object[] objArr2 = (Object[]) message.obj;
            if (objArr2 == null || objArr2.length < 4) {
                str = "FAILURE_MESSAGE didn't got enough params";
            } else {
                onFailure(((Integer) objArr2[0]).intValue(), (Header[]) objArr2[1], (byte[]) objArr2[2], (Throwable) objArr2[3]);
                return;
            }
        } else if (i == 2) {
            onStart();
            return;
        } else if (i == 3) {
            onFinish();
            return;
        } else if (i == 4) {
            Object[] objArr3 = (Object[]) message.obj;
            if (objArr3 == null || objArr3.length < 2) {
                str = "PROGRESS_MESSAGE didn't got enough params";
            } else {
                try {
                    onProgress(((Integer) objArr3[0]).intValue(), ((Integer) objArr3[1]).intValue());
                    return;
                } catch (Throwable th) {
                    Log.e(LOG_TAG, "custom onProgress contains an error", th);
                    return;
                }
            }
        } else if (i == 5) {
            onRetry();
            return;
        } else {
            return;
        }
        Log.e(LOG_TAG, str);
    }

    /* access modifiers changed from: protected */
    public Message obtainMessage(int i, Object obj) {
        Handler handler2 = this.handler;
        if (handler2 != null) {
            return handler2.obtainMessage(i, obj);
        }
        Message obtain = Message.obtain();
        if (obtain != null) {
            obtain.what = i;
            obtain.obj = obj;
        }
        return obtain;
    }

    @Deprecated
    public void onFailure(int i, Throwable th, String str) {
        onFailure(th, str);
    }

    @Deprecated
    public void onFailure(int i, Header[] headerArr, Throwable th, String str) {
        onFailure(i, th, str);
    }

    public void onFailure(int i, Header[] headerArr, byte[] bArr, Throwable th) {
        String str;
        if (bArr == null) {
            str = null;
        } else {
            try {
                str = new String(bArr, getCharset());
            } catch (UnsupportedEncodingException e2) {
                Log.e(LOG_TAG, e2.toString());
                onFailure(i, headerArr, (Throwable) e2, (String) null);
                return;
            }
        }
        onFailure(i, headerArr, th, str);
    }

    @Deprecated
    public void onFailure(Throwable th) {
    }

    @Deprecated
    public void onFailure(Throwable th, String str) {
        onFailure(th);
    }

    public void onFinish() {
    }

    public void onProgress(int i, int i2) {
    }

    public void onRetry() {
    }

    public void onStart() {
    }

    @Deprecated
    public void onSuccess(int i, String str) {
        onSuccess(str);
    }

    @Deprecated
    public void onSuccess(int i, Header[] headerArr, String str) {
        onSuccess(i, str);
    }

    public void onSuccess(int i, Header[] headerArr, byte[] bArr) {
        String str;
        if (bArr == null) {
            str = null;
        } else {
            try {
                str = new String(bArr, getCharset());
            } catch (UnsupportedEncodingException e2) {
                Log.e(LOG_TAG, e2.toString());
                onFailure(i, headerArr, (Throwable) e2, (String) null);
                return;
            }
        }
        onSuccess(i, headerArr, str);
    }

    @Deprecated
    public void onSuccess(String str) {
    }

    /* access modifiers changed from: protected */
    public void postRunnable(Runnable runnable) {
        if (runnable != null) {
            this.handler.post(runnable);
        }
    }

    public final void sendFailureMessage(int i, Header[] headerArr, byte[] bArr, Throwable th) {
        sendMessage(obtainMessage(1, new Object[]{Integer.valueOf(i), headerArr, bArr, th}));
    }

    public final void sendFinishMessage() {
        sendMessage(obtainMessage(3, (Object) null));
    }

    /* access modifiers changed from: protected */
    public void sendMessage(Message message) {
        if (getUseSynchronousMode() || this.handler == null) {
            handleMessage(message);
        } else if (!Thread.currentThread().isInterrupted()) {
            this.handler.sendMessage(message);
        }
    }

    public final void sendProgressMessage(int i, int i2) {
        sendMessage(obtainMessage(4, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    public void sendResponseMessage(HttpResponse httpResponse) {
        if (!Thread.currentThread().isInterrupted()) {
            StatusLine statusLine = httpResponse.getStatusLine();
            byte[] responseData = getResponseData(httpResponse.getEntity());
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            if (statusLine.getStatusCode() >= 300) {
                sendFailureMessage(statusLine.getStatusCode(), httpResponse.getAllHeaders(), responseData, new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase()));
            } else {
                sendSuccessMessage(statusLine.getStatusCode(), httpResponse.getAllHeaders(), responseData);
            }
        }
    }

    public final void sendRetryMessage() {
        sendMessage(obtainMessage(5, (Object) null));
    }

    public final void sendStartMessage() {
        sendMessage(obtainMessage(2, (Object) null));
    }

    public final void sendSuccessMessage(int i, Header[] headerArr, byte[] bArr) {
        sendMessage(obtainMessage(0, new Object[]{Integer.valueOf(i), headerArr, bArr}));
    }

    public void setCharset(String str) {
        this.responseCharset = str;
    }

    public void setRequestHeaders(Header[] headerArr) {
        this.requestHeaders = headerArr;
    }

    public void setRequestURI(URI uri) {
        this.requestURI = uri;
    }

    public void setUseSynchronousMode(boolean z) {
        this.useSynchronousMode = Boolean.valueOf(z);
    }
}
