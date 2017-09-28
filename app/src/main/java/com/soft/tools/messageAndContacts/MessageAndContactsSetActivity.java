package com.soft.tools.messageAndContacts;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.a.a.Map;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.util.Random;

public class MessageAndContactsSetActivity
  extends Activity
{
  public static Random a = new Random(System.currentTimeMillis());
  private static Map g = null;
  private CheckBox b;
  private EditText c;
  private EditText d;
  private EditText e;
  private EditText f;
  
  public static int a()
  {
    if (g == null) {}
    try
    {
      g = a.b(PoseHelper008.getFileData("messageAndContacts"));
      label17:
      if (g == null) {
        g = new Map();
      }
      String str1 = g.get("getRandomSmsCount");
      String str2 = g.getStringfrommap("smsFloat");
      int i = 20;
      int k = 10;
      try
      {
        j = Integer.parseInt(str1);
        i = j;
        int m = Integer.parseInt(str2);
        k = m;
        i = j;
      }
      catch (Exception localException1)
      {
        int j;
        label103:
        break label103;
      }
      if (a.nextInt(1) == 0) {}
      for (j = -a.nextInt(k);; j = a.nextInt(k)) {
        return j + i;
      }
    }
    catch (Exception localException2)
    {
      break label17;
    }
  }
  
  public static void a(int paramInt1, int paramInt2)
  {
    if (g == null) {}
    try
    {
      g = a.b(PoseHelper008.getFileData("messageAndContacts"));
      label17:
      g = new Map();
      g.putkey("getRandomSmsCount", paramInt1);
      g.putkey("smsFloat", paramInt2);
      return;
    }
    catch (Exception localException)
    {
      break label17;
    }
  }
  
  public static int b()
  {
    if (g == null) {}
    try
    {
      g = a.b(PoseHelper008.getFileData("messageAndContacts"));
      label17:
      if (g == null) {
        g = new Map();
      }
      String str1 = g.get("getRandomPhoneCount");
      String str2 = g.getStringfrommap("phoneFloat");
      int i = 20;
      int k = 10;
      try
      {
        j = Integer.parseInt(str1);
        i = j;
        int m = Integer.parseInt(str2);
        k = m;
        i = j;
      }
      catch (Exception localException1)
      {
        int j;
        label103:
        break label103;
      }
      if (a.nextInt(1) == 0) {}
      for (j = -a.nextInt(k);; j = a.nextInt(k)) {
        return j + i;
      }
    }
    catch (Exception localException2)
    {
      break label17;
    }
  }
  
  public static void b(int paramInt1, int paramInt2)
  {
    if (g == null) {}
    try
    {
      g = a.b(PoseHelper008.getFileData("messageAndContacts"));
      label17:
      g = new Map();
      g.putkey("getRandomPhoneCount", paramInt1);
      g.putkey("phoneFloat", paramInt2);
      return;
    }
    catch (Exception localException)
    {
      break label17;
    }
  }
  
  public static boolean c()
  {
    try
    {
      g = a.b(PoseHelper008.getFileData("messageAndContacts"));
      label11:
      if (g == null) {
        g = new Map();
      }
      return "true".equals(g.get("open"));
    }
    catch (Exception localException)
    {
      break label11;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903087);
    this.b = ((CheckBox)findViewById(2131362051));
    this.c = ((EditText)findViewById(2131362048));
    this.d = ((EditText)findViewById(2131362049));
    this.f = ((EditText)findViewById(2131362046));
    this.e = ((EditText)findViewById(2131362047));
    try
    {
      g = a.b(PoseHelper008.getFileData("messageAndContacts"));
      label87:
      if (g == null) {
        g = new Map();
      }
      if (c()) {
        this.b.setChecked(true);
      }
      this.c.setText("20");
      this.d.setText("10");
      this.f.setText("20");
      this.e.setText("10");
      if (g.get("getRandomSmsCount") != null) {
        this.c.setText(g.get("getRandomSmsCount"));
      }
      if (g.get("smsFloat") != null) {
        this.d.setText(g.get("smsFloat"));
      }
      if (g.get("getRandomPhoneCount") != null) {
        this.f.setText(g.get("getRandomPhoneCount"));
      }
      if (g.get("phoneFloat") != null) {
        this.e.setText(g.get("phoneFloat"));
      }
      ((Button)findViewById(2131362050)).setOnClickListener(new g(this));
      return;
    }
    catch (Exception paramBundle)
    {
      break label87;
    }
  }
  
  protected void onPause()
  {
    if (this.b.isChecked()) {
      g.putkey("open", "true");
    }
    for (;;)
    {
      PoseHelper008.saveDataToFile("messageAndContacts", g.a());
      super.onPause();
      return;
      g.putkey("open", "false");
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.messageAndContacts.MessageAndContactsSetActivity

 * JD-Core Version:    0.7.0.1

 */