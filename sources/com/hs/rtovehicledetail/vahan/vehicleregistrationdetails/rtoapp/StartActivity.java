package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.app.o;
import c.b.b.b.g.C0471d;
import c.b.b.b.g.i;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.e.a;
import com.google.android.gms.ads.e.b;
import com.google.android.gms.ads.m;
import com.google.android.gms.ads.p;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.C3278c;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.remoteconfig.e;
import com.google.firebase.remoteconfig.l;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class StartActivity extends o {
    public static FirebaseAnalytics mFirebaseAnalytics;
    public static StartActivity sObj;
    boolean adLoaded;
    String clue;
    private Handler mHandler;
    m mInterstitialAd;
    int newAppVersion;
    e remoteConfig;
    String sURL;
    String sURL_celeb;
    private FirebaseAuth scanAuth;
    String showFullScreenAD;
    boolean timeFinished = false;

    private void anonymsLog() {
        this.scanAuth = FirebaseAuth.getInstance();
        if (this.scanAuth.a() != null) {
            fbData();
        } else {
            userSignIn();
        }
    }

    private void assignDefaultValues() {
        try {
            assignValuesRemote(new JSONObject("{\n            \"AdRotationBanner\" : \"false\",\n            \"BannerOnlyFB\" : \"true\",\n            \"BannerOnlyGoogle\" : \"false\",\n            \"ShowBanner\" : \"true\",\n            \"AdRotationPolicy\" : \"false\",\n            \"AdRotationPolicyNative\" : \"false\",\n            \"InterstitialOnlyFB\" : \"false\",\n            \"InterstitialOnlyGoogle\" : \"true\",\n            \"NativeOnlyFB\" : \"false\",\n            \"NativeOnlyGoogle\" : \"true\",\n            \"OurApps\" : {\n            \"ourApp1Link\" : \"https://play.google.com/store/apps/details?id=com.hangoverstudios.statusdp.whatsappstatussaver.saveit\",\n            \"ourApp1icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/icon/whatsapp_192.png\",\n            \"ourApp2Link\" : \"https://play.google.com/store/apps/details?id=com.hangoverstudios.extreme.games.dangerousroaddriving.monster.truck4x4.offroad.stunt.jeep\",\n            \"ourApp2icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/icon/4x4_offroad_192.png\",\n            \"ourApp3Link\" : \"https://play.google.com/store/apps/details?id=com.hangoverstudios.offroad.transport.truck.driving.offroadgames\",\n            \"ourApp3icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/icon/offroad-havey-truck_192.png\",\n            \"ourApp4Link\" : \"https://play.google.com/store/apps/details?id=com.Hangoverstudios.funlearn\",\n            \"ourApp4icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/icon/kids_192.png\",\n            \"ourApp5Link\" : \"https://play.google.com/store/apps/details?id=com.hangoverstudios.city.zoo.animal.transport.truck.driver.animal.transport.truck.driving.simulation\",\n            \"ourApp5icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/icon/animal_tra192.png\",\n            \"ourApp6Link\" : \"https://play.google.com/store/apps/details?id=com.hangoverstudios.finddifference.findimagedifferences.differencegame\",\n            \"ourApp6icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/icon/find_img_192x192.png\",\n            \"ourApp7Link\" : \"https://play.google.com/store/apps/details?id=com.hangoverstudios.city.coach.bus.simulator.driving\",\n            \"ourApp7icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/icon/BUS-icon_192x192.png\",\n            \"ourApp8Link\" : \"https://play.google.com/store/apps/details?id=com.Hangoverstudios.babyphoneforkids\",\n            \"ourApp8icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/icon/fun_192.png\",\n            \"ourApp9Link\" : \"https://play.google.com/store/apps/details?id=com.hangoverstudios.statusdp.whatsappstatussaver.saveit\",\n            \"ourApp9icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/icon/whatsapp_192.png\"\n            },\n            \"OurAppsInterstitial\" : {\n            \"ourApp1Link\" : \"https://play.google.com/store/apps/details?id=com.rto.driving.licence.test.simulator.car.parking\",\n            \"ourApp1icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/interstitial/rtogame.png\",\n            \"ourApp2Link\" : \"https://play.google.com/store/apps/details?id=com.hangoverstudios.extreme.games.dangerousroaddriving.monster.truck4x4.offroad.stunt.jeep\",\n            \"ourApp2icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/interstitial/27.png\",\n            \"ourApp3Link\" : \"https://play.google.com/store/apps/details?id=com.hangoverstudios.offroad.transport.truck.driving.offroadgames\",\n            \"ourApp3icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/interstitial/28.png\",\n            \"ourApp4Link\" : \"https://play.google.com/store/apps/details?id=com.hangoverstudios.finddifference.findimagedifferences.differencegame\",\n            \"ourApp4icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/interstitial/25.png\",\n            \"ourApp5Link\" : \"https://play.google.com/store/apps/details?id=com.hangoverstudios.city.zoo.animal.transport.truck.driver.animal.transport.truck.driving.simulation\",\n            \"ourApp5icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/interstitial/29.png\",\n            \"ourApp6Link\" : \"https://play.google.com/store/apps/details?id=com.hangoverstudios.city.coach.bus.simulator.driving\",\n            \"ourApp6icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/interstitial/30.png\",\n            \"ourApp7Link\" : \"https://play.google.com/store/apps/details?id=com.hangoverstudios.kidspuzzle\",\n            \"ourApp7icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/interstitial/31.png\",\n            \"ourApp8Link\" : \"https://play.google.com/store/apps/details?id=com.Hangoverstudios.funlearn\",\n            \"ourApp8icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/interstitial/12.png\",\n            \"ourApp9Link\" : \"https://play.google.com/store/apps/details?id=com.hangoverstudios.statusdp.whatsappstatussaver.saveit\",\n            \"ourApp9icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/interstitial/24.png\"\n            },\n            \"OurAppsSlides\" : {\n            \"ourApp1Link\" : \"https://play.google.com/store/apps/details?id=com.rto.driving.licence.test.simulator.car.parking\",\n            \"ourApp1icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/slides/rtogame.png\",\n            \"ourApp2Link\" : \"https://play.google.com/store/apps/details?id=com.hangoverstudios.extreme.games.dangerousroaddriving.monster.truck4x4.offroad.stunt.jeep\",\n            \"ourApp2icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/slides/a24.png\",\n            \"ourApp3Link\" : \"https://play.google.com/store/apps/details?id=com.hangoverstudios.offroad.transport.truck.driving.offroadgames\",\n            \"ourApp3icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/slides/a25.png\",\n            \"ourApp4Link\" : \"https://play.google.com/store/apps/details?id=com.Hangoverstudios.funlearn\",\n            \"ourApp4icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/slides/a14.png\",\n            \"ourApp5Link\" : \"https://play.google.com/store/apps/details?id=com.hangoverstudios.finddifference.findimagedifferences.differencegame\",\n            \"ourApp5icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/slides/a22.png\",\n            \"ourApp6Link\" : \"https://play.google.com/store/apps/details?id=com.hangoverstudios.city.coach.bus.simulator.driving\",\n            \"ourApp6icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/slides/a26.png\",\n            \"ourApp7Link\" : \"https://play.google.com/store/apps/details?id=com.hangoverstudios.city.zoo.animal.transport.truck.driver.animal.transport.truck.driving.simulation\",\n            \"ourApp7icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/slides/a27.png\",\n            \"ourApp8Link\" : \"https://play.google.com/store/apps/details?id=com.hangoverstudios.statusdp.whatsappstatussaver.saveit\",\n            \"ourApp8icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/slides/a21.png\",\n            \"ourApp9Link\" : \"https://play.google.com/store/apps/details?id=com.hangoverstudios.offroad.transport.truck.driving.offroadgames\",\n            \"ourApp9icon\" : \"https://raw.githubusercontent.com/Samarasa/appicons/master/images/gadi/slides/a25.png\"\n            },\n            \"api_dl_test\" : \"\",\n            \"api_rto_brand\" : \"\",\n            \"api_rto_celebrity\" : \"\",\n            \"api_rto_codes\" : \"\",\n            \"api_rto_models\" : \"\",\n            \"api_rto_signals\" : \"\",\n            \"api_rto_variants\" : \"\",\n            \"api_rto_variants_fet\" : \"\",\n            \"celebrity_url\" : \"\",\n            \"customRating\" : \"true\",\n            \"deeku_clue_key\" : \"CodeRed\",\n            \"deeku_enableCelebVehicles\" : \"true\",\n            \"deeku_enableLicenseTest\" : \"true\",\n            \"deeku_enableNews\" : \"true\",\n            \"deeku_enableVehiclePrices\" : \"true\",\n            \"deeku_loading_duration\" : \"1000\",\n            \"deeku_newSearchUrl\" : \",\n            \"deeku_newsearch\" : \"scraping\",\n            \"deeku_rto_signals\" : \"\",\n            \"deeku_search\" : \"parivahan\",\n            \"deeku_searchTexts\" : \"scraping, mparivahan, parivahan, web, sms\",\n            \"deeku_search_url\" : \"\",\n            \"deeku_showInterstitialAd\" : \"true\",\n            \"deeku_showInterstitialOnLaunch\" : \"true\",\n            \"deeku_showNativeAd\" : \"true\",\n            \"deeku_showNativeAdOnMainScreen\" : \"true\",\n            \"deeku_showOurAppIcons\" : \"false\",\n            \"deeku_showOurAppInterstitials\" : \"true\",\n            \"deeku_showOurAppSlides\" : \"true\",\n            \"deeku_show_celeb_cars\" : \"true\",\n            \"deeku_states_url\" : \"\",\n            \"deeku_upgrade_appMessage\" : \"Improved quality, please update the app\",\n            \"deeku_upgrade_appVersion\" : \"1\",\n            \"deeku_vahanMobileNo\" : 7738299899,\n            \"deeku_vahanText\" : \"VAHAN \",\n            \"deeku_variant_features\" : \"\",\n            \"deeku_variants\" : \"\",\n            \"deeku_vehicleNotFound\" : \"Please send your vehicle number to us using CONTACT button, we will verify and get back to you as soon as possible.\",\n            \"deeku_vehicleSearchAP\" : \"\",\n            \"deeku_vehicleSearchTS\" : \"\",\n            \"deeku_webViewURL\" : \"\",\n            \"showInterstitialOnLaunchFBAd\" : \"false\",\n            \"ScrapingBean\":{\n            \"vregNoId\":2,\n            \"vownerId\":32,\n            \"old_vownerId\":10,\n            \"vregDateId\":12,\n            \"vmodelId\":7,\n            \"vclassId\":4,\n            \"vtypeId\":5,\n            \"vchasisId\":15,\n            \"vengineId\":17,\n            \"vinsuranceId\":26\n            },\n            \"covidSearch\": \"\",\n            \"showEChallan\": \"\",\n            \"eChallanRC\": \"\",\n            \"eChallanDL\": \"\",\n            \"showResale\": \"\",\n            \"resaleSelection\": \"\",\n            \"resaleValue\": \"\",\n            \"obvheader\": \"\",\n            \"VahanScraping\":\"\",\n            \"VScrapingUrl\":\"\",\n            \"VScrapingKeys\":\"\",\n            \"VScrapingCookies\":\"\",\n            \"keyOurServer\":\"false\",\n            \"keyOurServerURL\":\"\",\n            \"mparivahanSalt\" : \"\",\n            \"mparivahanURL\" : \"\",\n            \"storeInDB\": \"true\",\n            \"vaccineSearch\": \"novmparivahan\",\n            \"vaccineUrl\": \"\",\n            \"vaccineParam\": \"\",\n            \"storeInDBUrl\": \"\"\n            }"), "local");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public void assignValuesRemote(JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = jSONObject;
        String str2 = "ourApp7Link";
        String str3 = "ourApp6icon";
        try {
            String str4 = "ourApp6Link";
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this).edit();
            String str5 = "ourApp5icon";
            String str6 = "ourApp5Link";
            edit.putString("celebsearchURL", jSONObject2.getString("celebrity_url")).apply();
            edit.putString("searchURL", jSONObject2.getString("deeku_search_url")).apply();
            this.sURL = jSONObject2.getString("deeku_search_url");
            edit.putString("clue", jSONObject2.getString("deeku_clue_key")).apply();
            this.clue = jSONObject2.getString("deeku_clue_key");
            edit.putString("showFullScreenAD", jSONObject2.getString("deeku_showInterstitialAd")).apply();
            this.showFullScreenAD = jSONObject2.getString("deeku_showInterstitialAd");
            edit.putString("showNativeAD", jSONObject2.getString("deeku_showNativeAd")).apply();
            edit.putString("api_dl_test", jSONObject2.getString("api_dl_test")).apply();
            edit.putString("api_rto_celebrity", jSONObject2.getString("api_rto_celebrity")).apply();
            edit.putString("api_rto_codes", jSONObject2.getString("api_rto_codes")).apply();
            edit.putString("api_rto_signals", jSONObject2.getString("api_rto_signals")).apply();
            edit.putString("api_rto_brand", jSONObject2.getString("api_rto_brand")).apply();
            edit.putString("api_rto_models", jSONObject2.getString("api_rto_models")).apply();
            edit.putString("api_rto_variants", jSONObject2.getString("api_rto_variants")).apply();
            edit.putString("api_rto_variants_fet", jSONObject2.getString("api_rto_variants_fet")).apply();
            edit.putString("deeku_showOurAppIcons", jSONObject2.getString("deeku_showOurAppIcons")).apply();
            edit.putString("deeku_showOurAppSlides", jSONObject2.getString("deeku_showOurAppSlides")).apply();
            edit.putString("deeku_showOurAppInterstitials", jSONObject2.getString("deeku_showOurAppInterstitials")).apply();
            edit.putString("deeku_loading_duration", jSONObject2.getString("deeku_loading_duration")).apply();
            edit.putString("showInterstitialOnLaunch", jSONObject2.getString("deeku_showInterstitialOnLaunch")).apply();
            edit.putString("showNativeAdOnMainScreen", jSONObject2.getString("deeku_showNativeAdOnMainScreen")).apply();
            edit.putString("deeku_enableLicenseTest", jSONObject2.getString("deeku_enableLicenseTest")).apply();
            edit.putString("deeku_enableVehiclePrices", jSONObject2.getString("deeku_enableVehiclePrices")).apply();
            edit.putString("AdRotationPolicy", jSONObject2.getString("AdRotationPolicy")).apply();
            if (jSONObject2.getString("AdRotationPolicy").equals("true")) {
                VehicleInfoHandler.getInstance().setFb_interstitial(true);
            } else {
                VehicleInfoHandler.getInstance().setFb_interstitial(false);
            }
            edit.putString("deeku_newsearch", jSONObject2.getString("deeku_newsearch")).apply();
            edit.putString("deeku_webViewURL", jSONObject2.getString("deeku_webViewURL")).apply();
            edit.putString("deeku_vahanMobileNo", jSONObject2.getString("deeku_vahanMobileNo")).apply();
            edit.putString("customRating", jSONObject2.getString("customRating")).apply();
            edit.putString("AdRotationPolicyNative", jSONObject2.getString("AdRotationPolicyNative")).apply();
            if (jSONObject2.getString("AdRotationPolicyNative").equals("true")) {
                VehicleInfoHandler.getInstance().setFb_native(true);
            } else {
                VehicleInfoHandler.getInstance().setFb_native(false);
            }
            edit.putString("AdRotationBanner", jSONObject2.getString("AdRotationBanner")).apply();
            edit.putString("BannerOnlyFB", jSONObject2.getString("BannerOnlyFB")).apply();
            edit.putString("BannerOnlyGoogle", jSONObject2.getString("BannerOnlyGoogle")).apply();
            edit.putString("ShowBanner", jSONObject2.getString("ShowBanner")).apply();
            edit.putString("InterstitialOnlyFB", jSONObject2.getString("InterstitialOnlyFB")).apply();
            edit.putString("InterstitialOnlyGoogle", jSONObject2.getString("InterstitialOnlyGoogle")).apply();
            edit.putString("NativeOnlyFB", jSONObject2.getString("NativeOnlyFB")).apply();
            edit.putString("NativeOnlyGoogle", jSONObject2.getString("NativeOnlyGoogle")).apply();
            edit.putString("showInteOnLaunchFB", jSONObject2.getString("showInterstitialOnLaunchFBAd")).apply();
            this.newAppVersion = Integer.parseInt(jSONObject2.getString("deeku_upgrade_appVersion"));
            JSONObject jSONObject3 = new JSONObject(jSONObject2.getString("OurAppsInterstitial"));
            VehicleInfoHandler.getInstance().setOurApp1LinkIn(jSONObject3.getString("ourApp1Link"));
            VehicleInfoHandler.getInstance().setOurApp1iconIn(jSONObject3.getString("ourApp1icon"));
            VehicleInfoHandler.getInstance().setOurApp2LinkIn(jSONObject3.getString("ourApp2Link"));
            VehicleInfoHandler.getInstance().setOurApp2iconIn(jSONObject3.getString("ourApp2icon"));
            VehicleInfoHandler.getInstance().setOurApp3LinkIn(jSONObject3.getString("ourApp3Link"));
            VehicleInfoHandler.getInstance().setOurApp3iconIn(jSONObject3.getString("ourApp3icon"));
            VehicleInfoHandler.getInstance().setOurApp4LinkIn(jSONObject3.getString("ourApp4Link"));
            VehicleInfoHandler.getInstance().setOurApp4iconIn(jSONObject3.getString("ourApp4icon"));
            String str7 = str6;
            VehicleInfoHandler.getInstance().setOurApp5LinkIn(jSONObject3.getString(str7));
            String str8 = str5;
            VehicleInfoHandler.getInstance().setOurApp5iconIn(jSONObject3.getString(str8));
            String str9 = str4;
            VehicleInfoHandler.getInstance().setOurApp6LinkIn(jSONObject3.getString(str9));
            String str10 = str9;
            String str11 = str3;
            VehicleInfoHandler.getInstance().setOurApp6iconIn(jSONObject3.getString(str11));
            String str12 = str2;
            String str13 = str11;
            VehicleInfoHandler.getInstance().setOurApp7LinkIn(jSONObject3.getString(str12));
            VehicleInfoHandler.getInstance().setOurApp7iconIn(jSONObject3.getString("ourApp7icon"));
            VehicleInfoHandler.getInstance().setOurApp8LinkIn(jSONObject3.getString("ourApp8Link"));
            VehicleInfoHandler.getInstance().setOurApp8iconIn(jSONObject3.getString("ourApp8icon"));
            VehicleInfoHandler.getInstance().setOurApp9LinkIn(jSONObject3.getString("ourApp9Link"));
            VehicleInfoHandler.getInstance().setOurApp9iconIn(jSONObject3.getString("ourApp9icon"));
            JSONObject jSONObject4 = new JSONObject(jSONObject2.getString("OurApps"));
            VehicleInfoHandler.getInstance().setOurApp1Link(jSONObject4.getString("ourApp1Link"));
            VehicleInfoHandler.getInstance().setOurApp1icon(jSONObject4.getString("ourApp1icon"));
            VehicleInfoHandler.getInstance().setOurApp2Link(jSONObject4.getString("ourApp2Link"));
            VehicleInfoHandler.getInstance().setOurApp2icon(jSONObject4.getString("ourApp2icon"));
            VehicleInfoHandler.getInstance().setOurApp3Link(jSONObject4.getString("ourApp3Link"));
            VehicleInfoHandler.getInstance().setOurApp3icon(jSONObject4.getString("ourApp3icon"));
            VehicleInfoHandler.getInstance().setOurApp4Link(jSONObject4.getString("ourApp4Link"));
            VehicleInfoHandler.getInstance().setOurApp4icon(jSONObject4.getString("ourApp4icon"));
            VehicleInfoHandler.getInstance().setOurApp5Link(jSONObject4.getString(str7));
            VehicleInfoHandler.getInstance().setOurApp5icon(jSONObject4.getString(str8));
            String str14 = str8;
            String str15 = str10;
            VehicleInfoHandler.getInstance().setOurApp6Link(jSONObject4.getString(str15));
            String str16 = str13;
            VehicleInfoHandler.getInstance().setOurApp6icon(jSONObject4.getString(str16));
            VehicleInfoHandler.getInstance().setOurApp7Link(jSONObject4.getString(str12));
            VehicleInfoHandler.getInstance().setOurApp7icon(jSONObject4.getString("ourApp7icon"));
            VehicleInfoHandler.getInstance().setOurApp8Link(jSONObject4.getString("ourApp8Link"));
            VehicleInfoHandler.getInstance().setOurApp8icon(jSONObject4.getString("ourApp8icon"));
            VehicleInfoHandler.getInstance().setOurApp9Link(jSONObject4.getString("ourApp9Link"));
            VehicleInfoHandler.getInstance().setOurApp9icon(jSONObject4.getString("ourApp9icon"));
            JSONObject jSONObject5 = new JSONObject(jSONObject2.getString("OurAppsSlides"));
            VehicleInfoHandler.getInstance().setOurApp1LinkSlide(jSONObject5.getString("ourApp1Link"));
            VehicleInfoHandler.getInstance().setOurApp1iconSlide(jSONObject5.getString("ourApp1icon"));
            VehicleInfoHandler.getInstance().setOurApp2LinkSlide(jSONObject5.getString("ourApp2Link"));
            VehicleInfoHandler.getInstance().setOurApp2iconSlide(jSONObject5.getString("ourApp2icon"));
            VehicleInfoHandler.getInstance().setOurApp3LinkSlide(jSONObject5.getString("ourApp3Link"));
            VehicleInfoHandler.getInstance().setOurApp3iconSlide(jSONObject5.getString("ourApp3icon"));
            VehicleInfoHandler.getInstance().setOurApp4LinkSlide(jSONObject5.getString("ourApp4Link"));
            VehicleInfoHandler.getInstance().setOurApp4iconSlide(jSONObject5.getString("ourApp4icon"));
            VehicleInfoHandler.getInstance().setOurApp5LinkSlide(jSONObject5.getString(str7));
            VehicleInfoHandler.getInstance().setOurApp5iconSlide(jSONObject5.getString(str14));
            VehicleInfoHandler.getInstance().setOurApp6LinkSlide(jSONObject5.getString(str15));
            VehicleInfoHandler.getInstance().setOurApp6iconSlide(jSONObject5.getString(str16));
            VehicleInfoHandler.getInstance().setOurApp7LinkSlide(jSONObject5.getString(str12));
            VehicleInfoHandler.getInstance().setOurApp7iconSlide(jSONObject5.getString("ourApp7icon"));
            VehicleInfoHandler.getInstance().setOurApp8LinkSlide(jSONObject5.getString("ourApp8Link"));
            VehicleInfoHandler.getInstance().setOurApp8iconSlide(jSONObject5.getString("ourApp8icon"));
            VehicleInfoHandler.getInstance().setOurApp9LinkSlide(jSONObject5.getString("ourApp9Link"));
            VehicleInfoHandler.getInstance().setOurApp9iconSlide(jSONObject5.getString("ourApp9icon"));
            JSONObject jSONObject6 = new JSONObject(jSONObject2.getString("ScrapingBean"));
            VehicleInfoHandler.getInstance().setVregNoId(jSONObject6.getInt("vregNoId"));
            VehicleInfoHandler.getInstance().setVownerId(jSONObject6.getInt("vownerId"));
            VehicleInfoHandler.getInstance().setOld_vownerId(jSONObject6.getInt("old_vownerId"));
            VehicleInfoHandler.getInstance().setVregDateId(jSONObject6.getInt("vregDateId"));
            VehicleInfoHandler.getInstance().setVmodelId(jSONObject6.getInt("vmodelId"));
            VehicleInfoHandler.getInstance().setVclassId(jSONObject6.getInt("vclassId"));
            VehicleInfoHandler.getInstance().setVtypeId(jSONObject6.getInt("vtypeId"));
            VehicleInfoHandler.getInstance().setVchasisId(jSONObject6.getInt("vchasisId"));
            VehicleInfoHandler.getInstance().setVengineId(jSONObject6.getInt("vengineId"));
            VehicleInfoHandler.getInstance().setVinsuranceId(jSONObject6.getInt("vinsuranceId"));
            VehicleInfoHandler.getInstance().setCovidSearch(jSONObject2.getString("covidSearch"));
            VehicleInfoHandler.getInstance().setShowEChallan(jSONObject2.getString("showEChallan"));
            VehicleInfoHandler.getInstance().seteChallanRC(jSONObject2.getString("eChallanRC"));
            VehicleInfoHandler.getInstance().seteChallanDL(jSONObject2.getString("eChallanDL"));
            VehicleInfoHandler.getInstance().setShowResale(jSONObject2.getString("showResale"));
            VehicleInfoHandler.getInstance().setResaleSelection(jSONObject2.getString("resaleSelection"));
            VehicleInfoHandler.getInstance().setResaleValue(jSONObject2.getString("resaleValue"));
            VehicleInfoHandler.getInstance().setObvheader(jSONObject2.getString("obvheader"));
            VehicleInfoHandler.getInstance().setVahanScraping(jSONObject2.getString("VahanScraping"));
            VehicleInfoHandler.getInstance().setVScrapingUrl(jSONObject2.getString("VScrapingUrl"));
            VehicleInfoHandler.getInstance().setVScrapingKeys(jSONObject2.getString("VScrapingKeys"));
            VehicleInfoHandler.getInstance().setVScrapingCookies(jSONObject2.getString("VScrapingCookies"));
            VehicleInfoHandler.getInstance().setKeyOurServer(jSONObject2.getString("keyOurServer"));
            VehicleInfoHandler.getInstance().setKeyOurServerURL(jSONObject2.getString("keyOurServerURL"));
            VehicleInfoHandler.getInstance().setMparivahanLockSalt(jSONObject2.getString("mparivahanSalt"));
            VehicleInfoHandler.getInstance().setMparivahanURL(jSONObject2.getString("mparivahanURL"));
            VehicleInfoHandler.getInstance().setStoreInDB(jSONObject2.getString("storeInDB"));
            VehicleInfoHandler.getInstance().setStoreInDBUrl(jSONObject2.getString("storeInDBUrl"));
            VehicleInfoHandler.getInstance().setVaccineSearch(jSONObject2.getString("vaccineSearch"));
            VehicleInfoHandler.getInstance().setVaccineUrl(jSONObject2.getString("vaccineUrl"));
            VehicleInfoHandler.getInstance().setVaccineParam(jSONObject2.getString("vaccineParam"));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public void checkDataArrive() {
        if (!this.timeFinished || !this.adLoaded) {
            if (!isConnectedToInternet()) {
                Toast.makeText(this, "Check internet connection!", 0).show();
            }
            reCallForData();
            return;
        }
        checkForUpdaes();
    }

    private void checkForUpdaes() {
        startActivity(25 >= this.newAppVersion ? new Intent(this, MainActivity.class) : new Intent(this, UpdateActivity.class));
        finish();
    }

    /* access modifiers changed from: private */
    public void fbData() {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                StartActivity startActivity = StartActivity.this;
                if (!startActivity.timeFinished) {
                    startActivity.timeFinished = true;
                }
            }
        }, 10000);
        if (isConnectedToInternet()) {
            this.remoteConfig = e.b();
            l.a aVar = new l.a();
            aVar.a(43200);
            this.remoteConfig.a(aVar.a());
            this.remoteConfig.a((int) R.xml.remote_config_defaults);
            this.remoteConfig.a(43200).a(new C0471d<Void>() {
                public void onComplete(i<Void> iVar) {
                    if (iVar.e()) {
                        StartActivity.this.remoteConfig.a();
                        try {
                            StartActivity.this.assignValuesRemote(new JSONObject(StartActivity.this.remoteConfig.a("remote_config")), "remote");
                            StartActivity.this.checkDataArrive();
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                    } else {
                        System.out.println("fail");
                    }
                }
            });
        } else {
            Toast.makeText(this, "No Internet connection.", 0).show();
        }
        this.mHandler = new Handler();
        this.mHandler.postDelayed(new Runnable() {
            public void run() {
                StartActivity startActivity = StartActivity.this;
                if (!startActivity.adLoaded) {
                    startActivity.adLoaded = true;
                }
            }
        }, 10000);
    }

    private void reCallForData() {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                if (StartActivity.this.isConnectedToInternet()) {
                    StartActivity.this.checkDataArrive();
                } else {
                    Toast.makeText(StartActivity.this, "No Internet connection.", 0).show();
                }
            }
        }, 3000);
    }

    private void userSignIn() {
        this.scanAuth.b().a((Activity) this, new C0471d<C3278c>() {
            public void onComplete(i<C3278c> iVar) {
                if (iVar.e()) {
                    StartActivity.this.fbData();
                } else {
                    Toast.makeText(StartActivity.this, "Authentication failed.", 0).show();
                }
            }
        });
    }

    public boolean isConnectedToInternet() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        try {
            return connectivityManager.getNetworkInfo(0).getState() == NetworkInfo.State.CONNECTED || connectivityManager.getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTED;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public void loadMyInterstitial() {
        this.mInterstitialAd = new m(this);
        this.mInterstitialAd.a(getString(R.string.admob_interstitial_id));
        requestNewInterstitial();
        this.mInterstitialAd.a((c) new c() {
            public void onAdClosed() {
                StartActivity.this.requestNewInterstitial();
            }

            public void onAdFailedToLoad(int i) {
                StartActivity startActivity = StartActivity.this;
                if (!startActivity.adLoaded) {
                    startActivity.adLoaded = true;
                }
                super.onAdFailedToLoad(i);
            }

            public void onAdLeftApplication() {
            }

            public void onAdLoaded() {
                System.out.println("loadAd");
                StartActivity startActivity = StartActivity.this;
                if (!startActivity.adLoaded) {
                    startActivity.adLoaded = true;
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_start);
        sObj = this;
        getWindow().setFlags(1024, 1024);
        if (isConnectedToInternet()) {
            mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
            p.a(this, new com.google.android.gms.ads.e.c() {
                public void onInitializationComplete(b bVar) {
                    Map<String, a> a2 = bVar.a();
                    for (String next : a2.keySet()) {
                        a aVar = a2.get(next);
                        Log.d("MyApp", String.format("Adapter name: %s, Description: %s, Latency: %d", new Object[]{next, aVar.Q(), Integer.valueOf(aVar.R())}));
                    }
                }
            });
            c.b.d.e.a((Context) this);
            assignDefaultValues();
            anonymsLog();
            loadMyInterstitial();
            return;
        }
        Toast.makeText(this, "No Internet connection.", 0).show();
    }

    public void requestNewInterstitial() {
        com.google.android.gms.ads.e a2 = new e.a().a();
        m mVar = this.mInterstitialAd;
        if (mVar != null) {
            mVar.a(a2);
        }
    }
}
