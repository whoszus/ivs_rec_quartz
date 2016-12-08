package cc.tinker.jobs;

import cc.tinker.entity.IvsRecResult;
import cc.tinker.entity.PersonInfo;
import cc.tinker.entity.PersonSimilarity;
import cc.tinker.entity.PersonTrack;
import cc.tinker.service.PersonFeatureService;
import cc.tinker.service.PersonSimilarityService;
import cc.tinker.service.PersonTrackService;
import cc.tinker.utils.DateTimeUtils;
import cc.tinker.utils.HttpFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;
import java.net.MalformedURLException;
import java.util.List;

/**
 * Created by Tinker on 2016/11/15.
 */

@Component
public class IvsImgCopyJob {

    private final String filepath = "D:\\GosunImgIvsResult\\";

    private final String assistFilePath = "E:\\CMCSAssist\\";


    @Autowired private PersonSimilarityService personSimilarityService;

    @Autowired private PersonFeatureService personFeatureService;

    @Autowired private PersonTrackService personTrackService;



    @Scheduled(cron="0 0/6 * * * ?")
    public void imgCopy(){
        System.out.println("开始执行文件任务" + System.currentTimeMillis() + "路径 ：" + filepath);


        List<PersonInfo> personInfoList = personFeatureService.getLeavePersonIdList();
        if(personInfoList.size()> 0){
            for(int i=0;i<personInfoList.size();i++){
                System.out.println("找到未导出图片人员");
                String PersonName = personInfoList.get(i).getName();
                // file root path
                String HFilepath= filepath+"PersonName_"+PersonName+"\\";
                List<PersonSimilarity> personList = personSimilarityService.findTop100ByPersonId(personInfoList.get(i).getId());
                for(int j =0 ;j<personList.size();j++){
                    PersonSimilarity personSimilarity = personList.get(j);
                    String fileUrl = personSimilarity.getIvsRecResult().getStorageInfo().getAddress()+personSimilarity.getIvsRecResult().getSnapshotUrl();
                    String[] oFileName = personSimilarity.getIvsRecResult().getSnapshotUrl().split("/");
                    String fileName = j +"_"+personSimilarity.getSim()+"_"+oFileName[oFileName.length - 1];
                    String finalFilePath = HFilepath+personSimilarity.getDevchnId().toString()+"\\";
                    File file =new File(finalFilePath);
                    if  (!file.exists()  && !file.isDirectory()) {
                        file.mkdirs();
                    }
                    try {
                        HttpFile.getFileByUrl(fileUrl,finalFilePath+fileName);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                }
                personInfoList.get(i).setHandleStatus(5);
            }
            personFeatureService.saveList(personInfoList);
        }
        System.out.println("文件任务结束" + System.currentTimeMillis());
    }


    @Scheduled(cron="0 0/2 * * * ?")
    public void assistFileCopy(){
        System.out.println("开始执行 Assist 算法 结果导出 ");
        List<PersonTrack> personTrackList = personTrackService.getListByStatus(0);
        if(personTrackList!= null){
            PersonTrack personTrack = personTrackList.get(0);
//            String personId = personTrack.getPersonId().toString();
            String startTime = DateTimeUtils.convertDateToStringByFormat(personTrack.getStartTime());
            String endTime = DateTimeUtils.convertDateToStringByFormat(personTrack.getEndTime());
            int channelId = personTrack.getDevchnId();
            List<IvsRecResult> ivsRecResultList = personTrackService.getListByTimeAndChn(startTime,endTime,channelId);
            String firstPathName = "ID_" +personTrack.getPersonId() + "\\";

            String secondPathName = startTime.replaceAll(":",".")+"--"+endTime.replaceAll(":",".")+"\\";
            for(int i=0;i<ivsRecResultList.size();i++){
                IvsRecResult ivsRecResult= ivsRecResultList.get(i);

                String  thirdPath = ivsRecResult.getDevchnId() + "\\";
                String[] fileNameArray = ivsRecResult.getSnapshotUrl().split("/");
                String fileName = fileNameArray[fileNameArray.length - 1];

                String originalFilePath= ivsRecResult.getStorageInfo().getAddress()+fileName;
                String finalFilePath = assistFilePath + firstPathName+secondPathName +thirdPath;

                File file =new File(finalFilePath);
                if  (!file.exists()  && !file.isDirectory()) {
                    file.mkdirs();
                }
                try {
                    HttpFile.getFileByUrl(originalFilePath,finalFilePath+fileName);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
            personTrack.setHandleStatus(1);

            personTrackService.save(personTrack);
        }

        System.out.println("执行 CMCS ASSIST 任务 完成 ！");

    }


    @Scheduled(cron="0 0/2 * * * ?")
    public void getIvsRecResultListByDate(){



//        List ivsResList = personTrackService.getIvsRecResultListByDate();

    }



}
