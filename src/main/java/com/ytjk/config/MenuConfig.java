package com.ytjk.config;

import com.alibaba.fastjson.JSON;
import com.ytjk.util.Constants;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.bean.menu.WxMenu;
import me.chanjar.weixin.common.bean.menu.WxMenuButton;
import me.chanjar.weixin.common.bean.result.WxMediaUploadResult;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.menu.WxMpGetSelfMenuInfoResult;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by FirenzesEagle on 2016/6/1 0001.
 * Email:liumingbo2008@gmail.com
 */
public class MenuConfig {

    /**
     * 定义菜单结构
     *
     * @return
     */
    public static WxMenu getMenu() {

        MainConfig mainConfig = new MainConfig();
        WxMpService wxMpService = mainConfig.wxMpService();

        WxMenu menu = new WxMenu();
        WxMenuButton button1 = new WxMenuButton();
        button1.setType(WxConsts.BUTTON_VIEW);
        button1.setName("专家团队");
//        button1.setKey("team");
        button1.setUrl(Constants.SERVER_URL+"/statics/index.html#!/departments");
//        button1.setUrl("http://www.baidu.com");

        WxMenuButton button2 = new WxMenuButton();
        button2.setType(WxConsts.BUTTON_VIEW);
        button2.setName("健康科普");
        button2.setUrl(Constants.SERVER_URL+"/statics/index.html#!/listKnowledges");

//        WxMenuButton button21 = new WxMenuButton();
//        button21.setType(WxConsts.BUTTON_VIEW);
//        button21.setName("专家团队");
//        button21.setUrl(wxMpService.oauth2buildAuthorizationUrl("", "snsapi_base", ""));


//        List<WxMenuButton> list = new ArrayList<>();
//        list.add(button21);
//        button2.setSubButtons(list);

        WxMenuButton button3 = new WxMenuButton();
        button3.setType(WxConsts.BUTTON_CLICK);
        button3.setName("关于瑜彤");
        button3.setKey("help");

        menu.getButtons().add(button1);
        menu.getButtons().add(button2);
        menu.getButtons().add(button3);

        return menu;
    }

    /**
     * 运行此main函数即可生成公众号自定义菜单
     *
     * @param args
     */
    public static void main(String[] args) {
        MainConfig mainConfig = new MainConfig();
        WxMpService wxMpService = mainConfig.wxMpService();
        try {
          //  wxMpService.getMenuService().menuCreate(getMenu());
           WxMenu result =  wxMpService.getMenuService().menuGet();
            System.out.println(JSON.toJSONString(result));
        } catch (WxErrorException e) {
            e.printStackTrace();
        }


//        File file = new File("C:\\Users\\Administrator\\Desktop\\classes\\e45fc07.jpg");
//        if(!file.exists()){
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        try {
//            WxMediaUploadResult res = wxMpService.getMaterialService().mediaUpload(WxConsts.MEDIA_IMAGE, WxConsts.FILE_JPG, new FileInputStream(file));
//            System.out.println(res.getMediaId());
//        } catch (WxErrorException e) {
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


    }



}
