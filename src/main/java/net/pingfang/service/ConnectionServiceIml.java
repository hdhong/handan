package net.pingfang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * Created by leohe on 2017/11/18.
 */
@Service
public class ConnectionServiceIml implements ConnectionService {

    @Value("${internal.socket.ip}")
    private String ip;
    @Value("${internal.socket.port}")
    private int port;
    @Value("${restful-api.address}")
    private String uri;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String sendByRestful(String message) {

        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        HttpEntity<String> request = new HttpEntity<>(message, headers);

        final ResponseEntity<String> response = restTemplate.postForEntity(uri, request, String.class);
        return response.getBody();
    }

    @Override
    public void sendMessageBySocket(String message) throws IOException {
        Socket server = new Socket(ip, port);
        OutputStreamWriter out = new OutputStreamWriter(server.getOutputStream(), "UTF-8");
        out.write(message);
        out.close();
        server.close();
    }

}
