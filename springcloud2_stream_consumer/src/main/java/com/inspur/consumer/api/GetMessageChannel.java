package com.inspur.consumer.api;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * User: YANG
 * Date: 2019/7/23-12:22
 * Description: No Description
 * 1. 整合 依赖
 * 2. @EnableBinding(SendMessageChannel.class)
 * 3. 在Controller中书写相应的东西
 */

public interface GetMessageChannel {
	@Input("my_message_channel")
	public SubscribableChannel getMsg();
}
