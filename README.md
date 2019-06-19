# SSM
simple ssm


一，项目的简介
   该项目以Java为编程语言，以SSM为主要框架，结合自身编程经验和从其他地方继承而来的Java开发知识，以学习和实践以及检验和提升为目的，编写一个简单的 网上购物系统，该系统的功能还不完全，订单方面：缺少结算功能。
二，项目功能介绍
   该项目使用Maven进行分模块开发，整个项目通过(SSM-Parent，pom-project)进行maven的依赖管理，  项目从整体上分为前台和后台，为了系统测试的的方便性，我先写的系统后台，在这里我先从系统后台开始介绍。
   
   该项目的后台模块(SSM-Manager pom-project ) 它包含四个子模块：SSM-Manager-pojo(包含JavaBean)，SSM-Manager-mapper（包含mapper接口，mapper映射文件），SSM-Manager-service(包含业务逻辑接口及其实现类)，SSM-Manager-web（包含各种控制器，视图文件）。整个后台以SSM整合 以RESTful风格实现CRUD。
   
   前台对一个项目来说开发更加复杂，因此，为了简化开发，提高开发效率要进行更细化的进行模块划分。我在该项目中根据前台要提供的大功能对前台进行模块划分
   
   
