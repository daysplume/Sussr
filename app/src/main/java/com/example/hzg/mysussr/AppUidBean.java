package com.example.hzg.mysussr;

/**
 * Created by hzg on 2018/4/4 10:32
 * mail:1039766856@qq.com
 * Sussr
 */

public class AppUidBean {
    public String label;
    public String uid;
    public String packageName;//包名,用于获取图标

    public AppUidBean(String label, String uid, String packageName) {
        this.label = label;
        this.uid = uid;
        this.packageName = packageName;
    }
}
