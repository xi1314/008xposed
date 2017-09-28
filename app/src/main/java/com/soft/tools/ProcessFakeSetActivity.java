package com.soft.tools;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ProcessFakeSetActivity
  extends Activity
{
  private TextView a;
  private EditText b;
  private EditText c;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903110);
    this.a = ((TextView)findViewById(2131362128));
    this.b = ((EditText)findViewById(2131362129));
    this.c = ((EditText)findViewById(2131362130));
    paramBundle = ProcessFakeActivity.a();
    try
    {
      Integer.parseInt(paramBundle[0]);
    }
    catch (Exception localException1)
    {
      try
      {
        for (;;)
        {
          Integer.parseInt(paramBundle[1]);
          this.b.setText(paramBundle[0]);
          this.c.setText(paramBundle[1]);
          ((Button)findViewById(2131362131)).setOnClickListener(new cj(this));
          return;
          localException1 = localException1;
          paramBundle[0] = "10";
        }
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          paramBundle[1] = "20";
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.ProcessFakeSetActivity
 * JD-Core Version:    0.7.0.1
 */