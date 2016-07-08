/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.soundsystem.configuration;

import com.weib.soundsystem.cd.CD;
import com.weib.soundsystem.player.CDPlayer;
import com.weib.soundsystem.cd.SgtPeppers;
import com.weib.soundsystem.cd.WhiteAlbum;
import com.weib.soundsystem.player.MediaPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author zhangjingwei
 */
@Configuration
//@ComponentScan("com.weib.soundsystem") //指定包名
//@ComponentScan(basePackages={"com.weib.soundsystem"}) //指定多个包名
//@ComponentScan(basePackageClasses={SgtPeppers.class, CDPlayer.class})   //指定组件类
public class CDPlayerConfig {
    
//    @Bean(name="lonelyHeartsClubBand")
//    public CD sgtPeppers(){
//        return new SgtPeppers();
//    }
    
    @Bean(name="whiteAlbum")
    public CD whiteAlbum(){
        return new WhiteAlbum();
    }
    
    @Bean(name="cdPlayer")
    public MediaPlayer cdPlayer(CD cd){
//        int randChoice = (int)Math.floor(Math.random() * 2);
//        if(randChoice == 0){
//            return new CDPlayer(sgtPeppers());  //并非调用sgtPeppers()方法，而是得到一个由该方法返回的Bean
//        }else if(randChoice == 1){
//            return new CDPlayer(whiteAlbum());
//        }        
//        return null;

        return new CDPlayer(cd);
    }
    
//    @Bean(name="cdWriter")
//    public MediaPlayer cdWriter(CD cd){
//        return new CDPlayer(cd);
//    }
}
