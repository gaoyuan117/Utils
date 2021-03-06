package com.gaoyuan.utils.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by dn on 2017/2/20.
 * <p>
 * SharedPreferences 工具类
 */

public class SharedPreferenceUtils {
    private SharedPreferences sharedPreference;
    private SharedPreferences.Editor edit;

    public SharedPreferenceUtils(Context  context,String key) {
        sharedPreference = context.getSharedPreferences(key, context.MODE_PRIVATE);
    }

    /**
     * 初始化edit()
     *
     * @return
     */
    public SharedPreferenceUtils edit() {
        edit = sharedPreference.edit();
        return this;
    }

    /**
     * 保存
     *
     * @param key
     * @param value
     * @return
     */
    public SharedPreferenceUtils putString(String key, String value) {
        edit.putString(key, value);
        return this;
    }

    /**
     * 提交
     *
     * @return
     */
    public SharedPreferenceUtils commit() {
        edit.commit();
        return this;
    }

    /**
     * 获取数据
     * @param key
     * @return
     */
    public String get(String key) {
        String value = sharedPreference.getString(key,"");
        return value;
    }

}
