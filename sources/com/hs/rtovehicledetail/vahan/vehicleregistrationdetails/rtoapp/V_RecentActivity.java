package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.app.o;
import androidx.cardview.widget.CardView;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.formats.j;
import com.google.android.gms.ads.h;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class V_RecentActivity extends o {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static V_RecentActivity rSearches;
    private FrameLayout adContainerView;
    LinearLayout adView;
    private h adViewbanner;
    public Context context;
    LinearLayout dataAvail;
    ArrayList<SettingsObject> dataSet = null;
    LinearLayout fb_banner_container_recent_rc;
    private MyAdapter mAdapter;
    private j nativeAd;
    LinearLayout noData;
    CardView recentCard1;
    CardView recentCard2;
    CardView recentCard3;
    CardView recentCard4;
    CardView recentCard5;
    CardView recentCard6;
    TextView regDetails1;
    TextView regDetails2;
    TextView regDetails3;
    TextView regDetails4;
    TextView regDetails5;
    TextView regDetails6;
    TextView regnoValue1;
    TextView regnoValue2;
    TextView regnoValue3;
    TextView regnoValue4;
    TextView regnoValue5;
    TextView regnoValue6;
    ListView simpleList;
    TextView text;
    TextView text1;

    private ArrayList<SettingsObject> getDataSet() {
        JSONArray recentSearches = DataHandler.getInstance().getRecentSearches(this);
        ArrayList<SettingsObject> arrayList = new ArrayList<>();
        if (recentSearches.length() == 0) {
            this.noData.setVisibility(0);
            this.simpleList.setVisibility(8);
        } else {
            this.noData.setVisibility(8);
            int length = recentSearches.length();
            int i = 0;
            while (length > 0) {
                try {
                    JSONObject jSONObject = recentSearches.getJSONObject(length - 1);
                    SettingsObject settingsObject = r4;
                    SettingsObject settingsObject2 = new SettingsObject(jSONObject.getString("reg_no"), jSONObject.getString("reg_at"), jSONObject.getString("owner_name"), jSONObject.getString("reg_date"), jSONObject.getString("maker_model"), jSONObject.getString("vehicle_class"), jSONObject.getString("fuel_type"), jSONObject.getString("chasi_no"), jSONObject.getString("engine_no"), i);
                    arrayList.add(i, settingsObject);
                } catch (Exception unused) {
                    System.out.println("Exception in recent searches");
                }
                length--;
                i++;
            }
        }
        return arrayList;
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

    public void deleteRecentItem(String str) {
        DataHandler.getInstance().deleteRecentSearch(str, this);
        setAdapter();
    }

    public void deleteVehicle(final SettingsObject settingsObject) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Confirm Delete...");
        builder.setMessage("Are you sure you want delete this Record: " + settingsObject.getOwner_name());
        builder.setIcon(R.drawable.ic_delete_black_24dp);
        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                V_RecentActivity.this.deleteRecentItem(settingsObject.getReg_no());
            }
        });
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        if (!isFinishing()) {
            builder.show();
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_v__recent);
        ((C0094a) Objects.requireNonNull(getSupportActionBar())).d(true);
        rSearches = this;
        this.context = this;
        setTitle("Recent Searches");
        this.noData = (LinearLayout) findViewById(R.id.noData);
        this.text = (TextView) findViewById(R.id.text);
        this.text1 = (TextView) findViewById(R.id.text1);
        TextView textView = this.text1;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    V_RecentActivity.this.finish();
                }
            });
        }
        this.simpleList = (ListView) findViewById(R.id.simpleListView);
        setAdapter();
        this.adContainerView = (FrameLayout) findViewById(R.id.ad_view_recent_rc);
        this.fb_banner_container_recent_rc = (LinearLayout) findViewById(R.id.fb_banner_recent_rc);
        boolean showAdMobBanner = DataHandler.showAdMobBanner(this);
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("ShowBanner", "false").equals("true") && showAdMobBanner) {
            this.adContainerView.post(new Runnable() {
                public void run() {
                    V_RecentActivity.this.loadBanner();
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

    public void setAdapter() {
        this.dataSet = getDataSet();
        if (this.dataSet.size() > 0) {
            this.text.setVisibility(8);
            this.text1.setVisibility(8);
            this.simpleList.setVisibility(0);
            this.mAdapter = new MyAdapter(this, R.layout.recent_view_items, this.dataSet);
            this.simpleList.setAdapter(this.mAdapter);
            this.noData.setVisibility(8);
            return;
        }
        this.noData.setVisibility(0);
        this.text.setVisibility(0);
        this.text1.setVisibility(0);
        this.simpleList.setVisibility(8);
    }
}
