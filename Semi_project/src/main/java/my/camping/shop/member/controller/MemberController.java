package my.camping.shop.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.ModelAndView;

import my.camping.shop.member.util.MemberException;
import my.camping.shop.member.vo.MemberVO;

public interface MemberController {

	String memJoin();

	String memFind();

	String memInsert(HttpServletRequest req, HttpServletResponse res) throws MemberException;

	String login(HttpServletRequest req, HttpServletResponse res) throws MemberException;

	String memFindId(HttpServletRequest req, HttpServletResponse res) throws MemberException;

	String memFindPw(HttpServletRequest req, HttpServletResponse res) throws MemberException;


}
