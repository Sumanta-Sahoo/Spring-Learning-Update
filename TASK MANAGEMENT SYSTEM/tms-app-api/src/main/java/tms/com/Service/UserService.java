package tms.com.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import tms.com.Payloads.UserDto;
@Service
public interface UserService {
	
	UserDto createUser(UserDto userDto);
	UserDto updateUser(UserDto userDto, Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUserList();
	
	void deleteUser(Integer userId);
}
