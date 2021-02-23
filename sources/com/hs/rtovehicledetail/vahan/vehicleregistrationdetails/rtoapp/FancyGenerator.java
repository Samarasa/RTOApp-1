package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.app.o;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public class FancyGenerator extends o implements View.OnClickListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private FrameLayout adContainerView;
    private h adViewbanner;
    int endNum;
    EditText end_number;
    LinearLayout fb_banner_container_fancygenerator;
    Button find;
    int numberRepeats;
    ArrayList<String> selectedList = new ArrayList<>();
    Spinner sp;
    int startNum;
    EditText start_number;
    TextView t_1;
    TextView t_2;
    TextView t_3;
    TextView t_4;
    TextView t_5;
    TextView t_6;
    TextView t_7;
    TextView t_8;
    TextView t_9;
    TextView[] textviews;

    public static int[] convertIntegers(List<String> list) {
        int[] iArr = new int[list.size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = Integer.parseInt(list.get(i));
        }
        return iArr;
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

    public void addColor(int i) {
        int i2 = i - 1;
        this.textviews[i2].setTextColor(-1);
        this.textviews[i2].setBackgroundResource(R.drawable.circle);
    }

    public void changeColors(int i) {
        for (int i2 = 0; i2 < 9; i2++) {
            if (i2 == i - 1) {
                this.textviews[i2].setTextColor(-1);
                this.textviews[i2].setBackgroundResource(R.drawable.circle);
            } else {
                this.textviews[i2].setBackgroundResource(R.drawable.circle1);
                this.textviews[i2].setTextColor(-16776961);
            }
        }
    }

    public boolean checkName(String str) {
        return Pattern.compile("(\\d{4})").matcher(str).matches();
    }

    public void initializeViews() {
        this.selectedList.add("1");
        this.t_1 = (TextView) findViewById(R.id.t_1);
        this.t_1.setOnClickListener(this);
        this.t_2 = (TextView) findViewById(R.id.t_2);
        this.t_2.setOnClickListener(this);
        this.t_3 = (TextView) findViewById(R.id.t_3);
        this.t_3.setOnClickListener(this);
        this.t_4 = (TextView) findViewById(R.id.t_4);
        this.t_4.setOnClickListener(this);
        this.t_5 = (TextView) findViewById(R.id.t_5);
        this.t_5.setOnClickListener(this);
        this.t_6 = (TextView) findViewById(R.id.t_6);
        this.t_6.setOnClickListener(this);
        this.t_7 = (TextView) findViewById(R.id.t_7);
        this.t_7.setOnClickListener(this);
        this.t_8 = (TextView) findViewById(R.id.t_8);
        this.t_8.setOnClickListener(this);
        this.t_9 = (TextView) findViewById(R.id.t_9);
        this.t_9.setOnClickListener(this);
        this.find = (Button) findViewById(R.id.find);
        this.find.setOnClickListener(this);
        this.textviews = new TextView[]{this.t_1, this.t_2, this.t_3, this.t_4, this.t_5, this.t_6, this.t_7, this.t_8, this.t_9};
        this.start_number = (EditText) findViewById(R.id.start_number);
        this.end_number = (EditText) findViewById(R.id.end_number);
        this.sp = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.my_simple_list_item1, new String[]{"1", "2", "3", "4"});
        arrayAdapter.setDropDownViewResource(R.layout.my_simple_list_item1);
        this.sp.setAdapter(arrayAdapter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        removeColor(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        addColor(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (r2.selectedList.contains(r0) != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0075, code lost:
        if (r2.selectedList.contains(r0) != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0081, code lost:
        if (r2.selectedList.contains(r0) != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008d, code lost:
        if (r2.selectedList.contains(r0) != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0099, code lost:
        if (r2.selectedList.contains(r0) != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a5, code lost:
        if (r2.selectedList.contains(r0) != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a7, code lost:
        r2.selectedList.remove(r0);
        removeColor(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b0, code lost:
        r2.selectedList.add(r0);
        addColor(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r3) {
        /*
            r2 = this;
            int r3 = r3.getId()
            r0 = 2131362082(0x7f0a0122, float:1.8343935E38)
            if (r3 == r0) goto L_0x00b9
            switch(r3) {
                case 2131362419: goto L_0x009c;
                case 2131362420: goto L_0x0090;
                case 2131362421: goto L_0x0084;
                case 2131362422: goto L_0x0078;
                case 2131362423: goto L_0x006c;
                case 2131362424: goto L_0x0060;
                case 2131362425: goto L_0x0042;
                case 2131362426: goto L_0x0028;
                case 2131362427: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x00bc
        L_0x000e:
            java.util.ArrayList<java.lang.String> r3 = r2.selectedList
            java.lang.String r0 = "9"
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L_0x0020
            java.util.ArrayList<java.lang.String> r3 = r2.selectedList
            r3.remove(r0)
            r3 = 9
            goto L_0x0052
        L_0x0020:
            java.util.ArrayList<java.lang.String> r3 = r2.selectedList
            r3.add(r0)
            r3 = 9
            goto L_0x005c
        L_0x0028:
            java.util.ArrayList<java.lang.String> r3 = r2.selectedList
            java.lang.String r0 = "8"
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L_0x003a
            java.util.ArrayList<java.lang.String> r3 = r2.selectedList
            r3.remove(r0)
            r3 = 8
            goto L_0x0052
        L_0x003a:
            java.util.ArrayList<java.lang.String> r3 = r2.selectedList
            r3.add(r0)
            r3 = 8
            goto L_0x005c
        L_0x0042:
            java.util.ArrayList<java.lang.String> r3 = r2.selectedList
            java.lang.String r0 = "7"
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L_0x0056
            java.util.ArrayList<java.lang.String> r3 = r2.selectedList
            r3.remove(r0)
            r3 = 7
        L_0x0052:
            r2.removeColor(r3)
            goto L_0x00bc
        L_0x0056:
            java.util.ArrayList<java.lang.String> r3 = r2.selectedList
            r3.add(r0)
            r3 = 7
        L_0x005c:
            r2.addColor(r3)
            goto L_0x00bc
        L_0x0060:
            java.util.ArrayList<java.lang.String> r3 = r2.selectedList
            java.lang.String r0 = "6"
            boolean r3 = r3.contains(r0)
            r1 = 6
            if (r3 == 0) goto L_0x00b0
            goto L_0x00a7
        L_0x006c:
            java.util.ArrayList<java.lang.String> r3 = r2.selectedList
            java.lang.String r0 = "5"
            boolean r3 = r3.contains(r0)
            r1 = 5
            if (r3 == 0) goto L_0x00b0
            goto L_0x00a7
        L_0x0078:
            java.util.ArrayList<java.lang.String> r3 = r2.selectedList
            java.lang.String r0 = "4"
            boolean r3 = r3.contains(r0)
            r1 = 4
            if (r3 == 0) goto L_0x00b0
            goto L_0x00a7
        L_0x0084:
            java.util.ArrayList<java.lang.String> r3 = r2.selectedList
            java.lang.String r0 = "3"
            boolean r3 = r3.contains(r0)
            r1 = 3
            if (r3 == 0) goto L_0x00b0
            goto L_0x00a7
        L_0x0090:
            java.util.ArrayList<java.lang.String> r3 = r2.selectedList
            java.lang.String r0 = "2"
            boolean r3 = r3.contains(r0)
            r1 = 2
            if (r3 == 0) goto L_0x00b0
            goto L_0x00a7
        L_0x009c:
            java.util.ArrayList<java.lang.String> r3 = r2.selectedList
            java.lang.String r0 = "1"
            boolean r3 = r3.contains(r0)
            r1 = 1
            if (r3 == 0) goto L_0x00b0
        L_0x00a7:
            java.util.ArrayList<java.lang.String> r3 = r2.selectedList
            r3.remove(r0)
            r2.removeColor(r1)
            goto L_0x00bc
        L_0x00b0:
            java.util.ArrayList<java.lang.String> r3 = r2.selectedList
            r3.add(r0)
            r2.addColor(r1)
            goto L_0x00bc
        L_0x00b9:
            r2.validate()
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.FancyGenerator.onClick(android.view.View):void");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_fancy_generator);
        ((C0094a) Objects.requireNonNull(getSupportActionBar())).d(true);
        initializeViews();
        this.sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                FancyGenerator fancyGenerator = FancyGenerator.this;
                fancyGenerator.numberRepeats = Integer.parseInt(fancyGenerator.sp.getSelectedItem().toString());
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.fb_banner_container_fancygenerator = (LinearLayout) findViewById(R.id.fb_banner_fancy_generator);
        this.adContainerView = (FrameLayout) findViewById(R.id.ad_view_fancy);
        boolean showAdMobBanner = DataHandler.showAdMobBanner(this);
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("ShowBanner", "false").equals("true") && showAdMobBanner) {
            this.adContainerView.post(new Runnable() {
                public void run() {
                    FancyGenerator.this.loadBanner();
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

    public void removeColor(int i) {
        int i2 = i - 1;
        this.textviews[i2].setBackgroundResource(R.drawable.circle1);
        this.textviews[i2].setTextColor(-16776961);
    }

    public void validate() {
        EditText editText;
        String obj = this.start_number.getText().toString();
        String obj2 = this.end_number.getText().toString();
        if (obj.equals(BuildConfig.FLAVOR)) {
            this.start_number.setError("Please enter a valid vehicle number");
        } else {
            try {
                this.startNum = Integer.parseInt(obj.trim());
            } catch (Exception unused) {
                System.out.println();
            }
        }
        if (obj2.equals(BuildConfig.FLAVOR)) {
            this.start_number.setError("Please enter a valid vehicle number");
        } else {
            try {
                this.endNum = Integer.parseInt(obj2.trim());
            } catch (Exception unused2) {
                System.out.println();
            }
        }
        if (!checkName(obj)) {
            editText = this.start_number;
        } else if (!checkName(obj2)) {
            editText = this.end_number;
        } else if (this.selectedList.size() <= 0) {
            Toast.makeText(this, "Please select a lucky number", 0).show();
            return;
        } else {
            Intent intent = new Intent(this, FancyNumberResult.class);
            intent.putExtra("START_SERIES", this.startNum);
            intent.putExtra("END_SERIES", this.endNum);
            intent.putExtra("REPEATS", this.numberRepeats);
            intent.putExtra("SENTIMENT_NUMBER", convertIntegers(this.selectedList));
            startActivity(intent);
            return;
        }
        editText.setError("Please enter a valid vehicle number");
    }
}
