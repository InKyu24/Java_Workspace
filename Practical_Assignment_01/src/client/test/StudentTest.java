package client.test;

import common.dto.StudentDTO;
import common.util.AssignmentException;
import server.dao.StudentDAO;

public class StudentTest {
	public static void main(String[] args) throws AssignmentException {		
		int no = 3;
		String name = "나길동";
		String det = "영문학과";
		String addr = "제주";
		String tel = "010-3333-3333";
		
		StudentDTO studentDTO = new StudentDTO(no,name,det,addr,tel);
		StudentDAO studentDAO = new StudentDAO();
		
		studentDAO.insertStudent(studentDTO);
		studentDAO.printAllStudents();
	}
}
