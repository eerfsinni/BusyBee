package mul.cam.a.dao;

import java.util.List;

import mul.cam.a.dto.BbsParam;
import mul.cam.a.dto.EmailCertiDto;
import mul.cam.a.dto.UserDto;

public interface UserDao {

	int addCert(EmailCertiDto dto);
	int selectCert(EmailCertiDto dto);
	int select3(String id);
	
	// User 추가
	int addUser(UserDto dto);
	
	// ID 중복체크
	int idCheck(String id);
	
	// Login
	UserDto login(UserDto dto);
	
	UserDto selectUser(String id);
	
	int updUser_n(UserDto dto);
	int updUser_y(UserDto dto);
	int updUser_b(UserDto dto);
	
	int delUser(String id);
	
	// 유저 리스트
	List<UserDto> userList(BbsParam param);
	
	// 유저 총 수
	int getAllUser(BbsParam param);
	
	// 유저 정지
	int userBan(UserDto dto);
	
	// 정지 해제
	int userIn(UserDto dto);
	

}