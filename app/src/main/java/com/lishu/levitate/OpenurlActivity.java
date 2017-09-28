package com.lishu.levitate;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.soft.apk008.SetMessageActivity;
import com.soft.tools.QuickToolActivity;
import com.soft.tools.ToolMainActivity;

public class OpenurlActivity
  extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    String str = getIntent().getData().getQueryParameter("action");
    String S = str;
    if (str == null) {
      String A = getIntent().getStringExtra("action");
    }
    if (paramBundle == null)
    {
      finish();
      return;
    }
    if (paramBundle.equals("dataView")) {
      startActivity(new Intent(this, SetMessageActivity.class));
    }
    for (;;)
    {
      finish();
      return;
      if (paramBundle.equals("quick")) {
        startActivity(new Intent(this, QuickToolActivity.class));
      } else if (paramBundle.equals("gongju")) {
        startActivity(new Intent(this, ToolMainActivity.class));
      }
    }
  }
}
