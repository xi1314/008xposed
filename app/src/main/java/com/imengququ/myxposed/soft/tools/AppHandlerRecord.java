package com.imengququ.myxposed.soft.tools;

import com.alibaba.fastjson.JSONObject;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.util.Date;

public class AppHandlerRecord
{
  public static JSONObject dataList = new JSONObject();
  public static final String fileName = "appHandlerRecord";
  
  static
  {
    try
    {
      dataList = JSONObject.parseObject(PoseHelper008.getFileData("appHandlerRecord").trim());
      if (dataList == null) {
        dataList = new JSONObject();
      }

    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public static void addAppHandler(String paramString)
  {
    dataList.put(paramString, new Date().getTime());
    PoseHelper008.saveDataToFile("appHandlerRecord", JSONObject.toJSONString(dataList));
  }
}

