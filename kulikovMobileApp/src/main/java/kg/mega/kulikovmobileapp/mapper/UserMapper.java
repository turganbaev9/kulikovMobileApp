package kg.mega.kulikovmobileapp.mapper;

import kg.mega.kulikovmobileapp.model.User;
import kg.mega.kulikovmobileapp.model.dto.UserRqDTO;
import kg.mega.kulikovmobileapp.model.dto.UserRsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toEntity(UserRqDTO userRqDTO);
    UserRsDTO toDto(User user);

    List<UserRsDTO> toDtoList(List<User> users);
    List<User> toEntityList(List<UserRqDTO> users);
}
