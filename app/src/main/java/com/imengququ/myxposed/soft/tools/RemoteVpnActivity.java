package com.imengququ.myxposed.soft.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lishu.net.AlertDialogHelper;
import com.lishu.net.changeVpn.MobileNetData;
import com.lishu.net.changeVpn.MobileNetDataListener;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class RemoteVpnActivity
  extends Activity
{
  private static Activity activity;
  private static ProgressDialog dialog;
  private static EditText edit;
  protected static boolean error = false;
  public static MobileNetData netData;
  static MobileNetDataListener newDataListener = new MobileNetDataListener()
  {
    public void onDataReceive(String paramAnonymousString)
    {
      if ((paramAnonymousString == null) || (paramAnonymousString.length() == 0)) {}
      for (;;)
      {
        return;
        try
        {
          Object localObject = JSON.parseObject(paramAnonymousString);
          paramAnonymousString = ((JSONObject)localObject).getString("status");
          localObject = ((JSONObject)localObject).getString("message");
          if (paramAnonymousString.equals("true"))
          {
            RemoteVpnActivity.ok = true;
            if (RemoteVpnActivity.activity != null)
            {
              RemoteVpnActivity.activity.runOnUiThread(new Runnable()
              {
                public void run()
                {
                  RemoteVpnActivity.statusText.setText("连接成功，" + this.val$msg);
                  RemoteVpnActivity.dialog.hide();
                }
              });
              return;
            }
          }
        }
        catch (Exception paramAnonymousString)
        {
          if (RemoteVpnActivity.activity != null) {
            RemoteVpnActivity.activity.runOnUiThread(new Runnable()
            {
              public void run()
              {
                RemoteVpnActivity.statusText.setText("状态异常请重试");
                RemoteVpnActivity.dialog.hide();
              }
            });
          }
          RemoteVpnActivity.error = true;
        }
      }
    }
    
    public void onNetError()
    {
      if (RemoteVpnActivity.activity != null) {
        RemoteVpnActivity.activity.runOnUiThread(new Runnable()
        {
          public void run()
          {
            RemoteVpnActivity.statusText.setText("状态异常请重试");
            RemoteVpnActivity.dialog.hide();
          }
        });
      }
    }
  };
  public static boolean ok = false;
  static boolean resultReturn = false;
  private static TextView statusText;
  static boolean wait = false;
  private Button changeButton;
  private Button connectButton;
  OnClickListener listener = new OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView.equals(RemoteVpnActivity.this.changeButton)) {
        if (RemoteVpnActivity.netData == null) {
          Toast.makeText(RemoteVpnActivity.this, "网络还未连接", 0).show();
        }
      }
      while (!paramAnonymousView.equals(RemoteVpnActivity.this.connectButton))
      {
        return;
        RemoteVpnActivity.error = false;
        RemoteVpnActivity.dialog.show();
        paramAnonymousView = new JSONObject();
        paramAnonymousView.put("message", "change");
        RemoteVpnActivity.netData.send(paramAnonymousView.toJSONString());
        return;
      }
      RemoteVpnActivity.error = false;
      RemoteVpnActivity.dialog.show();
      paramAnonymousView = RemoteVpnActivity.edit.getText().toString().split(":");
      if (paramAnonymousView.length != 2)
      {
        Toast.makeText(RemoteVpnActivity.this, "格式输入错误", 0).show();
        RemoteVpnActivity.dialog.hide();
        return;
      }
      if (RemoteVpnActivity.netData == null) {
        RemoteVpnActivity.netData = new MobileNetData(paramAnonymousView[0], Integer.parseInt(paramAnonymousView[1]));
      }
      for (;;)
      {
        RemoteVpnActivity.netData.lis = RemoteVpnActivity.newDataListener;
        new Thread()
        {
          public void run()
          {
            final boolean bool = RemoteVpnActivity.netData.connnect();
            RemoteVpnActivity.this.runOnUiThread(new Runnable()
            {
              public void run()
              {
                if (bool) {
                  RemoteVpnActivity.statusText.setText("连接成功");
                }
                for (;;)
                {
                  RemoteVpnActivity.dialog.hide();
                  return;
                  RemoteVpnActivity.statusText.setText("连接失败");
                }
              }
            });
          }
        }.start();
        return;
        RemoteVpnActivity.netData.ip = paramAnonymousView[0];
        RemoteVpnActivity.netData.port = Integer.parseInt(paramAnonymousView[1]);
      }
    }
  };
  
  private static void changeIp()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("message", "change");
    netData.send(localJSONObject.toJSONString());
  }
  
  public static boolean changeNet(Activity paramActivity)
  {
    error = false;
    ok = false;
    wait = false;
    resultReturn = true;
    Object localObject = PoseHelper008.getFileData("RemoteVpnActivity");
    if (((String)localObject).length() == 0)
    {
      AlertDialogHelper.showMessageDialog(paramActivity, "远程vpn还未配置，请先在上一个界面中完成配置");
      return false;
    }
    localObject = ((String)localObject).split(":");
    if (localObject.length != 2)
    {
      AlertDialogHelper.showMessageDialog(paramActivity, "远程vpn配置错误");
      return false;
    }
    if (netData == null)
    {
      netData = new MobileNetData(localObject[0], Integer.parseInt(localObject[1]));
      netData.lis = newDataListener;
      if (netData.connecting) {
        break label150;
      }
      wait = true;
      new Thread()
      {
        public void run()
        {
          final boolean bool = RemoteVpnActivity.netData.connnect();
          try
          {
            Thread.sleep(2000L);
            RemoteVpnActivity.this.runOnUiThread(new Runnable()
            {
              public void run()
              {
                if (bool)
                {
                  Toast.makeText(this.val$activity, "连接服务器成功", 0).show();
                  RemoteVpnActivity.access$6();
                  RemoteVpnActivity.wait = false;
                  return;
                }
                AlertDialogHelper.showMessageDialog(this.val$activity, "连接服务器失败");
                RemoteVpnActivity.resultReturn = false;
                RemoteVpnActivity.wait = false;
              }
            });
            return;
          }
          catch (InterruptedException localInterruptedException)
          {
            for (;;)
            {
              localInterruptedException.printStackTrace();
            }
          }
        }
      }.start();
    }
    for (;;)
    {
      label116:
      if (!wait) {}
      for (;;)
      {
        return resultReturn;
        netData.ip = localObject[0];
        netData.port = Integer.parseInt(localObject[1]);
        break;
        label150:
        changeIp();
        break label116;
        if (!error) {
          break label175;
        }
        AlertDialogHelper.showMessageDialog(paramActivity, "连接服务器失败");
        resultReturn = false;
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
  
  protected void onCreate(Bundle paramBundle)
  {
    activity = this;
    super.onCreate(paramBundle);
    setContentView(2130903081);
    edit = (EditText)findViewById(2131230920);
    statusText = (TextView)findViewById(2131230921);
    this.changeButton = ((Button)findViewById(2131230923));
    this.connectButton = ((Button)findViewById(2131230922));
    dialog = new ProgressDialog(this);
    dialog.setMessage("操作中，请稍后");
    this.changeButton.setOnClickListener(this.listener);
    this.connectButton.setOnClickListener(this.listener);
    if (netData != null)
    {
      edit.setText(netData.ip + ":" + netData.port);
      if (netData.connecting) {
        statusText.setText("当前状态为连接成功");
      }
      return;
    }
    paramBundle = PoseHelper008.getFileData(getClass().getSimpleName());
    edit.setText(paramBundle);
  }
  
  protected void onDestroy()
  {
    activity = null;
    PoseHelper008.saveDataToFile("RemoteVpnActivity", edit.getText().toString());
    super.onDestroy();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     RemoteVpnActivity

 * JD-Core Version:    0.7.0.1

 */