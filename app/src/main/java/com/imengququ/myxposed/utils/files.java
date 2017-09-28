package com.imengququ.myxposed.utils;

import android.provider.SyncStateContract;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static android.R.attr.path;

/**
 * Created by Administrator on 2017/9/5.
 *
 * 在smartAndroid 的tool的asstisttool中有file 的操作api
 */

public class files {

    public void deleteFile(File file) {
        if (file.exists()) { // 判断文件是否存在
            if (file.isFile()) { // 判断是否是文件
                file.delete(); // delete()方法 你应该知道 是删除的意思;
            } else if (file.isDirectory()) { // 否则如果它是一个目录
                File files[] = file.listFiles(); // 声明目录下所有的文件 files[];
                for (int i = 0; i < files.length; i++) { // 遍历目录下所有的文件
                    this.deleteFile(files[i]); // 把每个文件 用这个方法进行迭代
                }
            }
            file.delete();
        } else {

        }
    }

    public boolean FileExists(String url) {
        File f = new File(url);
        return f.exists();
    }


    public void copyFile(File sourcefile, File targetFile) {
        FileInputStream input = null;
        BufferedInputStream inbuff = null;
        FileOutputStream out = null;
        BufferedOutputStream outbuff = null;

        try {

            input = new FileInputStream(sourcefile);
            inbuff = new BufferedInputStream(input);

            out = new FileOutputStream(targetFile);
            outbuff = new BufferedOutputStream(out);

            byte[] b = new byte[1024 * 5];
            int len = 0;
            while ((len = inbuff.read(b)) != -1) {
                outbuff.write(b, 0, len);
            }

            outbuff.flush();
        } catch (Exception ex) {

        } finally {
            try {

                if (inbuff != null)
                    inbuff.close();
                if (outbuff != null)
                    outbuff.close();
                if (out != null)
                    out.close();
                if (input != null)
                    input.close();
            } catch (Exception ex) {

            }
        }
    }

    public boolean copyLast6Files(String srcDir, String dstDir) {

        // (new File(dstDir)).mkdir();
//        Log.v(TAG, "" + dstDir.toString());

        File[] files = (new File(srcDir)).listFiles();
        List<File> listFiles = Arrays.asList(files);
        Collections.sort(listFiles, new Comparator<File>() {
            public final int compare(File aa, File ab) {
                long sa = aa.lastModified();
                long sb = ab.lastModified();
//                Log.v(TAG, "copyLast6Files success 1");
                return (sa > sb) ? -1 : ((sa == sb) ? 0 : 1);
            }
        });

        if (files.length <= 0)
//            Log.v(TAG, "dump failure qiu");

        if (files.length >= 6) {
            (new File(dstDir)).mkdir();

            for (int i = 0; i < 6; ++i) {
                File temp = listFiles.get(i);
                copyFile(temp, new File(dstDir + temp.getName()));
            }
//            Log.v(TAG, "copyLast6Files success 2");
            return true;
        } else {
//            Log.v(TAG, "copyLast6Files failure 2");
            return false;
        }
        return false;

    }

}
