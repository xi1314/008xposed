package com.soft.tools.accountSim;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import com.a.a.Map;
import com.data.simulate.SimulateDataTest;
import com.soft.apk008.StartActivity;
import com.soft.apk008.WebMessageActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.util.ArrayList;
import java.util.Iterator;

public class AccountSimActivity
  extends Activity
{
  private static com.a.a.b e;
  private ListView a;
  private Button b;
  private CheckBox c;
  private a d;
  
  public static ArrayList accountarraylist()
  {
    Object localObject;
    if (e == null) {
      localObject = PoseHelper008.getFileData("accountSimActivity");
    }
    try
    {
      e = com.a.a.b.c((String)localObject);
      label19:
      if (e == null) {
        e = new com.a.a.b();
      }
      localObject = new ArrayList();
      int i = 0;
      for (;;)
      {
        if (i >= e.size()) {
          return localObject;
        }
        Map locale = e.a(i);
        ((ArrayList)localObject).add(new Account(locale.getStringfrommap("name"), locale.getStringfrommap("type")));
        i += 1;
      }
    }
    catch (Exception localException)
    {
      break label19;
    }
  }
  
  public static void saveaccountdatatoFile()
  {
    if (!AccountSimSetActivity.b()) {}
    while (!AccountSimSetActivity.a()) {
      return;
    }
    e();
    PoseHelper008.saveDataToFile("accountSimActivity", e.a());
  }
  
  private static void e()
  {
    int i = AccountSimSetActivity.c();
    if (e == null) {
      e = new com.a.a.b();
    }
    e.clear();
    Iterator localIterator = AccountSimSetActivity.a(i).iterator();
    if (!localIterator.hasNext()) {
      return;
    }
    Object localObject1 = (String[])localIterator.next();
    String str = localObject1[0];
    Object localObject2 = localObject1[1];
    localObject1 = "";
    if (localObject2.equals("0")) {
      localObject1 = SimulateDataTest.getRandEmail();
    }
    for (;;)
    {
      localObject1 = new Account((String)localObject1, str);
      e.add(localObject1);
      break;
      if (localObject2.equals("1"))
      {
        localObject1 = "46000";
        if (PoseHelper008.valueMap != null) {
          localObject1 = PoseHelper008.valueMap.get("getSubscriberId");
        }
        localObject1 = SimulateDataTest.getPhoneNumber((String)localObject1);
      }
      else if (localObject2.equals("3"))
      {
        localObject1 = SimulateDataTest.getRandData(3, 10);
      }
    }
  }
  
  public final void a()
  {
    e();
    this.d.notifyDataSetChanged();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903078);
    this.a = ((ListView)findViewById(2131362004));
    this.b = ((Button)findViewById(2131362005));
    this.c = ((CheckBox)findViewById(2131362006));
    if (e == null) {
      paramBundle = PoseHelper008.getFileData("accountSimActivity");
    }
    try
    {
      e = com.a.a.b.c(paramBundle);
      label69:
      if (e == null) {
        e = new com.a.a.b();
      }
      this.d = new a();
      this.a.setAdapter(this.d);
      this.b.setOnClickListener(new a(this));
      this.c.setOnCheckedChangeListener(new b(this));
      if (AccountSimSetActivity.b()) {
        this.c.setChecked(true);
      }
      return;
    }
    catch (Exception paramBundle)
    {
      break label69;
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296263, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    Intent localIntent;
    if (paramMenuItem.getItemId() == 2131362288)
    {
      localIntent = new Intent();
      localIntent.setClass(this, AccountSimSetActivity.class);
      startActivity(localIntent);
    }
    for (;;)
    {
      return super.onOptionsItemSelected(paramMenuItem);
      if (paramMenuItem.getItemId() == 2131362289)
      {
        localIntent = new Intent();
        localIntent.setClass(this, WebMessageActivity.class);
        localIntent.putExtra("url", StartActivity.b + "/phone/ContentAction.action?action=accountSimHelp");
        startActivity(localIntent);
      }
    }
  }
  
  protected void onPause()
  {
    PoseHelper008.saveDataToFile("accountSimActivity", e.a());
    super.onDestroy();
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return AccountSimActivity.d().size();
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
      if (paramView == null) {
        paramView = new TextView(AccountSimActivity.this);
      }
      for (;;)
      {
        paramView = (TextView)paramView;
        Object localObject = AccountSimActivity.d().a(paramInt);
        paramViewGroup = ((Map)localObject).getStringfrommap("name");
        localObject = ((Map)localObject).getStringfrommap("type");
        paramView.setText("账号：" + paramViewGroup + ",类型：" + (String)localObject);
        return paramView;
      }
    }
  }
}


