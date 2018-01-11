package net.pingfang.service;

import java.io.IOException;

/**
 * Created by leohe on 2017/11/18.
 */
public interface ConnectionService {

    String sendByRestful(String message);

    void sendMessageBySocket(String message) throws IOException;

}
