package cn.xing.xingye.weixin.message.hanler;

import cn.xing.xingye.model.WeixinImageMessage;
import cn.xing.xingye.model.WeixinMessage;

/**
 * Created by indexing on 16/4/19.
 */
public class ImageMessageHandler implements MessageHanlder {
    @Override
    public boolean match(WeixinMessage receiveMessage) {
        return receiveMessage instanceof WeixinImageMessage;
    }

    @Override
    public String handle(WeixinMessage receiveMessage) throws Exception {
        return "是给我发福利图吗?";
    }
}
