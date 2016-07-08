/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weib.soundsystem.configuration;

import com.weib.soundsystem.player.CDPlayer;
import com.weib.soundsystem.cd.SgtPeppers;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author zhangjingwei
 */
//@ComponentScan("com.weib.soundsystem") //指定包名
//@ComponentScan(basePackages={"com.weib.soundsystem"}) //指定多个包名
@ComponentScan(basePackageClasses={SgtPeppers.class, CDPlayer.class})   //指定组件类
public class CDPlayerConfig {
}
