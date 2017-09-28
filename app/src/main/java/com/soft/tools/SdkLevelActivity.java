package com.soft.tools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;

import com.a.a.b;
import com.soft.apk008.WebMessageActivity;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class SdkLevelActivity
  extends Activity
{
  static String a = Environment.getExternalStorageDirectory() + File.separator + ".system/sdklevel";
  static String b = Environment.getExternalStorageDirectory() + File.separator + ".system/sdklevel1";
  
  public static ArrayList a(ArrayList paramArrayList)
  {
    int i = 0;
    if (new File(b).exists()) {
      a = b;
    }
    for (;;)
    {
      try
      {
        Object localObject1 = new File(a);
        if (((File)localObject1).exists())
        {
          localObject1 = new FileInputStream((File)localObject1);
          Object localObject2 = new byte[((FileInputStream)localObject1).available()];
          ((FileInputStream)localObject1).read((byte[])localObject2);
          localObject2 = new String((byte[])localObject2, "UTF-8");
          ((FileInputStream)localObject1).close();
          localObject1 = b.c((String)localObject2);
          localObject2 = new ArrayList();
          if (i >= ((b)localObject1).size())
          {
            if (((ArrayList)localObject2).size() > 0) {
              return localObject2;
            }
          }
          else
          {
            Object localObject3 = ((b)localObject1).b(i);
            String str = ((b)localObject3).e(1);
            localObject3 = ((b)localObject3).e(0);
            if (str == null) {
              break label194;
            }
            ((ArrayList)localObject2).add(new String[] { str, localObject3 });
            break label194;
          }
        }
        else
        {
          localObject1 = new FileOutputStream((File)localObject1);
          ((FileOutputStream)localObject1).write(a.a(paramArrayList).getBytes("UTF-8"));
          ((FileOutputStream)localObject1).flush();
          ((FileOutputStream)localObject1).close();
          return paramArrayList;
        }
      }
      catch (Exception localException) {}
      return paramArrayList;
      label194:
      i += 1;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296280, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if ((paramMenuItem.getItemId() != 2131362316) && (paramMenuItem.getItemId() == 2131362317))
    {
      Intent localIntent = new Intent();
      localIntent.setClass(this, WebMessageActivity.class);
      startActivity(localIntent);
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.SdkLevelActivity

 * JD-Core Version:    0.7.0.1

 */