/**
 * $Id: SearchOffsetRequestHeader.java 1835 2013-05-16 02:00:50Z shijia.wxr $
 */
package com.alibaba.rocketmq.common.protocol.header;

import com.alibaba.rocketmq.remoting.CommandCustomHeader;
import com.alibaba.rocketmq.remoting.annotation.CFNotNull;
import com.alibaba.rocketmq.remoting.exception.RemotingCommandException;


/**
 * @author vintage.wang@gmail.com shijia.wxr@taobao.com
 * 
 */
public class SearchOffsetRequestHeader implements CommandCustomHeader {
    @CFNotNull
    private String topic;
    @CFNotNull
    private Integer queueId;
    @CFNotNull
    private Long timestamp;


    @Override
    public void checkFields() throws RemotingCommandException {
        // TODO Auto-generated method stub

    }


    public String getTopic() {
        return topic;
    }


    public void setTopic(String topic) {
        this.topic = topic;
    }


    public Integer getQueueId() {
        return queueId;
    }


    public void setQueueId(Integer queueId) {
        this.queueId = queueId;
    }


    public Long getTimestamp() {
        return timestamp;
    }


    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

}
