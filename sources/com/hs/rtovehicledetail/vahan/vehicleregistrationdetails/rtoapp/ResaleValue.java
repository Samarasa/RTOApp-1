package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.app.o;
import c.c.a.a.c;
import c.c.a.a.e;
import c.c.a.a.j;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class ResaleValue extends o {
    private static final String[] paths = {"item 1", "item 2", "item 3"};
    Button check_rv;
    String fromCat;
    ImageView go_back;
    EditText km_driven;
    ImageView loading_gif;
    TextView loading_text;
    ArrayList<String> makers = new ArrayList<>();
    ArrayList<String> models = new ArrayList<>();
    /* access modifiers changed from: private */
    public Spinner spinner;
    /* access modifiers changed from: private */
    public Spinner spinnerModel;
    /* access modifiers changed from: private */
    public Spinner spinnerTrim;
    /* access modifiers changed from: private */
    public Spinner spinnerYear;
    ArrayList<String> trim = new ArrayList<>();
    ArrayList<String> years = new ArrayList<>();

    private void getMake() {
        c cVar = new c();
        cVar.a("Content-Type", "application/x-www-form-urlencoded");
        cVar.a(7000);
        cVar.a(VehicleInfoHandler.getInstance().getResaleSelection() + "?&category_id=" + this.fromCat + "&api_version=3", (j) new e() {
            public void onFailure(int i, Throwable th, String str) {
                System.out.println();
            }

            public void onSuccess(String str) {
                try {
                    JSONArray jSONArray = new JSONObject(str).getJSONArray("data");
                    if (jSONArray != null && jSONArray.length() > 0) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            if (jSONObject.getBoolean("selectable")) {
                                ResaleValue.this.makers.add(jSONObject.getString("name"));
                            }
                        }
                        ArrayAdapter arrayAdapter = new ArrayAdapter(ResaleValue.this, 17367048, ResaleValue.this.makers);
                        arrayAdapter.setDropDownViewResource(17367049);
                        ResaleValue.this.spinner.setAdapter(arrayAdapter);
                        ResaleValue.this.loading_gif.setAlpha(0);
                    }
                } catch (Exception e2) {
                    PrintStream printStream = System.out;
                    printStream.println("e" + e2);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void getModel() {
        String str;
        if (VehicleInfoHandler.getInstance().getResaleSelection() != null) {
            str = VehicleInfoHandler.getInstance().getResaleSelection() + "?&category_id=" + this.fromCat + "&make=" + this.spinner.getSelectedItem().toString() + "&api_version=3";
        } else {
            str = null;
        }
        parseModels("models", str);
    }

    /* access modifiers changed from: private */
    public void getResaleValue() {
        if (VehicleInfoHandler.getInstance().getObvheader() != null && !this.fromCat.equals(BuildConfig.FLAVOR) && VehicleInfoHandler.getInstance().getObvheader() != null && VehicleInfoHandler.getInstance().getResaleValue() != null && VehicleInfoHandler.getInstance().getObvheader().length() > 1 && VehicleInfoHandler.getInstance().getResaleValue().length() > 1) {
            c cVar = new c();
            cVar.a("Content-Type", "application/x-www-form-urlencoded");
            cVar.a("obvheader", VehicleInfoHandler.getInstance().getObvheader());
            cVar.a(7000);
            cVar.a(VehicleInfoHandler.getInstance().getResaleValue() + "?category_id=" + this.fromCat + "&make=" + this.spinner.getSelectedItem().toString() + "&model=" + this.spinnerModel.getSelectedItem().toString() + "&year=" + this.spinnerYear.getSelectedItem().toString() + "&trim=" + this.spinnerTrim.getSelectedItem().toString() + "&transaction_type=s&customer_type=individual&kms_driven=" + this.km_driven.getText().toString(), (j) new e() {
                public void onFailure(int i, Throwable th, String str) {
                    System.out.println();
                }

                public void onSuccess(String str) {
                    try {
                        if (new JSONObject(str).getString("code").equals("success")) {
                            ResaleValue.this.startActivity(new Intent(ResaleValue.this, ValueOfVehicle.class).putExtra("result", str));
                        }
                        ResaleValue.this.loading_text.setVisibility(8);
                    } catch (Exception e2) {
                        PrintStream printStream = System.out;
                        printStream.println("e" + e2);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void getTrim() {
        String str;
        if (VehicleInfoHandler.getInstance().getResaleSelection() != null) {
            str = VehicleInfoHandler.getInstance().getResaleSelection() + "?&category_id=" + this.fromCat + "&make=" + this.spinner.getSelectedItem().toString() + "&model=" + this.spinnerModel.getSelectedItem().toString() + "&year=" + this.spinnerYear.getSelectedItem().toString() + "&check_obv=1&api_version=3";
        } else {
            str = null;
        }
        parseModels("trim", str);
    }

    /* access modifiers changed from: private */
    public void getYear() {
        String str;
        if (VehicleInfoHandler.getInstance().getResaleSelection() != null) {
            str = VehicleInfoHandler.getInstance().getResaleSelection() + "?&category_id=" + this.fromCat + "&make=" + this.spinner.getSelectedItem().toString() + "&model=" + this.spinnerModel.getSelectedItem().toString() + "&api_version=3";
        } else {
            str = null;
        }
        parseModels("years", str);
    }

    private void parseModels(final String str, String str2) {
        c cVar = new c();
        cVar.a("Content-Type", "application/x-www-form-urlencoded");
        cVar.a(7000);
        cVar.a(str2, (j) new e() {
            public void onFailure(int i, Throwable th, String str) {
                System.out.println();
            }

            public void onSuccess(String str) {
                JSONArray jSONArray;
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (str.equals("models")) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("data");
                        if (jSONArray2 != null && jSONArray2.length() > 0) {
                            for (int i = 0; i < jSONArray2.length(); i++) {
                                ResaleValue.this.models.add(jSONArray2.get(i).toString());
                            }
                            ArrayAdapter arrayAdapter = new ArrayAdapter(ResaleValue.this, 17367048, ResaleValue.this.models);
                            arrayAdapter.setDropDownViewResource(17367049);
                            ResaleValue.this.spinnerModel.setAdapter(arrayAdapter);
                        }
                    } else if (str.equals("years")) {
                        JSONArray jSONArray3 = jSONObject.getJSONArray("data");
                        if (jSONArray3 != null && jSONArray3.length() > 0) {
                            for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                                ResaleValue.this.years.add(jSONArray3.get(i2).toString());
                                ArrayAdapter arrayAdapter2 = new ArrayAdapter(ResaleValue.this, 17367048, ResaleValue.this.years);
                                arrayAdapter2.setDropDownViewResource(17367049);
                                ResaleValue.this.spinnerYear.setAdapter(arrayAdapter2);
                            }
                        }
                    } else if (str.equals("trim") && (jSONArray = jSONObject.getJSONObject("data").getJSONArray("result")) != null && jSONArray.length() > 0) {
                        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                            ResaleValue.this.trim.add(jSONArray.get(i3).toString());
                            ArrayAdapter arrayAdapter3 = new ArrayAdapter(ResaleValue.this, 17367048, ResaleValue.this.trim);
                            arrayAdapter3.setDropDownViewResource(17367049);
                            ResaleValue.this.spinnerTrim.setAdapter(arrayAdapter3);
                        }
                    }
                    ResaleValue.this.loading_gif.setAlpha(0);
                } catch (Exception e2) {
                    PrintStream printStream = System.out;
                    printStream.println("e" + e2);
                }
            }
        });
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_resale_value);
        ((C0094a) Objects.requireNonNull(getSupportActionBar())).d(true);
        setTitle("Resale Value");
        this.fromCat = getIntent().getStringExtra("cat");
        this.loading_gif = (ImageView) findViewById(R.id.loading_gif);
        this.loading_text = (TextView) findViewById(R.id.loading_text);
        getMake();
        this.km_driven = (EditText) findViewById(R.id.km_driven);
        this.check_rv = (Button) findViewById(R.id.check_rv);
        this.spinner = (Spinner) findViewById(R.id.spinner);
        this.makers.add("Select Maker");
        this.spinnerModel = (Spinner) findViewById(R.id.spinnerModel);
        this.models.add("Select Model");
        this.spinnerYear = (Spinner) findViewById(R.id.spinnerYear);
        this.years.add("Select Year");
        this.spinnerTrim = (Spinner) findViewById(R.id.spinnerTrim);
        this.trim.add("Select Trim");
        this.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                ResaleValue.this.loading_gif.setAlpha(1.0f);
                ResaleValue.this.models = new ArrayList<>();
                ResaleValue.this.models.add("Select Model");
                ResaleValue resaleValue = ResaleValue.this;
                ArrayAdapter arrayAdapter = new ArrayAdapter(resaleValue, 17367048, resaleValue.models);
                arrayAdapter.setDropDownViewResource(17367049);
                ResaleValue.this.spinnerModel.setAdapter(arrayAdapter);
                ResaleValue.this.years = new ArrayList<>();
                ResaleValue.this.years.add("Select Year");
                ResaleValue resaleValue2 = ResaleValue.this;
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(resaleValue2, 17367048, resaleValue2.years);
                arrayAdapter2.setDropDownViewResource(17367049);
                ResaleValue.this.spinnerYear.setAdapter(arrayAdapter2);
                ResaleValue.this.trim = new ArrayList<>();
                ResaleValue.this.trim.add("Select Trim");
                ResaleValue resaleValue3 = ResaleValue.this;
                ArrayAdapter arrayAdapter3 = new ArrayAdapter(resaleValue3, 17367048, resaleValue3.trim);
                arrayAdapter3.setDropDownViewResource(17367049);
                ResaleValue.this.spinnerTrim.setAdapter(arrayAdapter3);
                ResaleValue.this.getModel();
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.spinnerModel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                ResaleValue.this.loading_gif.setAlpha(1.0f);
                ResaleValue.this.years = new ArrayList<>();
                ResaleValue.this.years.add("Select Year");
                ResaleValue resaleValue = ResaleValue.this;
                ArrayAdapter arrayAdapter = new ArrayAdapter(resaleValue, 17367048, resaleValue.years);
                arrayAdapter.setDropDownViewResource(17367049);
                ResaleValue.this.spinnerYear.setAdapter(arrayAdapter);
                ResaleValue.this.trim = new ArrayList<>();
                ResaleValue.this.trim.add("Select Trim");
                ResaleValue resaleValue2 = ResaleValue.this;
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(resaleValue2, 17367048, resaleValue2.trim);
                arrayAdapter2.setDropDownViewResource(17367049);
                ResaleValue.this.spinnerTrim.setAdapter(arrayAdapter2);
                ResaleValue.this.getYear();
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.spinnerYear.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                ResaleValue.this.loading_gif.setAlpha(1.0f);
                ResaleValue.this.trim = new ArrayList<>();
                ResaleValue.this.trim.add("Select Trim");
                ResaleValue resaleValue = ResaleValue.this;
                ArrayAdapter arrayAdapter = new ArrayAdapter(resaleValue, 17367048, resaleValue.trim);
                arrayAdapter.setDropDownViewResource(17367049);
                ResaleValue.this.spinnerTrim.setAdapter(arrayAdapter);
                ResaleValue.this.getTrim();
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.spinnerTrim.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        this.check_rv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ResaleValue resaleValue;
                String str;
                if (!ResaleValue.this.km_driven.getText().toString().equals(BuildConfig.FLAVOR)) {
                    if (ResaleValue.this.spinner.getSelectedItem() == null || ResaleValue.this.spinnerModel.getSelectedItem() == null || ResaleValue.this.spinnerYear.getSelectedItem() == null || ResaleValue.this.spinnerTrim.getSelectedItem() == null) {
                        resaleValue = ResaleValue.this;
                        str = "Select All Values";
                    } else {
                        str = "Select Maker";
                        if (!ResaleValue.this.spinner.getSelectedItem().toString().equals(str)) {
                            str = "Select Model";
                            if (!ResaleValue.this.spinnerModel.getSelectedItem().toString().equals(str)) {
                                str = "Select Year";
                                if (!ResaleValue.this.spinnerYear.getSelectedItem().toString().equals(str)) {
                                    str = "Select Trim";
                                    if (!ResaleValue.this.spinnerTrim.getSelectedItem().toString().equals(str)) {
                                        ResaleValue.this.loading_gif.setVisibility(8);
                                        View currentFocus = ResaleValue.this.getCurrentFocus();
                                        if (currentFocus != null) {
                                            ((InputMethodManager) ResaleValue.this.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                                        }
                                        ResaleValue.this.loading_text.setVisibility(0);
                                        ResaleValue.this.getResaleValue();
                                        return;
                                    }
                                }
                            }
                        }
                        resaleValue = ResaleValue.this;
                    }
                    Toast.makeText(resaleValue, str, 0).show();
                    return;
                }
                ResaleValue.this.km_driven.setError("Please Enter Kms driven");
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
