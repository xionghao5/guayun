package com.gua.guayun.today.controller;

import com.gua.guayun.today.common.Drink;
import com.gua.guayun.today.common.Eat;
import com.gua.guayun.today.common.Fun;
import com.gua.guayun.today.common.Play;
import com.gua.guayun.today.pojo.Today;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author xionghao5
 * @Date 2020/8/27
 * @Version V1.0
 **/
@RestController
public class TodayController {

    @GetMapping("/today")
    public Today hello() {
        Today today = new Today();
        today.setEat(Eat.getEat());
        today.setDrink(Drink.getDrink());
        today.setPlay(Play.getPlay());
        today.setFun(Fun.getFun());
        return today;
    }
}
