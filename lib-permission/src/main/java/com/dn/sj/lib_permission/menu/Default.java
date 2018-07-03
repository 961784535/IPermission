package com.dn.sj.lib_permission.menu;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;

import com.dn.sj.lib_permission.menu.base.IMenu;

/**
 * @date 创建时间：2018/4/18
 * @description oppo 手机跳转到设置
 */

public class Default implements IMenu {

    @Override
    public Intent getMenuIntent(Context context) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        return intent;
    }

}
