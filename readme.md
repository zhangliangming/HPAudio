# 简介 #
该开源依赖库是乐乐音乐播放器里的一个音频模块功能，主要是解析wav、mp3、ape、ogg和flac歌曲信息，如：声道数、采样率、时间等信息，其项目地址如下：[乐乐音乐播放器](https://github.com/zhangliangming/HappyPlayer5.git)。

## v1.7 ##
- 2018-05-05
- 代码混淆
- jar代码不混淆
- 修复混淆的问题
- 添加ogg格式支持
- 修改wav格式解析，使用jaudiotagger-2.0.4.jar来解析


## v1.0 ##


- 2018-04-30
- 初始导入

# Gradle #
1.root build.gradle

	`allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}`
	
2.app build.gradle

`dependencies {
	         compile 'com.github.zhangliangming:HPAudio:v1.7'
	}`

# 调用Demo #

链接: [https://pan.baidu.com/s/15SixU_nviX1ppK74gxL3dg](https://pan.baidu.com/s/15SixU_nviX1ppK74gxL3dg)  密码: u8hw

# 调用用法 #

![](https://i.imgur.com/qD7bhT4.png)


# 参考 #

[musique的Java audio player](https://github.com/tulskiy/musique)

[Android音频开发](https://github.com/Jhuster/AudioDemo)

[WAVE PCM soundfile format](http://soundfile.sapp.org/doc/WaveFormat/)

[各种WAV文件头格式](http://www.xuebuyuan.com/840670.html)


# 捐赠 #
如果该项目对您有所帮助，欢迎您的赞赏

- 微信

![](https://i.imgur.com/e3hERHh.png)

- 支付宝

![](https://i.imgur.com/29AcEPA.png)