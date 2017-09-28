package com.soft.tools;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.a.a.b;
import com.a.a.Map;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class RecordAppFileHandlerSetting
  extends Activity
{
  public static b a;
  public static Map b;
  private CheckBox c;
  private ListView d;
  private CheckBox e;
  private Button f;
  private a g;
  private CheckBox h;
  
  public static boolean a(String paramString)
  {
    b();
    String str = b.get("check_noDeleteFileList");
    if (paramString.contains("sdcard/kind")) {}
    for (;;)
    {
      return false;
      if (!str.equals("true")) {
        return true;
      }
      if (a == null) {
        str = PoseHelper008.getFileData("RecordAppFileHandlerSetting_list");
      }
      try
      {
        a = e.c(str);
        label67:
        if (a == null) {
          a = new b();
        }
        if (a.contains(paramString)) {
          continue;
        }
        return true;
      }
      catch (Exception localException)
      {
        break label67;
      }
    }
  }
  
  public static boolean b()
  {
    String str;
    if (b == null) {
      str = PoseHelper008.getFileData("RecordAppFileHandlerSetting");
    }
    try
    {
      b = e.b(str);
      label19:
      if (b == null) {
        b = new Map();
      }
      return b.get("check_noDeleteApk").equals("true");
    }
    catch (Exception localException)
    {
      break label19;
    }
  }
  
  public static boolean c()
  {
    String str;
    if (b == null) {
      str = PoseHelper008.getFileData("RecordAppFileHandlerSetting");
    }
    try
    {
      b = e.b(str);
      label19:
      if (b == null) {
        b = new Map();
      }
      return b.get("check_clearWhenDeleting").equals("true");
    }
    catch (Exception localException)
    {
      break label19;
    }
  }
  
  public final void a()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("添加文件");
    EditText localEditText = new EditText(this);
    localBuilder.setView(localEditText);
    localBuilder.setNegativeButton("确定", new du(this, localEditText));
    localBuilder.create().show();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903113);
    this.c = ((CheckBox)findViewById(2131362164));
    this.d = ((ListView)findViewById(2131362167));
    this.e = ((CheckBox)findViewById(2131362166));
    this.h = ((CheckBox)findViewById(2131362165));
    this.f = ((Button)findViewById(2131362168));
    paramBundle = PoseHelper008.getFileData("RecordAppFileHandlerSetting");
    try
    {
      b = e.b(paramBundle);
      label89:
      if (b == null) {
        b = new Map();
      }
      paramBundle = PoseHelper008.getFileData("RecordAppFileHandlerSetting_list");
      try
      {
        a = e.c(paramBundle);
        label118:
        if (a == null) {
          a = new b();
        }
        if (b.get("check_noDeleteApk").equals("true")) {
          this.c.setChecked(true);
        }
        if (b.get("check_noDeleteFileList").equals("true")) {
          this.e.setChecked(true);
        }
        if (b.get("check_clearWhenDeleting").equals("true")) {
          this.h.setChecked(true);
        }
        this.f.setOnClickListener(new dt(this));
        this.g = new a((byte)0);
        this.d.setAdapter(this.g);
        return;
      }
      catch (Exception paramBundle)
      {
        break label118;
      }
    }
    catch (Exception paramBundle)
    {
      break label89;
    }
  }
  
  protected void onDestroy()
  {
    if (this.c.isChecked())
    {
      b.putkey("check_noDeleteApk", "true");
      if (!this.e.isChecked()) {
        break label106;
      }
      b.putkey("check_noDeleteFileList", "true");
      label42:
      if (!this.h.isChecked()) {
        break label120;
      }
      b.putkey("check_clearWhenDeleting", "true");
    }
    for (;;)
    {
      PoseHelper008.saveDataToFile("RecordAppFileHandlerSetting", b.a());
      PoseHelper008.saveDataToFile("RecordAppFileHandlerSetting_list", a.a());
      super.onDestroy();
      return;
      b.putkey("check_noDeleteApk", "false");
      break;
      label106:
      b.putkey("check_noDeleteFileList", "false");
      break label42;
      label120:
      b.putkey("check_clearWhenDeleting", "false");
    }
  }
  
  private final class a
    extends BaseAdapter
  {
    private a() {}
    
    public final int getCount()
    {
      return RecordAppFileHandlerSetting.a.size();
    }
    
    public final Object getItem(int paramInt)
    {
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      View localView = paramView;
      if (paramView == null) {
        localView = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130903114, null);
      }
      ((TextView)localView.findViewById(2131362169)).setText(RecordAppFileHandlerSetting.a.get(paramInt));
      ((Button)localView.findViewById(2131362170)).setOnClickListener(new dv(this, paramInt));
      return localView;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.RecordAppFileHandlerSetting

 * JD-Core Version:    0.7.0.1

 */