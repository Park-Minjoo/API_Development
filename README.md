# API_DEVELOPOPMENT

## 1. 품질데이터 관리 운영
###  ○ [이슈.01] 품질 데이터 편성
      - 데이터 활용 > 와인 저장현황 및 대상 항목 업무 검토(진행)
      - 쿼리 템플릿 제작 및 데이터 추출 Job 개발(완료)

## 2. 개발환경 셋팅
###  ○ 스프링 5.0 환경 검토
        - 스프링 5.0 마이그레이션에 따른 영향도 검토
## 3. 기타
###  ○ 제품 품질 데이터 활용 확산을 위한 비즈니스 시나리오 기반 기능 개선 업무 협의
      - 일시: 8월 11일, 09:30 ~ 11:00
      - 참석자 : 리드멘토 이외 품질팀원

## 4. 이슈 발생
<img width="1524" alt="image" src="https://user-images.githubusercontent.com/61863242/176138344-63d9ac7c-84ec-40ea-bced-f09a9035bb7f.png">

### 개발환경 세팅하던 중 발생하던 이슈 해결, 이후 tomcat구동 과정 중 사진과 같은 문제가 발생한 상태. (해결)
#### 콘솔에 나타난 에러 메세지
      Jun 28, 2022 5:56:49 PM org.apache.catalina.startup.VersionLoggerListener log
      INFO: Server version name:   Apache Tomcat/9.0.63
      Jun 28, 2022 5:56:49 PM org.apache.catalina.startup.VersionLoggerListener log
      INFO: Server built:          May 11 2022 07:52:11 UTC
      Jun 28, 2022 5:56:49 PM org.apache.catalina.startup.VersionLoggerListener log
      INFO: Server version number: 9.0.63.0
      Jun 28, 2022 5:56:49 PM org.apache.catalina.startup.VersionLoggerListener log
      INFO: OS Name:               Mac OS X
      Jun 28, 2022 5:56:49 PM org.apache.catalina.startup.VersionLoggerListener log
      INFO: OS Version:            12.4
      Jun 28, 2022 5:56:49 PM org.apache.catalina.startup.VersionLoggerListener log
      INFO: Architecture:          x86_64
      Jun 28, 2022 5:56:49 PM org.apache.catalina.startup.VersionLoggerListener log
      INFO: Java Home:             /Library/Internet Plug-Ins/JavaAppletPlugin.plugin/Contents/Home
      Jun 28, 2022 5:56:49 PM org.apache.catalina.startup.VersionLoggerListener log
      INFO: JVM Version:           1.8.0_333-b02
      Jun 28, 2022 5:56:49 PM org.apache.catalina.startup.VersionLoggerListener log
      INFO: JVM Vendor:            Oracle Corporation
      Jun 28, 2022 5:56:49 PM org.apache.catalina.startup.VersionLoggerListener log
      INFO: CATALINA_BASE:         /Users/parkminjoo/Documents/workspace-sts-3.9.18.RELEASE/.metadata/.plugins/org.eclipse.wst.server.core/tmp0
      Jun 28, 2022 5:56:49 PM org.apache.catalina.startup.VersionLoggerListener log
      INFO: CATALINA_HOME:         /usr/local/Cellar/tomcat@9/9.0.63/libexec
      Jun 28, 2022 5:56:49 PM org.apache.catalina.startup.VersionLoggerListener log
      INFO: Command line argument: -Dcatalina.base=/Users/parkminjoo/Documents/workspace-sts-3.9.18.RELEASE/.metadata/.plugins/org.eclipse.wst.server.core/tmp0
      Jun 28, 2022 5:56:49 PM org.apache.catalina.startup.VersionLoggerListener log
      INFO: Command line argument: -Dcatalina.home=/usr/local/Cellar/tomcat@9/9.0.63/libexec
      Jun 28, 2022 5:56:49 PM org.apache.catalina.startup.VersionLoggerListener log
      INFO: Command line argument: -Dwtp.deploy=/Users/parkminjoo/Documents/workspace-sts-                  3.9.18.RELEASE/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps
      Jun 28, 2022 5:56:49 PM org.apache.catalina.startup.VersionLoggerListener log
      INFO: Command line argument: -Djava.endorsed.dirs=/usr/local/Cellar/tomcat@9/9.0.63/libexec/endorsed
      Jun 28, 2022 5:56:49 PM org.apache.catalina.startup.VersionLoggerListener log
      INFO: Command line argument: -Dfile.encoding=UTF-8
      Jun 28, 2022 5:56:49 PM org.apache.catalina.core.AprLifecycleListener lifecycleEvent
      INFO: The Apache Tomcat Native library which allows using OpenSSL was not found on the java.library.path:   [/Users/parkminjoo/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.]
      Jun 28, 2022 5:56:50 PM org.apache.coyote.AbstractProtocol init
      INFO: Initializing ProtocolHandler ["http-nio-8080"]
      Jun 28, 2022 5:56:50 PM org.apache.catalina.startup.Catalina load
      INFO: Server initialization in [918] milliseconds
      Jun 28, 2022 5:56:50 PM org.apache.catalina.core.StandardService startInternal
      INFO: Starting service [Catalina]
      Jun 28, 2022 5:56:50 PM org.apache.catalina.core.StandardEngine startInternal
      INFO: Starting Servlet engine: [Apache Tomcat/9.0.63]
      Jun 28, 2022 5:56:50 PM org.apache.catalina.core.ContainerBase startInternal
      SEVERE: A child container failed during start
      java.util.concurrent.ExecutionException: org.apache.catalina.LifecycleException: Failed to initialize component   [org.apache.catalina.webresources.JarResourceSet@3d121db3]
	at java.util.concurrent.FutureTask.report(FutureTask.java:122)
	at java.util.concurrent.FutureTask.get(FutureTask.java:192)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:926)
	at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:835)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1396)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1386)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75)
	at java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:134)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:919)
	at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:263)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.StandardService.startInternal(StandardService.java:432)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:927)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.startup.Catalina.start(Catalina.java:772)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.apache.catalina.startup.Bootstrap.start(Bootstrap.java:345)
	at org.apache.catalina.startup.Bootstrap.main(Bootstrap.java:476)
Caused by: org.apache.catalina.LifecycleException: Failed to initialize component [org.apache.catalina.webresources.JarResourceSet@3d121db3]
	at org.apache.catalina.util.LifecycleBase.handleSubClassException(LifecycleBase.java:440)
	at org.apache.catalina.util.LifecycleBase.init(LifecycleBase.java:139)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:173)
	at org.apache.catalina.webresources.StandardRoot.startInternal(StandardRoot.java:737)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.StandardContext.resourcesStart(StandardContext.java:4885)
	at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5023)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1396)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1386)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75)
	at java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:134)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:919)
	... 21 more
Caused by: java.lang.IllegalArgumentException: java.util.zip.ZipException: error in opening zip file
	at org.apache.catalina.webresources.AbstractSingleArchiveResourceSet.initInternal(AbstractSingleArchiveResourceSet.java:143)
	at org.apache.catalina.util.LifecycleBase.init(LifecycleBase.java:136)
	... 33 more
Caused by: java.util.zip.ZipException: error in opening zip file
	at java.util.zip.ZipFile.open(Native Method)
	at java.util.zip.ZipFile.<init>(ZipFile.java:226)
	at java.util.zip.ZipFile.<init>(ZipFile.java:155)
	at java.util.jar.JarFile.<init>(JarFile.java:170)
	at java.util.jar.JarFile.<init>(JarFile.java:134)
	at org.apache.tomcat.util.compat.JreCompat.jarFileNewInstance(JreCompat.java:241)
	at org.apache.tomcat.util.compat.JreCompat.jarFileNewInstance(JreCompat.java:226)
	at org.apache.catalina.webresources.AbstractSingleArchiveResourceSet.initInternal(AbstractSingleArchiveResourceSet.java:140)
	... 34 more

Jun 28, 2022 5:56:50 PM org.apache.catalina.core.ContainerBase startInternal
SEVERE: A child container failed during start
java.util.concurrent.ExecutionException: org.apache.catalina.LifecycleException: A child container failed during start
	at java.util.concurrent.FutureTask.report(FutureTask.java:122)
	at java.util.concurrent.FutureTask.get(FutureTask.java:192)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:926)
	at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:263)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.StandardService.startInternal(StandardService.java:432)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:927)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.startup.Catalina.start(Catalina.java:772)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.apache.catalina.startup.Bootstrap.start(Bootstrap.java:345)
	at org.apache.catalina.startup.Bootstrap.main(Bootstrap.java:476)
Caused by: org.apache.catalina.LifecycleException: A child container failed during start
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:938)
	at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:835)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1396)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1386)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75)
	at java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:134)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:919)
	... 13 more
Caused by: java.util.concurrent.ExecutionException: org.apache.catalina.LifecycleException: Failed to initialize component [org.apache.catalina.webresources.JarResourceSet@3d121db3]
	at java.util.concurrent.FutureTask.report(FutureTask.java:122)
	at java.util.concurrent.FutureTask.get(FutureTask.java:192)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:926)
	... 21 more
Caused by: org.apache.catalina.LifecycleException: Failed to initialize component [org.apache.catalina.webresources.JarResourceSet@3d121db3]
	at org.apache.catalina.util.LifecycleBase.handleSubClassException(LifecycleBase.java:440)
	at org.apache.catalina.util.LifecycleBase.init(LifecycleBase.java:139)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:173)
	at org.apache.catalina.webresources.StandardRoot.startInternal(StandardRoot.java:737)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.StandardContext.resourcesStart(StandardContext.java:4885)
	at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5023)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1396)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1386)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75)
	at java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:134)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:919)
	... 21 more
Caused by: java.lang.IllegalArgumentException: java.util.zip.ZipException: error in opening zip file
	at org.apache.catalina.webresources.AbstractSingleArchiveResourceSet.initInternal(AbstractSingleArchiveResourceSet.java:143)
	at org.apache.catalina.util.LifecycleBase.init(LifecycleBase.java:136)
	... 33 more
Caused by: java.util.zip.ZipException: error in opening zip file
	at java.util.zip.ZipFile.open(Native Method)
	at java.util.zip.ZipFile.<init>(ZipFile.java:226)
	at java.util.zip.ZipFile.<init>(ZipFile.java:155)
	at java.util.jar.JarFile.<init>(JarFile.java:170)
	at java.util.jar.JarFile.<init>(JarFile.java:134)
	at org.apache.tomcat.util.compat.JreCompat.jarFileNewInstance(JreCompat.java:241)
	at org.apache.tomcat.util.compat.JreCompat.jarFileNewInstance(JreCompat.java:226)
	at org.apache.catalina.webresources.AbstractSingleArchiveResourceSet.initInternal(AbstractSingleArchiveResourceSet.java:140)
	... 34 more

Jun 28, 2022 5:56:50 PM org.apache.catalina.startup.Catalina start
SEVERE: The required Server component failed to start so Tomcat is unable to start.
org.apache.catalina.LifecycleException: A child container failed during start
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:938)
	at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:263)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.StandardService.startInternal(StandardService.java:432)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:927)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.startup.Catalina.start(Catalina.java:772)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.apache.catalina.startup.Bootstrap.start(Bootstrap.java:345)
	at org.apache.catalina.startup.Bootstrap.main(Bootstrap.java:476)
      Caused by: java.util.concurrent.ExecutionException: org.apache.catalina.LifecycleException: A child container failed during start
	at java.util.concurrent.FutureTask.report(FutureTask.java:122)
	at java.util.concurrent.FutureTask.get(FutureTask.java:192)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:926)
	... 13 more
      Caused by: org.apache.catalina.LifecycleException: A child container failed during start
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:938)
	at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:835)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1396)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1386)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75)
	at java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:134)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:919)
	... 13 more
      Caused by: java.util.concurrent.ExecutionException: org.apache.catalina.LifecycleException: Failed to initialize component    [org.apache.catalina.webresources.JarResourceSet@3d121db3]
	at java.util.concurrent.FutureTask.report(FutureTask.java:122)
	at java.util.concurrent.FutureTask.get(FutureTask.java:192)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:926)
	... 21 more
      Caused by: org.apache.catalina.LifecycleException: Failed to initialize component [org.apache.catalina.webresources.JarResourceSet@3d121db3]
	at org.apache.catalina.util.LifecycleBase.handleSubClassException(LifecycleBase.java:440)
	at org.apache.catalina.util.LifecycleBase.init(LifecycleBase.java:139)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:173)
	at org.apache.catalina.webresources.StandardRoot.startInternal(StandardRoot.java:737)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.StandardContext.resourcesStart(StandardContext.java:4885)
	at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5023)
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1396)
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1386)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75)
	at java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:134)
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:919)
	... 21 more
            Caused by: java.lang.IllegalArgumentException: java.util.zip.ZipException: error in opening zip file
	      at org.apache.catalina.webresources.AbstractSingleArchiveResourceSet.initInternal(AbstractSingleArchiveResourceSet.java:143)
	      at org.apache.catalina.util.LifecycleBase.init(LifecycleBase.java:136)
	      ... 33 more
       Caused by: java.util.zip.ZipException: error in opening zip file
	      at java.util.zip.ZipFile.open(Native Method)
	      at java.util.zip.ZipFile.<init>(ZipFile.java:226)
	      at java.util.zip.ZipFile.<init>(ZipFile.java:155)
	      at java.util.jar.JarFile.<init>(JarFile.java:170)
	      at java.util.jar.JarFile.<init>(JarFile.java:134)
	      at org.apache.tomcat.util.compat.JreCompat.jarFileNewInstance(JreCompat.java:241)
	      at org.apache.tomcat.util.compat.JreCompat.jarFileNewInstance(JreCompat.java:226)
	      at org.apache.catalina.webresources.AbstractSingleArchiveResourceSet.initInternal(AbstractSingleArchiveResourceSet.java:140)
	      ... 34 more

      Jun 28, 2022 5:56:50 PM org.apache.coyote.AbstractProtocol pause
      INFO: Pausing ProtocolHandler ["http-nio-8080"]
      Jun 28, 2022 5:56:50 PM org.apache.catalina.core.StandardService stopInternal
      INFO: Stopping service [Catalina]
      Jun 28, 2022 5:56:50 PM org.apache.coyote.AbstractProtocol destroy
      INFO: Destroying ProtocolHandler ["http-nio-8080"]

