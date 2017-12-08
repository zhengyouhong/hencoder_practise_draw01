package com.hencoder.hencoderpracticedraw1;

import android.content.Context;

/**
 * Created by zhengyouhong on 2017/12/8.
 */

public class Utils {

    public static int dp2px(int dp, Context context){
        float density = context.getResources().getDisplayMetrics().density;
        return (int) (density * dp + 0.5f);
    }
}
