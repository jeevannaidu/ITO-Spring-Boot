package spring.login;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean validateUser(String name,String password) {
		if(name.equals("Sati") && password.equals("0027"))
			return true;
		
		return false;
	}
}
