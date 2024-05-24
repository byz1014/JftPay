package com.example.a17297.jufutong;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.example.a17297.R;
import com.icbc.ndf.jft.PayActivity;
import com.icbc.ndf.jft.contants.PayResultVO;
import com.icbc.ndf.jft.utils.EChargeResultCallBack;
import com.icbc.ndf.jft.utils.OrderResultCallBack;
import com.icbc.ndf.jft.utils.ToastUtils;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;

public class MainActivity extends Activity {
    //旧版本接口报文
//    String orderStr = "{\"signData\":\"AYqYqj7ojSml8hXibVcAhy+2HdJxtar0+EQauAzzi5e5+mgkQhc51+/UcsX3hMdgW/sZOdHdVgX2snDq3bXIV6kBjsE+2R3YoNNc86wiPr/vx5zfGk4YIEyVsIgkxHg7PxAhLZaoVhHpaLwXMG3BX/8ii8bPgf3AXW3T34CaB0g=\",\"payAmount\":\"0.01\",\"payTypeSupport\":\"1111\",\"jftGetItemUrl\":\"https://paycf1.dccnet.com.cn:443\",\"tranData\":\"eyJvdXRWZW5kb3JJZCI6IjIwMTgwNDI5IiwicGF5QW1vdW50IjoiMC4wMSIsImFwcElkIjoiMTAwMDAwMDAwMDAwMDAwNDUwMDYiLCJvdXRPcmRlcklkIjoiMjU0NTcxMjA2NTMwMiIsIndlaXhpbkFwcElkIjoid3hhZTA1YWRkOTgyNThhNzI0In0=\",\"outOrderId\":\"2545712065302\",\"subMerName\":\"茅台联调子商户\",\"return_msg\":\"接口调用成功\",\"appBankUrl\":\"https://mywap2.dccnet.com.cn:449\",\"payPaltformUrl\":\"https://vip.dccnet.com.cn\",\"return_code\":\"10100000\",\"msg_id\":1533200912020}\n";
    //新版本接口报文
//    String orderStr = "{\n" +
//            "\t\"returnCode\": 10100000,\n" +
//            "\t\"returnMsg\": \"接口调用成功\",\n" +
//            "\t\"msgId\": \"1561864775461\",\n" +
//            "\t\"signData\": \"nIzFrYgylN7P1wnk9NvH76DOEY%2F8si0oj3egsWk3doC7gpy7eE0zaxq1Yh2bpHuKAXIwe6J2FzZNgCK5%2BHomfjD6gKeod35lREQarMnOw%2F61I8KVbm9dnu0vvRl1%2B5ljgJy7nZRW%2FAuyoQZwCYU0rXgWQccgrzClIdqxtDBdGAA%3D\",\n" +
//            "\t\"tranData\": \"eyJvdXRWZW5kb3JJZCI6IjAxMjI0NjEwIiwic3ViTWVyUmF0ZVpmYiI6bnVsbCwic3ViTWVyUmF0ZU93biI6bnVsbCwicGF5QW1vdW50IjoiMC4wMiIsInN1Yk1lclJhdGVWaXBDYXJkIjoiIiwic3ViTWVyUmF0ZVd4IjpudWxsLCJhcHBJZCI6IjEwMDAwMDAwMDAwMDAwMDc1MDEyIiwib3V0T3JkZXJJZCI6Inp5MjAxODA0MDkwOCIsIndlaXhpbkFwcElkIjoid3g2OTEzYjdlMzRkZDhkNDFhIiwic3ViTWVyUmF0ZU90aGVyIjpudWxsLCJvdXRVc2VySWQiOiIxMDAwMDAwMDAwMDAwMDAwMyJ9\",\n" +
//            "\t\"subMerName\": null,\n" +
//            "\t\"outOrderId\": null,\n" +
//            "\t\"payTypeSupport\": null,\n" +
//            "\t\"payAmount\": null,\n" +
//            "\t\"appBankUrl\": null,\n" +
//            "\t\"payPaltformUrl\": null,\n" +
//            "\t\"jftGetItemUrl\": null,\n" +
//            "\t\"displayData\": {\n" +
//            "\t\t\"payAmount\": \"0.02\",\n" +
//            "\t\t\"payTypeSupport\": [\n" +
//            "\t\t\t{\n" +
//            "\t\t\t\t\"payMethodDict\": \"01\",\n" +
//            "\t\t\t\t\"payMethodText\": \"银行卡支付\",\n" +
//            "\t\t\t\t\"callFlag\": null,\n" +
//            "\t\t\t\t\"requestUrl\": null,\n" +
//            "\t\t\t\t\"class\": \"com.icbc.ndf.jft.pay.entity.payTypeSupport.PayTypeSupport\"\n" +
//            "\t\t\t},\n" +
//            "\t\t\t{\n" +
//            "\t\t\t\t\"payMethodDict\": \"02\",\n" +
//            "\t\t\t\t\"payMethodText\": \"微信\",\n" +
//            "\t\t\t\t\"callFlag\": null,\n" +
//            "\t\t\t\t\"requestUrl\": null,\n" +
//            "\t\t\t\t\"class\": \"com.icbc.ndf.jft.pay.entity.payTypeSupport.PayTypeSupport\"\n" +
//            "\t\t\t},\n" +
//            "\t\t\t{\n" +
//            "\t\t\t\t\"payMethodDict\": \"03\",\n" +
//            "\t\t\t\t\"payMethodText\": \"支付宝\",\n" +
//            "\t\t\t\t\"callFlag\": null,\n" +
//            "\t\t\t\t\"requestUrl\": null,\n" +
//            "\t\t\t\t\"class\": \"com.icbc.ndf.jft.pay.entity.payTypeSupport.PayTypeSupport\"\n" +
//            "\t\t\t}\n" +
//            "\t\t],\n" +
//            "\t\t\"jftGetItemUrl\": \"https://mpaycf1.dccnet.com.cn:443\",\n" +
//            "\t\t\"couponList\": [],\n" +
//            "\t\t\"outOrderId\": \"zy2018040908\",\n" +
//            "\t\t\"subMerName\": \"重庆戈云2月版个体工商户\",\n" +
//            "\t\t\"appBankUrl\": \"https://mywap2.dccnet.com.cn:449\",\n" +
//            "\t\t\"isDiscount\": \"00\",\n" +
//            "\t\t\"couponDetail\": \"\",\n" +
//            "\t\t\"payPaltformUrl\": \"https://b2c4.dccnet.com.cn\"\n" +
//            "\t},\n" +
//            "\t\"version\": \"1.0.1\",\n" +
//            "\t\"success\": false\n" +
//            "}";

    String cdef = "{\"displayData\":{\"discountAmount\":\"90\",\"promotionInfo\":{\"02022052615313400887\":{\"payTypeSupports\":[\"03\",\"02\"]},\"02022052518132100882\":{\"payTypeSupports\":[]}},\"isDiscount\":\"00\",\"couponDetail\":\"\",\"apipUrl\":\"https://apipcs4.dccnet.com.cn\",\"realAmount\":\"110\",\"payAmount\":\"200\",\"subOrderDetails\":[{\"realAmount\":\"10\",\"amount\":\"100\",\"subMerName\":\"泰州市优品汇食品有限公司\",\"discountAmount\":\"90\",\"promotionId\":[{\"02022052615313400887\":\"90\"}]},{\"realAmount\":\"100\",\"amount\":\"100\",\"subMerName\":\"泰州市优品汇食品有限公司\",\"discountAmount\":\"0\",\"promotionId\":[{\"02022052518132100882\":\"20\"}]}],\"payTypeSupport\":[{\"realAmount\":\"110\",\"isDefaultSelect\":\"1\",\"payMethodDict\":\"03\",\"payMethodText\":\"支付宝支付\",\"discountAmount\":\"90\"},{\"realAmount\":\"110\",\"isDefaultSelect\":\"0\",\"payMethodDict\":\"02\",\"payMethodText\":\"微信支付\",\"discountAmount\":\"90\"}],\"jftGetItemUrl\":\"https://mpaycf1.dccnet.com.cn:443\",\"couponList\":[],\"outOrderId\":\"TGA03180005\",\"jftDiscountInfo\":\"聚富通优惠订单\",\"subMerName\":\"北京纵横韬略管理咨询有限公司\",\"appBankUrl\":\"https://mywap2.dccnet.com.cn:449\",\"payPaltformUrl\":\"https://b2c4.dccnet.com.cn\"},\"msg_id\":\"1653563678012\",\"payType\":\"02\",\"return_code\":10100000,\"return_msg\":\"接口调用成功\",\"signData\":\"AkFWZA+pTtW9sZhy4JmlhRfN3/9+cq6dm5Dr+zBNBvb+qqAWtLWtVLtJ5aLgbl+Dc9WYbkIQupbMZNqa7gUB3CnVUhhoZL+4NL7zGXKhlZkParq1L1K5t4UFJk9BfrOI3VsJBZ88k42zEEVCBa2oZpmWkGSQCodhd6fmLIQqQJ8=\",\"success\":false,\"tranData\":\"eyJzdWJNZXJSYXRlT3duIjpudWxsLCJwcmVPcmRlclNpZ25UeXBlIjoiU0hBMjU2d2l0aFJTQSIsInN1Yk1lclJhdGVXeCI6bnVsbCwid2VpeGluQXBwSWQiOm51bGwsIm91dFVzZXJJZCI6Ik0yMDE4MDExMTIzMjYiLCJvdXRWZW5kb3JJZCI6bnVsbCwic3ViTWVyUmF0ZVpmYiI6bnVsbCwicGF5QW1vdW50IjoiMjAwIiwicGF5VHlwZVN1cHBvcnQiOlt7InBheU1ldGhvZERpY3QiOiIwMyIsInBheU1ldGhvZFRleHQiOiLWp7i2sabWp7i2IiwiZGlzY291bnRBbW91bnQiOiI5MCIsInJlYWxBbW91bnQiOiIxMTAiLCJjYWxsRmxhZyI6bnVsbCwicmVxdWVzdFVybCI6bnVsbCwiaXNEZWZhdWx0U2VsZWN0IjoiMSJ9LHsicGF5TWV0aG9kRGljdCI6IjAyIiwicGF5TWV0aG9kVGV4dCI6Is6i0MXWp7i2IiwiZGlzY291bnRBbW91bnQiOiI5MCIsInJlYWxBbW91bnQiOiIxMTAiLCJjYWxsRmxhZyI6bnVsbCwicmVxdWVzdFVybCI6bnVsbCwiaXNEZWZhdWx0U2VsZWN0IjoiMCJ9XSwiYXBwSWQiOiIxMDAwMDAwMDAwMDAwMDI4NjUyNSIsIm91dE9yZGVySWQiOiJUR0EwMzE4MDAwNSIsInN1Yk1lclJhdGVPdGhlciI6bnVsbCwiY3VzdG9tZXJNb2JpbGUiOiIifQ==\",\"version\":\"1.0.0\"}";

    String  orderStr="{\n" +
            "        \"returnCode\": 10100000,\n" +
            "        \"returnMsg\": \"接口调用成功\",\n" +
            "        \"msgId\": \"1606724366770\",\n" +
            "        \"signData\": \"HWP1IszCqLIrcQCWBZqMGaj8HurCep0gNACFfCZzLX3oAnKEHvsX0bAom/GZqMEX8nqCxmSzB4IepLgjThNBc66UwI6nTC5edhVV9zhVFnPkU1BUwF9gosp6u5Nq3FtzyfdKe3BbrxP13FDHZ1sbulp9meir3FLCo1V4KsOeDyI=\",\n" +
            "        \"tranData\": \"eyJvdXRWZW5kb3JJZCI6IjA3MTYxNTAxMDEiLCJzdWJNZXJSYXRlWmZiIjoiMCIsInN1Yk1lclJhdGVPd24iOiIwIiwicGF5QW1vdW50IjoiMC4wMiIsInN1Yk1lclJhdGVXeCI6IjAiLCJhcHBJZCI6IjEwMDAwMDAwMDAwMDAwMjIyMDI3Iiwib3V0T3JkZXJJZCI6IjIwMTgwNDA5MDgiLCJ3ZWl4aW5BcHBJZCI6bnVsbCwic3ViTWVyUmF0ZU90aGVyIjoiMCIsIm91dFVzZXJJZCI6IjEwMDAwMDAwMDAwMDAwMDAzIn0=\",\n" +
            "        \"subMerName\": null,\n" +
            "        \"outOrderId\": null,\n" +
            "        \"payTypeSupport\": null,\n" +
            "        \"payAmount\": null,\n" +
            "        \"appBankUrl\": null,\n" +
            "        \"payPaltformUrl\": null,\n" +
            "        \"jftGetItemUrl\": null,\n" +
            "        \"displayData\": {\n" +
            "            \"payAmount\": \"0.02\",\n" +
            "            \"payTypeSupport\": [\n" +
            "                {\n" +
            "                    \"isDefaultSelect\": null,\n" +
            "                    \"payMethodDict\": \"01\",\n" +
            "                    \"payMethodText\": \"银行卡支付\",\n" +
            "                    \"callFlag\": null,\n" +
            "                    \"requestUrl\": null,\n" +
            "                    \"class\": \"com.icbc.ndf.jft.pay.entity.payTypeSupport.PayTypeSupport\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"isDefaultSelect\": null,\n" +
            "                    \"payMethodDict\": \"02\",\n" +
            "                    \"payMethodText\": \"微信\",\n" +
            "                    \"callFlag\": null,\n" +
            "                    \"requestUrl\": null,\n" +
            "                    \"class\": \"com.icbc.ndf.jft.pay.entity.payTypeSupport.PayTypeSupport\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"isDefaultSelect\": null,\n" +
            "                    \"payMethodDict\": \"03\",\n" +
            "                    \"payMethodText\": \"支付宝\",\n" +
            "                    \"callFlag\": null,\n" +
            "                    \"requestUrl\": null,\n" +
            "                    \"class\": \"com.icbc.ndf.jft.pay.entity.payTypeSupport.PayTypeSupport\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"jftGetItemUrl\": \"https://mpaycf1.dccnet.com.cn:443\",\n" +
            "            \"couponList\": [],\n" +
            "            \"outOrderId\": \"2018040908\",\n" +
            "            \"subMerName\": \"北京市千叶珠宝股份有限公司\",\n" +
            "            \"appBankUrl\": \"https://mywap2.dccnet.com.cn:449\",\n" +
            "            \"isDiscount\": \"00\",\n" +
            "            \"couponDetail\": \"\",\n" +
            "            \"payPaltformUrl\": \"https://b2c4.dccnet.com.cn\"\n" +
            "        },\n" +
            "        \"version\": \"1.0.1\",\n" +
            "        \"success\": false\n" +
            "    }";


    String orderStr2="{\"returnCode\": 10100000,\n" +
            "        \"returnMsg\": \"接口调用成功\",\n" +
            "        \"msgId\": \"1606728226593\",\n" +
            "        \"signData\": \"HWP1IszCqLIrcQCWBZqMGaj8HurCep0gNACFfCZzLX3oAnKEHvsX0bAom/GZqMEX8nqCxmSzB4IepLgjThNBc66UwI6nTC5edhVV9zhVFnPkU1BUwF9gosp6u5Nq3FtzyfdKe3BbrxP13FDHZ1sbulp9meir3FLCo1V4KsOeDyI=\",\n" +
            "        \"tranData\": \"eyJvdXRWZW5kb3JJZCI6IjA3MTYxNTAxMDEiLCJzdWJNZXJSYXRlWmZiIjoiMCIsInN1Yk1lclJhdGVPd24iOiIwIiwicGF5QW1vdW50IjoiMC4wMiIsInN1Yk1lclJhdGVXeCI6IjAiLCJhcHBJZCI6IjEwMDAwMDAwMDAwMDAwMjIyMDI3Iiwib3V0T3JkZXJJZCI6IjIwMTgwNDA5MDgiLCJ3ZWl4aW5BcHBJZCI6bnVsbCwic3ViTWVyUmF0ZU90aGVyIjoiMCIsIm91dFVzZXJJZCI6IjEwMDAwMDAwMDAwMDAwMDAzIn0=\",\n" +
            "        \"subMerName\": null,\n" +
            "        \"outOrderId\": null,\n" +
            "        \"payTypeSupport\": null,\n" +
            "        \"payAmount\": null,\n" +
            "        \"appBankUrl\": null,\n" +
            "        \"payPaltformUrl\": null,\n" +
            "        \"jftGetItemUrl\": null,\n" +
            "        \"displayData\": {\n" +
            "            \"payAmount\": \"0.02\",\n" +
            "            \"payTypeSupport\": [\n" +
            "                {\n" +
            "                    \"isDefaultSelect\": null,\n" +
            "                    \"payMethodDict\": \"02\",\n" +
            "                    \"payMethodText\": \"微信\",\n" +
            "                    \"callFlag\": null,\n" +
            "                    \"requestUrl\": null,\n" +
            "                    \"class\": \"com.icbc.ndf.jft.pay.entity.payTypeSupport.PayTypeSupport\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"isDefaultSelect\": null,\n" +
            "                    \"payMethodDict\": \"03\",\n" +
            "                    \"payMethodText\": \"支付宝\",\n" +
            "                    \"callFlag\": null,\n" +
            "                    \"requestUrl\": null,\n" +
            "                    \"class\": \"com.icbc.ndf.jft.pay.entity.payTypeSupport.PayTypeSupport\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"jftGetItemUrl\": \"https://mpaycf1.dccnet.com.cn:443\",\n" +
            "            \"couponList\": [],\n" +
            "            \"outOrderId\": \"2018040908\",\n" +
            "            \"subMerName\": \"北京市千叶珠宝股份有限公司\",\n" +
            "            \"appBankUrl\": \"https://mywap2.dccnet.com.cn:449\",\n" +
            "            \"isDiscount\": \"00\",\n" +
            "            \"couponDetail\": \"\",\n" +
            "            \"payPaltformUrl\": \"https://b2c4.dccnet.com.cn\"\n" +
            "        },\n" +
            "        \"version\": \"1.0.1\",\n" +
            "        \"success\": false}";


    String  orderStr3="{\n" +
            "        \"returnCode\": 10100000,\n" +
            "        \"returnMsg\": \"接口调用成功\",\n" +
            "        \"msgId\": \"1606731754605\",\n" +
            "        \"signData\": \"HWP1IszCqLIrcQCWBZqMGaj8HurCep0gNACFfCZzLX3oAnKEHvsX0bAom/GZqMEX8nqCxmSzB4IepLgjThNBc66UwI6nTC5edhVV9zhVFnPkU1BUwF9gosp6u5Nq3FtzyfdKe3BbrxP13FDHZ1sbulp9meir3FLCo1V4KsOeDyI=\",\n" +
            "        \"tranData\": \"eyJvdXRWZW5kb3JJZCI6IjA3MTYxNTAxMDEiLCJzdWJNZXJSYXRlWmZiIjoiMCIsInN1Yk1lclJhdGVPd24iOiIwIiwicGF5QW1vdW50IjoiMC4wMiIsInN1Yk1lclJhdGVXeCI6IjAiLCJhcHBJZCI6IjEwMDAwMDAwMDAwMDAwMjIyMDI3Iiwib3V0T3JkZXJJZCI6IjIwMTgwNDA5MDgiLCJ3ZWl4aW5BcHBJZCI6bnVsbCwic3ViTWVyUmF0ZU90aGVyIjoiMCIsIm91dFVzZXJJZCI6IjEwMDAwMDAwMDAwMDAwMDAzIn0=\",\n" +
            "        \"subMerName\": null,\n" +
            "        \"outOrderId\": null,\n" +
            "        \"payTypeSupport\": null,\n" +
            "        \"payAmount\": null,\n" +
            "        \"appBankUrl\": null,\n" +
            "        \"payPaltformUrl\": null,\n" +
            "        \"jftGetItemUrl\": null,\n" +
            "        \"displayData\": {\n" +
            "            \"payAmount\": \"0.02\",\n" +
            "            \"payTypeSupport\": [\n" +
            "                {\n" +
            "                    \"isDefaultSelect\": null,\n" +
            "                    \"payMethodDict\": \"02\",\n" +
            "                    \"payMethodText\": \"微信\",\n" +
            "                    \"callFlag\": null,\n" +
            "                    \"requestUrl\": null,\n" +
            "                    \"class\": \"com.icbc.ndf.jft.pay.entity.payTypeSupport.PayTypeSupport\"\n" +
            "                },\n" +
            "                {\n" +
            "                    \"isDefaultSelect\": null,\n" +
            "                    \"payMethodDict\": \"03\",\n" +
            "                    \"payMethodText\": \"支付宝\",\n" +
            "                    \"callFlag\": null,\n" +
            "                    \"requestUrl\": null,\n" +
            "                    \"class\": \"com.icbc.ndf.jft.pay.entity.payTypeSupport.PayTypeSupport\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"jftGetItemUrl\": \"https://mpaycf1.dccnet.com.cn:443\",\n" +
            "            \"couponList\": [],\n" +
            "            \"outOrderId\": \"2018040908\",\n" +
            "            \"subMerName\": \"北京市千叶珠宝股份有限公司\",\n" +
            "            \"appBankUrl\": \"https://mywap2.dccnet.com.cn:449\",\n" +
            "            \"isDiscount\": \"00\",\n" +
            "            \"couponDetail\": \"\",\n" +
            "            \"payPaltformUrl\": \"https://b2c4.dccnet.com.cn\"\n" +
            "        },\n" +
            "        \"version\": \"1.0.1\",\n" +
            "        \"success\": false\n" +
            "    }";

    String orderStr4="{\"displayData\":{\"payAmount\":\"0.02\",\"payTypeSupport\":[{\"isDefaultSelect\":\"0\",\"payMethodDict\":\"01\",\"payMethodText\":\"银行卡支付\",\"class\":\"com.icbc.ndf.jft.pay.entity.payTypeSupport.PayTypeSupport\"},{\"isDefaultSelect\":\"0\",\"payMethodDict\":\"02\",\"payMethodText\":\"微信\",\"class\":\"com.icbc.ndf.jft.pay.entity.payTypeSupport.PayTypeSupport\"},{\"isDefaultSelect\":\"0\",\"payMethodDict\":\"02\",\"payMethodText\":\"微信\",\"class\":\"com.icbc.ndf.jft.pay.entity.payTypeSupport.PayTypeSupport\"},{\"isDefaultSelect\":\"0\",\"payMethodDict\":\"13\",\"payMethodText\":\"微信3\",\"class\":\"com.icbc.ndf.jft.pay.entity.payTypeSupport.PayTypeSupport\"},{\"isDefaultSelect\":\"0\",\"payMethodDict\":\"18\",\"payMethodText\":\"微信2\",\"class\":\"com.icbc.ndf.jft.pay.entity.payTypeSupport.PayTypeSupport\"},{\"isDefaultSelect\":\"1\",\"payMethodDict\":\"03\",\"payMethodText\":\"微信1\",\"class\":\"com.icbc.ndf.jft.pay.entity.payTypeSupport.PayTypeSupport\"}],\"jftGetItemUrl\":\"https://mpaycf1.dccnet.com.cn:443\",\"couponList\":[],\"outOrderId\":\"1SDK2020091515584301\",\"subMerName\":\"镇江凯航船务有限公司\",\"appBankUrl\":\"https://mywap2.dccnet.com.cn:449\",\"isDiscount\":\"00\",\"couponDetail\":\"\",\"payPaltformUrl\":\"https://b2c4.dccnet.com.cn\"},\"msg_id\":\"1606723160951\",\"return_code\":10100000,\"return_msg\":\"接口调用成功\",\"signData\":\"XyXpDaa/8ZyNKLUjLhUDA+gH/ITiWqGEdUmJrtQiCWpnnhUzD2ldauK7KImiFwAXLJaO7erH/7W+FfT+yOGg566yPzOhnEe5cSX4Y9GMZG/SZQchtyzLMpHEPysIoEf9S0rzUI10hqym3Za3nQ24yEMOL6Ls8+ftwPjS9z96lQk=\",\"success\":false,\"tranData\":\"eyJvdXRWZW5kb3JJZCI6IjIwMjAwODEyMDEiLCJzdWJNZXJSYXRlWmZiIjoiMTAwIiwic3ViTWVyUmF0ZU93biI6IjEwMDAiLCJwYXlBbW91bnQiOiIwLjAyIiwic3ViTWVyUmF0ZVd4IjoiMzAwIiwiYXBwSWQiOiIxMDAwMDAwMDAwMDAwMDIyNjUxOCIsIm91dE9yZGVySWQiOiIxU0RLMjAyMDA5MTUxNTU4NDMwMSIsIndlaXhpbkFwcElkIjpudWxsLCJzdWJNZXJSYXRlT3RoZXIiOiIyMDAwIiwib3V0VXNlcklkIjoiTTIwMTgwMTExMjMyNiJ9\",\"version\":\"1.0.1\"}";

    EditText inputUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        orderStr4 = "{\"displayData\":{\"payAmount\":\"0.02\",\"payTypeSupport\":[{\"payMethodDict\":\"01\",\"payMethodText\":\"银行卡支付\",\"class\":\"com.icbc.ndf.jft.pay.entity.payTypeSupport.PayTypeSupport\"},{\"payMethodDict\":\"02\",\"payMethodText\":\"微信\",\"class\":\"com.icbc.ndf.jft.pay.entity.payTypeSupport.PayTypeSupport\"},{\"payMethodDict\":\"03\",\"payMethodText\":\"支付宝\",\"class\":\"com.icbc.ndf.jft.pay.entity.payTypeSupport.PayTypeSupport\"}],\"jftGetItemUrl\":\"https://mpaycf1.dccnet.com.cn:443\",\"couponList\":[],\"outOrderId\":\"zhangyong001\",\"subMerName\":\"北京市千叶珠宝股份有限公司\",\"appBankUrl\":\"https://mywap2.dccnet.com.cn:449\",\"isDiscount\":\"00\",\"couponDetail\":\"\",\"payPaltformUrl\":\"https://b2c4.dccnet.com.cn\"},\"msg_id\":\"1606872884813\",\"return_code\":10100000,\"return_msg\":\"接口调用成功\",\"signData\":\"jUFgvKmg+ztelCJdSIPvse9tzcFeE1+9SL6q73vmc5UKj/dKcwNOPHXueRw+/SOYuNK2aq+11NS0zcY19Fh7Lw7PbJZSc2Yz0XYbF5RKytm7UllS/E0c3yVxQJcdPejn9AmEUjh6c46R4xcrakDMptHSCAzlGkgbnSyCwYHpJ5Q=\",\"success\":false,\"tranData\":\"eyJvdXRWZW5kb3JJZCI6IjA3MTYxNTAxMDEiLCJzdWJNZXJSYXRlWmZiIjoiMCIsInN1Yk1lclJhdGVPd24iOiIwIiwicGF5QW1vdW50IjoiMC4wMiIsInN1Yk1lclJhdGVXeCI6IjAiLCJhcHBJZCI6IjEwMDAwMDAwMDAwMDAwMjIyMDI3Iiwib3V0T3JkZXJJZCI6InpoYW5neW9uZzAwMSIsIndlaXhpbkFwcElkIjpudWxsLCJzdWJNZXJSYXRlT3RoZXIiOiIwIiwib3V0VXNlcklkIjoiTTIwMTgwMTExMjMyNiJ9\",\"version\":\"1.0.1\"}";
        setContentView(R.layout.activity_main);
         inputUrl = (EditText) findViewById(R.id.inputUrl);
         cdef ="{\"displayData\":{\"discountAmount\":\"9.98\",\"promotionInfo\":{\"02022052509514800962\":{\"payTypeSupports\":[\"01\",\"03\"]}},\"isDiscount\":\"00\",\"couponDetail\":\"\",\"apipUrl\":\"https://apipcs.dccnet.com.cn\",\"realAmount\":\"0.02\",\"sandboxResult\":\"success\",\"payAmount\":\"10\",\"subOrderDetails\":[{\"realAmount\":\"0.01\",\"amount\":\"4\",\"subMerName\":\"彭泽县德佳大理石厂\",\"discountAmount\":\"3.99\",\"promotionId\":[{\"02022052509514800962\":\"3.99\"}]},{\"realAmount\":\"0.01\",\"amount\":\"6\",\"subMerName\":\"彭泽县德佳大理石厂\",\"discountAmount\":\"5.99\",\"promotionId\":[{\"02022052509514800962\":\"5.99\"}]}],\"sandboxMode\":\"1\",\"payTypeSupport\":[{\"realAmount\":\"0.02\",\"isDefaultSelect\":\"1\",\"payMethodDict\":\"01\",\"payMethodText\":\"银行卡支付\",\"discountAmount\":\"9.98\"},{\"isDefaultSelect\":\"0\",\"payMethodDict\":\"02\",\"payMethodText\":\"微信支付\"},{\"realAmount\":\"0.02\",\"isDefaultSelect\":\"0\",\"payMethodDict\":\"03\",\"payMethodText\":\"支付宝支付\",\"discountAmount\":\"9.98\"},{\"isDefaultSelect\":\"0\",\"payMethodDict\":\"17\",\"payMethodText\":\"云闪付支付\"}],\"jftGetItemUrl\":\"https://mpaycf.dccnet.com.cn\",\"couponList\":[],\"outOrderId\":\"yyt04081508\",\"jftDiscountInfo\":\"聚富通优惠订单\",\"subMerName\":\"北京纵横韬略管理咨询有限公司\",\"appBankUrl\":\"https://mywap2.dccnet.com.cn:443\",\"payPaltformUrl\":\"https://b2c1.dccnet.com.cn\"},\"msg_id\":\"1653462561352\",\"payType\":\"02\",\"return_code\":10100000,\"return_msg\":\"接口调用成功\",\"signData\":\"fr6gs2lfbmWp7fekjlfw6JCBPf0M1LPvNFl2x4ymQW28l0WNiARUjbA7rN78X1jjqsDJSicOw5oL5ZhUrApuNdrSlhHvKsf8GmpSVlUEpLbGJPf1H+5n2+GyW9T+DzmFSb7tT8jbFS2korC8wXIKSES+R0meczE0+xsrWHfh90Y=\",\"success\":false,\"tranData\":\"eyJzdWJNZXJSYXRlT3duIjpudWxsLCJwcmVPcmRlclNpZ25UeXBlIjoiU0hBMjU2d2l0aFJTQSIsInN1Yk1lclJhdGVXeCI6bnVsbCwid2VpeGluQXBwSWQiOm51bGwsIm91dFVzZXJJZCI6Ik0yMDE4MDExMTIzMjYiLCJvdXRWZW5kb3JJZCI6bnVsbCwic3ViTWVyUmF0ZVpmYiI6bnVsbCwicGF5QW1vdW50IjoiMTAiLCJwYXlUeXBlU3VwcG9ydCI6W3sicGF5TWV0aG9kRGljdCI6IjAxIiwicGF5TWV0aG9kVGV4dCI6ItL40NC/qNanuLYiLCJkaXNjb3VudEFtb3VudCI6IjkuOTgiLCJyZWFsQW1vdW50IjoiMC4wMiIsImNhbGxGbGFnIjpudWxsLCJyZXF1ZXN0VXJsIjpudWxsLCJpc0RlZmF1bHRTZWxlY3QiOiIxIn0seyJwYXlNZXRob2REaWN0IjoiMDIiLCJwYXlNZXRob2RUZXh0IjoizqLQxdanuLYiLCJkaXNjb3VudEFtb3VudCI6bnVsbCwicmVhbEFtb3VudCI6bnVsbCwiY2FsbEZsYWciOm51bGwsInJlcXVlc3RVcmwiOm51bGwsImlzRGVmYXVsdFNlbGVjdCI6IjAifSx7InBheU1ldGhvZERpY3QiOiIwMyIsInBheU1ldGhvZFRleHQiOiLWp7i2sabWp7i2IiwiZGlzY291bnRBbW91bnQiOiI5Ljk4IiwicmVhbEFtb3VudCI6IjAuMDIiLCJjYWxsRmxhZyI6bnVsbCwicmVxdWVzdFVybCI6bnVsbCwiaXNEZWZhdWx0U2VsZWN0IjoiMCJ9LHsicGF5TWV0aG9kRGljdCI6IjE3IiwicGF5TWV0aG9kVGV4dCI6ItTGycG4ttanuLYiLCJkaXNjb3VudEFtb3VudCI6bnVsbCwicmVhbEFtb3VudCI6bnVsbCwiY2FsbEZsYWciOm51bGwsInJlcXVlc3RVcmwiOm51bGwsImlzRGVmYXVsdFNlbGVjdCI6IjAifV0sImFwcElkIjoiMTAwMDAwMDAwMDAwMDAzMzUwMzgiLCJvdXRPcmRlcklkIjoieXl0MDQwODE1MDgiLCJzdWJNZXJSYXRlT3RoZXIiOm51bGwsImN1c3RvbWVyTW9iaWxlIjoiIn0=\",\"version\":\"1.0.0\"}";
        inputUrl.setText(cdef);
//        UnionPayReq unionPayReq = new UnionPayReq();
//        unionPayReq.setAppId("appid");
//        unionPayReq.setMsgId("12");
//        unionPayReq.setFormat("222");
//        unionPayReq.setCharset("utf-8");
//        unionPayReq.setEncryptType("1");
//        unionPayReq.setSignType("1");
//        unionPayReq.setSign("22");
//        unionPayReq.setTimestamp("22");
//            unionPayReq.setCa("22");
//        unionPayReq.setBizContent("22");
//
//        com.icbc.paysdk.ICBCAPI.getInstance().sendReq(MainActivity.this, unionPayReq);
        //有界面支付演示
//        PayActivity.openPayActivity(this, orderStr4, new OrderResultCallBack() {
//            @Override
//            public void onSuccess(PayResultVO payResultVO) {
//                ToastUtils.showToast(MainActivity.this,"支付成功");
//            }
//
//            @Override
//            public void onError(PayResultVO payResultVO) {
//
//            }
//        });
    }
    public void opentwo(View view){
        String params = inputUrl.getText().toString().trim();
//        params  = orderStr4;
        if(TextUtils.isEmpty(params)){
            ToastUtils.showToast(MainActivity.this,"请输入预订单接口返回的json报文");
            return;
        }
        PayActivity.openPayActivityMini(this, params,"page/component/index", WXLaunchMiniProgram.Req.MINIPROGRAM_TYPE_PREVIEW,"gh_0591c8620a26","wx55e382e947337660", new OrderResultCallBack() {
            @Override
            public void onSuccess(PayResultVO payResultVO) {
                //payResultVO.wxMiniprogramExtraData 为小程序返回时所带的参数，具体内容可自行定义
                ToastUtils.showToast(MainActivity.this,"微信小程序返回参数"+payResultVO.wxMiniprogramExtraData);
            }

            @Override
            public void onError(PayResultVO payResultVO) {
                ToastUtils.showToast(MainActivity.this,"onError"+payResultVO.tranCode);
            }
        });
    }
    public void open(View view){
        String trim = inputUrl.getText().toString().trim();
        if(TextUtils.isEmpty(trim)){
            ToastUtils.showToast(MainActivity.this,"请输入预订单接口返回的json报文");
            return;
        }
        PayActivity.openPayActivity(this, trim, new OrderResultCallBack() {
            @Override
            public void onSuccess(PayResultVO payResultVO) {
                ToastUtils.showToast(MainActivity.this,"支付成功");
            }

            @Override
            public void onError(PayResultVO payResultVO) {
                ToastUtils.showToast(MainActivity.this,"onError"+payResultVO.tranCode);
            }
        });
    };
    public void recharge(View view){
        String trim = inputUrl.getText().toString().trim();
        PayActivity.openEcharPayActivity(this, trim, new EChargeResultCallBack() {
            @Override
            public void onCallBack(String resultCode) {
                ToastUtils.showToast(MainActivity.this,"onSuccess"+resultCode);
            }
        });}
//    public void openthree(View view){
//        String trim = inputUrl.getText().toString().trim();
//
//        PayNoActivity.payForItem("01",this, trim, new OrderResultCallBack() {
//            @Override
 //           public void onSuccess(PayResultVO payResultVO) {
 //               ToastUtils.showToast(MainActivity.this,"支付成功");
 //           }
//
 //           @Override
  //          public void onError(PayResultVO payResultVO) {
 //               if(!"0017".equals(payResultVO.tranCode))
 //                   ToastUtils.showToast(MainActivity.this,"onError"+payResultVO.tranCode);
 //           }
  //      });
//
//        PayActivity.openSignActivity(this, "https://www.baidu.com", new OrderResultCallBack() {
//            @Override
//            public void onSuccess(PayResultVO str) {
//                if("0015".equals(str.tranCode)){
//                    ToastUtils.showToast(MainActivity.this,"贷款申请受理成功");
//                }
//            }
//
//            @Override
//            public void onError(PayResultVO str) {
//                if("0013".equals(str.tranCode)){
//                    ToastUtils.showToast(MainActivity.this,"贷款申请取消");
//                }else if("0014".equals(str.tranCode)){
//                    ToastUtils.showToast(MainActivity.this,"贷款申请受理失败");
//                }else if("0016".equals(str.tranCode)){
//                    ToastUtils.showToast(MainActivity.this,"贷款处理中");
//
//                }
//            }
//        });
//    }
}
