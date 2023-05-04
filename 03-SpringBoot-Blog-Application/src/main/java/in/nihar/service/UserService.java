package in.nihar.service;

import in.nihar.binding.Login;
import in.nihar.binding.Register;

public interface UserService {

	public Boolean register(Register register);

	public String login(Login login);
}
