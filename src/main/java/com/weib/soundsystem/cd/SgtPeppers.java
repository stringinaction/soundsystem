/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.soundsystem.cd;

import org.springframework.stereotype.Component;

/**
 *
 * @author zhangjingwei
 */
@Component  //声明为组件类
public class SgtPeppers implements CD {

    private static String title = "Sgt. Peppers's Lonely Hearts Club Band";
    private static String artist = "The Beatles";
    
    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
    
}
