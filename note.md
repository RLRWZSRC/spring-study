##使用Java9

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.encoding>UTF-8</maven.compiler.encoding>
        <java.version>9</java.version>
        <maven.compiler.source>9</maven.compiler.source>
        <maven.compiler.target>9</maven.compiler.target>
    </properties>

##常用依赖

    <!-- https://mvnrepository.com/artifact/org.springframework/spring-web -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-webmvc</artifactId>
        <version>5.3.13</version>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.18.20</version>
        <scope>compile</scope>
    </dependency>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.12</version>
        <scope>test</scope>
    </dependency>


##注解使用

开启注解的支持
 
    <context:annotation-config />
  
指定扫描注解的包

    <context:component-scan base-package="com.wjh.demo1"/> 
    


###@Autowired :
#####public interface Autowired extends annotation.Annotation
自动装配，优先匹配ByType如果没有使用ByName。
如果多个相同类型(class)且名字（id）不同的bean,则可以使用
@Qualifier(value = "****")

@Nullable:字段标记可以为null

@Resource:自动装配，在Java9已经移除

也可通过MAVEN导入

    <dependency>
         <groupId>javax.annotation</groupId>
         <artifactId>javax.annotation-api</artifactId>
         <version>1.3.2</version>
    </dependency>

@Component:放在类上，说明这个类被Spring管理了，就是bean。

###Component衍生注解三层架构分层

  #####dao使用@Repository
  
  #####service使用@Service
  
  #####Controller使用@Controller
  
  四个功能相同，都是将某个类注册到Spring中并装配Bean
  
###@Value() 
####import org.springframework.beans.factory.annotation.Value;
注入属性值，可以在Set方法上进行注释

###@scope("****")
####import org.springframework.context.annotation.Scope;
注解类的作用域

1.singleton

2.prototype

