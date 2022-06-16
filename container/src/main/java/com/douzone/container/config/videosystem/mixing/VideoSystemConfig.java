package com.douzone.container.config.videosystem.mixing;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.douzone.container.videosystem.DVDPlayer;

/**
 * 
 * 		import
 * 	   <------ JavaConfig1, JavaConfig2
 *
 * JavaConfig1 + JavaConfig2
 */

@Configuration
@Import({DVDConfig.class, DVDPlayer.class})
public class VideoSystemConfig {

}
