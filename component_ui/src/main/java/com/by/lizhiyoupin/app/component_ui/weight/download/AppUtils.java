package com.by.lizhiyoupin.app.component_ui.weight.download;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * (Hangzhou)
 *
 * @author: wzm
 * @date :  2019/12/10 16:39
 * Summary:
 */
public class AppUtils {
    /**
     * 获取应用程序名称  ${APP_NAME} 会死悄悄啊
     * @param context Context
     * @return 当前应用的名称
     */
    public static synchronized String getAppName(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(
                    context.getPackageName(), 0);
            int labelRes = packageInfo.applicationInfo.labelRes;
            return context.getResources().getString(labelRes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }




    /**
     * [获取应用程序版本名称信息]
     *
     * @param context context
     * @return 当前应用的版本名称
     */
    public static synchronized String getPackageName(Context context) {

        //==get
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(
                    context.getPackageName(), 0);
            return packageInfo.packageName;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
