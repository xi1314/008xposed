package com.soft.tools;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.soft.apk008.SetMessageActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class FindPhoneDataActivity
  extends Activity
{
  View.OnClickListener a = new ag(this);
  private EditText b;
  private EditText c;
  private Button d;
  private Button e;
  private EditText f;
  private CheckBox g;
  private Button h;
  
  public static void a(Context paramContext, String paramString)
  {
    String str = er.a(paramContext, "FindPhoneDataActivity_editImeiStoreFile");
    if (!er.a(paramContext, "FindPhoneDataActivity_checkBox").equals("true")) {}
    for (;;)
    {
      return;
      if (str.trim().length() == 0) {
        continue;
      }
      paramContext = new File(str);
      if (!paramContext.exists()) {}
      try
      {
        boolean bool = paramContext.createNewFile();
        if (!bool) {
          continue;
        }
        try
        {
          paramContext = new RandomAccessFile(paramContext, "rw");
          paramContext.seek(paramContext.length());
          paramContext.write((paramString + "\n").getBytes());
          paramContext.close();
          return;
        }
        catch (Exception paramContext) {}
        return;
      }
      catch (IOException paramContext)
      {
        paramContext.printStackTrace();
      }
    }
  }
  
  public static boolean a(String paramString)
  {
    Object localObject1;
    Object localObject2;
    HashMap localHashMap;
    do
    {
      localObject1 = a.a.entrySet().iterator();
      while (!((Iterator)localObject2).hasNext())
      {
        if (!((Iterator)localObject1).hasNext()) {
          return false;
        }
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        ((Map.Entry)localObject2).getKey();
        localObject2 = ((ArrayList)((Map.Entry)localObject2).getValue()).iterator();
      }
      localHashMap = (HashMap)((Iterator)localObject2).next();
    } while (!((String)localHashMap.get("getDeviceId")).equals(paramString));
    paramString = localHashMap.entrySet().iterator();
    for (;;)
    {
      if (!paramString.hasNext())
      {
        PoseHelper008.valueMap.putkey("sign", SetMessageActivity.b(PoseHelper008.valueMap.getStringfrommap("getDeviceId")));
        PoseHelper008.saveData();
        return true;
      }
      localObject2 = (Map.Entry)paramString.next();
      localObject1 = (String)((Map.Entry)localObject2).getKey();
      localObject2 = (String)((Map.Entry)localObject2).getValue();
      PoseHelper008.valueMap.putkey((String)localObject1, localObject2);
    }
  }
  
  public final void a()
  {
    Object localObject = new File(this.f.getText().toString());
    if (((File)localObject).exists()) {}
    try
    {
      localObject = new FileOutputStream((File)localObject);
      ((FileOutputStream)localObject).write("".getBytes());
      ((FileOutputStream)localObject).close();
      Toast.makeText(this, "清空成功", 0).show();
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      localFileNotFoundException.printStackTrace();
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903091);
    this.b = ((EditText)findViewById(2131362060));
    this.c = ((EditText)findViewById(2131362062));
    this.f = ((EditText)findViewById(2131362065));
    this.d = ((Button)findViewById(2131362061));
    this.e = ((Button)findViewById(2131362063));
    this.g = ((CheckBox)findViewById(2131362066));
    this.h = ((Button)findViewById(2131362067));
    this.e.setOnClickListener(this.a);
    this.d.setOnClickListener(this.a);
    this.h.setOnClickListener(new ah(this));
    paramBundle = er.a(this, "FindPhoneDataActivity_editFile");
    String str1 = er.a(this, "FindPhoneDataActivity_editImeiStoreFile");
    String str2 = er.a(this, "FindPhoneDataActivity_checkBox");
    if (paramBundle.trim().length() > 0) {
      this.c.setText(paramBundle);
    }
    if (str1.trim().length() > 0) {
      this.f.setText(str1);
    }
    if (str2.equals("true")) {
      this.g.setChecked(true);
    }
    this.g.setOnCheckedChangeListener(new ai(this));
  }
  
  protected void onDestroy()
  {
    this.g.isChecked();
    er.a(this, "FindPhoneDataActivity_checkBox", "true");
    er.a(this, "FindPhoneDataActivity_editFile", this.c.getText().toString());
    er.a(this, "FindPhoneDataActivity_editImeiStoreFile", this.f.getText().toString());
    super.onDestroy();
  }
}

