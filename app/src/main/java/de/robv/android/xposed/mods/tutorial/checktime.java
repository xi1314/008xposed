package de.robv.android.xposed.mods.tutorial;

import com.a.a.maputils;
import com.lishu.c.p;
import com.lishu.c.v;
import com.lishu.c.w;
import com.soft.apk008.StartActivity;
import java.util.Date;
import java.util.HashMap;

public final class checktime
  implements w
{
  public static onlog onlog;
  public static String b = "小偷可耻";
  public static String c = "fuck you";
  public static String d = "";
  public static String e = "";
  public static String f = "";
  public static String g = "";
  private static long i = 0L;
  private static int j = 0;
  private static long l;
  private static String m = null;
  p h = new p();
  private boolean k = true;
  private String n = "";
  
  private void savaimeiandchecktime()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(this.n + "imei", j.a());
    localHashMap.put(this.n + "action", this.n + "checkTime");
    if (m == null)
    {
      StartActivity.a();
      m = StartActivity.b + "/phone/LogicSimpleAction.action";
    }
    this.h.a(m, localHashMap, this);
  }
  
  public final void savecheckerror(String paramString)
  {
    if (onlog != null) {
      onlog.onLog("netReceive " + paramString);
    }
    if ((paramString == null) || (paramString.length() == 0))
    {
      j += 1;
      PoseHelper008.saveDataToFile("checkError", j);
      return;
    }
    for (;;)
    {
      try
      {
        paramString = maputils.getmap(paramString);
        if (paramString == null) {
          break;
        }
        if (!paramString.get("status").equals("true")) {
          break label132;
        }
        this.k = true;
        j = 0;
      }
      catch (Exception paramString)
      {
        j += 1;
      }
      break;
      label132:
      this.k = false;
    }
  }
  
  public final boolean savecheckerror()
  {
    Object localObject;
    if (i == 0L)
    {
      localObject = PoseHelper008.getFileData("lastUseTime").trim().split("_");
      if ((localObject.length != 2) || (!v.a(localObject[0] + "lidashu").equals(localObject[1]))) {
        break label337;
      }
      localObject = localObject[0];
    }
    for (;;)
    {
      i = new Date().getTime();
      if (((String)localObject).length() > 0) {}
      try
      {
        i = Long.parseLong((String)localObject);
        label100:
        long l1 = new Date().getTime();
        if (l == 0L) {
          l = com.data.simulate.a.b.nextInt(30000) + 30000;
        }
        if (l1 - i > l)
        {
          savaimeiandchecktime();
          i = l1;
          localObject = new String[2];
          localObject[0] = i;
          localObject[1] = v.a(localObject[0] + "lidashu");
          PoseHelper008.saveDataToFile("lastUseTime", localObject[0] + "_" + localObject[1]);
        }
        if (PoseHelper008.getFileData("fresh").trim().equals("true"))
        {
          PoseHelper008.saveDataToFile("fresh", "false");
          i = l1;
          savaimeiandchecktime();
          if (onlog != null) {
            onlog.onLog("状态变化");
          }
        }
        localObject = PoseHelper008.getFileData("checkError").trim();
        if (((String)localObject).length() > 0)
        {
          int i1 = Integer.parseInt((String)localObject);
          j = i1;
          if (i1 > 3) {
            this.k = false;
          }
        }
        return this.k;
        label337:
        localObject = "0";
      }
      catch (Exception localException)
      {
        break label100;
      }
    }
  }
}

