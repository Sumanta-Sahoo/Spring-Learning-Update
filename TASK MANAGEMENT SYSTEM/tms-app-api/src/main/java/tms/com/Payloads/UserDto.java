package tms.com.Payloads;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	@Autowired
	private ModelMapper modelMapper;

	private int userDtoID;
	private String userDtoName;
	private String userDtoEmail;
	private String userDtoPassword;
	
	
}
