package cc.tinker;

import cc.tinker.service.PersonTrackService;
import cc.tinker.utils.DateTimeUtils;
import cc.tinker.utils.ExcelUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IvsRecQuartzApplicationTests {
	@Autowired
	private PersonTrackService personTrackService;

	@Test
	public void contextLoads() {

//		String beginTime = ""

		Date date = new Date();
//		System.out.println(date);

		String dateString = DateTimeUtils.convertDateToStringByFormat(date);
		System.out.println(dateString);

		String dateString1 = DateTimeUtils.convertDateToStringByFormat(DateTimeUtils.getDateByByMinutesInt(-5));

		System.out.println(dateString1);


		long[] s = DateTimeUtils.diff(dateString,dateString1);

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

	}

	@Test
	public void getIvsRecResultListByDate(){


		String date = DateTimeUtils.convertDateToStringByFormat(new Date(),"yyyy-MM-dd 00:00:00");

		String dayBefore = DateTimeUtils.convertDateToStringByFormat(DateTimeUtils.getDateByByDaysInt(-1),"yyyy-MM-dd 00:00:00");


		List ivsList = personTrackService.getIvsRecResultListByDate(dayBefore,date);

		List header = new ArrayList();
		header.add("图片地址");
		header.add("uuid");
		header.add("X");
		header.add("Y");
		header.add("Width");
		header.add("Height");
		header.add("shotTime");



		
//		ExcelUtil.createXls();



//		List ivsResList = personTrackService.getIvsRecResultListByDate();

	}


}
