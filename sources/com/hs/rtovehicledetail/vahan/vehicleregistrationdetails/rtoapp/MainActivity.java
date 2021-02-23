package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.app.C0096c;
import androidx.appcompat.app.o;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.C0159i;
import androidx.recyclerview.widget.C0185k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.a.a.k;
import c.c.a.a.c;
import c.c.a.a.e;
import c.c.a.a.i;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.formats.c;
import com.google.android.gms.ads.formats.j;
import com.google.android.gms.ads.h;
import com.google.android.gms.ads.m;
import com.google.android.gms.ads.w;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.navigation.NavigationView;
import g.A;
import g.E;
import g.H;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends o implements NavigationView.a, View.OnClickListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String DATA = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static Random RANDOM = new Random();
    static String celebCars;
    public static MainActivity mObj;
    private FrameLayout adContainerView;
    LinearLayout adView;
    private h adViewbanner;
    LinearLayout add_useful_class;
    LinearLayout bike_p;
    LinearLayout car_p;
    LinearLayout cautionSign;
    TextView celebCarFour;
    TextView celebCarOne;
    TextView celebCarThree;
    TextView celebCarTwo;
    CardView celebCard;
    LinearLayout celeb_four;
    LinearLayout celeb_more;
    TextView celeb_more1;
    LinearLayout celeb_one;
    LinearLayout celeb_three;
    LinearLayout celeb_two;
    CardView challan_card;
    LinearLayout challan_se;
    LinearLayout dlTest;
    LinearLayout dupTrade;
    LinearLayout dup_useful_dl;
    private ImageView eightImg;
    ImageView expand_menu;
    LinearLayout fancy;
    LinearLayout fb_banner_container_main;
    LinearLayout fin_details;
    private ImageView fiveImg;
    private ImageView fourImg;
    LinearLayout goto_search;
    LinearLayout hpEndorse;
    LinearLayout informatorySign;
    LinearLayout ins_details;
    LinearLayout international_useful_driving_permit;
    LinearLayout learner_useful_dl;
    LinearLayout license_useful_related_fees;
    LinearLayout mandatorySign;
    LinearLayout more_useful_rc;
    /* access modifiers changed from: private */
    public j nativeAd;
    NewsAdapter newsAdapter;
    List<NewsBean> newsBean = new ArrayList();
    CardView newsCard;
    RecyclerView newsRecycler;
    private ImageView nineImg;
    LinearLayout noObjection;
    private ImageView oneImg;
    LinearLayout ourAppsMain;
    LinearLayout permanent_useful_dl;
    LinearLayout reassign;
    LinearLayout renewable_useful_dl;
    LinearLayout resale_val;
    CardView rto_codes_card;
    TextView rtocodes_more2;
    LinearLayout scooty_p;
    private ImageView sevenImg;
    private ImageView sixImg;
    LinearLayout stateFour;
    LinearLayout stateMore;
    LinearLayout stateOne;
    LinearLayout stateThree;
    LinearLayout stateTwo;
    private ImageView threeImg;
    LinearLayout trafficSign;
    private ImageView twoImg;
    CardView vehicle_prices;

    public static byte[] encodE(String str) {
        return Base64.encode(str.getBytes(), 0);
    }

    private void getCarDeatils(int i) {
        try {
            JSONObject jSONObject = new JSONObject(celebCars);
            if (jSONObject.length() > 0) {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    if (i2 == i) {
                        JSONObject jSONObject2 = (JSONObject) jSONArray.get(i2);
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("info");
                        if (jSONArray2.length() > 0) {
                            JSONObject jSONObject3 = jSONArray2.getJSONObject(0);
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("reg_no", jSONObject3.getString("registration_no"));
                            jSONObject4.put("reg_at", jSONObject3.getString("registering_authority"));
                            jSONObject4.put("owner_name", jSONObject2.getString("owner_name"));
                            jSONObject4.put("reg_date", jSONObject3.getString("registration_date"));
                            jSONObject4.put("maker_model", jSONObject3.getString("maker_model"));
                            jSONObject4.put("vehicle_class", jSONObject3.getString("vehicle_class"));
                            jSONObject4.put("fuel_type", jSONObject3.getString("fuel_type"));
                            jSONObject4.put("chasi_no", "Not Available");
                            jSONObject4.put("engine_no", "Not Available");
                            jSONObject4.put("vinsurance", "Not Available");
                            startActivity(new Intent(this, V_DetailsActivity.class).putExtra("jObj", jSONObject4.toString()).putExtra("type", "celebRC"));
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            System.out.println(BuildConfig.FLAVOR);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private void getCelebrityCars() {
        MainActivity mainActivity = mObj;
        final String returnADIDCount = mainActivity != null ? mainActivity.returnADIDCount() : BuildConfig.FLAVOR;
        new AsyncTask<Void, Integer, String>() {
            /* access modifiers changed from: protected */
            public String doInBackground(Void... voidArr) {
                E.a aVar = new E.a();
                aVar.a(30, TimeUnit.SECONDS);
                aVar.c(30, TimeUnit.SECONDS);
                aVar.b(90, TimeUnit.SECONDS);
                E a2 = aVar.a();
                A.a i = A.c(PreferenceManager.getDefaultSharedPreferences(MainActivity.this).getString("api_rto_celebrity", BuildConfig.FLAVOR)).i();
                i.a("auth", returnADIDCount);
                H.a aVar2 = new H.a();
                aVar2.b(i.a().toString());
                try {
                    return a2.a(aVar2.a()).execute().a().t().toString();
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return BuildConfig.FLAVOR;
                }
            }

            /* access modifiers changed from: protected */
            public void onPostExecute(String str) {
                TextView textView;
                String string;
                super.onPostExecute(str);
                try {
                    JSONObject jSONObject = new JSONObject(new String(str));
                    if (jSONObject.getString("status").equals("1")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("trendingCategoriesList");
                        MainActivity.celebCars = jSONObject2.toString();
                        JSONArray jSONArray = jSONObject2.getJSONArray("data");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject3 = (JSONObject) jSONArray.get(i);
                            if (i != 0) {
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            break;
                                        }
                                        textView = MainActivity.this.celebCarFour;
                                        string = jSONObject3.getString("owner_name");
                                    } else {
                                        textView = MainActivity.this.celebCarThree;
                                        string = jSONObject3.getString("owner_name");
                                    }
                                } else {
                                    textView = MainActivity.this.celebCarTwo;
                                    string = jSONObject3.getString("owner_name");
                                }
                            } else {
                                textView = MainActivity.this.celebCarOne;
                                string = jSONObject3.getString("owner_name");
                            }
                            textView.setText(string);
                        }
                        MainActivity.this.celebCard.setVisibility(0);
                    }
                } catch (Exception e2) {
                    PrintStream printStream = System.out;
                    printStream.println("e" + e2);
                }
            }

            /* access modifiers changed from: protected */
            public void onPreExecute() {
                super.onPreExecute();
            }
        }.execute(new Void[0]);
    }

    private void getNews() {
        MainActivity mainActivity = mObj;
        final String returnADIDCount = mainActivity != null ? mainActivity.returnADIDCount() : BuildConfig.FLAVOR;
        new AsyncTask<Void, Integer, String>() {
            /* access modifiers changed from: protected */
            public String doInBackground(Void... voidArr) {
                E.a aVar = new E.a();
                aVar.a(30, TimeUnit.SECONDS);
                aVar.c(30, TimeUnit.SECONDS);
                aVar.b(90, TimeUnit.SECONDS);
                E a2 = aVar.a();
                A.a i = A.c("http://spreadthequote.com/news-application/get-articles/3").i();
                i.a("auth", returnADIDCount);
                H.a aVar2 = new H.a();
                aVar2.b(i.a().toString());
                try {
                    return a2.a(aVar2.a()).execute().a().t().toString();
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return BuildConfig.FLAVOR;
                }
            }

            /* access modifiers changed from: protected */
            public void onPostExecute(String str) {
                super.onPostExecute(str);
                try {
                    JSONObject jSONObject = new JSONObject(new String(str));
                    if (jSONObject.getString("status").equals("1")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("data");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            MainActivity.this.newsBean.add(new NewsBean(jSONObject2.getString("title"), jSONObject2.getString("id"), jSONObject2.getString("image"), jSONObject2.getString("content")));
                        }
                        MainActivity.this.newsAdapter = new NewsAdapter(MainActivity.this.newsBean, MainActivity.this);
                        MainActivity.this.newsRecycler.setLayoutManager(new LinearLayoutManager(MainActivity.this, 0, false));
                        MainActivity.this.newsRecycler.setItemAnimator(new C0185k());
                        MainActivity.this.newsRecycler.setAdapter(MainActivity.this.newsAdapter);
                        MainActivity.this.newsCard.setVisibility(0);
                    }
                } catch (Exception e2) {
                    PrintStream printStream = System.out;
                    printStream.println("e" + e2);
                }
            }

            /* access modifiers changed from: protected */
            public void onPreExecute() {
                super.onPreExecute();
            }
        }.execute(new Void[0]);
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

    private void getVSKeys() {
        String returnADIDCount = returnADIDCount();
        i iVar = new i();
        iVar.a("auth", returnADIDCount);
        c cVar = new c();
        cVar.a(70000);
        String keyOurServerURL = VehicleInfoHandler.getInstance().getKeyOurServerURL();
        String str = BuildConfig.FLAVOR;
        if (keyOurServerURL != null && !VehicleInfoHandler.getInstance().getKeyOurServerURL().equals(str)) {
            str = VehicleInfoHandler.getInstance().getKeyOurServerURL();
        }
        cVar.a(str, iVar, (c.c.a.a.j) new e() {
            public void onFailure(int i, Throwable th, String str) {
                PrintStream printStream = System.out;
                printStream.println("Error " + th);
            }

            public void onSuccess(String str) {
                try {
                    String str2 = new String(Base64.decodeBase64(str));
                    String stringBetween = DataHandler.getInstance().stringBetween(str2, "{token:", ",session:", 7);
                    String stringBetween2 = DataHandler.getInstance().stringBetween(str2, ",session:", "}", 9);
                    System.out.println(stringBetween);
                    System.out.println(stringBetween2);
                    if (stringBetween != null) {
                        if (!stringBetween.equals(BuildConfig.FLAVOR)) {
                            VehicleInfoHandler.getInstance().setVScrapingKeys(stringBetween.trim());
                        }
                    }
                    if (stringBetween2 != null && !stringBetween2.equals(BuildConfig.FLAVOR)) {
                        VehicleInfoHandler.getInstance().setVScrapingCookies(stringBetween2.trim());
                    }
                } catch (Exception e2) {
                    PrintStream printStream = System.out;
                    printStream.println("e" + e2);
                }
            }
        });
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

    /* access modifiers changed from: private */
    public void loadBanner() {
        this.adViewbanner = new h(this);
        this.adViewbanner.setAdUnitId(getString(R.string.admob_banner_id));
        this.adContainerView.removeAllViews();
        this.adContainerView.addView(this.adViewbanner);
        this.adViewbanner.setAdSize(DataHandler.getAdSize(this, this.adContainerView));
        e.a aVar = new e.a();
        aVar.b("B3EEABB8EE11C2BE770B684D95219ECB");
        this.adViewbanner.a(aVar.a());
    }

    public static void populateUnifiedNativeAdView(j jVar, UnifiedNativeAdView unifiedNativeAdView) {
        unifiedNativeAdView.setMediaView((MediaView) unifiedNativeAdView.findViewById(R.id.ad_media));
        unifiedNativeAdView.setHeadlineView(unifiedNativeAdView.findViewById(R.id.ad_headline));
        unifiedNativeAdView.setBodyView(unifiedNativeAdView.findViewById(R.id.ad_body));
        unifiedNativeAdView.setCallToActionView(unifiedNativeAdView.findViewById(R.id.ad_call_to_action));
        unifiedNativeAdView.setIconView(unifiedNativeAdView.findViewById(R.id.ad_app_icon));
        unifiedNativeAdView.setPriceView(unifiedNativeAdView.findViewById(R.id.ad_price));
        unifiedNativeAdView.setStarRatingView(unifiedNativeAdView.findViewById(R.id.ad_stars));
        unifiedNativeAdView.setStoreView(unifiedNativeAdView.findViewById(R.id.ad_store));
        unifiedNativeAdView.setAdvertiserView(unifiedNativeAdView.findViewById(R.id.ad_advertiser));
        ((TextView) unifiedNativeAdView.getHeadlineView()).setText(jVar.e());
        if (jVar.c() == null) {
            unifiedNativeAdView.getBodyView().setVisibility(4);
        } else {
            unifiedNativeAdView.getBodyView().setVisibility(0);
            ((TextView) unifiedNativeAdView.getBodyView()).setText(jVar.c());
        }
        if (jVar.d() == null) {
            unifiedNativeAdView.getCallToActionView().setVisibility(4);
        } else {
            unifiedNativeAdView.getCallToActionView().setVisibility(0);
            ((Button) unifiedNativeAdView.getCallToActionView()).setText(jVar.d());
        }
        if (jVar.f() == null) {
            unifiedNativeAdView.getIconView().setVisibility(8);
        } else {
            ((ImageView) unifiedNativeAdView.getIconView()).setImageDrawable(jVar.f().a());
            unifiedNativeAdView.getIconView().setVisibility(0);
        }
        if (jVar.h() == null) {
            unifiedNativeAdView.getPriceView().setVisibility(4);
        } else {
            unifiedNativeAdView.getPriceView().setVisibility(0);
            ((TextView) unifiedNativeAdView.getPriceView()).setText(jVar.h());
        }
        if (jVar.j() == null) {
            unifiedNativeAdView.getStoreView().setVisibility(4);
        } else {
            unifiedNativeAdView.getStoreView().setVisibility(0);
            ((TextView) unifiedNativeAdView.getStoreView()).setText(jVar.j());
        }
        if (jVar.i() == null) {
            unifiedNativeAdView.getStarRatingView().setVisibility(4);
        } else {
            ((RatingBar) unifiedNativeAdView.getStarRatingView()).setRating(jVar.i().floatValue());
            unifiedNativeAdView.getStarRatingView().setVisibility(0);
        }
        if (jVar.b() == null) {
            unifiedNativeAdView.getAdvertiserView().setVisibility(4);
        } else {
            ((TextView) unifiedNativeAdView.getAdvertiserView()).setText(jVar.b());
            unifiedNativeAdView.getAdvertiserView().setVisibility(0);
        }
        unifiedNativeAdView.setNativeAd(jVar);
        jVar.k();
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

    private void refreshAd() {
        d.a aVar = new d.a((Context) this, getString(R.string.admob_native_id));
        aVar.a((j.a) new j.a() {
            public void onUnifiedNativeAdLoaded(j jVar) {
                if (MainActivity.this.nativeAd != null) {
                    MainActivity.this.nativeAd.a();
                }
                j unused = MainActivity.this.nativeAd = jVar;
                FrameLayout frameLayout = (FrameLayout) MainActivity.this.findViewById(R.id.ad_main);
                UnifiedNativeAdView unifiedNativeAdView = (UnifiedNativeAdView) MainActivity.this.getLayoutInflater().inflate(R.layout.ad_unified, (ViewGroup) null);
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

    /* access modifiers changed from: package-private */
    public void loadOurApps() {
        if (VehicleInfoHandler.getInstance().getOurApp1Link() != null && VehicleInfoHandler.getInstance().getOurApp2Link() != null && VehicleInfoHandler.getInstance().getOurApp3Link() != null && VehicleInfoHandler.getInstance().getOurApp4Link() != null && VehicleInfoHandler.getInstance().getOurApp5Link() != null && VehicleInfoHandler.getInstance().getOurApp6Link() != null && VehicleInfoHandler.getInstance().getOurApp7Link() != null && VehicleInfoHandler.getInstance().getOurApp8Link() != null && VehicleInfoHandler.getInstance().getOurApp9Link() != null && VehicleInfoHandler.getInstance().getOurApp1icon() != null && VehicleInfoHandler.getInstance().getOurApp2icon() != null && VehicleInfoHandler.getInstance().getOurApp3icon() != null && VehicleInfoHandler.getInstance().getOurApp4icon() != null && VehicleInfoHandler.getInstance().getOurApp5icon() != null && VehicleInfoHandler.getInstance().getOurApp6icon() != null && VehicleInfoHandler.getInstance().getOurApp7icon() != null && VehicleInfoHandler.getInstance().getOurApp8icon() != null && VehicleInfoHandler.getInstance().getOurApp9icon() != null) {
            c.a.a.g.e a2 = new c.a.a.g.e().b((int) R.drawable.loading).a((int) R.drawable.ic_error_outline_black_24dp);
            if (!VehicleInfoHandler.getInstance().getOurApp1Link().equals(BuildConfig.FLAVOR)) {
                this.oneImg = (ImageView) findViewById(R.id.s_one);
                k<Drawable> a3 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp1icon());
                a3.a(a2);
                a3.a(this.oneImg);
                ImageView imageView = this.oneImg;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    this.oneImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp1Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp2Link().equals(BuildConfig.FLAVOR)) {
                this.twoImg = (ImageView) findViewById(R.id.s_two);
                k<Drawable> a4 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp2icon());
                a4.a(a2);
                a4.a(this.twoImg);
                ImageView imageView2 = this.twoImg;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    this.twoImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp2Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp3Link().equals(BuildConfig.FLAVOR)) {
                this.threeImg = (ImageView) findViewById(R.id.s_three);
                k<Drawable> a5 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp3icon());
                a5.a(a2);
                a5.a(this.threeImg);
                ImageView imageView3 = this.threeImg;
                if (imageView3 != null) {
                    imageView3.setVisibility(0);
                    this.threeImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp3Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp4Link().equals(BuildConfig.FLAVOR)) {
                this.fourImg = (ImageView) findViewById(R.id.s_four);
                k<Drawable> a6 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp4icon());
                a6.a(a2);
                a6.a(this.fourImg);
                ImageView imageView4 = this.fourImg;
                if (imageView4 != null) {
                    imageView4.setVisibility(0);
                    this.fourImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp4Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp5Link().equals(BuildConfig.FLAVOR)) {
                this.fiveImg = (ImageView) findViewById(R.id.s_five);
                k<Drawable> a7 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp5icon());
                a7.a(a2);
                a7.a(this.fiveImg);
                ImageView imageView5 = this.fiveImg;
                if (imageView5 != null) {
                    imageView5.setVisibility(0);
                    this.fiveImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp5Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp6Link().equals(BuildConfig.FLAVOR)) {
                this.sixImg = (ImageView) findViewById(R.id.s_six);
                k<Drawable> a8 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp6icon());
                a8.a(a2);
                a8.a(this.sixImg);
                ImageView imageView6 = this.sixImg;
                if (imageView6 != null) {
                    imageView6.setVisibility(0);
                    this.sixImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp6Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp7Link().equals(BuildConfig.FLAVOR)) {
                this.sevenImg = (ImageView) findViewById(R.id.s_seven);
                k<Drawable> a9 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp7icon());
                a9.a(a2);
                a9.a(this.sevenImg);
                ImageView imageView7 = this.sevenImg;
                if (imageView7 != null) {
                    imageView7.setVisibility(0);
                    this.sevenImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp7Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp8Link().equals(BuildConfig.FLAVOR)) {
                this.eightImg = (ImageView) findViewById(R.id.s_eight);
                k<Drawable> a10 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp8icon());
                a10.a(a2);
                a10.a(this.eightImg);
                ImageView imageView8 = this.eightImg;
                if (imageView8 != null) {
                    imageView8.setVisibility(0);
                    this.eightImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp8Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp9Link().equals(BuildConfig.FLAVOR)) {
                this.nineImg = (ImageView) findViewById(R.id.s_nine);
                k<Drawable> a11 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp9icon());
                a11.a(a2);
                a11.a(this.nineImg);
                ImageView imageView9 = this.nineImg;
                if (imageView9 != null) {
                    imageView9.setVisibility(0);
                    this.nineImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp9Link())));
                        }
                    });
                }
            }
        }
    }

    public void onBackPressed() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawerLayout.f(8388611)) {
            drawerLayout.a(8388611);
            return;
        }
        super.onBackPressed();
        startActivity(new Intent(this, ExitApp.class));
        DataHandler.showAd(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00fb, code lost:
        getCarDeatils(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x011c, code lost:
        r4 = r4.putExtra("type", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x012a, code lost:
        r4 = r4.putExtra("pageName", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x012e, code lost:
        startActivity(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0041, code lost:
        r4 = r4.putExtra("state", r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r4) {
        /*
            r3 = this;
            int r4 = r4.getId()
            java.lang.String r0 = "state"
            java.lang.String r1 = "type"
            java.lang.String r2 = "pageName"
            switch(r4) {
                case 2131361893: goto L_0x0121;
                case 2131361903: goto L_0x0113;
                case 2131361923: goto L_0x0109;
                case 2131361950: goto L_0x00ff;
                case 2131361951: goto L_0x00fa;
                case 2131361952: goto L_0x00f8;
                case 2131361953: goto L_0x00f6;
                case 2131361954: goto L_0x00f4;
                case 2131361961: goto L_0x00ec;
                case 2131361962: goto L_0x00ec;
                case 2131362026: goto L_0x00e4;
                case 2131362030: goto L_0x00da;
                case 2131362031: goto L_0x00d0;
                case 2131362109: goto L_0x00c6;
                case 2131362124: goto L_0x00bc;
                case 2131362126: goto L_0x00b1;
                case 2131362134: goto L_0x00a6;
                case 2131362136: goto L_0x009b;
                case 2131362157: goto L_0x0090;
                case 2131362177: goto L_0x0087;
                case 2131362218: goto L_0x007c;
                case 2131362256: goto L_0x0071;
                case 2131362293: goto L_0x0066;
                case 2131362303: goto L_0x005b;
                case 2131362322: goto L_0x0052;
                case 2131362323: goto L_0x0052;
                case 2131362341: goto L_0x0047;
                case 2131362411: goto L_0x0038;
                case 2131362412: goto L_0x002e;
                case 2131362413: goto L_0x0024;
                case 2131362414: goto L_0x001a;
                case 2131362467: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0131
        L_0x000f:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.CautionarySignals> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.CautionarySignals.class
            r4.<init>(r3, r0)
            java.lang.String r0 = "traffic"
            goto L_0x011c
        L_0x001a:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RTOCodes> r1 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RTOCodes.class
            r4.<init>(r3, r1)
            java.lang.String r1 = "Arunachal Pradesh"
            goto L_0x0041
        L_0x0024:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RTOCodes> r1 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RTOCodes.class
            r4.<init>(r3, r1)
            java.lang.String r1 = "Assam"
            goto L_0x0041
        L_0x002e:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RTOCodes> r1 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RTOCodes.class
            r4.<init>(r3, r1)
            java.lang.String r1 = "Andhra Pradesh"
            goto L_0x0041
        L_0x0038:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RTOCodes> r1 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RTOCodes.class
            r4.<init>(r3, r1)
            java.lang.String r1 = "Bihar"
        L_0x0041:
            android.content.Intent r4 = r4.putExtra(r0, r1)
            goto L_0x012e
        L_0x0047:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleBrands> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleBrands.class
            r4.<init>(r3, r0)
            java.lang.String r0 = "3"
            goto L_0x011c
        L_0x0052:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RTOStates> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RTOStates.class
            r4.<init>(r3, r0)
            goto L_0x012e
        L_0x005b:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RcWebView> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RcWebView.class
            r4.<init>(r3, r0)
            java.lang.String r0 = "file:///android_asset/renewal.html"
            goto L_0x012a
        L_0x0066:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RcWebView> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RcWebView.class
            r4.<init>(r3, r0)
            java.lang.String r0 = "file:///android_asset/reassignment.html"
            goto L_0x012a
        L_0x0071:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RcWebView> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RcWebView.class
            r4.<init>(r3, r0)
            java.lang.String r0 = "file:///android_asset/permanent.html"
            goto L_0x012a
        L_0x007c:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RcWebView> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RcWebView.class
            r4.<init>(r3, r0)
            java.lang.String r0 = "file:///android_asset/Objection.html"
            goto L_0x012a
        L_0x0087:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.UsefulLinks> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.UsefulLinks.class
            r4.<init>(r3, r0)
            goto L_0x012e
        L_0x0090:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.CautionarySignals> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.CautionarySignals.class
            r4.<init>(r3, r0)
            java.lang.String r0 = "mandatory"
            goto L_0x011c
        L_0x009b:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RcWebView> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RcWebView.class
            r4.<init>(r3, r0)
            java.lang.String r0 = "file:///android_asset/international.html"
            goto L_0x012a
        L_0x00a6:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RcWebView> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RcWebView.class
            r4.<init>(r3, r0)
            java.lang.String r0 = "file:///android_asset/learner.html"
            goto L_0x012a
        L_0x00b1:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RcWebView> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RcWebView.class
            r4.<init>(r3, r0)
            java.lang.String r0 = "file:///android_asset/inter.html"
            goto L_0x012a
        L_0x00bc:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.CautionarySignals> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.CautionarySignals.class
            r4.<init>(r3, r0)
            java.lang.String r0 = "informatory"
            goto L_0x011c
        L_0x00c6:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RcWebView> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RcWebView.class
            r4.<init>(r3, r0)
            java.lang.String r0 = "file:///android_asset/endorsement.html"
            goto L_0x012a
        L_0x00d0:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RcWebView> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RcWebView.class
            r4.<init>(r3, r0)
            java.lang.String r0 = "file:///android_asset/duplicate.html"
            goto L_0x012a
        L_0x00da:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RcWebView> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RcWebView.class
            r4.<init>(r3, r0)
            java.lang.String r0 = "file:///android_asset/duplicateTradeIssue.html"
            goto L_0x012a
        L_0x00e4:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTest> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTest.class
            r4.<init>(r3, r0)
            goto L_0x012e
        L_0x00ec:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.CelebrityCars> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.CelebrityCars.class
            r4.<init>(r3, r0)
            goto L_0x012e
        L_0x00f4:
            r4 = 1
            goto L_0x00fb
        L_0x00f6:
            r4 = 2
            goto L_0x00fb
        L_0x00f8:
            r4 = 0
            goto L_0x00fb
        L_0x00fa:
            r4 = 3
        L_0x00fb:
            r3.getCarDeatils(r4)
            goto L_0x0131
        L_0x00ff:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.CautionarySignals> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.CautionarySignals.class
            r4.<init>(r3, r0)
            java.lang.String r0 = "caution"
            goto L_0x011c
        L_0x0109:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleBrands> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleBrands.class
            r4.<init>(r3, r0)
            java.lang.String r0 = "1"
            goto L_0x011c
        L_0x0113:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleBrands> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleBrands.class
            r4.<init>(r3, r0)
            java.lang.String r0 = "2"
        L_0x011c:
            android.content.Intent r4 = r4.putExtra(r1, r0)
            goto L_0x012e
        L_0x0121:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RcWebView> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.RcWebView.class
            r4.<init>(r3, r0)
            java.lang.String r0 = "file:///android_asset/classAddition.html"
        L_0x012a:
            android.content.Intent r4 = r4.putExtra(r2, r0)
        L_0x012e:
            r3.startActivity(r4)
        L_0x0131:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.MainActivity.onClick(android.view.View):void");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main);
        mObj = this;
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView textView = (TextView) ((CollapsingToolbarLayout) findViewById(R.id.toolbar_layout)).findViewById(R.id.toolbar_title);
        setSupportActionBar(toolbar);
        this.expand_menu = (ImageView) findViewById(R.id.expand_menu);
        this.ourAppsMain = (LinearLayout) findViewById(R.id.our_apps_main);
        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        C0096c cVar = new C0096c(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.a((DrawerLayout.c) cVar);
        cVar.b();
        ((NavigationView) findViewById(R.id.nav_view)).setNavigationItemSelectedListener(this);
        this.expand_menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                drawerLayout.h(3);
            }
        });
        this.goto_search = (LinearLayout) findViewById(R.id.goto_search);
        this.goto_search.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity mainActivity = MainActivity.this;
                mainActivity.startActivity(new Intent(mainActivity, V_SearchActivity.class));
            }
        });
        this.fancy = (LinearLayout) findViewById(R.id.fancey);
        this.fancy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity mainActivity = MainActivity.this;
                mainActivity.startActivity(new Intent(mainActivity, FancyGenerator.class));
            }
        });
        this.noObjection = (LinearLayout) findViewById(R.id.no_objection);
        this.noObjection.setOnClickListener(this);
        this.dupTrade = (LinearLayout) findViewById(R.id.dup_trade);
        this.dupTrade.setOnClickListener(this);
        this.hpEndorse = (LinearLayout) findViewById(R.id.hp_endorse);
        this.hpEndorse.setOnClickListener(this);
        this.more_useful_rc = (LinearLayout) findViewById(R.id.more_useful_rc);
        this.more_useful_rc.setOnClickListener(this);
        this.reassign = (LinearLayout) findViewById(R.id.reassign);
        this.reassign.setOnClickListener(this);
        this.learner_useful_dl = (LinearLayout) findViewById(R.id.learner_useful_dl);
        this.learner_useful_dl.setOnClickListener(this);
        this.permanent_useful_dl = (LinearLayout) findViewById(R.id.permanent_useful_dl);
        this.permanent_useful_dl.setOnClickListener(this);
        this.dup_useful_dl = (LinearLayout) findViewById(R.id.dup_useful_dl);
        this.dup_useful_dl.setOnClickListener(this);
        this.renewable_useful_dl = (LinearLayout) findViewById(R.id.renewable_useful_dl);
        this.renewable_useful_dl.setOnClickListener(this);
        this.add_useful_class = (LinearLayout) findViewById(R.id.add_useful_class);
        this.add_useful_class.setOnClickListener(this);
        this.license_useful_related_fees = (LinearLayout) findViewById(R.id.license_useful_related_fees);
        this.license_useful_related_fees.setOnClickListener(this);
        this.international_useful_driving_permit = (LinearLayout) findViewById(R.id.international_useful_driving_permit);
        this.international_useful_driving_permit.setOnClickListener(this);
        this.cautionSign = (LinearLayout) findViewById(R.id.caution_sign);
        this.cautionSign.setOnClickListener(this);
        this.mandatorySign = (LinearLayout) findViewById(R.id.mandatory_sign);
        this.mandatorySign.setOnClickListener(this);
        this.informatorySign = (LinearLayout) findViewById(R.id.informatory_sign);
        this.informatorySign.setOnClickListener(this);
        this.trafficSign = (LinearLayout) findViewById(R.id.traffic_sign);
        this.trafficSign.setOnClickListener(this);
        this.stateOne = (LinearLayout) findViewById(R.id.state_one);
        this.stateOne.setOnClickListener(this);
        this.stateTwo = (LinearLayout) findViewById(R.id.state_two);
        this.stateTwo.setOnClickListener(this);
        this.stateThree = (LinearLayout) findViewById(R.id.state_three);
        this.stateThree.setOnClickListener(this);
        this.stateFour = (LinearLayout) findViewById(R.id.state_four);
        this.stateFour.setOnClickListener(this);
        this.stateMore = (LinearLayout) findViewById(R.id.rto_codes_more);
        this.stateMore.setOnClickListener(this);
        this.car_p = (LinearLayout) findViewById(R.id.car_p);
        this.car_p.setOnClickListener(this);
        this.bike_p = (LinearLayout) findViewById(R.id.bike_p);
        this.bike_p.setOnClickListener(this);
        this.scooty_p = (LinearLayout) findViewById(R.id.scooty_p);
        this.scooty_p.setOnClickListener(this);
        this.dlTest = (LinearLayout) findViewById(R.id.dl_test);
        this.dlTest.setOnClickListener(this);
        this.celebCard = (CardView) findViewById(R.id.celeb_card);
        this.celeb_one = (LinearLayout) findViewById(R.id.cele_one);
        this.celeb_one.setOnClickListener(this);
        this.celeb_two = (LinearLayout) findViewById(R.id.cele_two);
        this.celeb_two.setOnClickListener(this);
        this.celeb_three = (LinearLayout) findViewById(R.id.cele_three);
        this.celeb_three.setOnClickListener(this);
        this.celeb_four = (LinearLayout) findViewById(R.id.cele_four);
        this.celeb_four.setOnClickListener(this);
        this.celeb_more = (LinearLayout) findViewById(R.id.celeb_more);
        this.celeb_more.setOnClickListener(this);
        this.celebCarOne = (TextView) findViewById(R.id.celeb_car_one);
        this.celebCarTwo = (TextView) findViewById(R.id.celeb_car_two);
        this.celebCarThree = (TextView) findViewById(R.id.celeb_car_three);
        this.celebCarFour = (TextView) findViewById(R.id.celeb_car_four);
        this.celeb_more1 = (TextView) findViewById(R.id.celeb_more1);
        this.celeb_more1.setOnClickListener(this);
        this.rtocodes_more2 = (TextView) findViewById(R.id.rto_codes_more1);
        this.rtocodes_more2.setOnClickListener(this);
        if (!PreferenceManager.getDefaultSharedPreferences(this).getString("api_rto_celebrity", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            getCelebrityCars();
        }
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("deeku_enableLicenseTest", BuildConfig.FLAVOR).equals("true")) {
            this.dlTest.setVisibility(0);
        }
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("deeku_showOurAppIcons", BuildConfig.FLAVOR).equals("true")) {
            this.ourAppsMain.setVisibility(0);
            loadOurApps();
        } else {
            this.ourAppsMain.setVisibility(8);
        }
        this.vehicle_prices = (CardView) findViewById(R.id.vehicle_prices);
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("deeku_enableVehiclePrices", BuildConfig.FLAVOR).equals("true")) {
            this.vehicle_prices.setVisibility(0);
        }
        this.rto_codes_card = (CardView) findViewById(R.id.rto_codes_card);
        if (!PreferenceManager.getDefaultSharedPreferences(this).getString("api_rto_codes", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            this.rto_codes_card.setVisibility(0);
        }
        this.newsRecycler = (RecyclerView) findViewById(R.id.news_recycler);
        this.newsCard = (CardView) findViewById(R.id.news_card);
        showAd1();
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("showNativeAD", BuildConfig.FLAVOR).equals("true")) {
            String string = PreferenceManager.getDefaultSharedPreferences(this).getString("AdRotationPolicyNative", BuildConfig.FLAVOR);
            String string2 = PreferenceManager.getDefaultSharedPreferences(this).getString("NativeOnlyFB", BuildConfig.FLAVOR);
            String string3 = PreferenceManager.getDefaultSharedPreferences(this).getString("NativeOnlyGoogle", BuildConfig.FLAVOR);
            if (string.equals("true")) {
                if (VehicleInfoHandler.getInstance() != null) {
                    if (!VehicleInfoHandler.getInstance().isFb_native()) {
                        refreshAd();
                    }
                    VehicleInfoHandler.getInstance().setFb_native(!VehicleInfoHandler.getInstance().isFb_native());
                }
            } else if (!string2.equals("true") && string3.equals("true")) {
                refreshAd();
            }
        }
        this.adContainerView = (FrameLayout) findViewById(R.id.ad_view_main1);
        this.fb_banner_container_main = (LinearLayout) findViewById(R.id.fb_banner_main);
        boolean showAdMobBanner = DataHandler.showAdMobBanner(this);
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("ShowBanner", "false").equals("true") && showAdMobBanner) {
            this.adContainerView.post(new Runnable() {
                public void run() {
                    MainActivity.this.loadBanner();
                }
            });
        }
        if (VehicleInfoHandler.getInstance().getKeyOurServer() != null && VehicleInfoHandler.getInstance().getKeyOurServer().equals("true") && VehicleInfoHandler.getInstance().getKeyOurServerURL() != null && !VehicleInfoHandler.getInstance().getKeyOurServerURL().equals(BuildConfig.FLAVOR)) {
            getVSKeys();
        }
        this.resale_val = (LinearLayout) findViewById(R.id.resale_val);
        this.resale_val.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity mainActivity = MainActivity.this;
                mainActivity.startActivity(new Intent(mainActivity, VehicleResale.class));
            }
        });
        if (VehicleInfoHandler.getInstance().getShowResale() != null && VehicleInfoHandler.getInstance().getShowResale().equals("true")) {
            this.resale_val.setVisibility(0);
        }
        this.challan_se = (LinearLayout) findViewById(R.id.challan_se);
        this.challan_se.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity mainActivity = MainActivity.this;
                mainActivity.startActivity(new Intent(mainActivity, EChallan.class));
            }
        });
        this.challan_card = (CardView) findViewById(R.id.challan_card);
        if (VehicleInfoHandler.getInstance().getShowEChallan() != null && VehicleInfoHandler.getInstance().getShowEChallan().equals("true")) {
            this.challan_card.setVisibility(0);
        }
        this.fin_details = (LinearLayout) findViewById(R.id.fin_details);
        this.fin_details.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity mainActivity = MainActivity.this;
                mainActivity.startActivity(new Intent(mainActivity, V_SearchActivity.class).putExtra("showFin", "true"));
            }
        });
        this.ins_details = (LinearLayout) findViewById(R.id.ins_details);
        this.ins_details.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity mainActivity = MainActivity.this;
                mainActivity.startActivity(new Intent(mainActivity, V_SearchActivity.class).putExtra("showIns", "true"));
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        j jVar = this.nativeAd;
        if (jVar != null) {
            jVar.a();
        }
        super.onDestroy();
    }

    public boolean onNavigationItemSelected(MenuItem menuItem) {
        Intent intent;
        int itemId = menuItem.getItemId();
        if (itemId != R.id.home) {
            if (itemId == R.id.vehicleinfo) {
                intent = new Intent(this, V_SearchActivity.class);
            } else if (itemId == R.id.recentsearches) {
                intent = new Intent(this, V_RecentActivity.class);
            } else if (itemId == R.id.privacypolicy) {
                intent = new Intent(this, PolicyActivity.class);
            } else if (itemId == R.id.rating) {
                intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + getApplication().getPackageName()));
            } else if (itemId == R.id.share) {
                try {
                    Intent intent2 = new Intent("android.intent.action.SEND");
                    intent2.setType("text/plain");
                    intent2.putExtra("android.intent.extra.SUBJECT", "Vehicle Information");
                    intent2.putExtra("android.intent.extra.TEXT", "Find Any Vehicle related information here : \n" + "\nhttps://play.google.com/store/apps/details?id=" + getApplication().getPackageName());
                    startActivity(Intent.createChooser(intent2, "choose one"));
                } catch (Exception e2) {
                    PrintStream printStream = System.out;
                    printStream.println("Exception : " + e2);
                }
            } else if (itemId == R.id.feedback) {
                intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("mailto:hangoverstudios.mobile@gmail.com?subject= Scan Karke Feedback"));
            }
            startActivity(intent);
        }
        ((DrawerLayout) findViewById(R.id.drawer_layout)).a(8388611);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public String returnADIDCount() {
        String string = getSharedPreferences(getString(R.string.app_name), 0).getString("GhadiNumber", "A2ZXX007");
        byte[] bArr = new byte[0];
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        String str = BuildConfig.FLAVOR;
        try {
            str = getRandi(encodE(defaultSharedPreferences.getString("clue", str)), encodE(string)).toString().replaceAll("\n", str);
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        getSharedPreferences(getString(R.string.app_name), 0).edit().putString("redVal", str).apply();
        return str;
    }

    public void showAd1() {
        Intent intent;
        String string = PreferenceManager.getDefaultSharedPreferences(this).getString("showInterstitialOnLaunch", BuildConfig.FLAVOR);
        String string2 = PreferenceManager.getDefaultSharedPreferences(this).getString("showInteOnLaunchFB", BuildConfig.FLAVOR);
        String string3 = PreferenceManager.getDefaultSharedPreferences(this).getString("deeku_showOurAppInterstitials", BuildConfig.FLAVOR);
        if (!string.equals(BuildConfig.FLAVOR) && string.equals("true") && !string2.equals(BuildConfig.FLAVOR)) {
            if (!string2.equals("true")) {
                StartActivity startActivity = StartActivity.sObj;
                if (startActivity != null) {
                    m mVar = startActivity.mInterstitialAd;
                    if (mVar != null) {
                        if (mVar.b()) {
                            VehicleInfoHandler.getInstance().setFb_interstitial(true);
                            StartActivity.sObj.mInterstitialAd.c();
                            return;
                        }
                        StartActivity.sObj.requestNewInterstitial();
                        if (string3.equals("true")) {
                            intent = new Intent(this, OurAdActivity.class);
                        } else {
                            return;
                        }
                    } else if (string3.equals("true")) {
                        intent = new Intent(this, OurAdActivity.class);
                    } else {
                        return;
                    }
                } else if (string3.equals("true")) {
                    intent = new Intent(this, OurAdActivity.class);
                } else {
                    return;
                }
            } else if (StartActivity.sObj != null) {
                VehicleInfoHandler.getInstance().setFb_interstitial(false);
                if (string3.equals("true")) {
                    startActivity(new Intent(this, OurAdActivity.class));
                }
                if (string3.equals("true")) {
                    intent = new Intent(this, OurAdActivity.class);
                } else {
                    return;
                }
            } else if (string3.equals("true")) {
                intent = new Intent(this, OurAdActivity.class);
            } else {
                return;
            }
            startActivity(intent);
        }
    }
}
