/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.soundsystem;

import com.weib.soundsystem.configuration.CDPlayerConfig;
import com.weib.soundsystem.player.CDPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author zhangjingwei
 */
public class CDPlayerMain {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = null;
        try{
            context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
//            SgtPeppers sp = (SgtPeppers) context.getBean("sgtPeppers");
//            sp.play();
            CDPlayer cdplayer = context.getBean(CDPlayer.class);
            cdplayer.play();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(context != null){
                context.close();
            }
        }
    }
}
