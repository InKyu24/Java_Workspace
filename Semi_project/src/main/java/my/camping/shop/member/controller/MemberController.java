package my.camping.shop.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import my.camping.shop.member.util.MemberException;

public interface MemberController {

	String memJoin();

	String memFind();

	String memInsert(HttpServletRequest req, HttpServletResponse res) throws MemberException;

	String login(HttpServletRequest req, HttpServletResponse res) throws MemberException;

	String memFindId(HttpServletRequest req, HttpServletResponse res) throws MemberException;

	String memFindPw(HttpServletRequest req, HttpServletResponse res) throws MemberException;

	String logout(HttpServletRequest req, HttpServletResponse res);


}
