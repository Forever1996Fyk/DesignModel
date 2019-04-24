package com.javaDesign.designModel.structural.facade;

/**
 * @program: designModel
 * @description: 礼物兑换
 * @author: YuKai Fan
 * @create: 2018-12-17 10:17
 **/
public class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();
    private PoingtsPaymentService poingtsPaymentService = new PoingtsPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointsGift pointsGift) {
        if (qualifyService.isAvailable(pointsGift)) {
            //资格校验通过
            if (poingtsPaymentService.pay(pointsGift)) {
                //如果支付积分成功
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功，订单号：" + shippingOrderNo);
            }
        }
    }

    public QualifyService getQualifyService() {
        return qualifyService;
    }

    public void setQualifyService(QualifyService qualifyService) {
        this.qualifyService = qualifyService;
    }

    public PoingtsPaymentService getPoingtsPaymentService() {
        return poingtsPaymentService;
    }

    public void setPoingtsPaymentService(PoingtsPaymentService poingtsPaymentService) {
        this.poingtsPaymentService = poingtsPaymentService;
    }

    public ShippingService getShippingService() {
        return shippingService;
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }
}