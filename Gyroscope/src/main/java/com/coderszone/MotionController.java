package com.coderszone;


import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MotionController {

	@MessageMapping( "/motion" )
	@SendTo( "/topic/motion" )
	public MotionMessage motion( MotionMessage motionMessage ) throws Exception {

		// Do some stuff with the message
		
		return motionMessage;
	}
}
