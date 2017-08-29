package com.example.xutils3page;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

public class MainActivity extends AppCompatActivity {

    private String url="http://v.juhe.cn/toutiao/index?type=&key=22a108244dbb8d1f49967cd74a0c144d";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

 /*   *//**
     * GET请求
     *//*
        RequestParams params=new RequestParams(url);
        x.http().get(params,new Callback.CommonCallback<String>(){

            @Override
            public void onSuccess(String result) {
                //解析数据
                System.out.println("请求结果是；6++++++++++"+result);
            }

            *//**
             * 请求异常后回调方法
             * @param ex
             * @param isOnCallback
             *//*
            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            *//**
             * 主动调用取消请求的回调方法
             * @param cex
             *//*
            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
*/


        /**
         * POST请求
         */
        RequestParams params=new RequestParams(url);
       // params.addHeader("head","android");
        x.http().post(params,new Callback.CommonCallback<String>(){

            @Override
            public void onSuccess(String result) {
                System.out.println("result的值是：++++++++++"+result);
             }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }


}
