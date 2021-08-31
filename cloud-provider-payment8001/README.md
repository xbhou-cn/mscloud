# 热部署
1. 在需要热部署的项目的pom.xml中引入
~~~xml
<!--热部署-->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <scope>runtime</scope>
    <optional>true</optional>
</dependency>
~~~
2. 在总父工程的pom.xml文件中引入
~~~xml
<!--开启热部署的配置-->
<build>
    <finalName>mscloud</finalName>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
            <configuration>
                <fork>true</fork>
                <addResources>true</addResources>
            </configuration>
        </plugin>
    </plugins>
</build>
~~~
3. idea开启自动编译
img.png![img](https://user-images.githubusercontent.com/47892921/131517713-db815f11-49d1-4909-b8b5-4fc35381db69.png)
4. `ctrl+shift+Alt+/`然后选择`Registry`
img_1.png![img_1](https://user-images.githubusercontent.com/47892921/131517781-af57becd-7045-434a-980b-2d3e35cebca9.png)


