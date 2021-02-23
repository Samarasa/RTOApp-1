package org.jsoup.helper;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.CharEncoding;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

public final class DataUtil {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f15381a = Pattern.compile("(?i)\\bcharset=\\s*(?:\"|')?([^\\s,;\"']*)");

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f15382b = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    private DataUtil() {
    }

    static String a(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f15381a.matcher(str);
        if (matcher.find()) {
            return b(matcher.group(1).trim().replace("charset=", BuildConfig.FLAVOR));
        }
        return null;
    }

    private static String a(ByteBuffer byteBuffer, String str) {
        byteBuffer.mark();
        byte[] bArr = new byte[4];
        if (byteBuffer.remaining() >= bArr.length) {
            byteBuffer.get(bArr);
            byteBuffer.rewind();
        }
        if ((bArr[0] == 0 && bArr[1] == 0 && bArr[2] == -2 && bArr[3] == -1) || (bArr[0] == -1 && bArr[1] == -2 && bArr[2] == 0 && bArr[3] == 0)) {
            return "UTF-32";
        }
        if ((bArr[0] == -2 && bArr[1] == -1) || (bArr[0] == -1 && bArr[1] == -2)) {
            return CharEncoding.UTF_16;
        }
        if (bArr[0] != -17 || bArr[1] != -69 || bArr[2] != -65) {
            return str;
        }
        byteBuffer.position(3);
        return "UTF-8";
    }

    static ByteBuffer a() {
        return ByteBuffer.allocate(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.nio.ByteBuffer a(java.io.File r4) {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ all -> 0x001c }
            java.lang.String r2 = "r"
            r1.<init>(r4, r2)     // Catch:{ all -> 0x001c }
            long r2 = r1.length()     // Catch:{ all -> 0x001a }
            int r4 = (int) r2     // Catch:{ all -> 0x001a }
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x001a }
            r1.readFully(r4)     // Catch:{ all -> 0x001a }
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)     // Catch:{ all -> 0x001a }
            r1.close()
            return r4
        L_0x001a:
            r4 = move-exception
            goto L_0x001e
        L_0x001c:
            r4 = move-exception
            r1 = r0
        L_0x001e:
            if (r1 == 0) goto L_0x0023
            r1.close()
        L_0x0023:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.helper.DataUtil.a(java.io.File):java.nio.ByteBuffer");
    }

    static ByteBuffer a(InputStream inputStream) {
        return a(inputStream, 0);
    }

    static ByteBuffer a(InputStream inputStream, int i) {
        boolean z = true;
        Validate.isTrue(i >= 0, "maxSize must be 0 (unlimited) or larger");
        if (i <= 0) {
            z = false;
        }
        byte[] bArr = new byte[131072];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(131072);
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            if (z) {
                if (read > i) {
                    byteArrayOutputStream.write(bArr, 0, i);
                    break;
                }
                i -= read;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static org.jsoup.nodes.Document a(java.nio.ByteBuffer r8, java.lang.String r9, java.lang.String r10, org.jsoup.parser.Parser r11) {
        /*
            java.lang.String r9 = a((java.nio.ByteBuffer) r8, (java.lang.String) r9)
            r0 = 0
            if (r9 != 0) goto L_0x0092
            java.lang.String r1 = "UTF-8"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r1)
            java.nio.CharBuffer r2 = r2.decode(r8)
            java.lang.String r2 = r2.toString()
            org.jsoup.nodes.Document r3 = r11.parseInput(r2, r10)
            java.lang.String r4 = "meta[http-equiv=content-type], meta[charset]"
            org.jsoup.select.Elements r4 = r3.select(r4)
            org.jsoup.nodes.Element r4 = r4.first()
            if (r4 == 0) goto L_0x004a
            java.lang.String r5 = "http-equiv"
            boolean r5 = r4.hasAttr(r5)
            if (r5 == 0) goto L_0x0038
            java.lang.String r5 = "content"
            java.lang.String r5 = r4.attr(r5)
            java.lang.String r5 = a((java.lang.String) r5)
            goto L_0x0039
        L_0x0038:
            r5 = r0
        L_0x0039:
            if (r5 != 0) goto L_0x0048
            java.lang.String r6 = "charset"
            boolean r7 = r4.hasAttr(r6)
            if (r7 == 0) goto L_0x0048
            java.lang.String r4 = r4.attr(r6)
            goto L_0x004b
        L_0x0048:
            r4 = r5
            goto L_0x004b
        L_0x004a:
            r4 = r0
        L_0x004b:
            if (r4 != 0) goto L_0x0074
            int r5 = r3.childNodeSize()
            if (r5 <= 0) goto L_0x0074
            r5 = 0
            org.jsoup.nodes.Node r6 = r3.childNode(r5)
            boolean r6 = r6 instanceof org.jsoup.nodes.XmlDeclaration
            if (r6 == 0) goto L_0x0074
            org.jsoup.nodes.Node r5 = r3.childNode(r5)
            org.jsoup.nodes.XmlDeclaration r5 = (org.jsoup.nodes.XmlDeclaration) r5
            java.lang.String r6 = r5.name()
            java.lang.String r7 = "xml"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0074
            java.lang.String r4 = "encoding"
            java.lang.String r4 = r5.attr(r4)
        L_0x0074:
            java.lang.String r4 = b(r4)
            if (r4 == 0) goto L_0x0090
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0090
            java.lang.String r9 = r4.trim()
            java.lang.String r1 = "[\"']"
            java.lang.String r2 = ""
            java.lang.String r9 = r9.replaceAll(r1, r2)
            r8.rewind()
            goto L_0x0097
        L_0x0090:
            r0 = r3
            goto L_0x00a3
        L_0x0092:
            java.lang.String r1 = "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML"
            org.jsoup.helper.Validate.notEmpty(r9, r1)
        L_0x0097:
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r9)
            java.nio.CharBuffer r8 = r1.decode(r8)
            java.lang.String r2 = r8.toString()
        L_0x00a3:
            if (r0 != 0) goto L_0x00b0
            org.jsoup.nodes.Document r0 = r11.parseInput(r2, r10)
            org.jsoup.nodes.Document$OutputSettings r8 = r0.outputSettings()
            r8.charset((java.lang.String) r9)
        L_0x00b0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.helper.DataUtil.a(java.nio.ByteBuffer, java.lang.String, java.lang.String, org.jsoup.parser.Parser):org.jsoup.nodes.Document");
    }

    static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[131072];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    static String b() {
        StringBuilder sb = new StringBuilder(32);
        Random random = new Random();
        for (int i = 0; i < 32; i++) {
            char[] cArr = f15382b;
            sb.append(cArr[random.nextInt(cArr.length)]);
        }
        return sb.toString();
    }

    private static String b(String str) {
        if (!(str == null || str.length() == 0)) {
            String replaceAll = str.trim().replaceAll("[\"']", BuildConfig.FLAVOR);
            try {
                if (Charset.isSupported(replaceAll)) {
                    return replaceAll;
                }
                String upperCase = replaceAll.toUpperCase(Locale.ENGLISH);
                if (Charset.isSupported(upperCase)) {
                    return upperCase;
                }
            } catch (IllegalCharsetNameException unused) {
            }
        }
        return null;
    }

    public static Document load(File file, String str, String str2) {
        return a(a(file), str, str2, Parser.htmlParser());
    }

    public static Document load(InputStream inputStream, String str, String str2) {
        return a(a(inputStream), str, str2, Parser.htmlParser());
    }

    public static Document load(InputStream inputStream, String str, String str2, Parser parser) {
        return a(a(inputStream), str, str2, parser);
    }
}
