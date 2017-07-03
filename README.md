# java9
java9 demo test

## src 配置编译方式

- javac -d mods  src\module-info.java src\org\yqj\demo\Welcome.java
- javac -d mods --module-version 1.0 src\module-info.java src\org\yqj\demo\Welcome.java

## 打包方式

- jar --create --file lib/com.jdojo.intro-1.0.jar --main-class org.yqj.demo.Welcome --module-version 1.0 -C mods .
- java --module-path lib --list-modules org.yqj.demo 

## java 执行方式

java --module-path lib --module org.yqj.demo