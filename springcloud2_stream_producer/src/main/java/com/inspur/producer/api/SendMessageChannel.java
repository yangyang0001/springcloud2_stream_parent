package com.inspur.producer.api;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

/**
 * User: YANG
 * Date: 2019/7/23-12:22
 * Description: No Description
 * 1. 整合 依赖
 * 2. @EnableBinding(SendMessageChannel.class)
 * 3. 在Controller中书写相应的东西
 */

public interface SendMessageChannel {
	@Output("my_message_channel")
	public SubscribableChannel sendMsg();
}
