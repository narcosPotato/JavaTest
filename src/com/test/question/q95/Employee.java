package com.test.question.q95;

class Employee {
	   private String name;
	   private String department; 	//부서
	   private String position; 	//직책
	   private String tel;
	   private Employee boss;
	   
	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if (name.length() < 2 && name.length() > 5) {
			return;
		} else {
			for(int i=0; i<name.length(); i++) {
				
				char c = name.charAt(i);
				
				if(c < '가' || c >'힣') {
					return;
				}
			}
		}
		
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		//영업부, 기획부, 총무부, 개발부, 홍보부
		if (department.equals("홍보부") || department.equals("개발부") || department.equals("총무부") ||
			department.equals("기획부") || department.equals("영업부")) {
			this.department = department;			
		} else {
			return;
		} 
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		//부장, 과장, 대리, 사원
		if (position.equals("부장") || position.equals("과장") ||
			position.equals("대리") || position.equals("사원")) {
			this.position = position;			
		} else {
			return;
		}
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		
	      if (!tel.startsWith("010-")) {
	          return;
	       }

	       String temp = tel.substring(4);
	       temp = temp.replace("-", "");

	       for (int i = 0; i < temp.length(); i++) {
	          char c = temp.charAt(i);
	          if (c < '0' || c > '9') {
	             return;
	          }
	       }

	       this.tel = tel;
	}

	public Employee getBoss() {
		return boss;
	}

	public void setBoss(Employee boss) {
		
	    if (boss == null) {
	        return;
	    }
	    
		if (!this.department.equals(boss.getDepartment())) {
			return;
		}
		this.boss = boss;
	}


	   //getter, setter 구현

	   public void info() {
		   	
		   String temp = "";
		   
		   temp += "[" + this.name + "]" + "\n";
		   temp += "- 부서: " + this.department + "\n";
		   temp += "- 직위: " + this.position + "\n";
		   temp += "- 연락처: " + this.tel + "\n";
		   
		   if (this.boss != null) {
			   temp += "- 직속상사: " + this.boss.getName() + "(" + this.boss.getDepartment() + " " + this.boss.getPosition() + ")";
		   } else {
			   temp += "- 직속상사: 없음";
		   }
		   
		   System.out.println(temp + "\n");
	  }
}
