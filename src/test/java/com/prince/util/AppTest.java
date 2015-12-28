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

    public void testUploadFile(){
        OSSUtil ossUtil = OSSUtil.getInstance();
        String bucketName = "gagablog";
        ossUtil.uploadFile(bucketName,"feteji/menu.zip","D:\\work\\myselfwork\\texiao\\menu.zip");
        ossUtil.uploadFile(bucketName,"feteji/menu/index.html","D:\\work\\myselfwork\\texiao\\menu\\index.html");
        ossUtil.uploadFile(bucketName,"feteji/menu/css/comom.css","D:\\work\\myselfwork\\texiao\\menu\\css\\comom.css");
        ossUtil.uploadFile(bucketName,"feteji/menu/js/nav.js","D:\\work\\myselfwork\\texiao\\menu\\js\\nav.js");
        ossUtil.uploadFile(bucketName,"feteji/menu/img/xu0zS7g.jpg","D:\\work\\myselfwork\\texiao\\menu\\img\\xu0zS7g.jpg");
        ossUtil.uploadFile(bucketName,"feteji/menu/font/fontawesome-webfont.eot","D:\\work\\myselfwork\\texiao\\menu\\fonts\\fontawesome-webfont.eot");
        ossUtil.uploadFile(bucketName,"feteji/menu/font/fontawesome-webfont.woff","D:\\work\\myselfwork\\texiao\\menu\\fonts\\fontawesome-webfont.woff");
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
