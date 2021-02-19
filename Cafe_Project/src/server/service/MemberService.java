package server.service;

import java.util.ArrayList;

import common.entity.MemberDTO;
import common.util.CafeException;
import server.dao.MemberDAO;

public class MemberService {
	MemberDAO mdao=new MemberDAO();
	
	public MemberService() throws CafeException {
		mdao = new MemberDAO();
	}

	public void insertMember(MemberDTO m) throws CafeException {
		mdao.insertMember(m);		
	}
	
	public ArrayList<MemberDTO> selectMember() throws CafeException {
		return mdao.selectMember();
	}
		
	public String selectMember (String memID) throws CafeException {
		return mdao.selectMember(memID);
	}
	
	public void deleteMember (String memID) throws CafeException {
		mdao.deleteMember(memID);
	}

	public void updateMember(MemberDTO m) throws CafeException {
		mdao.updateMember(m);
		
	}
	
	
}
