package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.SkillDAO;
import model.Skill;

public class Main
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		long id = 0;
		String name = null;
		List<Skill>  list= new ArrayList<Skill>();
	//	Skill skill=new Skill(id,name);
		SkillDAO skilldao=new SkillDAO();
		
		skilldao.listAllSkills();
		System.out.println("List of all Skills");
		for(Skill s: list)
		{
				System.out.println(s.getSkill_id()+" "+s.getSkill_name());
		}
		
		
	}
}
