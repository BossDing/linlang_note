# linlang_note
一个多用户的博客系统——琳琅笔记

## 主要技术

- SpringBoot 1.5.2.RELEASE
- Thymeleaf 3.0.3.RELEASE
- SpringData JPA
- Spring Security
- BootStrap v4.0.0
- ElasticSearch 2.4.4
- MySQL 8.0
- txmark 0.16

## 网站主要功能

1. 用户管理
2. 安全设置
3. 博客管理
4. 评论管理
5. 点赞管理
6. 分类管理
7. 标签管理
8. 首页搜索

## 项目截图
- 主页
- ![image](https://github.com/feederofpu/linlang_note/blob/master/images/%E5%8D%9A%E5%AE%A2%E9%A6%96%E9%A1%B5.png)  
- 主页搜索
- ![image](https://github.com/feederofpu/linlang_note/blob/master/images/%E9%A6%96%E9%A1%B5%E6%90%9C%E7%B4%A2.png)  
- 用户首页
- ![image](https://github.com/feederofpu/linlang_note/blob/master/images/用户首页.png)

## 琳琅笔记的API

- 网站主页
  - /blogs：GET
    - order：排序类型，最新/最热，默认为最新
    - keyword：搜索关键字
    - async：是否异步请求页面
    - pageIndex：页码
    - pageSize：页面消息条数
- 用户主页
  - /u/{username}：GET：获取用户主页
  - /u/{username}/profile：GET：获取用户设置
  - /u/{username}/profile：POST：保存用户设置
  - /u/{username}/avatar：GET：获取用户头像
  - /u/{username}/avatar：POST：保存用户头像
  - /u/{username}/blogs：GET：获取用户博客
    - order：最新/最热，默认最新
    - catalog：博客分类，默认为空
    - keyword：搜索关键字
    - async：是否异步请求
    - pageIndex：页码
    - pageSize：每页消息数量
  - /u/{username}/blogs/edit：POST：新增、编辑博客
  - /u/{username}/blogs/edit/{id}：GET：根据博客id获得编辑博客的界面
  - /u/{username}/blogs/edit/{id}：DELETE：删除指定id的博客
- 登录
  - /login：GET：获取登录页面
  - /login：POST：登录
    - username：用户名
    - password：密码
    - remember-me：记住用户
- 注册
  - /register：GET：获取注册页面
  - /register：POST：注册，成功跳转至登录界面
    - User：待保存的用户对象
- 后台管理
  - /admins：GET：获取后台管理界面
- 用户管理
  - /users：GET：返回用户列表
    - padeIndex：页码
    - pageSize：页面信息条数
    - name：用户名关键字
  - /users/add：GET：获取用户新增页面
  - /users/add：POST：新增用户
    - USER：新增用户对象
    - authorityId：角色ID
  - users/edit/{id}：DELETE：删除指定id的用户
  - users/edit/{id}：GET：获取某个id用户的编辑界面
- 评论管理
  - /comments：GET：获取评论列表
    - blogId：博客id
  - /comments：POST：保存评论
    - blogId：博客id
    - commentContent：评论内容
  - /comments/{id}：DELETE：删除评论
    - id：评论内容id
    - blogId：博客id
- 点赞管理
  - /votes：POST：保存点赞
    - blogId：博客id
  - /votes/{id}：DELETE：取消点赞
    - id：点赞id
    - blogId：博客id
- 分类管理
  - /catalogs：GET：获取用户分类列表
    - username：用户名
  - /catalogs：POST：保存分类
    - catalogVO：含username、catalog
  - /catalogs/edit：GET：获取编辑分类的界面
  - /catalogs/edit/{id}：GET：获取某ID分类的编辑界面
  - /catalogs/{id}：DELETE：删除分类
    - id：分类id
    - username：用户名

## 如何运行

1. 使用git或者下载项目zip文件并解压
2. 开启ElasticSearch2.x版本
3. 运行项目，访问lcalhost:8080，使用管理员账户（账号：admin，密码：123456）| 普通用户账户（账号：hsiaolung，密码：123456）可以登录
