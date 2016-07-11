# soundsystem
第二章样例

###自动扫描组件　
<pre>
    @Component
    @Component("指定BeanID")
    @ComponentScan("com.weib.soundsystem") //指定包名
    @ComponentScan(basePackages={"com.weib.soundsystem"}) //指定多个包名
    @ComponentScan(basePackageClasses={SgtPeppers.class, CDPlayer.class})   //指定组件类　
</pre>
###自动装配   
<pre>
    @Autowired 或@Inject 可用于构造函数或Setter方法，Spring自动装配时会使用该方法装配
</pre>
####1 当有且只有一个组件符合要求的话，Bean会被装配进来
####2 当没有组件符合要求时，可以设置@Autowired(required=false) Bean有可能会处于未装配状态，注意空指针
####3 当有多个Bean满足的话，会有异常 第三章解决歧义性

###通过ID获取Bean
