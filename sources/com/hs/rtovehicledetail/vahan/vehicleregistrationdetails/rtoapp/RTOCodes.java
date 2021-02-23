package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Base64;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.app.o;
import androidx.recyclerview.widget.C0185k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.h;
import g.A;
import g.E;
import g.H;
import g.J;
import g.x;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RTOCodes extends o {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private FrameLayout adContainerView;
    private h adViewbanner;
    /* access modifiers changed from: private */
    public CodesAdapter codesAdapter;
    /* access modifiers changed from: private */
    public List<CodesBean> codesList = new ArrayList();
    LinearLayout fb_banner_container_rto_codes;
    private ImageView goBack;
    /* access modifiers changed from: private */
    public TextView loadingStates;
    /* access modifiers changed from: private */
    public RecyclerView rtoCodes;

    private void getCodes(String str) {
        MainActivity mainActivity = MainActivity.mObj;
        final String returnADIDCount = mainActivity != null ? mainActivity.returnADIDCount() : BuildConfig.FLAVOR;
        final String replaceAll = DataHandler.insertPeriodically(new String(Base64.encode(("stateName:" + str.replace(" ", "_")).getBytes(), 0), StandardCharsets.UTF_8).replaceAll("\n", BuildConfig.FLAVOR), "a", 1).replaceAll("\n", BuildConfig.FLAVOR);
        new AsyncTask<Void, Integer, String>() {
            /* access modifiers changed from: protected */
            public String doInBackground(Void... voidArr) {
                x.a aVar = new x.a();
                aVar.a("cookie", replaceAll);
                aVar.a("auth", returnADIDCount);
                x a2 = aVar.a();
                E.a aVar2 = new E.a();
                aVar2.a(30, TimeUnit.SECONDS);
                aVar2.c(30, TimeUnit.SECONDS);
                aVar2.b(90, TimeUnit.SECONDS);
                E a3 = aVar2.a();
                A.a i = A.c(PreferenceManager.getDefaultSharedPreferences(RTOCodes.this).getString("api_rto_codes", BuildConfig.FLAVOR)).i();
                H.a aVar3 = new H.a();
                aVar3.b(i.a().toString());
                aVar3.a((J) a2);
                try {
                    return a3.a(aVar3.a()).execute().a().t();
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return BuildConfig.FLAVOR;
                }
            }

            /* access modifiers changed from: protected */
            public void onPostExecute(String str) {
                super.onPostExecute(str);
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.getString("status").equals("1")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("stateCodesList");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            RTOCodes.this.codesList.add(new CodesBean(jSONObject2.getString("column1"), jSONObject2.getString("column2"), jSONObject2.getString("column3"), jSONObject2.getString("column4"), jSONObject2.getString("column5")));
                        }
                        CodesAdapter unused = RTOCodes.this.codesAdapter = new CodesAdapter(RTOCodes.this.codesList, RTOCodes.this);
                        RTOCodes.this.rtoCodes.setLayoutManager(new LinearLayoutManager(RTOCodes.this));
                        RTOCodes.this.rtoCodes.setItemAnimator(new C0185k());
                        RTOCodes.this.rtoCodes.setAdapter(RTOCodes.this.codesAdapter);
                        RTOCodes.this.loadingStates.setVisibility(8);
                        RTOCodes.this.rtoCodes.setVisibility(0);
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }

            /* access modifiers changed from: protected */
            public void onPreExecute() {
                super.onPreExecute();
            }
        }.execute(new Void[0]);
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

    public void onBackPressed() {
        super.onBackPressed();
        DataHandler.showAd(this);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_rtocodes);
        ((C0094a) Objects.requireNonNull(getSupportActionBar())).d(true);
        this.rtoCodes = (RecyclerView) findViewById(R.id.rto_codes);
        this.loadingStates = (TextView) findViewById(R.id.loading);
        String stringExtra = getIntent().getStringExtra("state");
        setTitle(stringExtra);
        getCodes(stringExtra);
        this.fb_banner_container_rto_codes = (LinearLayout) findViewById(R.id.fb_banner_rto_codes);
        this.adContainerView = (FrameLayout) findViewById(R.id.ad_view_rto_codes);
        boolean showAdMobBanner = DataHandler.showAdMobBanner(this);
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("ShowBanner", "false").equals("true") && showAdMobBanner) {
            this.adContainerView.post(new Runnable() {
                public void run() {
                    RTOCodes.this.loadBanner();
                }
            });
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
