package cc.tinker.repository;


import cc.tinker.entity.StorageInfo;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface StorageDAO extends PagingAndSortingRepository<StorageInfo, Long>,
        JpaSpecificationExecutor<StorageInfo> {

	@Modifying
	@Query("from StorageInfo info where info.type = ?1")
	List<StorageInfo> getInfoByType(Integer type);

	@Query("from StorageInfo info where info.uuid = ?1  and  info.type = 3 ")
	StorageInfo getInfoByUuid(String uuid);
	
}
