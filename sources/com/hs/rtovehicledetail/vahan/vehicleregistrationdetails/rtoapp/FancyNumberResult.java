package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.o;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.X;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.h;
import com.google.android.material.navigation.NavigationView;
import java.util.ArrayList;

public class FancyNumberResult extends o implements NavigationView.a {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static String number = "";
    public static String prefix = "KA22 EE ";
    private FrameLayout adContainerView;
    private h adViewbanner;
    Context context;
    LinearLayout fb_banner_container_fancy_result;
    TextView findOwner;
    GridView gridView;
    EditText number_head;
    LinearLayout searchIcon;

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

    public void displayAdActivity() {
    }

    public void displayDialog() {
        LinearLayout linearLayout = new LinearLayout(this);
        float f2 = getResources().getDisplayMetrics().density;
        int i = (int) ((20.0f * f2) + 0.5f);
        int i2 = (int) ((f2 * 10.0f) + 0.5f);
        linearLayout.setPadding(i, i2, i, i2);
        linearLayout.setBackgroundColor(Color.parseColor("#dfdfdf"));
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final EditText editText = new EditText(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        editText.setLayoutParams(new X.a((ViewGroup.MarginLayoutParams) layoutParams));
        editText.setHint("Message");
        if (!prefix.equals(BuildConfig.FLAVOR)) {
            editText.setText(prefix);
        }
        linearLayout.addView(editText);
        builder.setTitle("Edit prefix");
        builder.setView(linearLayout);
        builder.setPositiveButton(17039370, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                FancyNumberResult.prefix = editText.getText().toString().toUpperCase();
                EditText editText = FancyNumberResult.this.number_head;
                editText.setText(FancyNumberResult.prefix + " " + FancyNumberResult.number);
                dialogInterface.dismiss();
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                FancyNumberResult.prefix = FancyNumberResult.prefix;
                dialogInterface.cancel();
            }
        });
        builder.create();
        builder.show();
    }

    public boolean isConnectingToInternet() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        return connectivityManager.getNetworkInfo(0).getState() == NetworkInfo.State.CONNECTED || connectivityManager.getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTED;
    }

    public void onBackPressed() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawerLayout.f(8388611)) {
            drawerLayout.a(8388611);
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.context = this;
        setContentView((int) R.layout.activity_fancy_number_result);
        this.number_head = (EditText) findViewById(R.id.number_head);
        EditText editText = this.number_head;
        editText.setText(prefix + BuildConfig.FLAVOR + number);
        new ArrayList();
        ArrayList<String> evaluavateNumberSeries = CarNumber.evaluavateNumberSeries(getIntent().getIntExtra("START_SERIES", 1), getIntent().getIntExtra("END_SERIES", 9999), getIntent().getIntExtra("REPEATS", 1), getIntent().getIntArrayExtra("SENTIMENT_NUMBER"));
        this.findOwner = (TextView) findViewById(R.id.findOwner);
        this.findOwner.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (!FancyNumberResult.prefix.equals(BuildConfig.FLAVOR) && !FancyNumberResult.number.equals(BuildConfig.FLAVOR)) {
                    Intent intent = new Intent(FancyNumberResult.this, V_SearchActivity.class);
                    V_SearchActivity.fancyNumber = FancyNumberResult.this.number_head.getText().toString();
                    intent.putExtra("favNumber", V_SearchActivity.fancyNumber);
                    FancyNumberResult.this.startActivity(intent);
                }
            }
        });
        this.gridView = (GridView) findViewById(R.id.gridView1);
        final String[] strArr = (String[]) evaluavateNumberSeries.toArray(new String[0]);
        if (strArr == null || strArr.length <= 0) {
            finish();
            Toast.makeText(this, "Number series not found", 1).show();
        } else {
            number = strArr[0];
            EditText editText2 = this.number_head;
            editText2.setText(prefix + BuildConfig.FLAVOR + number);
            this.gridView.setAdapter(new ArrayAdapter(this, R.layout.my_simple_list_item, strArr));
            this.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    FancyNumberResult.number = strArr[i];
                    EditText editText = FancyNumberResult.this.number_head;
                    editText.setText(FancyNumberResult.prefix + " " + FancyNumberResult.number);
                }
            });
        }
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        this.fb_banner_container_fancy_result = (LinearLayout) findViewById(R.id.fb_banner_fancy_result);
        this.adContainerView = (FrameLayout) findViewById(R.id.ad_view_fancy_result);
        boolean showAdMobBanner = DataHandler.showAdMobBanner(this);
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("ShowBanner", "false").equals("true") && showAdMobBanner) {
            this.adContainerView.post(new Runnable() {
                public void run() {
                    FancyNumberResult.this.loadBanner();
                }
            });
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.fancy_number_result, menu);
        return true;
    }

    public boolean onNavigationItemSelected(MenuItem menuItem) {
        menuItem.getItemId();
        ((DrawerLayout) findViewById(R.id.drawer_layout)).a(8388611);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_edit_prefix) {
            displayDialog();
            return true;
        } else if (itemId != R.id.menu_share) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            if (!prefix.equals(BuildConfig.FLAVOR) && !number.equals(BuildConfig.FLAVOR)) {
                shareNumber(this.number_head.getText().toString());
            }
            return true;
        }
    }

    public void shareNumber(String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(268435456);
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", BuildConfig.FLAVOR);
        intent.putExtra("android.intent.extra.TEXT", ("Fancy Number is: \n" + str) + "\n\n https://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName());
        intent.addFlags(1);
        intent.addFlags(1);
        Intent createChooser = Intent.createChooser(intent, "Share via");
        createChooser.addFlags(268435456);
        startActivity(createChooser);
    }
}
