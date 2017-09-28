package com.soft.tools.messageAndContacts;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CallLog.Calls;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.soft.apk008.StartActivity;
import com.soft.apk008.WebMessageActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MessageAndContactsCreateActivity
  extends Activity
  implements View.OnClickListener
{
  private Button a;
  private Button b;
  private ListView c;
  private Button d;
  private Button e;
  private b f;
  private c g;
  private ArrayList h;
  private ArrayList i;
  private ArrayList j;
  private Button k;
  private a l;
  
  public static void a(Context paramContext)
  {
    int n = 0;
    if (!MessageAndContactsSetActivity.c()) {
      return;
    }
    int i1 = MessageAndContactsSetActivity.a();
    h.a(paramContext);
    int m = 0;
    label19:
    if (m >= i1)
    {
      i1 = MessageAndContactsSetActivity.b();
      a.a(paramContext);
      m = 0;
    }
    for (;;)
    {
      if (m >= i1)
      {
        i1 = MessageAndContactsSetActivity.b();
        b.a(paramContext);
        m = n;
        while (m < i1)
        {
          b.b(paramContext);
          m += 1;
        }
        break;
        h.b(paramContext);
        m += 1;
        break label19;
      }
      a.b(paramContext);
      m += 1;
    }
  }
  
  private ArrayList c()
  {
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[] { "display_name", "data1", "photo_id", "contact_id" }, null, null, null);
    if (localCursor != null) {}
    for (;;)
    {
      if (!localCursor.moveToNext())
      {
        localCursor.close();
        return localArrayList;
      }
      String str1 = localCursor.getString(1);
      if (!TextUtils.isEmpty(str1))
      {
        String str2 = localCursor.getString(0);
        localCursor.getLong(3);
        localCursor.getLong(2);
        localArrayList.add(str2 + "  " + str1);
      }
    }
  }
  
  public final ArrayList a()
  {
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = getContentResolver().query(CallLog.Calls.CONTENT_URI, null, null, null, null);
    if (localCursor.moveToFirst()) {
      do
      {
        String str1 = localCursor.getString(localCursor.getColumnIndex("number"));
        Integer.parseInt(localCursor.getString(localCursor.getColumnIndex("type")));
        String str2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(Long.parseLong(localCursor.getString(localCursor.getColumnIndexOrThrow("date")))));
        localCursor.getString(localCursor.getColumnIndexOrThrow("name"));
        String str3 = localCursor.getString(localCursor.getColumnIndexOrThrow("duration"));
        localArrayList.add(str1 + " : " + str2 + " " + str3);
      } while (localCursor.moveToNext());
    }
    return localArrayList;
  }
  
  public final ArrayList b()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject2 = new StringBuilder();
    for (;;)
    {
      int i4;
      try
      {
        Cursor localCursor = getContentResolver().query(Uri.parse("content://sms/"), new String[] { "_id", "address", "person", "body", "date", "type" }, null, null, "date desc");
        Object localObject1;
        if (localCursor.moveToFirst())
        {
          int m = localCursor.getColumnIndex("person");
          int n = localCursor.getColumnIndex("address");
          int i1 = localCursor.getColumnIndex("body");
          int i2 = localCursor.getColumnIndex("date");
          int i3 = localCursor.getColumnIndex("type");
          String str2 = localCursor.getString(m);
          String str3 = localCursor.getString(n);
          String str4 = localCursor.getString(i1);
          String str5 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(Long.parseLong(localCursor.getString(i2))));
          i4 = localCursor.getInt(i3);
          if (i4 != 1) {
            break label410;
          }
          localObject1 = "接收";
          ((StringBuilder)localObject2).append("名字：" + str2 + ",");
          ((StringBuilder)localObject2).append(str3 + ",");
          ((StringBuilder)localObject2).append(str4 + ",");
          ((StringBuilder)localObject2).append(str5 + ",");
          ((StringBuilder)localObject2).append((String)localObject1);
          localArrayList.add(((StringBuilder)localObject2).toString());
          localObject1 = new StringBuilder();
          if (!localCursor.moveToNext())
          {
            ((StringBuilder)localObject1).append("getSmsInPhone has executed!");
            return localArrayList;
          }
        }
        else
        {
          ((StringBuilder)localObject2).append("no result!");
          localObject1 = localObject2;
          continue;
        }
        localObject2 = localSQLiteException;
      }
      catch (SQLiteException localSQLiteException)
      {
        Log.d("SQLiteException in getSmsInPhone", localSQLiteException.getMessage());
        return localArrayList;
      }
      continue;
      label410:
      String str1;
      if (i4 == 2) {
        str1 = "发送";
      } else {
        str1 = "";
      }
    }
  }
  
  public void onClick(View paramView)
  {
    if (paramView.equals(this.a))
    {
      this.a.setBackgroundColor(-16776961);
      this.b.setBackgroundColor(-7829368);
      this.k.setBackgroundColor(-7829368);
      this.c.setAdapter(this.f);
    }
    do
    {
      do
      {
        return;
        if (paramView.equals(this.b))
        {
          this.a.setBackgroundColor(-7829368);
          this.b.setBackgroundColor(-16776961);
          this.k.setBackgroundColor(-7829368);
          this.c.setAdapter(this.g);
          return;
        }
        if (paramView.equals(this.k))
        {
          this.k.setBackgroundColor(-16776961);
          this.a.setBackgroundColor(-7829368);
          this.b.setBackgroundColor(-7829368);
          this.c.setAdapter(this.l);
          return;
        }
        if (!paramView.equals(this.d)) {
          break;
        }
        if (this.c.getAdapter() == this.f)
        {
          com.lishu.c.a.b(this, "该操作将删除手机上所有联系人，是否继续？", new c(this));
          return;
        }
        if (this.c.getAdapter() == this.g)
        {
          com.lishu.c.a.b(this, "该操作将删除手机上所有短信息，是否继续？", new d(this));
          return;
        }
      } while (this.c.getAdapter() != this.l);
      com.lishu.c.a.b(this, "该操作将删除手机上所有通话记录，是否继续？", new e(this));
      return;
    } while (!paramView.equals(this.e));
    com.lishu.c.a.b(this, "该操作将删除手机上的相关数据，然后再生成,是否继续？", new f(this));
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903086);
    this.a = ((Button)findViewById(2131362040));
    this.b = ((Button)findViewById(2131362041));
    this.k = ((Button)findViewById(2131362042));
    this.c = ((ListView)findViewById(2131362043));
    this.d = ((Button)findViewById(2131362044));
    this.e = ((Button)findViewById(2131362045));
    this.a.setOnClickListener(this);
    this.b.setOnClickListener(this);
    this.d.setOnClickListener(this);
    this.e.setOnClickListener(this);
    this.k.setOnClickListener(this);
    this.a.setBackgroundColor(-16776961);
    this.b.setBackgroundColor(-7829368);
    this.h = c();
    this.i = b();
    this.j = a();
    this.f = new b();
    this.g = new c();
    this.l = new a();
    this.c.setAdapter(this.f);
    this.k.setBackgroundColor(-7829368);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296264, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131362290)
    {
      new Intent();
      Toast.makeText(this, "暂时未实现", 0).show();
    }
    for (;;)
    {
      return super.onOptionsItemSelected(paramMenuItem);
      Intent localIntent;
      if (paramMenuItem.getItemId() == 2131362291)
      {
        localIntent = new Intent();
        localIntent.setClass(this, MessageAndContactsSetActivity.class);
        startActivity(localIntent);
      }
      else if (paramMenuItem.getItemId() == 2131362292)
      {
        localIntent = new Intent();
        localIntent.setClass(this, WebMessageActivity.class);
        localIntent.putExtra("url", StartActivity.b + "/phone/ContentAction.action?action=contactHelp");
        startActivity(localIntent);
      }
    }
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return MessageAndContactsCreateActivity.c(MessageAndContactsCreateActivity.this).size();
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
        paramView = new TextView(MessageAndContactsCreateActivity.this);
      }
      for (;;)
      {
        paramView = (TextView)paramView;
        paramView.setText((String)MessageAndContactsCreateActivity.c(MessageAndContactsCreateActivity.this).get(paramInt));
        return paramView;
      }
    }
  }
  
  final class b
    extends BaseAdapter
  {
    b() {}
    
    public final int getCount()
    {
      return MessageAndContactsCreateActivity.a(MessageAndContactsCreateActivity.this).size();
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
        paramView = new TextView(MessageAndContactsCreateActivity.this);
      }
      for (;;)
      {
        paramView = (TextView)paramView;
        paramView.setText((CharSequence)MessageAndContactsCreateActivity.a(MessageAndContactsCreateActivity.this).get(paramInt));
        return paramView;
      }
    }
  }
  
  final class c
    extends BaseAdapter
  {
    c() {}
    
    public final int getCount()
    {
      return MessageAndContactsCreateActivity.b(MessageAndContactsCreateActivity.this).size();
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
        paramView = new TextView(MessageAndContactsCreateActivity.this);
      }
      for (;;)
      {
        paramView = (TextView)paramView;
        paramView.setText((CharSequence)MessageAndContactsCreateActivity.b(MessageAndContactsCreateActivity.this).get(paramInt));
        return paramView;
      }
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.messageAndContacts.MessageAndContactsCreateActivity
 * JD-Core Version:    0.7.0.1
 */