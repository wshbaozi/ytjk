package com.ytjk.config;

import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.bean.menu.WxMenu;
import me.chanjar.weixin.common.bean.menu.WxMenuButton;
import me.chanjar.weixin.common.bean.result.WxMediaUploadResult;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;

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
        button1.setName("联系我们");
        button1.setUrl(wxMpService.oauth2buildAuthorizationUrl("", "snsapi_base", ""));

        WxMenuButton button2 = new WxMenuButton();
        button2.setName("健康咨询");

        WxMenuButton button21 = new WxMenuButton();
        button21.setType(WxConsts.BUTTON_VIEW);
        button21.setName("专家团队");
        button21.setUrl(wxMpService.oauth2buildAuthorizationUrl("", "snsapi_base", ""));

        WxMenuButton button22 = new WxMenuButton();
        button22.setType(WxConsts.BUTTON_VIEW);
        button22.setName("护理部");
        button22.setUrl(wxMpService.oauth2buildAuthorizationUrl("", "snsapi_base", ""));

        WxMenuButton button23 = new WxMenuButton();
        button23.setType(WxConsts.BUTTON_VIEW);
        button23.setName("护工队");
        button23.setUrl(wxMpService.oauth2buildAuthorizationUrl("", "snsapi_base", ""));


//        WxMenuButton button24 = new WxMenuButton();
//        button24.setType(WxConsts.BUTTON_VIEW);
//        button24.setName("科普");
//        button24.setUrl(wxMpService.oauth2buildAuthorizationUrl("", "snsapi_base", ""));
//
//        WxMenuButton button25 = new WxMenuButton();
//        button25.setType(WxConsts.BUTTON_VIEW);
//        button25.setName("病例");
//        button25.setUrl(wxMpService.oauth2buildAuthorizationUrl("", "snsapi_base", ""));
//
//
//        WxMenuButton button26 = new WxMenuButton();
//        button26.setType(WxConsts.BUTTON_VIEW);
//        button26.setName("居家健康生活");
//        button26.setUrl(wxMpService.oauth2buildAuthorizationUrl("", "snsapi_base", ""));

//        WxMenuButton button27 = new WxMenuButton();
//        button27.setType(WxConsts.BUTTON_VIEW);
//        button27.setName("官方活动");
//        button27.setUrl(wxMpService.oauth2buildAuthorizationUrl("", "snsapi_base", ""));

        List<WxMenuButton> list = new ArrayList<>();
        list.add(button21);
        list.add(button22);
        list.add(button23);
        button2.setSubButtons(list);

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
//        try {
//            wxMpService.getMenuService().menuCreate(getMenu());
//        } catch (WxErrorException e) {
//            e.printStackTrace();
//        }

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
