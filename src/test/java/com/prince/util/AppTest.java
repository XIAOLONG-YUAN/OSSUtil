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
        ossUtil.createBucket("novelpic");
    }*/

   /* public void testUploadFile(){
        OSSUtil ossUtil = OSSUtil.getInstance();
        ossUtil.uploadFile("novelpic","aaa/firstpic.jpg","D:\\temp\\gagalulu\\364644651643068498.jpg");
        ossUtil.uploadFile("novelpic","bbb/firstpic.jpg","D:\\temp\\gagalulu\\364644651643068498.jpg");
        ossUtil.uploadFile("novelpic","aaa/bbb/firstpic.jpg","D:\\temp\\gagalulu\\364644651643068498.jpg");
        ossUtil.uploadFile("novelpic","firstpic.jpg","D:\\temp\\gagalulu\\364644651643068498.jpg");
    }*/
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

    public void testLocationBucket(){
        OSSUtil ossUtil = OSSUtil.getInstance();
        String location = ossUtil.getRootUrl("gagaprince");
        System.out.println(location);
    }

}
