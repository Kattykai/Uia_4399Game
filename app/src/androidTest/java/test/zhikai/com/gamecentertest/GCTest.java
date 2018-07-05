package test.zhikai.com.gamecentertest;

import android.app.Instrumentation;
import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class GCTest {
    public Instrumentation minstrumentation;
    public UiDevice mUiDevice;
    @Before
    public void setUp() throws InterruptedException {
        minstrumentation = InstrumentationRegistry.getInstrumentation();
        mUiDevice = UiDevice.getInstance(minstrumentation);
//        mUiDevice.executeShellCommand("am start -n ")

        Thread.sleep(1000);
        Thread.sleep(1000);
    }
    @Test
    public void ZoneText() throws RemoteException, InterruptedException {

        mUiDevice.findObject(By.res("com.m4399.gamecenter:id/iv_menu_item_publish")).click();
        Thread.sleep(2000);
        mUiDevice.findObject(By.res("com.m4399.gamecenter:id/zone_edit")).setText("AHHAAHAH");
        Thread.sleep(2000);
        mUiDevice.findObject(By.res("com.m4399.gamecenter:id/add_emoji")).click();
        Thread.sleep(2000);
        mUiDevice.findObject(By.res("com.m4399.gamecenter:id/emoji_cell")).click();
        mUiDevice.findObject(By.res("com.m4399.gamecenter:id/emoji_cell")).click();
        mUiDevice.findObject(By.res("com.m4399.gamecenter:id/emoji_cell")).click();
        mUiDevice.findObject(By.res("com.m4399.gamecenter:id/emoji_cell")).click();
        mUiDevice.findObject(By.res("com.m4399.gamecenter:id/m4399_topic_publish")).click();
        Thread.sleep(2000);
        mUiDevice.findObject(By.res("com.m4399.gamecenter:id/uiv_circle_view")).click();
        Thread.sleep(2000);
        mUiDevice.findObject(By.res("com.m4399.gamecenter:id/user_info_list_header_zone_num")).click();
        UiObject2 FindText = mUiDevice.findObject(By.text("今天的天气真好啊[:412][:412][:412]"));
        Assert.assertTrue(FindText.getText().equals("今天的天气真好[:412][:412][:412][:412]"));

    }
//    @Test
//    public void ZoneImage(){
//        mUiDevice.findObject(By.res("com.m4399.gamecenter:id/iv_menu_item_publish")).click();
//        mUiDevice.findObject(By.res("com.m4399.gamecenter:id/zone_edit")).setText("自动化之图片测试");
//
//    }
    @After
    public void tearDown(){

    }
}
