package com.klymenko.websocket;


import java.io.IOException;
import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/websocket")
public class SocketServer {

    @OnOpen
    public void onOpen(Session session) throws IOException {
        session.getBasicRemote().sendText("Connection Established");
    }

    @OnMessage
    public void onMessage(String message, Session session) throws IOException {
        session.getBasicRemote().sendText("Received " + message);
    }
}