package cc.tinker.repository;

import cc.tinker.entity.PersonInfo;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface PersonFeatureDAO extends PagingAndSortingRepository<PersonInfo, Long>,
        JpaSpecificationExecutor<PersonInfo> {

	@Query("from PersonInfo p where p.id = ?1")
	PersonInfo getOneById(int id);

	@Query("from PersonInfo p where p.handleStatus = ?1")
    List<PersonInfo> getPersonIdList(int status);

}
