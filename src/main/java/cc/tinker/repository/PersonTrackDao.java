package cc.tinker.repository;

import cc.tinker.entity.PersonTrack;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface PersonTrackDao extends PagingAndSortingRepository<PersonTrack, Long>,
        JpaSpecificationExecutor<PersonTrack> {

    @Query("from PersonTrack p where p.handleStatus = ?1")
    List <PersonTrack> getListByStatus(int s);


}
