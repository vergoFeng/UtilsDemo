![](http://i.imgur.com/IzybjYi.png)
## About
Android开发过程中经常使用到各式各样的工具类，这里整理了平常用到的工具类，方便开发使用。

## Gradle
Step 1. 在build.gradle(Project:XXX)文件中增加JitPack仓库依赖。

    allprojects {
        repositories {
            jcenter()
            maven { url "https://jitpack.io" }
        }
    }
Step 2. 在build.gradle(Module:XXX)文件中增加LUtilsLibrary依赖。

    compile 'com.github.vergoFeng:UtilsLibrary:1.3.0'

## How to use
在使用utils下的相关工具，需要进行初始化，在Application中进行初始化：

`UtilsInit.init(this);`

此类中提供了全局的Context，获取方法：

`UtilsInit.getApp();`

## API

* #### App相关： AppUtils

```
getAppPackageName : 获取App包名
isInstallApp      : 判断App是否安装
launchApp         : 打开App
```

* #### 状态栏相关： BarUtils

```
setStatusBarColor       : 设置状态栏颜色
hideStatusBar           : 隐藏状态栏
getStatusBarHeight      : 获取状态栏高度
setTranslucentStatus    : 设置状态栏透明(api大于19方可使用)
setStatusBarMode        : 设置状态栏黑色字体图标(6.0以上版本)
setStatusBarModeByFlyme : 设置状态栏图标为深色和魅族特定的文字风格
setStatusBarModeByMIUI  : 设置状态栏字体图标为深色，需要MIUIV6以上
```

* #### 图像操作相关： BitmapUtils

```
bitmap2Bytes : bitmap转byte[]
bytes2Bitmap : byte[]转bitmap
getBitmap    : 获取Bitmap
save         : 保存图片
```

* #### 尺寸相关：DensityUtils

```
dp2px : dp转px
px2dp : px转dp
sp2px : sp转px
px2sp : px转sp
```

* #### 设备相关：DeviceUtils

```
getSDKVersionName : 获取设备系统版本号
getSDKVersionCode : 获取设备系统版本码
getManufacturer   : 获取设备厂商
getModel          : 获取设备型号
```

* #### 判断双击相关：DoubleClickUtils

```
isDoubleClick : 判断是否双击

//默认时间间隔500ms
isDoubleClick()
//自定义判断双击的时间间隔，单位ms
isDoubleClick(int doubleTime)
```

* #### 加密解密相关：EncryptUtils

```
encryptMD5ToString   : MD5加密（16进制密文字符串）
encryptAES2Base64    : 加密后转为Base64编码
encryptAES2HexString : 加密后转为16进制
decryptBase64AES     : 解密Base64编码密文
decryptHexStringAES  : 解密16进制密文
```

* #### 文件相关：FileUtils

```
getFileByPath      : 根据文件路径获取文件
createOrExistsDir  : 判断目录是否存在，不存在则判断是否创建成功
createOrExistsFile : 判断文件是否存在，不存在则判断是否创建成功
isFileExists       : 判断文件是否存在
getDirLength       : 获取目录大小
getFileLength      : 获取文件大小
copyFile           : 复制文件
copyDir            : 复制目录
deleteDir          : 删除目录
deleteFile         : 删除文件
getPathFromUri     : 根据Uri获取文件路径
getFileFromUri     : 根据Uri获取文件对象
```

* #### 键盘相关：InputMethodUtils

```
showSoftInput      : 动态显示键盘
hideSoftInput      : 动态隐藏键盘
touchHideSoftInput : 触摸空白区域隐藏
```

* #### Intent意图相关：IntentUtils

```
getDialIntent     : 获取跳至拨号界面意图
getCallIntent     : 获取拨打电话意图
getSendSmsIntent  : 获取跳至发送短信界面的意图
getSendMailIntent : 获取跳至发邮件的意图
getCameraIntent   : 获取打开相机拍照的意图
```

* #### 日志相关：JLog

```
setLogSwitch     : 设置log总开关，默认为true
setGlobalTag     : 设置log全局标签
setLogHeadSwitch : 设置log头信息开关
setBorderSwitch  : 设置输出日志是否带边框开关
setStackDeep     : 设置log栈深度，默认为1
v                : tag为全局的Verbose日志
vTag             : 自定义tag的Verbose日志
d                : tag为全局的Debug日志
dTag             : 自定义tag的Debug日志
i                : tag为全局的Info日志
iTag             : 自定义tag的Info日志
w                : tag为全局的Warn日志
wTag             : 自定义tag的Warn日志
e                : tag为全局的Error日志
eTag             : 自定义tag的Error日志
a                : tag为全局的Assert日志
aTag             : 自定义tag的Assert日志
json             : log字符串之json
```

* #### 网络相关：NetworkUtils

```
isConnected     : 判断网络是否连接
isWifiConnected : 判断wifi是否连接状态
getNetworkType  : 获取当前网络类型
getIPAddress    : 获取 IP 地址
```

* #### 手机系统相关：OsUtils

```
isMIUI  : 判断手机系统是否是小米MIUI
isFlyme : 判断手机系统是否是魅族Flyme
```

* #### 手机相关：PhoneUtils

```
getPhoneIMEI        : 获取手机IMEI码
getSimOperatorByMnc : 获取Sim卡运营商名称
getSimOperatorCode  : 获取Sim卡运营商名称code值
```

* #### 屏幕相关：ScreenUtils

```
getScreenWidth  : 获取屏幕的宽度
getScreenHeight : 获取屏幕的高度
isLandscape     : 判断是否是横屏
isPortrait      : 判断是否是竖屏
isTablet        : 判断是否为平板
setFullScreen   : 设置全屏
setLandscape    : 设置为横屏
setPortrait     : 设置为竖屏
```

* #### SD卡相关：SDCardUtils

```
isSDCardEnable      : 判断SD卡是否可用
getCacheDirectory   : 获取应用专属缓存目录，返回File
getCachePath        : 获取应用专属缓存目录，返回String
getStorageDirectory : 获取SD卡的根目录，返回File
getStoragePath      : 获取SD卡的根目录，返回String
```

* #### SharedPreferences相关：SPUtils

```
init       : 获取SPUtils对象
put        : SP中写入数据
putString  : SP中写入String
putInt     : SP中写入int
putLong    : SP中写入long
putFloat   : SP中写入float
putBoolean : SP中写入boolean
get        : SP中读取数据
getString  : SP中读取String
getInt     : SP中读取int
getLong    : SP中读取long
getFloat   : SP中读取float
getBoolean : SP中读取boolean
getAll     : SP中获取所有键值对
contains   : SP中是否存在该key
remove     : SP中移除该key
clear      : SP中清除所有数据
```

* #### 字符串相关：StringUtils

```
isEmpty         : 判断字符串是否为null或长度为0
isTrimEmpty     : 判断字符串是否为null或全为空格（v1.1.1版本已废弃）
isSpace         : 判断字符串是否为null或全为空白字符
isMobileSimple  : 验证手机号（简单）
isMobileExact   : 验证手机号（精确）
isIDCard        : 验证身份证号码（18位）
isEmail         : 验证邮箱
containsChinese : 判断字符串是否包含中文
containsEmoji   : 判断字符串是否包含emoji表情
```

* #### 时间相关：TimeUtils

```
formatDate1  : 获取与当前时间的差
formatDate2  : 日期转换格式：yyyy-MM-dd
formatDate3  : 日期转换格式：yyyy年MM月dd日
formatDate4  : 日期转换格式：yyyy-MM-dd HH:mm:ss
stringToDate : string类型转换为date类型
stringToLong : string类型转换为long类型
dateToLong   : date类型转换为long类型
```

* #### 吐司相关：ToastUtils

```
showShort      : 显示短时吐司
showLong       : 显示长时吐司
setGravity     : 设置显示位置
setMsgColor    : 设置字体颜色
setMsgTextSize : 设置字体大小
setBgColor     : 设置背景颜色
setBgResource  : 设置背景资源
cancel         : 取消吐司显示
```

各个工具类具体使用方法，请阅读[帮助文档](CHM.md)