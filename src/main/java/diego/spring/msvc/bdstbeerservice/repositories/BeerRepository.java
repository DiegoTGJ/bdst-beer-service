package diego.spring.msvc.bdstbeerservice.repositories;

import diego.spring.msvc.bdstbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
