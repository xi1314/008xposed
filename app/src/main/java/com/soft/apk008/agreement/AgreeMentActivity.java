package com.soft.apk008.agreement;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import com.soft.apk008.LoadActivity;
import com.soft.apk008.StartActivity;
import com.soft.tools.er;

public class AgreeMentActivity
  extends Activity
{
  public View.OnClickListener a = new a(this);
  private WebView b;
  private CheckBox c;
  private Button d;
  
  public static boolean a(Activity paramActivity)
  {
    return "true".equals(er.a(paramActivity, "isAgreeMent"));
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903040);
    this.b = ((WebView)findViewById(2131361793));
    this.c = ((CheckBox)findViewById(2131361794));
    this.d = ((Button)findViewById(2131361795));
    this.d.setOnClickListener(this.a);
    paramBundle = StartActivity.b + "/phone/ContentAction.action?action=agreeMent";
    if (!LoadActivity.c) {
      paramBundle = "http://www.baidu.com";
    }
    this.b.loadUrl(paramBundle);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return false;
  }
}

