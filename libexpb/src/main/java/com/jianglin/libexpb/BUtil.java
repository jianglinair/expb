package com.jianglin.libexpb;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Author: Jianglin
 * Time: 2021/2/2
 * Description: todo
 *
 * @author jiang
 */
public class BUtil {
    public static void navigate() {
        ARouter.getInstance().build(BusbPath.BUSB).navigation();
    }

    public static BService getService() {
        return (BService) ARouter.getInstance().build(BusbPath.BSERVICE).navigation();
    }

    public static BInfo getInfo() {
        return getService().getInfo();
    }
}
