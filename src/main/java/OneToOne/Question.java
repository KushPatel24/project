package OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
   @Id
   private int id;
   private String Question;
   @OneToOne
   private Answer ans;
   public int getId() {
	return id;
}
   public void setId(int id) {
	this.id = id;
}
   public String getQuestion() {
	return Question;
}
   public void setQuestion(String question) {
	Question = question;
}
public Answer getAns() {
	return ans;
}
public void setAns(Answer ans) {
	this.ans = ans;
}
@Override
public String toString() {
	return "Question [id=" + id + ", Question=" + Question + ", ans=" + ans + "]";
}
  

   
}
