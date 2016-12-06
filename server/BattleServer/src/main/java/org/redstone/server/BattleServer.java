package org.redstone.server;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.RemoteEndpoint.Basic;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.apache.log4j.Logger;
import org.redstone.battle.battlemanage.ChinaBattleManage;
import org.redstone.handler.IMsgHandler;
import org.redstone.protobuf.util.DataUtils;
import org.redstone.protobuf.util.HandlerUtils;
import org.redstone.protobuf.util.SessionUtils;

@ServerEndpoint("/battleServer")
public class BattleServer {
	
	Session session;
	public static Map<String, Session> sessionMap = new HashMap<String, Session>();
	Basic remote;
	private final Logger logger = Logger.getLogger(BattleServer.class);
	@OnOpen
	public void onOpen(Session s){
		session = s;
		remote = session.getBasicRemote();
		sessionMap.put(session.getId(), session);
		logger.info(session.getId() + "登入battle");
	}
	
	@OnClose
	public void onClose(){
		ChinaBattleManage.remove(session.getId());
		SessionUtils.remove(session.getId());
		sessionMap.remove(session.getId());
		logger.info(session.getId() + "退出battle");
	}
	
	@OnMessage
	public void onMessage(String message){
		
	}
	
	@OnMessage
	public void receiveMessage(ByteBuffer reciveBuff) {
		byte[] orgi = reciveBuff.array();
		byte[] msgType = Arrays.copyOf(orgi, 2);
		byte[] msgBody = Arrays.copyOfRange(orgi, 2, orgi.length);
		short type = DataUtils.byteArray2T(msgType,Short.class);
		logger.info("msgType=" + type);
		IMsgHandler handler = HandlerUtils.getInstance().getHandler(type);
		ByteBuffer sendBuff = handler.process(msgBody, session.getId());
		if(sendBuff != null){
			sendBuff.flip();
			session.getAsyncRemote().sendBinary(sendBuff);
		}
	}
}
