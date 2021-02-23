package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.provider.Telephony;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.app.o;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.C0159i;
import androidx.viewpager.widget.ViewPager;
import c.a.a.c;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.formats.j;
import com.google.android.gms.ads.h;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Pattern;

public class V_SearchActivity extends o {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    /* access modifiers changed from: private */
    public static int NUM_PAGES = 0;
    private static final int RC_OCR_CAPTURE = 9003;
    /* access modifiers changed from: private */
    public static int currentPage = 0;
    public static String fancyNumber = "";
    /* access modifiers changed from: private */
    public static ViewPager mPager = null;
    public static String mobileNo = "";
    public static String vehicleNo;
    public static String vregNo;
    private int MY_PERMISSIONS_REQUEST_SEND_SMS = 1;
    private FrameLayout adContainerView;
    LinearLayout adView;
    private h adViewbanner;
    String favNumber;
    LinearLayout fb_banner_container_search;
    private ArrayList<ImageModel> imageModelArrayList;
    LinearLayout loading;
    CardView loading_card;
    ImageView loading_gif;
    TextView loading_msg;
    CardView menu_item_card_view;
    private j nativeAd;
    LinearLayout recent;
    LinearLayout scan;
    CardView search_card;
    LinearLayout searchbutton;
    AlertDialog smsalertDialog;
    public String vehicleNum1;
    public String vehicleNum2;
    EditText vehiclenumber;

    static /* synthetic */ int access$108() {
        int i = currentPage;
        currentPage = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    public void checkAndroidVersion() {
        String string = PreferenceManager.getDefaultSharedPreferences(this).getString("deeku_vahanMobileNo", BuildConfig.FLAVOR);
        if (Build.VERSION.SDK_INT >= 19) {
            String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(this);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("address", string);
            intent.putExtra("sms_body", "VAHAN " + vregNo);
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
            intent2.putExtra("sms_body", "VAHAN " + vregNo);
            startActivity(intent2);
        }
    }

    private void disableLoading() {
        this.loading.setVisibility(8);
        this.searchbutton.setVisibility(0);
        this.search_card.setVisibility(0);
        this.loading_card.setVisibility(8);
    }

    private void enableLoaidng() {
        this.loading.setVisibility(0);
        this.searchbutton.setVisibility(8);
        this.search_card.setVisibility(8);
        this.loading_card.setVisibility(0);
        TextView textView = this.loading_msg;
        textView.setText(getString(R.string.msg_loading) + " " + vehicleNo);
    }

    private void init101() {
        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(new SlidingImage_Adapter(this, this.imageModelArrayList));
        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) findViewById(R.id.indicator);
        circlePageIndicator.setViewPager(mPager);
        circlePageIndicator.setRadius(getResources().getDisplayMetrics().density * 5.0f);
        NUM_PAGES = this.imageModelArrayList.size();
        final Handler handler = new Handler();
        final AnonymousClass6 r2 = new Runnable() {
            public void run() {
                if (V_SearchActivity.currentPage == V_SearchActivity.NUM_PAGES) {
                    int unused = V_SearchActivity.currentPage = 0;
                }
                V_SearchActivity.mPager.a(V_SearchActivity.access$108(), true);
            }
        };
        new Timer().schedule(new TimerTask() {
            public void run() {
                handler.post(r2);
            }
        }, 3000, 3000);
        circlePageIndicator.setOnPageChangeListener(new ViewPager.f() {
            public void onPageScrollStateChanged(int i) {
            }

            public void onPageScrolled(int i, float f2, int i2) {
            }

            public void onPageSelected(int i) {
                int unused = V_SearchActivity.currentPage = i;
            }
        });
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

    private ArrayList<ImageModel> populateList() {
        ArrayList<ImageModel> arrayList = new ArrayList<>();
        if (!(VehicleInfoHandler.getInstance().getOurApp1LinkSlide() == null || VehicleInfoHandler.getInstance().getOurApp1iconSlide() == null || VehicleInfoHandler.getInstance().getOurApp2LinkSlide() == null || VehicleInfoHandler.getInstance().getOurApp2iconSlide() == null || VehicleInfoHandler.getInstance().getOurApp3LinkSlide() == null || VehicleInfoHandler.getInstance().getOurApp3iconSlide() == null || VehicleInfoHandler.getInstance().getOurApp4LinkSlide() == null || VehicleInfoHandler.getInstance().getOurApp4iconSlide() == null || VehicleInfoHandler.getInstance().getOurApp5LinkSlide() == null || VehicleInfoHandler.getInstance().getOurApp5iconSlide() == null || VehicleInfoHandler.getInstance().getOurApp6LinkSlide() == null || VehicleInfoHandler.getInstance().getOurApp6iconSlide() == null || VehicleInfoHandler.getInstance().getOurApp7LinkSlide() == null || VehicleInfoHandler.getInstance().getOurApp7iconSlide() == null || VehicleInfoHandler.getInstance().getOurApp8LinkSlide() == null || VehicleInfoHandler.getInstance().getOurApp8iconSlide() == null || VehicleInfoHandler.getInstance().getOurApp9LinkSlide() == null || VehicleInfoHandler.getInstance().getOurApp9iconSlide() == null)) {
            if (!VehicleInfoHandler.getInstance().getOurApp1LinkSlide().equals(BuildConfig.FLAVOR) && !VehicleInfoHandler.getInstance().getOurApp1iconSlide().equals(BuildConfig.FLAVOR)) {
                arrayList.add(new ImageModel(VehicleInfoHandler.getInstance().getOurApp1LinkSlide(), VehicleInfoHandler.getInstance().getOurApp1iconSlide()));
            }
            if (!VehicleInfoHandler.getInstance().getOurApp2LinkSlide().equals(BuildConfig.FLAVOR) && !VehicleInfoHandler.getInstance().getOurApp2iconSlide().equals(BuildConfig.FLAVOR)) {
                arrayList.add(new ImageModel(VehicleInfoHandler.getInstance().getOurApp2LinkSlide(), VehicleInfoHandler.getInstance().getOurApp2iconSlide()));
            }
            if (!VehicleInfoHandler.getInstance().getOurApp3LinkSlide().equals(BuildConfig.FLAVOR) && !VehicleInfoHandler.getInstance().getOurApp3iconSlide().equals(BuildConfig.FLAVOR)) {
                arrayList.add(new ImageModel(VehicleInfoHandler.getInstance().getOurApp3LinkSlide(), VehicleInfoHandler.getInstance().getOurApp3iconSlide()));
            }
            if (!VehicleInfoHandler.getInstance().getOurApp4LinkSlide().equals(BuildConfig.FLAVOR) && !VehicleInfoHandler.getInstance().getOurApp4iconSlide().equals(BuildConfig.FLAVOR)) {
                arrayList.add(new ImageModel(VehicleInfoHandler.getInstance().getOurApp4LinkSlide(), VehicleInfoHandler.getInstance().getOurApp4iconSlide()));
            }
            if (!VehicleInfoHandler.getInstance().getOurApp5LinkSlide().equals(BuildConfig.FLAVOR) && !VehicleInfoHandler.getInstance().getOurApp5iconSlide().equals(BuildConfig.FLAVOR)) {
                arrayList.add(new ImageModel(VehicleInfoHandler.getInstance().getOurApp5LinkSlide(), VehicleInfoHandler.getInstance().getOurApp5iconSlide()));
            }
            if (!VehicleInfoHandler.getInstance().getOurApp6LinkSlide().equals(BuildConfig.FLAVOR) && !VehicleInfoHandler.getInstance().getOurApp6iconSlide().equals(BuildConfig.FLAVOR)) {
                arrayList.add(new ImageModel(VehicleInfoHandler.getInstance().getOurApp6LinkSlide(), VehicleInfoHandler.getInstance().getOurApp6iconSlide()));
            }
            if (!VehicleInfoHandler.getInstance().getOurApp7LinkSlide().equals(BuildConfig.FLAVOR) && !VehicleInfoHandler.getInstance().getOurApp7iconSlide().equals(BuildConfig.FLAVOR)) {
                arrayList.add(new ImageModel(VehicleInfoHandler.getInstance().getOurApp7LinkSlide(), VehicleInfoHandler.getInstance().getOurApp7iconSlide()));
            }
            if (!VehicleInfoHandler.getInstance().getOurApp8LinkSlide().equals(BuildConfig.FLAVOR) && !VehicleInfoHandler.getInstance().getOurApp8iconSlide().equals(BuildConfig.FLAVOR)) {
                arrayList.add(new ImageModel(VehicleInfoHandler.getInstance().getOurApp8LinkSlide(), VehicleInfoHandler.getInstance().getOurApp8iconSlide()));
            }
            if (!VehicleInfoHandler.getInstance().getOurApp9LinkSlide().equals(BuildConfig.FLAVOR) && !VehicleInfoHandler.getInstance().getOurApp9iconSlide().equals(BuildConfig.FLAVOR)) {
                arrayList.add(new ImageModel(VehicleInfoHandler.getInstance().getOurApp9LinkSlide(), VehicleInfoHandler.getInstance().getOurApp9iconSlide()));
            }
        }
        return arrayList;
    }

    private void sendSMSBasedonVersion() {
        if (Build.VERSION.SDK_INT >= 19) {
            String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(this);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("address", "7738299899");
            intent.putExtra("sms_body", "VAHAN " + vehicleNo);
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
            intent2.putExtra("address", "7738299899");
            intent2.putExtra("sms_body", "VAHAN " + vehicleNo);
            startActivity(intent2);
        }
    }

    public boolean checkNum1(String str) {
        return Pattern.compile("^[a-z,A-Z]{2}[0-9]{1}[a-z,A-Z]{1,3}[0-9]{1,4}$").matcher(str).matches();
    }

    public boolean checkNum2(String str) {
        return Pattern.compile("^[a-z,A-Z]{2}[0-9]{2}[0-9]{1,4}$").matcher(str).matches();
    }

    public void getWithSms() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Caution...!");
        builder.setMessage("RTO Server is down. Please send SMS, Standard sms charges will apply.");
        builder.setPositiveButton(17039370, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                V_SearchActivity.this.checkAndroidVersion();
                if (!V_SearchActivity.this.isFinishing()) {
                    dialogInterface.cancel();
                }
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (!V_SearchActivity.this.isFinishing()) {
                    dialogInterface.cancel();
                }
            }
        });
        builder.create();
        if (!isFinishing()) {
            builder.show();
        }
    }

    /* access modifiers changed from: package-private */
    public void hideKeyboard(Activity activity) {
        if (activity != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            if (!(activity.getCurrentFocus() == null || inputMethodManager == null)) {
                inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
                inputMethodManager.showSoftInputFromInputMethod(activity.getCurrentFocus().getWindowToken(), 0);
            }
        }
        ((InputMethodManager) getSystemService("input_method")).toggleSoftInput(1, 0);
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

    /* access modifiers changed from: package-private */
    public boolean isRCValid(String str) {
        return Pattern.compile("^[a-z,A-Z]{2}[0-9]{2}[a-z,A-Z]{1,3}[0-9]{1,4}$").matcher(str).matches();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_v__search);
        setTitle("RTO vehicle information.");
        ((C0094a) Objects.requireNonNull(getSupportActionBar())).d(true);
        this.menu_item_card_view = (CardView) findViewById(R.id.menu_item_card_view);
        this.search_card = (CardView) findViewById(R.id.search_card);
        this.loading_card = (CardView) findViewById(R.id.loading_card);
        this.loading_gif = (ImageView) findViewById(R.id.loading_gif);
        this.loading_msg = (TextView) findViewById(R.id.loading_msg);
        c.a((C0159i) this).a(Integer.valueOf(R.drawable.loadinggif)).a(this.loading_gif);
        this.loading = (LinearLayout) findViewById(R.id.loading);
        this.vehiclenumber = (EditText) findViewById(R.id.vehiclenumber);
        EditText editText = this.vehiclenumber;
        if (editText != null) {
            editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    if (i != 3) {
                        return false;
                    }
                    V_SearchActivity.vehicleNo = V_SearchActivity.this.vehiclenumber.getText().toString();
                    V_SearchActivity v_SearchActivity = V_SearchActivity.this;
                    if (v_SearchActivity.vehiclenumber == null) {
                        return true;
                    }
                    v_SearchActivity.validateNumberAndSearch();
                    return true;
                }
            });
        }
        this.searchbutton = (LinearLayout) findViewById(R.id.searchbutton);
        this.searchbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                V_SearchActivity v_SearchActivity = V_SearchActivity.this;
                if (v_SearchActivity.vehiclenumber != null) {
                    v_SearchActivity.validateNumberAndSearch();
                }
            }
        });
        this.recent = (LinearLayout) findViewById(R.id.recent);
        this.recent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                V_SearchActivity v_SearchActivity = V_SearchActivity.this;
                v_SearchActivity.startActivity(new Intent(v_SearchActivity, V_RecentActivity.class));
            }
        });
        this.scan = (LinearLayout) findViewById(R.id.scan);
        this.scan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
        this.favNumber = getIntent().getStringExtra("favNumber");
        String str = this.favNumber;
        if (str != null && !str.isEmpty()) {
            this.favNumber = this.favNumber.replaceAll("\\s+", BuildConfig.FLAVOR);
            this.vehiclenumber.setText(this.favNumber);
        }
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("deeku_showOurAppSlides", BuildConfig.FLAVOR).equals("true")) {
            this.menu_item_card_view.setVisibility(0);
            this.imageModelArrayList = new ArrayList<>();
            this.imageModelArrayList = populateList();
            init101();
        } else {
            this.menu_item_card_view.setVisibility(8);
        }
        String string = PreferenceManager.getDefaultSharedPreferences(this).getString("deeku_newsearch", BuildConfig.FLAVOR);
        if (string != null && !string.equals("web")) {
            string.equals("sms");
        }
        this.fb_banner_container_search = (LinearLayout) findViewById(R.id.fb_banner_search_rc);
        this.adContainerView = (FrameLayout) findViewById(R.id.ad_view_search_rc);
        boolean showAdMobBanner = DataHandler.showAdMobBanner(this);
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("ShowBanner", "false").equals("true") && showAdMobBanner) {
            this.adContainerView.post(new Runnable() {
                public void run() {
                    V_SearchActivity.this.loadBanner();
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

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 1) {
            if (i == 3 && iArr.length > 0) {
                int i2 = iArr[0];
            }
        } else if (iArr.length > 0 && iArr[0] == 0) {
            sendSMSBasedonVersion();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        String str = fancyNumber;
        if (str != null) {
            fancyNumber = str.replaceAll("\\s+", BuildConfig.FLAVOR);
            this.vehiclenumber.setText(fancyNumber);
        }
    }

    public void setPerformSearch() {
        vregNo = vehicleNo;
        String vaccineSearch = VehicleInfoHandler.getInstance().getVaccineSearch();
        if (vaccineSearch == null) {
            return;
        }
        if (vaccineSearch.equals("sms")) {
            getWithSms();
            return;
        }
        Intent intent = new Intent(this, V_Loading.class);
        if (getIntent().hasExtra("showFin") && getIntent().getStringExtra("showFin").equals("true")) {
            intent.putExtra("showFin", "true");
        }
        if (getIntent().hasExtra("showIns") && getIntent().getStringExtra("showIns").equals("true")) {
            intent.putExtra("showIns", "true");
        }
        intent.putExtra("VNO", vehicleNo);
        startActivity(intent);
    }

    public void validateNumberAndSearch() {
        EditText editText = this.vehiclenumber;
        if (editText != null) {
            vehicleNo = editText.getText().toString().toUpperCase();
            if (isConnectedToInternet()) {
                if (!isRCValid(vehicleNo)) {
                    if (checkNum1(vehicleNo)) {
                        String substring = vehicleNo.substring(0, 2);
                        if (!substring.equals("DL") && !substring.equals("BR") && !substring.equals("GJ")) {
                            StringBuilder sb = new StringBuilder(vehicleNo);
                            sb.insert(2, '0');
                            vehicleNo = sb.toString();
                        }
                    } else if (!checkNum2(vehicleNo)) {
                        this.vehiclenumber.setError("Please enter a valid vehicle number");
                        return;
                    }
                }
                setPerformSearch();
                return;
            }
            Toast.makeText(getApplicationContext(), "No internet connection, please connect your device to internet", 1).show();
        }
    }
}
