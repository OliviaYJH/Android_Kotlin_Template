# Android_Kotlin_Template

finder에서 .gitignore 파일 있는지 확인하고 그렇지 않으면 Android_Kotlin_Template 디렉토리에서 shift + command + . 눌러서 .gitignore 파일 복붕하기


1. xml 폴더에 network_security_config.xml 파일 복붙
2. config, src, util 폴더 생성
3. build.gradle 파일에 viewBinding과 implementation 추가하고 sync하기
4. layout 폴더에 dialog_loading.xml 파일 복붙
5. util 폴더에 LoadingDialog 봍북하고, config 폴더에 ApplicationClass, BaseActivity, BaseFragment, BaseResponse, XAccessTokenInterceptor 파일 복붙
6. setting.gradle 파일의 repositories{}의 mavenCentral() 밑에 maven { url 'https://jitpack.io' } 추가하고 sync
7. res폴더의 values 폴더에 styles.xml 파일 복붙
8. colors.xml 파일에 내용을 복붙
9. string.xml 파일에 내용을 복붙
10. values 폴더에 dimens.xml 파일 복붙
11. MainActivity 파일을 src 폴더 내로 이동
12. src 폴더에 main과 splash 폴더 생성
13. splash 폴더 내에 SpalshActivity Empty Activity로 직접 생성하고 내용 작성하기
  - BaseActivity<ActivitySplashBinding>(ActivitySplashBinding::inflate)
  - Handler(Looper.~~)
14. activity_splash.xml 파일 내용 수정
15. main 폴더 내에 home과 myPage 폴더 생성 및 각자 fragment 생성하고 내용 수정
16. res 폴더에 menu directory 생성 및 menu_main_bottom_nav.xml 파일 복붙
17. drawable 폴더에 main_btm_nav_item_color.xml 파일 복붙
18. activity_main.xml 파일 내용 복붙
19. MainActivity 코드 수정
20. manifests 파일 수정
### == 우선 commit ==
21. retrofit으로 통신
  - models로 request와 response 틀 만들기
  - RetrofitInterface 생성하기
  - View 생성하기
  - Service 생성하기
  - Fragment나 Activity에 View 상속하고 implements하기
  - showLoadingDialog와 dismissLoadingDialog로 코드 짜기
