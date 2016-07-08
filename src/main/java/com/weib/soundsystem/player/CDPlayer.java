/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.soundsystem.player;

import com.weib.soundsystem.cd.CD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author zhangjingwei
 */
//@Component
public class CDPlayer implements MediaPlayer {
    
    private CD cd;
    
    //@Autowired  //表名自动装配时所使用的构造器
    public CDPlayer(CD cd){
        this.cd = cd;
    }

    @Override
    public void play() {
        this.cd.play();
    }
    
}
