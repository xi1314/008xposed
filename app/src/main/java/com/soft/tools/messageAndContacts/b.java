package com.soft.tools.messageAndContacts;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import java.util.Random;

public final class b
{
  public static String a = "的一了是我不在人们有来他这上着个地到大里说就去子得也和那要下看天时过出小么起你都把好还多没为又可家学只以主会样年想生同老中十从自面前头道它后然走很像见两用她国动进成回什边作对开而己些现山民候经发工向事命给长水几义三声于高手知理眼志点心战二问但身方实吃做叫当住听革打呢真全才四已所敌之最光产情路分总条白话东席次亲如被花口放儿常气五第使写军吧文运再果怎定许快明行因别飞外树物活部门无往船望新带队先力完却站代员机更九您每风级跟笑啊孩万少直意夜比阶连车重便斗马哪化太指变社似士者干石满日决百原拿群究各六本思解立河村八难早论吗根共让相研今其书坐接应关信觉步反处记将千找争领或师结块跑谁草越字加脚紧爱等习阵怕月青半火法题建赶位唱海七女任件感准张团屋离色脸片科倒睛利世刚且由送切星导晚表够整认响雪流未场该并底深刻平伟忙提确近亮轻讲农古黑告界拉名呀土清阳照办史改历转画造嘴此治北必服雨穿内识验传业菜爬睡兴形量咱观苦体众通冲合破友度术饭公旁房极南枪读沙岁线野坚空收算至政城劳落钱特围弟胜教热展包歌类渐强数乡呼性音答哥际旧神座章帮啦受系令跳非何牛取入岸敢掉忽种装顶急林停息句区衣般报叶压慢叔背细";
  public static String[] b = { "135", "136", "137", "138", "139", "150", "151", "152", "158", "159", "187", "188", "130", "131", "132", "155", "156", "185", "186", "133", "153", "180", "189" };
  public static String[] c = { "杨", "岳", "马", "赵", "张", "刘", "王", "廖", "高", "钱", "孙", "李", "周", "吴", "郑", "于", "郭", "朱", "彭", "韩", "胡", "陈", "段", "邓", "邱", "林", "宫", "乔" };
  
  public static void a(Context paramContext)
  {
    Cursor localCursor = paramContext.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
    for (;;)
    {
      if (!localCursor.moveToNext())
      {
        localCursor.close();
        return;
      }
      String str = localCursor.getString(localCursor.getColumnIndex("_id"));
      paramContext.getContentResolver().delete(ContactsContract.RawContacts.CONTENT_URI, "_id =?", new String[] { str });
    }
  }
  
  public static void b(Context paramContext)
  {
    int i = (int)(10.0D * Math.random());
    Object localObject = new Random();
    if (i + 5 <= 0) {
      return;
    }
    int j = (int)(2.0D * Math.random());
    String str = c[((int)(Math.random() * c.length))];
    i = 0;
    for (;;)
    {
      if (i >= j + 1)
      {
        localObject = b[((int)(Math.random() * b.length))] + (10000000 + (int)(89999999.0D * Math.random()));
        ContentValues localContentValues = new ContentValues();
        long l = ContentUris.parseId(paramContext.getContentResolver().insert(ContactsContract.RawContacts.CONTENT_URI, localContentValues));
        localContentValues.clear();
        localContentValues.put("raw_contact_id", Long.valueOf(l));
        localContentValues.put("mimetype", "vnd.android.cursor.item/name");
        localContentValues.put("data1", str);
        paramContext.getContentResolver().insert(ContactsContract.Data.CONTENT_URI, localContentValues);
        localContentValues.clear();
        localContentValues.put("raw_contact_id", Long.valueOf(l));
        localContentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
        localContentValues.put("data1", (String)localObject);
        paramContext.getContentResolver().insert(ContactsContract.Data.CONTENT_URI, localContentValues);
        return;
      }
      str = str + a.charAt(((Random)localObject).nextInt(a.length()));
      i += 1;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.messageAndContacts.Inttolong

 * JD-Core Version:    0.7.0.1

 */