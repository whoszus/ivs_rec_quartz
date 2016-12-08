package cc.tinker.repository;

import cc.tinker.entity.IvsRecResult;
import cc.tinker.entity.PersonInfo;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by Tinker on 2016/11/23.
 */
public interface IvsReccResultDao extends PagingAndSortingRepository<IvsRecResult, Long>,
        JpaSpecificationExecutor<IvsRecResult> {


    @Query("from IvsRecResult r where r.snapshotTime >?1 and r.snapshotTime< ?2 and r.devchnId =?3")
    List<IvsRecResult> getListByTimeAndChn(String startTime , String endTime,int chnId);


    @Query("select  r.snapshotUrl,r.objX,r.objY,r.objWidth,r.objHeight,r.snapshotTime from IvsRecResult r where r.snapshotTime >?1 and r.snapshotTime< ?2")
    List<?> getIvsRecResultListByDate(String startTime ,String endTime);

}
