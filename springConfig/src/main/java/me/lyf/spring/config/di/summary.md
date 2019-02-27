# 依赖注入    
在spring环境下，控制反转（IOC）和依赖注入（DI）是等同的概念，控制反转通过依赖注入来实现。依赖注入的主要目的是解耦，体现一种“组合”的思想。
springIOC容器（ApplicationContext）负责创建bean。   
关于配置，Spring4.x起，官方推荐java配置，可以完全替代xml配置。    
## Bean的声明与注入    
> 声明：
- @Component组件，没有明确的角色
- @Service在业务逻辑层（Service层使用）
- @Controller在展示层（接口）使用
- @Repository在数据访问层（dao层）使用    
> 注入：  
- @Autowired：Spring提供的注解
- @Inject：JSR-330提供的注解
- @Resource： JSR-250提供的注解    
以上三种注解都可注解在set方法或者属性上，通常注解在属性上