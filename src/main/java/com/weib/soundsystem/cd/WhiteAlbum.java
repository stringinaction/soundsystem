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
//@Component
public class WhiteAlbum implements CD {

    @Override
    public void play() {
        System.out.println("***This is a White Album***");
    }
    
}
