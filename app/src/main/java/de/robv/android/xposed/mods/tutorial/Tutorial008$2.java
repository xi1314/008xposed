package de.robv.android.xposed.mods.tutorial;

import android.os.Environment;

import com.soft.apk008.x;
import de.robv.android.xposed.XC_MethodHook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.RandomAccessFile;
import java.net.URI;

class Tutorial008$2
  extends XC_MethodHook
{
  Tutorial008$2(Tutorial008 paramTutorial008, String paramString1, String paramString2) {}
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
    throws Throwable
  {
    String str = "";
    if (this.b.equals(File.class.getName())) {
      if (paramMethodHookParam.args.length == 1) {
        if ((paramMethodHookParam.args[0] instanceof URI)) {
          this.a.onLog("--------file--URI----" + paramMethodHookParam.args[0]);
        }
      }
    }
    label241:
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                for (;;)
                {
                  return;
                  str = paramMethodHookParam.args[0];
                  while ((str.indexOf(".logwerdfsdfga") < 0) && (str.indexOf(".system") < 0))
                  {
                    if (!PoseHelper008.checkFileName(str, paramMethodHookParam)) {
                      break label241;
                    }
                    this.a.onLog("屏蔽路径:" + str);
                    return;
                    if (paramMethodHookParam.args.length == 2) {
                      if ((paramMethodHookParam.args[0] instanceof File)) {
                        str = ((File)paramMethodHookParam.args[0]).getAbsolutePath() + File.separator + paramMethodHookParam.args[1];
                      } else {
                        str = paramMethodHookParam.args[0] + File.separator + paramMethodHookParam.args[1];
                      }
                    }
                  }
                }
                if ((!str.equals("/proc/cpuinfo")) || (!new File(x.c).exists())) {
                  break;
                }
                this.a.onLog("设置cpu信息");
                if (PoseHelper008.valueMap.get("setCpuName") != null) {
                  x.a(PoseHelper008.valueMap.get("setCpuName"));
                }
                if (paramMethodHookParam.args.length == 1)
                {
                  paramMethodHookParam.args[0] = x.c;
                  return;
                }
              } while (paramMethodHookParam.args.length != 2);
              if ((paramMethodHookParam.args[0] instanceof File))
              {
                paramMethodHookParam.args[0] = Environment.getExternalStorageDirectory();
                paramMethodHookParam.args[1] = x.a;
                return;
              }
              paramMethodHookParam.args[0] = Environment.getExternalStorageDirectory().getAbsolutePath();
              paramMethodHookParam.args[1] = x.a;
              return;
              this.a.recordFile(str, this.c);
              super.afterHookedMethod(paramMethodHookParam);
              return;
              if (!FileInputStream.class.getName().equals(this.b)) {
                break;
              }
            } while (!(paramMethodHookParam.args[0] instanceof String));
            paramMethodHookParam = (String)paramMethodHookParam.args[0];
            if ((paramMethodHookParam.indexOf(".logwerdfsdfga") >= 0) || (paramMethodHookParam.indexOf(".system") >= 0))
            {
              this.a.onLog("--------不记录的目录-----------" + paramMethodHookParam);
              return;
            }
            this.a.recordFile(paramMethodHookParam, this.c);
            return;
            if (!RandomAccessFile.class.getName().equals(this.b)) {
              break;
            }
            if ((paramMethodHookParam.args[0] instanceof File)) {
              str = ((File)paramMethodHookParam.args[0]).getAbsolutePath();
            }
            for (;;)
            {
              if (!str.equals("/proc/cpuinfo")) {
                break label645;
              }
              if ((!new File(x.c).exists()) || (PoseHelper008.valueMap.get("setCpuName") == null)) {
                break;
              }
              this.a.onLog("设置cpu信息");
              x.a(PoseHelper008.valueMap.get("setCpuName"));
              paramMethodHookParam.args[0] = x.c;
              return;
              if ((paramMethodHookParam.args[0] instanceof String)) {
                str = (String)paramMethodHookParam.args[0];
              }
            }
          } while (str.length() == 0);
          this.a.recordFile(str, this.c);
          return;
        } while (!FileReader.class.getName().equals(this.b));
        if (!paramMethodHookParam.args[0].equals("/proc/cpuinfo")) {
          break;
        }
      } while ((!new File(x.c).exists()) || (PoseHelper008.valueMap.get("setCpuName") == null));
      this.a.onLog("设置cpu信息");
      x.a(PoseHelper008.valueMap.get("setCpuName"));
      paramMethodHookParam.args[0] = x.c;
      return;
    } while (!(paramMethodHookParam.args[0] instanceof String));
    label645:
    paramMethodHookParam = (String)paramMethodHookParam.args[0];
    this.a.recordFile(paramMethodHookParam, this.c);
  }
}


