package com.gaoyuan.utils.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by gaoyuan on 2017/3/12.
 */

public class ToastUtils {
    private static Toast toast = null; //Toast的对象！

    public static void showToast(Context mContext, String message) {
        if (toast == null) {
            toast = Toast.makeText(mContext, message, Toast.LENGTH_SHORT);
        }
        else {
            toast.setText(message);
        }
        toast.show();
    }
}
