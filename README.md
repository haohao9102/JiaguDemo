# _jiagu
[AS--›Gradle 360加固和Walle渠道打包](https://www.jianshu.com/p/445b2ac8dd92)

# 使用方式

使用百度下载:

https://pan.baidu.com/s/1EtKLhFXyyD_iHUiuGIUBIA  提取码: mxph 

![](https://github.com/haohao9102/JiaguDemo/blob/master/screenshot/buildPackage%E7%9B%AE%E5%BD%95.png)

下载只有的`buildPackage`文件夹, 尽量放在`工程的根目录`.

## 单独下载脚本文件

[下载](https://github.com/haohao9102/JiaguDemo/blob/master/buildPackage/build.gradle)


## 引入
在`APP Module`中, 加入
```java
apply from: rootProject.projectDir.absolutePath + '/buildPackage/build.gradle'
```
![](https://github.com/haohao9102/JiaguDemo/blob/master/screenshot/apply.png)

> 请关注图中, 第一行即可.

## 执行加固
同步(sync)项目之后, 

![](https://github.com/haohao9102/JiaguDemo/blob/master/screenshot/_jiagu.png)

`Tasks`任务列表, 会多出`_jiagu` , 双击即可.

或者使用命令行 `gradlew _jiagu` 即可.

# 执行前须知:

**1:配置360的账号和密码**

**2:指定需要加固的文件路径**

>如果不指定加固文件路径,你至少需要使用`release`的方式打包过一次.脚本才能自己识别到文件路径.

![](https://github.com/haohao9102/JiaguDemo/blob/master/screenshot/client.png)

# 输出路径
请注意控制台的输出.

# 特别提醒

## 1.

如果在加固过程中出现 `签名配置中没有匹配的签名`

请使用命令行的方式单独导入签名信息.

```
java -jar jiagu.jar -importsign<keystore_path><keystore_password><alias><alias_password>
```
请将 命令行`cd 到 _jiagu/jiagu/` 目录下, 否则会提示`jiagu.jar`找不到.

执行一次之后, 以后就不会出现了.

这有可能是360加固的BUG.

[命令行使用参考官方文档](http://jiagu.360.cn/#/global/help/164)


##2.
这个项目采用的是组件化开发模式，如conponent_1就是一个组件，可单独编译打包。
组件化采用的是框架是[CC框架](https://github.com/luckybilly/CC),有兴趣的童靴欢迎star一波

