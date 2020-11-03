package kr.creedit.api.front.member.mapper;

import kr.creedit.api.front.member.dto.MemberDto;
import kr.creedit.domain.rds.member.Member;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MemberDtoMapper {

    MemberDtoMapper INSTANCE = Mappers.getMapper(MemberDtoMapper.class);

    @Mapping(target = "email", source = "dto.email")
    @Mapping(target = "password", source = "dto.password")
    @Mapping(target = "userName", source = "dto.userName")
    Member toEntity(MemberDto.SignUp dto);
}
