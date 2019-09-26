package com.company;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.*;

import com.alibaba.fastjson.JSON;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

public class Main {

    public static void main(String[] args) throws Exception {

        String appid = "100001";
        String method = "fontNews";

        Map<Object, Object> dataMap = new HashMap<>();
        dataMap.put("pageIndex", "1");
        dataMap.put("pageSize", "10");
        String data = JSON.toJSONString(dataMap);
        String str = "appid=100001&data={\"pageIndex\":\"1\",\"pageSize\":\"10\"}&method=fontNews";
//        String str = "appid=" + appid + "&data=" + data + "&method=" + method;//拼接参数

        System.out.println(data);
        String appsecert = "a4bec35523ee4bd7a4dc6b0afb29ad58";

        String sign = DigestUtils.md5Hex(str +"&"+ appsecert).toLowerCase();

        System.out.println(sign);


        //        Scanner sc = new Scanner(System.in);
//        System.out.println("输入参数：");
//        String str = sc.nextLine();
//
//        System.out.println(getSign(str));

//        String sKey = "2dadc3457b2c9159321c705fded72bc6";
//        System.out.println(DigestUtils.md5Hex(str + "&" + sKey).toLowerCase());
//                + "&sign=Lt1TWnuk6TCla00jWfPwFfgectd7btP5i0+1YcS5cIWZt1H2Ct5ZRZ0g7+2AWS4jUG0aiGXLeSr9193hBkZ8ZKvP3lrkCHkfFl3zTWBZNVs=";
//        System.out.println(str.substring(0,str.lastIndexOf("&")));
//        System.out.println(str.split());
//        System.out.println(str.split("&")[str.split("&").length-1]);
//        System.out.println(getSign(str));
//        System.out.println(Encrypt(str));
//        Map<Object, Object> result = new HashMap<>();
//        result.put("result", 0);
//        result.put("message", "查询成功");
//        JSONObject jsonObject=JSONObject.fromObject(map);
//        System.out.println(result.toString());
        String s1 = "12333";
        String s = "{\n" +
                "  \"result\": 0,\n" +
                "  \"newsList\": [\n" +
                "    {\n" +
                "      \"id\": \"156401688151510663ee10e16c002331\",\n" +
                "      \"title\": \"测试\",\n" +
                "      \"body\": null,\n" +
                "      \"priority\": \"1\",\n" +
                "      \"createBy\": null,\n" +
                "      \"createTime\": 1564016882000,\n" +
                "      \"updateBy\": null,\n" +
                "      \"updateTime\": null,\n" +
                "      \"outLink\": null,\n" +
                "      \"fountImgUrl\": \"/disk/RiverChiefSystem/News/img/201907/a748283486a046dd9e663b6e8695753f.jpg\",\n" +
                "      \"summary\": \"测试-摘要\",\n" +
                "      \"wechatFlag\": null,\n" +
                "      \"flag\": null,\n" +
                "      \"userId\": null,\n" +
                "      \"fileList\": null,\n" +
                "      \"realName\": \"东海街道河长办\",\n" +
                "      \"gridName\": \"东海街道\",\n" +
                "      \"fileInfo\": null\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"156213605416310263ee10e16c002331\",\n" +
                "      \"title\": \"丰泽全面推行河长制工作\",\n" +
                "      \"body\": null,\n" +
                "      \"priority\": \"1\",\n" +
                "      \"createBy\": null,\n" +
                "      \"createTime\": 1562136054000,\n" +
                "      \"updateBy\": null,\n" +
                "      \"updateTime\": null,\n" +
                "      \"outLink\": \"http://www.quanzhou.gov.cn/zfb/xxgk/zfxxgkzl/qzdt/xsqdt/201703/t20170314_426382.htm\",\n" +
                "      \"fountImgUrl\": \"/disk/RiverChiefSystem/News/img/201907/72dfa0695381446587146fe04d3afc4a.jpg\",\n" +
                "      \"summary\": \"丰泽全面推行河长制工作\",\n" +
                "      \"wechatFlag\": null,\n" +
                "      \"flag\": null,\n" +
                "      \"userId\": null,\n" +
                "      \"fileList\": null,\n" +
                "      \"realName\": \"丰泽区河长办\",\n" +
                "      \"gridName\": \"丰泽区\",\n" +
                "      \"fileInfo\": null\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"156076337293810863ee10e16c002331\",\n" +
                "      \"title\": \"丰泽深化实施“河长制” 推进生态文明建设\",\n" +
                "      \"body\": null,\n" +
                "      \"priority\": \"1\",\n" +
                "      \"createBy\": null,\n" +
                "      \"createTime\": 1560763373000,\n" +
                "      \"updateBy\": null,\n" +
                "      \"updateTime\": null,\n" +
                "      \"outLink\": null,\n" +
                "      \"fountImgUrl\": \"/disk/RiverChiefSystem/News/img/201906/1c2077c6d2e940a9a781eab451c54d23.jpg\",\n" +
                "      \"summary\": \"”河长制”是管好河流、治好河流的一项重要举措。近日，丰泽区制定并印发了《泉州市丰泽区全面推行河长制2018年度计划》（以下简称《计划》），对新一年在全区深化实施“河长制”，进一步加强晋江西溪（丰泽段）保护管理，改善流域水环境质量，推进生态文明建设进行了部署安排。\",\n" +
                "      \"wechatFlag\": null,\n" +
                "      \"flag\": null,\n" +
                "      \"userId\": null,\n" +
                "      \"fileList\": null,\n" +
                "      \"realName\": \"丰泽区河长办\",\n" +
                "      \"gridName\": \"丰泽区\",\n" +
                "      \"fileInfo\": null\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"156076062161010663ee10e16c002331\",\n" +
                "      \"title\": \"落实河长制工作 丰泽区提出“1235”举措\",\n" +
                "      \"body\": null,\n" +
                "      \"priority\": \"1\",\n" +
                "      \"createBy\": null,\n" +
                "      \"createTime\": 1560760622000,\n" +
                "      \"updateBy\": null,\n" +
                "      \"updateTime\": null,\n" +
                "      \"outLink\": \"http://www.mnw.cn/quanzhou/fengze/1993746.html\",\n" +
                "      \"fountImgUrl\": \"/disk/RiverChiefSystem/News/img/201906/5f30e0a4c1a24b4eb93d74a1dd552e1a.jpg\",\n" +
                "      \"summary\": \"http://www.mnw.cn/quanzhou/fengze/1993746.html\",\n" +
                "      \"wechatFlag\": null,\n" +
                "      \"flag\": null,\n" +
                "      \"userId\": null,\n" +
                "      \"fileList\": null,\n" +
                "      \"realName\": \"丰泽区河长办\",\n" +
                "      \"gridName\": \"丰泽区\",\n" +
                "      \"fileInfo\": null\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"156076032502310463ee10e16c002331\",\n" +
                "      \"title\": \"落实河长制工作 丰泽区提出“1235”举措\",\n" +
                "      \"body\": null,\n" +
                "      \"priority\": \"1\",\n" +
                "      \"createBy\": null,\n" +
                "      \"createTime\": 1560760325000,\n" +
                "      \"updateBy\": null,\n" +
                "      \"updateTime\": null,\n" +
                "      \"outLink\": \"http://www.mnw.cn/quanzhou/fengze/1993746.html\",\n" +
                "      \"fountImgUrl\": \"/disk/RiverChiefSystem/News/img/201906/ec3c2237456549328b7434ed6f164916.jpg\",\n" +
                "      \"summary\": \"8日，在收听收看全省、全市河长制工作视频会后，丰泽区随即召开全区河长制工作会，总结2017年河长制工作，贯彻部署今年相关工作。区委书记黄景春到会并作讲话，区委常委、统战部部长廖春园主持会议，副区长邱朝阳具体部署全区河长制工作。\",\n" +
                "      \"wechatFlag\": null,\n" +
                "      \"flag\": null,\n" +
                "      \"userId\": null,\n" +
                "      \"fileList\": null,\n" +
                "      \"realName\": \"丰泽区河长办\",\n" +
                "      \"gridName\": \"丰泽区\",\n" +
                "      \"fileInfo\": null\n" +
                "    }\n" +
                "  ],\n" +
                "  \"message\": \"查询成功\"\n" +
                "}";

//        /*
//         * 此处使用AES-128-ECB加密模式，key需要为16位。
//         */
//        String cKey = "1234567890123456";
//        // 需要加密的字串
//        String cSrc = "www.gowhere.so";
//        System.out.println(s);
//        // 加密
//        String enString = Encrypt(s, cKey);
//        System.out.println("加密后的字串是：" + enString);
//
//        // 解密
//        String DeString = Decrypt(enString, cKey);
//        System.out.println("解密后的字串是：" + DeString);
    }





//    static String appsecret = "df23hlir85353gfgd86775jjdh6322";
    private static String getSign(String str) {
        String[] strings = str.split("&");
        String json = null;
        List<String> list = new ArrayList<>(Arrays.asList(strings));
        list.sort(Comparator.comparing(a -> a.substring(0, 1)));
        for (String s : list) {
            if (json == null) {
                json = s + "&";
            } else {
                json = json + s + "&";
            }
        }
        return json;
//        return getSHA256StrJava(json + "appsecret=" + appsecret);
    }
//
//    private static String getSHA256StrJava(String str) {
//        MessageDigest messageDigest;
//        String encodeStr = "";
//        try {
//            messageDigest = MessageDigest.getInstance("SHA-256");
//            messageDigest.update(str.getBytes("UTF-8"));
//            encodeStr = byte2Hex(messageDigest.digest());
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        return encodeStr;
//    }
//
//    private static String byte2Hex(byte[] bytes) {
//        StringBuffer stringBuffer = new StringBuffer();
//        String temp = null;
//        for (int i = 0; i < bytes.length; i++) {
//            temp = Integer.toHexString(bytes[i] & 0xFF);
//            if (temp.length() == 1) {
//                //1得到一位的进行补0操作
//                stringBuffer.append("0");
//            }
//            stringBuffer.append(temp);
//        }
//        return stringBuffer.toString();
//    }

    // 加密
    public static String Encrypt(String sSrc) throws Exception {
        String sKey = "2dadc3457b2c9159321c705fded72bc6";
//        String sKey = sSrc.split("&")[sSrc.split("&").length-1];
        if (sKey == null) {
            System.out.print("Key为空null");
            return null;
        }
        // 判断Key是否为16位
        if (sKey.length() != 32) {
            System.out.print("Key长度不是32位");
            return null;
        }
        byte[] raw = sKey.getBytes("utf-8");
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");//"算法/模式/补码方式"
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(sSrc.getBytes("utf-8"));

        return new Base64().encodeToString(encrypted);//此处使用BASE64做转码功能，同时能起到2次加密的作用。
    }

    // 解密
    public static String Decrypt(String sSrc, String sKey) throws Exception {
        try {
            // 判断Key是否正确
            if (sKey == null) {
                System.out.print("Key为空null");
                return null;
            }
            // 判断Key是否为16位
            if (sKey.length() != 16) {
                System.out.print("Key长度不是16位");
                return null;
            }
            byte[] raw = sKey.getBytes("utf-8");
            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec);
            byte[] encrypted1 = new Base64().decode(sSrc);//先用base64解密
            try {
                byte[] original = cipher.doFinal(encrypted1);
                String originalString = new String(original,"utf-8");
                return originalString;
            } catch (Exception e) {
                System.out.println(e.toString());
                return null;
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
}
