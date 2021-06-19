package com.gua.guayun.today.common;

import java.util.Random;

public class Play {
    private static Random random = new Random();
    private static String[] names = new String[]{
            "骑马",
            "射箭",
            "羽毛球",
            "篮球",
            "乒乓球",
            "高尔夫球",
            "钓鱼",
            "开车",
            "骑自行车",
            "骑电动车",
            "跳舞",
            "唱歌",
            "写代码",
            "射击",
            "跑步",
            "双人运动",
            "爬山",
            "旅游",
            "看书",
    };

    public static String getPlay() {
        return names[random.nextInt(names.length)];
    }
}
