package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BaseNCodec;
import java.math.BigInteger;

public class Base64 extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 6;
    private static final int BYTES_PER_ENCODED_BLOCK = 4;
    private static final int BYTES_PER_UNENCODED_BLOCK = 3;
    static final byte[] CHUNK_SEPARATOR = {13, 10};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    private static final int MASK_6BITS = 63;
    private static final byte[] STANDARD_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_SAFE_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private final int decodeSize;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;

    public Base64() {
        this(0);
    }

    public Base64(int i) {
        this(i, CHUNK_SEPARATOR);
    }

    public Base64(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Base64(int r5, byte[] r6, boolean r7) {
        /*
            r4 = this;
            r0 = 3
            r1 = 4
            r2 = -100000(0xfffffffffffe7960, float:NaN)
            r4.<init>(r0, r1, r5, r2)
            r2 = 0
            if (r6 != 0) goto L_0x000d
            r3 = 0
            goto L_0x000e
        L_0x000d:
            int r3 = r6.length
        L_0x000e:
            r4.init(r0, r1, r5, r3)
            byte[] r0 = DECODE_TABLE
            r4.decodeTable = r0
            r0 = 0
            if (r6 != 0) goto L_0x001d
        L_0x0018:
            r4.encodeSize = r1
            r4.lineSeparator = r0
            goto L_0x0034
        L_0x001d:
            boolean r3 = r4.containsAlphabetOrPad(r6)
            if (r3 != 0) goto L_0x0044
            if (r5 <= 0) goto L_0x0018
            int r5 = r6.length
            int r5 = r5 + r1
            r4.encodeSize = r5
            int r5 = r6.length
            byte[] r5 = new byte[r5]
            r4.lineSeparator = r5
            byte[] r5 = r4.lineSeparator
            int r0 = r6.length
            java.lang.System.arraycopy(r6, r2, r5, r2, r0)
        L_0x0034:
            int r5 = r4.encodeSize
            int r5 = r5 + -1
            r4.decodeSize = r5
            if (r7 == 0) goto L_0x003f
            byte[] r5 = URL_SAFE_ENCODE_TABLE
            goto L_0x0041
        L_0x003f:
            byte[] r5 = STANDARD_ENCODE_TABLE
        L_0x0041:
            r4.encodeTable = r5
            return
        L_0x0044:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "lineSeparator must not contain base64 characters: ["
            r7.append(r0)
            java.lang.String r6 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.StringUtils.newStringUtf8(r6)
            r7.append(r6)
            java.lang.String r6 = "]"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            goto L_0x0065
        L_0x0064:
            throw r5
        L_0x0065:
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.Base64.<init>(int, byte[], boolean):void");
    }

    public Base64(boolean z) {
        this(76, CHUNK_SEPARATOR, z);
    }

    public static byte[] decodeBase64(String str) {
        return new Base64().decode(str);
    }

    public static byte[] decodeBase64(byte[] bArr) {
        return new Base64().decode(bArr);
    }

    public static BigInteger decodeInteger(byte[] bArr) {
        return new BigInteger(1, decodeBase64(bArr));
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return encodeBase64(bArr, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z) {
        return encodeBase64(bArr, z, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2) {
        return encodeBase64(bArr, z, z2, Integer.MAX_VALUE);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2, int i) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Base64 base64 = z ? new Base64(z2) : new Base64(0, CHUNK_SEPARATOR, z2);
        long encodedLength = base64.getEncodedLength(bArr);
        if (encodedLength <= ((long) i)) {
            return base64.encode(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + encodedLength + ") than the specified maximum size of " + i);
    }

    public static byte[] encodeBase64Chunked(byte[] bArr) {
        return encodeBase64(bArr, true);
    }

    public static String encodeBase64String(byte[] bArr) {
        return StringUtils.newStringUtf8(encodeBase64(bArr, false));
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        return encodeBase64(bArr, false, true);
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        return StringUtils.newStringUtf8(encodeBase64(bArr, false, true));
    }

    public static byte[] encodeInteger(BigInteger bigInteger) {
        if (bigInteger != null) {
            return encodeBase64(toIntegerBytes(bigInteger), false);
        }
        throw new NullPointerException("encodeInteger called with null parameter");
    }

    @Deprecated
    public static boolean isArrayByteBase64(byte[] bArr) {
        return isBase64(bArr);
    }

    public static boolean isBase64(byte b2) {
        if (b2 != 61) {
            if (b2 != -1) {
                byte[] bArr = DECODE_TABLE;
                if (b2 >= bArr.length || bArr[b2] == -1) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean isBase64(String str) {
        return isBase64(StringUtils.getBytesUtf8(str));
    }

    public static boolean isBase64(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (!isBase64(bArr[i]) && !BaseNCodec.isWhiteSpace(bArr[i])) {
                return false;
            }
        }
        return true;
    }

    static byte[] toIntegerBytes(BigInteger bigInteger) {
        int bitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == bitLength / 8) {
            return byteArray;
        }
        int i = 0;
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
            i = 1;
        }
        int i2 = bitLength / 8;
        byte[] bArr = new byte[i2];
        System.arraycopy(byteArray, i, bArr, i2 - length, length);
        return bArr;
    }

    /* access modifiers changed from: package-private */
    public void decode(byte[] bArr, int i, int i2, BaseNCodec.Context context) {
        byte b2;
        if (!context.eof) {
            if (i2 < 0) {
                context.eof = true;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                byte[] ensureBufferSize = ensureBufferSize(this.decodeSize, context);
                int i4 = i + 1;
                byte b3 = bArr[i];
                if (b3 == 61) {
                    context.eof = true;
                    break;
                }
                byte[] bArr2 = DECODE_TABLE;
                if (b3 < bArr2.length && (b2 = bArr2[b3]) >= 0) {
                    context.modulus = (context.modulus + 1) % 4;
                    context.ibitWorkArea = (context.ibitWorkArea << 6) + b2;
                    if (context.modulus == 0) {
                        int i5 = context.pos;
                        context.pos = i5 + 1;
                        int i6 = context.ibitWorkArea;
                        ensureBufferSize[i5] = (byte) ((i6 >> 16) & 255);
                        int i7 = context.pos;
                        context.pos = i7 + 1;
                        ensureBufferSize[i7] = (byte) ((i6 >> 8) & 255);
                        int i8 = context.pos;
                        context.pos = i8 + 1;
                        ensureBufferSize[i8] = (byte) (i6 & 255);
                    }
                }
                i3++;
                i = i4;
            }
            if (context.eof && context.modulus != 0) {
                byte[] ensureBufferSize2 = ensureBufferSize(this.decodeSize, context);
                int i9 = context.modulus;
                if (i9 == 1 || i9 == 2) {
                    context.ibitWorkArea >>= 4;
                    int i10 = context.pos;
                    context.pos = i10 + 1;
                    ensureBufferSize2[i10] = (byte) (context.ibitWorkArea & 255);
                } else if (i9 == 3) {
                    context.ibitWorkArea >>= 2;
                    int i11 = context.pos;
                    context.pos = i11 + 1;
                    int i12 = context.ibitWorkArea;
                    ensureBufferSize2[i11] = (byte) ((i12 >> 8) & 255);
                    int i13 = context.pos;
                    context.pos = i13 + 1;
                    ensureBufferSize2[i13] = (byte) (i12 & 255);
                } else {
                    throw new IllegalStateException("Impossible modulus " + context.modulus);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void encode(byte[] r9, int r10, int r11, com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BaseNCodec.Context r12) {
        /*
            r8 = this;
            boolean r0 = r12.eof
            if (r0 != 0) goto L_0x014d
            r0 = 0
            r1 = 1
            if (r11 >= 0) goto L_0x00cb
            r12.eof = r1
            int r9 = r12.modulus
            if (r9 != 0) goto L_0x0014
            int r9 = r8.lineLength
            if (r9 == 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return
        L_0x0014:
            int r9 = r8.encodeSize
            byte[] r9 = r8.ensureBufferSize(r9, r12)
            int r10 = r12.pos
            int r11 = r12.modulus
            if (r11 == 0) goto L_0x00ab
            r2 = 61
            if (r11 == r1) goto L_0x0079
            r1 = 2
            if (r11 != r1) goto L_0x0060
            int r11 = r10 + 1
            r12.pos = r11
            byte[] r11 = r8.encodeTable
            int r3 = r12.ibitWorkArea
            int r4 = r3 >> 10
            r4 = r4 & 63
            byte r4 = r11[r4]
            r9[r10] = r4
            int r4 = r12.pos
            int r5 = r4 + 1
            r12.pos = r5
            int r5 = r3 >> 4
            r5 = r5 & 63
            byte r5 = r11[r5]
            r9[r4] = r5
            int r4 = r12.pos
            int r5 = r4 + 1
            r12.pos = r5
            int r1 = r3 << 2
            r1 = r1 & 63
            byte r1 = r11[r1]
            r9[r4] = r1
            byte[] r1 = STANDARD_ENCODE_TABLE
            if (r11 != r1) goto L_0x00ab
            int r11 = r12.pos
            int r1 = r11 + 1
            r12.pos = r1
            r9[r11] = r2
            goto L_0x00ab
        L_0x0060:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Impossible modulus "
            r10.append(r11)
            int r11 = r12.modulus
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0079:
            int r11 = r10 + 1
            r12.pos = r11
            byte[] r11 = r8.encodeTable
            int r1 = r12.ibitWorkArea
            int r3 = r1 >> 2
            r3 = r3 & 63
            byte r3 = r11[r3]
            r9[r10] = r3
            int r3 = r12.pos
            int r4 = r3 + 1
            r12.pos = r4
            int r1 = r1 << 4
            r1 = r1 & 63
            byte r1 = r11[r1]
            r9[r3] = r1
            byte[] r1 = STANDARD_ENCODE_TABLE
            if (r11 != r1) goto L_0x00ab
            int r11 = r12.pos
            int r1 = r11 + 1
            r12.pos = r1
            r9[r11] = r2
            int r11 = r12.pos
            int r1 = r11 + 1
            r12.pos = r1
            r9[r11] = r2
        L_0x00ab:
            int r11 = r12.currentLinePos
            int r1 = r12.pos
            int r10 = r1 - r10
            int r11 = r11 + r10
            r12.currentLinePos = r11
            int r10 = r8.lineLength
            if (r10 <= 0) goto L_0x00ca
            int r10 = r12.currentLinePos
            if (r10 <= 0) goto L_0x00ca
            byte[] r10 = r8.lineSeparator
            int r11 = r10.length
            java.lang.System.arraycopy(r10, r0, r9, r1, r11)
            int r9 = r12.pos
            byte[] r10 = r8.lineSeparator
            int r10 = r10.length
            int r9 = r9 + r10
            r12.pos = r9
        L_0x00ca:
            return
        L_0x00cb:
            r2 = r10
            r10 = 0
        L_0x00cd:
            if (r10 >= r11) goto L_0x014d
            int r3 = r8.encodeSize
            byte[] r3 = r8.ensureBufferSize(r3, r12)
            int r4 = r12.modulus
            int r4 = r4 + r1
            int r4 = r4 % 3
            r12.modulus = r4
            int r4 = r2 + 1
            byte r2 = r9[r2]
            if (r2 >= 0) goto L_0x00e4
            int r2 = r2 + 256
        L_0x00e4:
            int r5 = r12.ibitWorkArea
            int r5 = r5 << 8
            int r5 = r5 + r2
            r12.ibitWorkArea = r5
            int r2 = r12.modulus
            if (r2 != 0) goto L_0x0149
            int r2 = r12.pos
            int r5 = r2 + 1
            r12.pos = r5
            byte[] r5 = r8.encodeTable
            int r6 = r12.ibitWorkArea
            int r7 = r6 >> 18
            r7 = r7 & 63
            byte r7 = r5[r7]
            r3[r2] = r7
            int r2 = r12.pos
            int r7 = r2 + 1
            r12.pos = r7
            int r7 = r6 >> 12
            r7 = r7 & 63
            byte r7 = r5[r7]
            r3[r2] = r7
            int r2 = r12.pos
            int r7 = r2 + 1
            r12.pos = r7
            int r7 = r6 >> 6
            r7 = r7 & 63
            byte r7 = r5[r7]
            r3[r2] = r7
            int r2 = r12.pos
            int r7 = r2 + 1
            r12.pos = r7
            r6 = r6 & 63
            byte r5 = r5[r6]
            r3[r2] = r5
            int r2 = r12.currentLinePos
            int r2 = r2 + 4
            r12.currentLinePos = r2
            int r2 = r8.lineLength
            if (r2 <= 0) goto L_0x0149
            int r5 = r12.currentLinePos
            if (r2 > r5) goto L_0x0149
            byte[] r2 = r8.lineSeparator
            int r5 = r12.pos
            int r6 = r2.length
            java.lang.System.arraycopy(r2, r0, r3, r5, r6)
            int r2 = r12.pos
            byte[] r3 = r8.lineSeparator
            int r3 = r3.length
            int r2 = r2 + r3
            r12.pos = r2
            r12.currentLinePos = r0
        L_0x0149:
            int r10 = r10 + 1
            r2 = r4
            goto L_0x00cd
        L_0x014d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.Base64.encode(byte[], int, int, com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BaseNCodec$Context):void");
    }

    /* access modifiers changed from: protected */
    public boolean isInAlphabet(byte b2) {
        if (b2 != -1) {
            byte[] bArr = this.decodeTable;
            return b2 < bArr.length && bArr[b2] != -1;
        }
    }

    public boolean isUrlSafe() {
        return this.encodeTable == URL_SAFE_ENCODE_TABLE;
    }
}
