package com.imengququ.myxposed.soft.tools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import com.alibaba.fastjson.JSONObject;
import com.soft.toos.findApp.QuickFindActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class WebViewHookActivity
  extends Activity
{
  private Button clear;
  private Button copy;
  private EditText edit;
  public OnClickListener listener = new OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView.equals(WebViewHookActivity.this.set))
      {
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(WebViewHookActivity.this, QuickFindActivity.class);
        WebViewHookActivity.this.startActivityForResult(paramAnonymousView, 1);
      }
      do
      {
        return;
        if (paramAnonymousView.equals(WebViewHookActivity.this.clear))
        {
          WebViewHookActivity.this.log.setText("");
          WebViewHookActivity.clearContent();
          return;
        }
      } while (!paramAnonymousView.equals(WebViewHookActivity.this.copy));
      ((ClipboardManager)WebViewHookActivity.this.getSystemService("clipboard")).setText(WebViewHookActivity.this.log.getText());
    }
  };
  private EditText log;
  private CheckBox open;
  private Button set;
  
  public static void addLog(String paramString)
  {
    PoseHelper008.saveDataToFile("WebViewHookActivity", getContent() + "\nstart" + paramString + "\nend");
  }
  
  public static void clearContent()
  {
    PoseHelper008.saveDataToFile("WebViewHookActivity", "");
  }
  
  public static String getContent()
  {
    return PoseHelper008.getFileData("WebViewHookActivity").trim();
  }
  
  public static JSONObject getSet()
  {
    Object localObject2 = PoseHelper008.getFileData("WebViewHookActivity_set");
    Object localObject1 = null;
    try
    {
      localObject2 = JSONObject.parseObject((String)localObject2);
      localObject1 = localObject2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
    localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = new JSONObject();
    }
    return localObject2;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 != 1) || (paramIntent == null)) {
      return;
    }
    paramIntent = paramIntent.getStringExtra("packageName");
    this.edit.setText(paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903088);
    this.edit = ((EditText)findViewById(2131230939));
    this.set = ((Button)findViewById(2131230940));
    this.log = ((EditText)findViewById(2131230941));
    this.clear = ((Button)findViewById(2131230942));
    this.copy = ((Button)findViewById(2131230943));
    this.open = ((CheckBox)findViewById(2131230944));
    this.set.setOnClickListener(this.listener);
    this.clear.setOnClickListener(this.listener);
    this.copy.setOnClickListener(this.listener);
    this.log.setText(getContent());
    Object localObject = getSet();
    paramBundle = ((JSONObject)localObject).get("setStr");
    localObject = ((JSONObject)localObject).get("open");
    this.edit.setText(paramBundle);
    if (((String)localObject).equals("true"))
    {
      this.open.setChecked(true);
      return;
    }
    this.open.setChecked(false);
  }
  
  protected void onDestroy()
  {
    JSONObject localJSONObject = getSet();
    String str = this.edit.getText().toString();
    boolean bool = this.open.isChecked();
    localJSONObject.put("setStr", str);
    localJSONObject.put("open", bool);
    PoseHelper008.saveDataToFile("WebViewHookActivity_set", localJSONObject.toJSONString());
    super.onDestroy();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     WebViewHookActivity

 * JD-Core Version:    0.7.0.1

 */