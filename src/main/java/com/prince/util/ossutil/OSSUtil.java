package com.prince.util.ossutil;


import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.*;

import java.io.*;
import java.util.List;

/**
 * Created by zidong.wang on 2015/12/18.
 */
public class OSSUtil {
    private String endpoint;
    private String accessKeyId;
    private String accessKeySecret;
    private OSSClient client;


    private OSSUtil(){
        setEndpoint("http://oss-cn-hangzhou.aliyuncs.com");
        setAccessKeyId("t3Sz8gjYBo4iE1pe");
        setAccessKeySecret("8NEikAXNSXPJtdsyabMA6LxtDyZgSW");
        setClient(new OSSClient(endpoint,accessKeyId,accessKeySecret));
    }
    public static OSSUtil ossUtil;
    public static OSSUtil getInstance(){
        if(ossUtil==null){
            ossUtil = new OSSUtil();
        }
        return ossUtil;
    }

    //创建一个bucket实例
    public void createBucket(String bucketName){
        if (isExistBucket(bucketName))return;
        client.createBucket(bucketName);
        client.setBucketAcl(bucketName, CannedAccessControlList.PublicRead);
    }
    //是否存在这个仓库
    public boolean isExistBucket(String bucketName){
        return client.doesBucketExist(bucketName);
    }

    //删除bucket仓库
    public void deleteBucket(String bucketName){
        if (isExistBucket(bucketName)){
            deleteAllObjects(bucketName);
            client.deleteBucket(bucketName);
        }

    }

    //删除仓库中所有图片
    public void deleteAllObjects(String bucketName){
        deleteObjectsByPre(bucketName,"");
    }

    //删除仓库中以pre开头的图片文件
    public void deleteObjectsByPre(String bucketName,String pre){
        List<OSSObjectSummary> list = listBucketFiles(bucketName,pre);
        for(OSSObjectSummary ossObjectSummary:list){
            client.deleteObject(bucketName,ossObjectSummary.getKey());
        }
    }
    //删除单个文件
    public void deleteObject(String bucketName,String key){
        if(isExistObject(bucketName, key))
            client.deleteObject(bucketName,key);
    }
    //是否存在文件
    public boolean isExistObject(String bucketName,String key){
        return client.doesObjectExist(bucketName,key);
    }
    //上传一个文件
    public void uploadFile(String bucketName,String key,String filePath){
        File f = new File(filePath);
        InputStream in = null;
        try {
            in = new FileInputStream(f);
            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentLength(f.length());
            PutObjectResult result = client.putObject(bucketName,key,in,metadata);
            System.out.println(result.getETag());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //path的格式要求以/结尾
    //创建一个文件夹
    public void createFold(String bucketName,String path){
        ObjectMetadata objectMetadata = new ObjectMetadata();
        byte[] buffer = new byte[0];
        ByteArrayInputStream bin = new ByteArrayInputStream(buffer);
        objectMetadata.setContentLength(0);
        client.putObject(bucketName, path, bin, objectMetadata);
        try {
            bin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //列出仓库中所有文件
    public List<OSSObjectSummary> listBucketFiles(String buckName){
        return listBucketFiles(buckName,"");
    }
    //列出仓库中所有以pre开头的文件
    public List<OSSObjectSummary> listBucketFiles(String buckName,String pre){
        ListObjectsRequest listObjectsRequest = new ListObjectsRequest(buckName);
        listObjectsRequest.setPrefix(pre);
        ObjectListing listing = client.listObjects(listObjectsRequest);
        return listing.getObjectSummaries();
    }


    public String getEndpoint() {
        return endpoint;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public OSSClient getClient() {
        return client;
    }

    public void setClient(OSSClient client) {
        this.client = client;
    }
}
