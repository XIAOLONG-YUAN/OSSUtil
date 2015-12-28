package com.prince.util;

import com.aliyun.oss.OSS;
import com.aliyun.oss.model.OSSObjectSummary;
import com.prince.util.ossutil.OSSUtil;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /*public void testCreateBucket(){
        OSSUtil ossUtil = OSSUtil.getInstance();
        ossUtil.createBucket("gagablog");
    }*/

    public void testUploadFile(){
//        OSSUtil ossUtil = OSSUtil.getInstance();
//        String bucketName = "gagablog";
//        ossUtil.createFold(bucketName, "photo/");
        //ossUtil.uploadFile(bucketName, "daily/xue.jpg", "/Users/gagaprince/work/templet/blacktime/xue.jpg");
        //http://gagablog.oss-cn-beijing.aliyuncs.com/daily/daily03.jpg
    }
    /*public void testCreateFold(){
        OSSUtil ossUtil = OSSUtil.getInstance();
        ossUtil.createFold("novelpic","aaa/bbb/");
    }*/
    /*public void testListObject(){
        OSSUtil ossUtil = OSSUtil.getInstance();
        List<OSSObjectSummary> list = ossUtil.listBucketFiles("novelpic","aaa/");
        for(OSSObjectSummary object:list){
            System.out.println(object.getKey());
        }
    }*/
    /*public void testDeleteBucket(){
        OSSUtil ossUtil = OSSUtil.getInstance();
        ossUtil.deleteBucket("novelpic");
    }*/
    /*public void testDelectObject(){
        OSSUtil ossUtil = OSSUtil.getInstance();
        ossUtil.deleteObject("novelpic","aaa/bbb/firstpic.jpg");
    }*/

    /*public void testDelectObjectByPre(){
        OSSUtil ossUtil = OSSUtil.getInstance();
        ossUtil.deleteObjectsByPre("novelpic","aaa/");
    }*/
    /*public void testDeleteAllObjects(){
        OSSUtil ossUtil = OSSUtil.getInstance();
        ossUtil.deleteAllObjects("novelpic");
    }*/
    
    /*public void testLocationBucket(){
        OSSUtil ossUtil = OSSUtil.getInstance();
        String location = ossUtil.getRootUrl("gagaprince");
        System.out.println(location);
    }*/

}
