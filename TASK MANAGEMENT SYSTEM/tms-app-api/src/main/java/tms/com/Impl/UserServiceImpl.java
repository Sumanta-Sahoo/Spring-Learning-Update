package tms.com.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import tms.com.Entities.User;
import tms.com.Exception.ResourceNotFoundException;
import tms.com.Payloads.UserDto;
import tms.com.Repository.UserRepo;
import tms.com.Service.UserService;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	private ModelMapper modelMapper;

	@Override
	public UserDto createUser(UserDto userDto) {
		User user = this.modelMapper.map(userDto, User.class);
		User savedUser = this.userRepo.save(user);
		return this.modelMapper.map(savedUser, UserDto.class);
	}

	@Override
	public UserDto updateUser(UserDto userDto, Integer userId) {
		User user = this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User", "Id", userId));
		
		user.setUserName(userDto.getUserDtoName());
		user.setUserEmail(userDto.getUserDtoEmail());
		user.setUserPassword(userDto.getUserDtoPassword());
		
		User updatedUser = this.userRepo.save(user);
		return this.modelMapper.map(updatedUser, UserDto.class);
	}

	@Override
	public UserDto getUserById(Integer userId) {
		User user = this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User", "Id", userId));
		return this.modelMapper.map(user, UserDto.class);
	}

	@Override
	public List<UserDto> getAllUserList() {
		
		List<User> allUser = this.userRepo.findAll();
		
		List<UserDto> userDtoList = allUser.stream().map(user->this.modelMapper.map(user, UserDto.class)).collect(Collectors.toList());
		return userDtoList;
	}

	@Override
	public void deleteUser(Integer userId) {
		User user = this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User", "Id", userId));
		this.userRepo.delete(user);
	}

}
