package com.soft.tools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;

import com.a.a.Map;
import com.soft.apk008.StartActivity;
import com.soft.apk008.WebMessageActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.util.ArrayList;

public class ProcessFakeActivity
  extends Activity
{
  private static Map c = null;
  private static ArrayList d = null;
  private TextView a;
  private CheckBox b;
  
  public static void a(String[] paramArrayOfString)
  {
    String str1 = paramArrayOfString[0];
    paramArrayOfString = paramArrayOfString[1];
    if (c == null)
    {
      String str2 = PoseHelper008.getFileData("processFakeActivityIni");
      if (str2 != null) {
        str2.length();
      }
    }
    try
    {
      c = new Map();
      label39:
      if (c == null) {
        c = new Map();
      }
      c.putkey("numMin", str1);
      c.putkey("numMax", paramArrayOfString);
      PoseHelper008.saveDataToFile("processFakeActivityIni", c.a());
      return;
    }
    catch (Exception localException)
    {
      break label39;
    }
  }
  
  public static String[] a()
  {
    if (c == null)
    {
      String str = PoseHelper008.getFileData("processFakeActivityIni");
      if (str != null) {
        str.length();
      }
    }
    try
    {
      c = new Map();
      label31:
      if (c == null) {
        c = new Map();
      }
      return new String[] { c.getStringfrommap("numMin"), c.getStringfrommap("numMax") };
    }
    catch (Exception localException)
    {
      break label31;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903109);
    this.a = ((TextView)findViewById(2131362126));
    this.b = ((CheckBox)findViewById(2131362127));
    String str = PoseHelper008.getFileData("processFakeActivity");
    paramBundle = str;
    if (str == null) {
      paramBundle = "";
    }
    this.a.setText(paramBundle);
    paramBundle = PoseHelper008.getFileData("processFakeActivityIni");
    if (paramBundle != null) {
      c = Map.getmap(paramBundle);
    }
    if (c == null) {
      c = new Map();
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296277, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (c == null)
    {
      String str = PoseHelper008.getFileData("processFakeActivityIni");
      if (str != null) {
        str.length();
      }
    }
    try
    {
      c = new Map();
      label35:
      if (c == null) {
        c = new Map();
      }
      if (this.b.isChecked()) {
        c.putkey("open", "true");
      }
      for (;;)
      {
        PoseHelper008.saveDataToFile("processFakeActivityIni", c.a());
        return;
        c.putkey("close", "false");
      }
    }
    catch (Exception localException)
    {
      break label35;
    }
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131362313)
    {
      paramMenuItem = new Intent();
      paramMenuItem.putExtra("url", StartActivity.b + "/phone/ContentAction.action?action=process_fakeHelp");
      paramMenuItem.setClass(this, WebMessageActivity.class);
      startActivity(paramMenuItem);
    }
    for (;;)
    {
      return true;
      if (paramMenuItem.getItemId() == 2131362312)
      {
        paramMenuItem = new Intent();
        paramMenuItem.setClass(this, ProcessFakeSetActivity.class);
        startActivity(paramMenuItem);
      }
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.ProcessFakeActivity

 * JD-Core Version:    0.7.0.1

 */