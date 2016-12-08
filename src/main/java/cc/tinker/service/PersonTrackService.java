package cc.tinker.service;

import cc.tinker.entity.IvsRecResult;
import cc.tinker.entity.PersonTrack;
import cc.tinker.repository.IvsReccResultDao;
import cc.tinker.repository.PersonTrackDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Tinker on 2016/11/23.
 */

@Service
public class PersonTrackService {

    @Autowired private PersonTrackDao personTrackDao;
    @Autowired private IvsReccResultDao ivsReccResultDao;


    public List<PersonTrack> getListByStatus(int status){

        return personTrackDao.getListByStatus(status);

    }

    public List<IvsRecResult> getListByTimeAndChn(String startTime , String endTime,int chnId){
        return ivsReccResultDao.getListByTimeAndChn(startTime,endTime,chnId);
    }


    public void save(PersonTrack personTrack){
        personTrackDao.save(personTrack);
    }

    public List<?> getIvsRecResultListByDate(String startTime ,String endTime){
        return ivsReccResultDao.getIvsRecResultListByDate(startTime,endTime);
    }

}
