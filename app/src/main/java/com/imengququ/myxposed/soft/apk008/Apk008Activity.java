package com.imengququ.myxposed.soft.apk008;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lishu.net.AlertDialogHelper;
import com.lishu.net.LishuNet;
import com.lishu.net.NetReceiver;
import com.soft.apk008.service.ServiceFor008K;
import com.soft.tools.ToolMainActivity;
import com.umeng.analytics.MobclickAgent;
import com.umeng.update.UmengUpdateAgent;
import de.robv.android.xposed.mods.tutorial.CheckCanUse;
import de.robv.android.xposed.mods.tutorial.MyLog;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import de.robv.android.xposed.mods.tutorial.TeleData;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

public class Apk008Activity
  extends Activity
  implements NetReceiver
{
  public static boolean isFirst = true;
  private static String url = StartActivity.baseUrl + "/phone/LogicSimpleAction.action";
  private ImageView CenterImg;
  private TextView TextView_systemMsg;
  private TextView Text_title;
  private View ViewBuy;
  private View ViewFree;
  private View ViewHelp;
  private View ViewSystem;
  private View ViewTools;
  Dialog dialog = null;
  private TextView idText;
  private TextView lastTimeText;
  public View.OnClickListener listener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (Apk008Activity.this.ViewBuy.equals(paramAnonymousView))
      {
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(Apk008Activity.this, BuyActivity.class);
        Apk008Activity.this.startActivity(paramAnonymousView);
      }
      do
      {
        return;
        if (Apk008Activity.this.ViewFree.equals(paramAnonymousView))
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(Apk008Activity.this, FreeActivity.class);
          Apk008Activity.this.startActivity(paramAnonymousView);
          return;
        }
        if (Apk008Activity.this.ViewHelp.equals(paramAnonymousView))
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(Apk008Activity.this, HelpActivity.class);
          Apk008Activity.this.startActivity(paramAnonymousView);
          return;
        }
        if (Apk008Activity.this.ViewSystem.equals(paramAnonymousView))
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(Apk008Activity.this, SystemMessageActivity.class);
          Apk008Activity.this.startActivity(paramAnonymousView);
          return;
        }
        if (Apk008Activity.this.idText.equals(paramAnonymousView))
        {
          MyLog.addLog("com", "test");
          if (PoseHelper008.check.isCanUse())
          {
            Toast.makeText(Apk008Activity.this, "当前可使用", 0).show();
            return;
          }
          Toast.makeText(Apk008Activity.this, "当前不可使用", 0).show();
          return;
        }
      } while (!Apk008Activity.this.ViewTools.equals(paramAnonymousView));
      PoseHelper008.saveDataToFile("fresh", "true");
      if (Apk008Activity.this.lastTimeText.getText().equals("已经到期"))
      {
        Toast.makeText(Apk008Activity.this, "已经到期，不能修改数据", 0).show();
        return;
      }
      paramAnonymousView = new Intent();
      paramAnonymousView.setClass(Apk008Activity.this, ToolMainActivity.class);
      Apk008Activity.this.startActivity(paramAnonymousView);
    }
  };
  private LishuNet net = new LishuNet();
  private ProgressDialog progressDialog;
  OnTouchListener touchListener = new OnTouchListener()
  {
    public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
    {
      if ((paramAnonymousMotionEvent.getAction() != 0) && (paramAnonymousMotionEvent.getAction() == 1))
      {
        PoseHelper008.saveDataToFile("fresh", "true");
        if (Apk008Activity.this.lastTimeText.getText().equals("已经到期")) {
          Toast.makeText(Apk008Activity.this, "已经到期，不能修改数据", 0).show();
        }
      }
      else
      {
        return true;
      }
      paramAnonymousView = new Intent();
      paramAnonymousView.setClass(Apk008Activity.this, SetDataActivity.class);
      Apk008Activity.this.startActivity(paramAnonymousView);
      return true;
    }
  };
  
  private Bitmap getBitmapFormUrl(String paramString)
  {
    localObject3 = null;
    localObject2 = null;
    localObject1 = null;
    try
    {
      paramString = (HttpURLConnection)new URL(paramString).openConnection();
      localObject1 = paramString;
      localObject2 = paramString;
      paramString.setConnectTimeout(10000);
      localObject1 = paramString;
      localObject2 = paramString;
      paramString.setReadTimeout(10000);
      localObject1 = paramString;
      localObject2 = paramString;
      paramString.setDoInput(true);
      localObject1 = paramString;
      localObject2 = paramString;
      paramString.setDoOutput(true);
      localObject1 = paramString;
      localObject2 = paramString;
      Bitmap localBitmap = BitmapFactory.decodeStream(paramString.getInputStream());
      localObject1 = localBitmap;
      localObject2 = localObject1;
      if (paramString != null)
      {
        paramString.disconnect();
        localObject2 = localObject1;
      }
    }
    catch (Exception paramString)
    {
      localObject2 = localObject1;
      paramString.printStackTrace();
      localObject2 = localObject3;
      return null;
    }
    finally
    {
      if (localObject2 == null) {
        break label121;
      }
      ((HttpURLConnection)localObject2).disconnect();
    }
    return localObject2;
  }
  
  private void setImageCode(final ImageView paramImageView)
  {
    paramImageView.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Apk008Activity.this.setImageCode(paramImageView);
      }
    });
    new Thread()
    {
      public void run()
      {
        Object localObject = StartActivity.baseUrl + "/VerifyCodeAction.action;jsessionid=" + LishuNet.JSESSIONID;
        localObject = Apk008Activity.this.getBitmapFormUrl((String)localObject);
        Apk008Activity.this.runOnUiThread(new Runnable()
        {
          public void run()
          {
            if (this.val$bitmap != null)
            {
              this.val$imageView.setImageBitmap(this.val$bitmap);
              return;
            }
            Toast.makeText(Apk008Activity.this.getApplicationContext(), "获取验证图片失败，请重试", 0).show();
          }
        });
      }
    }.start();
  }
  
  public void closeDialog(Dialog paramDialog)
  {
    try
    {
      Field localField = paramDialog.getClass().getSuperclass().getDeclaredField("mShowing");
      localField.setAccessible(true);
      localField.set(paramDialog, Boolean.valueOf(true));
      paramDialog.cancel();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public void netReceive(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {}
    for (;;)
    {
      return;
      try
      {
        paramString = JSON.parseObject(paramString);
        new StringBuilder().append(paramString.get("time")).toString();
        final String str1 = paramString.get("id");
        final String str2 = paramString.get("userName");
        new StringBuilder().append(paramString.get("overTime")).toString();
        if (!"5421254540993".equals("null"))
        {
          long l = Long.parseLong("5421254540993");
          runOnUiThread(new Runnable()
          {
            public void run()
            {
              Apk008Activity.this.lastTimeText.setText(this.val$a2);
              Apk008Activity.this.idText.setText("ID:" + str1);
              if (this.val$overTime.equals("true"))
              {
                Apk008Activity.this.lastTimeText.setText("已经到期");
                if (!PoseHelper008.getFileData("preStatus").equals("true"))
                {
                  PoseHelper008.saveDataToFile("fresh", "true");
                  PoseHelper008.saveDataToFile("preStatus", "true");
                }
              }
              do
              {
                while (str2.equals("null"))
                {
                  Apk008Activity.this.tipDialog();
                  return;
                  if (!PoseHelper008.getFileData("preStatus").equals("false"))
                  {
                    PoseHelper008.saveDataToFile("preStatus", "false");
                    PoseHelper008.saveDataToFile("fresh", "true");
                  }
                }
              } while (!Apk008Activity.isFirst);
              Apk008Activity.isFirst = false;
              Apk008Activity.this.runOnUiThread(new Runnable()
              {
                public void run()
                {
                  Toast.makeText(Apk008Activity.this, "008神器用户" + this.val$userName + "，欢迎使用", 0).show();
                }
              });
            }
          });
          return;
        }
      }
      catch (Exception paramString)
      {
        paramString.printStackTrace();
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    UmengUpdateAgent.update(this);
    UmengUpdateAgent.setUpdateOnlyWifi(false);
    requestWindowFeature(1);
    setContentView(2130903046);
    this.ViewBuy = findViewById(2131230769);
    this.CenterImg = ((ImageView)findViewById(2131230759));
    this.ViewFree = findViewById(2131230764);
    this.ViewHelp = findViewById(2131230766);
    this.lastTimeText = ((TextView)findViewById(2131230762));
    this.idText = ((TextView)findViewById(2131230760));
    this.ViewSystem = findViewById(2131230768);
    this.ViewTools = findViewById(2131230754);
    this.TextView_systemMsg = ((TextView)findViewById(2131230757));
    this.Text_title = ((TextView)findViewById(2131230753));
    if (StartActivity.isVip)
    {
      this.Text_title.setText("008神器v");
      paramBundle = findViewById(2131230755);
      if ((StartActivity.systemMsg != null) && (StartActivity.systemMsg.length() != 0)) {
        break label497;
      }
      paramBundle.setVisibility(8);
    }
    for (;;)
    {
      this.ViewBuy.setOnClickListener(this.listener);
      this.ViewFree.setOnClickListener(this.listener);
      this.ViewHelp.setOnClickListener(this.listener);
      this.ViewSystem.setOnClickListener(this.listener);
      this.idText.setOnClickListener(this.listener);
      this.ViewTools.setOnClickListener(this.listener);
      this.CenterImg.setOnTouchListener(this.touchListener);
      if (!PoseHelper008.getFileData("008OK").trim().equals("true"))
      {
        paramBundle = new Intent();
        paramBundle.setClass(this, InstallActivity.class);
        startActivity(paramBundle);
        finish();
      }
      if (PoseHelper008.getFileData("008Mode").length() == 0) {
        PoseHelper008.saveDataToFile("008Mode", "3");
      }
      if (SettingActivity.getValue("setDisplay").length() == 0) {
        SettingActivity.object.put("setDisplay", "false");
      }
      if (StartActivity.systemData.size() == 0)
      {
        paramBundle = new Intent();
        paramBundle.setClass(this, LoadActivity.class);
        startActivity(paramBundle);
        finish();
      }
      paramBundle = new DisplayMetrics();
      getWindowManager().getDefaultDisplay().getMetrics(paramBundle);
      PoseHelper008.saveDataToFile("sourceDisplay", paramBundle.widthPixels + "_" + paramBundle.heightPixels);
      startService(new Intent(this, ServiceFor008K.class));
      this.progressDialog = new ProgressDialog(this);
      return;
      this.Text_title.setText("008神器");
      break;
      label497:
      this.TextView_systemMsg.setText(StartActivity.systemMsg);
    }
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenuInfo paramContextMenuInfo) {}
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    paramMenu.add(0, 1, 0, "找回ID");
    return true;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      AlertDialogHelper.getBuilder(this, "注意", "是否退出008神器", new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          MobclickAgent.onKillProcess(Apk008Activity.this);
          System.exit(0);
        }
      }).create().show();
      return true;
    }
    return false;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    }
    for (;;)
    {
      return true;
      showInputPassWordDialog();
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    MobclickAgent.onPause(this);
  }
  
  protected void onResume()
  {
    super.onResume();
    HashMap localHashMap = new HashMap();
    localHashMap.put("action", "status");
    localHashMap.putAll(StartActivity.getBaseData());
    this.net.postMessage(url, localHashMap, this);
    MobclickAgent.onResume(this);
  }
  
  public void showInputPassWordDialog()
  {
    Object localObject = new Builder(this);
    ((Builder)localObject).setTitle("找回上个id的余下时间");
    ((Builder)localObject).setCancelable(false);
    View localView = LayoutInflater.from(this).inflate(2130903049, null);
    ((Builder)localObject).setView(localView);
    final EditText localEditText1 = (EditText)localView.findViewById(2131230776);
    final EditText localEditText2 = (EditText)localView.findViewById(2131230777);
    final EditText localEditText3 = (EditText)localView.findViewById(2131230779);
    setImageCode((ImageView)localView.findViewById(2131230778));
    ((Builder)localObject).setNegativeButton("确定", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface = new HashMap();
        String str1 = localEditText1.getText().toString().trim();
        String str2 = localEditText2.getText().toString().trim();
        String str3 = localEditText3.getText().toString().trim();
        if ((str1.length() == 0) || (str2.length() == 0) || (localEditText3.length() == 0))
        {
          Toast.makeText(Apk008Activity.this, "信息输入不完整", 0).show();
          return;
        }
        Apk008Activity.this.progressDialog.setMessage("操作进行中，请稍后");
        Apk008Activity.this.progressDialog.show();
        paramAnonymousDialogInterface.put("name", str1);
        paramAnonymousDialogInterface.put("password", str2);
        paramAnonymousDialogInterface.put("code", str3);
        paramAnonymousDialogInterface.put("action", "changeId");
        paramAnonymousInt = LoadActivity.libSign(Apk008Activity.this, LoadActivity.a, LoadActivity.b);
        paramAnonymousDialogInterface.put("a", LoadActivity.a);
        paramAnonymousDialogInterface.put("b", paramAnonymousInt);
        paramAnonymousDialogInterface.put("imei", TeleData.getImei());
        Apk008Activity.this.net.postMessage(Apk008Activity.url, paramAnonymousDialogInterface, new NetReceiver()
        {
          public void netReceive(String paramAnonymous2String)
          {
            if ((paramAnonymous2String != null) && (paramAnonymous2String.length() > 0))
            {
              Object localObject = JSON.parseObject(paramAnonymous2String);
              paramAnonymous2String = ((JSONObject)localObject).get("success");
              localObject = ((JSONObject)localObject).get("msg");
              AlertDialogHelper.showMessageDialog(Apk008Activity.this, (String)localObject);
              if (paramAnonymous2String.equals("true")) {
                Apk008Activity.this.closeDialog(Apk008Activity.this.dialog);
              }
            }
            Apk008Activity.this.runOnUiThread(new Runnable()
            {
              public void run()
              {
                Apk008Activity.this.progressDialog.hide();
              }
            });
          }
        });
      }
    });
    ((Builder)localObject).setPositiveButton("取消", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        Apk008Activity.this.closeDialog(Apk008Activity.this.dialog);
      }
    });
    this.dialog = ((Builder)localObject).create();
    this.dialog.show();
    try
    {
      localObject = this.dialog.getClass().getSuperclass().getDeclaredField("mShowing");
      ((Field)localObject).setAccessible(true);
      ((Field)localObject).set(this.dialog, Boolean.valueOf(false));
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public void showRegDialog()
  {
    Object localObject = new Builder(this);
    ((Builder)localObject).setTitle("用户注册");
    View localView = LayoutInflater.from(this).inflate(2130903050, null);
    ((Builder)localObject).setView(localView);
    ((Builder)localObject).setNegativeButton("确定", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface = new HashMap();
        String str1 = this.val$editName.getText().toString().trim();
        String str2 = this.val$editPassword1.getText().toString().trim();
        if (!str2.equals(this.val$editPassword2.getText().toString().trim()))
        {
          Toast.makeText(Apk008Activity.this, "两次输入的密码不一致", 0).show();
          return;
        }
        if ((str1.length() < 6) || (str1.length() > 20))
        {
          Toast.makeText(Apk008Activity.this, "用户名长度不正确", 0).show();
          return;
        }
        if ((str2.length() < 6) || (str2.length() > 20))
        {
          Toast.makeText(Apk008Activity.this, "密码长度不正确", 0).show();
          return;
        }
        Apk008Activity.this.progressDialog.setMessage("操作进行中，请稍后");
        Apk008Activity.this.progressDialog.show();
        paramAnonymousDialogInterface.put("name", str1);
        paramAnonymousDialogInterface.put("password", str2);
        paramAnonymousInt = LoadActivity.libSign(Apk008Activity.this, LoadActivity.a, LoadActivity.b);
        paramAnonymousDialogInterface.put("a", LoadActivity.a);
        paramAnonymousDialogInterface.put("b", paramAnonymousInt);
        paramAnonymousDialogInterface.put("imei", TeleData.getImei());
        paramAnonymousDialogInterface.put("action", "reg");
        Apk008Activity.this.net.postMessage(Apk008Activity.url, paramAnonymousDialogInterface, new NetReceiver()
        {
          public void netReceive(String paramAnonymous2String)
          {
            if ((paramAnonymous2String != null) && (paramAnonymous2String.length() > 0))
            {
              Object localObject = JSON.parseObject(paramAnonymous2String);
              paramAnonymous2String = ((JSONObject)localObject).get("success");
              localObject = ((JSONObject)localObject).get("msg");
              AlertDialogHelper.showMessageDialog(Apk008Activity.this, (String)localObject);
              if (paramAnonymous2String.equals("true")) {
                Apk008Activity.this.closeDialog(Apk008Activity.this.dialog);
              }
            }
            Apk008Activity.this.runOnUiThread(new Runnable()
            {
              public void run()
              {
                Apk008Activity.this.progressDialog.hide();
              }
            });
          }
        });
      }
    });
    ((Builder)localObject).setPositiveButton("取消", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        Apk008Activity.this.closeDialog(Apk008Activity.this.dialog);
      }
    });
    this.dialog = ((Builder)localObject).create();
    this.dialog.show();
    try
    {
      localObject = this.dialog.getClass().getSuperclass().getDeclaredField("mShowing");
      ((Field)localObject).setAccessible(true);
      ((Field)localObject).set(this.dialog, Boolean.valueOf(false));
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public void tipDialog()
  {
    if (!isFirst) {
      return;
    }
    isFirst = false;
    Builder localBuilder = new Builder(this);
    localBuilder.setTitle("注意");
    localBuilder.setMessage("请先注册，完成注册后，如果再后续的使用过程中，你的ID发送了变化，可以点击菜单键，登陆你的用户名和密码找回余下时间");
    localBuilder.setNegativeButton("注册", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        Apk008Activity.this.showRegDialog();
      }
    });
    localBuilder.setNeutralButton("找回时间", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        Apk008Activity.this.showInputPassWordDialog();
      }
    });
    localBuilder.setPositiveButton("稍后", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.cancel();
      }
    });
    localBuilder.create().show();
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     Apk008Activity

 * JD-Core Version:    0.7.0.1

 */