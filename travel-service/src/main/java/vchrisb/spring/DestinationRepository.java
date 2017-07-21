package vchrisb.spring;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinationRepository extends PagingAndSortingRepository<Destination, Long> {
	List<Destination> findByCity(@Param("city") String city);
}
