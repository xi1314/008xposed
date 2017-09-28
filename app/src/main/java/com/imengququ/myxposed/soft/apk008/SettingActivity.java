package com.imengququ.myxposed.soft.apk008;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class SettingActivity
  extends Activity
{
  public static final String fileName = "settings";
  static Boolean log = null;
  public static JSONObject object;
  private Button button;
  private CheckBox clearAppCheck;
  private CheckBox imeiCheck;
  private EditText imeiHead;
  private CheckBox imsiCheck;
  private EditText imsiHead;
  private CheckBox logCheck;
  private CheckBox modalCheck;
  private CheckBox sdkCheck;
  private CheckBox setCard;
  private CheckBox setCloseCheck;
  private CheckBox setDeleteFile;
  private CheckBox setDeleteSystem;
  private CheckBox setDisplay;
  private CheckBox setImei14;
  private CheckBox setOpenMac;
  private CheckBox setScan;
  private CheckBox setUserMyDB;
  
  public static String getValue(String paramString)
  {
    if (object == null) {}
    try
    {
      object = JSON.parseObject(PoseHelper008.getFileData("settings"));
      if (object == null) {
        object = new JSONObject();
      }
      if (object.get(paramString) == null) {
        return "";
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
    return object.get(paramString);
  }
  
  public static boolean isLog()
  {
    if (log == null) {
      if (!"true".equals(getValue("logCheck"))) {
        break label33;
      }
    }
    label33:
    for (log = Boolean.valueOf(true);; log = Boolean.valueOf(false)) {
      return log.booleanValue();
    }
  }
  
  public static void save()
  {
    PoseHelper008.saveDataToFile("settings", JSON.toJSONString(object));
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903062);
    this.imeiHead = ((EditText)findViewById(2131230831));
    this.imeiCheck = ((CheckBox)findViewById(2131230829));
    this.logCheck = ((CheckBox)findViewById(2131230828));
    this.imsiCheck = ((CheckBox)findViewById(2131230832));
    this.imsiHead = ((EditText)findViewById(2131230833));
    this.modalCheck = ((CheckBox)findViewById(2131230834));
    this.sdkCheck = ((CheckBox)findViewById(2131230835));
    this.clearAppCheck = ((CheckBox)findViewById(2131230837));
    this.setCloseCheck = ((CheckBox)findViewById(2131230836));
    this.setScan = ((CheckBox)findViewById(2131230838));
    this.setDisplay = ((CheckBox)findViewById(2131230839));
    this.setImei14 = ((CheckBox)findViewById(2131230830));
    this.setOpenMac = ((CheckBox)findViewById(2131230840));
    this.setCard = ((CheckBox)findViewById(2131230841));
    this.setDeleteFile = ((CheckBox)findViewById(2131230842));
    this.setDeleteSystem = ((CheckBox)findViewById(2131230843));
    this.setUserMyDB = ((CheckBox)findViewById(2131230844));
    paramBundle = getValue("imeiHead");
    this.imeiHead.setText(paramBundle);
    label288:
    label309:
    label344:
    label365:
    int i;
    if (getValue("imeiCheck").equals("false"))
    {
      this.imeiCheck.setChecked(false);
      if (!getValue("logCheck").equals("true")) {
        break label621;
      }
      this.logCheck.setChecked(true);
      if (!getValue("imsiCheck").equals("false")) {
        break label632;
      }
      this.imsiCheck.setChecked(false);
      paramBundle = getValue("imsiHead");
      this.imsiHead.setText(paramBundle);
      if (!getValue("modalCheck").equals("false")) {
        break label643;
      }
      this.modalCheck.setChecked(false);
      if (!getValue("sdkCheck").equals("false")) {
        break label654;
      }
      this.sdkCheck.setChecked(false);
      if (!getValue("clearAppCheck").equals("false")) {
        break label665;
      }
      this.clearAppCheck.setChecked(false);
      label386:
      if (!getValue("setCloseCheck").equals("false")) {
        break label676;
      }
      this.setCloseCheck.setChecked(false);
      label407:
      if (!getValue("setScan").equals("false")) {
        break label687;
      }
      this.setScan.setChecked(false);
      label428:
      if (!getValue("setDisplay").equals("false")) {
        break label698;
      }
      this.setDisplay.setChecked(false);
      label449:
      if (!getValue("setImei14").equals("true")) {
        break label709;
      }
      this.setImei14.setChecked(true);
      label470:
      if (!getValue("setOpenMac").equals("false")) {
        break label720;
      }
      this.setOpenMac.setChecked(false);
      label491:
      if (!getValue("setCard").equals("true")) {
        break label731;
      }
      this.setCard.setChecked(true);
      label512:
      if (!StartActivity.isVip)
      {
        this.setCard.setEnabled(false);
        this.setCard.setChecked(false);
      }
      if (getValue("setDeleteFile").equals("false")) {
        break label742;
      }
      this.setDeleteFile.setChecked(true);
      label555:
      if (getValue("setDeleteSystem").equals("false")) {
        break label753;
      }
      this.setDeleteSystem.setChecked(true);
      label576:
      if (!getValue("setUserMyDB").equals("true")) {
        break label764;
      }
      this.setUserMyDB.setChecked(true);
      label597:
      i = 0;
    }
    for (;;)
    {
      if (i >= SetDataActivity.c.length())
      {
        return;
        this.imeiCheck.setChecked(true);
        break;
        label621:
        this.logCheck.setChecked(false);
        break label288;
        label632:
        this.imsiCheck.setChecked(true);
        break label309;
        label643:
        this.modalCheck.setChecked(true);
        break label344;
        label654:
        this.sdkCheck.setChecked(true);
        break label365;
        label665:
        this.clearAppCheck.setChecked(true);
        break label386;
        label676:
        this.setCloseCheck.setChecked(true);
        break label407;
        label687:
        this.setScan.setChecked(true);
        break label428;
        label698:
        this.setDisplay.setChecked(true);
        break label449;
        label709:
        this.setImei14.setChecked(false);
        break label470;
        label720:
        this.setOpenMac.setChecked(true);
        break label491;
        label731:
        this.setCard.setChecked(false);
        break label512;
        label742:
        this.setDeleteFile.setChecked(false);
        break label555;
        label753:
        this.setDeleteSystem.setChecked(false);
        break label576;
        label764:
        this.setUserMyDB.setChecked(false);
        break label597;
      }
      SetDataActivity.k.length();
      SetDataActivity.a.length();
      i += 1;
    }
  }
  
  protected void onDestroy()
  {
    if (this.imeiHead.getText().toString().length() >= 15) {
      Toast.makeText(this, "序列号前缀长度不能大于15位", 1).show();
    }
    if (this.imsiHead.getText().toString().length() >= 15) {
      Toast.makeText(this, "IMSI前缀长度不能大于15位", 1).show();
    }
    String str = this.imeiHead.getText().toString().trim();
    object.put("imeiHead", str);
    str = this.imsiHead.getText().toString().trim();
    object.put("imsiHead", str);
    if (this.imeiCheck.isChecked())
    {
      object.put("imeiCheck", "true");
      if (!this.logCheck.isChecked()) {
        break label449;
      }
      object.put("logCheck", "true");
      label154:
      if (!this.imsiCheck.isChecked()) {
        break label463;
      }
      object.put("imsiCheck", "true");
      label175:
      if (!this.modalCheck.isChecked()) {
        break label477;
      }
      object.put("modalCheck", "true");
      label196:
      if (!this.sdkCheck.isChecked()) {
        break label491;
      }
      object.put("sdkCheck", "true");
      label217:
      if (!this.clearAppCheck.isChecked()) {
        break label505;
      }
      object.put("clearAppCheck", "true");
      label238:
      if (!this.setCloseCheck.isChecked()) {
        break label519;
      }
      object.put("setCloseCheck", "true");
      label259:
      if (!this.setScan.isChecked()) {
        break label533;
      }
      object.put("setScan", "true");
      label280:
      if (!this.setDisplay.isChecked()) {
        break label547;
      }
      object.put("setDisplay", "true");
      label301:
      if (!this.setImei14.isChecked()) {
        break label561;
      }
      object.put("setImei14", "true");
      label322:
      if (!this.setOpenMac.isChecked()) {
        break label575;
      }
      object.put("setOpenMac", "true");
      label343:
      if (!this.setCard.isChecked()) {
        break label589;
      }
      object.put("setCard", "true");
      label364:
      if (!this.setDeleteSystem.isChecked()) {
        break label603;
      }
      object.put("setDeleteSystem", "true");
      label385:
      if (!this.setDeleteFile.isChecked()) {
        break label617;
      }
      object.put("setDeleteFile", "true");
      label406:
      if (!this.setUserMyDB.isChecked()) {
        break label631;
      }
      object.put("setUserMyDB", "true");
    }
    for (;;)
    {
      save();
      super.onDestroy();
      return;
      object.put("imeiCheck", "false");
      break;
      label449:
      object.put("logCheck", "false");
      break label154;
      label463:
      object.put("imsiCheck", "false");
      break label175;
      label477:
      object.put("modalCheck", "false");
      break label196;
      label491:
      object.put("sdkCheck", "false");
      break label217;
      label505:
      object.put("clearAppCheck", "false");
      break label238;
      label519:
      object.put("setCloseCheck", "false");
      break label259;
      label533:
      object.put("setScan", "false");
      break label280;
      label547:
      object.put("setDisplay", "false");
      break label301;
      label561:
      object.put("setImei14", "false");
      break label322;
      label575:
      object.put("setOpenMac", "false");
      break label343;
      label589:
      object.put("setCard", "false");
      break label364;
      label603:
      object.put("setDeleteSystem", "false");
      break label385;
      label617:
      object.put("setDeleteFile", "false");
      break label406;
      label631:
      object.put("setUserMyDB", "false");
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     SettingActivity

 * JD-Core Version:    0.7.0.1

 */