# zxing_demo
集成了扫描和从相册识别
Useage:
*程序入口：CaptureActivity*
*扫描到二维码后会调用方法handleDecode，rawResult即为获取的url信息*
*从相册选择二维码：调用selectImg方法也就是按钮的点击事件，选择好二维码图片后会将结果返回，在onActivityResult方法中处理结果。
