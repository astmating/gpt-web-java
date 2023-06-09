package com.chat.java.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chat.java.model.Order;
import com.chat.java.model.ali.req.AliPayCreateReq;
import com.chat.java.model.req.CreateOrderReq;
import com.chat.java.model.req.OrderCallBackReq;
import com.chat.java.model.req.QueryOrderReq;
import com.chat.java.model.req.ReturnUrlReq;
import com.chat.java.model.res.CreateOrderRes;
import com.chat.java.base.B;
import com.chat.java.model.wx.req.WxPayCreateReq;
import com.chat.java.model.wx.res.NativeCallBackRes;
import com.chat.java.model.wx.res.WxPayCreateRes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户表(User)表服务接口
 *
 * @author  
 * @since 2022-03-12 15:23:17
 */
public interface IOrderService extends IService<Order> {


    B<CreateOrderRes> createOrder(CreateOrderReq req);

    B returnUrl(ReturnUrlReq req);

    String callback(OrderCallBackReq req);

    B query(QueryOrderReq req);

    B<String> aliCreateOrder(AliPayCreateReq req) throws Exception;

    String  aliCallBack(HttpServletRequest request) throws Exception;

    B<WxPayCreateRes> wxCreateOrder(WxPayCreateReq req) throws Exception;

    NativeCallBackRes wxCallBack(HttpServletRequest request, HttpServletResponse response) throws Exception;





}
