# Android_Kotlin_Template


1. xml 폴더에 network_security_config.xml 파일 생성
2. config, src, util 폴더 생성
3. build.gradle 파일에 viewBinding과 implementation 추가
4. layout 폴더에 dialog_loading.xml 파일 생성
5. util 폴더에 LoadingDialog 봍북하고, config 폴더에 ApplicationClass, BaseActivity, BaseFragment, BaseResponse, XAccessTokenInterceptor 파일 생성
6. setting.gradle 파일의 repositories{}의 mavenCentral() 밑에 maven { url 'https://jitpack.io' } 추가
7. styles.xml 생성
8. colors.xml 생성
9. string.xml 생성
10. dimens.xml 파일 생성
11. src 폴더에 main과 splash 폴더 생성
12. splash 폴더 내에 SpalshActivity 생성
  - BaseActivity<ActivitySplashBinding>(ActivitySplashBinding::inflate)
  - Handler(Looper.~~)
14. activity_splash.xml 파일 내용 수정
15. main 폴더 내에 home과 myPage 폴더 생성 및 각자 fragment 생성하고 내용 수정
16. res 폴더에 menu directory 생성 및 menu_main_bottom_nav.xml 파일 복붙
17. main_btm_nav_item_color.xml 파일 생성
18. activity_main.xml 파일 내용 수정
19. MainActivity 코드 수정
20. manifests 파일 수정
### == 우선 commit ==

### [retrofit으로 통신]
  - models로 request와 response 틀 만들기
  - RetrofitInterface 생성하기
  - View 생성하기
  - Service 생성하기
  - Fragment나 Activity에 View 상속하고 implements하기
  - showLoadingDialog와 dismissLoadingDialog로 코드 짜기
  
### [sharedPrerence]
- editor.putString(X_ACCESS_TOKEN, ~)으로 추가
- editor.commit() 으로 저장

### [RecyclerView]
1. item_test_recycler.xml 생성
2. 화면 layout에 recyclerview.widget 생성하기 -> tools:listitem에 부여 및 layoutManager 지정
3. recycler 폴더에 data class생성
4. recycler 폴더에 Adapter 생성
5. 해당 Activity나 Fragment에서 구현
