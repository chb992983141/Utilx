package com.duff.steamplus.utilx;

import com.duff.steamplus.R;
import com.lidroid.xutils.BitmapUtils;

/**
 * xutils工具处理图片加载
 * 饱汉模式
 * Created by ezez-c on 2017/1/16.
 */
public class BitmapUtilx {
    // TODO: 2017/1/16 后续考虑使用picasso
    private static BitmapUtils mBitmapUtils = null;

    public static BitmapUtils getBitmapUtils() {
        if (mBitmapUtils == null) {
            mBitmapUtils = new BitmapUtils(UIUtilx.getContext());
        }

        //默认加载图片是一张空图
        mBitmapUtils.configDefaultLoadingImage(R.mipmap.pic_nothing);
        return mBitmapUtils;
    }
}
