package org.davidrt.springinaction.autoconfig.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages={"soundsystem", "video"})
//@ComponentScan(basePackageClasses={CDPlayer.class, DVDPlayer.class})
@ComponentScan(basePackages="org.davidrt.springinaction.autoconfig.soundsystem")
public class CDPlayerConfig {

}
