package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONParser {
    public static String createRCJSON(RCDetails rCDetails) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", 0);
            jSONObject.put("rn", rCDetails.getRegNo());
            jSONObject.put("on", rCDetails.getOwnerName());
            jSONObject.put("fn", rCDetails.getFatherName());
            jSONObject.put("en", rCDetails.getEngineNo());
            jSONObject.put("cn", rCDetails.getChasisNo());
            jSONObject.put("vt", rCDetails.getVehicleClassDesc());
            jSONObject.put("ft", rCDetails.getFuelType());
            jSONObject.put("iv", rCDetails.getInsuranceUpto());
            jSONObject.put("fv", rCDetails.getFitUpTo());
            jSONObject.put("pv", rCDetails.getPermitUpTo());
            jSONObject.put("tv", rCDetails.getTaxUpTo());
            jSONObject.put("c", rCDetails.getColor());
            jSONObject.put("sc", rCDetails.getSeatingCap());
            jSONObject.put("stc", rCDetails.getStandingCap());
            jSONObject.put("slc", rCDetails.getSleeperCap());
            return jSONObject.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String getRCInputJSON(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reg_no", str);
            jSONObject.put("token", str2);
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public RCDetails getRCDetails(String str) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.getInt("status") != 200) {
                return null;
            }
            RCDetails rCDetails = new RCDetails();
            rCDetails.setStatusMsg(jSONObject.getString("message"));
            if (!jSONObject.has("result")) {
                return rCDetails;
            }
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("result"));
            if (jSONObject2.getString("stautsMessage").equalsIgnoreCase("Vehicle Data Not Found")) {
                System.out.println("Vehicle Data Not Found");
            }
            if (jSONObject2.has("stautsMessage")) {
                if (jSONObject2.getString("stautsMessage").equalsIgnoreCase("OK")) {
                    rCDetails.setStatus(true);
                    if (jSONObject2.has("rc_regn_no")) {
                        String string = jSONObject2.getString("rc_regn_no");
                        if (string == null || string.length() <= 0) {
                            str2 = "OK";
                        } else {
                            StringBuilder sb = new StringBuilder();
                            str2 = "OK";
                            sb.append(string.substring(0, string.length() - 4).trim());
                            sb.append(string.substring(string.length() - 4).trim());
                            string = sb.toString();
                        }
                        rCDetails.setRegNo(string);
                    } else {
                        str2 = "OK";
                        rCDetails.setRegNo(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_regn_dt")) {
                        rCDetails.setRegDate(jSONObject2.getString("rc_regn_dt"));
                    } else {
                        rCDetails.setRegDate(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_owner_sr")) {
                        rCDetails.setOwnerSr(jSONObject2.getString("rc_owner_sr"));
                    } else {
                        rCDetails.setOwnerSr(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_owner_name")) {
                        rCDetails.setOwnerName(jSONObject2.getString("rc_owner_name"));
                    } else {
                        rCDetails.setOwnerName(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_f_name")) {
                        rCDetails.setFatherName(jSONObject2.getString("rc_f_name"));
                    } else {
                        rCDetails.setFatherName(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_present_address")) {
                        rCDetails.setPresentAddr(jSONObject2.getString("rc_present_address"));
                    } else {
                        rCDetails.setPresentAddr(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_permanent_address")) {
                        rCDetails.setPermanentAddr(jSONObject2.getString("rc_permanent_address"));
                    } else {
                        rCDetails.setPermanentAddr(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_vh_class_desc")) {
                        rCDetails.setVehicleClassDesc(jSONObject2.getString("rc_vh_class_desc"));
                        rCDetails.setVehicleClass(jSONObject2.getString("rc_vh_class_desc"));
                    } else {
                        rCDetails.setVehicleClassDesc(BuildConfig.FLAVOR);
                        rCDetails.setVehicleClass(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_chasi_no")) {
                        rCDetails.setChasisNo(jSONObject2.getString("rc_chasi_no"));
                        ((String) jSONObject2.getString("rc_chasi_no").subSequence(0, jSONObject2.getString("rc_chasi_no").length() - 5)) + "XXXXX";
                    } else {
                        rCDetails.setChasisNo(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_eng_no")) {
                        rCDetails.setEngineNo(jSONObject2.getString("rc_eng_no"));
                        ((String) jSONObject2.getString("rc_eng_no").subSequence(0, jSONObject2.getString("rc_eng_no").length() - 5)) + "XXXXX";
                    } else {
                        rCDetails.setEngineNo(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_maker_desc")) {
                        rCDetails.setMakerDesc(jSONObject2.getString("rc_maker_desc"));
                    } else {
                        rCDetails.setMakerDesc(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_maker_model")) {
                        rCDetails.setMakerModel(jSONObject2.getString("rc_maker_model"));
                    } else {
                        rCDetails.setMakerModel(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_body_type_desc")) {
                        rCDetails.setBodyTypeDesc(jSONObject2.getString("rc_body_type_desc"));
                    } else {
                        rCDetails.setBodyTypeDesc(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_fuel_desc")) {
                        rCDetails.setFuelType(jSONObject2.getString("rc_fuel_desc"));
                    } else {
                        rCDetails.setFuelType(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_color")) {
                        rCDetails.setColor(jSONObject2.getString("rc_color"));
                    } else {
                        rCDetails.setColor(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_norms_desc")) {
                        rCDetails.setNormsDesc(jSONObject2.getString("rc_norms_desc"));
                    } else {
                        rCDetails.setNormsDesc(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_fit_upto")) {
                        rCDetails.setFitUpTo(jSONObject2.getString("rc_fit_upto"));
                    } else {
                        rCDetails.setFitUpTo(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_tax_upto")) {
                        rCDetails.setTaxUpTo(jSONObject2.getString("rc_tax_upto"));
                    } else {
                        rCDetails.setTaxUpTo(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_np_no")) {
                        rCDetails.setPermitNo(jSONObject2.getString("rc_np_no"));
                    } else {
                        rCDetails.setPermitNo(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_np_upto")) {
                        rCDetails.setPermitUpTo(jSONObject2.getString("rc_np_upto"));
                    } else {
                        rCDetails.setPermitUpTo(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_financer")) {
                        rCDetails.setFinancer(jSONObject2.getString("rc_financer"));
                    } else {
                        rCDetails.setFinancer(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_insurance_comp")) {
                        rCDetails.setInsuranceCompany(jSONObject2.getString("rc_insurance_comp"));
                    } else {
                        rCDetails.setInsuranceCompany(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_insurance_policy_no")) {
                        rCDetails.setInsurancePolicyNo(jSONObject2.getString("rc_insurance_policy_no"));
                    } else {
                        rCDetails.setInsurancePolicyNo(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_insurance_upto")) {
                        rCDetails.setInsuranceUpto(jSONObject2.getString("rc_insurance_upto"));
                    } else {
                        rCDetails.setInsuranceUpto(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_manu_month_yr")) {
                        rCDetails.setManufecturingMonth(jSONObject2.getString("rc_manu_month_yr"));
                    } else {
                        rCDetails.setManufecturingMonth(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_unld_wt")) {
                        rCDetails.setUnladenWeight(jSONObject2.getString("rc_unld_wt"));
                    } else {
                        rCDetails.setUnladenWeight(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_gvw")) {
                        rCDetails.setLadenWeight(jSONObject2.getString("rc_gvw"));
                    } else {
                        rCDetails.setLadenWeight(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_no_cyl")) {
                        rCDetails.setNoOfCylender(jSONObject2.getString("rc_no_cyl"));
                    } else {
                        rCDetails.setNoOfCylender(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_cubic_cap")) {
                        rCDetails.setCublicCap(jSONObject2.getString("rc_cubic_cap"));
                    } else {
                        rCDetails.setCublicCap(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_seat_cap")) {
                        rCDetails.setSeatingCap(jSONObject2.getString("rc_seat_cap"));
                    } else {
                        rCDetails.setSeatingCap(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_sleeper_cap")) {
                        rCDetails.setSleeperCap(jSONObject2.getString("rc_sleeper_cap"));
                    } else {
                        rCDetails.setSleeperCap(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_stand_cap")) {
                        rCDetails.setStandingCap(jSONObject2.getString("rc_stand_cap"));
                    } else {
                        rCDetails.setStandingCap(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_wheelbase")) {
                        rCDetails.setWheelbase(jSONObject2.getString("rc_wheelbase"));
                    } else {
                        rCDetails.setWheelbase(BuildConfig.FLAVOR);
                    }
                    if (jSONObject2.has("rc_registered_at")) {
                        rCDetails.setRegisteredAt(jSONObject2.getString("rc_registered_at"));
                    } else {
                        rCDetails.setRegisteredAt(BuildConfig.FLAVOR);
                    }
                    jSONObject2.getString("stautsMessage").equalsIgnoreCase(str2);
                    if (jSONObject2.has("rc_status_as_on")) {
                        rCDetails.setStatusAsOn(jSONObject2.getString("rc_status_as_on"));
                        return rCDetails;
                    }
                    rCDetails.setStatusAsOn(BuildConfig.FLAVOR);
                }
            }
            return rCDetails;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        } catch (Exception e3) {
            e3.printStackTrace();
            return null;
        }
    }
}
