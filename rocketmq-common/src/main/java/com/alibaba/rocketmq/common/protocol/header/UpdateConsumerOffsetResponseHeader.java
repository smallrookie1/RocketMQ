/**
 * $Id: UpdateConsumerOffsetResponseHeader.java 1835 2013-05-16 02:00:50Z shijia.wxr $
 */
package com.alibaba.rocketmq.common.protocol.header;

import com.alibaba.rocketmq.remoting.CommandCustomHeader;
import com.alibaba.rocketmq.remoting.exception.RemotingCommandException;


/**
 * @author vintage.wang@gmail.com shijia.wxr@taobao.com
 * 
 */
public class UpdateConsumerOffsetResponseHeader implements CommandCustomHeader {
    @Override
    public void checkFields() throws RemotingCommandException {

    }
}