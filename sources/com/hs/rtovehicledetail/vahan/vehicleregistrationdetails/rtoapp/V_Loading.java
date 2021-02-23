package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.provider.Telephony;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.o;
import androidx.fragment.app.C0159i;
import c.c.a.a.c;
import c.c.a.a.e;
import c.c.a.a.i;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.formats.c;
import com.google.android.gms.ads.formats.j;
import com.google.android.gms.ads.w;
import g.A;
import g.E;
import g.H;
import g.J;
import g.x;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class V_Loading extends o {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    LinearLayout adView;
    String globalMessage = BuildConfig.FLAVOR;
    JSONObject jobj11;
    ImageView loading_gif;
    TextView loading_msg;
    /* access modifiers changed from: private */
    public j nativeAd;
    public String new_model;
    public String new_rtooffice;
    boolean vahanDataCame = false;
    public String vehicleNum1;
    public String vehicleNum2;
    String vregNo;

    class GetDataAsync extends AsyncTask<String, Void, ArrayList> {
        private int count = -1;

        GetDataAsync() {
        }

        public ArrayList doInBackground(String... strArr) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Matcher matcher = Pattern.compile("(\\w{2})(\\d{1,3})(\\D*?)(\\d{1,4})").matcher(strArr[0]);
            String replaceFirst = matcher.matches() ? matcher.replaceFirst("$1$2$3-$4") : BuildConfig.FLAVOR;
            if (!replaceFirst.equals(BuildConfig.FLAVOR)) {
                String[] split = replaceFirst.split("-");
                String str = split[0];
                String str2 = split[1];
                try {
                    Connection.Response execute = Jsoup.connect("https://parivahan.gov.in/rcdlstatus/?pur_cd=102").validateTLSCertificates(false).followRedirects(true).ignoreHttpErrors(true).method(Connection.Method.GET).execute();
                    if (execute.statusCode() <= 500) {
                        Map<String, String> cookies = execute.cookies();
                        Document parse = Jsoup.parse(execute.body());
                        Element first = parse.getElementsByAttributeValue("name", "javax.faces.ViewState").first();
                        if (first == null) {
                            first = parse.getElementById("j_id1:javax.faces.ViewState:0");
                        }
                        String attr = first.attr("value");
                        String trim = ((Element) Jsoup.parse(execute.body()).getElementsByAttributeValueStarting("id", "form_rcdl:j_idt").select("button").get(0)).attr("id").trim();
                        String body = Jsoup.connect("https://parivahan.gov.in/rcdlstatus/vahan/rcDlHome.xhtml").validateTLSCertificates(false).followRedirects(true).method(Connection.Method.POST).cookies(cookies).referrer("https://parivahan.gov.in/rcdlstatus/?pur_cd=102").header("Content-Type", "application/x-www-form-urlencoded").header("Host", "parivahan.gov.in").header("Accept", "application/xml, text/xml, */*; q=0.01").header("Accept-Language", "en-US,en;q=0.5").header("Accept-Encoding", "gzip, deflate, br").header("X-Requested-With", "XMLHttpRequest").header("Faces-Request", "partial/ajax").header("Origin", "https://parivahan.gov.in").userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.140 Safari/537.36").data("javax.faces.partial.ajax", "true").data("javax.faces.source", trim).data("javax.faces.partial.execute", "@all").data("javax.faces.partial.render", "form_rcdl:pnl_show form_rcdl:pg_show form_rcdl:rcdl_pnl").data(trim, trim).data("form_rcdl", "form_rcdl").data("form_rcdl:tf_reg_no1", str).data("form_rcdl:tf_reg_no2", str2).data("javax.faces.ViewState", attr).execute().body();
                        Log.v("AAA", "str2 " + body);
                        if (!body.contains("Registration No. does not exist!!!")) {
                            Document parse2 = Jsoup.parse("<!DOCTYPE html><html><body>" + body.substring(body.indexOf("<table"), body.lastIndexOf("</table>")) + "</body></html>");
                            int indexOf = body.indexOf("<div class=\"font-bold top-space bottom-space text-capitalize\">") + 62;
                            body.substring(indexOf, body.indexOf("</div>", indexOf)).replaceAll("Registering Authority:", BuildConfig.FLAVOR).trim();
                            Element first2 = parse2.select("table").first();
                            if (first2 != null) {
                                Elements select = first2.select("tr");
                                for (int i = 0; i < select.size(); i++) {
                                    Elements select2 = ((Element) select.get(i)).select("td");
                                    for (int i2 = 0; i2 < select2.size(); i2++) {
                                        String text = ((Element) select2.get(i2)).text();
                                        if (!text.trim().equals("Owner Name:") && this.count != i2) {
                                            arrayList.add(text);
                                        }
                                        if (this.count == -1) {
                                            this.count = i2 + 1;
                                        } else {
                                            this.count = -1;
                                        }
                                        arrayList2.add(text);
                                    }
                                }
                                arrayList2.addAll(arrayList);
                            }
                        }
                        arrayList2.add(0, "No Record(s) Found");
                    } else {
                        arrayList2.add(0, "500 Server Error");
                    }
                } catch (Exception unused) {
                    arrayList2.add(0, "Server Error");
                }
            } else {
                arrayList2.add(0, "500 Server Error");
            }
            return arrayList2;
        }

        public void onPostExecute(ArrayList arrayList) {
            super.onPostExecute(arrayList);
            System.out.println(arrayList.toString());
            if (V_Loading.this.isFinishing()) {
                return;
            }
            if (arrayList.size() > 1) {
                V_Loading.this.assignScrapData(arrayList);
            } else if (arrayList.get(0).equals("Server Error") || arrayList.get(0).equals("500 Server Error")) {
                V_Loading.this.getWithSms();
            } else {
                V_Loading v_Loading = V_Loading.this;
                Intent intent = new Intent(v_Loading, V_NoRegistration.class);
                v_Loading.startActivity(intent.putExtra("vNum", V_Loading.this.getIntent().getStringExtra("reg1") + V_Loading.this.getIntent().getStringExtra("reg2")));
                V_Loading.this.finish();
            }
        }

        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    class checkInVahanScraping extends AsyncTask<String, Void, ArrayList> {
        String aKey;
        String aVal;
        String bKey;
        String bVal;
        String cKey;
        String cVal;
        private int count = -1;
        String dKey;
        String dVal;
        String eKey;
        String eVal;
        String fKey;
        String fVal;
        String gKey;
        String gVal;
        String hKey;
        String hVal;

        checkInVahanScraping() {
        }

        public ArrayList doInBackground(String... strArr) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String str;
            String str2;
            ArrayList arrayList3;
            String str3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            try {
                Connection.Response execute = Jsoup.connect(VehicleInfoHandler.getInstance().getVScrapingUrl()).validateTLSCertificates(false).followRedirects(true).ignoreHttpErrors(true).method(Connection.Method.POST).execute();
                if (execute.statusCode() <= 500) {
                    Map<String, String> cookies = execute.cookies();
                    CharSequence charSequence = "Vehicle has multiple records in the RTO";
                    if (VehicleInfoHandler.getInstance().getVScrapingCookies().contains(";")) {
                        String[] split = VehicleInfoHandler.getInstance().getVScrapingCookies().split(";");
                        arrayList2 = arrayList7;
                        try {
                            String[] split2 = split[0].split("=");
                            String[] split3 = split[1].split("=");
                            cookies.put(split2[0].replaceAll(" ", BuildConfig.FLAVOR), split2[1].replaceAll(" ", BuildConfig.FLAVOR));
                            cookies.put(split3[0].replaceAll(" ", BuildConfig.FLAVOR), split3[1].replaceAll(" ", BuildConfig.FLAVOR));
                        } catch (Exception unused) {
                            arrayList = arrayList2;
                            arrayList.add(0, "Server Error");
                            return arrayList;
                        }
                    } else {
                        arrayList2 = arrayList7;
                    }
                    if (VehicleInfoHandler.getInstance().getVScrapingKeys().contains(",")) {
                        String[] split4 = VehicleInfoHandler.getInstance().getVScrapingKeys().split(",");
                        String[] split5 = split4[0].split("~");
                        String[] split6 = split4[1].split("~");
                        String[] split7 = split4[2].split("~");
                        String[] split8 = split4[3].split("~");
                        arrayList3 = arrayList6;
                        String[] split9 = split4[4].split("~");
                        str2 = "div";
                        String[] split10 = split4[5].split("~");
                        str = "Model Name";
                        String[] split11 = split4[6].split("~");
                        String[] split12 = split4[7].split("~");
                        str3 = "title";
                        this.aKey = split5[0].replaceAll(" ", BuildConfig.FLAVOR);
                        this.aVal = split5[1].replaceAll(" ", BuildConfig.FLAVOR);
                        this.bKey = split6[0].replaceAll(" ", BuildConfig.FLAVOR);
                        this.bVal = split6[1].replaceAll(" ", BuildConfig.FLAVOR);
                        this.cKey = split7[0].replaceAll(" ", BuildConfig.FLAVOR);
                        this.cVal = split7[1].trim();
                        this.dKey = split8[0].replaceAll(" ", BuildConfig.FLAVOR);
                        this.dVal = split8[1].trim();
                        this.eKey = split9[0].replaceAll(" ", BuildConfig.FLAVOR);
                        this.eVal = split9[1].replaceAll(" ", BuildConfig.FLAVOR);
                        this.fKey = split10[0].replaceAll(" ", BuildConfig.FLAVOR);
                        this.fVal = split10[1].replaceAll(" ", BuildConfig.FLAVOR);
                        this.gKey = split11[0].replaceAll(" ", BuildConfig.FLAVOR);
                        this.gVal = split11[1].replaceAll(" ", BuildConfig.FLAVOR);
                        this.hKey = split12[0].replaceAll(" ", BuildConfig.FLAVOR);
                        this.hVal = split12[1].replaceAll(" ", BuildConfig.FLAVOR);
                    } else {
                        str = "Model Name";
                        str2 = "div";
                        str3 = "title";
                        arrayList3 = arrayList6;
                    }
                    Jsoup.parse(execute.body());
                    String body = Jsoup.connect(VehicleInfoHandler.getInstance().getVScrapingUrl()).timeout(60000).validateTLSCertificates(false).followRedirects(true).method(Connection.Method.POST).cookies(cookies).referrer(VehicleInfoHandler.getInstance().getVScrapingUrl()).header("Cookie", VehicleInfoHandler.getInstance().getVScrapingCookies()).header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8").header("Referer", VehicleInfoHandler.getInstance().getVScrapingUrl()).header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.105 Safari/537.36").data(this.aKey, this.aVal).data(this.bKey, this.bVal).data(this.cKey, this.cVal).data(this.dKey, this.dVal).data(this.eKey, this.eVal).data(this.fKey, this.fVal).data(this.gKey, this.gVal).data(this.hKey, this.hVal).data("regn_no1_exact", strArr[0]).execute().body();
                    Log.v("AAA", "str2 " + body);
                    if (body.contains("Owner Name:")) {
                        Document parse = Jsoup.parse("<!DOCTYPE html><html><body>" + body.substring(body.indexOf("<div id=\"rcDetailsPanel\" class=\"ui-outputpanel ui-widget\">"), body.lastIndexOf("</div></div>]]></update>")) + "</body></html>");
                        String str4 = str3;
                        String str5 = str;
                        Elements elementsByAttributeValue = parse.getElementsByAttributeValue(str4, str5);
                        Elements elementsByAttributeValue2 = parse.getElementsByAttributeValue(str4, "Registering Authority");
                        if (elementsByAttributeValue != null && elementsByAttributeValue.size() > 0) {
                            V_Loading.this.new_model = ((Element) parse.getElementsByAttributeValue(str4, str5).get(0)).text();
                        }
                        if (elementsByAttributeValue2 != null && elementsByAttributeValue2.size() > 0) {
                            V_Loading.this.new_rtooffice = ((Element) parse.getElementsByAttributeValue(str4, "Registering Authority").get(0)).text();
                        }
                        int indexOf = body.indexOf("<div class=\"font-bold top-space bottom-space text-capitalize\">") + 62;
                        body.substring(indexOf, body.indexOf("</div>", indexOf)).replaceAll("Registering Authority:", BuildConfig.FLAVOR).trim();
                        String str6 = str2;
                        Element first = parse.select(str6).first();
                        if (first != null) {
                            Elements select = first.select(str6);
                            for (int i = 0; i < select.size(); i++) {
                                Elements select2 = ((Element) select.get(i)).select(str6);
                                int i2 = 0;
                                while (i2 < select2.size()) {
                                    String text = ((Element) select2.get(i2)).text();
                                    if (text.trim().equals("Owner Name:") || this.count == i2) {
                                        arrayList5 = arrayList3;
                                    } else {
                                        arrayList5 = arrayList3;
                                        if (!arrayList5.contains(text)) {
                                            arrayList5.add(text);
                                        }
                                    }
                                    if (this.count == -1) {
                                        this.count = i2 + 1;
                                    } else {
                                        this.count = -1;
                                    }
                                    if (!arrayList5.contains(text)) {
                                        arrayList5.add(text);
                                    }
                                    i2++;
                                    arrayList3 = arrayList5;
                                }
                                ArrayList arrayList8 = arrayList3;
                            }
                            arrayList = arrayList2;
                            try {
                                arrayList.addAll(arrayList3);
                                return arrayList;
                            } catch (Exception unused2) {
                                arrayList.add(0, "Server Error");
                                return arrayList;
                            }
                        } else {
                            arrayList4 = arrayList2;
                        }
                    } else {
                        arrayList4 = arrayList2;
                        CharSequence charSequence2 = charSequence;
                        if (body.contains(charSequence2)) {
                            V_Loading.this.globalMessage = DataHandler.getInstance().stringBetween(body, "detail:", "});;", 7).replaceAll("^\"|\"$", BuildConfig.FLAVOR);
                            arrayList4.add(0, charSequence2);
                            return arrayList4;
                        } else if (!body.contains("Registration No. does not exist!!!")) {
                            return arrayList4;
                        }
                    }
                    arrayList4.add(0, "No Record(s) Found");
                    return arrayList4;
                }
                ArrayList arrayList9 = arrayList7;
                arrayList9.add(0, "500 Server Error");
                return arrayList9;
            } catch (Exception unused3) {
                arrayList = arrayList7;
                arrayList.add(0, "Server Error");
                return arrayList;
            }
        }

        public void onPostExecute(ArrayList arrayList) {
            super.onPostExecute(arrayList);
            System.out.println(arrayList.toString());
            if (V_Loading.this.isFinishing()) {
                return;
            }
            if (arrayList.size() > 1) {
                V_Loading.this.assignVahanScrapData(arrayList);
            } else {
                V_Loading.this.showTwoOwnerDialog();
            }
        }

        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* access modifiers changed from: private */
    public void assignScrapData(ArrayList arrayList) {
        if (arrayList != null && arrayList.size() > 1) {
            String str = (String) arrayList.get(1);
            String str2 = (String) arrayList.get(9);
            String str3 = (String) arrayList.get(3);
            String str4 = (String) arrayList.get(15);
            String str5 = (String) arrayList.get(11);
            String str6 = (String) arrayList.get(13);
            String str7 = (String) arrayList.get(5);
            String str8 = (String) arrayList.get(7);
            String str9 = (String) arrayList.get(19);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("reg_no", str);
                jSONObject.put("reg_at", "NOT AVAILABLE");
                jSONObject.put("owner_name", str2);
                jSONObject.put("reg_date", str3);
                jSONObject.put("maker_model", str4);
                jSONObject.put("vehicle_class", str5);
                jSONObject.put("fuel_type", str6);
                jSONObject.put("chasi_no", str7);
                jSONObject.put("engine_no", str8);
                jSONObject.put("vage", "NOT AVAILABLE");
                jSONObject.put("vinsurance", str9);
                jSONObject.put("vstate", "NOT AVAILABLE");
                jSONObject.put("vinsurance", BuildConfig.FLAVOR);
                jSONObject.put("vfinance", BuildConfig.FLAVOR);
                disableLoading();
                goVehicleResult(jSONObject);
            } catch (Exception e2) {
                disableLoading();
                PrintStream printStream = System.out;
                printStream.println("Exception : " + e2);
            }
        }
    }

    /* access modifiers changed from: private */
    public void assignVahanScrapData(ArrayList arrayList) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (arrayList != null && arrayList.size() > 1) {
            if (VehicleInfoHandler.getInstance() == null || VehicleInfoHandler.getInstance().getVregNoId() == 0) {
                str = BuildConfig.FLAVOR;
                str10 = str;
                str9 = str10;
                str8 = str9;
                str7 = str8;
                str6 = str7;
                str5 = str6;
                str4 = str5;
                str3 = str4;
                str2 = str3;
            } else {
                str10 = VehicleInfoHandler.getInstance().getVregNoId() < arrayList.size() ? (String) arrayList.get(VehicleInfoHandler.getInstance().getVregNoId()) : BuildConfig.FLAVOR;
                str9 = VehicleInfoHandler.getInstance().getVownerId() < arrayList.size() ? (String) arrayList.get(VehicleInfoHandler.getInstance().getVownerId()) : BuildConfig.FLAVOR;
                str8 = VehicleInfoHandler.getInstance().getOld_vownerId() < arrayList.size() ? (String) arrayList.get(VehicleInfoHandler.getInstance().getOld_vownerId()) : BuildConfig.FLAVOR;
                str7 = VehicleInfoHandler.getInstance().getVregDateId() < arrayList.size() ? (String) arrayList.get(VehicleInfoHandler.getInstance().getVregDateId()) : BuildConfig.FLAVOR;
                str6 = VehicleInfoHandler.getInstance().getVmodelId() < arrayList.size() ? (String) arrayList.get(VehicleInfoHandler.getInstance().getVmodelId()) : BuildConfig.FLAVOR;
                str5 = VehicleInfoHandler.getInstance().getVclassId() < arrayList.size() ? (String) arrayList.get(VehicleInfoHandler.getInstance().getVclassId()) : BuildConfig.FLAVOR;
                str4 = VehicleInfoHandler.getInstance().getVtypeId() < arrayList.size() ? (String) arrayList.get(VehicleInfoHandler.getInstance().getVtypeId()) : BuildConfig.FLAVOR;
                str3 = VehicleInfoHandler.getInstance().getVchasisId() < arrayList.size() ? (String) arrayList.get(VehicleInfoHandler.getInstance().getVchasisId()) : BuildConfig.FLAVOR;
                str2 = VehicleInfoHandler.getInstance().getVengineId() < arrayList.size() ? (String) arrayList.get(VehicleInfoHandler.getInstance().getVengineId()) : BuildConfig.FLAVOR;
                str = VehicleInfoHandler.getInstance().getVinsuranceId() < arrayList.size() ? (String) arrayList.get(VehicleInfoHandler.getInstance().getVinsuranceId()) : BuildConfig.FLAVOR;
            }
            String str11 = this.new_model;
            if (str11 != null && !str11.equals(BuildConfig.FLAVOR)) {
                str6 = this.new_model;
            }
            String str12 = this.new_rtooffice;
            String str13 = (str12 == null || str12.equals(BuildConfig.FLAVOR)) ? "NOT AVAILABLE" : this.new_rtooffice;
            this.jobj11 = new JSONObject();
            try {
                this.jobj11.put("reg_no", str10);
                this.jobj11.put("reg_at", str13);
                this.jobj11.put("owner_name", str9);
                this.jobj11.put("old_owner_name", str8);
                this.jobj11.put("reg_date", str7);
                this.jobj11.put("maker_model", str6);
                this.jobj11.put("vehicle_class", str5);
                this.jobj11.put("fuel_type", str4);
                this.jobj11.put("chasi_no", str3);
                this.jobj11.put("engine_no", str2);
                this.jobj11.put("vinsurance", str);
                this.jobj11.put("vfinance", BuildConfig.FLAVOR);
            } catch (Exception e2) {
                PrintStream printStream = System.out;
                printStream.println("Exception : " + e2);
            }
            this.vahanDataCame = true;
            showTwoOwnerDialog();
        }
    }

    /* access modifiers changed from: private */
    public void checkAndroidVersion() {
        String string = PreferenceManager.getDefaultSharedPreferences(this).getString("deeku_vahanMobileNo", BuildConfig.FLAVOR);
        if (Build.VERSION.SDK_INT >= 19) {
            String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(this);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("address", string);
            intent.putExtra("sms_body", "VAHAN " + this.vregNo);
            if (defaultSmsPackage != null) {
                intent.setPackage(defaultSmsPackage);
            }
            try {
                startActivity(intent);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setType("vnd.android-dir/mms-sms");
            intent2.putExtra("address", string);
            intent2.putExtra("sms_body", "VAHAN " + this.vregNo);
            startActivity(intent2);
        }
    }

    /* access modifiers changed from: private */
    public void goVehicleResult1(RCDetails rCDetails) {
        String str;
        String str2;
        if (!(rCDetails == null || rCDetails.getRegNo() == null)) {
            String regNo = rCDetails.getRegNo();
            String str3 = BuildConfig.FLAVOR;
            if (!regNo.equals(str3)) {
                System.out.println(rCDetails);
                String ownerName = rCDetails.getOwnerName() != null ? rCDetails.getOwnerName() : str3;
                String regDate = rCDetails.getRegDate() != null ? rCDetails.getRegDate() : str3;
                String makerModel = rCDetails.getMakerModel() != null ? rCDetails.getMakerModel() : str3;
                String vehicleClass = rCDetails.getVehicleClass() != null ? rCDetails.getVehicleClass() : str3;
                String fuelType = rCDetails.getFuelType() != null ? rCDetails.getFuelType() : str3;
                if (rCDetails.getChasisNo() != null) {
                    str = rCDetails.getChasisNo().substring(0, rCDetails.getChasisNo().length() - 4) + "XXXXX";
                } else {
                    str = str3;
                }
                if (rCDetails.getEngineNo() != null) {
                    str2 = rCDetails.getEngineNo().substring(0, rCDetails.getEngineNo().length() - 4) + "XXXXX";
                } else {
                    str2 = str3;
                }
                String insuranceUpto = rCDetails.getInsuranceUpto() != null ? rCDetails.getInsuranceUpto() : str3;
                String financer = rCDetails.getFinancer() != null ? rCDetails.getFinancer() : str3;
                String registeredAt = rCDetails.getRegisteredAt() != null ? rCDetails.getRegisteredAt() : str3;
                if (rCDetails.getRegNo() != null) {
                    str3 = rCDetails.getRegNo();
                }
                if (rCDetails.getFinancer() != null) {
                    rCDetails.getFinancer();
                }
                disableLoading();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("reg_no", str3);
                    jSONObject.put("reg_at", registeredAt);
                    jSONObject.put("owner_name", ownerName);
                    jSONObject.put("reg_date", regDate);
                    jSONObject.put("maker_model", makerModel);
                    jSONObject.put("vehicle_class", vehicleClass);
                    jSONObject.put("fuel_type", fuelType);
                    jSONObject.put("chasi_no", str);
                    jSONObject.put("engine_no", str2);
                    jSONObject.put("engine_no", str2);
                    jSONObject.put("vfinance", financer);
                    jSONObject.put("vinsurance", insuranceUpto);
                } catch (Exception e2) {
                    System.out.println("Exception : " + e2);
                }
                goVehicleResult(jSONObject);
                return;
            }
        }
        disableLoading();
        Toast.makeText(this, "Details not found", 0).show();
        finish();
    }

    private void mParivahanNew(final String str) {
        if (str != null && VehicleInfoHandler.getInstance().getMparivahanLockSalt() != null) {
            String encrypt = AES.encrypt(str, VehicleInfoHandler.getInstance().getMparivahanLockSalt());
            i iVar = new i();
            iVar.a("doc_number", encrypt);
            c cVar = new c();
            cVar.a("Content-Type", "application/x-www-form-urlencoded");
            cVar.a(7000);
            cVar.a(VehicleInfoHandler.getInstance().getMparivahanURL(), iVar, (c.c.a.a.j) new e() {
                public void onFailure(int i, Throwable th, String str) {
                    System.out.println();
                    Toast.makeText(V_Loading.this, "Try after some time", 0).show();
                    V_Loading.this.finish();
                }

                public void onSuccess(String str) {
                    try {
                        String decrypt = AES.decrypt(str, VehicleInfoHandler.getInstance().getMparivahanLockSalt());
                        if (decrypt.contains("Vehicle Record found in more than one office")) {
                            try {
                                JSONObject jSONObject = new JSONObject(decrypt);
                                V_Loading.this.globalMessage = jSONObject.getString("message");
                                V_Loading.this.globalMessage = V_Loading.this.splitMyString(V_Loading.this.globalMessage);
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                            }
                            if (VehicleInfoHandler.getInstance().getVahanScraping() != null && VehicleInfoHandler.getInstance().getVScrapingUrl() != null) {
                                if (!VehicleInfoHandler.getInstance().getVahanScraping().equals("true") || VehicleInfoHandler.getInstance().getVScrapingUrl().equals(BuildConfig.FLAVOR)) {
                                    V_Loading.this.showTwoOwnerDialog();
                                    return;
                                }
                                new checkInVahanScraping().execute(new String[]{str});
                                return;
                            }
                            return;
                        }
                        V_Loading.this.goVehicleResult1(new JSONParser().getRCDetails(decrypt));
                    } catch (Exception e3) {
                        PrintStream printStream = System.out;
                        printStream.println("e" + e3);
                        Toast.makeText(V_Loading.this, "Try after some time", 0).show();
                        V_Loading.this.finish();
                    }
                }
            });
        }
    }

    private void novmParivahanNew(final String str) {
        if (VehicleInfoHandler.getInstance().getVaccineUrl() != null && str != null && VehicleInfoHandler.getInstance().getMparivahanLockSalt() != null) {
            String encrypt = AES.encrypt(str, VehicleInfoHandler.getInstance().getMparivahanLockSalt());
            i iVar = new i();
            String vaccineParam = VehicleInfoHandler.getInstance().getVaccineParam();
            if (vaccineParam != null && !vaccineParam.equals(BuildConfig.FLAVOR)) {
                for (int i = 0; i < vaccineParam.split("&").length; i++) {
                    if (vaccineParam.split("&")[i].split("~")[0].equals("doc_number")) {
                        iVar.a(vaccineParam.split("&")[i].split("~")[0], encrypt);
                    } else {
                        iVar.a(vaccineParam.split("&")[i].split("~")[0], vaccineParam.split("&")[i].split("~")[1]);
                    }
                }
            }
            c cVar = new c();
            cVar.a("Content-Type", "application/x-www-form-urlencoded");
            cVar.a(7000);
            cVar.a(VehicleInfoHandler.getInstance().getVaccineUrl(), iVar, (c.c.a.a.j) new e() {
                public void onFailure(int i, Throwable th, String str) {
                    System.out.println();
                    Toast.makeText(V_Loading.this, "Try after some time", 0).show();
                    V_Loading.this.finish();
                }

                public void onSuccess(String str) {
                    try {
                        String decrypt = AES.decrypt(str, VehicleInfoHandler.getInstance().getMparivahanLockSalt());
                        if (decrypt.contains("Vehicle Record found in more than one office")) {
                            try {
                                JSONObject jSONObject = new JSONObject(decrypt);
                                V_Loading.this.globalMessage = jSONObject.getString("message");
                                V_Loading.this.globalMessage = V_Loading.this.splitMyString(V_Loading.this.globalMessage);
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                            }
                            if (VehicleInfoHandler.getInstance().getVahanScraping() != null && VehicleInfoHandler.getInstance().getVScrapingUrl() != null) {
                                if (!VehicleInfoHandler.getInstance().getVahanScraping().equals("true") || VehicleInfoHandler.getInstance().getVScrapingUrl().equals(BuildConfig.FLAVOR)) {
                                    V_Loading.this.showTwoOwnerDialog();
                                    return;
                                }
                                new checkInVahanScraping().execute(new String[]{str});
                                return;
                            }
                            return;
                        }
                        V_Loading.this.goVehicleResult1(new JSONParser().getRCDetails(decrypt));
                    } catch (Exception e3) {
                        PrintStream printStream = System.out;
                        printStream.println("e" + e3);
                        Toast.makeText(V_Loading.this, "Try after some time", 0).show();
                        V_Loading.this.finish();
                    }
                }
            });
        }
    }

    private void refreshAd() {
        d.a aVar = new d.a((Context) this, getString(R.string.admob_native_id));
        aVar.a((j.a) new j.a() {
            public void onUnifiedNativeAdLoaded(j jVar) {
                if (V_Loading.this.nativeAd != null) {
                    V_Loading.this.nativeAd.a();
                }
                j unused = V_Loading.this.nativeAd = jVar;
                FrameLayout frameLayout = (FrameLayout) V_Loading.this.findViewById(R.id.ad_laoding);
                UnifiedNativeAdView unifiedNativeAdView = (UnifiedNativeAdView) V_Loading.this.getLayoutInflater().inflate(R.layout.ad_unified, (ViewGroup) null);
                MainActivity.populateUnifiedNativeAdView(jVar, unifiedNativeAdView);
                frameLayout.removeAllViews();
                frameLayout.addView(unifiedNativeAdView);
            }
        });
        w.a aVar2 = new w.a();
        aVar2.a(true);
        w a2 = aVar2.a();
        c.a aVar3 = new c.a();
        aVar3.a(a2);
        aVar.a(aVar3.a());
        aVar.a((com.google.android.gms.ads.c) new com.google.android.gms.ads.c() {
            public void onAdFailedToLoad(int i) {
            }
        });
        aVar.a().a(new e.a().a());
    }

    /* access modifiers changed from: private */
    public void showTwoOwnerDialog() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_two_owner);
        ((TextView) dialog.findViewById(R.id.text_dialog)).setText(this.globalMessage);
        final Button button = (Button) dialog.findViewById(R.id.btn_dialog);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                dialog.dismiss();
                V_Loading.this.finish();
            }
        });
        if (!this.vahanDataCame) {
            button.setVisibility(0);
        }
        ((Button) dialog.findViewById(R.id.view_details_dialog)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                V_Loading v_Loading = V_Loading.this;
                if (v_Loading.vahanDataCame) {
                    v_Loading.goVehicleResult(v_Loading.jobj11);
                    button.setVisibility(8);
                } else {
                    v_Loading.startActivity(new Intent(v_Loading, DeepSearch.class).putExtra("vNum", V_Loading.this.vregNo));
                }
                dialog.dismiss();
                V_Loading.this.finish();
            }
        });
        dialog.show();
    }

    /* access modifiers changed from: private */
    public String splitMyString(String str) {
        String str2;
        String[] split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split("\\s*,\\s*");
        Matcher matcher = Pattern.compile("^[^(]*").matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group());
            str2 = matcher.group();
            System.out.println(str2);
        } else {
            str2 = BuildConfig.FLAVOR;
        }
        if (split.length <= 1) {
            return str2;
        }
        return str2 + "\n" + split[0] + "\n" + split[1];
    }

    public void disableLoading() {
        finish();
    }

    @SuppressLint({"StaticFieldLeak"})
    public void function_searchData(String str, String str2) {
        MainActivity mainActivity = MainActivity.mObj;
        final String returnADIDCount = mainActivity != null ? mainActivity.returnADIDCount() : BuildConfig.FLAVOR;
        byte[] encode = Base64.encode(("reg1:" + str + "~reg2:" + str2).getBytes(), 0);
        String str3 = null;
        try {
            str3 = new String(encode, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        final String replaceAll = MainActivity.insertPeriodically(str3.replaceAll("\n", BuildConfig.FLAVOR), "a", 1).replaceAll("\n", BuildConfig.FLAVOR);
        new AsyncTask<Void, Integer, String>() {
            /* access modifiers changed from: protected */
            public String doInBackground(Void... voidArr) {
                E.a aVar = new E.a();
                aVar.a(30, TimeUnit.SECONDS);
                aVar.c(30, TimeUnit.SECONDS);
                aVar.b(90, TimeUnit.SECONDS);
                E a2 = aVar.a();
                A.a i = A.c(PreferenceManager.getDefaultSharedPreferences(V_Loading.this).getString("searchURL", BuildConfig.FLAVOR)).i();
                x.a aVar2 = new x.a();
                aVar2.a("cookie", replaceAll);
                aVar2.a("auth", returnADIDCount);
                x a3 = aVar2.a();
                H.a aVar3 = new H.a();
                aVar3.b(i.a().toString());
                aVar3.a((J) a3);
                try {
                    return a2.a(aVar3.a()).execute().a().t().toString();
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return BuildConfig.FLAVOR;
                }
            }

            /* access modifiers changed from: protected */
            public void onPostExecute(String str) {
                AnonymousClass2 r3;
                Intent intent;
                AnonymousClass2 r32;
                String str2 = str;
                super.onPostExecute(str);
                if (str2.contains("<status>")) {
                    String stringBetween = V_Loading.this.getStringBetween(str2, "<status>", "</status>", 8);
                    if (stringBetween.equals("SUCCESS")) {
                        String stringBetween2 = V_Loading.this.getStringBetween(str2, "<reg_no>", "</reg_no>", 8);
                        String stringBetween3 = V_Loading.this.getStringBetween(str2, "<owner_name>", "</owner_name>", 12);
                        String stringBetween4 = V_Loading.this.getStringBetween(str2, "<regn_dt>", "</regn_dt>", 9);
                        String stringBetween5 = V_Loading.this.getStringBetween(str2, "<maker>", "</maker>", 7);
                        String stringBetween6 = V_Loading.this.getStringBetween(str2, "<vh_class>", "</vh_class>", 10);
                        String stringBetween7 = V_Loading.this.getStringBetween(str2, "<fuel_type>", "</fuel_type>", 11);
                        String stringBetween8 = V_Loading.this.getStringBetween(str2, "<chasi_no>", "</chasi_no>", 10);
                        String stringBetween9 = V_Loading.this.getStringBetween(str2, "<engine_no>", "</engine_no>", 11);
                        String stringBetween10 = V_Loading.this.getStringBetween(str2, "<rto>", "</rto>", 5);
                        String stringBetween11 = V_Loading.this.getStringBetween(str2, "<vehicle_age>", "</vehicle_age>", 13);
                        String stringBetween12 = V_Loading.this.getStringBetween(str2, "<insUpto>", "</insUpto>", 9);
                        String stringBetween13 = V_Loading.this.getStringBetween(str2, "<state>", "</state>", 7);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("reg_no", stringBetween2);
                            jSONObject.put("reg_at", stringBetween10);
                            jSONObject.put("owner_name", stringBetween3);
                            jSONObject.put("reg_date", stringBetween4);
                            jSONObject.put("maker_model", stringBetween5);
                            jSONObject.put("vehicle_class", stringBetween6);
                            jSONObject.put("fuel_type", stringBetween7);
                            jSONObject.put("chasi_no", stringBetween8);
                            jSONObject.put("engine_no", stringBetween9);
                            jSONObject.put("vage", stringBetween11);
                            jSONObject.put("vinsurance", stringBetween12);
                            jSONObject.put("vfinance", BuildConfig.FLAVOR);
                            jSONObject.put("vstate", stringBetween13);
                            r32 = this;
                            try {
                                V_Loading.this.disableLoading();
                                V_Loading.this.goVehicleResult(jSONObject);
                                return;
                            } catch (Exception e2) {
                                e = e2;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            r32 = this;
                            V_Loading.this.disableLoading();
                            PrintStream printStream = System.out;
                            printStream.println("Exception : " + e);
                            return;
                        }
                    } else {
                        r3 = this;
                        if (stringBetween.equals("REJECT")) {
                            V_Loading.this.disableLoading();
                            intent = new Intent(V_Loading.this, V_NoRegistration.class);
                        } else {
                            return;
                        }
                    }
                } else {
                    r3 = this;
                    if (str2.contains("REJECT")) {
                        V_Loading.this.disableLoading();
                        intent = new Intent(V_Loading.this, V_NoRegistration.class);
                    } else {
                        V_Loading.this.getWithSms();
                        return;
                    }
                }
                V_Loading.this.startActivity(intent);
            }

            /* access modifiers changed from: protected */
            public void onPreExecute() {
                super.onPreExecute();
            }
        }.execute(new Void[0]);
    }

    public void getDetailsDirectly() {
        String vaccineSearch = VehicleInfoHandler.getInstance().getVaccineSearch();
        if (vaccineSearch == null) {
            return;
        }
        if (vaccineSearch.equals("parivahan")) {
            function_searchData(this.vehicleNum1, this.vehicleNum2);
        } else if (vaccineSearch.equals("novmparivahan")) {
            novmParivahanNew(this.vregNo);
        } else if (vaccineSearch.equals("mparivahan")) {
            mParivahanNew(this.vregNo);
        } else if (vaccineSearch.equals("scraping")) {
            GetDataAsync getDataAsync = new GetDataAsync();
            getDataAsync.execute(new String[]{this.vehicleNum1 + this.vehicleNum2});
        } else if (vaccineSearch.equals("web")) {
            startActivity(new Intent(this, WebActivity.class).putExtra("FIRST", this.vehicleNum1).putExtra("SECOND", this.vehicleNum2));
            finish();
        } else {
            vaccineSearch.equals("sms");
        }
    }

    public String getStringBetween(String str, String str2, String str3, int i) {
        return str.substring(str.indexOf(str2) + i, str.indexOf(str3));
    }

    public void getWithSms() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Caution...!");
        builder.setMessage("RTO Server is down. Please send SMS, Standard sms charges will apply.");
        builder.setPositiveButton(17039370, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                V_Loading.this.checkAndroidVersion();
                if (!V_Loading.this.isFinishing()) {
                    dialogInterface.cancel();
                    V_Loading.this.disableLoading();
                }
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (!V_Loading.this.isFinishing()) {
                    dialogInterface.cancel();
                    V_Loading.this.disableLoading();
                }
            }
        });
        builder.create();
        if (!isFinishing()) {
            builder.show();
        }
    }

    public void goVehicleResult(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("reg_no", jSONObject.getString("reg_no"));
            jSONObject2.put("reg_at", jSONObject.getString("reg_at"));
            jSONObject2.put("owner_name", jSONObject.getString("owner_name"));
            jSONObject2.put("reg_date", jSONObject.getString("reg_date"));
            jSONObject2.put("maker_model", jSONObject.getString("maker_model"));
            jSONObject2.put("vehicle_class", jSONObject.getString("vehicle_class"));
            jSONObject2.put("fuel_type", jSONObject.getString("fuel_type"));
            jSONObject2.put("chasi_no", jSONObject.getString("chasi_no"));
            jSONObject2.put("engine_no", jSONObject.getString("engine_no"));
            jSONObject2.put("vinsurance", jSONObject.getString("vinsurance"));
            jSONObject2.put("vfinance", jSONObject.getString("vfinance"));
        } catch (Exception e2) {
            PrintStream printStream = System.out;
            printStream.println("Exception : " + e2);
        }
        if (!isResultInRecentSearches(jSONObject2)) {
            DataHandler.getInstance().saveToRecentSearches(jSONObject2, this);
        }
        if (VehicleInfoHandler.getInstance().getStoreInDB() != null && VehicleInfoHandler.getInstance().getStoreInDB().equals("true")) {
            storeInDB(jSONObject2);
        }
        Intent intent = new Intent(this, V_DetailsActivity.class);
        intent.putExtra("jObj", jSONObject.toString());
        intent.putExtra("from", "search");
        if (getIntent().hasExtra("showFin") && getIntent().getStringExtra("showFin").equals("true")) {
            intent.putExtra("showFin", "true");
        }
        if (getIntent().hasExtra("showIns") && getIntent().getStringExtra("showIns").equals("true")) {
            intent.putExtra("showIns", "true");
        }
        startActivity(intent);
    }

    public boolean isResultInRecentSearches(JSONObject jSONObject) {
        JSONArray recentSearches = DataHandler.getInstance().getRecentSearches(this);
        for (int i = 0; i < recentSearches.length(); i++) {
            if (recentSearches != null) {
                try {
                    if (recentSearches.getJSONObject(i).getString("owner_name").equals(jSONObject.getString("owner_name"))) {
                        return true;
                    }
                } catch (Exception unused) {
                    System.out.println("Exception in recent searches");
                }
            }
        }
        return false;
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_v__loading);
        final String stringExtra = getIntent().getStringExtra("VNO");
        new Handler().postDelayed(new Runnable() {
            public void run() {
                V_Loading.this.performSearch(stringExtra);
            }
        }, (long) Integer.parseInt(PreferenceManager.getDefaultSharedPreferences(this).getString("deeku_loading_duration", BuildConfig.FLAVOR)));
    }

    public void performSearch(String str) {
        this.vregNo = str;
        try {
            String str2 = this.vregNo;
            this.vehicleNum2 = str2.toString().substring(5).replaceAll("[^0-9 ]", BuildConfig.FLAVOR);
            this.vehicleNum1 = str2.replace(this.vehicleNum2, BuildConfig.FLAVOR);
            getDetailsDirectly();
        } catch (Exception unused) {
            Toast.makeText(this, "Invalid number", 1);
        }
    }

    public void storeInDB(JSONObject jSONObject) {
        c.c.a.a.c cVar = new c.c.a.a.c();
        i iVar = new i();
        iVar.b("storeindb", "Yes");
        iVar.b("results", jSONObject.toString());
        cVar.a(VehicleInfoHandler.getInstance().getStoreInDBUrl(), iVar, (c.c.a.a.j) new c.c.a.a.e() {
            public void onFailure(int i, Throwable th, String str) {
                System.out.println(th.getMessage());
            }

            public void onSuccess(String str) {
                System.out.println(new String(str));
            }
        });
    }
}
