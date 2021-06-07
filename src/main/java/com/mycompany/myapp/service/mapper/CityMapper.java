package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.*;
import com.mycompany.myapp.service.dto.CityDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link City} and its DTO {@link CityDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface CityMapper extends EntityMapper<CityDTO, City> {}
