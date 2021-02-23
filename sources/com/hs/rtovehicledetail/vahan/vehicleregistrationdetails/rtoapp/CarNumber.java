package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.text.TextUtils;
import java.util.ArrayList;

public class CarNumber {
    static int minCount = 1;

    public static <T> boolean contains(T[] tArr, T t) {
        if (t == null) {
            for (T t2 : tArr) {
                if (t2 == null) {
                    return true;
                }
            }
        } else {
            for (T t3 : tArr) {
                if (t3 == t || t.equals(t3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ArrayList<String> evaluavateNumberSeries(int i, int i2, int i3, int[] iArr) {
        ArrayList<String> arrayList = new ArrayList<>();
        minCount = i3;
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            numArr[i5] = Integer.valueOf(iArr[i4]);
            i4++;
            i5++;
        }
        while (i <= i2) {
            int sumOfCount = sumOfCount(i);
            if (iArr.length == 0) {
                String twiceOrThrice = twiceOrThrice(i);
                if (!TextUtils.isEmpty(twiceOrThrice)) {
                    if (twiceOrThrice.length() < 4) {
                        twiceOrThrice = getZeros(4 - twiceOrThrice.length()) + twiceOrThrice;
                    }
                    arrayList.add(twiceOrThrice);
                }
            }
            if (contains(numArr, Integer.valueOf(sumOfCount))) {
                String twiceOrThrice2 = twiceOrThrice(i);
                if (!TextUtils.isEmpty(twiceOrThrice2)) {
                    if (twiceOrThrice2.length() < 4) {
                        twiceOrThrice2 = getZeros(4 - twiceOrThrice2.length()) + twiceOrThrice2;
                    }
                    arrayList.add(twiceOrThrice2);
                }
            }
            i++;
        }
        return arrayList;
    }

    private static String getZeros(int i) {
        String str = BuildConfig.FLAVOR;
        for (int i2 = 0; i2 < i; i2++) {
            str = str + "0";
        }
        return str;
    }

    public static boolean replica(String str, int i) {
        char charAt = str.charAt(i);
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (charAt == str.charAt(i3)) {
                i2++;
            }
        }
        return i2 >= minCount;
    }

    public static int sumOfCount(int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (i >= 1000 && (i4 = i % 1000) >= 0) {
            i5 = 0 + (i / 1000);
            i = i4;
        }
        if (i >= 100 && (i3 = i % 100) >= 0) {
            i5 += i / 100;
            i = i3;
        }
        if (i >= 10 && (i2 = i % 10) >= 0) {
            i5 += i / 10;
            i = i2;
        }
        int i6 = i5 + i;
        return i6 >= 10 ? sumOfCount(i6) : i6;
    }

    public static String twiceOrThrice(int i) {
        String str = i + BuildConfig.FLAVOR;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (replica(str, i2)) {
                return str;
            }
        }
        return null;
    }
}
