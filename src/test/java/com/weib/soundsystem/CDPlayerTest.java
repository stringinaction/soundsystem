/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.soundsystem;

import com.weib.soundsystem.cd.CD;
import com.weib.soundsystem.configuration.CDPlayerConfig;
import com.weib.soundsystem.player.MediaPlayer;
import static junit.framework.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author zhangjingwei
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
    
    @Autowired
    private CD cd;
    
    @Autowired
    private MediaPlayer mediaPlayer;
    
    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }
    
    @Test
    public void play(){
        assertNotNull(mediaPlayer);
        mediaPlayer.play();
    }
    
}
