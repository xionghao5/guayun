package com.gua.guayun.today.common;

import java.util.Random;

public class Fun {
    private static Random random = new Random();
    private static String[] names = new String[]{
            "观察者网",
            "NBA",
            "bilibili",
            "pronhub",
            "虎扑",
            "环球网",
            "游戏",
            "斗鱼",
            "虎牙",
            "知乎"
    };

    public static String getFun() {
        return names[random.nextInt(names.length)];
    }
}
