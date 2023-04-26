package testJackson.POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
	
	@JsonProperty("NAME")
	private String name;

	@JsonProperty("AGE")
	private String age;
	
	@JsonProperty("BDate")
	private String birthDate;
	
	@JsonProperty("SEQ")
	private String seq;
	
	@JsonProperty("G")
	private String gender;
	
	public User() {}
	
	public User(String name, String age, String birthDate, String seq, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.birthDate = birthDate;
		this.seq = seq;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "name:" + this.name + " age:" + this.age + " birthDate:" + this.birthDate 
		     + " seq:" + this.seq + " gender:" + this.gender;
	}
	
}
