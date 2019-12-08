package com.meterbox.attendance.backstage.util;

import com.aliyun.oss.OSSClient;

import java.io.ByteArrayInputStream;
import java.io.File;


/**
 * 保存图片到阿里云对象存储OSS
 * @author CEM
 * @date 2019-12-08
 */
public class OSSUtil {
	/**
	 * endpoint以北京为例，其它region请按实际情况填写
	 */
	private static final String END_POINT = "http://oss-cn-beijing.aliyuncs.com";
	private static final String ACCESS_KEY_ID = "ygsk09ZJ7GpbBqHx";
	private static final String ACCESS_KEY_SECRET = "uvAVJRC0xgKglacZIpOV3uLXHO6xO6";
	private static final String BUCKET_NAME = "vibrate";

	private  static final  String IMAGE_PATH = "http://" + BUCKET_NAME + ".oss-cn-beijing.aliyuncs.com/";
	
	/**
	 * 上传文件，返回可以预览图片的地址
	 * 文件名不要重复，不然会覆盖。
	 * @param imageName String
	 * @param image byte[]
	 * @return String 图片url
	 */
	public static String uploadPicture(String imageName, File image) {
		// 创建OSSClient实例
		OSSClient ossClient = new OSSClient(END_POINT, ACCESS_KEY_ID, ACCESS_KEY_SECRET);
		// 上传
		ossClient.putObject(BUCKET_NAME, imageName, image);
        // Date expiration = new Date(System.currentTimeMillis() + 3600 * 1000 * 24 * 365 * 20);
        // 生成以GET方法访问的签名URL，访客可以直接通过浏览器访问相关内容。
        // URL url = ossClient.generatePresignedUrl(BUCKET_NAME, imageName, expiration);
		// 关闭client
		ossClient.shutdown();
		//return url.toString();
		return IMAGE_PATH + imageName;
		
	}
	
	public static String uploadPicture( String imageName, byte[] image) {
		// 创建OSSClient实例
		OSSClient ossClient = new OSSClient(END_POINT, ACCESS_KEY_ID, ACCESS_KEY_SECRET);
		// 上传
		ossClient.putObject(BUCKET_NAME, imageName, new ByteArrayInputStream(image));
		// 关闭client
		ossClient.shutdown();
		return IMAGE_PATH + imageName;
	}
	
	public static boolean isExistPicture(String imageName) {
		// 创建OSSClient实例。
		OSSClient ossClient = new OSSClient(END_POINT, ACCESS_KEY_ID, ACCESS_KEY_SECRET);
		// 判断文件是否存在。doesObjectExist,
		// 参数isOnlyInOSS:如果为true则忽略302重定向或镜像；如果为false，则考虑302重定向或镜像。
		boolean found = ossClient.doesObjectExist(BUCKET_NAME, imageName, true);
		// 关闭OSSClient。
		ossClient.shutdown();
		return found;
	}

}
