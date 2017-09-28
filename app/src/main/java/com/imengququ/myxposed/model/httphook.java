package com.imengququ.myxposed.model;

import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URLDecoder;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;

/**
 * Created by Administrator on 2017/9/4.
 */

public class httphook  extends XC_MethodHook{


    protected void afterHookedMethod(MethodHookParam paramMethodHookParam)
            throws Throwable
    {
        StringBuffer localStringBuffer = new StringBuffer();
        Object localObject2 = (HttpUriRequest)paramMethodHookParam.args[0];
        Object localObject1 = ((HttpUriRequest)localObject2).getURI();
        if (((URI)localObject1).toString().equals("http://10.0.2.2:2861/installed")) {

        }
        while ((((URI)localObject1).toString().equals("http://10.0.2.2:2861/notification")) || (((URI)localObject1).toString().equals("http://10.0.2.2:2861/topActivityInfo")) || (((URI)localObject1).toString().startsWith("http://10.0.2.2:2862/switchorientation?orientation"))) {
            return;
        }
        localStringBuffer.append(((HttpUriRequest)localObject2).getMethod() + ":" + localObject1);
        dumpHeader(localStringBuffer, (HttpUriRequest)localObject2);


        if ((localObject2 instanceof HttpPost))
        {
            localObject2 = ((HttpPost)localObject2).getEntity();
            localStringBuffer.append("\nentity is:" + localObject2.getClass().getSimpleName());
            if (!(localObject2 instanceof UrlEncodedFormEntity)) {
                break label262;
            }
            localObject2 = EntityUtils.toString((UrlEncodedFormEntity)localObject2, "UTF-8");
            localStringBuffer.append("\nUrlEncodedFormEntity:" + URLDecoder.decode((String)localObject2, "UTF-8"));
        }
        for (;;)
        {
            Object result = paramMethodHookParam.getResult();
            if (result != null) {
                break;
            }
            localStringBuffer.append("ret is null");
            XposedBridge.log("wdj:" + localStringBuffer.toString());
            return;

            label262:
            if ((localObject2 instanceof StringEntity))
            {
                localStringBuffer.append("\nStringEntity:" + EntityUtils.toString((HttpEntity)localObject2, "UTF-8"));
            }
            else
            {
                if ((localObject2 instanceof ByteArrayEntity))
                {
                  ByteArrayEntity  byteArrayEntity = (ByteArrayEntity)((ByteArrayEntity)localObject2).clone();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byteArrayEntity.writeTo((OutputStream)byteArrayOutputStream);
                   byteArrayOutputStream.close();

                    StringBuffer stringBuffer = new StringBuffer();
                    int j = stringBuffer.length();
                    int i = 0;
                    for (;;)
                    {
                        if (i >= j)
                        {
                            localStringBuffer.append("\n" + ((StringBuffer)localObject3).toString());
                            break;
                        }
                        ((StringBuffer)localObject3).append(String.format("%X", new Object[] { Byte.valueOf(byteArrayEntity[i]) }));
                        i += 1;
                    }
                }
                localStringBuffer.append("\nunhandled entity type");
            }
        }
       HttpResponse httpResponse = (HttpResponse)paramMethodHookParam;
        localObject2 = paramMethodHookParam.getEntity();
        localStringBuffer.append("\nret type:" + localObject2.getClass().getSimpleName());
        if (((URI)localObject1).toString().toLowerCase().endsWith(".png")) {
            localStringBuffer.append(" req is png.");
        }
        for (;;)
        {
            localStringBuffer.append("\n wdj: -----------");
            XposedBridge.log("wdj:" + localStringBuffer.toString());
            return;
            if ((localObject2 instanceof HttpEntityWrapper))
            {
               BufferedHttpEntity bufferedHttpEntity = new BufferedHttpEntity((HttpEntity)localObject2);
                paramMethodHookParam.setEntity((HttpEntity)bufferedHttpEntity);
                localStringBuffer.append("\nret0->" + EntityUtils.toString((HttpEntity)localObject1, "UTF-8"));
            }
            else if (((HttpEntity)localObject2).isRepeatable())
            {
                localStringBuffer.append("\n ret1->" + EntityUtils.toString((HttpEntity)localObject2, "UTF-8"));
            }
            else
            {
                localStringBuffer.append("\n ret2-> unhandled entity type.");
            }
        }
    }

    protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
            throws Throwable
    {
       HttpUriRequest httpUriRequest = (HttpUriRequest)paramMethodHookParam.args[0];
        if ("http://app.zhijianjingling.com/client/repeat".equals(httpUriRequest.getURI().toString()))
        {
           HttpPost httpPost = (HttpPost) httpUriRequest;
            httpPost.getEntity();
            httpPost.setEntity(new StringEntity("imei=354707044189802"));
            XposedBridge.log("force data");
        }
    }

    protected void dumpHeader(StringBuffer paramStringBuffer, HttpUriRequest paramHttpUriRequest)
    {
        HeaderIterator headerIterator = paramHttpUriRequest.headerIterator();
        paramStringBuffer.append("\nheader:");
        for (;;)
        {
            if (!headerIterator.hasNext()) {
                return;
            }
            Header localHeader = headerIterator.nextHeader();
            paramStringBuffer.append(localHeader.getName() + "=" + localHeader.getValue());
            paramStringBuffer.append("&");
        }
    }
}
