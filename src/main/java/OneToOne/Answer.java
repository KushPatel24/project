package OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Answer {
	@Id
	private int id;
	private String Answer;
	@OneToOne
	private Question que;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return Answer;
	}
	public void setAnswer(String answer) {
		Answer = answer;
	}
	public Question getQue() {
		return que;
	}
	public void setQue(Question que) {
		this.que = que;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", Answer=" + Answer + ", que=" + que + "]";
	}
	
	

}
