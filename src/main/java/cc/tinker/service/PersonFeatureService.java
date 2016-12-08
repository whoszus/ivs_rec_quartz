package cc.tinker.service;

import cc.tinker.entity.PersonInfo;
import cc.tinker.repository.PersonFeatureDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Component
@Transactional
public class PersonFeatureService {

	@Autowired
    private PersonFeatureDAO personFeatureDao;




    public List<PersonInfo> getLeavePersonIdList(){
        return personFeatureDao.getPersonIdList(4);
    }

	public void saveList(List<PersonInfo> list){
		personFeatureDao.save(list);
	}


}
