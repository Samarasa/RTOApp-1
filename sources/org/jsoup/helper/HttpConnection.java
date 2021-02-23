package org.jsoup.helper;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.TokenQueue;

public class HttpConnection implements Connection {
    public static final String CONTENT_ENCODING = "Content-Encoding";

    /* renamed from: a  reason: collision with root package name */
    private Connection.Request f15385a = new Request();

    /* renamed from: b  reason: collision with root package name */
    private Connection.Response f15386b = new Response();

    public static class KeyVal implements Connection.KeyVal {

        /* renamed from: a  reason: collision with root package name */
        private String f15387a;

        /* renamed from: b  reason: collision with root package name */
        private String f15388b;

        /* renamed from: c  reason: collision with root package name */
        private InputStream f15389c;

        private KeyVal() {
        }

        public static KeyVal create(String str, String str2) {
            return new KeyVal().key(str).value(str2);
        }

        public static KeyVal create(String str, String str2, InputStream inputStream) {
            return new KeyVal().key(str).value(str2).inputStream(inputStream);
        }

        public boolean hasInputStream() {
            return this.f15389c != null;
        }

        public InputStream inputStream() {
            return this.f15389c;
        }

        public KeyVal inputStream(InputStream inputStream) {
            Validate.notNull(this.f15388b, "Data input stream must not be null");
            this.f15389c = inputStream;
            return this;
        }

        public String key() {
            return this.f15387a;
        }

        public KeyVal key(String str) {
            Validate.notEmpty(str, "Data key must not be empty");
            this.f15387a = str;
            return this;
        }

        public String toString() {
            return this.f15387a + "=" + this.f15388b;
        }

        public String value() {
            return this.f15388b;
        }

        public KeyVal value(String str) {
            Validate.notNull(str, "Data value must not be null");
            this.f15388b = str;
            return this;
        }
    }

    public static class Request extends a<Connection.Request> implements Connection.Request {

        /* renamed from: e  reason: collision with root package name */
        private Proxy f15390e;

        /* renamed from: f  reason: collision with root package name */
        private int f15391f;

        /* renamed from: g  reason: collision with root package name */
        private int f15392g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f15393h;
        private Collection<Connection.KeyVal> i;
        private String j;
        private boolean k;
        private boolean l;
        private Parser m;
        /* access modifiers changed from: private */
        public boolean n;
        private boolean o;
        private String p;

        private Request() {
            super();
            this.j = null;
            this.k = false;
            this.l = false;
            this.n = false;
            this.o = true;
            this.p = "UTF-8";
            this.f15391f = 3000;
            this.f15392g = 1048576;
            this.f15393h = true;
            this.i = new ArrayList();
            this.f15399b = Connection.Method.GET;
            this.f15400c.put("Accept-Encoding", "gzip");
            this.m = Parser.htmlParser();
        }

        public /* bridge */ /* synthetic */ String cookie(String str) {
            return super.cookie(str);
        }

        public /* bridge */ /* synthetic */ Map cookies() {
            return super.cookies();
        }

        public Collection<Connection.KeyVal> data() {
            return this.i;
        }

        public Request data(Connection.KeyVal keyVal) {
            Validate.notNull(keyVal, "Key val must not be null");
            this.i.add(keyVal);
            return this;
        }

        public Connection.Request followRedirects(boolean z) {
            this.f15393h = z;
            return this;
        }

        public boolean followRedirects() {
            return this.f15393h;
        }

        public /* bridge */ /* synthetic */ boolean hasCookie(String str) {
            return super.hasCookie(str);
        }

        public /* bridge */ /* synthetic */ boolean hasHeader(String str) {
            return super.hasHeader(str);
        }

        public /* bridge */ /* synthetic */ boolean hasHeaderWithValue(String str, String str2) {
            return super.hasHeaderWithValue(str, str2);
        }

        public /* bridge */ /* synthetic */ String header(String str) {
            return super.header(str);
        }

        public /* bridge */ /* synthetic */ Map headers() {
            return super.headers();
        }

        public Connection.Request ignoreContentType(boolean z) {
            this.l = z;
            return this;
        }

        public boolean ignoreContentType() {
            return this.l;
        }

        public Connection.Request ignoreHttpErrors(boolean z) {
            this.k = z;
            return this;
        }

        public boolean ignoreHttpErrors() {
            return this.k;
        }

        public int maxBodySize() {
            return this.f15392g;
        }

        public Connection.Request maxBodySize(int i2) {
            Validate.isTrue(i2 >= 0, "maxSize must be 0 (unlimited) or larger");
            this.f15392g = i2;
            return this;
        }

        public /* bridge */ /* synthetic */ Connection.Method method() {
            return super.method();
        }

        public Request parser(Parser parser) {
            this.m = parser;
            this.n = true;
            return this;
        }

        public Parser parser() {
            return this.m;
        }

        public String postDataCharset() {
            return this.p;
        }

        public Connection.Request postDataCharset(String str) {
            Validate.notNull(str, "Charset must not be null");
            if (Charset.isSupported(str)) {
                this.p = str;
                return this;
            }
            throw new IllegalCharsetNameException(str);
        }

        public Proxy proxy() {
            return this.f15390e;
        }

        public Request proxy(String str, int i2) {
            this.f15390e = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(str, i2));
            return this;
        }

        public Request proxy(Proxy proxy) {
            this.f15390e = proxy;
            return this;
        }

        public String requestBody() {
            return this.j;
        }

        public Connection.Request requestBody(String str) {
            this.j = str;
            return this;
        }

        public int timeout() {
            return this.f15391f;
        }

        public Request timeout(int i2) {
            Validate.isTrue(i2 >= 0, "Timeout milliseconds must be 0 (infinite) or greater");
            this.f15391f = i2;
            return this;
        }

        public /* bridge */ /* synthetic */ URL url() {
            return super.url();
        }

        public void validateTLSCertificates(boolean z) {
            this.o = z;
        }

        public boolean validateTLSCertificates() {
            return this.o;
        }
    }

    public static class Response extends a<Connection.Response> implements Connection.Response {

        /* renamed from: e  reason: collision with root package name */
        private static SSLSocketFactory f15394e;

        /* renamed from: f  reason: collision with root package name */
        private static final Pattern f15395f = Pattern.compile("(application|text)/\\w*\\+?xml.*");

        /* renamed from: g  reason: collision with root package name */
        private int f15396g;

        /* renamed from: h  reason: collision with root package name */
        private String f15397h;
        private ByteBuffer i;
        private String j;
        private String k;
        private boolean l = false;
        private int m = 0;
        private Connection.Request n;

        Response() {
            super();
        }

        private Response(Response response) {
            super();
            if (response != null) {
                this.m = response.m + 1;
                if (this.m >= 20) {
                    throw new IOException(String.format("Too many redirects occurred trying to load URL %s", new Object[]{response.url()}));
                }
            }
        }

        private static LinkedHashMap<String, List<String>> a(HttpURLConnection httpURLConnection) {
            LinkedHashMap<String, List<String>> linkedHashMap = new LinkedHashMap<>();
            int i2 = 0;
            while (true) {
                String headerFieldKey = httpURLConnection.getHeaderFieldKey(i2);
                String headerField = httpURLConnection.getHeaderField(i2);
                if (headerFieldKey == null && headerField == null) {
                    return linkedHashMap;
                }
                i2++;
                if (!(headerFieldKey == null || headerField == null)) {
                    if (linkedHashMap.containsKey(headerFieldKey)) {
                        linkedHashMap.get(headerFieldKey).add(headerField);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(headerField);
                        linkedHashMap.put(headerFieldKey, arrayList);
                    }
                }
            }
        }

        private static HostnameVerifier a() {
            return new c();
        }

        static Response a(Connection.Request request) {
            return a(request, (Response) null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.io.InputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.util.zip.GZIPInputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x007c A[Catch:{ all -> 0x01ac, all -> 0x01cf }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x009d A[Catch:{ all -> 0x01ac, all -> 0x01cf }] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0105  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static org.jsoup.helper.HttpConnection.Response a(org.jsoup.Connection.Request r6, org.jsoup.helper.HttpConnection.Response r7) {
            /*
                java.lang.String r0 = "Location"
                java.lang.String r1 = "Request must not be null"
                org.jsoup.helper.Validate.notNull(r6, r1)
                java.net.URL r1 = r6.url()
                java.lang.String r1 = r1.getProtocol()
                java.lang.String r2 = "http"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x0028
                java.lang.String r2 = "https"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0020
                goto L_0x0028
            L_0x0020:
                java.net.MalformedURLException r6 = new java.net.MalformedURLException
                java.lang.String r7 = "Only http & https protocols supported"
                r6.<init>(r7)
                throw r6
            L_0x0028:
                org.jsoup.Connection$Method r1 = r6.method()
                boolean r1 = r1.hasBody()
                java.lang.String r2 = r6.requestBody()
                r3 = 1
                if (r2 == 0) goto L_0x0039
                r2 = 1
                goto L_0x003a
            L_0x0039:
                r2 = 0
            L_0x003a:
                if (r1 != 0) goto L_0x0054
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Cannot set a request body for HTTP method "
                r4.append(r5)
                org.jsoup.Connection$Method r5 = r6.method()
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                org.jsoup.helper.Validate.isFalse(r2, r4)
            L_0x0054:
                java.util.Collection r4 = r6.data()
                int r4 = r4.size()
                r5 = 0
                if (r4 <= 0) goto L_0x0067
                if (r1 == 0) goto L_0x0063
                if (r2 == 0) goto L_0x0067
            L_0x0063:
                d(r6)
                goto L_0x006e
            L_0x0067:
                if (r1 == 0) goto L_0x006e
                java.lang.String r1 = e(r6)
                goto L_0x006f
            L_0x006e:
                r1 = r5
            L_0x006f:
                java.net.HttpURLConnection r2 = b(r6)
                r2.connect()     // Catch:{ all -> 0x01cf }
                boolean r4 = r2.getDoOutput()     // Catch:{ all -> 0x01cf }
                if (r4 == 0) goto L_0x0083
                java.io.OutputStream r4 = r2.getOutputStream()     // Catch:{ all -> 0x01cf }
                a(r6, r4, r1)     // Catch:{ all -> 0x01cf }
            L_0x0083:
                int r1 = r2.getResponseCode()     // Catch:{ all -> 0x01cf }
                org.jsoup.helper.HttpConnection$Response r4 = new org.jsoup.helper.HttpConnection$Response     // Catch:{ all -> 0x01cf }
                r4.<init>(r7)     // Catch:{ all -> 0x01cf }
                r4.a((java.net.HttpURLConnection) r2, (org.jsoup.Connection.Response) r7)     // Catch:{ all -> 0x01cf }
                r4.n = r6     // Catch:{ all -> 0x01cf }
                boolean r7 = r4.hasHeader(r0)     // Catch:{ all -> 0x01cf }
                if (r7 == 0) goto L_0x0105
                boolean r7 = r6.followRedirects()     // Catch:{ all -> 0x01cf }
                if (r7 == 0) goto L_0x0105
                r7 = 307(0x133, float:4.3E-43)
                if (r1 == r7) goto L_0x00ad
                org.jsoup.Connection$Method r7 = org.jsoup.Connection.Method.GET     // Catch:{ all -> 0x01cf }
                r6.method(r7)     // Catch:{ all -> 0x01cf }
                java.util.Collection r7 = r6.data()     // Catch:{ all -> 0x01cf }
                r7.clear()     // Catch:{ all -> 0x01cf }
            L_0x00ad:
                java.lang.String r7 = r4.header(r0)     // Catch:{ all -> 0x01cf }
                if (r7 == 0) goto L_0x00c8
                java.lang.String r0 = "http:/"
                boolean r0 = r7.startsWith(r0)     // Catch:{ all -> 0x01cf }
                if (r0 == 0) goto L_0x00c8
                r0 = 6
                char r1 = r7.charAt(r0)     // Catch:{ all -> 0x01cf }
                r3 = 47
                if (r1 == r3) goto L_0x00c8
                java.lang.String r7 = r7.substring(r0)     // Catch:{ all -> 0x01cf }
            L_0x00c8:
                java.net.URL r0 = r6.url()     // Catch:{ all -> 0x01cf }
                java.lang.String r7 = org.jsoup.helper.HttpConnection.d(r7)     // Catch:{ all -> 0x01cf }
                java.net.URL r7 = org.jsoup.helper.StringUtil.resolve((java.net.URL) r0, (java.lang.String) r7)     // Catch:{ all -> 0x01cf }
                r6.url(r7)     // Catch:{ all -> 0x01cf }
                java.util.Map<java.lang.String, java.lang.String> r7 = r4.f15401d     // Catch:{ all -> 0x01cf }
                java.util.Set r7 = r7.entrySet()     // Catch:{ all -> 0x01cf }
                java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x01cf }
            L_0x00e1:
                boolean r0 = r7.hasNext()     // Catch:{ all -> 0x01cf }
                if (r0 == 0) goto L_0x00fd
                java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x01cf }
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x01cf }
                java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x01cf }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x01cf }
                java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01cf }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01cf }
                r6.cookie(r1, r0)     // Catch:{ all -> 0x01cf }
                goto L_0x00e1
            L_0x00fd:
                org.jsoup.helper.HttpConnection$Response r6 = a((org.jsoup.Connection.Request) r6, (org.jsoup.helper.HttpConnection.Response) r4)     // Catch:{ all -> 0x01cf }
                r2.disconnect()
                return r6
            L_0x0105:
                r7 = 200(0xc8, float:2.8E-43)
                if (r1 < r7) goto L_0x010d
                r7 = 400(0x190, float:5.6E-43)
                if (r1 < r7) goto L_0x0113
            L_0x010d:
                boolean r7 = r6.ignoreHttpErrors()     // Catch:{ all -> 0x01cf }
                if (r7 == 0) goto L_0x01bf
            L_0x0113:
                java.lang.String r7 = r4.contentType()     // Catch:{ all -> 0x01cf }
                if (r7 == 0) goto L_0x0144
                boolean r0 = r6.ignoreContentType()     // Catch:{ all -> 0x01cf }
                if (r0 != 0) goto L_0x0144
                java.lang.String r0 = "text/"
                boolean r0 = r7.startsWith(r0)     // Catch:{ all -> 0x01cf }
                if (r0 != 0) goto L_0x0144
                java.util.regex.Pattern r0 = f15395f     // Catch:{ all -> 0x01cf }
                java.util.regex.Matcher r0 = r0.matcher(r7)     // Catch:{ all -> 0x01cf }
                boolean r0 = r0.matches()     // Catch:{ all -> 0x01cf }
                if (r0 == 0) goto L_0x0134
                goto L_0x0144
            L_0x0134:
                org.jsoup.UnsupportedMimeTypeException r0 = new org.jsoup.UnsupportedMimeTypeException     // Catch:{ all -> 0x01cf }
                java.lang.String r1 = "Unhandled content type. Must be text/*, application/xml, or application/xhtml+xml"
                java.net.URL r6 = r6.url()     // Catch:{ all -> 0x01cf }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x01cf }
                r0.<init>(r1, r7, r6)     // Catch:{ all -> 0x01cf }
                throw r0     // Catch:{ all -> 0x01cf }
            L_0x0144:
                if (r7 == 0) goto L_0x0166
                java.util.regex.Pattern r0 = f15395f     // Catch:{ all -> 0x01cf }
                java.util.regex.Matcher r7 = r0.matcher(r7)     // Catch:{ all -> 0x01cf }
                boolean r7 = r7.matches()     // Catch:{ all -> 0x01cf }
                if (r7 == 0) goto L_0x0166
                boolean r7 = r6 instanceof org.jsoup.helper.HttpConnection.Request     // Catch:{ all -> 0x01cf }
                if (r7 == 0) goto L_0x0166
                r7 = r6
                org.jsoup.helper.HttpConnection$Request r7 = (org.jsoup.helper.HttpConnection.Request) r7     // Catch:{ all -> 0x01cf }
                boolean r7 = r7.n     // Catch:{ all -> 0x01cf }
                if (r7 != 0) goto L_0x0166
                org.jsoup.parser.Parser r7 = org.jsoup.parser.Parser.xmlParser()     // Catch:{ all -> 0x01cf }
                r6.parser(r7)     // Catch:{ all -> 0x01cf }
            L_0x0166:
                java.lang.String r7 = r4.k     // Catch:{ all -> 0x01cf }
                java.lang.String r7 = org.jsoup.helper.DataUtil.a((java.lang.String) r7)     // Catch:{ all -> 0x01cf }
                r4.j = r7     // Catch:{ all -> 0x01cf }
                int r7 = r2.getContentLength()     // Catch:{ all -> 0x01cf }
                if (r7 == 0) goto L_0x01b3
                org.jsoup.Connection$Method r7 = r6.method()     // Catch:{ all -> 0x01cf }
                org.jsoup.Connection$Method r0 = org.jsoup.Connection.Method.HEAD     // Catch:{ all -> 0x01cf }
                if (r7 == r0) goto L_0x01b3
                java.io.InputStream r7 = r2.getErrorStream()     // Catch:{ all -> 0x01ac }
                if (r7 == 0) goto L_0x0187
                java.io.InputStream r7 = r2.getErrorStream()     // Catch:{ all -> 0x01ac }
                goto L_0x018b
            L_0x0187:
                java.io.InputStream r7 = r2.getInputStream()     // Catch:{ all -> 0x01ac }
            L_0x018b:
                r5 = r7
                java.lang.String r7 = "Content-Encoding"
                java.lang.String r0 = "gzip"
                boolean r7 = r4.hasHeaderWithValue(r7, r0)     // Catch:{ all -> 0x01ac }
                if (r7 == 0) goto L_0x019c
                java.util.zip.GZIPInputStream r7 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x01ac }
                r7.<init>(r5)     // Catch:{ all -> 0x01ac }
                r5 = r7
            L_0x019c:
                int r6 = r6.maxBodySize()     // Catch:{ all -> 0x01ac }
                java.nio.ByteBuffer r6 = org.jsoup.helper.DataUtil.a((java.io.InputStream) r5, (int) r6)     // Catch:{ all -> 0x01ac }
                r4.i = r6     // Catch:{ all -> 0x01ac }
                if (r5 == 0) goto L_0x01b9
                r5.close()     // Catch:{ all -> 0x01cf }
                goto L_0x01b9
            L_0x01ac:
                r6 = move-exception
                if (r5 == 0) goto L_0x01b2
                r5.close()     // Catch:{ all -> 0x01cf }
            L_0x01b2:
                throw r6     // Catch:{ all -> 0x01cf }
            L_0x01b3:
                java.nio.ByteBuffer r6 = org.jsoup.helper.DataUtil.a()     // Catch:{ all -> 0x01cf }
                r4.i = r6     // Catch:{ all -> 0x01cf }
            L_0x01b9:
                r2.disconnect()
                r4.l = r3
                return r4
            L_0x01bf:
                org.jsoup.HttpStatusException r7 = new org.jsoup.HttpStatusException     // Catch:{ all -> 0x01cf }
                java.lang.String r0 = "HTTP error fetching URL"
                java.net.URL r6 = r6.url()     // Catch:{ all -> 0x01cf }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x01cf }
                r7.<init>(r0, r1, r6)     // Catch:{ all -> 0x01cf }
                throw r7     // Catch:{ all -> 0x01cf }
            L_0x01cf:
                r6 = move-exception
                r2.disconnect()
                goto L_0x01d5
            L_0x01d4:
                throw r6
            L_0x01d5:
                goto L_0x01d4
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.helper.HttpConnection.Response.a(org.jsoup.Connection$Request, org.jsoup.helper.HttpConnection$Response):org.jsoup.helper.HttpConnection$Response");
        }

        private void a(HttpURLConnection httpURLConnection, Connection.Response response) {
            this.f15399b = Connection.Method.valueOf(httpURLConnection.getRequestMethod());
            this.f15398a = httpURLConnection.getURL();
            this.f15396g = httpURLConnection.getResponseCode();
            this.f15397h = httpURLConnection.getResponseMessage();
            this.k = httpURLConnection.getContentType();
            a((Map<String, List<String>>) a(httpURLConnection));
            if (response != null) {
                for (Map.Entry next : response.cookies().entrySet()) {
                    if (!hasCookie((String) next.getKey())) {
                        cookie((String) next.getKey(), (String) next.getValue());
                    }
                }
            }
        }

        private static void a(Connection.Request request, OutputStream outputStream, String str) {
            Collection<Connection.KeyVal> data = request.data();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, request.postDataCharset()));
            if (str != null) {
                for (Connection.KeyVal next : data) {
                    bufferedWriter.write("--");
                    bufferedWriter.write(str);
                    bufferedWriter.write("\r\n");
                    bufferedWriter.write("Content-Disposition: form-data; name=\"");
                    bufferedWriter.write(HttpConnection.c(next.key()));
                    bufferedWriter.write("\"");
                    if (next.hasInputStream()) {
                        bufferedWriter.write("; filename=\"");
                        bufferedWriter.write(HttpConnection.c(next.value()));
                        bufferedWriter.write("\"\r\nContent-Type: application/octet-stream\r\n\r\n");
                        bufferedWriter.flush();
                        DataUtil.a(next.inputStream(), outputStream);
                        outputStream.flush();
                    } else {
                        bufferedWriter.write("\r\n\r\n");
                        bufferedWriter.write(next.value());
                    }
                    bufferedWriter.write("\r\n");
                }
                bufferedWriter.write("--");
                bufferedWriter.write(str);
                bufferedWriter.write("--");
            } else if (request.requestBody() != null) {
                bufferedWriter.write(request.requestBody());
            } else {
                boolean z = true;
                for (Connection.KeyVal next2 : data) {
                    if (!z) {
                        bufferedWriter.append('&');
                    } else {
                        z = false;
                    }
                    bufferedWriter.write(URLEncoder.encode(next2.key(), request.postDataCharset()));
                    bufferedWriter.write(61);
                    bufferedWriter.write(URLEncoder.encode(next2.value(), request.postDataCharset()));
                }
            }
            bufferedWriter.close();
        }

        private static HttpURLConnection b(Connection.Request request) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) (request.proxy() == null ? request.url().openConnection() : request.url().openConnection(request.proxy()));
            httpURLConnection.setRequestMethod(request.method().name());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setConnectTimeout(request.timeout());
            httpURLConnection.setReadTimeout(request.timeout());
            if ((httpURLConnection instanceof HttpsURLConnection) && !request.validateTLSCertificates()) {
                b();
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
                httpsURLConnection.setSSLSocketFactory(f15394e);
                httpsURLConnection.setHostnameVerifier(a());
            }
            if (request.method().hasBody()) {
                httpURLConnection.setDoOutput(true);
            }
            if (request.cookies().size() > 0) {
                httpURLConnection.addRequestProperty("Cookie", c(request));
            }
            for (Map.Entry next : request.headers().entrySet()) {
                httpURLConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            return httpURLConnection;
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0028 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static synchronized void b() {
            /*
                java.lang.Class<org.jsoup.helper.HttpConnection$Response> r0 = org.jsoup.helper.HttpConnection.Response.class
                monitor-enter(r0)
                javax.net.ssl.SSLSocketFactory r1 = f15394e     // Catch:{ all -> 0x003a }
                if (r1 != 0) goto L_0x0038
                r1 = 1
                javax.net.ssl.TrustManager[] r1 = new javax.net.ssl.TrustManager[r1]     // Catch:{ all -> 0x003a }
                r2 = 0
                org.jsoup.helper.d r3 = new org.jsoup.helper.d     // Catch:{ all -> 0x003a }
                r3.<init>()     // Catch:{ all -> 0x003a }
                r1[r2] = r3     // Catch:{ all -> 0x003a }
                java.lang.String r2 = "SSL"
                javax.net.ssl.SSLContext r2 = javax.net.ssl.SSLContext.getInstance(r2)     // Catch:{ NoSuchAlgorithmException -> 0x0030, KeyManagementException -> 0x0028 }
                r3 = 0
                java.security.SecureRandom r4 = new java.security.SecureRandom     // Catch:{ NoSuchAlgorithmException -> 0x0030, KeyManagementException -> 0x0028 }
                r4.<init>()     // Catch:{ NoSuchAlgorithmException -> 0x0030, KeyManagementException -> 0x0028 }
                r2.init(r3, r1, r4)     // Catch:{ NoSuchAlgorithmException -> 0x0030, KeyManagementException -> 0x0028 }
                javax.net.ssl.SSLSocketFactory r1 = r2.getSocketFactory()     // Catch:{ NoSuchAlgorithmException -> 0x0030, KeyManagementException -> 0x0028 }
                f15394e = r1     // Catch:{ NoSuchAlgorithmException -> 0x0030, KeyManagementException -> 0x0028 }
                goto L_0x0038
            L_0x0028:
                java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x003a }
                java.lang.String r2 = "Can't create unsecure trust manager"
                r1.<init>(r2)     // Catch:{ all -> 0x003a }
                throw r1     // Catch:{ all -> 0x003a }
            L_0x0030:
                java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x003a }
                java.lang.String r2 = "Can't create unsecure trust manager"
                r1.<init>(r2)     // Catch:{ all -> 0x003a }
                throw r1     // Catch:{ all -> 0x003a }
            L_0x0038:
                monitor-exit(r0)
                return
            L_0x003a:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.helper.HttpConnection.Response.b():void");
        }

        private static String c(Connection.Request request) {
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (Map.Entry next : request.cookies().entrySet()) {
                if (!z) {
                    sb.append("; ");
                } else {
                    z = false;
                }
                sb.append((String) next.getKey());
                sb.append('=');
                sb.append((String) next.getValue());
            }
            return sb.toString();
        }

        private static void d(Connection.Request request) {
            boolean z;
            URL url = request.url();
            StringBuilder sb = new StringBuilder();
            sb.append(url.getProtocol());
            sb.append("://");
            sb.append(url.getAuthority());
            sb.append(url.getPath());
            sb.append("?");
            if (url.getQuery() != null) {
                sb.append(url.getQuery());
                z = false;
            } else {
                z = true;
            }
            for (Connection.KeyVal next : request.data()) {
                Validate.isFalse(next.hasInputStream(), "InputStream data not supported in URL query string.");
                if (!z) {
                    sb.append('&');
                } else {
                    z = false;
                }
                sb.append(URLEncoder.encode(next.key(), "UTF-8"));
                sb.append('=');
                sb.append(URLEncoder.encode(next.value(), "UTF-8"));
            }
            request.url(new URL(sb.toString()));
            request.data().clear();
        }

        private static String e(Connection.Request request) {
            if (!request.hasHeader("Content-Type")) {
                if (HttpConnection.b(request)) {
                    String b2 = DataUtil.b();
                    request.header("Content-Type", "multipart/form-data; boundary=" + b2);
                    return b2;
                }
                request.header("Content-Type", "application/x-www-form-urlencoded; charset=" + request.postDataCharset());
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void a(Map<String, List<String>> map) {
            String sb;
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                if (str != null) {
                    List<String> list = (List) next.getValue();
                    if (str.equalsIgnoreCase("Set-Cookie")) {
                        for (String str2 : list) {
                            if (str2 != null) {
                                TokenQueue tokenQueue = new TokenQueue(str2);
                                String trim = tokenQueue.chompTo("=").trim();
                                String trim2 = tokenQueue.consumeTo(";").trim();
                                if (trim.length() > 0) {
                                    cookie(trim, trim2);
                                }
                            }
                        }
                    } else {
                        if (list.size() == 1) {
                            sb = (String) list.get(0);
                        } else if (list.size() > 1) {
                            StringBuilder sb2 = new StringBuilder();
                            for (int i2 = 0; i2 < list.size(); i2++) {
                                String str3 = (String) list.get(i2);
                                if (i2 != 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(str3);
                            }
                            sb = sb2.toString();
                        }
                        header(str, sb);
                    }
                }
            }
        }

        public String body() {
            Validate.isTrue(this.l, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            String str = this.j;
            if (str == null) {
                str = "UTF-8";
            }
            String charBuffer = Charset.forName(str).decode(this.i).toString();
            this.i.rewind();
            return charBuffer;
        }

        public byte[] bodyAsBytes() {
            Validate.isTrue(this.l, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            return this.i.array();
        }

        public String charset() {
            return this.j;
        }

        public Response charset(String str) {
            this.j = str;
            return this;
        }

        public String contentType() {
            return this.k;
        }

        public /* bridge */ /* synthetic */ String cookie(String str) {
            return super.cookie(str);
        }

        public /* bridge */ /* synthetic */ Map cookies() {
            return super.cookies();
        }

        public /* bridge */ /* synthetic */ boolean hasCookie(String str) {
            return super.hasCookie(str);
        }

        public /* bridge */ /* synthetic */ boolean hasHeader(String str) {
            return super.hasHeader(str);
        }

        public /* bridge */ /* synthetic */ boolean hasHeaderWithValue(String str, String str2) {
            return super.hasHeaderWithValue(str, str2);
        }

        public /* bridge */ /* synthetic */ String header(String str) {
            return super.header(str);
        }

        public /* bridge */ /* synthetic */ Map headers() {
            return super.headers();
        }

        public /* bridge */ /* synthetic */ Connection.Method method() {
            return super.method();
        }

        public Document parse() {
            Validate.isTrue(this.l, "Request must be executed (with .execute(), .get(), or .post() before parsing response");
            Document a2 = DataUtil.a(this.i, this.j, this.f15398a.toExternalForm(), this.n.parser());
            this.i.rewind();
            this.j = a2.outputSettings().charset().name();
            return a2;
        }

        public int statusCode() {
            return this.f15396g;
        }

        public String statusMessage() {
            return this.f15397h;
        }

        public /* bridge */ /* synthetic */ URL url() {
            return super.url();
        }
    }

    private static abstract class a<T extends Connection.Base> implements Connection.Base<T> {

        /* renamed from: a  reason: collision with root package name */
        URL f15398a;

        /* renamed from: b  reason: collision with root package name */
        Connection.Method f15399b;

        /* renamed from: c  reason: collision with root package name */
        Map<String, String> f15400c;

        /* renamed from: d  reason: collision with root package name */
        Map<String, String> f15401d;

        private a() {
            this.f15400c = new LinkedHashMap();
            this.f15401d = new LinkedHashMap();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
            r3 = b(r3);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.String a(java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Header name must not be null"
                org.jsoup.helper.Validate.notNull(r3, r0)
                java.util.Map<java.lang.String, java.lang.String> r0 = r2.f15400c
                java.lang.Object r0 = r0.get(r3)
                java.lang.String r0 = (java.lang.String) r0
                if (r0 != 0) goto L_0x001b
                java.util.Map<java.lang.String, java.lang.String> r0 = r2.f15400c
                java.lang.String r1 = r3.toLowerCase()
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r0 = (java.lang.String) r0
            L_0x001b:
                if (r0 != 0) goto L_0x002a
                java.util.Map$Entry r3 = r2.b(r3)
                if (r3 == 0) goto L_0x002a
                java.lang.Object r3 = r3.getValue()
                r0 = r3
                java.lang.String r0 = (java.lang.String) r0
            L_0x002a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.helper.HttpConnection.a.a(java.lang.String):java.lang.String");
        }

        private Map.Entry<String, String> b(String str) {
            String lowerCase = str.toLowerCase();
            for (Map.Entry<String, String> next : this.f15400c.entrySet()) {
                if (next.getKey().toLowerCase().equals(lowerCase)) {
                    return next;
                }
            }
            return null;
        }

        public String cookie(String str) {
            Validate.notEmpty(str, "Cookie name must not be empty");
            return this.f15401d.get(str);
        }

        public T cookie(String str, String str2) {
            Validate.notEmpty(str, "Cookie name must not be empty");
            Validate.notNull(str2, "Cookie value must not be null");
            this.f15401d.put(str, str2);
            return this;
        }

        public Map<String, String> cookies() {
            return this.f15401d;
        }

        public boolean hasCookie(String str) {
            Validate.notEmpty(str, "Cookie name must not be empty");
            return this.f15401d.containsKey(str);
        }

        public boolean hasHeader(String str) {
            Validate.notEmpty(str, "Header name must not be empty");
            return a(str) != null;
        }

        public boolean hasHeaderWithValue(String str, String str2) {
            return hasHeader(str) && header(str).equalsIgnoreCase(str2);
        }

        public String header(String str) {
            Validate.notNull(str, "Header name must not be null");
            return a(str);
        }

        public T header(String str, String str2) {
            Validate.notEmpty(str, "Header name must not be empty");
            Validate.notNull(str2, "Header value must not be null");
            removeHeader(str);
            this.f15400c.put(str, str2);
            return this;
        }

        public Map<String, String> headers() {
            return this.f15400c;
        }

        public T method(Connection.Method method) {
            Validate.notNull(method, "Method must not be null");
            this.f15399b = method;
            return this;
        }

        public Connection.Method method() {
            return this.f15399b;
        }

        public T removeCookie(String str) {
            Validate.notEmpty(str, "Cookie name must not be empty");
            this.f15401d.remove(str);
            return this;
        }

        public T removeHeader(String str) {
            Validate.notEmpty(str, "Header name must not be empty");
            Map.Entry<String, String> b2 = b(str);
            if (b2 != null) {
                this.f15400c.remove(b2.getKey());
            }
            return this;
        }

        public URL url() {
            return this.f15398a;
        }

        public T url(URL url) {
            Validate.notNull(url, "URL must not be null");
            this.f15398a = url;
            return this;
        }
    }

    private HttpConnection() {
    }

    /* access modifiers changed from: private */
    public static boolean b(Connection.Request request) {
        for (Connection.KeyVal hasInputStream : request.data()) {
            if (hasInputStream.hasInputStream()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static String c(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\"", "%22");
    }

    public static Connection connect(String str) {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url(str);
        return httpConnection;
    }

    public static Connection connect(URL url) {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url(url);
        return httpConnection;
    }

    /* access modifiers changed from: private */
    public static String d(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll(" ", "%20");
    }

    public Connection cookie(String str, String str2) {
        this.f15385a.cookie(str, str2);
        return this;
    }

    public Connection cookies(Map<String, String> map) {
        Validate.notNull(map, "Cookie map must not be null");
        for (Map.Entry next : map.entrySet()) {
            this.f15385a.cookie((String) next.getKey(), (String) next.getValue());
        }
        return this;
    }

    public Connection.KeyVal data(String str) {
        Validate.notEmpty(str, "Data key must not be empty");
        for (Connection.KeyVal next : request().data()) {
            if (next.key().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public Connection data(String str, String str2) {
        this.f15385a.data(KeyVal.create(str, str2));
        return this;
    }

    public Connection data(String str, String str2, InputStream inputStream) {
        this.f15385a.data(KeyVal.create(str, str2, inputStream));
        return this;
    }

    public Connection data(Collection<Connection.KeyVal> collection) {
        Validate.notNull(collection, "Data collection must not be null");
        for (Connection.KeyVal data : collection) {
            this.f15385a.data(data);
        }
        return this;
    }

    public Connection data(Map<String, String> map) {
        Validate.notNull(map, "Data map must not be null");
        for (Map.Entry next : map.entrySet()) {
            this.f15385a.data(KeyVal.create((String) next.getKey(), (String) next.getValue()));
        }
        return this;
    }

    public Connection data(String... strArr) {
        Validate.notNull(strArr, "Data key value pairs must not be null");
        Validate.isTrue(strArr.length % 2 == 0, "Must supply an even number of key value pairs");
        for (int i = 0; i < strArr.length; i += 2) {
            String str = strArr[i];
            String str2 = strArr[i + 1];
            Validate.notEmpty(str, "Data key must not be empty");
            Validate.notNull(str2, "Data value must not be null");
            this.f15385a.data(KeyVal.create(str, str2));
        }
        return this;
    }

    public Connection.Response execute() {
        this.f15386b = Response.a(this.f15385a);
        return this.f15386b;
    }

    public Connection followRedirects(boolean z) {
        this.f15385a.followRedirects(z);
        return this;
    }

    public Document get() {
        this.f15385a.method(Connection.Method.GET);
        execute();
        return this.f15386b.parse();
    }

    public Connection header(String str, String str2) {
        this.f15385a.header(str, str2);
        return this;
    }

    public Connection headers(Map<String, String> map) {
        Validate.notNull(map, "Header map must not be null");
        for (Map.Entry next : map.entrySet()) {
            this.f15385a.header((String) next.getKey(), (String) next.getValue());
        }
        return this;
    }

    public Connection ignoreContentType(boolean z) {
        this.f15385a.ignoreContentType(z);
        return this;
    }

    public Connection ignoreHttpErrors(boolean z) {
        this.f15385a.ignoreHttpErrors(z);
        return this;
    }

    public Connection maxBodySize(int i) {
        this.f15385a.maxBodySize(i);
        return this;
    }

    public Connection method(Connection.Method method) {
        this.f15385a.method(method);
        return this;
    }

    public Connection parser(Parser parser) {
        this.f15385a.parser(parser);
        return this;
    }

    public Document post() {
        this.f15385a.method(Connection.Method.POST);
        execute();
        return this.f15386b.parse();
    }

    public Connection postDataCharset(String str) {
        this.f15385a.postDataCharset(str);
        return this;
    }

    public Connection proxy(String str, int i) {
        this.f15385a.proxy(str, i);
        return this;
    }

    public Connection proxy(Proxy proxy) {
        this.f15385a.proxy(proxy);
        return this;
    }

    public Connection referrer(String str) {
        Validate.notNull(str, "Referrer must not be null");
        this.f15385a.header("Referer", str);
        return this;
    }

    public Connection.Request request() {
        return this.f15385a;
    }

    public Connection request(Connection.Request request) {
        this.f15385a = request;
        return this;
    }

    public Connection requestBody(String str) {
        this.f15385a.requestBody(str);
        return this;
    }

    public Connection.Response response() {
        return this.f15386b;
    }

    public Connection response(Connection.Response response) {
        this.f15386b = response;
        return this;
    }

    public Connection timeout(int i) {
        this.f15385a.timeout(i);
        return this;
    }

    public Connection url(String str) {
        Validate.notEmpty(str, "Must supply a valid URL");
        try {
            this.f15385a.url(new URL(d(str)));
            return this;
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException("Malformed URL: " + str, e2);
        }
    }

    public Connection url(URL url) {
        this.f15385a.url(url);
        return this;
    }

    public Connection userAgent(String str) {
        Validate.notNull(str, "User agent must not be null");
        this.f15385a.header("User-Agent", str);
        return this;
    }

    public Connection validateTLSCertificates(boolean z) {
        this.f15385a.validateTLSCertificates(z);
        return this;
    }
}
