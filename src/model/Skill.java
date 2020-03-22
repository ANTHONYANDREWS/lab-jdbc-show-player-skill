package model;

public class Skill
{
	private  Long skilld;
	private String skillName;
	
	//CONSTRUCTOR
	public Skill(Long skilld, String skillName) {
		super();
		this.skilld = skilld;
		this.skillName = skillName;
	}
//GETTERS AND SETTERS

	
	public Long getSkilld() {
		return skilld;
	}

	public void setSkilld(Long skilld) {
		this.skilld = skilld;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}


	
	
}
