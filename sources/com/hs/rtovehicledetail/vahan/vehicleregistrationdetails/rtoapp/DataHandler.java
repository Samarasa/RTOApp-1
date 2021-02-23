package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.m;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

public class DataHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String DATA = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String MOBILE_PREFERENCES = "mobilepreferences";
    public static Random RANDOM = new Random();
    public static final String RATING_PREFERENCES = "ratingpreferences";
    static boolean latest = false;
    private static final DataHandler ourInstance = new DataHandler();
    String mobileNumberFromPopup;

    private DataHandler() {
    }

    public static byte[] encodE(String str) {
        return Base64.encode(str.getBytes(), 0);
    }

    public static f getAdSize(Context context, View view) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        float f2 = displayMetrics.density;
        float width = (float) view.getWidth();
        if (width == 0.0f) {
            width = (float) displayMetrics.widthPixels;
        }
        return f.a(context, (int) (width / f2));
    }

    public static DataHandler getInstance() {
        return ourInstance;
    }

    public static StringBuilder getRandi(byte[] bArr, byte[] bArr2) {
        String insertPeriodically = insertPeriodically(new String(bArr, "UTF-8"), "a", 1);
        String insertPeriodically2 = insertPeriodically(new String(bArr2, "UTF-8"), "a", 1);
        StringBuilder sb = new StringBuilder(100000);
        sb.append(random(1));
        sb.append(random(1));
        sb.append(insertPeriodically);
        sb.append("~");
        sb.append(insertPeriodically2);
        sb.append(random(1));
        sb.append("+");
        sb.append(randi4());
        return sb;
    }

    public static String insertPeriodically(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder(str.length() + (str2.length() * (str.length() / i)) + 1);
        int i2 = 0;
        String str3 = BuildConfig.FLAVOR;
        while (i2 < str.length()) {
            sb.append(str3);
            str3 = random(1);
            int i3 = i2 + i;
            sb.append(str.substring(i2, Math.min(i3, str.length())));
            i2 = i3;
        }
        return sb.toString();
    }

    public static boolean isRatingDone(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(RATING_PREFERENCES, 0);
        sharedPreferences.edit();
        return sharedPreferences.getBoolean("rate", false);
    }

    public static String randi4() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        int nextInt = random.nextInt(4);
        for (int i = 0; i < nextInt; i++) {
            sb.append((char) (random.nextInt(96) + 32));
        }
        return sb.toString();
    }

    public static String random(int i) {
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(RANDOM.nextInt(36)));
        }
        return sb.toString();
    }

    public static void setRatingDone(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences(RATING_PREFERENCES, 0).edit();
        edit.putBoolean("rate", true);
        edit.commit();
    }

    public static void showAd(Context context) {
        Intent intent;
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("showFullScreenAD", "false");
        String string2 = PreferenceManager.getDefaultSharedPreferences(context).getString("AdRotationPolicy", "false");
        String string3 = PreferenceManager.getDefaultSharedPreferences(context).getString("InterstitialOnlyFB", "false");
        String string4 = PreferenceManager.getDefaultSharedPreferences(context).getString("InterstitialOnlyGoogle", "false");
        String string5 = PreferenceManager.getDefaultSharedPreferences(context).getString("deeku_showOurAppInterstitials", "false");
        if (!string.equals("true")) {
            return;
        }
        if (string2.equals("true")) {
            if (VehicleInfoHandler.getInstance() != null) {
                if (VehicleInfoHandler.getInstance().isFb_interstitial()) {
                    StartActivity startActivity = StartActivity.sObj;
                    if (startActivity != null) {
                        m mVar = startActivity.mInterstitialAd;
                        if (mVar == null || !mVar.b()) {
                            StartActivity.sObj.requestNewInterstitial();
                            if (string5.equals("true")) {
                                intent = new Intent(context, OurAdActivity.class);
                                context.startActivity(intent);
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    StartActivity startActivity2 = StartActivity.sObj;
                    if (startActivity2 != null) {
                        m mVar2 = startActivity2.mInterstitialAd;
                        if (mVar2 == null || !mVar2.b()) {
                            StartActivity.sObj.requestNewInterstitial();
                            if (string5.equals("true")) {
                                intent = new Intent(context, OurAdActivity.class);
                                context.startActivity(intent);
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                }
                StartActivity.sObj.mInterstitialAd.c();
                VehicleInfoHandler.getInstance().setFb_interstitial(true);
            }
        } else if (string4.equals("true")) {
            showAdMObInterstitial(context);
        } else if (string3.equals("true")) {
            showFbInterstitial(context);
        }
    }

    private static void showAdMObInterstitial(Context context) {
        Intent intent;
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("deeku_showOurAppInterstitials", "false");
        StartActivity startActivity = StartActivity.sObj;
        if (startActivity != null) {
            m mVar = startActivity.mInterstitialAd;
            if (mVar != null) {
                if (mVar.b()) {
                    StartActivity.sObj.mInterstitialAd.c();
                    return;
                }
                StartActivity.sObj.requestNewInterstitial();
                if (string.equals("true")) {
                    intent = new Intent(context, OurAdActivity.class);
                } else {
                    return;
                }
            } else if (string.equals("true")) {
                intent = new Intent(context, OurAdActivity.class);
            } else {
                return;
            }
        } else if (string.equals("true")) {
            intent = new Intent(context, OurAdActivity.class);
        } else {
            return;
        }
        context.startActivity(intent);
    }

    public static boolean showAdMobBanner(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("AdRotationBanner", "false");
        String string2 = PreferenceManager.getDefaultSharedPreferences(context).getString("BannerOnlyFB", "true");
        String string3 = PreferenceManager.getDefaultSharedPreferences(context).getString("BannerOnlyGoogle", "false");
        if (!(string == null || string2 == null || string3 == null)) {
            if (string.equals("true")) {
                if (latest) {
                    latest = false;
                    return true;
                }
                latest = true;
                return false;
            } else if (!string2.equals("true") && string3.equals("true")) {
                return true;
            }
        }
        return false;
    }

    private static void showFbInterstitial(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("deeku_showOurAppInterstitials", "false");
        if (StartActivity.sObj != null && string.equals("true")) {
            context.startActivity(new Intent(context, OurAdActivity.class));
        }
        if (string.equals("true")) {
            context.startActivity(new Intent(context, OurAdActivity.class));
        }
    }

    public void deleteAllRecentSearches(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("RECENTSEARCHES", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        try {
            JSONArray jSONArray = new JSONArray(sharedPreferences.getString("searches", BuildConfig.FLAVOR));
            for (int i = 0; i < jSONArray.length(); i++) {
                jSONArray.getJSONObject(i);
                jSONArray.remove(i);
            }
            edit.putString("searches", jSONArray.toString());
            edit.commit();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        edit.commit();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        java.lang.System.out.println("Exception in recent searches");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0031 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void deleteRecentSearch(java.lang.String r7, android.content.Context r8) {
        /*
            r6 = this;
            java.lang.String r0 = "searches"
            r1 = 0
            java.lang.String r2 = "RECENTSEARCHES"
            android.content.SharedPreferences r8 = r8.getSharedPreferences(r2, r1)
            android.content.SharedPreferences$Editor r2 = r8.edit()
            java.lang.String r3 = ""
            java.lang.String r8 = r8.getString(r0, r3)     // Catch:{ Exception -> 0x0046 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x0046 }
            r3.<init>(r8)     // Catch:{ Exception -> 0x0046 }
            r8 = 0
        L_0x0019:
            int r4 = r3.length()     // Catch:{ Exception -> 0x0046 }
            if (r1 > r4) goto L_0x003b
            org.json.JSONObject r4 = r3.getJSONObject(r1)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r5 = "reg_no"
            java.lang.String r4 = r4.getString(r5)     // Catch:{ Exception -> 0x0031 }
            boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x0031 }
            if (r4 == 0) goto L_0x0038
            r8 = r1
            goto L_0x0038
        L_0x0031:
            java.io.PrintStream r4 = java.lang.System.out     // Catch:{ Exception -> 0x0046 }
            java.lang.String r5 = "Exception in recent searches"
            r4.println(r5)     // Catch:{ Exception -> 0x0046 }
        L_0x0038:
            int r1 = r1 + 1
            goto L_0x0019
        L_0x003b:
            r3.remove(r8)     // Catch:{ Exception -> 0x0046 }
            java.lang.String r7 = r3.toString()     // Catch:{ Exception -> 0x0046 }
            r2.putString(r0, r7)     // Catch:{ Exception -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r7 = move-exception
            r7.printStackTrace()
        L_0x004a:
            r2.commit()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DataHandler.deleteRecentSearch(java.lang.String, android.content.Context):void");
    }

    /* access modifiers changed from: package-private */
    public String getMobileNumber(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(MOBILE_PREFERENCES, 0);
        sharedPreferences.edit();
        this.mobileNumberFromPopup = sharedPreferences.getString("mobile", BuildConfig.FLAVOR);
        return this.mobileNumberFromPopup;
    }

    public JSONArray getRecentSearches(Context context) {
        try {
            String string = context.getSharedPreferences("RECENTSEARCHES", 0).getString("searches", BuildConfig.FLAVOR);
            return string.equals(BuildConfig.FLAVOR) ? new JSONArray() : new JSONArray(string);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isMobileNumber(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(MOBILE_PREFERENCES, 0);
        sharedPreferences.edit();
        this.mobileNumberFromPopup = sharedPreferences.getString("mobile", BuildConfig.FLAVOR);
        return !this.mobileNumberFromPopup.equals(BuildConfig.FLAVOR);
    }

    public void saveToRecentSearches(JSONObject jSONObject, Context context) {
        String jSONArray;
        int i = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("RECENTSEARCHES", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        try {
            String string = sharedPreferences.getString("searches", BuildConfig.FLAVOR);
            if (!string.equals(BuildConfig.FLAVOR)) {
                JSONArray jSONArray2 = new JSONArray(string);
                while (i < jSONArray2.length()) {
                    if (!jSONArray2.getJSONObject(i).getString("owner_name").equals(jSONObject.getString("owner_name"))) {
                        i++;
                    } else {
                        return;
                    }
                }
                jSONArray2.put(jSONObject);
                jSONArray = jSONArray2.toString();
            } else {
                JSONArray jSONArray3 = new JSONArray();
                jSONArray3.put(jSONObject);
                jSONArray = jSONArray3.toString();
            }
            edit.putString("searches", jSONArray);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    public void setMobileNumber(Context context, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences(MOBILE_PREFERENCES, 0).edit();
        edit.putString("mobile", str);
        edit.commit();
    }

    public String stringBetween(String str, String str2, String str3, int i) {
        return str.substring(str.indexOf(str2) + i, str.indexOf(str3));
    }
}
