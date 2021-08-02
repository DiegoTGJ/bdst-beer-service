package diego.spring.msvc.bdstbeerservice.web.mappers;

import diego.spring.msvc.bdstbeerservice.domain.Beer;
import diego.spring.msvc.bdstbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;


@Mapper(uses = DateMapper.class)
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
