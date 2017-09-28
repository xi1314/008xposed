package com.soft.tools;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.widget.CheckBox;
import java.io.File;
import java.io.IOException;

public class SetSystemValueActivitySet
  extends Activity
{
  static String a = "";
  private CheckBox b;
  
  public static boolean a()
  {
    return new File(a).exists();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a = Environment.getExternalStorageDirectory() + File.separator + ".system" + File.separator + "SetSystemValueActivitySet_autoCelar";
    setContentView(2130903124);
    this.b = ((CheckBox)findViewById(2131362195));
    if (new File(a).exists())
    {
      this.b.setChecked(true);
      return;
    }
    this.b.setChecked(false);
  }
  
  protected void onDestroy()
  {
    if (this.b.isChecked()) {}
    for (;;)
    {
      try
      {
        new File(a).createNewFile();
        super.onDestroy();
        return;
      }
      catch (IOException localIOException)
      {
        localIOException.printStackTrace();
        continue;
      }
      new File(a).delete();
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.SetSystemValueActivitySet
 * JD-Core Version:    0.7.0.1
 */