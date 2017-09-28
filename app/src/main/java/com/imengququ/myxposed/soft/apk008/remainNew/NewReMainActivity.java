package com.imengququ.myxposed.soft.apk008.remainNew;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lishu.jifen.db.FileHelper;
import com.lishu.net.AlertDialogHelper;
import com.lishu.net.LishuNet;
import com.lishu.net.NetReceiver;
import com.soft.apk008.LoadActivity;
import com.soft.apk008.SetDataActivity;
import com.soft.apk008.StartActivity;
import com.soft.apk008.WebMessageActivity;
import com.soft.tools.ClearApplicationDataActivity;
import com.soft.tools.RecordAppFileHandler;
import com.soft.tools.SetSystemValueActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class NewReMainActivity
  extends Activity
  implements NetReceiver
{
  private static int TotalCount;
  private static int TotalProgress;
  private static Activity activity;
  private static ArrayList<String> canUserArray;
  public static Context context;
  public static Handler handler = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      if (NewReMainActivity.context == null) {
        return;
      }
      switch (paramAnonymousMessage.what)
      {
      default: 
        return;
      }
      Toast.makeText(NewReMainActivity.context, (String)paramAnonymousMessage.obj, 0).show();
    }
  };
  private static JSONObject object;
  private MyAdapter adapter;
  private Dialog dialog;
  private ListView listView;
  private LishuNet net = new LishuNet();
  
  public static void NextHistory(Context paramContext)
  {
    
    if (canUserArray.size() == 0)
    {
      Toast.makeText(paramContext, "当前没有可用历史记录", 0).show();
      return;
    }
    int j = object.getIntValue("progress");
    String str = object.getString("kindName");
    Object localObject1 = Calendar.getInstance();
    ((Calendar)localObject1).setTime(new Date());
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Object localObject2 = Calendar.getInstance();
    try
    {
      ((Calendar)localObject2).setTime(localSimpleDateFormat.parse(str));
      i = getDays((Calendar)localObject1, (Calendar)localObject2);
      localObject1 = (ArrayList)FileHelper.AllItemList.get(str);
      if (localObject1 == null)
      {
        Toast.makeText(paramContext, "请检查历史记录是否已经被重命名，如果重命名请删除留存控制中的相关项", 1).show();
        return;
      }
    }
    catch (ParseException localParseException)
    {
      for (;;)
      {
        localParseException.printStackTrace();
      }
      int k = NewReMainSetActivity.getRemain(i);
      i = 0;
      if (k != 0) {
        i = (int)(((ArrayList)localObject1).size() / 100.0F * k + 0.5D);
      }
      if (j >= i - 1) {
        break label275;
      }
    }
    int i = j + 1;
    object.put("progress", Integer.valueOf(i));
    localObject1 = (HashMap)((ArrayList)localObject1).get(i);
    if (localObject1 != null) {
      localObject1 = ((HashMap)localObject1).entrySet().iterator();
    }
    for (;;)
    {
      if (!((Iterator)localObject1).hasNext())
      {
        PoseHelper008.valueMap.put("sign", SetDataActivity.getSign(PoseHelper008.valueMap.getString("getDeviceId")));
        PoseHelper008.saveData();
        outPutStatus(paramContext);
        Widget008Provider.setModeAndKindName(paramContext, "自动", str, TotalProgress, TotalCount);
        save();
        deleteFile(paramContext);
        return;
        label275:
        i = getPosition(str);
        if (i < canUserArray.size() - 1)
        {
          object.put("kindName", canUserArray.get(i + 1));
          i = 0;
          object.put("progress", Integer.valueOf(0));
          break;
        }
        Toast.makeText(paramContext, "向后已经没有了数据", 0).show();
        return;
      }
      Object localObject3 = (Map.Entry)((Iterator)localObject1).next();
      localObject2 = (String)((Map.Entry)localObject3).getKey();
      localObject3 = (String)((Map.Entry)localObject3).getValue();
      PoseHelper008.valueMap.put((String)localObject2, localObject3);
    }
  }
  
  public static void PreHistory(Context paramContext)
  {
    
    if (canUserArray.size() == 0)
    {
      Toast.makeText(paramContext, "当前没有可用历史记录", 0).show();
      return;
    }
    int i = object.getIntValue("progress");
    String str = object.getString("kindName");
    Object localObject1 = Calendar.getInstance();
    ((Calendar)localObject1).setTime(new Date());
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Object localObject2 = Calendar.getInstance();
    try
    {
      ((Calendar)localObject2).setTime(localSimpleDateFormat.parse(str));
      j = getDays((Calendar)localObject1, (Calendar)localObject2);
      localObject1 = (ArrayList)FileHelper.AllItemList.get(str);
      if (localObject1 == null)
      {
        Toast.makeText(paramContext, "请检查历史记录是否已经被重命名，如果重命名请删除留存控制中的相关项", 1).show();
        return;
      }
    }
    catch (ParseException localParseException)
    {
      for (;;)
      {
        localParseException.printStackTrace();
      }
      int j = NewReMainSetActivity.getRemain(j);
      if (j != 0) {
        j = (int)(((ArrayList)localObject1).size() / 100.0F * j + 0.5D);
      }
      if (i <= 0) {
        break label266;
      }
    }
    i -= 1;
    object.put("progress", Integer.valueOf(i));
    localObject1 = (HashMap)((ArrayList)localObject1).get(i);
    if (localObject1 != null) {
      localObject1 = ((HashMap)localObject1).entrySet().iterator();
    }
    for (;;)
    {
      if (!((Iterator)localObject1).hasNext())
      {
        PoseHelper008.valueMap.put("sign", SetDataActivity.getSign(PoseHelper008.valueMap.getString("getDeviceId")));
        PoseHelper008.saveData();
        outPutStatus(paramContext);
        Widget008Provider.setModeAndKindName(paramContext, "自动", str, TotalProgress, TotalCount);
        save();
        deleteFile(paramContext);
        return;
        label266:
        i = getPosition(str);
        if (i > 0)
        {
          object.put(str, canUserArray.get(i - 1));
          i = 0;
          object.put("progress", Integer.valueOf(0));
          break;
        }
        Toast.makeText(paramContext, "向前已经没有了数据", 0).show();
        return;
      }
      Object localObject3 = (Map.Entry)((Iterator)localObject1).next();
      localObject2 = (String)((Map.Entry)localObject3).getKey();
      localObject3 = (String)((Map.Entry)localObject3).getValue();
      PoseHelper008.valueMap.put((String)localObject2, localObject3);
    }
  }
  
  public static void SimulateData(Context paramContext)
  {
    if ((PoseHelper008.valueMap == null) || (PoseHelper008.valueMap.size() == 0))
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      new Intent().addFlags(268435456);
      try
      {
        paramContext.startActivity(localPackageManager.getLaunchIntentForPackage(paramContext.getPackageName()));
        return;
      }
      catch (Exception localException)
      {
        Toast.makeText(paramContext, "未找到该应用", 0).show();
        return;
      }
    }
    initData();
    String str = NewReMainSetActivity.getMode();
    if (str.equals("自动"))
    {
      SetDataActivity.changeData(paramContext);
      str = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
      FileHelper.addOrUpdateItem(str, PoseHelper008.valueMap);
      Widget008Provider.setModeAndKindName(paramContext, NewReMainSetActivity.getMode(), str, TotalProgress, TotalCount);
    }
    for (;;)
    {
      deleteFile(paramContext);
      Toast.makeText(paramContext, "生成随机数据成功", 1).show();
      return;
      FileHelper.addOrUpdateItem(str, PoseHelper008.valueMap);
      Widget008Provider.setModeAndKindName(paramContext, "设置值", str, TotalProgress, TotalCount);
    }
  }
  
  public static void deleteFile(Context paramContext)
  {
    String str = LoadActivity.getProPackAge(paramContext, LoadActivity.a, LoadActivity.b);
    if ((NewReMainSetActivity.getData("check_deleteFile") != null) && (NewReMainSetActivity.getData("check_deleteFile").equals("true"))) {
      RecordAppFileHandler.deleteData(paramContext, str);
    }
    if ((NewReMainSetActivity.getData("check_clearData") != null) && (NewReMainSetActivity.getData("check_clearData").equals("true"))) {
      ClearApplicationDataActivity.clearData(paramContext, str);
    }
    if ((NewReMainSetActivity.getData("check_deleteSystem") != null) && (NewReMainSetActivity.getData("check_deleteSystem").equals("true"))) {
      SetSystemValueActivity.deleteSelect(paramContext, str);
    }
  }
  
  public static void getCanUseArray()
  {
    canUserArray = new ArrayList();
    Object localObject3 = new ArrayList();
    Iterator localIterator = FileHelper.AllItemList.entrySet().iterator();
    Object localObject1;
    int i;
    label53:
    int j;
    if (!localIterator.hasNext())
    {
      localObject1 = new long[((ArrayList)localObject3).size()];
      i = 0;
      if (i < ((ArrayList)localObject3).size()) {
        break label258;
      }
      Arrays.sort((long[])localObject1);
      reverse((long[])localObject1);
      j = localObject1.length;
      i = 0;
    }
    for (;;)
    {
      if (i >= j)
      {
        if (getPosition(object.getString("kindName")) == -1)
        {
          if (canUserArray.size() <= 0) {
            break label328;
          }
          object.put("kindName", canUserArray.get(0));
          object.put("progress", Integer.valueOf(0));
        }
        return;
        Object localObject2 = (String)((Map.Entry)localIterator.next()).getKey();
        Object localObject4 = new SimpleDateFormat("yyyy-MM-dd");
        localObject1 = null;
        try
        {
          localObject2 = ((SimpleDateFormat)localObject4).parse((String)localObject2);
          localObject1 = localObject2;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            localException.printStackTrace();
          }
        }
        if (localObject1 == null) {
          break;
        }
        localObject2 = Calendar.getInstance();
        ((Calendar)localObject2).setTime(new Date());
        localObject4 = Calendar.getInstance();
        ((Calendar)localObject4).setTime((Date)localObject1);
        if (NewReMainSetActivity.getRemain(getDays((Calendar)localObject2, (Calendar)localObject4)) <= 0) {
          break;
        }
        ((ArrayList)localObject3).add(Long.valueOf(((Date)localObject1).getTime()));
        break;
        label258:
        localObject1[i] = ((Long)((ArrayList)localObject3).get(i)).longValue();
        i += 1;
        break label53;
      }
      long l = localObject1[i];
      SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
      localObject3 = new Date(l);
      canUserArray.add(localSimpleDateFormat.format((Date)localObject3));
      i += 1;
    }
    label328:
    object.put("kindName", "");
    object.put("progress", Integer.valueOf(0));
  }
  
  private static int getDays(Calendar paramCalendar1, Calendar paramCalendar2)
  {
    int k = paramCalendar1.get(1);
    int m = paramCalendar2.get(1);
    int j = paramCalendar1.get(6) - paramCalendar2.get(6);
    int i = 0;
    for (;;)
    {
      if (i >= k - m) {
        return j;
      }
      paramCalendar2.set(1, paramCalendar2.get(1) + 1);
      j += paramCalendar2.getMaximum(6);
      i += 1;
    }
  }
  
  public static int getPosition(String paramString)
  {
    int i = 0;
    Iterator localIterator = canUserArray.iterator();
    for (;;)
    {
      int j;
      if (!localIterator.hasNext()) {
        j = -1;
      }
      do
      {
        return j;
        j = i;
      } while (paramString.equals((String)localIterator.next()));
      i += 1;
    }
  }
  
  public static void initData()
  {
    String str;
    if (object == null) {
      str = PoseHelper008.getFileData("ReMainNewActivity");
    }
    try
    {
      object = JSONObject.parseObject(str);
      label20:
      if (object == null) {
        object = new JSONObject();
      }
      getCanUseArray();
      object.getIntValue("progress");
      str = object.getString("kindName");
      if (str == null)
      {
        if (canUserArray.size() > 0) {
          str = (String)canUserArray.get(0);
        }
        object.put("progress", Integer.valueOf(0));
        object.put("kindName", str);
      }
      return;
    }
    catch (Exception localException)
    {
      break label20;
    }
  }
  
  public static void outPutStatus(Context paramContext)
  {
    updateTotal();
    int i = (int)(TotalProgress * 100 / TotalCount);
    sendToast(paramContext, "当前所在分类为：" + object.getString("kindName") + "   当前总进度为" + i);
  }
  
  public static void reverse(long[] paramArrayOfLong)
  {
    if (paramArrayOfLong == null) {}
    for (;;)
    {
      return;
      int i = 0;
      int j = paramArrayOfLong.length - 1;
      while (j > i)
      {
        long l = paramArrayOfLong[j];
        paramArrayOfLong[j] = paramArrayOfLong[i];
        paramArrayOfLong[i] = l;
        j -= 1;
        i += 1;
      }
    }
  }
  
  public static void save()
  {
    PoseHelper008.saveDataToFile("ReMainNewActivity", object.toJSONString());
  }
  
  public static void sendToast(Context paramContext, String paramString)
  {
    context = paramContext;
    paramContext = new Message();
    paramContext.what = 1;
    paramContext.obj = paramString;
    handler.sendMessage(paramContext);
  }
  
  public static void updateTotal()
  {
    TotalCount = 0;
    TotalProgress = 0;
    Calendar localCalendar1 = Calendar.getInstance();
    localCalendar1.setTime(new Date());
    int j = getPosition(object.getString("kindName"));
    int i = 0;
    for (;;)
    {
      if (i >= canUserArray.size())
      {
        TotalProgress += object.getIntValue("progress");
        return;
      }
      Object localObject = (String)canUserArray.get(i);
      SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
      Calendar localCalendar2 = Calendar.getInstance();
      try
      {
        localCalendar2.setTime(localSimpleDateFormat.parse((String)localObject));
        k = getDays(localCalendar1, localCalendar2);
        localObject = (ArrayList)FileHelper.AllItemList.get(localObject);
        if (localObject == null)
        {
          Toast.makeText(context, "请检查历史记录是否已经被重命名，如果重命名请删除留存控制中的相关项", 1).show();
          return;
        }
      }
      catch (ParseException localParseException)
      {
        for (;;)
        {
          localParseException.printStackTrace();
        }
        int k = NewReMainSetActivity.getRemain(k);
        int m = ((ArrayList)localObject).size();
        TotalCount = (int)(TotalCount + (m / 100.0F * k + 0.5D));
        if (i < j) {
          TotalProgress += TotalCount;
        }
        i += 1;
      }
    }
  }
  
  public void netReceive(String paramString)
  {
    paramString.length();
    try
    {
      JSON.parseObject(paramString).getString("key");
      paramString = "9532_82".split("_");
      int i = Integer.parseInt(paramString[0]);
      int j = Integer.parseInt(paramString[1]);
      StartActivity.apkCode = LoadActivity.stringFromJNI(this, i, j);
      LoadActivity.a = i;
      LoadActivity.b = j;
      paramString = new HashMap();
      StartActivity.getAllData(this);
      paramString.putAll(StartActivity.systemData);
      this.net.postMessage(StartActivity.url, paramString, new NetReceiver()
      {
        public void netReceive(String paramAnonymousString)
        {
          if ((paramAnonymousString == null) || (paramAnonymousString.length() == 0))
          {
            AlertDialogHelper.showExitDialog(NewReMainActivity.this, "连接服务器失败，请重新，如果还不行，请联系客服");
            NewReMainActivity.this.runOnUiThread(new Runnable()
            {
              public void run()
              {
                NewReMainActivity.this.finish();
              }
            });
          }
          for (;;)
          {
            return;
            try
            {
              paramAnonymousString = JSONObject.parseObject(paramAnonymousString);
              if (paramAnonymousString.get("functionStr") != null) {
                StartActivity.functionStr = paramAnonymousString.getString("functionStr");
              }
              if (StartActivity.functionStr.indexOf("newRemain") < 0)
              {
                NewReMainActivity.this.runOnUiThread(new Runnable()
                {
                  public void run()
                  {
                    Toast.makeText(NewReMainActivity.this, "当前没有这个使用权限", 0).show();
                    NewReMainActivity.this.finish();
                  }
                });
                return;
              }
            }
            catch (Exception paramAnonymousString)
            {
              AlertDialogHelper.showExitDialog(NewReMainActivity.this, "发送错误，请重试");
              NewReMainActivity.this.runOnUiThread(new Runnable()
              {
                public void run()
                {
                  NewReMainActivity.this.finish();
                }
              });
            }
          }
        }
      });
      return;
    }
    catch (Exception paramString)
    {
      runOnUiThread(new Runnable()
      {
        public void run()
        {
          NewReMainActivity.this.finish();
        }
      });
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903056);
    if ((activity != null) && (!activity.isFinishing())) {
      activity.finish();
    }
    activity = this;
    this.listView = ((ListView)findViewById(2131230800));
    initData();
    updateTotal();
    this.adapter = new MyAdapter();
    this.listView.setAdapter(this.adapter);
    updateBottomData();
    LoadActivity.init(this, this);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131165186, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131230973) {
      AlertDialogHelper.getBuilder(this, "是否重置进度", new OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          if (NewReMainActivity.canUserArray.size() > 0)
          {
            NewReMainActivity.object.put("kindName", NewReMainActivity.canUserArray.get(0));
            NewReMainActivity.object.put("progress", Integer.valueOf(0));
            NewReMainActivity.save();
            NewReMainActivity.initData();
            NewReMainActivity.updateTotal();
            NewReMainActivity.this.adapter.notifyDataSetChanged();
            NewReMainActivity.this.updateBottomData();
          }
        }
      }).create().show();
    }
    for (;;)
    {
      return true;
      if (paramMenuItem.getItemId() == 2131230972)
      {
        paramMenuItem = new Intent();
        paramMenuItem.setClass(this, NewReMainSetActivity.class);
        startActivity(paramMenuItem);
      }
      else if (paramMenuItem.getItemId() == 2131230974)
      {
        paramMenuItem = new Intent();
        paramMenuItem.setClass(this, WebMessageActivity.class);
        paramMenuItem.putExtra("url", StartActivity.baseUrl + "/phone/ContentAction.action?action=newremain_help");
        startActivity(paramMenuItem);
      }
    }
  }
  
  protected void onResume()
  {
    initData();
    updateTotal();
    this.adapter.notifyDataSetChanged();
    updateBottomData();
    super.onResume();
  }
  
  public void setProgress(int paramInt, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("name", paramString);
    localIntent.putExtra("progress", paramInt);
    setResult(1, localIntent);
    finish();
  }
  
  public void showEditAlertDialog(int paramInt)
  {
    Builder localBuilder = new Builder(this);
    localBuilder.setTitle("注意");
    localBuilder.setMessage("是否删除当前留存");
    localBuilder.setNegativeButton("确定", new OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        NewReMainActivity.this.adapter.notifyDataSetChanged();
        Toast.makeText(NewReMainActivity.this, "删除成功", 0).show();
        NewReMainActivity.updateTotal();
      }
    });
    localBuilder.setPositiveButton("取消", new OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.cancel();
      }
    });
    this.dialog = localBuilder.create();
    this.dialog.show();
  }
  
  public void updateBottomData()
  {
    TextView localTextView1 = (TextView)findViewById(2131230801);
    TextView localTextView2 = (TextView)findViewById(2131230802);
    ProgressBar localProgressBar = (ProgressBar)findViewById(2131230803);
    TextView localTextView3 = (TextView)findViewById(2131230804);
    if (NewReMainSetActivity.getMode().equals("自动")) {
      localTextView1.setText("当前新增模式为:自动");
    }
    for (;;)
    {
      localTextView2.setText("当前分类为:" + object.getString("kindName"));
      localTextView3.setText("当前为第" + TotalProgress + "条数据，共" + TotalCount + "条数据");
      localProgressBar.setMax(TotalCount);
      localProgressBar.setProgress(TotalProgress);
      return;
      localTextView1.setText("当前新增模式为:设置值");
    }
  }
  
  class MyAdapter
    extends BaseAdapter
  {
    MyAdapter() {}
    
    public int getCount()
    {
      return NewReMainActivity.canUserArray.size();
    }
    
    public Object getItem(int paramInt)
    {
      return null;
    }
    
    public long getItemId(int paramInt)
    {
      return 0L;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      paramViewGroup = paramView;
      if (paramView == null)
      {
        paramViewGroup = LayoutInflater.from(NewReMainActivity.this).inflate(2130903057, null);
        paramView = new ViewHolder(NewReMainActivity.this);
        paramViewGroup.setTag(paramView);
        paramView.kindName = ((TextView)paramViewGroup.findViewById(2131230807));
        paramView.name = ((TextView)paramViewGroup.findViewById(2131230806));
        paramView.progress = ((ProgressBar)paramViewGroup.findViewById(2131230809));
        paramView.remainText = ((TextView)paramViewGroup.findViewById(2131230805));
        paramView.statusText = ((TextView)paramViewGroup.findViewById(2131230808));
      }
      paramView = (ViewHolder)paramViewGroup.getTag();
      String str = (String)NewReMainActivity.canUserArray.get(paramInt);
      Object localObject = Calendar.getInstance();
      ((Calendar)localObject).setTime(new Date());
      SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
      Calendar localCalendar = Calendar.getInstance();
      try
      {
        localCalendar.setTime(localSimpleDateFormat.parse(str));
        int j = NewReMainActivity.getDays((Calendar)localObject, localCalendar);
        localObject = (ArrayList)FileHelper.AllItemList.get(str);
        int k = NewReMainSetActivity.getRemain(j);
        i = 0;
        if (k != 0) {
          i = (int)(((ArrayList)localObject).size() / 100.0F * k + 0.5D);
        }
        paramView.kindName.setText("分类名：" + str);
        paramView.name.setText("第" + j + "天");
        paramView.remainText.setText("留存率:" + k);
        paramView.progress.setMax(i);
        if (str.equals(NewReMainActivity.object.get("kindName")))
        {
          paramView.statusText.setText("总共" + i + "条数据,已经完成" + NewReMainActivity.object.getIntValue("progress") + "条");
          paramView.progress.setProgress(NewReMainActivity.object.getIntValue("progress"));
          return paramViewGroup;
        }
      }
      catch (ParseException localParseException)
      {
        int i;
        for (;;)
        {
          localParseException.printStackTrace();
        }
        if (paramInt > NewReMainActivity.getPosition(NewReMainActivity.object.getString("kindName")))
        {
          paramView.statusText.setText("总共" + i + "条数据,已经完成0条");
          paramView.progress.setProgress(0);
          return paramViewGroup;
        }
        paramView.statusText.setText("总共" + i + "条数据,已经完成" + i + "条");
        paramView.progress.setProgress(i);
      }
      return paramViewGroup;
    }
  }
  
  class ViewHolder
  {
    public TextView kindName;
    public TextView name;
    public ProgressBar progress;
    public TextView remainText;
    public TextView statusText;
    
    ViewHolder() {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     NewReMainActivity

 * JD-Core Version:    0.7.0.1

 */