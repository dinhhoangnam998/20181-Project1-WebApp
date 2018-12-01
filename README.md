--WebApp use Spring MVC--
--WebApp use Spring MVC--

Hướng dẫn cài đặt:
- Download STS:
https://spring.io/tools3/sts/legacy

- Download Tomcat: 
https://tomcat.apache.org/download-90.cgi
 + Thêm Tomcat vào STS bằng cách: 
  * thanh menu, chọn Window -> Show View -> Other -> gõ Server
  * sau khi đã có tab Server, nhấn chuột phải, chọn add server, chọn thư mục Tomcat đã tải.

- Download Mysql:
https://dev.mysql.com/downloads/installer/
 + Đăng nhập với quyền root và:
 
 + Tạo tài khoản: user: "username", password: "password" bằng câu lệnh:
  create user "username" identified by "password";
  grant all on *.* to username;
 
 + Tạo database rỗng với tên: "project1webappdb" bằng lệnh: 
  create database project1webappdb;
 

- Download source code:
https://github.com/dinhhoangnam998/Project1-WebApp-LazaNam

- Chạy project:
 + Chạy STS
 + Chọn File -> Import -> Existing Maven Projects -> chọn thư mục source code đã tải về, chờ một chút...
 + nhấn chuột phải vào project, chọn Properties -> chọn Deployment Assembly -> Add -> Java Build Path Entries -> double click Maven Dependency 
 + nhấp chọn project, nhấn Alt+F5 để update project
 + nhấp chuột phải vào project, chọn run as -> run on server -> chọn Tomcat 
-> done!



