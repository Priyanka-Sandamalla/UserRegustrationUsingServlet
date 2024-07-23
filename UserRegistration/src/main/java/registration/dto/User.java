package registration.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User {
	public static final String getPassword = null;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String first_name;
	private String last_name;
	@Column(unique=true)
	private String email;
	private String password;
	private long phone;
	private int age;
	private String gender;
	
	public User(int id, String first_name, String last_name, String email, String password, long phone, int age,
			String gender) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.age = age;
		this.gender = gender;
	}
	
	

	public User(String fn, String ln, String email2, String pswd, String phone2, String age2, String gender2) {
		// TODO Auto-generated constructor stub
	}



	public User(String first_name, String last_name, String email, String password, long phone, int age,
			String gender) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.age = age;
		this.gender = gender;
	}
	
}
