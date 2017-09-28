package com.soft.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.a.a.Map;
import com.lishu.c.b.c;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class RemoteVpnActivity
  extends Activity
{
  public static com.lishu.c.b.a a;
  protected static boolean c = false;
  static c d = new eb();
  public static boolean e = false;
  static boolean f = false;
  static boolean g = false;
  private static EditText h;
  private static TextView i;
  private static ProgressDialog l;
  private static Activity m;
  View.OnClickListener b = new dy(this);
  private Button j;
  private Button k;
  
  public static boolean a(Activity paramActivity)
  {
    c = false;
    e = false;
    f = false;
    g = true;
    Object localObject = PoseHelper008.getFileData("RemoteVpnActivity");
    if (((String)localObject).length() == 0)
    {
      com.lishu.c.a.c(paramActivity, "远程vpn还未配置，请先在上一个界面中完成配置");
      return false;
    }
    localObject = ((String)localObject).split(":");
    if (localObject.length != 2)
    {
      com.lishu.c.a.c(paramActivity, "远程vpn配置错误");
      return false;
    }
    if (a == null)
    {
      localObject = new com.lishu.c.b.a(localObject[0], Integer.parseInt(localObject[1]));
      a = (com.lishu.c.b.a)localObject;
      ((com.lishu.c.b.a)localObject).a = d;
      if (a.d) {
        break label150;
      }
      f = true;
      new ef(paramActivity).start();
    }
    for (;;)
    {
      label116:
      if (!f) {}
      for (;;)
      {
        return g;
        a.b = localObject[0];
        a.c = Integer.parseInt(localObject[1]);
        break;
        label150:
        f();
        break label116;
        if (!c) {
          break label175;
        }
        com.lishu.c.a.c(paramActivity, "连接服务器失败");
        g = false;
      }
      try
      {
        label175:
        Thread.sleep(100L);
      }
      catch (InterruptedException localInterruptedException)
      {
        localInterruptedException.printStackTrace();
      }
    }
  }
  
  private static void f()
  {
    Map locale = new Map();
    locale.putkey("message", "change");
    a.a(locale.a());
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    m = this;
    super.onCreate(paramBundle);
    setContentView(2130903115);
    h = (EditText)findViewById(2131362171);
    i = (TextView)findViewById(2131362172);
    this.j = ((Button)findViewById(2131362174));
    this.k = ((Button)findViewById(2131362173));
    paramBundle = new ProgressDialog(this);
    l = paramBundle;
    paramBundle.setMessage("操作中，请稍后");
    this.j.setOnClickListener(this.b);
    this.k.setOnClickListener(this.b);
    if (a != null)
    {
      h.setText(a.b + ":" + a.c);
      if (a.d) {
        i.setText("当前状态为连接成功");
      }
      return;
    }
    paramBundle = PoseHelper008.getFileData(getClass().getSimpleName());
    h.setText(paramBundle);
  }
  
  protected void onDestroy()
  {
    m = null;
    PoseHelper008.saveDataToFile("RemoteVpnActivity", h.getText().toString());
    super.onDestroy();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.RemoteVpnActivity

 * JD-Core Version:    0.7.0.1

 */