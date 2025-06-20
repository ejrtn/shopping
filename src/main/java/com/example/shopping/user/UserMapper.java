package com.example.shopping.user;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    void createUserChatHistory(String userId);

    int userSave(UserDto userDto);

    int userDelete(String userId);

    int login(String userId, String password);

    int passwordUpdate(String userId, String password, String newPassword);

    int passwordUpdate2(String userId, String newPassword);

    String findId(String name, String email);

    String findPassword(String name, String email, String userId);

    int idDoubleCheck(String userId);

    UserDto getUser(String userId);

    int userUpdate(UserDto userDto);

    String chatInfo(String userId);

    List<UserDto> userList(int start);
}
