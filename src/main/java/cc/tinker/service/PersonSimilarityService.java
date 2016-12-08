package cc.tinker.service;

import cc.tinker.entity.PersonSimilarity;
import cc.tinker.repository.PersonSimilarityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2016/11/4.
 *
 * @email whoszus@yahoo.com
 */
@Component
@Transactional
public class PersonSimilarityService {

    @Autowired
    PersonSimilarityDao personSimilarityDao;

    public List<PersonSimilarity> findTop100ByPersonId (int id){
        return personSimilarityDao.findTop100ByPersonId(id);
    }
    

    public List findChannelList(int personId){
        return personSimilarityDao.findChannelList(personId);
    }

    

}
