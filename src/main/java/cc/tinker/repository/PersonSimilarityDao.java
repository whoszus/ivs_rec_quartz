package cc.tinker.repository;

import cc.tinker.entity.PersonSimilarity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by Administrator on 2016/11/4.
 *
 * @email whoszus@yahoo.com
 */
public interface PersonSimilarityDao extends PagingAndSortingRepository<PersonSimilarity, Long>,
        JpaSpecificationExecutor<PersonSimilarity> {

    @Query("from  PersonSimilarity p where p.personId = ?1 order by p.sim desc ")
    List<PersonSimilarity> findTop100ByPersonId(int id);


    @Query("select  p.devchnId  from  PersonSimilarity p where p.personId =?1 group by p.devchnId")
    List findChannelList(int personId);
}
 