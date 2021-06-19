package com.gua.guayun.today.common;

import java.util.Random;

public class Drink {
    private static Random random = new Random();
    private static String[] names = new String[]{
            "米酒",
            "格瓦斯",
            "杨枝甘露",
            "红茶",
            "绿茶",
            "白开水",
            "牛奶",
            "可乐",
            "橙汁",
            "椰汁",
            "王老吉"
    };

    public static String getDrink() {
        return names[random.nextInt(names.length)];
    }
}
