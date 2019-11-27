package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;

	public String execute() {
		session.clear();
		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return this.session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}

//セッションの効果はいつまで続くの？
//ブラウザを閉じるまでという話だけど、プロジェクトを開きなおしても残っている
//いわゆるログインしたままの状態
//エクリプスだから？？
//講師に確認時に相談すること！！
