## 使用说明

1.将buildPackage放在工程目录下

2.在主工程gradle中引用该文件夹的gradle脚本
    
    apply from: rootProject.projectDir.absolutePath + '/buildPackage/build.gradle'
    
3.配置参数位置在脚本中
    
4.直接运行gotoProduct自动打包task

    gotoProduct

## 注意可能需要改动的环境配置：
1.需要设置release包的输入路径和文件名称

    def inputPath = "release包所在路径"
    def inputApkName = "release包文件名称"

2.360加固宝的账号和密码

    def userName = 'xhgopen@psrecycle.cn'
    def password = 'psrecycle888'

3.签名文件路径和密码参数

    def keystorePath = '../app/keystores/android.keystore'
    def keystorePwd = 'psrecycle123'
    def keystoreAlias = 'psrecycle'
    def keystoreAliasPwd = 'psrecycle123'

4.修改walle打包时需要导出的渠道列表

    /buildPackage/walle/channel.txt

5.将渠道包打成zip压缩包的文件名

    def zipFileName = "小数定位_${version}_渠道包_${date}.zip"